/**
 * @Title: Index.java
 * @Package topdeep.wechat.mg.action.system
 * @author Yewenhai
 * @date Dec 10, 2014 2:37:15 PM
 * @version V1.0
 */
package topdeep.common.mg.action.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.base.PageImpl;
import topdeep.common.entity.constant.BaseInfoType;
import topdeep.common.entity.db.SystemBaseInfo;
import topdeep.common.entity.db.SystemBaseInfoExample;
import topdeep.common.entity.db.SystemWhiteList;
import topdeep.common.entity.db.SystemWhiteListExample;
import topdeep.common.entity.db.SystemWhiteListExample.Criteria;
import topdeep.common.mg.action.base.BaseAction;
import topdeep.common.mg.entity.Constants;
import topdeep.common.mg.entity.request.WhiteListsRequest;
import topdeep.common.mg.entity.response.WhiteListsResponse;
import topdeep.common.util.UUIDGenerator;

import common.util.StringUtils;
import common.web.annotation.TopdeepMethodAttribute;

/**
 * @author
 * @date
 * 
 */
@Controller
@RequestMapping(value = "/system")
public class WhiteListsManageAction extends BaseAction {

	@TopdeepMethodAttribute
	@RequestMapping("/whiteListsManage")
	public String execute(WhiteListsRequest req, Model model) {
		WhiteListsResponse res = new WhiteListsResponse();
		model.addAttribute("res", res);
		super.execute(req, res);

		if (res.isSuccess()) {
			res.setDefaultWhiteListsURL("");
			List<SystemBaseInfo> whiteListsURL = new ArrayList<SystemBaseInfo>();
			List<SystemBaseInfo> idTypeList = new ArrayList<SystemBaseInfo>();

			try {
				SystemBaseInfoExample example = new SystemBaseInfoExample();
				topdeep.common.entity.db.SystemBaseInfoExample.Criteria criteria = example.createCriteria();
				criteria.andCodeTypeEqualTo(BaseInfoType.WHITELISTS_URL);
				criteria.andSystemTypeEqualTo(Constants.SYSTEM_TYPE_FUND);

				whiteListsURL = commonMgSystemBiz.systemBaseInfoSelectObjects(example);

				example.clear();
				topdeep.common.entity.db.SystemBaseInfoExample.Criteria criteria1 = example.createCriteria();
				if ("1".endsWith(req.getType())) {
					criteria1.andCodeTypeEqualTo(BaseInfoType.ID_TYPE);
				} else {
					criteria1.andCodeTypeEqualTo(BaseInfoType.ENTERPRISE_ID_TYPE);
				}
				criteria1.andSystemTypeEqualTo(Constants.SYSTEM_TYPE_FUND);

				idTypeList = commonMgSystemBiz.systemBaseInfoSelectObjects(example);
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
				res.setResult(false, e.getMessage());
			}
			res.setWhiteListsURL(whiteListsURL);
			res.setIdTypeList(idTypeList);
			res.setType(req.getType());
		}
		if ("1".equals(req.getType())) {
			res.setTitle("个人白名单管理");
		} else {
			res.setTitle("机构白名单管理");
		}
		return res.getTarget("/system/white-lists");
	}

