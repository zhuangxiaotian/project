package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 银联通SDK开户返回信息验证(B027)
 */
public class B027Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 银行返回数据,包含银行返回的所有字段信息的JSON格式字符串,并将整个字符串Base64编码后传入
	 */
	private String reqparams = "";
	
	/**
	 * 业务类型,根据开户还是增开等传入业务代码；开户OPENACCO，增开OPENTRADEACCO，绑定银行卡BINDBANKCARD，变更银行卡CHANGEBANKCARD
	 */
	private String busitype = "";
	
	/**
	 * 资金方式,调用通讯机4.0必传
	 */
	private String capitalmode = "";
	
	/**
	 * 初始化参数
	 */
	public B027Input() {
		this.setFunction("B027");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 银行返回数据,包含银行返回的所有字段信息的JSON格式字符串,并将整个字符串Base64编码后传入
	 */
	public String getReqparams() {
		return this.reqparams;
	}
	
	/**
	 * 银行返回数据,包含银行返回的所有字段信息的JSON格式字符串,并将整个字符串Base64编码后传入
	 */
	public void setReqparams(String value)
	 {
		this.reqparams = value;
	}
	
	/**
	 * 业务类型,根据开户还是增开等传入业务代码；开户OPENACCO，增开OPENTRADEACCO，绑定银行卡BINDBANKCARD，变更银行卡CHANGEBANKCARD
	 */
	public String getBusitype() {
		return this.busitype;
	}
	
	/**
	 * 业务类型,根据开户还是增开等传入业务代码；开户OPENACCO，增开OPENTRADEACCO，绑定银行卡BINDBANKCARD，变更银行卡CHANGEBANKCARD
	 */
	public void setBusitype(String value)
	 {
		this.busitype = value;
	}
	
	/**
	 * 资金方式,调用通讯机4.0必传
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,调用通讯机4.0必传
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("reqparams", this.reqparams);
		inputMap.put("busitype", this.busitype);
		inputMap.put("capitalmode", this.capitalmode);
	}
}
