package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 银联通开户返回信息验证功能输入参数
 */
public class ISChinapaymobilebackverifyInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 银行返回数据,包含银行返回的所有字段信息的JSON格式字符串
	 */
	private String reqparams;
	
	/**
	 * 业务类型,根据开户还是增开等传入业务代码默认按开户处理，增开传OPENTRADEACCO，绑定银行卡BINDBANKCARD，变更银行卡CHANGEBANKCARD
	 */
	private String busitype;
	
	public ISChinapaymobilebackverifyInput() {
		this.setZ_funcCode("n1d");
	}
	
	/**
	 * 银行返回数据,包含银行返回的所有字段信息的JSON格式字符串
	 */
	public String getReqparams() {
		return this.reqparams;
	}
	
	/**
	 * 银行返回数据,包含银行返回的所有字段信息的JSON格式字符串
	 */
	public void setReqparams(String value)
	 {
		this.reqparams = value;
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
}