	/**
	 * 查询白名单列表
	 * 
	 * @param request
	 * @return
	 */
	@TopdeepMethodAttribute
	@RequestMapping(value = "/whiteListsManage!ajaxWhiteLists", method = {
		RequestMethod.POST
	})
	@ResponseBody
	public WhiteListsResponse ajaxWhiteLists(WhiteListsRequest request) {
		WhiteListsResponse res = new WhiteListsResponse();
		SystemWhiteListExample example = new SystemWhiteListExample();
		Criteria criteria = example.createCriteria();
		if (!StringUtils.isNullOrEmpty(request.getListType())) {
			criteria.andIdTypeEqualTo(request.getListType());
		}
		criteria.andFuncCataEqualTo(request.getType());
		if(!StringUtils.isNullOrEmpty(request.getListNo())){
			criteria.andIdNoEqualTo(request.getListNo());
		}
		example.setOrderByClause("create_time desc");
		example.setPage(new PageImpl(request.getPageIndex(), request.getRowsOfPage()));

		res.setDefaultWhiteListsURL("");
		SystemBaseInfoExample example1 = new SystemBaseInfoExample();
		topdeep.common.entity.db.SystemBaseInfoExample.Criteria criteria1 = example1.createCriteria();
		criteria1.andCodeTypeEqualTo(BaseInfoType.WHITELISTS_URL);
		criteria1.andSystemTypeEqualTo(Constants.SYSTEM_TYPE_FUND);

		List<SystemBaseInfo> whiteListsURL = new ArrayList<SystemBaseInfo>();
		List<SystemBaseInfo> idTypeList = new ArrayList<SystemBaseInfo>();
		List<SystemWhiteList> whiteLists = new ArrayList<SystemWhiteList>();

		try {
			// 查询白名单功能号
			whiteListsURL = commonMgSystemBiz.systemBaseInfoSelectObjects(example1);
			if (StringUtils.isNullOrEmpty(request.getUrl())) {
				List<String> urls = new ArrayList<String>();

				for (SystemBaseInfo info : whiteListsURL) {
					urls.add(info.getCodeDesc());
				}
				criteria.andFuncUrlIn(urls);
			} else {
				criteria.andFuncUrlEqualTo(request.getUrl());
			}

			//查询白名单列表
			whiteLists = commonMgSystemBiz.systemWhiteListSelectObjects(example);

			int count = commonMgSystemBiz.systemWhiteListQuerySelectObjectsCount(example);

			if (!whiteLists.isEmpty()) {
				res.getPageData().setPageInfo(request.getPageIndex(), request.getRowsOfPage(), count);
			} else {
				res.getPageData().setPageInfo(0, 0, 0);
			}

			// 查询证件类型
			example1.clear();
			topdeep.common.entity.db.SystemBaseInfoExample.Criteria criteria2 = example1.createCriteria();
			criteria2.andCodeTypeEqualTo(BaseInfoType.ID_TYPE);
			criteria2.andSystemTypeEqualTo(Constants.SYSTEM_TYPE_FUND);

			idTypeList = commonMgSystemBiz.systemBaseInfoSelectObjects(example1);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			res.setResult(false, "查询白名单列表失败");
			logger.error(e.getMessage(), e);
		}

		res.setWhiteListsURL(whiteListsURL);
		res.setWhiteLists(whiteLists);
		res.setIdTypeList(idTypeList);
		res.setTitle("白名单管理");
		return res;
	}

