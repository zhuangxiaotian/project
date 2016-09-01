/**
 * 
 */
package topdeep.commonfund.biz.ds.impl;

import topdeep.commonfund.entity.ds.def.DsBaseInput;
import topdeep.commonfund.entity.ds.def.DsBaseOutput;

/**
 * @author niexin
 *
 */
public class FundBizLogProxy extends DsBizBaseProxy {
	/**
	 * 处理输入对象
	 */
	protected void dealInput(DsBaseInput inputParam) {
		debugObject(inputParam);
	}

	/**
	 * 处理输出对象
	 */
	protected void dealOutput(DsBaseInput inputParam, DsBaseOutput outputParam) {
		outputParam.setZ_calltimes(inputParam.getZ_calltimes());
		outputParam.setZ_timestamp(inputParam.getZ_timestamp());
		debugObject(outputParam);
	}

}
