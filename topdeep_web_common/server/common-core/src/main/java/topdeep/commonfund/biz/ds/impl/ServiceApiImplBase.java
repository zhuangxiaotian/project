package topdeep.commonfund.biz.ds.impl;

import topdeep.common.util.ApplicationContextHelper;
import topdeep.commonfund.entity.ds.def.DsBaseInput;
import topdeep.commonfund.entity.ds.def.DsBaseOutput;

public class ServiceApiImplBase {

	/**
	 * 商业密码，用来签名
	 */
	protected String merPassword = "test";

	protected org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ServiceApiImplBase.class);

	public String execute(String inputParam) {
		return null;
	}

	/**
	 * @param inputParam
	 * @return
	 */
	public String executeActionData(String inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param iNPUT_PARAM_ERROR
	 * @param string
	 * @return
	 */
	public DsBaseOutput getErrorOutput(String iNPUT_PARAM_ERROR, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	protected <I> I getDsBiz(Class<I> type, DsBaseInput inputParam, String funcCategoryName) {
		return (I) ApplicationContextHelper.getBean("dsFundBizLogProxy");
	}

}
