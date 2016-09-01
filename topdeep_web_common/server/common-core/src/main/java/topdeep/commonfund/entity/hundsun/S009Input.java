package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 下个工作日查询(S009)
 */
public class S009Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 当前工作日,yyyymmdd，若未传则取当前工作日的下个工作日
	 */
	private String workdate = "";
	
	/**
	 * 初始化参数
	 */
	public S009Input() {
		this.setFunction("S009");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 当前工作日,yyyymmdd，若未传则取当前工作日的下个工作日
	 */
	public String getWorkdate() {
		return this.workdate;
	}
	
	/**
	 * 当前工作日,yyyymmdd，若未传则取当前工作日的下个工作日
	 */
	public void setWorkdate(String value)
	 {
		this.workdate = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("workdate", this.workdate);
	}
}