	/**
	 * 创建白名单
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	@TopdeepMethodAttribute
	@RequestMapping(value = "/whiteListsManage!ajaxCreateWhiteLists", method = {
		RequestMethod.POST
	})
	@ResponseBody
	public WhiteListsResponse ajaxCreateWhiteLists(WhiteListsRequest request, Model model) {
		WhiteListsResponse res = new WhiteListsResponse();

		SystemWhiteList updateItem = new SystemWhiteList();
		updateItem.setIdNo(request.getListNo().trim());
		updateItem.setIdType(request.getListType().trim());
		updateItem.setStatus(request.getStatus().trim());
		updateItem.setFuncUrl(request.getUrl().trim());
		updateItem.setSystemType(Constants.SYSTEM_TYPE_FUND);
		updateItem.setRowVersion(1);
		updateItem.setFuncCata(request.getType());
		updateItem.setCreateTime(new Date());
		updateItem.setModifyTime(new Date());
		updateItem.setId(UUIDGenerator.getUUID24());

		// SystemWhiteList obj = commonMgSystemBiz.whiteListsSelectSingleObject(new WhiteListsQueryCondition().setIdNoConditionEqual(request.getListNo().trim())
		// .setIdTypeConditionEqual(request.getListType().trim()).setFuncUrlConditionEqual(request.getUrl().trim()));

		SystemWhiteListExample example = new SystemWhiteListExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdNoEqualTo(request.getListNo().trim());
		criteria.andIdTypeEqualTo(request.getListType().trim());
		criteria.andFuncUrlEqualTo(request.getUrl().trim());
		criteria.andFuncCataEqualTo(request.getType());
		try {
			List<SystemWhiteList> objs = commonMgSystemBiz.systemWhiteListSelectObjects(example);
			if (objs != null && objs.size() > 0) {
				res.setResult(false, "数据重复");
			} else {
				commonMgSystemBiz.systemWhiteListInsert(updateItem);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			res.setResult(false, e.getMessage());
			logger.error(e.getMessage(), e);
		}

		res.setTitle("白名单管理");
		return res;
	}

	/**
	 * 白名单修改
	 * 
	 * @param request
	 * @return
	 */
	@TopdeepMethodAttribute
	@RequestMapping(value = "/whiteListsManage!ajaxUpdateWhiteLists", method = {
		RequestMethod.POST
	})
	@ResponseBody
	public WhiteListsResponse ajaxUpdateWhiteLists(WhiteListsRequest request) {
		WhiteListsResponse res = new WhiteListsResponse();

		SystemWhiteList updateItem = new SystemWhiteList();
		updateItem.setIdNo(request.getListNoUpdate());
		updateItem.setIdType(request.getListTypeUpdate());
		updateItem.setStatus(request.getStatus());
		updateItem.setFuncUrl(request.getUrlUpdate());
		updateItem.setSystemType(Constants.SYSTEM_TYPE_FUND);
		updateItem.setModifyTime(new Date());
		updateItem.setFuncCata(request.getType());
		// WhiteLists obj = postMgBiz.whiteListsSelectSingleObject(new WhiteListsQueryCondition().setIdNoConditionEqual(request.getListNoUpdate())
		// .setIdTypeConditionEqual(request.getListTypeUpdate().trim()).setFuncUrlConditionEqual(request.getUrlUpdate()));

		try {
			SystemWhiteListExample example = new SystemWhiteListExample();
			Criteria criteria = example.createCriteria();
			criteria.andIdNoEqualTo(request.getListNoUpdate().trim());
			criteria.andIdTypeEqualTo(request.getListTypeUpdate().trim());
			criteria.andFuncUrlEqualTo(request.getUrlUpdate().trim());
			criteria.andSystemTypeEqualTo(Constants.SYSTEM_TYPE_FUND);
			criteria.andFuncCataEqualTo(request.getType());
			List<SystemWhiteList> objs = commonMgSystemBiz.systemWhiteListSelectObjects(example);
			if (objs != null && objs.size() > 0) {
				res.setResult(false, "数据重复");
			} else {
				ajaxDeletewhiteList(request);
				updateItem.setCreateTime(new Date());
				updateItem.setRowVersion(1);
				updateItem.setId(UUIDGenerator.getUUID24());
				commonMgSystemBiz.systemWhiteListInsert(updateItem);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			res.setResult(false, e.getMessage());
			logger.error(e.getMessage(), e);
		}

		res.setTitle("白名单管理");
		return res;
	}

	/**
	 * 删除白名单
	 * 
	 * @param request
	 * @return
	 */
	@TopdeepMethodAttribute
	@RequestMapping(value = "/whiteListsManage!ajaxDeletewhiteList")
	@ResponseBody
	public WhiteListsResponse ajaxDeletewhiteList(WhiteListsRequest request) {
		WhiteListsResponse res = new WhiteListsResponse();
		// postMgBiz.whiteListsDeleteByFuncUrlIdNoIdType(request.getUrl(), request.getListNo(), request.getListType());
		try {
			SystemWhiteListExample example = new SystemWhiteListExample();
			Criteria criteria = example.createCriteria();
			criteria.andIdEqualTo(request.getId());
			// criteria.andFuncUrlEqualTo(request.getUrl());
			// criteria.andIdNoEqualTo(request.getListNo());
			// criteria.andIdTypeEqualTo(request.getListType());
			// criteria.andSystemTypeEqualTo(Constants.SYSTEM_TYPE_FUND);
			// criteria.andFuncCataEqualTo(request.getType());
			commonMgSystemBiz.systemWhiteListDeleteByCondition(example);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			res.setResult(false, e.getMessage());
			logger.error(e.getMessage(), e);
		}

		res.setTitle("白名单管理");
		return res;
	}

	/**
	 * 修改白名单状态
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	@TopdeepMethodAttribute
	@RequestMapping(value = "/whiteListsManage!ajaxUpdateStatusList", method = {
		RequestMethod.POST
	})
	@ResponseBody
	public WhiteListsResponse ajaxUpdateStatusList(WhiteListsRequest request, Model model) {
		WhiteListsResponse res = new WhiteListsResponse();

		try {
			SystemWhiteList updateItem = new SystemWhiteList();
			updateItem.setId(request.getId());
			// updateItem.setIdNo(request.getListNo().trim());
			// updateItem.setIdType(request.getListType().trim());
			updateItem.setStatus(request.getStatus().trim());
			// updateItem.setFuncUrl(request.getUrl().trim());
			// updateItem.setSystemType(Constants.SYSTEM_TYPE_FUND);
			updateItem.setModifyTime(new Date());
			// updateItem.setFuncCata(request.getType());

			commonMgSystemBiz.systemWhiteListUpdateSelective(updateItem);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			res.setResult(false, e.getMessage());
			logger.error(e.getMessage(), e);
		}

		res.setTitle("白名单管理");
		return res;
	}

}
