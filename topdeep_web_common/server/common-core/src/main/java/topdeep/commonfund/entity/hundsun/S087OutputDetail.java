package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 经纪人信息查询(S087)功能输出明细参数
 */
public class S087OutputDetail extends Object implements Serializable {
	
	/**
	 * 经纪人业绩分成比例,
	 */
	private String achievescale = "";
	
	/**
	 * 经纪人编号,
	 */
	private String broker = "";
	
	/**
	 * 经纪人名称,
	 */
	private String brokername = "";
	
	/**
	 * 经纪人类别,
	 */
	private String brokertype = "";
	
	/**
	 * 交易来源,
	 */
	private String comefrom = "";
	
	/**
	 * 网点代码,
	 */
	private String netno = "";
	
	/**
	 * 电话号码,
	 */
	private String phone = "";
	
	/**
	 * 销售资格标识,
	 */
	private String qualification = "";
	
	/**
	 * 资质证明编号,
	 */
	private String qualifictaionno = "";
	
	/**
	 * 经纪人业绩分成比例,
	 */
	public String getAchievescale() {
		return this.achievescale;
	}
	
	/**
	 * 经纪人业绩分成比例,
	 */
	public void setAchievescale(String value)
	 {
		this.achievescale = value;
	}
	
	/**
	 * 经纪人编号,
	 */
	public String getBroker() {
		return this.broker;
	}
	
	/**
	 * 经纪人编号,
	 */
	public void setBroker(String value)
	 {
		this.broker = value;
	}
	
	/**
	 * 经纪人名称,
	 */
	public String getBrokername() {
		return this.brokername;
	}
	
	/**
	 * 经纪人名称,
	 */
	public void setBrokername(String value)
	 {
		this.brokername = value;
	}
	
	/**
	 * 经纪人类别,
	 */
	public String getBrokertype() {
		return this.brokertype;
	}
	
	/**
	 * 经纪人类别,
	 */
	public void setBrokertype(String value)
	 {
		this.brokertype = value;
	}
	
	/**
	 * 交易来源,
	 */
	public String getComefrom() {
		return this.comefrom;
	}
	
	/**
	 * 交易来源,
	 */
	public void setComefrom(String value)
	 {
		this.comefrom = value;
	}
	
	/**
	 * 网点代码,
	 */
	public String getNetno() {
		return this.netno;
	}
	
	/**
	 * 网点代码,
	 */
	public void setNetno(String value)
	 {
		this.netno = value;
	}
	
	/**
	 * 电话号码,
	 */
	public String getPhone() {
		return this.phone;
	}
	
	/**
	 * 电话号码,
	 */
	public void setPhone(String value)
	 {
		this.phone = value;
	}
	
	/**
	 * 销售资格标识,
	 */
	public String getQualification() {
		return this.qualification;
	}
	
	/**
	 * 销售资格标识,
	 */
	public void setQualification(String value)
	 {
		this.qualification = value;
	}
	
	/**
	 * 资质证明编号,
	 */
	public String getQualifictaionno() {
		return this.qualifictaionno;
	}
	
	/**
	 * 资质证明编号,
	 */
	public void setQualifictaionno(String value)
	 {
		this.qualifictaionno = value;
	}
}
