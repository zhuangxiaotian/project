package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 定投赎回协议变更(I011)
 */
public class I011Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 协议号,
	 */
	private String xyh = "";
	
	/**
	 * 业务代码,当信用卡还款时传095 980：快速还贷协议修改; 981：快速还贷协议取消
	 */
	private String businflag = "";
	
	/**
	 * 协议周期单位,参考系统DQDEZQ，0:月，1:周，2:日，3:年
	 */
	private String cycleunit = "";
	
	/**
	 * 巨额赎回标志,"0":"放弃超额部分"--"1":"继续赎回"
	 */
	private String exceedflag = "";
	
	/**
	 * 交易日期,应该在1~28之间，如果首次交易日期传000000则由系统生成
	 */
	private String jyrq = "";
	
	/**
	 * 交易周期,
	 */
	private String jyzq = "";
	
	/**
	 * 申请份额,不能小于等于0
	 */
	private String requestshare = "";
	
	/**
	 * 协议状态,"A":启用,"P":暂停,"H":终止信用卡还款只能修改此项，其余非必填项传值无效
	 */
	private String state = "";
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	private String tradepassword = "";
	
	/**
	 * 协议别名,需要打开系统参数ZDYXYBM
	 */
	private String xybm = "";
	
	/**
	 * 终止日期,格式为yyyyMMdd,不传默认为99991231
	 */
	private String zzrq = "";
	
	/**
	 * 初始化参数
	 */
	public I011Input() {
		this.setFunction("I011");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	
	/**
	 * 协议号,
	 */
	public String getXyh() {
		return this.xyh;
	}
	
	/**
	 * 协议号,
	 */
	public void setXyh(String value)
	 {
		this.xyh = value;
	}
	
	/**
	 * 业务代码,当信用卡还款时传095 980：快速还贷协议修改; 981：快速还贷协议取消
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,当信用卡还款时传095 980：快速还贷协议修改; 981：快速还贷协议取消
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 协议周期单位,参考系统DQDEZQ，0:月，1:周，2:日，3:年
	 */
	public String getCycleunit() {
		return this.cycleunit;
	}
	
	/**
	 * 协议周期单位,参考系统DQDEZQ，0:月，1:周，2:日，3:年
	 */
	public void setCycleunit(String value)
	 {
		this.cycleunit = value;
	}
	
	/**
	 * 巨额赎回标志,"0":"放弃超额部分"--"1":"继续赎回"
	 */
	public String getExceedflag() {
		return this.exceedflag;
	}
	
	/**
	 * 巨额赎回标志,"0":"放弃超额部分"--"1":"继续赎回"
	 */
	public void setExceedflag(String value)
	 {
		this.exceedflag = value;
	}
	
	/**
	 * 交易日期,应该在1~28之间，如果首次交易日期传000000则由系统生成
	 */
	public String getJyrq() {
		return this.jyrq;
	}
	
	/**
	 * 交易日期,应该在1~28之间，如果首次交易日期传000000则由系统生成
	 */
	public void setJyrq(String value)
	 {
		this.jyrq = value;
	}
	
	/**
	 * 交易周期,
	 */
	public String getJyzq() {
		return this.jyzq;
	}
	
	/**
	 * 交易周期,
	 */
	public void setJyzq(String value)
	 {
		this.jyzq = value;
	}
	
	/**
	 * 申请份额,不能小于等于0
	 */
	public String getRequestshare() {
		return this.requestshare;
	}
	
	/**
	 * 申请份额,不能小于等于0
	 */
	public void setRequestshare(String value)
	 {
		this.requestshare = value;
	}
	
	/**
	 * 协议状态,"A":启用,"P":暂停,"H":终止信用卡还款只能修改此项，其余非必填项传值无效
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 协议状态,"A":启用,"P":暂停,"H":终止信用卡还款只能修改此项，其余非必填项传值无效
	 */
	public void setState(String value)
	 {
		this.state = value;
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
	 * 协议别名,需要打开系统参数ZDYXYBM
	 */
	public String getXybm() {
		return this.xybm;
	}
	
	/**
	 * 协议别名,需要打开系统参数ZDYXYBM
	 */
	public void setXybm(String value)
	 {
		this.xybm = value;
	}
	
	/**
	 * 终止日期,格式为yyyyMMdd,不传默认为99991231
	 */
	public String getZzrq() {
		return this.zzrq;
	}
	
	/**
	 * 终止日期,格式为yyyyMMdd,不传默认为99991231
	 */
	public void setZzrq(String value)
	 {
		this.zzrq = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("xyh", this.xyh);
		inputMap.put("businflag", this.businflag);
		inputMap.put("cycleunit", this.cycleunit);
		inputMap.put("exceedflag", this.exceedflag);
		inputMap.put("jyrq", this.jyrq);
		inputMap.put("jyzq", this.jyzq);
		inputMap.put("requestshare", this.requestshare);
		inputMap.put("state", this.state);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("xybm", this.xybm);
		inputMap.put("zzrq", this.zzrq);
	}
}
