/**
 * $Id$
 */
package topdeep.commonfund.entity.hundsun;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;

import common.util.StringUtils;
import common.util.param.PropertyAttribute;

import flexjson.JSONSerializer;

/**
 * @author niexin
 *
 */
public class HundsunBaseInput {
	/**
	 * 名称: merid 类型: S 长度: 0 小数: 0 非空: True 版本: v1.0 备注: 商户ID
	 */
	private String merid;

	/**
	 * 名称: function 类型: S 长度: 4 小数: 0 非空: True 版本: v1.0 备注: 功能号 取值说明: 常量：P001
	 */
	private String function;

	/**
	 * 名称: channel 类型: S 长度: 1 小数: 0 非空: True 版本: v1.0 备注: 交易渠道 取值说明: 1:手机客户端;2:PC客户端;3:网页
	 */
	private String channel;

	/**
	 * 名称: usertype 类型: S 长度: 1 小数: 0 非空: False 版本: v1.0 备注: 投资者类型 默认值: p 取值说明: p:个人,o:机构
	 */
	private String usertype;

	/**
	 * 名称: signmode 类型: S 长度: 0 小数: 0 非空: False 版本: v1.0 备注: 签名方式 默认值: md5 取值说明: md5
	 */
	private String signmode;

	/**
	 * 名称: signmsg 类型: S 长度: 0 小数: 0 非空: True 版本: v1.0 备注: 签名信息
	 */
	private String signmsg;

	/**
	 * 名称: sessionkey 类型: S 长度: 0 小数: 0 非空: False 版本: v1.0 备注: session key
	 */
	private String sessionkey;

	/**
	 * 名称: timestamp 类型: S 长度: 0 小数: 0 非空: False 版本: v1.0 备注: 时间戳 取值说明: 格式:yyyymmddhh24MMss
	 */
	private String timestamp;

	/**
	 * 名称: version 类型: S 长度: 0 小数: 0 非空: True 版本: v1.0 备注: 版本 默认值: v1.0 取值说明: v1.0
	 */
	private String version;

	/**
	 * 名称: format 类型: S 长度: 0 小数: 0 非空: False 版本: v1.0 备注: 响应格式 默认值: json 取值说明: json:返回JSON;xml:返回XML
	 */
	private String format;

	public void serializeToMap(Map<String, String> inputMap) {
		inputMap.put("merid", merid);
		inputMap.put("function", function);
		inputMap.put("channel", channel);
		inputMap.put("usertype", usertype);
		inputMap.put("signmode", signmode);
		inputMap.put("signmsg", signmsg);
		inputMap.put("sessionkey", sessionkey);
		inputMap.put("timestamp", timestamp);
		inputMap.put("version", version);
		inputMap.put("format", format);
	}

	/**
	 * 名称: merid 类型: S 长度: 0 小数: 0 非空: True 版本: v1.0 备注: 商户ID
	 */
	@PropertyAttribute(Name = "merid", Type = "S", Length = 0, DecimalLength = 0, NotNull = true)
	public String getMerid() {
		return this.merid;
	}

	/**
	 * 名称: merid 类型: S 长度: 0 小数: 0 非空: True 版本: v1.0 备注: 商户ID
	 */
	@PropertyAttribute(Name = "merid", Type = "S", Length = 0, DecimalLength = 0, NotNull = true)
	public void setMerid(String value) {
		this.merid = value;
	}

	/**
	 * 名称: function 类型: S 长度: 4 小数: 0 非空: True 版本: v1.0 备注: 功能号 取值说明: 常量：P001
	 */
	@PropertyAttribute(Name = "function", Type = "S", Length = 4, DecimalLength = 0, NotNull = true)
	public String getFunction() {
		return this.function;
	}

	/**
	 * 名称: function 类型: S 长度: 4 小数: 0 非空: True 版本: v1.0 备注: 功能号 取值说明: 常量：P001
	 */
	@PropertyAttribute(Name = "function", Type = "S", Length = 4, DecimalLength = 0, NotNull = true)
	public void setFunction(String value) {
		this.function = value;
	}

	/**
	 * 名称: channel 类型: S 长度: 1 小数: 0 非空: True 版本: v1.0 备注: 交易渠道 取值说明: 1:手机客户端;2:PC客户端;3:网页
	 */
	@PropertyAttribute(Name = "channel", Type = "S", Length = 1, DecimalLength = 0, NotNull = true)
	public String getChannel() {
		return this.channel;
	}

	/**
	 * 名称: channel 类型: S 长度: 1 小数: 0 非空: True 版本: v1.0 备注: 交易渠道 取值说明: 1:手机客户端;2:PC客户端;3:网页
	 */
	@PropertyAttribute(Name = "channel", Type = "S", Length = 1, DecimalLength = 0, NotNull = true)
	public void setChannel(String value) {
		this.channel = value;
	}

	/**
	 * 名称: usertype 类型: S 长度: 1 小数: 0 非空: False 版本: v1.0 备注: 投资者类型 默认值: p 取值说明: p:个人,o:机构
	 */
	@PropertyAttribute(Name = "usertype", Type = "S", Length = 1, DecimalLength = 0, NotNull = false)
	public String getUsertype() {
		return this.usertype;
	}

	/**
	 * 名称: usertype 类型: S 长度: 1 小数: 0 非空: False 版本: v1.0 备注: 投资者类型 默认值: p 取值说明: p:个人,o:机构
	 */
	@PropertyAttribute(Name = "usertype", Type = "S", Length = 1, DecimalLength = 0, NotNull = false)
	public void setUsertype(String value) {
		this.usertype = value;
	}

