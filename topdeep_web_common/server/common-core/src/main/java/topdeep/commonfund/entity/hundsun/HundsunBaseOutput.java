/**
 * $Id$
 */
package topdeep.commonfund.entity.hundsun;

import common.util.param.PropertyAttribute;

/**
 * @author niexin
 *
 */
public class HundsunBaseOutput {
	
	/**
	 * code			S	11	0	Y	v1.0	返回码
	 */
	private String code;
	
	/**
	 * message			S	50	0	Y	v1.0	返回信息
	 */
	private String message;

	/**
	 * code			S	11	0	Y	v1.0	返回码
	 */
	@PropertyAttribute(Name="code", Type="S", Length=11, DecimalLength=0, NotNull=true)
	public String getCode() {
		return code;
	}

	/**
	 * code			S	11	0	Y	v1.0	返回码
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * message			S	50	0	Y	v1.0	返回信息
	 */
	@PropertyAttribute(Name="message", Type="S", Length=50, DecimalLength=0, NotNull=true)
	public String getMessage() {
		return message;
	}

	/**
	 * message			S	50	0	Y	v1.0	返回信息
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
