package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 快速过户(T020)
 */
public class T020Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 交易账号,调用S001查询到的tradeacco
	 */
	private String tradeacco = "";
	
	/**
	 * 申请额度,
	 */
	private String applysum = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 费率折扣,
	 */
	private String discount = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 份额类别,取字典“份额类别”
	 */
	private String sharetype = "";
	
	/**
	 * 基金账号,调用S001查询到的fundacco
	 */
	private String fundacco = "";
	
	/**
	 * 银行账号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行编号,
	 */
	private String bankno = "";
	
	/**
	 * 理财平台流水号,通华理财平台传过来的申请编号
	 */
	private String chinapayserialno = "";
	
	/**
	 * 业务辅助代码,
	 */
	private String fixflag = "";
	
	/**
	 * 预检查标识,1:预检查 0或空:非预检查
	 */
	private String precheckflag = "";
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	private String tradepassword = "";
	
	/**
	 * 交易来源,
	 */
	private String tradesource = "";
	
	/**
	 * 垫资模式,1或空:直销垫资;0:代销垫资
	 */
	private String transfermoney = "";
	
	/**
	 * 过户方向,0:基金公司过户给投资人1:投资人过户给基金公司(非必填，默认是0)2：投资人过户给投资人
	 */
	private String transfertype = "";
	
	/**
	 * 目标基金账号,transfertype为2时比传
	 */
	private String targetfundacco = "";
	
	/**
	 * 目标交易账号,transfertype为2时比传
	 */
	private String targettradeacco = "";
	
	/**
	 * 取现用途,2-转账；3-还信用卡(transfermoney=1时有效)
	 */
	private String redeemuseflag = "";
	
	/**
	 * 目标基金账号,取现用途不为空时必传(transfermoney=1时有效)
	 */
	private String targetbankacco = "";
	
	/**
	 * 目标银行编号,取现用途不为空时必传(transfermoney=1时有效)
	 */
	private String targetbankno = "";
	
	/**
	 * 业务大类,超级现金宝：02
	 */
	private String busintype = "";
	
	/**
	 * 初始化参数
	 */
	public T020Input() {
		this.setFunction("T020");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 交易账号,调用S001查询到的tradeacco
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,调用S001查询到的tradeacco
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 申请额度,
	 */
	public String getApplysum() {
		return this.applysum;
	}
	
	/**
	 * 申请额度,
	 */
	public void setApplysum(String value)
	 {
		this.applysum = value;
	}
	
	/**
	 * 资金方式,
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 费率折扣,
	 */
	public String getDiscount() {
		return this.discount;
	}
	
	/**
	 * 费率折扣,
	 */
	public void setDiscount(String value)
	 {
		this.discount = value;
	}
	
	/**
	 * 基金代码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 份额类别,取字典“份额类别”
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类别,取字典“份额类别”
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 基金账号,调用S001查询到的fundacco
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,调用S001查询到的fundacco
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 银行账号,
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行账号,
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 银行编号,
	 */
	public String getBankno() {
		return this.bankno;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankno(String value)
	 {
		this.bankno = value;
	}
	
	/**
	 * 理财平台流水号,通华理财平台传过来的申请编号
	 */
	public String getChinapayserialno() {
		return this.chinapayserialno;
	}
	
	/**
	 * 理财平台流水号,通华理财平台传过来的申请编号
	 */
	public void setChinapayserialno(String value)
	 {
		this.chinapayserialno = value;
	}
	
	/**
	 * 业务辅助代码,
	 */
	public String getFixflag() {
		return this.fixflag;
	}
	
	/**
	 * 业务辅助代码,
	 */
	public void setFixflag(String value)
	 {
		this.fixflag = value;
	}
	
	/**
	 * 预检查标识,1:预检查 0或空:非预检查
	 */
	public String getPrecheckflag() {
		return this.precheckflag;
	}
	
	/**
	 * 预检查标识,1:预检查 0或空:非预检查
	 */
	public void setPrecheckflag(String value)
	 {
		this.precheckflag = value;
	}
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	/**
	 * 交易来源,
	 */
	public String getTradesource() {
		return this.tradesource;
	}
	
	/**
	 * 交易来源,
	 */
	public void setTradesource(String value)
	 {
		this.tradesource = value;
	}
	
	/**
	 * 垫资模式,1或空:直销垫资;0:代销垫资
	 */
	public String getTransfermoney() {
		return this.transfermoney;
	}
	
	/**
	 * 垫资模式,1或空:直销垫资;0:代销垫资
	 */
	public void setTransfermoney(String value)
	 {
		this.transfermoney = value;
	}
	
	/**
	 * 过户方向,0:基金公司过户给投资人1:投资人过户给基金公司(非必填，默认是0)2：投资人过户给投资人
	 */
	public String getTransfertype() {
		return this.transfertype;
	}
	
	/**
	 * 过户方向,0:基金公司过户给投资人1:投资人过户给基金公司(非必填，默认是0)2：投资人过户给投资人
	 */
	public void setTransfertype(String value)
	 {
		this.transfertype = value;
	}
	
	/**
	 * 目标基金账号,transfertype为2时比传
	 */
	public String getTargetfundacco() {
		return this.targetfundacco;
	}
	
	/**
	 * 目标基金账号,transfertype为2时比传
	 */
	public void setTargetfundacco(String value)
	 {
		this.targetfundacco = value;
	}
	
	/**
	 * 目标交易账号,transfertype为2时比传
	 */
	public String getTargettradeacco() {
		return this.targettradeacco;
	}
	
	/**
	 * 目标交易账号,transfertype为2时比传
	 */
	public void setTargettradeacco(String value)
	 {
		this.targettradeacco = value;
	}
	
	/**
	 * 取现用途,2-转账；3-还信用卡(transfermoney=1时有效)
	 */
	public String getRedeemuseflag() {
		return this.redeemuseflag;
	}
	
	/**
	 * 取现用途,2-转账；3-还信用卡(transfermoney=1时有效)
	 */
	public void setRedeemuseflag(String value)
	 {
		this.redeemuseflag = value;
	}
	
	/**
	 * 目标基金账号,取现用途不为空时必传(transfermoney=1时有效)
	 */
	public String getTargetbankacco() {
		return this.targetbankacco;
	}
	
	/**
	 * 目标基金账号,取现用途不为空时必传(transfermoney=1时有效)
	 */
	public void setTargetbankacco(String value)
	 {
		this.targetbankacco = value;
	}
	
	/**
	 * 目标银行编号,取现用途不为空时必传(transfermoney=1时有效)
	 */
	public String getTargetbankno() {
		return this.targetbankno;
	}
	
	/**
	 * 目标银行编号,取现用途不为空时必传(transfermoney=1时有效)
	 */
	public void setTargetbankno(String value)
	 {
		this.targetbankno = value;
	}
	
	/**
	 * 业务大类,超级现金宝：02
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,超级现金宝：02
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("applysum", this.applysum);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("discount", this.discount);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("bankacco", this.bankacco);
		inputMap.put("bankno", this.bankno);
		inputMap.put("chinapayserialno", this.chinapayserialno);
		inputMap.put("fixflag", this.fixflag);
		inputMap.put("precheckflag", this.precheckflag);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("tradesource", this.tradesource);
		inputMap.put("transfermoney", this.transfermoney);
		inputMap.put("transfertype", this.transfertype);
		inputMap.put("targetfundacco", this.targetfundacco);
		inputMap.put("targettradeacco", this.targettradeacco);
		inputMap.put("redeemuseflag", this.redeemuseflag);
		inputMap.put("targetbankacco", this.targetbankacco);
		inputMap.put("targetbankno", this.targetbankno);
		inputMap.put("busintype", this.busintype);
	}
}
