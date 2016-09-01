package topdeep.commonfund.entity.ds.def;

public class DsBaseOutput {

	/**
	 * 成功标志,0000-成功；首位：1-系统级错误；2-应用级错误；3-业务逻辑错误（下同）
	 */
	private String code;

	/**
	 * 错误原因,
	 */
	private String msg;

	/**
	 * 功能编号,
	 */
	private String z_funcCode;

	/**
	 * 时间戳,
	 */
	private String z_timestamp;
	/**
	 * 调用次数，客户端同样的功能重调次数 1表示第一次调 2表示第二次调
	 */
	private int z_calltimes = 1;

	// /**
	// * sessionkey 恒生的接口一般会返回
	// */
	// private String sessionKey = "";

	public DsBaseOutput() {
		this.setZ_funcCode("b00");
	}

	public boolean isSuccess() {
		return "0000".equals(code);
	}

	/**
	 * 成功标志,0000-成功；首位：1-系统级错误；2-应用级错误；3-业务逻辑错误（下同）
	 */
	public String getCode() {
		return this.code;
	}

	/**
	 * 成功标志,0000-成功；首位：1-系统级错误；2-应用级错误；3-业务逻辑错误（下同）
	 */
	public void setCode(String value) {
		this.code = value;
	}

	/**
	 * 错误原因,
	 */
	public String getMsg() {
		return this.msg;
	}

	/**
	 * 错误原因,
	 */
	public void setMsg(String value) {
		this.msg = value;
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
	 * 时间戳,
	 */
	public String getZ_timestamp() {
		return this.z_timestamp;
	}

	/**
	 * 时间戳,
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

	// public String getSessionKey() {
	// return sessionKey;
	// }
	//
	// public void setSessionKey(String sessionKey) {
	// this.sessionKey = sessionKey;
	// }

}
