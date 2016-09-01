package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 获取可用的银行渠道(C001)
 */
public class C001Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 业务类型,根据开户还是增开等传入业务代码默认按开户处理，增开传OPENTRADEACCO，绑定银行卡BINDBANKCARD，变更银行卡CHANGEBANKCARD
	 */
	private String busitype = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public C001Input() {
		this.setFunction("C001");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	 * 交易账号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("busitype", this.busitype);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
