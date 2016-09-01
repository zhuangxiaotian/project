package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 发送验证信息接口功能输入参数
 */
public class ISValidInfoSendInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 通道类型,0短信1邮件2微信3易信…
	 */
	private String channelType;
	
	/**
	 * 目标标识,例如身份证号，客户编号等
	 */
	private String targetIdentity;
	
	/**
	 * 信息类型,
	 */
	private String infoType;
	
	/**
	 * 发送类型,目前填3
	 */
	private String sendType;
	
	/**
	 * 发送目标,
	 */
	private String target;
	
	/**
	 * 发送内容,
	 */
	private String content;
	
	/**
	 * 证件号码,
	 */
	private String idNo;
	
	/**
	 * 证件类型,
	 */
	private String idType;
	
	/**
	 * 银行卡号,
	 */
	private String bankAccount;
	
	/**
	 * 渠道，资金方式,
	 */
	private String payseatNo;
	
	/**
	 * 银行编号,
	 */
	private String bankNo;
	
	/**
	 * 客户姓名,
	 */
	private String custName;
	
	public ISValidInfoSendInput() {
		this.setZ_funcCode("n0v");
	}
	
	/**
	 * 通道类型,0短信1邮件2微信3易信…
	 */
	public String getChannelType() {
		return this.channelType;
	}
	
	/**
	 * 通道类型,0短信1邮件2微信3易信…
	 */
	public void setChannelType(String value)
	 {
		this.channelType = value;
	}
	
	/**
	 * 目标标识,例如身份证号，客户编号等
	 */
	public String getTargetIdentity() {
		return this.targetIdentity;
	}
	
	/**
	 * 目标标识,例如身份证号，客户编号等
	 */
	public void setTargetIdentity(String value)
	 {
		this.targetIdentity = value;
	}
	
	/**
	 * 信息类型,
	 */
	public String getInfoType() {
		return this.infoType;
	}
	
	/**
	 * 信息类型,
	 */
	public void setInfoType(String value)
	 {
		this.infoType = value;
	}
	
	/**
	 * 发送类型,目前填3
	 */
	public String getSendType() {
		return this.sendType;
	}
	
	/**
	 * 发送类型,目前填3
	 */
	public void setSendType(String value)
	 {
		this.sendType = value;
	}
	
	/**
	 * 发送目标,
	 */
	public String getTarget() {
		return this.target;
	}
	
	/**
	 * 发送目标,
	 */
	public void setTarget(String value)
	 {
		this.target = value;
	}
	
	/**
	 * 发送内容,
	 */
	public String getContent() {
		return this.content;
	}
	
	/**
	 * 发送内容,
	 */
	public void setContent(String value)
	 {
		this.content = value;
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdNo() {
		return this.idNo;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdNo(String value)
	 {
		this.idNo = value;
	}
	
	/**
	 * 证件类型,
	 */
	public String getIdType() {
		return this.idType;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdType(String value)
	 {
		this.idType = value;
	}
	
	/**
	 * 银行卡号,
	 */
	public String getBankAccount() {
		return this.bankAccount;
	}
	
	/**
	 * 银行卡号,
	 */
	public void setBankAccount(String value)
	 {
		this.bankAccount = value;
	}
	
	/**
	 * 渠道，资金方式,
	 */
	public String getPayseatNo() {
		return this.payseatNo;
	}
	
	/**
	 * 渠道，资金方式,
	 */
	public void setPayseatNo(String value)
	 {
		this.payseatNo = value;
	}
	
	/**
	 * 银行编号,
	 */
	public String getBankNo() {
		return this.bankNo;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankNo(String value)
	 {
		this.bankNo = value;
	}
	
	/**
	 * 客户姓名,
	 */
	public String getCustName() {
		return this.custName;
	}
	
	/**
	 * 客户姓名,
	 */
	public void setCustName(String value)
	 {
		this.custName = value;
	}
}
