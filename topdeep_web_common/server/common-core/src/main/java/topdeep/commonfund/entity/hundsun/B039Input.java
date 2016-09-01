package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 联行号查询(B039)
 */
public class B039Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 银行编号,
	 */
	private String bankno = "";
	
	/**
	 * 城市名称,
	 */
	private String cityname = "";
	
	/**
	 * 省份名称,
	 */
	private String provincename = "";
	
	/**
	 * 初始化参数
	 */
	public B039Input() {
		this.setFunction("B039");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	 * 城市名称,
	 */
	public String getCityname() {
		return this.cityname;
	}
	
	/**
	 * 城市名称,
	 */
	public void setCityname(String value)
	 {
		this.cityname = value;
	}
	
	/**
	 * 省份名称,
	 */
	public String getProvincename() {
		return this.provincename;
	}
	
	/**
	 * 省份名称,
	 */
	public void setProvincename(String value)
	 {
		this.provincename = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("bankno", this.bankno);
		inputMap.put("cityname", this.cityname);
		inputMap.put("provincename", this.provincename);
	}
}
