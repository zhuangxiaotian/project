package topdeep.commonfund.biz.ds.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import topdeep.commonfund.biz.gateway.impl.SessionManage;
import topdeep.commonfund.entity.ds.def.DsBaseInput;
import topdeep.commonfund.entity.ds.def.DsBaseOutput;

import common.util.StringUtils;

import flexjson.JSONSerializer;

public class DsBizProxyBase {

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
	protected void dealInput(DsBaseInput inputParam) {
	}

	/**
	 * 处理输出对象
	 * 
	 * @throws Exception
	 */
	protected void dealOutput(DsBaseInput inputParam, DsBaseOutput outputParam) {

		// 如果直销的code不是0000 抛出异常
		// checkOutput(outputParam);
	}

	protected void checkOutput(DsBaseOutput output) throws Exception {
		if (!"0000".equals(output.getCode())) {
			throw new Exception(output.getMsg());
		}
	}

	protected String checkBaseInput(DsBaseInput inputParam) {
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

	protected boolean checkSession(DsBaseInput inputParam) {
		// TODO Auto-generated method stub
		return true;
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
