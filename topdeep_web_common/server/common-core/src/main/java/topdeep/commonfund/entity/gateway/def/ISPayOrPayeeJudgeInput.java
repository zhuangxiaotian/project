package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 判断当前用户的收付款开通情况功能输入参数
 */
public class ISPayOrPayeeJudgeInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 1收款2付款,
	 */
	private String payType;
	
	public ISPayOrPayeeJudgeInput() {
		this.setZ_funcCode("m0l");
	}
	
	/**
	 * 1收款2付款,
	 */
	public String getPayType() {
		return this.payType;
	}
	
	/**
	 * 1收款2付款,
	 */
	public void setPayType(String value)
	 {
		this.payType = value;
	}
}
