package topdeep.commonfund.entity.ds.def;

public class DsBaseInput {

	/**
	 * 版本编号,
	 */
	private String z_funcVersion;

	/**
	 * 功能编号,
	 */
	private String z_funcCode;

	/**
	 * 交易方式,
	 */
	private String z_tradeType;

	/**
	 * 商业标识,
	 */
	private String z_commerceId;

	/**
	 * 会话标识,
	 */
	private String z_sessionKey;

	/**
	 * 时间戳,客户端请求的时间戳，格式为yyyyMMddHHmmss
	 */
	private String z_timestamp;

	/**
	 * 调用次数，客户端同样的功能重调次数 1表示第一次调 2表示第二次调
	 */
	private int z_calltimes = 1;

	public DsBaseInput() {
		this.setZ_funcCode("b00");
	}

	/**
	 * 版本编号,
	 */
	public String getZ_funcVersion() {
		return this.z_funcVersion;
	}

	/**
	 * 版本编号,
	 */
	public void setZ_funcVersion(String value) {
		this.z_funcVersion = value;
	}

	/**
	 * 功能编号,
	 */
	public String getZ_funcCode() {
		return this.z_funcCode;
	}

	/**
	 * 功能编号,
	 */
	public void setZ_funcCode(String value) {
		this.z_funcCode = value;
	}

	/**
	 * 交易方式,
	 */
	public String getZ_tradeType() {
		return this.z_tradeType;
	}

	/**
	 * 交易方式,
	 */
	public void setZ_tradeType(String value) {
		this.z_tradeType = value;
	}

	/**
	 * 商业标识,
	 */
	public String getZ_commerceId() {
		return this.z_commerceId;
	}

	/**
	 * 商业标识,
	 */
	public void setZ_commerceId(String value) {
		this.z_commerceId = value;
	}

	/**
	 * 会话标识,
	 */
	public String getZ_sessionKey() {
		return this.z_sessionKey;
	}

	/**
	 * 会话标识,
	 */
	public void setZ_sessionKey(String value) {
		this.z_sessionKey = value;
	}

	/**
	 * 时间戳,客户端请求的时间戳，格式为yyyyMMddHHmmss
	 */
	public String getZ_timestamp() {
		return this.z_timestamp;
	}

	/**
	 * 时间戳,客户端请求的时间戳，格式为yyyyMMddHHmmss
	 */
	public void setZ_timestamp(String value) {
		this.z_timestamp = value;
	}

	/**
	 * @return the z_calltimes
	 */
	public int getZ_calltimes() {
		return z_calltimes;
	}

	/**
	 * @param z_calltimes the z_calltimes to set
	 */
	public void setZ_calltimes(int z_calltimes) {
		this.z_calltimes = z_calltimes;
	}

}
