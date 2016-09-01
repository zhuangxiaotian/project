package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 经纪人信息查询(S087)
 */
public class S087Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 经纪人编号,
	 */
	private String broker = "";
	
	/**
	 * 经纪人名称,
	 */
	private String brokername = "";
	
	/**
	 * 交易来源,
	 */
	private String comefrom = "";
	
	/**
	 * 网点代码,
	 */
	private String netno = "";
	
	/**
	 * 经纪人类别,
	 */
	private String type = "";
	
	/**
	 * 初始化参数
	 */
	public S087Input() {
		this.setFunction("S087");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	 * 经纪人类别,
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * 经纪人类别,
	 */
	public void setType(String value)
	 {
		this.type = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("broker", this.broker);
		inputMap.put("brokername", this.brokername);
		inputMap.put("comefrom", this.comefrom);
		inputMap.put("netno", this.netno);
		inputMap.put("type", this.type);
	}
}
