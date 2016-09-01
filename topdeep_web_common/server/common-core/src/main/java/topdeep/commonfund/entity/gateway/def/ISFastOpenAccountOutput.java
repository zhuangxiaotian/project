package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 快速开户功能功能输出参数
 */
public class ISFastOpenAccountOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 开户标志,0 开户成功 非0表示流程 1 表示基本要素输入 2 表示需要验证短信 3 表示需要输入密码等关键信息 4 需要到银行进行验证 5 表示需要输入扩展信息 6 显示开户结果
	 */
	private String openResult;
	
	/**
	 * 发送的验证码的序列号,
	 */
	private String validCodeSeqId;
	
	/**
	 * 基金账号,快速开户成功后返回的基金账号
	 */
	private String fundAccount;
	
	/**
	 * 银行验证页面的URL,提交到银行页面需要的URL
	 */
	private String bankUrl;
	
	public ISFastOpenAccountOutput() {
		this.setZ_funcCode("n0q");
	}
	
	/**
	 * 开户标志,0 开户成功 非0表示流程 1 表示基本要素输入 2 表示需要验证短信 3 表示需要输入密码等关键信息 4 需要到银行进行验证 5 表示需要输入扩展信息 6 显示开户结果
	 */
	public String getOpenResult() {
		return this.openResult;
	}
	
	/**
	 * 开户标志,0 开户成功 非0表示流程 1 表示基本要素输入 2 表示需要验证短信 3 表示需要输入密码等关键信息 4 需要到银行进行验证 5 表示需要输入扩展信息 6 显示开户结果
	 */
	public void setOpenResult(String value)
	 {
		this.openResult = value;
	}
	
	/**
	 * 发送的验证码的序列号,
	 */
	public String getValidCodeSeqId() {
		return this.validCodeSeqId;
	}
	
	/**
	 * 发送的验证码的序列号,
	 */
	public void setValidCodeSeqId(String value)
	 {
		this.validCodeSeqId = value;
	}
	
	/**
	 * 基金账号,快速开户成功后返回的基金账号
	 */
	public String getFundAccount() {
		return this.fundAccount;
	}
	
	/**
	 * 基金账号,快速开户成功后返回的基金账号
	 */
	public void setFundAccount(String value)
	 {
		this.fundAccount = value;
	}
	
	/**
	 * 银行验证页面的URL,提交到银行页面需要的URL
	 */
	public String getBankUrl() {
		return this.bankUrl;
	}
	
	/**
	 * 银行验证页面的URL,提交到银行页面需要的URL
	 */
	public void setBankUrl(String value)
	 {
		this.bankUrl = value;
	}
}
