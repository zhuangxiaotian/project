package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 删除银行卡功能输入参数
 */
public class ISCardNoDelInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 银行卡号,
	 */
	private String cardNo;
	
	/**
	 * 银行卡唯一标识,
	 */
	private String id;
	
	public ISCardNoDelInput() {
		this.setZ_funcCode("u1H");
	}
	
	/**
	 * 银行卡号,
	 */
	public String getCardNo() {
		return this.cardNo;
	}
	
	/**
	 * 银行卡号,
	 */
	public void setCardNo(String value)
	 {
		this.cardNo = value;
	}
	
	/**
	 * 银行卡唯一标识,
	 */
	public String getId() {
		return this.id;
	}
	
	/**
	 * 银行卡唯一标识,
	 */
	public void setId(String value)
	 {
		this.id = value;
	}
}