	/**
	 * 名称: signmode 类型: S 长度: 0 小数: 0 非空: False 版本: v1.0 备注: 签名方式 默认值: md5 取值说明: md5
	 */
	@PropertyAttribute(Name = "signmode", Type = "S", Length = 0, DecimalLength = 0, NotNull = false)
	public String getSignmode() {
		return this.signmode;
	}

	/**
	 * 名称: signmode 类型: S 长度: 0 小数: 0 非空: False 版本: v1.0 备注: 签名方式 默认值: md5 取值说明: md5
	 */
	@PropertyAttribute(Name = "signmode", Type = "S", Length = 0, DecimalLength = 0, NotNull = false)
	public void setSignmode(String value) {
		this.signmode = value;
	}

	/**
	 * 名称: signmsg 类型: S 长度: 0 小数: 0 非空: True 版本: v1.0 备注: 签名信息
	 */
	@PropertyAttribute(Name = "signmsg", Type = "S", Length = 0, DecimalLength = 0, NotNull = true)
	public String getSignmsg() {
		return this.signmsg;
	}

	/**
	 * 名称: signmsg 类型: S 长度: 0 小数: 0 非空: True 版本: v1.0 备注: 签名信息
	 */
	@PropertyAttribute(Name = "signmsg", Type = "S", Length = 0, DecimalLength = 0, NotNull = true)
	public void setSignmsg(String value) {
		this.signmsg = value;
	}

	/**
	 * 名称: sessionkey 类型: S 长度: 0 小数: 0 非空: False 版本: v1.0 备注: session key
	 */
	@PropertyAttribute(Name = "sessionkey", Type = "S", Length = 0, DecimalLength = 0, NotNull = false)
	public String getSessionkey() {
		return this.sessionkey;
	}

	/**
	 * 名称: sessionkey 类型: S 长度: 0 小数: 0 非空: False 版本: v1.0 备注: session key
	 */
	@PropertyAttribute(Name = "sessionkey", Type = "S", Length = 0, DecimalLength = 0, NotNull = false)
	public void setSessionkey(String value) {
		this.sessionkey = value;
	}

	/**
	 * 名称: timestamp 类型: S 长度: 0 小数: 0 非空: False 版本: v1.0 备注: 时间戳 取值说明: 格式:yyyymmddhh24MMss
	 */
	@PropertyAttribute(Name = "timestamp", Type = "S", Length = 0, DecimalLength = 0, NotNull = false)
	public String getTimestamp() {
		return this.timestamp;
	}

	/**
	 * 名称: timestamp 类型: S 长度: 0 小数: 0 非空: False 版本: v1.0 备注: 时间戳 取值说明: 格式:yyyymmddhh24MMss
	 */
	@PropertyAttribute(Name = "timestamp", Type = "S", Length = 0, DecimalLength = 0, NotNull = false)
	public void setTimestamp(String value) {
		this.timestamp = value;
	}

	/**
	 * 名称: version 类型: S 长度: 0 小数: 0 非空: True 版本: v1.0 备注: 版本 默认值: v1.0 取值说明: v1.0
	 */
	@PropertyAttribute(Name = "version", Type = "S", Length = 0, DecimalLength = 0, NotNull = true)
	public String getVersion() {
		return this.version;
	}

	/**
	 * 名称: version 类型: S 长度: 0 小数: 0 非空: True 版本: v1.0 备注: 版本 默认值: v1.0 取值说明: v1.0
	 */
	@PropertyAttribute(Name = "version", Type = "S", Length = 0, DecimalLength = 0, NotNull = true)
	public void setVersion(String value) {
		this.version = value;
	}

	/**
	 * 名称: format 类型: S 长度: 0 小数: 0 非空: False 版本: v1.0 备注: 响应格式 默认值: json 取值说明: json:返回JSON;xml:返回XML
	 */
	@PropertyAttribute(Name = "format", Type = "S", Length = 0, DecimalLength = 0, NotNull = false)
	public String getFormat() {
		return this.format;
	}

	/**
	 * 名称: format 类型: S 长度: 0 小数: 0 非空: False 版本: v1.0 备注: 响应格式 默认值: json 取值说明: json:返回JSON;xml:返回XML
	 */
	@PropertyAttribute(Name = "format", Type = "S", Length = 0, DecimalLength = 0, NotNull = false)
	public void setFormat(String value) {
		this.format = value;
	}

	public String formatInteger(Integer value) {
		if (value == null) {
			return "";
		}
		return "" + value;
	}

	public String formatDate(java.util.Date value) {
		if (value == null) {
			return "";
		}
		return StringUtils.dateTimeToString(value, "yyyyMMdd");
	}

	public String formatDateTime(java.util.Date value) {
		if (value == null) {
			return "";
		}
		return StringUtils.dateTimeToString(value, "yyyyMMddHHmmss");
	}

	public String formatDecimal(Double value, int len, int decimalLen) {
		if (value == null) {
			return "";
		}
		String decimalFormat = "0000000000";
		String format = "0." + decimalFormat.substring(0, decimalLen);
		DecimalFormat df = new DecimalFormat(format);
		return df.format(value);
	}

	public String formatDecimal(Double value) {
		if (value == null) {
			return "";
		}
		String decimalFormat = "0000000000";
		String format = "0." + decimalFormat.substring(0, 2);
		DecimalFormat df = new DecimalFormat(format);
		return df.format(value);
	}

	public String formatListMap(List list) {
		flexjson.JSONSerializer serializer = new JSONSerializer();
		return serializer.deepSerialize(list);
	}
}
