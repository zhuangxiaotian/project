package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 获取登录信息(C039)
 */
public class C039Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 答对问题的比率,
	 */
	private String answercorrectratio = "";
	
	/**
	 * 当前登录日期,
	 */
	private String currDate = "";
	
	/**
	 * 当前登录时间,
	 */
	private String currTime = "";
	
	/**
	 * 客户编号,如果是数据中心数据，则为EQ+客户编号
	 */
	private String custNo = "";
	
	/**
	 * 密码保护错误次数,
	 */
	private String custpwproerror = "";
	
	/**
	 * 证件号输入错误次数,详见字典项说明（参考字典：年收入）
	 */
	private String idcardfailcount = "";
	
	/**
	 * 当前IP,详见字典项说明（参考字典：国籍代码）
	 */
	private String ip = "";
	
	/**
	 * 上次登录日期,
	 */
	private String lastDate = "";
	
	/**
	 * 上次登录IP,详见字典项说明（参考字典：对账单寄送方式）
	 */
	private String lastIp = "";
	
	/**
	 * 上次修改密码时间,
	 */
	private String lastModifyPwdTime = "";
	
	/**
	 * 上次验证密码保护时间,
	 */
	private String lastpwprotime = "";
	
	/**
	 * 上次服务器IP,详见字典项说明（参考字典：学历）
	 */
	private String lastServerIp = "";
	
	/**
	 * 上次服务器端口,
	 */
	private String lastServerPort = "";
	
	/**
	 * 上次浏览器session,
	 */
	private String lastSessionId = "";
	
	/**
	 * 上次登录日期,
	 */
	private String lastTime = "";
	
	/**
	 * 上次交易使用的交易账号,详见字典项说明（参考字典：职业）
	 */
	private String lastTradeAccoNo = "";
	
	/**
	 * 登录次数,
	 */
	private String logCount = "";
	
	/**
	 * 当前是否在线,
	 */
	private String online = "";
	
	/**
	 * 预留信息最后更新时间,
	 */
	private String reserveupdatetime = "";
	
	/**
	 * 开户预留信息,
	 */
	private String reservewords = "";
	
	/**
	 * 服务器IP,详见字典项说明（参考字典：对账单寄送途径）
	 */
	private String serverIp = "";
	
	/**
	 * 服务器端口,
	 */
	private String serverPort = "";
	
	/**
	 * 浏览器session,详见字典项说明（参考字典：婚姻）
	 */
	private String sessionId = "";
	
	/**
	 * 登陆首页业务提醒次数,
	 */
	private String showTipCount = "";
	
	/**
	 * 答对问题的比率,
	 */
	public String getAnswercorrectratio() {
		return this.answercorrectratio;
	}
	
	/**
	 * 答对问题的比率,
	 */
	public void setAnswercorrectratio(String value)
	 {
		this.answercorrectratio = value;
	}
	
	/**
	 * 当前登录日期,
	 */
	public String getCurrDate() {
		return this.currDate;
	}
	
	/**
	 * 当前登录日期,
	 */
	public void setCurrDate(String value)
	 {
		this.currDate = value;
	}
	
	/**
	 * 当前登录时间,
	 */
	public String getCurrTime() {
		return this.currTime;
	}
	
	/**
	 * 当前登录时间,
	 */
	public void setCurrTime(String value)
	 {
		this.currTime = value;
	}
	
	/**
	 * 客户编号,如果是数据中心数据，则为EQ+客户编号
	 */
	public String getCustNo() {
		return this.custNo;
	}
	
	/**
	 * 客户编号,如果是数据中心数据，则为EQ+客户编号
	 */
	public void setCustNo(String value)
	 {
		this.custNo = value;
	}
	
	/**
	 * 密码保护错误次数,
	 */
	public String getCustpwproerror() {
		return this.custpwproerror;
	}
	
	/**
	 * 密码保护错误次数,
	 */
	public void setCustpwproerror(String value)
	 {
		this.custpwproerror = value;
	}
	
	/**
	 * 证件号输入错误次数,详见字典项说明（参考字典：年收入）
	 */
	public String getIdcardfailcount() {
		return this.idcardfailcount;
	}
	
	/**
	 * 证件号输入错误次数,详见字典项说明（参考字典：年收入）
	 */
	public void setIdcardfailcount(String value)
	 {
		this.idcardfailcount = value;
	}
	
	/**
	 * 当前IP,详见字典项说明（参考字典：国籍代码）
	 */
	public String getIp() {
		return this.ip;
	}
	
	/**
	 * 当前IP,详见字典项说明（参考字典：国籍代码）
	 */
	public void setIp(String value)
	 {
		this.ip = value;
	}
	
	/**
	 * 上次登录日期,
	 */
	public String getLastDate() {
		return this.lastDate;
	}
	
	/**
	 * 上次登录日期,
	 */
	public void setLastDate(String value)
	 {
		this.lastDate = value;
	}
	
	/**
	 * 上次登录IP,详见字典项说明（参考字典：对账单寄送方式）
	 */
	public String getLastIp() {
		return this.lastIp;
	}
	
	/**
	 * 上次登录IP,详见字典项说明（参考字典：对账单寄送方式）
	 */
	public void setLastIp(String value)
	 {
		this.lastIp = value;
	}
	
	/**
	 * 上次修改密码时间,
	 */
	public String getLastModifyPwdTime() {
		return this.lastModifyPwdTime;
	}
	
	/**
	 * 上次修改密码时间,
	 */
	public void setLastModifyPwdTime(String value)
	 {
		this.lastModifyPwdTime = value;
	}
	
	/**
	 * 上次验证密码保护时间,
	 */
	public String getLastpwprotime() {
		return this.lastpwprotime;
	}
	
	/**
	 * 上次验证密码保护时间,
	 */
	public void setLastpwprotime(String value)
	 {
		this.lastpwprotime = value;
	}
	
	/**
	 * 上次服务器IP,详见字典项说明（参考字典：学历）
	 */
	public String getLastServerIp() {
		return this.lastServerIp;
	}
	
	/**
	 * 上次服务器IP,详见字典项说明（参考字典：学历）
	 */
	public void setLastServerIp(String value)
	 {
		this.lastServerIp = value;
	}
	
	/**
	 * 上次服务器端口,
	 */
	public String getLastServerPort() {
		return this.lastServerPort;
	}
	
	/**
	 * 上次服务器端口,
	 */
	public void setLastServerPort(String value)
	 {
		this.lastServerPort = value;
	}
	
	/**
	 * 上次浏览器session,
	 */
	public String getLastSessionId() {
		return this.lastSessionId;
	}
	
	/**
	 * 上次浏览器session,
	 */
	public void setLastSessionId(String value)
	 {
		this.lastSessionId = value;
	}
	
	/**
	 * 上次登录日期,
	 */
	public String getLastTime() {
		return this.lastTime;
	}
	
	/**
	 * 上次登录日期,
	 */
	public void setLastTime(String value)
	 {
		this.lastTime = value;
	}
	
	/**
	 * 上次交易使用的交易账号,详见字典项说明（参考字典：职业）
	 */
	public String getLastTradeAccoNo() {
		return this.lastTradeAccoNo;
	}
	
	/**
	 * 上次交易使用的交易账号,详见字典项说明（参考字典：职业）
	 */
	public void setLastTradeAccoNo(String value)
	 {
		this.lastTradeAccoNo = value;
	}
	
	/**
	 * 登录次数,
	 */
	public String getLogCount() {
		return this.logCount;
	}
	
	/**
	 * 登录次数,
	 */
	public void setLogCount(String value)
	 {
		this.logCount = value;
	}
	
	/**
	 * 当前是否在线,
	 */
	public String getOnline() {
		return this.online;
	}
	
	/**
	 * 当前是否在线,
	 */
	public void setOnline(String value)
	 {
		this.online = value;
	}
	
	/**
	 * 预留信息最后更新时间,
	 */
	public String getReserveupdatetime() {
		return this.reserveupdatetime;
	}
	
	/**
	 * 预留信息最后更新时间,
	 */
	public void setReserveupdatetime(String value)
	 {
		this.reserveupdatetime = value;
	}
	
	/**
	 * 开户预留信息,
	 */
	public String getReservewords() {
		return this.reservewords;
	}
	
	/**
	 * 开户预留信息,
	 */
	public void setReservewords(String value)
	 {
		this.reservewords = value;
	}
	
	/**
	 * 服务器IP,详见字典项说明（参考字典：对账单寄送途径）
	 */
	public String getServerIp() {
		return this.serverIp;
	}
	
	/**
	 * 服务器IP,详见字典项说明（参考字典：对账单寄送途径）
	 */
	public void setServerIp(String value)
	 {
		this.serverIp = value;
	}
	
	/**
	 * 服务器端口,
	 */
	public String getServerPort() {
		return this.serverPort;
	}
	
	/**
	 * 服务器端口,
	 */
	public void setServerPort(String value)
	 {
		this.serverPort = value;
	}
	
	/**
	 * 浏览器session,详见字典项说明（参考字典：婚姻）
	 */
	public String getSessionId() {
		return this.sessionId;
	}
	
	/**
	 * 浏览器session,详见字典项说明（参考字典：婚姻）
	 */
	public void setSessionId(String value)
	 {
		this.sessionId = value;
	}
	
	/**
	 * 登陆首页业务提醒次数,
	 */
	public String getShowTipCount() {
		return this.showTipCount;
	}
	
	/**
	 * 登陆首页业务提醒次数,
	 */
	public void setShowTipCount(String value)
	 {
		this.showTipCount = value;
	}
}
