package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询支持开户的银行列表功能输出明细参数
 */
public class ISSupportOpenAccountBankListQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 支付渠道代码,
	 */
	private String paySeatNo;
	
	/**
	 * 银行代码,
	 */
	private String bankNo;
	
	/**
	 * 银行名称,
	 */
	private String bankName;
	
	/**
	 * 银行Logo,如果以http打头，表示网络地址,否则表示本地图片名称，如果找不到以默认图片代替
	 */
	private String bankLogo;
	
	/**
	 * 银行描述HTML,银行描述的html文本
	 */
	private String bankDescHtml;
	
	/**
	 * 支付渠道名称,
	 */
	private String paySeatName;
	
	/**
	 * 资金方式,
	 */
	private String finatype;
	
	/**
	 * 支付渠道代码,
	 */
	public String getPaySeatNo() {
		return this.paySeatNo;
	}
	
	/**
	 * 支付渠道代码,
	 */
	public void setPaySeatNo(String value)
	 {
		this.paySeatNo = value;
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
	 * 银行Logo,如果以http打头，表示网络地址,否则表示本地图片名称，如果找不到以默认图片代替
	 */
	public String getBankLogo() {
		return this.bankLogo;
	}
	
	/**
	 * 银行Logo,如果以http打头，表示网络地址,否则表示本地图片名称，如果找不到以默认图片代替
	 */
	public void setBankLogo(String value)
	 {
		this.bankLogo = value;
	}
	
	/**
	 * 银行描述HTML,银行描述的html文本
	 */
	public String getBankDescHtml() {
		return this.bankDescHtml;
	}
	
	/**
	 * 银行描述HTML,银行描述的html文本
	 */
	public void setBankDescHtml(String value)
	 {
		this.bankDescHtml = value;
	}
	
	/**
	 * 支付渠道名称,
	 */
	public String getPaySeatName() {
		return this.paySeatName;
	}
	
	/**
	 * 支付渠道名称,
	 */
	public void setPaySeatName(String value)
	 {
		this.paySeatName = value;
	}
	
	/**
	 * 资金方式,
	 */
	public String getFinatype() {
		return this.finatype;
	}
	
	/**
	 * 资金方式,
	 */
	public void setFinatype(String value)
	 {
		this.finatype = value;
	}
}
