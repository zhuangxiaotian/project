package topdeep.commonfund.biz.common.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import topdeep.commonfund.entity.db.FundFundCategory;
import topdeep.commonfund.entity.db.FundFundCategoryExample;
import topdeep.commonfund.entity.db.FundFundInfo;
import topdeep.commonfund.entity.db.FundFundInfoExample;

import common.cache2.CacheException;

/**
 * 
 * @author shidewen
 * 
 */
@Service("fundCommonSystemBiz")
public class FundCommonSystemBiz extends BaseBiz implements topdeep.commonfund.biz.common.FundCommonSystemBiz {

	public FundCommonSystemBiz() {
		// TODO Auto-generated constructor stub
	}

	@Transactional
	public void setFundAduditState(String ids, String auditState) throws CacheException {
		String[] fundCodes = ids.split(",");
		FundFundInfoExample example = new FundFundInfoExample();
		List<String> list = Arrays.asList(fundCodes);
		example.or().andFundCodeIn(list);
		FundFundInfo fundInfo = new FundFundInfo();
		fundInfo.setAuditState(auditState);
		this.fundFundInfoUpdateSelectiveByCondition(fundInfo, example);
	}

	@Transactional
	public void setFundCategoryAduditState(String ids, String auditState) throws CacheException {
		String[] arr = ids.split(",");
		FundFundCategoryExample example = new FundFundCategoryExample();
		List<String> list = Arrays.asList(arr);
		example.or().andIdIn(list);
		FundFundCategory fundCategory = new FundFundCategory();
		fundCategory.setAuditState(auditState);
		this.fundFundCategoryUpdateSelectiveByCondition(fundCategory, example);
	}

}
