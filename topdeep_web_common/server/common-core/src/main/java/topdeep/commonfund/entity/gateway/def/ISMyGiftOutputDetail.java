package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 我的红包功能输出明细参数
 */
public class ISMyGiftOutputDetail extends Object implements Serializable {
	
	/**
	 * 发送时间,
	 */
	private String sendTime;
	
	/**
	 * 红包标题,
	 */
	private String giftTitle;
	
	/**
	 * 金额,
	 */
	private String amount;
	
	/**
	 * 红包ID,
	 */
	private String giftId;
	
	/**
	 * 发送时间,
	 */
	public String getSendTime() {
		return this.sendTime;
	}
	
	/**
	 * 发送时间,
	 */
	public void setSendTime(String value)
	 {
		this.sendTime = value;
	}
	
	/**
	 * 红包标题,
	 */
	public String getGiftTitle() {
		return this.giftTitle;
	}
	
	/**
	 * 红包标题,
	 */
	public void setGiftTitle(String value)
	 {
		this.giftTitle = value;
	}
	
	/**
	 * 金额,
	 */
	public String getAmount() {
		return this.amount;
	}
	
	/**
	 * 金额,
	 */
	public void setAmount(String value)
	 {
		this.amount = value;
	}
	
	/**
	 * 红包ID,
	 */
	public String getGiftId() {
		return this.giftId;
	}
	
	/**
	 * 红包ID,
	 */
	public void setGiftId(String value)
	 {
		this.giftId = value;
	}
}
