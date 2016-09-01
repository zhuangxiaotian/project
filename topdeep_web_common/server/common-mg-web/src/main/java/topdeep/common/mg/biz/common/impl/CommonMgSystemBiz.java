package topdeep.common.mg.biz.common.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import topdeep.common.biz.common.TopdeepConfigManage;
import topdeep.common.biz.common.impl.CommonSystemBiz;
import topdeep.common.entity.BizException;
import topdeep.common.entity.base.PageImpl;
import topdeep.common.entity.constant.EnumType.MsgChannelType;
import topdeep.common.entity.constant.EnumType.MsgInfoType;
import topdeep.common.entity.constant.EnumType.MsgSendState;
import topdeep.common.entity.constant.EnumType.TargetSystemType;
import topdeep.common.entity.constant.EnumType.UserIdType;
import topdeep.common.entity.constant.EnumType.ValidState;
import topdeep.common.entity.constant.EnumType.ValidType;
import topdeep.common.entity.db.SystemAdmin;
import topdeep.common.entity.db.SystemAdminExample;
import topdeep.common.entity.db.SystemAdminRoles;
import topdeep.common.entity.db.SystemAdminRolesExample;
import topdeep.common.entity.db.SystemMsgSend;
import topdeep.common.entity.db.SystemMsgSendExample;
import topdeep.common.entity.db.SystemPrivilege;
import topdeep.common.entity.db.SystemPrivilegeExample;
import topdeep.common.entity.db.SystemPrivilegeExample.Criteria;
import topdeep.common.entity.db.SystemRoles;
import topdeep.common.entity.db.SystemValidInfo;
import topdeep.common.entity.db.SystemValidInfoExample;
import topdeep.common.mg.biz.CommonSendEmailBiz;
import topdeep.common.mg.biz.common.CommonMgSystemParamBiz;
import topdeep.common.mg.entity.PrivilegeConfig;
import topdeep.common.mg.entity.params.CommonMgApplicationParam;
import topdeep.common.mg.entity.view.PrivilegeGroup;
import topdeep.common.mg.entity.view.PrivilegeInfo;
import topdeep.common.mg.entity.view.PrivilegeOperateInfo;
import topdeep.common.mg.util.ReadHtmlFile;
import topdeep.common.util.UUIDGenerator;

import common.cache2.CacheException;
import common.dbvisit.DbException;
import common.privilege.PrivilegeAttribute;
import common.privilege.PrivilegeOperate;
import common.util.MD5;
import common.util.StringUtils;

@Service("commonMgSystemBiz")
public class CommonMgSystemBiz extends CommonSystemBiz implements InitializingBean, topdeep.common.mg.biz.common.CommonMgSystemBiz {

	private List<PrivilegeGroup> privilegeGroupList = new ArrayList<PrivilegeGroup>();

	@Autowired
	@Qualifier("commonMgSystemParamBiz")
	protected CommonMgSystemParamBiz commonMgSystemParamBiz;

	@Autowired
	@Qualifier("commonSendEmailBiz")
	protected CommonSendEmailBiz sendEmail;

	@Autowired
	protected TopdeepConfigManage topdeepConfigManage;

