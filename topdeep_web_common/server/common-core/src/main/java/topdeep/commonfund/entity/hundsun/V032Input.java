package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 客户积分查询(V032)
 */
public class V032Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 客户编号或理财账号,
	 */
	private String custno = "登入用户可以不传，默认取sessionkey中的对应数据中心custno(注：custno为空无法正常兑换)";
	
	/**
	 * 是否查询家庭积分,1：可查询家庭积分
	 */
	private String isqueryfamily = "";
	
	/**
	 * 初始化参数
	 */
	public V032Input() {
		this.setFunction("V032");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 客户编号或理财账号,
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号或理财账号,
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 是否查询家庭积分,1：可查询家庭积分
	 */
	public String getIsqueryfamily() {
		return this.isqueryfamily;
	}
	
	/**
	 * 是否查询家庭积分,1：可查询家庭积分
	 */
	public void setIsqueryfamily(String value)
	 {
		this.isqueryfamily = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("custno", this.custno);
		inputMap.put("isqueryfamily", this.isqueryfamily);
	}
}
