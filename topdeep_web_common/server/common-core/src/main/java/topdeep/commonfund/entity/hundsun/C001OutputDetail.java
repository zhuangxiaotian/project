package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 获取可用的银行渠道(C001)功能输出明细参数
 */
public class C001OutputDetail extends Object implements Serializable {
	
	/**
	 * 银行别名,
	 */
	private String alias = "";
	
	/**
	 * 银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 资金方式,A:农行 B:建行 G:招行 J:民生 C:交行 3:银联（参考字典：资金方式）
	 */
	private String capitalmode = "";
	
	/**
	 * 是否支持密码重置,suprestpwd:1支持 0不支持
	 */
	private String suprestpwd = "";
	
	/**
	 * 银行编号,若此处有返回银行编号则生成银行签名中此编号必传
	 */
	private String bankserial = "";
	
	/**
	 * 资金方式前缀,银联资金方式开户方式分http与socket
	 */
	private String capitalmode_prefix = "";
	
	/**
	 * 银行别名,
	 */
	public String getAlias() {
		return this.alias;
	}
	
	/**
	 * 银行别名,
	 */
	public void setAlias(String value)
	 {
		this.alias = value;
	}
	
	/**
	 * 银行名称,
	 */
	public String getBankname() {
		return this.bankname;
	}
	
	/**
	 * 银行名称,
	 */
	public void setBankname(String value)
	 {
		this.bankname = value;
	}
	
	/**
	 * 资金方式,A:农行 B:建行 G:招行 J:民生 C:交行 3:银联（参考字典：资金方式）
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,A:农行 B:建行 G:招行 J:民生 C:交行 3:银联（参考字典：资金方式）
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 是否支持密码重置,suprestpwd:1支持 0不支持
	 */
	public String getSuprestpwd() {
		return this.suprestpwd;
	}
	
	/**
	 * 是否支持密码重置,suprestpwd:1支持 0不支持
	 */
	public void setSuprestpwd(String value)
	 {
		this.suprestpwd = value;
	}
	
	/**
	 * 银行编号,若此处有返回银行编号则生成银行签名中此编号必传
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编号,若此处有返回银行编号则生成银行签名中此编号必传
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
	}
	
	/**
	 * 资金方式前缀,银联资金方式开户方式分http与socket
	 */
	public String getCapitalmode_prefix() {
		return this.capitalmode_prefix;
	}
	
	/**
	 * 资金方式前缀,银联资金方式开户方式分http与socket
	 */
	public void setCapitalmode_prefix(String value)
	 {
		this.capitalmode_prefix = value;
	}
}
