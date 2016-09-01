package topdeep.commonfund.entity.view;

public class FundCustomerLogView {

	/**
	 * 排名
	 */
	private String rowNum;
	/**
	 * 推荐人
	 */
	private String refereeName;
	/**
	 * 推荐业务量
	 */
	private String refereeCount;

	private String actionType;

	private Integer total;
	/**
	 * 推荐交易
	 */
	private String refereeTrade;
	/**
	 * 交易日期
	 */
	private String tradeDate;
	/**
	 * 交易基金
	 */
	private String tradeFundName;
	/**
	 * 交易金额
	 */
	private String tradeAmount;
	/**
	 * 交易份额
	 */
	private String tradeVol;
	/**
	 * 交易证件类型
	 */
	private String idType;

	/**
	 * 交易证件名称
	 */
	private String idTypeName;
	/**
	 * 交易证件号码
	 */
	private String idNo;
	/**
	 * 推荐交易量
	 */
	private String refereeNum;
	/**
	 * 推荐购买金额
	 */
	private String refereeAmount;

	/**
	 * 客户类型 1个人0机构
	 */
	private String customerType;

	private String id;
	/**
	 * 交易人姓名/被推荐人姓名
	 */
	private String customerName;

	public FundCustomerLogView() {

	}

	public FundCustomerLogView(String actionType, Integer total, String rowNum, String refereeName, String refereeCount, String refereeTrade, String tradeDate,
			String tradeFundName, String tradeAmount, String idType, String idNo, String customerType, String id) {
		super();
		this.actionType = actionType;
		this.total = total;
		this.rowNum = rowNum;
		this.refereeName = refereeName;
		this.refereeCount = refereeCount;
		this.refereeTrade = refereeTrade;
		this.tradeDate = tradeDate;
		this.tradeFundName = tradeFundName;
		this.tradeAmount = tradeAmount;
		this.idType = idType;
		this.idNo = idNo;
		this.customerType = customerType;
		this.id = id;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getRowNum() {
		return rowNum;
	}

	public void setRowNum(String rowNum) {
		this.rowNum = rowNum;
	}

	public String getRefereeName() {
		return refereeName;
	}

	public String getIdTypeName() {
		return idTypeName;
	}

	public void setIdTypeName(String idTypeName) {
		this.idTypeName = idTypeName;
	}

	public void setRefereeName(String refereeName) {
		this.refereeName = refereeName;
	}

	public String getRefereeCount() {
		return refereeCount;
	}

	public void setRefereeCount(String refereeCount) {
		this.refereeCount = refereeCount;
	}

	public String getRefereeTrade() {
		return refereeTrade;
	}

	public void setRefereeTrade(String refereeTrade) {
		this.refereeTrade = refereeTrade;
	}

	public String getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}

	public String getTradeFundName() {
		return tradeFundName;
	}

	public void setTradeFundName(String tradeFundName) {
		this.tradeFundName = tradeFundName;
	}

	public String getTradeAmount() {
		return tradeAmount;
	}

	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getRefereeNum() {
		return refereeNum;
	}

	public void setRefereeNum(String refereeNum) {
		this.refereeNum = refereeNum;
	}

	public String getRefereeAmount() {
		return refereeAmount;
	}

	public void setRefereeAmount(String refereeAmount) {
		this.refereeAmount = refereeAmount;
	}

	public String getTradeVol() {
		return tradeVol;
	}

	public void setTradeVol(String tradeVol) {
		this.tradeVol = tradeVol;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
