package topdeep.commonfund.mg.action.system;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
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

import topdeep.common.entity.constant.EnumType.ActionType;
import topdeep.common.mg.action.base.BaseAction;
import topdeep.common.mg.entity.request.BaseRequest;
import topdeep.common.mg.entity.response.BaseResponse;
import topdeep.common.mg.entity.view.StatDetailView;
import topdeep.common.mg.util.ExcelUtil;
import topdeep.commonfund.biz.FundCustomerLogBiz;
import topdeep.commonfund.entity.view.FundCustomerLogView;
import topdeep.commonfund.mg.entity.FundPrivilegeConfig;
import topdeep.commonfund.mg.entity.response.CustomerLogStatisticeResponse;

import common.privilege.PrivilegeOperate;
import common.util.StringUtils;
import common.web.annotation.TopdeepMethodAttribute;

@Controller
@RequestMapping("/system")
public class CustomerLogStatisticsManageAction extends BaseAction {

	@Autowired
	@Qualifier("fundCustomerLogBiz")
	private FundCustomerLogBiz fundCustomerLogBiz;

	@Autowired
	@Qualifier("excelUtil")
	protected ExcelUtil excelUtil;

	@TopdeepMethodAttribute()
	@RequestMapping("/customerLogStatistics")
	public String execute(BaseRequest req, Model model) {
		BaseResponse res = new BaseResponse();
		model.addAttribute("res", res);
		res.setTitle("数据统计分析");
		checkPrivilege(res, FundPrivilegeConfig.FUNC_CUSTOMER_LOG_STATISTICS_MANAGE, PrivilegeOperate.Read);
		if (!StringUtils.isNullOrEmpty(res.getRedirectUrl())) {
			return res.getTarget(res.getRedirectUrl());
		}
		super.execute(req, res, false);
		if (res.isSuccess()) {
			return res.getTarget("/system/customer-log-statistics-success");
		} else {
			return res.getTarget("/common/tip");
		}
	}

	@TopdeepMethodAttribute()
	@RequestMapping("/customerLogStatistics!ajaxQuery")
	@ResponseBody
	public CustomerLogStatisticeResponse ajaxQuery(BaseRequest req) {
		CustomerLogStatisticeResponse res = new CustomerLogStatisticeResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_CUSTOMER_LOG_STATISTICS_MANAGE, PrivilegeOperate.Read);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			try {
				ActionType[] actionTypeAry = ActionType.values();
				Map<String, String> actionMap = new HashMap<String, String>();
				for (ActionType item : actionTypeAry) {
					if (!actionMap.containsKey(item.getValue())) {
						actionMap.put(item.getValue(), item.getName());
					}
				}
				Map<String, StatDetailView> statResultMap = new HashMap<String, StatDetailView>();
				Integer[] days = new Integer[] {
						7, 30, 120, 9999
				};
				Date date = new Date();
				for (Integer day : days) {
					Calendar cal = Calendar.getInstance();
					cal.setTime(date);
					int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
					cal.set(Calendar.DAY_OF_YEAR, dayOfYear - day);
					List<FundCustomerLogView> list = fundCustomerLogBiz.selectCountByActionType(cal.getTime());
					for (FundCustomerLogView customerLogView : list) {
						StatDetailView detailView = statResultMap.get(customerLogView.getActionType());
						if (detailView == null) {
							detailView = new StatDetailView();
							res.getStatValueList().add(detailView);
							if (actionMap.containsKey(customerLogView.getActionType())) {
								detailView.setStatType(actionMap.get(customerLogView.getActionType()));
							} else {
								detailView.setStatType("未知");
							}
							statResultMap.put(customerLogView.getActionType(), detailView);
						}
						if (day == 7) {
							detailView.setValue1("" + customerLogView.getTotal());
						} else if (day == 30) {
							detailView.setValue2("" + customerLogView.getTotal());
						} else if (day == 120) {
							detailView.setValue3("" + customerLogView.getTotal());
						} else if (day == 9999) {
							detailView.setValue4("" + customerLogView.getTotal());
						}
					}
					cal.clear();
				}

				Collections.sort(res.getStatValueList(), new Comparator<StatDetailView>() {

					public int compare(StatDetailView o1, StatDetailView o2) {
						return o1.getStatType().compareTo(o2.getStatType());
					}

				});

			} catch (Exception e) {
				logger.error("customerLogStatistics!ajaxQuery error" + e.getMessage());
				res.setResult(false, e.getMessage());
			}
		}
		return res;
	}

	/**
	 * 
	 * @Title: ajaxExport
	 * @Description: 导出
	 * @param: @param req
	 * @param: @param response
	 * @return: void
	 * @throws
	 */
	@TopdeepMethodAttribute()
	@RequestMapping(value = "/customerLogStatistics!exportCustomerLogStatistics")
	public void ajaxExport(BaseRequest req, HttpServletResponse response) {
		CustomerLogStatisticeResponse res = new CustomerLogStatisticeResponse();
		super.execute(req, res, false);
		if (res.isSuccess()) {
			try {
				String fileName = "CustomerLogStatistics_excel";
				List<StatDetailView> list = new ArrayList<StatDetailView>();

				ActionType[] actionTypeAry = ActionType.values();
				Map<String, String> actionMap = new HashMap<String, String>();
				for (ActionType item : actionTypeAry) {
					if (!actionMap.containsKey(item.getValue())) {
						actionMap.put(item.getValue(), item.getName());
					}
				}
				Map<String, StatDetailView> statResultMap = new HashMap<String, StatDetailView>();
				Integer[] days = new Integer[] {
						7, 30, 120, 9999
				};
				Date date = new Date();
				for (Integer day : days) {
					Calendar cal = Calendar.getInstance();
					cal.setTime(date);
					int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
					cal.set(Calendar.DAY_OF_YEAR, dayOfYear - day);
					List<FundCustomerLogView> customerLogViewList = fundCustomerLogBiz.selectCountByActionType(cal.getTime());
					for (FundCustomerLogView customerLogView : customerLogViewList) {
						StatDetailView detailView = statResultMap.get(customerLogView.getActionType());
						if (detailView == null) {
							detailView = new StatDetailView();
							list.add(detailView);
							if (actionMap.containsKey(customerLogView.getActionType())) {
								detailView.setStatType(actionMap.get(customerLogView.getActionType()));
							} else {
								detailView.setStatType("未知");
							}
							statResultMap.put(customerLogView.getActionType(), detailView);
						}
						if (day == 7) {
							detailView.setValue1("" + customerLogView.getTotal());
						} else if (day == 30) {
							detailView.setValue2("" + customerLogView.getTotal());
						} else if (day == 120) {
							detailView.setValue3("" + customerLogView.getTotal());
						} else if (day == 9999) {
							detailView.setValue4("" + customerLogView.getTotal());
						}
					}
					cal.clear();
				}

				Collections.sort(list, new Comparator<StatDetailView>() {

					public int compare(StatDetailView o1, StatDetailView o2) {
						return o1.getStatType().compareTo(o2.getStatType());
					}

				});

				// 设置response参数，可以打开下载页面
				response.reset();
				response.setContentType("application/vnd.ms-excel;charset=utf-8");
				response.setHeader("Content-Disposition", "attachment;filename=" + new String((fileName + ".xls").getBytes(), "iso-8859-1"));
				ServletOutputStream out = response.getOutputStream();
				BufferedInputStream bis = null;
				BufferedOutputStream bos = null;
				try {
					bis = new BufferedInputStream(excelUtil.getCustomerLogStatisticsExcelInputStream(list, "1", "11"));
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

}
