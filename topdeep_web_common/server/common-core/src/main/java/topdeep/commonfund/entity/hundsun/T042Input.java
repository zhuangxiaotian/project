package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 购物车信息删除(T042)
 */
public class T042Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 批量删除标志,1代表批量删除
	 */
	private String batchdelete = "";
	
	/**
	 * 业务代码,batchdelete为1时必输，022申购；090定投
	 */
	private String businflag = "";
	
	/**
	 * 订单流水号,删除单挑购物车信息时必输
	 */
	private String requestno = "";
	
	/**
	 * 初始化参数
	 */
	public T042Input() {
		this.setFunction("T042");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 批量删除标志,1代表批量删除
	 */
	public String getBatchdelete() {
		return this.batchdelete;
	}
	
	/**
	 * 批量删除标志,1代表批量删除
	 */
	public void setBatchdelete(String value)
	 {
		this.batchdelete = value;
	}
	
	/**
	 * 业务代码,batchdelete为1时必输，022申购；090定投
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,batchdelete为1时必输，022申购；090定投
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 订单流水号,删除单挑购物车信息时必输
	 */
	public String getRequestno() {
		return this.requestno;
	}
	
	/**
	 * 订单流水号,删除单挑购物车信息时必输
	 */
	public void setRequestno(String value)
	 {
		this.requestno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("batchdelete", this.batchdelete);
		inputMap.put("businflag", this.businflag);
		inputMap.put("requestno", this.requestno);
	}
}
