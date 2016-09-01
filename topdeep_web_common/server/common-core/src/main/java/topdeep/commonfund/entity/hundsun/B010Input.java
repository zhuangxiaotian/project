package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 易宝渠道老客户签约(B010)
 */
public class B010Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 银行卡号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 银行卡户名,
	 */
	private String custname = "";
	
	/**
	 * 银行证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 银行证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 业务类型,根据开户还是增开等传入业务代码默认按开户处理，增开传OPENTRADEACCO，绑定银行卡BINDBANKCARD，变更银行卡CHANGEBANKCARD
	 */
	private String busitype = "";
	
	/**
	 * 联行号,取值请参考易宝文档
	 */
	private String branchbank = "";
	
	/**
	 * 初始化参数
	 */
	public B010Input() {
		this.setFunction("B010");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 银行卡号,
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行卡号,
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 银行编号,
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
	}
	
	/**
	 * 银行卡户名,
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 银行卡户名,
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
	}
	
	/**
	 * 银行证件号码,
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 银行证件号码,
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 银行证件类型,
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 银行证件类型,
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 业务类型,根据开户还是增开等传入业务代码默认按开户处理，增开传OPENTRADEACCO，绑定银行卡BINDBANKCARD，变更银行卡CHANGEBANKCARD
	 */
	public String getBusitype() {
		return this.busitype;
	}
	
	/**
	 * 业务类型,根据开户还是增开等传入业务代码默认按开户处理，增开传OPENTRADEACCO，绑定银行卡BINDBANKCARD，变更银行卡CHANGEBANKCARD
	 */
	public void setBusitype(String value)
	 {
		this.busitype = value;
	}
	
	/**
	 * 联行号,取值请参考易宝文档
	 */
	public String getBranchbank() {
		return this.branchbank;
	}
	
	/**
	 * 联行号,取值请参考易宝文档
	 */
	public void setBranchbank(String value)
	 {
		this.branchbank = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("bankacco", this.bankacco);
		inputMap.put("bankserial", this.bankserial);
		inputMap.put("custname", this.custname);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("busitype", this.busitype);
		inputMap.put("branchbank", this.branchbank);
	}
}
