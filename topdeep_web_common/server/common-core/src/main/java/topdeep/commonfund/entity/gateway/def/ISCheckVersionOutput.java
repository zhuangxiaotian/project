package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 检查版本功能输出参数
 */
public class ISCheckVersionOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 运行标志,0 版本最新，允许运行 1 版本已旧，但允许继续运行 2 版本过旧，不允许运行，必须升级
	 */
	private String runFlag;
	
	/**
	 * 会话标识,
	 */
	private String sessionKey;
	
	/**
	 * 升级文件地址,
	 */
	private String updateUrl;
	
	public ISCheckVersionOutput() {
		this.setZ_funcCode("b02");
	}
	
	/**
	 * 运行标志,0 版本最新，允许运行 1 版本已旧，但允许继续运行 2 版本过旧，不允许运行，必须升级
	 */
	public String getRunFlag() {
		return this.runFlag;
	}
	
	/**
	 * 运行标志,0 版本最新，允许运行 1 版本已旧，但允许继续运行 2 版本过旧，不允许运行，必须升级
	 */
	public void setRunFlag(String value)
	 {
		this.runFlag = value;
	}
	
	/**
	 * 会话标识,
	 */
	public String getSessionKey() {
		return this.sessionKey;
	}
	
	/**
	 * 会话标识,
	 */
	public void setSessionKey(String value)
	 {
		this.sessionKey = value;
	}
	
	/**
	 * 升级文件地址,
	 */
	public String getUpdateUrl() {
		return this.updateUrl;
	}
	
	/**
	 * 升级文件地址,
	 */
	public void setUpdateUrl(String value)
	 {
		this.updateUrl = value;
	}
}