	/*
	 * (non-Javadoc)
	 * 
	 * @see topdeep.common.mg.biz.common.impl.ICommonMgSystemBiz#existsSystemAdmin()
	 */
	public boolean existsSystemAdmin() throws CacheException {
		SystemAdminExample condition = new SystemAdminExample();
		condition.or().andParentAdminIdEqualTo(UUIDGenerator.PARENT_ID);
		condition.setPage(new PageImpl(0, 1));
		List<SystemAdmin> adminList = systemAdminSelectObjects(condition);
		return adminList.size() > 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see topdeep.common.mg.biz.common.impl.ICommonMgSystemBiz#loginCheck(java.lang.String)
	 */
	public SystemAdmin loginCheck(String loginName) throws CacheException {
		SystemAdminExample condition = new SystemAdminExample();
		condition.or().andLoginNameEqualTo(loginName);
		return selectSingleObject(systemAdminSelectObjects(condition));
	}

	public void init() {
		try {
			List<Class<?>> privilegeConfigTypeList = new ArrayList<Class<?>>();
			String typeConfig = commonMgSystemParamBiz.getCommonMgApplicationParam().getPrivilegeConfigList();
			String[] typeAry = typeConfig.split(",");
			for (String item : typeAry) {
				if (!StringUtils.isNullOrEmpty(item)) {
					Class<?> type = Class.forName(item);
					if (type != null) {
						privilegeConfigTypeList.add(type);
					}
				}
			}
			// Class<?> type = PrivilegeConfig.class;
			// Field[] fields = type.getDeclaredFields();
			//
			// List<SystemPrivilege> dbPrivilegeList = systemPrivilegeSelectObjects(new SystemPrivilegeExample());
			// Map<Integer, SystemPrivilege> dbPrivilegeMap = new HashMap<Integer, SystemPrivilege>();
			// for (SystemPrivilege item : dbPrivilegeList) {
			// if (!dbPrivilegeMap.containsKey(item.getFuncPrivilege())) {
			// dbPrivilegeMap.put(item.getFuncPrivilege(), item);
			// }
			// }

			Hashtable<String, PrivilegeGroup> groupMap = new Hashtable<String, PrivilegeGroup>();
			privilegeGroupList.clear();
			for (Class<?> type : privilegeConfigTypeList) {
				logger.debug("init privilege for: " + type.getName());
				Field[] fields = type.getDeclaredFields();
				for (Field item : fields) {
					PrivilegeAttribute attr = item.getAnnotation(PrivilegeAttribute.class);
					if (attr != null) {
						int func = item.getInt(null);
						// if (!dbPrivilegeMap.containsKey(func)) {
						// continue;
						// }
						if (!topdeepConfigManage.hasPrivilege(func)) {
							continue;
						}

						PrivilegeGroup pg = null;
						if (groupMap.containsKey(attr.GroupName())) {
							pg = groupMap.get(attr.GroupName());
						} else {
							pg = new PrivilegeGroup();
							pg.setGroupName(attr.GroupName());
							groupMap.put(attr.GroupName(), pg);
							privilegeGroupList.add(pg);
						}
						PrivilegeInfo pinfo = new PrivilegeInfo();
						pinfo.setPrivilegeName(attr.Name());
						pinfo.getOperateList().addAll(getOperateList(func, attr));
						pg.getPrivilegeList().add(pinfo);
					}
				}

			}

		} catch (Exception ex) {
			logger.error("初始化系统权限列表失败", ex);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see topdeep.common.mg.biz.common.impl.ICommonMgSystemBiz#queryPrivilegeGroupList(java.lang.String)
	 */
	public List<PrivilegeGroup> queryPrivilegeGroupList(String currentPrivileges) throws Exception {
		return getPrivilegeGroupList(currentPrivileges);
	}

	public List<PrivilegeGroup> getPrivilegeGroupList(String currentPrivileges) throws Exception {

		if (StringUtils.isNullOrEmpty(currentPrivileges)) {
			return privilegeGroupList;
		}
		String[] values = currentPrivileges.split(",");
		Map<Integer, Integer> currentFuncMap = new Hashtable<Integer, Integer>();
		for (String item : values) {
			int value = Integer.parseInt(item);
			int func = value >> 8;
			int operateValue = value & 0xff;
			if (currentFuncMap.containsKey(func)) {
				operateValue = operateValue & currentFuncMap.get(func);
				currentFuncMap.remove(func);
			}
			currentFuncMap.put(func, operateValue);
		}
		// ok
		List<PrivilegeGroup> groupList = new ArrayList<PrivilegeGroup>();
		for (PrivilegeGroup item : privilegeGroupList) {
			PrivilegeGroup newGroup = new PrivilegeGroup();
			newGroup.setGroupName(item.getGroupName());
			groupList.add(newGroup);
			for (PrivilegeInfo item1 : item.getPrivilegeList()) {
				PrivilegeInfo newInfo = new PrivilegeInfo();
				newInfo.setPrivilegeName(item1.getPrivilegeName());
				for (PrivilegeOperateInfo item2 : item1.getOperateList()) {
					PrivilegeOperateInfo newOperateInfo = new PrivilegeOperateInfo();
					newOperateInfo.setOperateEnabled(item2.isOperateEnabled());
					newOperateInfo.setOperateName(item2.getOperateName());
					newOperateInfo.setOperateValue(item2.getOperateValue());
					int func = item2.getOperateValue() >> 8;
					int value = item2.getOperateValue() & 0xff;
					if (currentFuncMap.containsKey(func)) {
						Integer operateValue = currentFuncMap.get(func);
						newOperateInfo.setHasPrivilege((operateValue & value) != 0);
					}
					newInfo.getOperateList().add(newOperateInfo);
				}
				newGroup.getPrivilegeList().add(newInfo);
			}
		}
		return groupList;
	}

	private List<PrivilegeOperateInfo> getOperateList(int func, PrivilegeAttribute attr) {
		List<PrivilegeOperateInfo> list = new ArrayList<PrivilegeOperateInfo>();
		int operate = attr.Operate();
		list.add(new PrivilegeOperateInfo((func << 8) + PrivilegeOperate.Read, "读取", (PrivilegeOperate.Read & operate) != 0, false));
		list.add(new PrivilegeOperateInfo((func << 8) + PrivilegeOperate.Write, "修改", (PrivilegeOperate.Write & operate) != 0, false));
		list.add(new PrivilegeOperateInfo((func << 8) + PrivilegeOperate.Delete, "删除", (PrivilegeOperate.Delete & operate) != 0, false));
		list.add(new PrivilegeOperateInfo((func << 8) + PrivilegeOperate.Execute, "执行", (PrivilegeOperate.Execute & operate) != 0, false));
		list.add(new PrivilegeOperateInfo((func << 8) + PrivilegeOperate.Audit, "审核", (PrivilegeOperate.Audit & operate) != 0, false));
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see topdeep.common.mg.biz.common.impl.ICommonMgSystemBiz#dealUploadPrivileges(java.lang.String)
	 */
	public String dealUploadPrivileges(String userSelectPrivileges) {
		if (StringUtils.isNullOrEmpty(userSelectPrivileges)) {
			return "";
		}
		Map<Integer, Integer> funcMap = new Hashtable<Integer, Integer>();
		String[] values = userSelectPrivileges.split(",");
		for (String item : values) {
			if (StringUtils.isNullOrEmpty(item)) {
				continue;
			}
			int value = Integer.parseInt(item);
			int func = value >> 8;
			int operateValue = value & 0xff;
			if (funcMap.containsKey(func)) {
				int oldValue = funcMap.get(func);
				operateValue = operateValue | oldValue;
				funcMap.remove(func);
			}
			funcMap.put(func, operateValue);
		}
		// 此时Map中是整理过的权限值，输出即可
		String ret = "";
		for (Integer func : funcMap.keySet()) {
			int operateValue = funcMap.get(func);
			int value = (func << 8) + operateValue;
			if (!StringUtils.isNullOrEmpty(ret)) {
				ret += ",";
			}
			ret += value;
		}
		return ret;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see topdeep.common.mg.biz.common.impl.ICommonMgSystemBiz#privilegeAdd(java.lang.String, java.util.Map)
	 */
	public void privilegeAdd(String APrivilegeValue, Map<Integer, Integer> privilegeList) {
		if (APrivilegeValue == null)
			return;
		String[] prilist = APrivilegeValue.split(",");
		for (int i = 0; i < prilist.length; i++) {
			String pristrvalue = prilist[i].trim();
			if (pristrvalue.equals(""))
				continue;
			int priValue = Integer.parseInt(pristrvalue.trim());
			int func = priValue >> 8;
			int oper = priValue & 0xff;
			if (privilegeList.containsKey(new Integer(func))) {
				int value = ((Integer) privilegeList.get(new Integer(func))).intValue();
				value = value | oper;// 进行与或操作,判断权限值是否相同
				privilegeList.remove(new Integer(func));
				privilegeList.put(new Integer(func), new Integer(value));
			} else {
				privilegeList.put(new Integer(func), new Integer(oper));
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see topdeep.common.mg.biz.common.impl.ICommonMgSystemBiz#hasPrivilege(java.util.Map, int, int)
	 */
	public boolean hasPrivilege(Map<Integer, Integer> privileges, int func, int operate) {
		if (func <= 0) {
			return true;
		}
		if (!privileges.containsKey(func)) {
			return false;
		}
		if ((privileges.get(func) & operate) != 0) {
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see topdeep.common.mg.biz.common.impl.ICommonMgSystemBiz#buildLoginPassword(java.lang.String, java.lang.String)
	 */
	public String buildLoginPassword(String inputPassword, String passwordSalt) throws UnsupportedEncodingException {
		return new MD5(passwordSalt + inputPassword, "utf-8").getMd5String();
	}

	public void afterPropertiesSet() throws Exception {
		init();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see topdeep.common.mg.biz.common.impl.ICommonMgSystemBiz#userSignin(topdeep.common.entity.db.SystemAdmin)
	 */
	@Transactional
	public void userSignin(SystemAdmin newOper) throws Exception {
		SystemAdmin operator = newOper;
		SystemAdminRoles systemAdminRoles = new SystemAdminRoles();
		SystemAdminExample condition = new SystemAdminExample();
		condition.or().andLoginNameEqualTo(operator.getLoginName());
		int operCount = systemAdminQuerySelectObjectsCount(condition);
		if (operCount > 0) {
			throw new Exception("该登录名已经被注册");
		}
		condition.clear();
		condition.or().andMobileTelephoneEqualTo(operator.getMobileTelephone());
		operCount = systemAdminQuerySelectObjectsCount(condition);
		if (operCount > 0) {
			throw new Exception("该手机已经被使用");
		}
		condition.clear();
		condition.or().andLoginEmailEqualTo(operator.getLoginEmail());
		operCount = systemAdminQuerySelectObjectsCount(condition);
		if (operCount > 0) {
			throw new Exception("该邮箱已经被使用");
		}
		systemAdminRoles.setRowVersion(0);
		systemAdminRoles.setAdminId(operator.getId());
		systemAdminInsert(operator);

		// 建立该管理员下的默认角色
		List<PrivilegeGroup> groupList = queryPrivilegeGroupList("");
		for (PrivilegeGroup item : groupList) {
			SystemRoles roles = new SystemRoles();
			roles.setSuperAdminId(operator.getId());
			roles.setId(UUIDGenerator.getUUID24());
			roles.setMemo("默认的" + item.getGroupName() + "管理员");
			roles.setName(item.getGroupName() + "管理员");
			roles.setRowVersion(0);
			roles.setCreateTime(new Date());
			roles.setModifyTime(new Date());
			roles.setState("1");
			String rolePrivilegeValue = "";
			for (PrivilegeInfo item1 : item.getPrivilegeList()) {
				for (PrivilegeOperateInfo item2 : item1.getOperateList()) {
					if (item2.isOperateEnabled()) {
						if (!StringUtils.isNullOrEmpty(rolePrivilegeValue)) {
							rolePrivilegeValue += ",";
						}
						rolePrivilegeValue += item2.getOperateValue();
					}
				}
			}
			rolePrivilegeValue = dealUploadPrivileges(rolePrivilegeValue);
			roles.setRolePrivileges(rolePrivilegeValue);
			systemRolesInsert(roles);
			systemAdminRoles.setId(UUIDGenerator.getUUID24());
			systemAdminRoles.setRolesId(roles.getId());
			systemAdminRolesInsert(systemAdminRoles);
		}

		if (newOper.getState().equals("0")) {
			// 管理员默认未激活，需要邮箱激活
			String randomStr = UUIDGenerator.getUUID24();
			SystemMsgSend msgSend = new SystemMsgSend(UUIDGenerator.getUUID24(), "1", "1", "0", operator.getId(), 3, operator.getLoginEmail(), randomStr,
					new Date(), null, 0, "1", 0);
			systemMsgSendInsert(msgSend);
			SystemValidInfo info = new SystemValidInfo();
			info.setId(UUIDGenerator.getUUID24());
			info.setRandomValue(randomStr);
			info.setRowVersion(0);
			info.setTargetSystem(TargetSystemType.Default.getValue());
			info.setValidState("0");
			Date validTime = new Date(new Date().getTime() + commonMgSystemParamBiz.getApplicationParam().getValidTime());
			info.setValidTime(validTime);
			info.setValidType(ValidType.SystemAdminEmail.getValue());
			info.setValidUserIdType(UserIdType.SystemId.getValue());
			info.setValidUserIdNo(operator.getId());
			systemValidInfoInsert(info);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see topdeep.common.mg.biz.common.impl.ICommonMgSystemBiz#sendEmailTask()
	 */
	public void sendEmailTask() throws CacheException {
		List<SystemMsgSend> list = new ArrayList<SystemMsgSend>();
		SystemMsgSendExample condition = new SystemMsgSendExample();
		condition.or().andChannelTypeEqualTo("1").andSendStateIn(new ArrayList<String>(Arrays.asList("1", "3")));
		condition.setPage(new PageImpl(0, 60));
		list = this.systemMsgSendSelectObjects(condition);
		if (list.size() > 0) {
			InputStream is = getClass().getClassLoader().getResourceAsStream(commonMgSystemParamBiz.getCommonMgApplicationParam().getEmailTemplatePath());

			String content = ReadHtmlFile.readFile(is);
			try {
				is.close();
			} catch (IOException e1) {
				logger.error("sendEmailTask error: " + e1.getMessage(), e1);
			}
			String userActivityUrl = commonMgSystemParamBiz.getCommonMgApplicationParam().getUserActivityUrl();
			String emailAddress = commonMgSystemParamBiz.getCommonMgApplicationParam().getSmtpAccount();
			String emailPwd = commonMgSystemParamBiz.getCommonMgApplicationParam().getSmtpPassword();
			for (SystemMsgSend msg : list) {
				if (msg.getInfoType().equals("0")) {
					String href = userActivityUrl + msg.getContent();
					content = content.replace("emailContent", "<title>邮箱注册认证</title></head><body><h1>欢迎注册</h1><p>请点击以下链接完成注册<a href=" + href + ">" + href
							+ "</a></p>");
				} else if (msg.getInfoType().equals("1")) {
					String forgetPwdUrl = commonMgSystemParamBiz.getCommonMgApplicationParam().getForgetPwdUrl();
					String href = forgetPwdUrl + msg.getContent();
					content = content.replace("emailContent", "<title>密码找回</title></head><body><h1>密码找回</h1><p>请点击以下链接确认找回密码<a href=" + href + ">" + href
							+ "</a></p>");
				}

				try {
					sendEmail.send(emailAddress, emailPwd, msg.getTarget(), content);
					msg.setSendCount(msg.getSendCount() + 1);
					msg.setSendState("2");
				} catch (Exception e) {

					logger.error("sendEmailTask sendMail error: " + e.getMessage(), e);
					msg.setSendCount(msg.getSendCount() + 1);
					if (msg.getSendCount() == 4) {
						msg.setSendState("4");
						logger.error(msg.getTarget() + "邮箱已发送四次，不再发送。");
					} else {
						msg.setSendState("3");
					}

				} finally {
					try {
						this.systemMsgSendUpdate(msg);
					} catch (Exception ex) {
						logger.error("sendEmailTask update msg error: " + ex.getMessage(), ex);
					}
				}

			}

		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see topdeep.common.mg.biz.common.impl.ICommonMgSystemBiz#sendForgetPasswordValidInfo(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Transactional
	public void sendForgetPasswordValidInfo(String userId, String userEmail, String targetSystem) throws Exception {
		String randomStr = UUIDGenerator.getUUID24();
		SystemValidInfo info = new SystemValidInfo();
		info.setId(UUIDGenerator.getUUID24());
		info.setRandomValue(randomStr);
		info.setRowVersion(0);
		info.setTargetSystem(TargetSystemType.Default.getValue());
		info.setValidState("0");
		Date validTime = new Date(new Date().getTime() + commonMgSystemParamBiz.getApplicationParam().getValidTime());
		info.setValidTime(validTime);
		info.setValidType(ValidType.SystemAdminForgetPassword.getValue());
		info.setValidUserIdType(UserIdType.SystemId.getValue());
		info.setValidUserIdNo(userId);
		systemValidInfoInsert(info);
		SystemMsgSend msgSend = new SystemMsgSend(UUIDGenerator.getUUID24(), targetSystem, MsgChannelType.Email.getValue(),
				MsgInfoType.ForgetPassword.getValue(), userId, 3, userEmail, randomStr, new Date(), new Date(), 0, MsgSendState.Normal.getValue(), 0);
		systemMsgSendInsert(msgSend);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see topdeep.common.mg.biz.common.impl.ICommonMgSystemBiz#systemAdminPasswordReset(java.lang.String, java.lang.String)
	 */
	@Transactional
	public void systemAdminPasswordReset(String randomInfo, String newMd5Password) throws CacheException, BizException, UnsupportedEncodingException {
		// 校验randomInfo
		if (StringUtils.isNullOrEmpty(randomInfo)) {
			throw new BizException("验证信息无效!");
		}
		SystemValidInfoExample condition = new SystemValidInfoExample();
		condition.or().andTargetSystemEqualTo(TargetSystemType.Default.getValue()).andValidTypeEqualTo(ValidType.SystemAdminForgetPassword.getValue())
				.andValidStateEqualTo(ValidState.NotValid.getValue()).andRandomValueEqualTo(randomInfo).andValidTimeGreaterThan(new Date());
		SystemValidInfo validInfo = selectSingleObject(systemValidInfoSelectObjects(condition));
		if (validInfo == null || StringUtils.isNullOrEmpty(validInfo.getValidUserIdType()) || StringUtils.isNullOrEmpty(validInfo.getValidUserIdNo())) {
			throw new BizException("验证信息无效!");
		}
		SystemAdmin admin = systemAdminSelectByPrimaryKey(validInfo.getValidUserIdNo());
		if (admin == null) {
			throw new BizException("验证用户无效!");
		}
		String salt = admin.getLoginPassSalt();
		admin = new SystemAdmin();
		admin.setId(validInfo.getValidUserIdNo());
		admin.setLoginPass(buildLoginPassword(newMd5Password, salt));
		systemAdminUpdateSelective(admin);
		validInfo.setValidState(ValidState.HasValid.getValue());
		systemValidInfoUpdate(validInfo);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see topdeep.common.mg.biz.common.impl.ICommonMgSystemBiz#saveAdminRoles(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Transactional
	public void saveAdminRoles(String currentAdminId, String roleIds, String parentAdmin) throws CacheException {
		SystemAdminRolesExample systemAdminRolesExample = new SystemAdminRolesExample();
		systemAdminRolesExample.or().andAdminIdEqualTo(currentAdminId);
		systemAdminRolesDeleteByCondition(systemAdminRolesExample);

		if (!StringUtils.isNullOrEmpty(roleIds)) {
			String[] ids = roleIds.split(",");
			for (int i = 0; i < ids.length; i++) {
				if (!ids[i].equals("")) {
					systemAdminRolesInsert(new SystemAdminRoles(UUIDGenerator.getUUID24(), currentAdminId, ids[i], 0));
				}
			}
		}

	}

	public List<PrivilegeGroup> getPrivilegeGroupList() {
		return privilegeGroupList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see topdeep.common.mg.biz.common.impl.ICommonMgSystemBiz#setPrivilegeGroupList(java.util.List)
	 */
	public void setPrivilegeGroupList(List<PrivilegeGroup> privilegeGroupList) {
		this.privilegeGroupList = privilegeGroupList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see topdeep.common.mg.biz.common.impl.ICommonMgSystemBiz#nextCustomPrivilegeValue(boolean)
	 */
	public int nextCustomPrivilegeValue(boolean isParent) throws DbException, SQLException, CacheException {
		Integer beginPrivilege = PrivilegeConfig.CUSTOM_PRIVILEGE_BEGIN_VALUE;
		if (isParent) {
			beginPrivilege = PrivilegeConfig.CUSTOM_PRIVILEGE_GROUP_BEGIN_VALUE;
		}
		SystemPrivilegeExample condition = new SystemPrivilegeExample();
		condition.setOrderByClause("FUNC_PRIVILEGE desc");
		Criteria or = condition.or();
		or.andFuncPrivilegeGreaterThanOrEqualTo(beginPrivilege);
		if (!isParent) {
			or.andFuncPrivilegeLessThanOrEqualTo(PrivilegeConfig.CUSTOM_PRIVILEGE_GROUP_BEGIN_VALUE - 1);
		}
		List<SystemPrivilege> priList = systemPrivilegeSelectObjects(condition);
		if (priList.size() > 0) {
			return (int) (priList.get(0).getFuncPrivilege() + 1);
		} else {
			return (int) beginPrivilege;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see topdeep.common.mg.biz.common.impl.ICommonMgSystemBiz#nextPrivilegeOrder(int)
	 */
	public int nextPrivilegeOrder(int parentPrivilege) throws DbException, SQLException, CacheException {
		SystemPrivilegeExample condition = new SystemPrivilegeExample();
		condition.setOrderByClause("FUNC_PRIVILEGE desc");
		condition.or().andFuncParentEqualTo(parentPrivilege);
		List<SystemPrivilege> priList = systemPrivilegeSelectObjects(condition);
		if (priList.size() > 0) {
			return (int) (priList.get(0).getFuncOrder() + 1);
		} else {
			return 1;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see topdeep.common.mg.biz.common.impl.ICommonMgSystemBiz#privilegeMove(int, boolean)
	 */
	@Transactional
	public boolean privilegeMove(int funcPrivilege, boolean isUpOrDown) throws Exception {
		boolean ret = false;
		SystemPrivilege oldPrivilege = systemPrivilegeSelectByPrimaryKey(funcPrivilege);
		if (oldPrivilege != null) {
			SystemPrivilegeExample condition = new SystemPrivilegeExample();
			Criteria or = condition.or();
			String order = "FUNC_ORDER asc";
			or.andFuncParentEqualTo(oldPrivilege.getFuncParent());
			if (isUpOrDown) {
				or.andFuncOrderLessThan(oldPrivilege.getFuncOrder());
				order = "FUNC_ORDER desc";
			} else {
				or.andFuncOrderGreaterThan(oldPrivilege.getFuncOrder());
			}
			condition.setOrderByClause(order);
			List<SystemPrivilege> priList = systemPrivilegeSelectObjects(condition);
			if (priList.size() > 0) {
				int temp = oldPrivilege.getFuncOrder();
				oldPrivilege.setFuncOrder(priList.get(0).getFuncOrder());
				priList.get(0).setFuncOrder(temp);
				try {
					systemPrivilegeUpdate(priList.get(0));
					systemPrivilegeUpdate(oldPrivilege);
					ret = true;
				} catch (Exception ex) {
					throw ex;
				}
			}
		}
		return ret;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see topdeep.common.mg.biz.common.impl.ICommonMgSystemBiz#initPrivilegeGroup()
	 */
	@Transactional
	public void initPrivilegeGroup() throws Exception {
		List<PrivilegeGroup> privilegeGroups = getPrivilegeGroupList("");
		try {
			SystemPrivilegeExample example = new SystemPrivilegeExample();
			example.or().andFuncParentEqualTo(0);// 1 删除所有的权限组定义
			example.or().andFuncPrivilegeLessThan(PrivilegeConfig.CUSTOM_PRIVILEGE_BEGIN_VALUE);// 2 删除所有的系统定义权限
			systemPrivilegeDeleteByCondition(example);
			int order = 1;
			for (PrivilegeGroup item : privilegeGroups) {
				SystemPrivilege privilege = new SystemPrivilege();
				privilege.setFuncName(item.getGroupName());
				privilege.setFuncOperate(0);
				privilege.setFuncOrder(order++);
				privilege.setFuncParent(0);
				privilege.setFuncPrivilege(nextCustomPrivilegeValue(true));
				privilege.setRowVersion(0);
				systemPrivilegeInsert(privilege);
				int priOrder = 1;
				for (PrivilegeInfo item1 : item.getPrivilegeList()) {
					SystemPrivilege privilege1 = new SystemPrivilege();
					privilege1.setFuncName(item1.getPrivilegeName());
					int operateValue = 0;
					for (PrivilegeOperateInfo item2 : item1.getOperateList()) {
						if (item2.isOperateEnabled()) {
							operateValue |= item2.getOperateValue();
						}
					}
					privilege1.setFuncOperate(operateValue & 0xFF);
					privilege1.setFuncOrder(priOrder++);
					privilege1.setFuncParent((int) privilege.getFuncPrivilege());
					privilege1.setFuncPrivilege(operateValue >> 8);
					privilege1.setRowVersion(0);
					systemPrivilegeInsert(privilege1);
				}
			}
			// 查询是否有用户自定义权限值
			SystemPrivilegeExample condition = new SystemPrivilegeExample();
			condition.setOrderByClause("FUNC_ORDER asc");
			condition.or().andFuncPrivilegeGreaterThanOrEqualTo(PrivilegeConfig.CUSTOM_PRIVILEGE_BEGIN_VALUE)
					.andFuncPrivilegeLessThan(PrivilegeConfig.PRIVILEGE_GROUP_BEGIN_VALUE);
			List<SystemPrivilege> customList = systemPrivilegeSelectObjects(condition);
			if (customList.size() > 0) {
				// 添加一个自定义权限组
				SystemPrivilege privilege = new SystemPrivilege();
				privilege.setFuncName("用户自定义权限组一");
				privilege.setFuncOperate(0);
				privilege.setFuncOrder(order++);
				privilege.setFuncParent(0);
				privilege.setFuncPrivilege(nextCustomPrivilegeValue(true));
				privilege.setRowVersion(0);
				systemPrivilegeInsert(privilege);
				int priOrder = 1;
				for (SystemPrivilege item : customList) {
					item.setFuncParent((int) privilege.getFuncPrivilege());
					item.setFuncOrder(priOrder);
					systemPrivilegeUpdate(item);
				}
			}
		} catch (Exception ex) {
			throw ex;
		}
	}

	private boolean existsPrivilege(List<SystemPrivilege> priList, int priValue) {
		for (SystemPrivilege item : priList) {
			if (item.getFuncPrivilege() == priValue) {
				return true;
			}
		}
		return false;
	}

	private SystemPrivilege queryPrivilegeGroup(List<SystemPrivilege> priList, String groupName) {
		for (SystemPrivilege item : priList) {
			if (item.getFuncParent() == 0 && item.getFuncName().equals(groupName)) {
				return item;
			}
		}
		return null;
	}

	@Transactional
	public void checkPrivilegeGroup() throws Exception {
		List<PrivilegeGroup> privilegeGroups = getPrivilegeGroupList("");
		List<SystemPrivilege> priList = systemPrivilegeSelectObjects(null);
		for (PrivilegeGroup item : privilegeGroups) {
			for (PrivilegeInfo item1 : item.getPrivilegeList()) {
				int operateValue = 0;
				for (PrivilegeOperateInfo item2 : item1.getOperateList()) {
					if (item2.isOperateEnabled()) {
						operateValue |= item2.getOperateValue();
					}
				}
				int funcModule = operateValue >> 8;
				int funcOperate = operateValue & 0xFF;
				// check current privilege exists?
				if (existsPrivilege(priList, funcModule)) {
					continue;
				}
				// check group exists
				SystemPrivilege funcGroup = queryPrivilegeGroup(priList, item.getGroupName());
				if (funcGroup == null) {
					SystemPrivilegeExample parentCondition = new SystemPrivilegeExample();
					parentCondition.or().andFuncParentEqualTo(0);
					parentCondition.setOrderByClause("FUNC_ORDER desc");
					parentCondition.setPage(new PageImpl(0, 1));
					SystemPrivilege lastGroup = selectSingleObject(systemPrivilegeSelectObjects(parentCondition));
					int order = 1;
					if (lastGroup != null) {
						order = lastGroup.getFuncOrder() + 1;
					}

					funcGroup = new SystemPrivilege();
					funcGroup.setFuncName(item.getGroupName());
					funcGroup.setFuncOperate(0);
					funcGroup.setFuncOrder(order);
					funcGroup.setFuncParent(0);
					funcGroup.setFuncPrivilege(nextCustomPrivilegeValue(true));
					funcGroup.setRowVersion(0);
					systemPrivilegeInsert(funcGroup);
					priList.add(funcGroup);
				}
				int priOrder = 1;
				SystemPrivilegeExample priCondition = new SystemPrivilegeExample();
				priCondition.or().andFuncParentEqualTo(funcGroup.getFuncPrivilege());
				priCondition.setOrderByClause("FUNC_ORDER desc");
				priCondition.setPage(new PageImpl(0, 1));
				SystemPrivilege lastPri = selectSingleObject(systemPrivilegeSelectObjects(priCondition));
				if (lastPri != null) {
					priOrder = lastPri.getFuncPrivilege() + 1;
				}
				SystemPrivilege privilege1 = new SystemPrivilege();
				privilege1.setFuncName(item1.getPrivilegeName());
				privilege1.setFuncOperate(funcOperate);
				privilege1.setFuncOrder(priOrder);
				privilege1.setFuncParent((int) funcGroup.getFuncPrivilege());
				privilege1.setFuncPrivilege(funcModule);
				privilege1.setRowVersion(0);
				systemPrivilegeInsert(privilege1);
				priList.add(privilege1);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see topdeep.common.mg.biz.common.impl.ICommonMgSystemBiz#initDefaultAdminUser()
	 */
	public void initDefaultAdminUser() throws Exception {
		List<SystemAdmin> adminList = systemAdminSelectObjects(null);
		if (adminList.size() == 0) {
			if (!commonMgSystemParamBiz.getCommonMgApplicationParam().isRegisterSuperAdmin()) {
				SystemAdmin admin = new SystemAdmin();
				admin.setAuditState("1");
				admin.setAuditTime(new Date());
				admin.setCreateTime(new Date());
				admin.setDeleted("0");
				admin.setId(CommonMgApplicationParam.DEFAULT_ADMIN_ID);
				admin.setLoginEmail("admin@admin.com");
				admin.setLoginName("admin");
				String password = buildLoginPassword("admin", "");
				String passSalt = UUIDGenerator.getUUID24();
				password = buildLoginPassword(password, passSalt);
				admin.setLoginPassSalt(passSalt);
				admin.setLoginPass(password);
				admin.setMemo("系统自动添加");
				admin.setMobileTelephone("13000000000");
				admin.setModifyTime(new Date());
				admin.setName("admin");
				admin.setParentAdminId(UUIDGenerator.PARENT_ID);
				admin.setRowVersion(0);
				admin.setState("1");
				userSignin(admin);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see topdeep.common.mg.biz.common.impl.ICommonMgSystemBiz#initDefaultPrivilegeGroup()
	 */
	public void initDefaultPrivilegeGroup() throws Exception {
		List<SystemPrivilege> priList = systemPrivilegeSelectObjects(null);
		if (priList.size() == 0) {
			initPrivilegeGroup();
		} else {
			checkPrivilegeGroup();
		}
	}

}
