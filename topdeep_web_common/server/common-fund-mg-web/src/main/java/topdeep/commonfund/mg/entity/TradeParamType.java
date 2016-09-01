package topdeep.commonfund.mg.entity;

public class TradeParamType {

private String tradeParamType;
	
	private String tradeParamTypeName;

	public String getTradeParamType() {
		return tradeParamType;
	}

	public void setTradeParamType(String tradeParamType) {
		this.tradeParamType = tradeParamType;
	}

	public String getTradeParamTypeName() {
		return tradeParamTypeName;
	}

	public void setTradeParamTypeName(String tradeParamTypeName) {
		this.tradeParamTypeName = tradeParamTypeName;
	}
	
	public TradeParamType(String tradeParamType,String tradeParamTypeName)
	{
		this.tradeParamType = tradeParamType;
		this.tradeParamTypeName = tradeParamTypeName;
	}
}
