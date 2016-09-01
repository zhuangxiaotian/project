package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 生成银行开户签名数据(C002)
 */
public class C002Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 请求序列号,网上交易生成返回此序列号
	 */
	private String accoreqserial = "";
	
	/**
	 * 网银地址,form提交的url
	 */
	private String bankurl = "";
	
	/**
	 * 银行需要的编码,
	 */
	private String encoding = "";
	
	private List<C002OutputDetail> detail = new ArrayList<C002OutputDetail>();
	
	/**
	 * 请求序列号,网上交易生成返回此序列号
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 请求序列号,网上交易生成返回此序列号
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
	}
	
	/**
	 * 网银地址,form提交的url
	 */
	public String getBankurl() {
		return this.bankurl;
	}
	
	/**
	 * 网银地址,form提交的url
	 */
	public void setBankurl(String value)
	 {
		this.bankurl = value;
	}
	
	/**
	 * 银行需要的编码,
	 */
	public String getEncoding() {
		return this.encoding;
	}
	
	/**
	 * 银行需要的编码,
	 */
	public void setEncoding(String value)
	 {
		this.encoding = value;
	}
	
	public List<C002OutputDetail> getDetail() {
		return this.detail;
	}
	
}
