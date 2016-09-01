package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 电子合同撤销通知(E009)
 */
public class E009Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 原申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 合同编号,若撤销合同类申请必填(类别为风险揭示书，则填揭示书编号)
	 */
	private String contractno = "";
	
	/**
	 * 合同类别,若撤销合同类申请必填(0：电子合同；1：风险揭示书)
	 */
	private String contracttype;
	
	/**
	 * 接口类型,若撤销合同类申请必填1
	 */
	private String interfacetype;
	
	/**
	 * 交易密码,
	 */
	private String tradepassword = "";
	
	/**
	 * 交易来源,系统参数配置的交易来源不需要传入交易密码
	 */
	private String tradesource = "";
	
	/**
	 * 初始化参数
	 */
	public E009Input() {
		this.setFunction("E009");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 原申请编号,
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 原申请编号,
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
	
	/**
	 * 合同编号,若撤销合同类申请必填(类别为风险揭示书，则填揭示书编号)
	 */
	public String getContractno() {
		return this.contractno;
	}
	
	/**
	 * 合同编号,若撤销合同类申请必填(类别为风险揭示书，则填揭示书编号)
	 */
	public void setContractno(String value)
	 {
		this.contractno = value;
	}
	
	/**
	 * 合同类别,若撤销合同类申请必填(0：电子合同；1：风险揭示书)
	 */
	public String getContracttype() {
		return this.contracttype;
	}
	
	/**
	 * 合同类别,若撤销合同类申请必填(0：电子合同；1：风险揭示书)
	 */
	public void setContracttype(String value)
	 {
		this.contracttype = value;
	}
	
	/**
	 * 接口类型,若撤销合同类申请必填1
	 */
	public String getInterfacetype() {
		return this.interfacetype;
	}
	
	/**
	 * 接口类型,若撤销合同类申请必填1
	 */
	public void setInterfacetype(String value)
	 {
		this.interfacetype = value;
	}
	
	/**
	 * 交易密码,
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	/**
	 * 交易来源,系统参数配置的交易来源不需要传入交易密码
	 */
	public String getTradesource() {
		return this.tradesource;
	}
	
	/**
	 * 交易来源,系统参数配置的交易来源不需要传入交易密码
	 */
	public void setTradesource(String value)
	 {
		this.tradesource = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applyserial", this.applyserial);
		inputMap.put("contractno", this.contractno);
		inputMap.put("contracttype", this.contracttype.toString());
		inputMap.put("interfacetype", this.interfacetype.toString());
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("tradesource", this.tradesource);
	}
}
