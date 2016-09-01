package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 批量交易文件上传通知(T021)
 */
public class T021Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 接口类型,1:理财平台通知自动处理2:操作员前台手工处理
	 */
	private String interfacetype = "";
	
	/**
	 * 文件总金额,
	 */
	private String totalamount = "";
	
	/**
	 * 文件总记录数,
	 */
	private String totalcount = "";
	
	/**
	 * 初始化参数
	 */
	public T021Input() {
		this.setFunction("T021");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 接口类型,1:理财平台通知自动处理2:操作员前台手工处理
	 */
	public String getInterfacetype() {
		return this.interfacetype;
	}
	
	/**
	 * 接口类型,1:理财平台通知自动处理2:操作员前台手工处理
	 */
	public void setInterfacetype(String value)
	 {
		this.interfacetype = value;
	}
	
	/**
	 * 文件总金额,
	 */
	public String getTotalamount() {
		return this.totalamount;
	}
	
	/**
	 * 文件总金额,
	 */
	public void setTotalamount(String value)
	 {
		this.totalamount = value;
	}
	
	/**
	 * 文件总记录数,
	 */
	public String getTotalcount() {
		return this.totalcount;
	}
	
	/**
	 * 文件总记录数,
	 */
	public void setTotalcount(String value)
	 {
		this.totalcount = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("interfacetype", this.interfacetype);
		inputMap.put("totalamount", this.totalamount);
		inputMap.put("totalcount", this.totalcount);
	}
}
