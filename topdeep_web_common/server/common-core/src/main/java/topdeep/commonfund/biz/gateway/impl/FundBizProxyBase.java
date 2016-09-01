/**
 * 
 */
package topdeep.commonfund.biz.gateway.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import topdeep.commonfund.entity.ClientSession;
import topdeep.commonfund.entity.gateway.def.ISBaseInput;
import topdeep.commonfund.entity.gateway.def.ISBaseOutput;

import common.util.StringUtils;

import flexjson.JSONSerializer;

/**
 * @author niexin
 *
 */
public class FundBizProxyBase {

	protected Log logger = LogFactory.getLog(getClass());

	/**
	 * 是否进行参数的检验
	 */
	@Value("#{application['checkBaseInput']?:true}")
	private boolean checkBaseInput;

	@Autowired
	@Qualifier("sessionManage")
	protected SessionManage sessionManage;

	/**
	 * 处理输入对象
	 */
	protected void dealInput(ISBaseInput inputParam) {
	}

	/**
	 * 处理输出对象
	 */
	protected void dealOutput(ISBaseInput inputParam, ISBaseOutput outputParam) {
	}

	protected boolean checkSession(ISBaseInput inputParam) {
		if ("b02".equals(inputParam.getZ_funcCode())) {
			return true;
		} else if ("b04".equals(inputParam.getZ_funcCode())) {
			return true;
		} else if (inputParam.getZ_funcCode().startsWith("n")) {
			return true;
		}
		if (StringUtils.isNullOrEmpty(inputParam.getZ_sessionKey())) {
			return false;
		} else {
			ClientSession session = sessionManage.getClient(inputParam.getZ_sessionKey());
			if (session == null) {
				return false;
			} else {
				return true;
			}
		}
	}

	protected String checkBaseInput(ISBaseInput inputParam) {
		String errorMsg = "";
		if (checkBaseInput) {
			// if (StringUtils.isNullOrEmpty(inputParam.getZ_funcVersion())) {
			// errorMsg = (errorMsg + "缺少参数版本编号;");
			// }
			if (StringUtils.isNullOrEmpty(inputParam.getZ_funcCode())) {
				errorMsg = (errorMsg + "缺少参数功能编号;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getZ_tradeType())) {
				errorMsg = (errorMsg + "缺少参数交易方式;");
			}
			// if (StringUtils.isNullOrEmpty(inputParam.getZ_commerceId())) {
			// errorMsg = (errorMsg + "缺少参数商业标识;");
			// }
		}
		return errorMsg;
	}

	protected void debugObject(Object obj) {
		String out = new JSONSerializer().exclude("*.class").exclude("z_password").exclude("password").exclude("loginPassowrd").exclude("theOldPassword")
				.exclude("newpwd").exclude("theNewPassword").deepSerialize(obj);
		;
		logger.debug("\n" + out);
	}

	/**
	 * @return the checkBaseInput
	 */
	public boolean isCheckBaseInput() {
		return checkBaseInput;
	}

	/**
	 * @param checkBaseInput the checkBaseInput to set
	 */
	public void setCheckBaseInput(boolean checkBaseInput) {
		this.checkBaseInput = checkBaseInput;
	}

}
