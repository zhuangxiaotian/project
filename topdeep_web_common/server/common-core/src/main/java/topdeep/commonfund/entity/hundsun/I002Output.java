package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 银行签约签名数据生成(I002)
 */
public class I002Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 唯一订单号,
	 */
	private String applyserial = "";
	
	/**
	 * 网银地址,form提交的url
	 */
	private String bankurl = "";
	
	/**
	 * 银行需要的编码,
	 */
	private String encoding = "";
	
	private List<I002OutputDetail> detail = new ArrayList<I002OutputDetail>();
	
	/**
	 * 唯一订单号,
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 唯一订单号,
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
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
	
	public List<I002OutputDetail> getDetail() {
		return this.detail;
	}
	
}
