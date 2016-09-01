/**
 * 
 */
package topdeep.commonfund.biz.gateway.impl;

import topdeep.commonfund.entity.gateway.def.ISBaseInput;
import topdeep.commonfund.entity.gateway.def.ISBaseOutput;

/**
 * @author niexin
 *
 */
public class FundBizLogProxy extends FundBizBaseProxy {
	/**
	 * 处理输入对象
	 */
	protected void dealInput(ISBaseInput inputParam) {
		debugObject(inputParam);
	}

	/**
	 * 处理输出对象
	 */
	protected void dealOutput(ISBaseInput inputParam, ISBaseOutput outputParam) {
		outputParam.setZ_calltimes(inputParam.getZ_calltimes());
		outputParam.setZ_timestamp(inputParam.getZ_timestamp());
		debugObject(outputParam);
	}

}
