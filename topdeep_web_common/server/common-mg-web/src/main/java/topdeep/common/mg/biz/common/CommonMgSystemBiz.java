/**
 * 
 */
package topdeep.common.mg.biz.common;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import topdeep.common.entity.BizException;
import topdeep.common.entity.db.SystemAdmin;
import topdeep.common.mg.entity.view.PrivilegeGroup;

import common.cache2.CacheException;
import common.dbvisit.DbException;

/**
 * @author niexin
 *
 */
public interface CommonMgSystemBiz extends topdeep.common.biz.common.CommonSystemBiz {

	public abstract boolean existsSystemAdmin() throws CacheException;

	public abstract SystemAdmin loginCheck(String loginName) throws CacheException;

	public abstract List<PrivilegeGroup> queryPrivilegeGroupList(String currentPrivileges) throws Exception;

	public List<PrivilegeGroup> getPrivilegeGroupList(String currentPrivileges) throws Exception;

	/**
	 * 处理用户选中的权限值,用户选中的权限值是模块加单选的值，放到数据库的时候合并一下，省点地方
	 * 
	 * @param userSelectPrivileges
	 * @return
	 */
	public abstract String dealUploadPrivileges(String userSelectPrivileges);

	/**
	 * 给用户添加权限
	 * 
	 * @param APrivilegeValue
	 */
	public abstract void privilegeAdd(String APrivilegeValue, Map<Integer, Integer> privilegeList);

	/**
	 * 
	 * hasPrivilege:(判断用户是否有权限). <br/>
	 * 
	 * @author develop
	 * @param privileges 用户权限列表
	 * @param func 菜单功能
	 * @param operate 操作
	 * @return
	 * 
	 */
	public abstract boolean hasPrivilege(Map<Integer, Integer> privileges, int func, int operate);

	public abstract String buildLoginPassword(String inputPassword, String passwordSalt) throws UnsupportedEncodingException;

	public abstract void userSignin(SystemAdmin newOper) throws Exception;

	public abstract void sendEmailTask() throws CacheException;

	public abstract void sendForgetPasswordValidInfo(String userId, String userEmail, String targetSystem) throws Exception;

	public abstract void systemAdminPasswordReset(String randomInfo, String newMd5Password) throws CacheException, BizException, UnsupportedEncodingException;

	public abstract void saveAdminRoles(String currentAdminId, String roleIds, String parentAdmin) throws CacheException;

	public abstract void setPrivilegeGroupList(List<PrivilegeGroup> privilegeGroupList);

	public abstract int nextCustomPrivilegeValue(boolean isParent) throws DbException, SQLException, CacheException;

	public abstract int nextPrivilegeOrder(int parentPrivilege) throws DbException, SQLException, CacheException;

	public abstract boolean privilegeMove(int funcPrivilege, boolean isUpOrDown) throws Exception;

	public abstract void initPrivilegeGroup() throws Exception;

	public abstract void initDefaultAdminUser() throws Exception;

	public abstract void initDefaultPrivilegeGroup() throws Exception;

}