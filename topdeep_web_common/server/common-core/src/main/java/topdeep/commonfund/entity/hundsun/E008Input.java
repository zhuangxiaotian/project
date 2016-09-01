package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 电子合同模版上传通知(E008)
 */
public class E008Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 业务辅助代码,01-电子合同签署;02-风险揭示书签署;03-约定书签署;04-约定书取消
	 */
	private String fixbusinflag = "";
	
	/**
	 * 基金代码,电子合同签署业务必填合同模板变更必填
	 */
	private String fundcode = "";
	
	/**
	 * 接口类型,电子合同模板变更必填1
	 */
	private String interfacetype;
	
	/**
	 * 变更前版本,电子合同模板变更必填
	 */
	private String lastversion = "";
	
	/**
	 * 变更后版本,电子合同模板变更必填
	 */
	private String nowversion = "";
	
	/**
	 * 是否需要重签,电子合同模板变更必填，重签传入1
	 */
	private String resigning = "";
	
	/**
	 * 合同类型,必填，0：电子合同；1：风险揭示书
	 */
	private String contracttype;
	
	/**
	 * 初始化参数
	 */
	public E008Input() {
		this.setFunction("E008");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 业务辅助代码,01-电子合同签署;02-风险揭示书签署;03-约定书签署;04-约定书取消
	 */
	public String getFixbusinflag() {
		return this.fixbusinflag;
	}
	
	/**
	 * 业务辅助代码,01-电子合同签署;02-风险揭示书签署;03-约定书签署;04-约定书取消
	 */
	public void setFixbusinflag(String value)
	 {
		this.fixbusinflag = value;
	}
	
	/**
	 * 基金代码,电子合同签署业务必填合同模板变更必填
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,电子合同签署业务必填合同模板变更必填
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 接口类型,电子合同模板变更必填1
	 */
	public String getInterfacetype() {
		return this.interfacetype;
	}
	
	/**
	 * 接口类型,电子合同模板变更必填1
	 */
	public void setInterfacetype(String value)
	 {
		this.interfacetype = value;
	}
	
	/**
	 * 变更前版本,电子合同模板变更必填
	 */
	public String getLastversion() {
		return this.lastversion;
	}
	
	/**
	 * 变更前版本,电子合同模板变更必填
	 */
	public void setLastversion(String value)
	 {
		this.lastversion = value;
	}
	
	/**
	 * 变更后版本,电子合同模板变更必填
	 */
	public String getNowversion() {
		return this.nowversion;
	}
	
	/**
	 * 变更后版本,电子合同模板变更必填
	 */
	public void setNowversion(String value)
	 {
		this.nowversion = value;
	}
	
	/**
	 * 是否需要重签,电子合同模板变更必填，重签传入1
	 */
	public String getResigning() {
		return this.resigning;
	}
	
	/**
	 * 是否需要重签,电子合同模板变更必填，重签传入1
	 */
	public void setResigning(String value)
	 {
		this.resigning = value;
	}
	
	/**
	 * 合同类型,必填，0：电子合同；1：风险揭示书
	 */
	public String getContracttype() {
		return this.contracttype;
	}
	
	/**
	 * 合同类型,必填，0：电子合同；1：风险揭示书
	 */
	public void setContracttype(String value)
	 {
		this.contracttype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("fixbusinflag", this.fixbusinflag);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("interfacetype", this.interfacetype.toString());
		inputMap.put("lastversion", this.lastversion);
		inputMap.put("nowversion", this.nowversion);
		inputMap.put("resigning", this.resigning);
		inputMap.put("contracttype", this.contracttype.toString());
	}
}
