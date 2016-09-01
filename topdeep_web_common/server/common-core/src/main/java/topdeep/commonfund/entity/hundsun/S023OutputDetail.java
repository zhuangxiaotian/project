package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * TA信息查询(S023)功能输出明细参数
 */
public class S023OutputDetail extends Object implements Serializable {
	
	/**
	 * ,不传sessionkey为空
	 */
	private String fundacco = "";
	
	/**
	 * 是否支持多交易账号,“1”支持，“0”不支持
	 */
	private String multitrade = "";
	
	/**
	 * 是否已经开通此TA,“1”已开通，“0”未开通，不传sessionkey为空
	 */
	private String open = "";
	
	/**
	 * TA代码,
	 */
	private String tacode = "";
	
	/**
	 * TA名称,
	 */
	private String taname = "";
	
	/**
	 * TA类型,0:恒生TA-V3.0 1:恒生TA-V1.2 2:恒生TA-银华版 3:恒生TA-3.2版 4:华夏TA 5:3.6版接口 6:3.7版接口 7:3.8版接口 A:3.71版接口 B:3.72版接口 C:3.81版接口 8:景顺接口 9:中登接口
	 */
	private String type = "";
	
	/**
	 * ,不传sessionkey为空
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * ,不传sessionkey为空
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 是否支持多交易账号,“1”支持，“0”不支持
	 */
	public String getMultitrade() {
		return this.multitrade;
	}
	
	/**
	 * 是否支持多交易账号,“1”支持，“0”不支持
	 */
	public void setMultitrade(String value)
	 {
		this.multitrade = value;
	}
	
	/**
	 * 是否已经开通此TA,“1”已开通，“0”未开通，不传sessionkey为空
	 */
	public String getOpen() {
		return this.open;
	}
	
	/**
	 * 是否已经开通此TA,“1”已开通，“0”未开通，不传sessionkey为空
	 */
	public void setOpen(String value)
	 {
		this.open = value;
	}
	
	/**
	 * TA代码,
	 */
	public String getTacode() {
		return this.tacode;
	}
	
	/**
	 * TA代码,
	 */
	public void setTacode(String value)
	 {
		this.tacode = value;
	}
	
	/**
	 * TA名称,
	 */
	public String getTaname() {
		return this.taname;
	}
	
	/**
	 * TA名称,
	 */
	public void setTaname(String value)
	 {
		this.taname = value;
	}
	
	/**
	 * TA类型,0:恒生TA-V3.0 1:恒生TA-V1.2 2:恒生TA-银华版 3:恒生TA-3.2版 4:华夏TA 5:3.6版接口 6:3.7版接口 7:3.8版接口 A:3.71版接口 B:3.72版接口 C:3.81版接口 8:景顺接口 9:中登接口
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * TA类型,0:恒生TA-V3.0 1:恒生TA-V1.2 2:恒生TA-银华版 3:恒生TA-3.2版 4:华夏TA 5:3.6版接口 6:3.7版接口 7:3.8版接口 A:3.71版接口 B:3.72版接口 C:3.81版接口 8:景顺接口 9:中登接口
	 */
	public void setType(String value)
	 {
		this.type = value;
	}
}
