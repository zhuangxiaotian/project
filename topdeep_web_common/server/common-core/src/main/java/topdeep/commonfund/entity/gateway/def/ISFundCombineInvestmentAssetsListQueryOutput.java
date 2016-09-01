package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 基金组合投资资产组合功能输出参数
 */
public class ISFundCombineInvestmentAssetsListQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 报告名称,
	 */
	private String reportName;
	
	/**
	 * 开始日期,
	 */
	private String beginDate;
	
	/**
	 * 结束日期,
	 */
	private String endDate;
	
	private List<ISFundCombineInvestmentAssetsListQueryOutputDetail> detail = new ArrayList<ISFundCombineInvestmentAssetsListQueryOutputDetail>();
	
	public ISFundCombineInvestmentAssetsListQueryOutput() {
		this.setZ_funcCode("n0g");
	}
	
	/**
	 * 报告名称,
	 */
	public String getReportName() {
		return this.reportName;
	}
	
	/**
	 * 报告名称,
	 */
	public void setReportName(String value)
	 {
		this.reportName = value;
	}
	
	/**
	 * 开始日期,
	 */
	public String getBeginDate() {
		return this.beginDate;
	}
	
	/**
	 * 开始日期,
	 */
	public void setBeginDate(String value)
	 {
		this.beginDate = value;
	}
	
	/**
	 * 结束日期,
	 */
	public String getEndDate() {
		return this.endDate;
	}
	
	/**
	 * 结束日期,
	 */
	public void setEndDate(String value)
	 {
		this.endDate = value;
	}
	
	public List<ISFundCombineInvestmentAssetsListQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
