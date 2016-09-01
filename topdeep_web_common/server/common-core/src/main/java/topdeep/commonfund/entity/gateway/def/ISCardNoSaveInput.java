package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 保存银行卡功能输入参数
 */
public class ISCardNoSaveInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 银行代码,
	 */
	private String bankNo;
	
	/**
	 * 银行卡号,
	 */
	private String cardNo;
	
	/**
	 * 银行名称,
	 */
	private String bankName;
	
	/**
	 * 开通收付款(1 开通 2 不开通),
	 */
	private String openPay;
	
	/**
	 * 唯一标识(为空时新增,不为空修改),
	 */
	private String bankId;
	
	public ISCardNoSaveInput() {
		this.setZ_funcCode("u1J");
	}
	
	/**
	 * 银行代码,
	 */
	public String getBankNo() {
		return this.bankNo;
	}
	
	/**
	 * 银行代码,
	 */
	public void setBankNo(String value)
	 {
		this.bankNo = value;
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
	 * 银行名称,
	 */
	public String getBankName() {
		return this.bankName;
	}
	
	/**
	 * 银行名称,
	 */
	public void setBankName(String value)
	 {
		this.bankName = value;
	}
	
	/**
	 * 开通收付款(1 开通 2 不开通),
	 */
	public String getOpenPay() {
		return this.openPay;
	}
	
	/**
	 * 开通收付款(1 开通 2 不开通),
	 */
	public void setOpenPay(String value)
	 {
		this.openPay = value;
	}
	
	/**
	 * 唯一标识(为空时新增,不为空修改),
	 */
	public String getBankId() {
		return this.bankId;
	}
	
	/**
	 * 唯一标识(为空时新增,不为空修改),
	 */
	public void setBankId(String value)
	 {
		this.bankId = value;
	}
}
