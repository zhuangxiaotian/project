package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 净值定制功能输入参数
 */
public class ISNetValueCustomizeInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 定制的fundcode列表,格式，多个,号分隔：${fundcode1},${fundcode2},${fundcode3}
	 */
	private String mail;
	
	/**
	 * 定制的fundcode列表,格式，多个,号分隔：${fundcode1},${fundcode2},${fundcode3}
	 */
	private String sms;
	
	public ISNetValueCustomizeInput() {
		this.setZ_funcCode("u1o");
	}
	
	/**
	 * 定制的fundcode列表,格式，多个,号分隔：${fundcode1},${fundcode2},${fundcode3}
	 */
	public String getMail() {
		return this.mail;
	}
	
	/**
	 * 定制的fundcode列表,格式，多个,号分隔：${fundcode1},${fundcode2},${fundcode3}
	 */
	public void setMail(String value)
	 {
		this.mail = value;
	}
	
	/**
	 * 定制的fundcode列表,格式，多个,号分隔：${fundcode1},${fundcode2},${fundcode3}
	 */
	public String getSms() {
		return this.sms;
	}
	
	/**
	 * 定制的fundcode列表,格式，多个,号分隔：${fundcode1},${fundcode2},${fundcode3}
	 */
	public void setSms(String value)
	 {
		this.sms = value;
	}
}
