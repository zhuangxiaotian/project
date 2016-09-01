package topdeep.common.mg.action.system;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.base.PageImpl;
import topdeep.common.entity.db.SystemParam;
import topdeep.common.entity.db.SystemParamExample;
import topdeep.common.entity.db.SystemParamKey;
import topdeep.common.mg.action.base.BaseAction;
import topdeep.common.mg.entity.PrivilegeConfig;
import topdeep.common.mg.entity.request.ParamRequest;
import topdeep.common.mg.entity.request.SampleRequest;
import topdeep.common.mg.entity.response.BaseResponse;
import topdeep.common.mg.entity.response.ParamResponse;

import common.cache2.CacheException;
import common.privilege.PrivilegeOperate;
import common.util.StringUtils;
import common.web.annotation.TopdeepMethodAttribute;

@Controller
@RequestMapping(value = "/system")
public class ParamManageAction extends BaseAction{

	@TopdeepMethodAttribute(loginRequired = false)
	@RequestMapping(value = "paramManage", method = {
		RequestMethod.GET
	})
	public String execute(SampleRequest req, Model model) throws Exception {
		BaseResponse res = new BaseResponse();
		super.execute(req, res);
		model.addAttribute("res", res);
		checkPrivilege(res, PrivilegeConfig.FUNC_SYSTEM_PARAM_MANAGE, PrivilegeOperate.Read);
		if (!StringUtils.isNullOrEmpty(res.getRedirectUrl())) {
			return res.getTarget(res.getRedirectUrl());
		}
		return res.getTarget("/system/param-manage-success");
	}
	
	/**
	 * ajax系统参数查询
	 * @param req
	 * @param model
	 * @return
	 */
	@TopdeepMethodAttribute(isAjaxMethod = true,loginRequired = false)
	@RequestMapping(value="/paramManage!ajaxQuery")
	@ResponseBody
	public ParamResponse ajaxQuery(ParamRequest req) {
		ParamResponse res = new ParamResponse();
		SystemParamExample example=new SystemParamExample();
		checkPrivilege(res, PrivilegeConfig.FUNC_ROLE_MANAGE, PrivilegeOperate.Read);
		if (res.isSuccess()) {
			super.execute(req, res);
		}
		if (res.isSuccess()) {
			if (!StringUtils.isNullOrEmpty(req.getSearchKeyword())) {
				example.or().andParamNameLike("%"+req.getSearchKeyword()+"%");
				example.or().andParamDescLike("%"+req.getSearchKeyword()+"%");
			}
			List<SystemParam> paramList = null;
			try{
				example.setPage(new PageImpl(req.getPageIndex(), req.getRowsOfPage()));
				paramList = commonMgSystemBiz.systemParamSelectObjects(example);
				int count = commonMgSystemBiz.systemParamQuerySelectObjectsCount(example);
				res.setParamList(paramList);
				if(!paramList.isEmpty())
				{
					res.getPageData().setPageInfo(req.getPageIndex(), req.getRowsOfPage(), count);
				}
				else
				{
					res.getPageData().setPageInfo(0, 0, 0);
				}
				res.setSuccess(true);
			}catch(CacheException e){
				logger.error("paramManage!ajaxQuery error: " + e.getMessage(), e);
				res.setResult(false, "系统参数查询失败");
			}
			res.setTitle("系统参数查询");
		}
	    return res;
	}
	
	
	/**
	 * ajax系统参数增加
	 * @param req
	 * @param model
	 * @return
	 * @throws CacheException
	 */
	@TopdeepMethodAttribute(isAjaxMethod = true,loginRequired = false)
	@RequestMapping(value="/paramManage!ajaxSave")
	@ResponseBody
	public ParamResponse ajaxSave(ParamRequest req) {
		ParamResponse res = new ParamResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_ROLE_MANAGE, PrivilegeOperate.Write);
		if (res.isSuccess()) {
			super.execute(req, res);
		}
		if (res.isSuccess()) {
			SystemParamKey key = new SystemParamKey();
			key.setId(req.getId());
			key.setParamCode(req.getParamCode());
			try {
				SystemParam sp = commonMgSystemBiz.systemParamSelectByPrimaryKey(key);
				if(sp!= null ){
					sp.setParamValue(req.getParamValue());
					sp.setModifyTime(new Date());
					commonMgSystemBiz.systemParamUpdate(sp);
				}
			} catch (CacheException e) {
				logger.error("paramManage!ajaxSave error: " + e.getMessage(), e);
				res.setResult(false, "系统参数保存失败");
			}
			res.setTitle("系统参数保存");
		}
		return res;
	}
}
