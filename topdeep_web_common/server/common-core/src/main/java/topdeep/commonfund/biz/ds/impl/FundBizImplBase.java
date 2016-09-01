package topdeep.commonfund.biz.ds.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import topdeep.commonfund.dao.hundsun.TradeDao;
import topdeep.commonfund.entity.ds.def.DsBaseOutput;
import topdeep.commonfund.entity.gateway.FundGatewayErrorCode;
import topdeep.commonfund.entity.gateway.GatewayServiceException;
import topdeep.commonfund.entity.hundsun.ServiceException;

public class FundBizImplBase {

	/** Logger available to subclasses */
	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired(required = false)
	protected TradeDao tradeDao;

	protected void checkOutput(DsBaseOutput output) throws Exception {
		if (!"0000".equals(output.getCode())) {
			throw new Exception(output.getMsg());
		}
	}

	protected void setSuccess(DsBaseOutput output) {
		setCodeMsg(output, FundGatewayErrorCode.SUCCESS, output.getMsg());
	}

	protected void setCodeMsg(DsBaseOutput output, String code, String msg) {
		output.setCode(code);
		output.setMsg(msg);
	}

	protected void setCodeMsg(DsBaseOutput output, Exception ex) {
		logger.error(ex.getMessage(), ex);
		if (ex instanceof GatewayServiceException) {
			GatewayServiceException gse = (GatewayServiceException) ex;
			output.setCode(gse.getErrorCode());
			output.setMsg(gse.getMessage());
		} else if (ex instanceof ServiceException) {
			ServiceException tse = (ServiceException) ex;
			output.setCode(FundGatewayErrorCode.TRADE_SERVICE_CALL_ERROR);
			output.setMsg(tse.getOrgErrorCode() + ":" + tse.getMessage());
		} else {
			output.setCode(FundGatewayErrorCode.SYSTEM_UNKNOWN_ERROR);
			output.setMsg(ex.getMessage());
		}
	}

}
