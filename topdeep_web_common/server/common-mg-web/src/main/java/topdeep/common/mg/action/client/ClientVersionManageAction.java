package topdeep.common.mg.action.client;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.base.PageImpl;
import topdeep.common.entity.db.SystemClientVersion;
import topdeep.common.entity.db.SystemClientVersionExample;
import topdeep.common.entity.db.SystemClientVersionKey;
import topdeep.common.mg.action.base.BaseAction;
import topdeep.common.mg.entity.PrivilegeConfig;
import topdeep.common.mg.entity.request.ClientVersionRequest;
import topdeep.common.mg.entity.response.ClientVersionResponse;

import common.privilege.PrivilegeOperate;
import common.util.StringUtils;
import common.web.annotation.TopdeepMethodAttribute;

@Controller
@RequestMapping("/client")
public class ClientVersionManageAction extends BaseAction {

	@TopdeepMethodAttribute
	@RequestMapping("/clientVersionManage")
	public String execute(ClientVersionRequest req, Model model) {
		ClientVersionResponse res = new ClientVersionResponse();
		model.addAttribute("res", res);
		checkPrivilege(res, PrivilegeConfig.FUNC_CLIENT_VERSION_MANAGE, PrivilegeOperate.Read);
		if (!StringUtils.isNullOrEmpty(res.getRedirectUrl())) {
			return res.getTarget(res.getRedirectUrl());
		}
		super.execute(req, res, false);
		res.setTitle("客户端版本管理");
		if (res.isSuccess()) {
			return res.getTarget("/client/client-version-success");
		}
		return res.getTarget("/common/tip");
	}

	@TopdeepMethodAttribute
	@RequestMapping("/clientVersionManage!ajaxQuery")
	@ResponseBody
	public ClientVersionResponse ajaxQuery(ClientVersionRequest req) {
		ClientVersionResponse res = new ClientVersionResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_CLIENT_VERSION_MANAGE, PrivilegeOperate.Read);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			try {
				SystemClientVersionExample condition = new SystemClientVersionExample();
				if (!StringUtils.isNullOrEmpty(req.getSearchKeyword())) {
					condition.or().andClientTypeLike("%" + req.getSearchKeyword() + "%");
					condition.or().andClientVersionLike("%" + req.getSearchKeyword() + "%");
				}
				condition.setPage(new PageImpl(req.getPageIndex(), req.getRowsOfPage()));
				List<SystemClientVersion> clientVersions = commonMgSystemBiz.systemClientVersionSelectObjects(condition);
				int count = commonMgSystemBiz.systemClientVersionQuerySelectObjectsCount(condition);
				if (count > 0) {
					res.getPageData().setPageInfo(req.getPageIndex(), req.getRowsOfPage(), count);
				} else {
					res.getPageData().setPageInfo(0, req.getRowsOfPage(), 0);
				}
				res.setClientVersions(clientVersions);
			} catch (Exception e) {
				logger.error("查询客户端版本失败" + e.getMessage(), e);
				res.setResult(false, "查询失败");
			}
		}
		return res;
	}

	@TopdeepMethodAttribute
	@RequestMapping("/clientVersionManage!ajaxSave")
	@ResponseBody
	public ClientVersionResponse ajaxSave(ClientVersionRequest req) {
		ClientVersionResponse res = new ClientVersionResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_CLIENT_VERSION_MANAGE, PrivilegeOperate.Write);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			req.checkEditInput(res);
		}
		if (res.isSuccess()) {
			try {
				SystemClientVersion version = null;
				if (!StringUtils.isNullOrEmpty(req.getClientVersion().getClientType()) && !StringUtils.isNullOrEmpty(req.getClientVersion().getClientVersion())) {
					version = commonMgSystemBiz.systemClientVersionSelectByPrimaryKey(new SystemClientVersionKey(req.getClientVersion().getClientType(), req
							.getClientVersion().getClientVersion()));
				}
				boolean isNew = version == null;
				if (isNew) {
					version = new SystemClientVersion();
					version.setClientType(req.getClientVersion().getClientType());
					version.setClientVersion(req.getClientVersion().getClientVersion());
					version.setCreateTime(new Date());
					version.setRowVersion(0);
				} else {
					version.setRowVersion(req.getClientVersion().getRowVersion());
				}
				version.setClientState(req.getClientVersion().getClientState());
				version.setReleaseTime(req.getClientVersion().getReleaseTime());
				version.setClientSignature(req.getClientVersion().getClientSignature());
				version.setCurrentInstallUrl(req.getClientVersion().getCurrentInstallUrl());
				version.setNextUpdateUrl(req.getClientVersion().getNextUpdateUrl());
				version.setClientEncryptKey(req.getClientVersion().getClientEncryptKey());
				version.setClientSignKey(req.getClientVersion().getClientSignKey());
				// version.setPub0(req.getClientVersion().getPub0());
				// version.setPub1(req.getClientVersion().getPub1());
				// version.setPub2(req.getClientVersion().getPub2());
				version.setModifyTime(new Date());
				if (isNew) {
					commonMgSystemBiz.systemClientVersionInsert(version);
				} else {
					commonMgSystemBiz.systemClientVersionUpdate(version);
				}
				res.setResult(true, "保存成功");
			} catch (Exception e) {
				logger.error("保存客户端版本失败" + e.getMessage(), e);
				res.setResult(false, "保存失败");
			}
		}
		return res;
	}

	@TopdeepMethodAttribute
	@RequestMapping(value = "/clientVersionManage!ajaxDelete")
	@ResponseBody
	public ClientVersionResponse ajaxDelete(ClientVersionRequest req) {
		ClientVersionResponse res = new ClientVersionResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_CLIENT_VERSION_MANAGE, PrivilegeOperate.Delete);
		if (!StringUtils.isNullOrEmpty(res.getRedirectUrl())) {
			return res;
		}
		super.execute(req, res, true);
		req.checkDeleteInput(res);
		if (res.isSuccess()) {
			try {
				SystemClientVersionKey key = new SystemClientVersionKey(req.getClientVersion().getClientType(), req.getClientVersion().getClientVersion());
				commonMgSystemBiz.systemClientVersionDeleteByPrimaryKey(key);
				res.setResult(true, "删除成功");
			} catch (Exception e) {
				logger.error("ajaxDelete error" + e);
				res.setResult(false, "删除客户端版本失败");
			}
		}
		return res;
	}

}
