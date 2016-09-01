package topdeep.commonfund.biz.common;

/**
 * 
 * @author shidewen
 * 
 */
public interface FundCommonSystemBiz extends topdeep.commonfund.biz.common.BaseBiz {

	void setFundAduditState(String ids, String auditState) throws Exception;

	void setFundCategoryAduditState(String ids, String auditState) throws Exception;

}
