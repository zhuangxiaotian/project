package topdeep.commonfund.biz.gateway;
import topdeep.commonfund.entity.gateway.def.*;
import java.util.*;
import java.io.*;
public interface FundBiz_n0u {
	
	/**
	 * 发送验证信息接口 
	 * @return 结果
	 */
	ISValidInfoSendOutput validInfoSend(ISValidInfoSendInput inputParam);
	
	/**
	 * 查询专户人数限制 
	 * @return 结果
	 */
	ISSpeciBuyLimitQueryOutput speciBuyLimitQuery(ISSpeciBuyLimitQueryInput inputParam);
	
	/**
	 * 专户基金详细信息查询 S060
	 * @return 结果
	 */
	ISSpeciFundInfoQueryOutput speciFundInfoQuery(ISSpeciFundInfoQueryInput inputParam);
	
	/**
	 * 验证码验证 
	 * @return 结果
	 */
	ISValidInfoValidOutput validInfoValid(ISValidInfoValidInput inputParam);
}
