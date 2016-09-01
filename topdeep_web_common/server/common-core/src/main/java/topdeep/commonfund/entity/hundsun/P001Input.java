package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 读取字典项内容(P001)
 */
public class P001Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 字典项,祥见字典项说明
	 */
	private String dictname = "";
	
	/**
	 * 数据来源,DS：直销；DC：数据中心
	 */
	private String datasource = "";
	
	/**
	 * 字典key值,可以根据key值取指定的字典值
	 */
	private String key = "";
	
	/**
	 * 初始化参数
	 */
	public P001Input() {
		this.setFunction("P001");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 字典项,祥见字典项说明
	 */
	public String getDictname() {
		return this.dictname;
	}
	
	/**
	 * 字典项,祥见字典项说明
	 */
	public void setDictname(String value)
	 {
		this.dictname = value;
	}
	
	/**
	 * 数据来源,DS：直销；DC：数据中心
	 */
	public String getDatasource() {
		return this.datasource;
	}
	
	/**
	 * 数据来源,DS：直销；DC：数据中心
	 */
	public void setDatasource(String value)
	 {
		this.datasource = value;
	}
	
	/**
	 * 字典key值,可以根据key值取指定的字典值
	 */
	public String getKey() {
		return this.key;
	}
	
	/**
	 * 字典key值,可以根据key值取指定的字典值
	 */
	public void setKey(String value)
	 {
		this.key = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("dictname", this.dictname);
		inputMap.put("datasource", this.datasource);
		inputMap.put("key", this.key);
	}
}
