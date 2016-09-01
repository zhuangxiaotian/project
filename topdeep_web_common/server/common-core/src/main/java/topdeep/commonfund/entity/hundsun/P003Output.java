package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 登录系统(P003)
 */
public class P003Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 返回用户角色值,
	 */
	private Double roleValue;
	
	/**
	 * sessionkey，成功时返回,
	 */
	private String sessionkey = "";
	
	/**
	 * 密码强制修改,0:不需要修改，1修改交易密码，2修改查询密码，3修改交易和查询密码
	 */
	private Integer modifyPassword;
	
	/**
	 * 返回角色字符串,
	 */
	private String originalString = "";
	
	/**
	 * 是否开通e通宝,1开通，其他-未开通
	 */
	private String emoneyfundflag = "";
	
	/**
	 * 返回用户角色值,
	 */
	public Double getRoleValue() {
		return this.roleValue;
	}
	
	/**
	 * 返回用户角色值,
	 */
	public void setRoleValue(Double value)
	 {
		this.roleValue = value;
	}
	
	/**
	 * sessionkey，成功时返回,
	 */
	public String getSessionkey() {
		return this.sessionkey;
	}
	
	/**
	 * sessionkey，成功时返回,
	 */
	public void setSessionkey(String value)
	 {
		this.sessionkey = value;
	}
	
	/**
	 * 密码强制修改,0:不需要修改，1修改交易密码，2修改查询密码，3修改交易和查询密码
	 */
	public Integer getModifyPassword() {
		return this.modifyPassword;
	}
	
	/**
	 * 密码强制修改,0:不需要修改，1修改交易密码，2修改查询密码，3修改交易和查询密码
	 */
	public void setModifyPassword(Integer value)
	 {
		this.modifyPassword = value;
	}
	
	/**
	 * 返回角色字符串,
	 */
	public String getOriginalString() {
		return this.originalString;
	}
	
	/**
	 * 返回角色字符串,
	 */
	public void setOriginalString(String value)
	 {
		this.originalString = value;
	}
	
	/**
	 * 是否开通e通宝,1开通，其他-未开通
	 */
	public String getEmoneyfundflag() {
		return this.emoneyfundflag;
	}
	
	/**
	 * 是否开通e通宝,1开通，其他-未开通
	 */
	public void setEmoneyfundflag(String value)
	 {
		this.emoneyfundflag = value;
	}
}
