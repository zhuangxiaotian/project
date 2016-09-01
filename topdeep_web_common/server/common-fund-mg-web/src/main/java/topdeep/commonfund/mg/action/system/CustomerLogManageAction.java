package topdeep.commonfund.mg.action.system;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.base.PageImpl;
import topdeep.common.entity.db.SystemBaseInfo;
import topdeep.common.entity.db.SystemBaseInfoExample;
import topdeep.common.mg.util.ExcelUtil;
import topdeep.commonfund.entity.db.FundCustomerLog;
import topdeep.commonfund.entity.db.FundCustomerLogExample;
import topdeep.commonfund.mg.action.base.BaseAction;
import topdeep.commonfund.mg.entity.FundPrivilegeConfig;
import topdeep.commonfund.mg.entity.request.CustomerLogRequest;
import topdeep.commonfund.mg.entity.response.CustomerLogResponse;

import common.privilege.PrivilegeOperate;
import common.util.StringUtils;
import common.web.annotation.TopdeepMethodAttribute;

@Controller
@RequestMapping("/system")
public class CustomerLogManageAction extends BaseAction {

	@Autowired
	@Qualifier("excelUtil")
	protected ExcelUtil excelUtil;

	@TopdeepMethodAttribute(loginRequired = true)
	@RequestMapping("/customerLogManage")
	public String execute(CustomerLogRequest req, Model model) {
		CustomerLogResponse res = new CustomerLogResponse();
		model.addAttribute("res", res);
		res.setTitle("业务日志");
		checkPrivilege(res, FundPrivilegeConfig.FUNC_CUSTOMER_LOG_MANAGE, PrivilegeOperate.Read);
		if (!StringUtils.isNullOrEmpty(res.getRedirectUrl())) {
			return res.getTarget(res.getRedirectUrl());
		}
		super.execute(req, res, false);
		try {
			SystemBaseInfoExample baseInfoQueryCondition = new SystemBaseInfoExample();
			baseInfoQueryCondition.or().andCodeTypeEqualTo("015");
			List<SystemBaseInfo> baseInfos = commonMgSystemBiz.systemBaseInfoSelectObjects(baseInfoQueryCondition);
			model.addAttribute("idTypes", baseInfos);
			return res.getTarget("/system/customer-log-success");
		} catch (Exception e) {
			logger.error("execute error" + e.getMessage(), e);
			return res.getTarget("/common/tip");
		}
	}

	@TopdeepMethodAttribute(loginRequired = true)
	@RequestMapping("customerLogManage!ajaxQuery")
	@ResponseBody
	public CustomerLogResponse ajaxQuery(CustomerLogRequest req) {
		CustomerLogResponse res = new CustomerLogResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_CUSTOMER_LOG_MANAGE, PrivilegeOperate.Read);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			try {
				FundCustomerLogExample condition = new FundCustomerLogExample();
				if (!StringUtils.isNullOrEmpty(req.getSearchKeyword())) {
					condition.or().andCustomerNoLike("%" + req.getSearchKeyword() + "%");
					condition.or().andIdNoLike("%" + req.getSearchKeyword() + "%");
					condition.or().andActionParam1Like("%" + req.getSearchKeyword() + "%");
					condition.or().andActionParam2Like("%" + req.getSearchKeyword() + "%");
					condition.or().andActionParam3Like("%" + req.getSearchKeyword() + "%");
				}
				condition.setPage(new PageImpl(req.getPageIndex(), req.getRowsOfPage()));
				List<FundCustomerLog> logs = fundSystemBiz.fundCustomerLogSelectObjects(condition);
				int count = fundSystemBiz.fundCustomerLogQuerySelectObjectsCount(condition);
				if (count > 0) {
					res.getPageData().setPageInfo(req.getPageIndex(), req.getRowsOfPage(), count);
				} else {
					res.getPageData().setPageInfo(0, req.getRowsOfPage(), 0);
				}
				res.setCustomerLogs(logs);
				res.setResult(true, "查询成功");
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
				res.setResult(false, "查询失败" + e.getMessage());
			}
		}
		return res;
	}

	@TopdeepMethodAttribute(loginRequired = true)
	@RequestMapping(value = "/customerLogManage!exportCustomerLog")
	public void ajaxExport(CustomerLogRequest req, HttpServletResponse response) {
		CustomerLogResponse res = new CustomerLogResponse();
		super.execute(req, res, false);
		if (res.isSuccess()) {
			try {
				String fileName = req.getPageIndex() == -1 ? "customerLog_excel_all" : "customerLog_excel_page" + (req.getPageIndex() + 1);
				List<FundCustomerLog> list = null;
				FundCustomerLogExample condition = new FundCustomerLogExample();
				if (req.getPageIndex() == -1) {
					list = fundSystemBiz.fundCustomerLogSelectObjects(condition);
				} else {
					if (!StringUtils.isNullOrEmpty(req.getSearchKeyword())) {
						condition.or().andCustomerNoLike("%" + req.getSearchKeyword() + "%");
						condition.or().andIdNoLike("%" + req.getSearchKeyword() + "%");
						condition.or().andActionParam1Like("%" + req.getSearchKeyword() + "%");
						condition.or().andActionParam2Like("%" + req.getSearchKeyword() + "%");
						condition.or().andActionParam3Like("%" + req.getSearchKeyword() + "%");
					}
					condition.setPage(new PageImpl(req.getPageIndex(), req.getRowsOfPage()));
					list = fundSystemBiz.fundCustomerLogSelectObjects(condition);
				}
				// 设置response参数，可以打开下载页面
				response.reset();
				response.setContentType("application/vnd.ms-excel;charset=utf-8");
				response.setHeader("Content-type", "application-download");
				response.setHeader("Content-Disposition", "attachment;filename=" + new String((fileName + ".xls").getBytes(), "iso-8859-1"));
				ServletOutputStream out = response.getOutputStream();
				BufferedInputStream bis = null;
				BufferedOutputStream bos = null;
				try {
					bis = new BufferedInputStream(excelUtil.getCustomerInfoExcelInputStream(list, "1", "11"));
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
