package topdeep.common.mg.action.client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.base.PageImpl;
import topdeep.common.entity.db.SystemClientActivation;
import topdeep.common.entity.db.SystemClientActivationExample;
import topdeep.common.entity.view.SystemClientActivationExExample;
import topdeep.common.entity.view.SystemClientActivationManageView;
import topdeep.common.mg.action.base.BaseAction;
import topdeep.common.mg.entity.PrivilegeConfig;
import topdeep.common.mg.entity.request.ClientActivationManageRequest;
import topdeep.common.mg.entity.response.ClientActivationManageResponse;
import topdeep.common.mg.util.ExcelUtil;

import common.privilege.PrivilegeOperate;
import common.util.StringUtils;
import common.web.annotation.TopdeepMethodAttribute;

@Controller
@RequestMapping(value = {
	"/client"
})
public class ClientActivationManageAction extends BaseAction {
	@Autowired
	@Qualifier("excelUtil")
	protected ExcelUtil excelUtil;

	/*
	 * 基金信息跳转页面
	 */
	@TopdeepMethodAttribute
	@RequestMapping(value = "/clientActivationManage")
	public String execute(ClientActivationManageRequest req, Model model) {
		ClientActivationManageResponse res = new ClientActivationManageResponse();
		super.execute(req, res);
		checkPrivilege(res, PrivilegeConfig.FUNC_CLIENT_ACTIVATION_MANAGE, PrivilegeOperate.Read);
		if (!StringUtils.isNullOrEmpty(res.getRedirectUrl())) {
			return res.getTarget(res.getRedirectUrl());
		}
		res.setTitle("客户端激活量数据分析");
		model.addAttribute("res", res);
		return res.getTarget("/client/client-activation-manage-success");
	}

