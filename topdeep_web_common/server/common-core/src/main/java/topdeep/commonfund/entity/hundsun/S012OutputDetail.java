package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 资金流水查询(S012)功能输出明细参数
 */
public class S012OutputDetail extends Object implements Serializable {
	
	/**
	 * 发生日期,
	 */
	private String date = "";
	
	/**
	 * 资金流水状态,参考字典：资金流水状态
	 */
	private String state = "";
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 币种,
	 */
	private String balancecoin = "";
	
	/**
	 * 批次号,
	 */
	private String batchno = "";
	
	/**
	 * 分中心,
	 */
	private String branchcenter = "";
	
	/**
	 * 网点代码,
	 */
	private String branchno = "";
	
	/**
	 * 业务大类,
	 */
	private String callingbigtype = "";
	
	/**
	 * 业务原因,
	 */
	private String callingreason = "";
	
	/**
	 * 业务代码,参考字典：业务名称
	 */
	private String callingtype = "";
	
	/**
	 * 资金流水号,
	 */
	private String capitalserial = "";
	
	/**
	 * 确认编号,
	 */
	private String confirmserial = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金代码,参考字典：基金名称
	 */
	private String fundcode = "";
	
	/**
	 * 发生后余额,
	 */
	private Double happenedshare;
	
	/**
	 * 发生冻结金额,
	 */
	private Double happeningfresum;
	
	/**
	 * 发生金额,
	 */
	private Double happeningsum;
	
	/**
	 * 发生交易冻结金额,
	 */
	private Double happeningtradefresum;
	
	/**
	 * 原申请编号,
	 */
	private String originalapplyserial = "";
	
	/**
	 * 份额类别,参考字典：份额类别
	 */
	private String sharetype = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 发生日期,
	 */
	public String getDate() {
		return this.date;
	}
	
	/**
	 * 发生日期,
	 */
	public void setDate(String value)
	 {
		this.date = value;
	}
	
	/**
	 * 资金流水状态,参考字典：资金流水状态
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 资金流水状态,参考字典：资金流水状态
	 */
	public void setState(String value)
	 {
		this.state = value;
	}
	
	/**
	 * 申请编号,
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 申请编号,
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
	
	/**
	 * 币种,
	 */
	public String getBalancecoin() {
		return this.balancecoin;
	}
	
	/**
	 * 币种,
	 */
	public void setBalancecoin(String value)
	 {
		this.balancecoin = value;
	}
	
	/**
	 * 批次号,
	 */
	public String getBatchno() {
		return this.batchno;
	}
	
	/**
	 * 批次号,
	 */
	public void setBatchno(String value)
	 {
		this.batchno = value;
	}
	
	/**
	 * 分中心,
	 */
	public String getBranchcenter() {
		return this.branchcenter;
	}
	
	/**
	 * 分中心,
	 */
	public void setBranchcenter(String value)
	 {
		this.branchcenter = value;
	}
	
	/**
	 * 网点代码,
	 */
	public String getBranchno() {
		return this.branchno;
	}
	
	/**
	 * 网点代码,
	 */
	public void setBranchno(String value)
	 {
		this.branchno = value;
	}
	
	/**
	 * 业务大类,
	 */
	public String getCallingbigtype() {
		return this.callingbigtype;
	}
	
	/**
	 * 业务大类,
	 */
	public void setCallingbigtype(String value)
	 {
		this.callingbigtype = value;
	}
	
	/**
	 * 业务原因,
	 */
	public String getCallingreason() {
		return this.callingreason;
	}
	
	/**
	 * 业务原因,
	 */
	public void setCallingreason(String value)
	 {
		this.callingreason = value;
	}
	
	/**
	 * 业务代码,参考字典：业务名称
	 */
	public String getCallingtype() {
		return this.callingtype;
	}
	
	/**
	 * 业务代码,参考字典：业务名称
	 */
	public void setCallingtype(String value)
	 {
		this.callingtype = value;
	}
	
	/**
	 * 资金流水号,
	 */
	public String getCapitalserial() {
		return this.capitalserial;
	}
	
	/**
	 * 资金流水号,
	 */
	public void setCapitalserial(String value)
	 {
		this.capitalserial = value;
	}
	
	/**
	 * 确认编号,
	 */
	public String getConfirmserial() {
		return this.confirmserial;
	}
	
	/**
	 * 确认编号,
	 */
	public void setConfirmserial(String value)
	 {
		this.confirmserial = value;
	}
	
	/**
	 * 基金账号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 基金代码,参考字典：基金名称
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,参考字典：基金名称
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 发生后余额,
	 */
	public Double getHappenedshare() {
		return this.happenedshare;
	}
	
	/**
	 * 发生后余额,
	 */
	public void setHappenedshare(Double value)
	 {
		this.happenedshare = value;
	}
	
	/**
	 * 发生冻结金额,
	 */
	public Double getHappeningfresum() {
		return this.happeningfresum;
	}
	
	/**
	 * 发生冻结金额,
	 */
	public void setHappeningfresum(Double value)
	 {
		this.happeningfresum = value;
	}
	
	/**
	 * 发生金额,
	 */
	public Double getHappeningsum() {
		return this.happeningsum;
	}
	
	/**
	 * 发生金额,
	 */
	public void setHappeningsum(Double value)
	 {
		this.happeningsum = value;
	}
	
	/**
	 * 发生交易冻结金额,
	 */
	public Double getHappeningtradefresum() {
		return this.happeningtradefresum;
	}
	
	/**
	 * 发生交易冻结金额,
	 */
	public void setHappeningtradefresum(Double value)
	 {
		this.happeningtradefresum = value;
	}
	
	/**
	 * 原申请编号,
	 */
	public String getOriginalapplyserial() {
		return this.originalapplyserial;
	}
	
	/**
	 * 原申请编号,
	 */
	public void setOriginalapplyserial(String value)
	 {
		this.originalapplyserial = value;
	}
	
	/**
	 * 份额类别,参考字典：份额类别
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类别,参考字典：份额类别
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 交易账号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
}
