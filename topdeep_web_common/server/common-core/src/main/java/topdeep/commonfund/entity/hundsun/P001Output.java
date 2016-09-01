package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 读取字典项内容(P001)
 */
public class P001Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 字典缓存版本,本地有缓存时，取字典时传入此值，则当版本一致才返回字典，否则返回码为：ETS-5BP0019
	 */
	private String version = "";
	
	/**
	 * 字典项列表,
	 */
	private String items = "";
	
	/**
	 * 字典缓存版本,本地有缓存时，取字典时传入此值，则当版本一致才返回字典，否则返回码为：ETS-5BP0019
	 */
	public String getVersion() {
		return this.version;
	}
	
	/**
	 * 字典缓存版本,本地有缓存时，取字典时传入此值，则当版本一致才返回字典，否则返回码为：ETS-5BP0019
	 */
	public void setVersion(String value)
	 {
		this.version = value;
	}
	
	/**
	 * 字典项列表,
	 */
	public String getItems() {
		return this.items;
	}
	
	/**
	 * 字典项列表,
	 */
	public void setItems(String value)
	 {
		this.items = value;
	}
}
