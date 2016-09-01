package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可组合投资支付方式列表(T014)
 */
public class T014Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 组合方案内容,investflag为1时必传 将用户配置的基金代码、收费方式、金额按"|"分隔组装， 格式示例：fundcode1|sharetype1|applysum1|fundcode2|sharetype2|applysum2
	 */
	private String investcontent = "";
	
	private List<T014OutputDetail> detail = new ArrayList<T014OutputDetail>();
	
	/**
	 * 组合方案内容,investflag为1时必传 将用户配置的基金代码、收费方式、金额按"|"分隔组装， 格式示例：fundcode1|sharetype1|applysum1|fundcode2|sharetype2|applysum2
	 */
	public String getInvestcontent() {
		return this.investcontent;
	}
	
	/**
	 * 组合方案内容,investflag为1时必传 将用户配置的基金代码、收费方式、金额按"|"分隔组装， 格式示例：fundcode1|sharetype1|applysum1|fundcode2|sharetype2|applysum2
	 */
	public void setInvestcontent(String value)
	 {
		this.investcontent = value;
	}
	
	public List<T014OutputDetail> getDetail() {
		return this.detail;
	}
	
}
