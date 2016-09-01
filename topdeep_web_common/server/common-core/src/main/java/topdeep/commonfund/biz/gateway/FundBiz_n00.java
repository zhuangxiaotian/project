package topdeep.commonfund.biz.gateway;
import topdeep.commonfund.entity.gateway.def.*;
import java.util.*;
import java.io.*;
public interface FundBiz_n00 {
	
	/**
	 * 查询资讯分类 
	 * @return 结果
	 */
	ISNewsCategoryListQueryOutput newsCategoryListQuery(ISNewsCategoryListQueryInput inputParam);
	
	/**
	 * 查询资讯列表 
	 * @return 结果
	 */
	ISNewsListQueryOutput newsListQuery(ISNewsListQueryInput inputParam);
	
	/**
	 * 查询资讯内容 
	 * @return 结果
	 */
	ISNewsQueryOutput newsQuery(ISNewsQueryInput inputParam);
	
	/**
	 * 查询资源 
	 * @return 结果
	 */
	ISResourceQueryOutput resourceQuery(ISResourceQueryInput inputParam);
	
	/**
	 * 查询基金列表 
	 * @return 结果
	 */
	ISFundListQueryOutput fundListQuery(ISFundListQueryInput inputParam);
	
	/**
	 * 查询基金净值 
	 * @return 结果
	 */
	ISNetValueQueryOutput netValueQuery(ISNetValueQueryInput inputParam);
	
	/**
	 * 查询基金历史净值 
	 * @return 结果
	 */
	ISHisNetValueQueryOutput hisNetValueQuery(ISHisNetValueQueryInput inputParam);
}