	/*
	 * ajax基金信息查询
	 */
	@TopdeepMethodAttribute
	@RequestMapping(value = "/ClientActivationManage!ajaxQuery")
	@ResponseBody
	public ClientActivationManageResponse ajaxQuery(ClientActivationManageRequest req) {
		ClientActivationManageResponse res = new ClientActivationManageResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_CLIENT_ACTIVATION_MANAGE, PrivilegeOperate.Read);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		try {
			if (res.isSuccess()) {
				if (StringUtils.isNullOrEmpty(req.getGroupMethod())) {
					SystemClientActivationExExample example = this.getCondition(req);
					List<SystemClientActivation> clientActivationList = null;
					example.setPage(new PageImpl(req.getPageIndex(), req.getRowsOfPage()));
					clientActivationList = commonMgSystemBiz.systemClientActivationSelectObjects(example);
					int count = commonMgSystemBiz.systemClientActivationQuerySelectObjectsCount(example);
					if (!clientActivationList.isEmpty()) {
						res.getPageData().setPageInfo(req.getPageIndex(), req.getRowsOfPage(), count);
					} else {
						res.getPageData().setPageInfo(0, req.getRowsOfPage(), 0);
					}
					res.setClientActivationList(clientActivationList);
					res.setSuccess(true);
					res.setParamInt(0);
				} else {
					SystemClientActivationExExample example = this.mapGroup(req);
					example.setPage(new PageImpl(req.getPageIndex(), req.getRowsOfPage()));
					List<SystemClientActivationManageView> clientActivationList = null;
					clientActivationList = commonMgSystemBiz.clientActivationViewSelectObjects(example);
					int count = commonMgSystemBiz.clientActivationViewQuerySelectObjectsCount(example);
					if (!clientActivationList.isEmpty()) {
						res.getPageData().setPageInfo(req.getPageIndex(), req.getRowsOfPage(), count);
					} else {
						res.getPageData().setPageInfo(0, req.getRowsOfPage(), 0);
					}
					res.setClientActivationList1(clientActivationList);
					res.setSuccess(true);
					res.setParamInt(1);
				}
				res.setTitle("客户端激活量数据分析查询");
			}
		} catch (Exception e) {
			logger.debug(e);
			res.setResult(false, "客户端激活量数据分析查询失败");
		}
		return res;
	}

	@TopdeepMethodAttribute
	@RequestMapping(value = "/clientActivationManage!exportClientActivation")
	public void exportClientActivation(ClientActivationManageRequest req, HttpServletResponse response) {
		ClientActivationManageResponse res = new ClientActivationManageResponse();
		super.execute(req, res, false);
		if (res.isSuccess()) {
			try {
				List<SystemClientActivation> list = null;
				List<SystemClientActivationManageView> list1 = null;
				if (StringUtils.isNullOrEmpty(req.getGroupMethod())) {
					SystemClientActivationExample example = this.getCondition(req);
					list = commonMgSystemBiz.systemClientActivationSelectObjects(example);
				} else {
					SystemClientActivationExExample example = this.mapGroup(req);
					list1 = commonMgSystemBiz.clientActivationViewSelectObjects(example);
				}
				// 设置response参数，可以打开下载页面
				response.reset();
				response.setContentType("application/vnd.ms-excel;charset=utf-8");
				response.setHeader("Content-Disposition", "attachment;filename=" + new String(("clientActivation" + ".xls").getBytes(), "iso-8859-1"));
				ServletOutputStream out = response.getOutputStream();
				BufferedInputStream bis = null;
				BufferedOutputStream bos = null;
				try {
					String[] groupMethodName;
					String[] groupMethod;
					if (StringUtils.isNullOrEmpty(req.getGroupMethod())) {
						groupMethodName = new String[] {
								"下载渠道", "客户端类型", "客户端版本", "设备标识", "设备型号", "客户端操作系统", "客户端操作系统版本", "客户端屏幕宽度", "客户端屏幕高度", "客户端屏幕密度"
						};
						groupMethod = new String[] {
								"channel", "clientType", "clientVersion", "deviceId", "clientModel", "clientOs", "clientOsVersion", "clientScreenWidth",
								"clientScreenHeight", "clientScreenDensity"
						};
						bis = new BufferedInputStream(excelUtil.getClientActivationExcelInputStream1(list, groupMethodName, groupMethod));
					} else {
						String param = req.getGroupMethodName();
						param = new String(param.getBytes("UTF-8"));
						groupMethodName = param.split(",");
						groupMethod = req.getGroupMethod().split(",");
						bis = new BufferedInputStream(excelUtil.getClientActivationExcelInputStream(list1, groupMethodName, groupMethod));
					}
					bos = new BufferedOutputStream(out);
					byte[] buff = new byte[2048];
					int bytesRead;
					// Simple read/writeas loop.
					while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
						bos.write(buff, 0, bytesRead);
					}
				} catch (Exception e) {
					// throw e;
				} finally {
					if (bis != null)
						bis.close();
					if (bos != null)
						bos.close();
				}
			} catch (Exception e) {
				logger.error("导出失败" + e.getMessage(), e);
			}
		}
	}

	private SystemClientActivationExExample getCondition(ClientActivationManageRequest req) {
		SystemClientActivationExExample example = new SystemClientActivationExExample();
		try {
			SystemClientActivationExExample.Criteria c = example.or();
			if (!StringUtils.isNullOrEmpty(req.getDeviceId())) {
				c.andDeviceIdLike("%" + req.getDeviceId() + "%");
			}
			if (!StringUtils.isNullOrEmpty(req.getChannel())) {
				c.andChannelLike("%" + req.getChannel() + "%");
			}
			if (!StringUtils.isNullOrEmpty(req.getClientModel())) {
				c.andClientModelLike("%" + req.getClientModel() + "%");
			}
			if (!StringUtils.isNullOrEmpty(req.getClientType())) {
				c.andClientTypeLike("%" + req.getClientType() + "%");
			}
			if (!StringUtils.isNullOrEmpty(req.getClientOsVersion())) {
				c.andClientOsVersionLike("%" + req.getClientOsVersion() + "%");
			}
			if (!StringUtils.isNullOrEmpty(req.getClientScreenWidth())) {
				c.andClientScreenWidthEqualTo(req.getClientScreenWidth());
			}
			if (!StringUtils.isNullOrEmpty(req.getState())) {
				c.andStateEqualTo(req.getState());
			}
			if (!StringUtils.isNullOrEmpty(req.getClientScreenDensity())) {
				c.andClientScreenDensityEqualTo(req.getClientScreenDensity());
			}
			if (!StringUtils.isNullOrEmpty(req.getClientScreenHeight())) {
				c.andClientScreenHeightEqualTo(req.getClientScreenHeight());
			}
			if (!StringUtils.isNullOrEmpty(req.getStartDate()) && !StringUtils.isNullOrEmpty(req.getEndDate())) {
				Date startDate = StringUtils.stringToDate(req.getStartDate(), "yyyy-MM-dd");
				Date endDate = StringUtils.stringToDate(req.getEndDate(), "yyyy-MM-dd");
				c.andActivationTimeBetween(startDate, endDate);
			}
			if (StringUtils.isNullOrEmpty(req.getStartDate()) && StringUtils.isNullOrEmpty(req.getEndDate())) {
				Date date = new Date();// 当前日期
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");// 格式化对象
				Calendar calendar = Calendar.getInstance();// 日历对象
				calendar.setTime(date);// 设置当前日期
				calendar.add(Calendar.MONTH, -1);// 月份减一
				String startTime = sdf.format(calendar.getTime());
				String endTime = sdf.format(date);
				Date startDate = StringUtils.stringToDate(startTime, "yyyy-MM-dd");
				Date endDate = StringUtils.stringToDate(endTime, "yyyy-MM-dd");
				c.andActivationTimeBetween(startDate, endDate);
			}

		} catch (Exception e) {

		}
		return example;
	}

	private SystemClientActivationExExample mapGroup(ClientActivationManageRequest req) {
		SystemClientActivationExExample example = this.getCondition(req);
		Map<String, String> map = new HashMap<String, String>();
		map.put("channel", "CHANNEL");
		map.put("clientType", "CLIENT_TYPE");
		map.put("clientVersion", "CLIENT_VERSION");
		map.put("deviceId", "DEVICE_ID");
		map.put("clientModel", "CLIENT_MODEL");
		map.put("clientOs", "CLIENT_OS");
		map.put("clientOsVersion", "CLIENT_OS_VERSION");
		map.put("clientScreenWidth", "CLIENT_SCREEN_WIDTH");
		map.put("clientScreenHeight", "CLIENT_SCREEN_HEIGHT");
		map.put("clientScreenDensity", "CLIENT_SCREEN_DENSITY");
		String[] groupAry = req.getGroupMethod().split("\\,");
		for (String item : groupAry) {
			if (map.containsKey(item)) {
				example.getGroups().add(map.get(item));
			}
		}
		return example;
	}
}