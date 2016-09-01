package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 基金份额查询功能输出参数
 */
public class ISFundShareListQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISFundShareListQueryOutputDetail> detail = new ArrayList<ISFundShareListQueryOutputDetail>();
	
	/**
	 * 总市值,
	 */
	private Double totalAssets;
	
	/**
	 * 未确认但扣款有效金额,
	 */
	private Double unconfirmcapital;
	
	/**
	 * 最新数据日期,
	 */
	private String latestDate;
	
	public ISFundShareListQueryOutput() {
		this.setZ_funcCode("u04");
	}
	
	public List<ISFundShareListQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
	
	/**
	 * 总市值,
	 */
	public Double getTotalAssets() {
		return this.totalAssets;
	}
	
	/**
	 * 总市值,
	 */
	public void setTotalAssets(Double value)
	 {
		this.totalAssets = value;
	}
	
	/**
	 * 未确认但扣款有效金额,
	 */
	public Double getUnconfirmcapital() {
		return this.unconfirmcapital;
	}
	
	/**
	 * 未确认但扣款有效金额,
	 */
	public void setUnconfirmcapital(Double value)
	 {
		this.unconfirmcapital = value;
	}
	
	/**
	 * 最新数据日期,
	 */
	public String getLatestDate() {
		return this.latestDate;
	}
	
	/**
	 * 最新数据日期,
	 */
	public void setLatestDate(String value)
	 {
		this.latestDate = value;
	}
}
