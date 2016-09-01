/**
 * 
 */
package topdeep.commonfund.biz.gateway.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import topdeep.commonfund.biz.ds.impl.DsDao;
import topdeep.commonfund.entity.ClientSession;
import topdeep.commonfund.entity.ds.def.DsBaseOutput;
import topdeep.commonfund.entity.gateway.FundGatewayErrorCode;
import topdeep.commonfund.entity.gateway.GatewayServiceException;
import topdeep.commonfund.entity.gateway.TradeServiceException;
import topdeep.commonfund.entity.gateway.def.ISBaseInput;
import topdeep.commonfund.entity.gateway.def.ISBaseOutput;

/**
 * @author niexin
 * 
 */
public class FundBizImplBase {

	/** Logger available to subclasses */
	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired(required = false)
	@Qualifier("sessionManage")
	protected SessionManage sessionManage;

	@Autowired(required = false)
	@Qualifier("fundBizImplCommon")
	protected FundBizImplCommon fundBizImplCommon;

	@Autowired(required = false)
	@Qualifier("dsDao")
	protected DsDao dsDao;

	protected ClientSession getSession(ISBaseInput inputParam) {
		return sessionManage.getClient(inputParam.getZ_sessionKey());
	}

	protected void checkOutput(ISBaseOutput output) throws Exception {
		if (!"0000".equals(output.getCode())) {
			throw new Exception(output.getMsg());
		}
	}

	protected void setSuccess(ISBaseOutput output) {
		setCodeMsg(output, FundGatewayErrorCode.SUCCESS, output.getMsg());
	}

	protected void setCodeMsg(ISBaseOutput output, String code, String msg) {
		output.setCode(code);
		output.setMsg(msg);
	}

	protected void setCodeMsg(DsBaseOutput output, String code, String msg) {
		output.setCode(code);
		output.setMsg(msg);
	}

	protected void setCodeMsg(ISBaseOutput output, Exception ex) {
		logger.error(ex.getMessage(), ex);
		if (ex instanceof GatewayServiceException) {
			GatewayServiceException gse = (GatewayServiceException) ex;
			output.setCode(gse.getErrorCode());
			output.setMsg(gse.getMessage());
		} else if (ex instanceof TradeServiceException) {
			TradeServiceException tse = (TradeServiceException) ex;
			output.setCode(FundGatewayErrorCode.TRADE_SERVICE_CALL_ERROR);
			output.setMsg(tse.getMessage());
			// output.setMsg(tse.getOrgErrorCode() + ":" + tse.getMessage());
		} else {
			output.setCode(FundGatewayErrorCode.SYSTEM_UNKNOWN_ERROR);
			output.setMsg(ex.getMessage());
		}
	}

}
