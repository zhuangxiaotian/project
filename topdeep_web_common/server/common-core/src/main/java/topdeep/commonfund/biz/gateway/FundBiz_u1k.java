package topdeep.commonfund.biz.gateway;
import topdeep.commonfund.entity.gateway.def.*;
import java.util.*;
import java.io.*;
public interface FundBiz_u1k {
	
	/**
	 * 可定制信息查询 V007
	 * @return 结果
	 */
	ISServeQueryOutput serveQuery(ISServeQueryInput inputParam);
	
	/**
	 * 定制信息 V008
	 * @return 结果
	 */
	ISServeCustomizeOutput serveCustomize(ISServeCustomizeInput inputParam);
	
	/**
	 * 重置交易密码 C029
	 * @return 结果
	 */
	ISPasswordResetOutput passwordReset(ISPasswordResetInput inputParam);
	
	/**
	 * 对账单定制查询 V005
	 * @return 结果
	 */
	ISCheckSheetQueryOutput checkSheetQuery(ISCheckSheetQueryInput inputParam);
	
	/**
	 * 对账单定制 V006
	 * @return 结果
	 */
	ISCheckSheetCustomizeOutput checkSheetCustomize(ISCheckSheetCustomizeInput inputParam);
	
	/**
	 * 客户角色查询 C053
	 * @return 结果
	 */
	ISUserRoleQueryOutput userRoleQuery(ISUserRoleQueryInput inputParam);
}
