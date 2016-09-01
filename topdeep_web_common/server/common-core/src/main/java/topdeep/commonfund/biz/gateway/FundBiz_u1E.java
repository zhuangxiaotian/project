package topdeep.commonfund.biz.gateway;
import topdeep.commonfund.entity.gateway.def.*;
import java.util.*;
import java.io.*;
public interface FundBiz_u1E {
	
	/**
	 * 消息列表 
	 * @return 结果
	 */
	ISInformationListOutput informationList(ISInformationListInput inputParam);
	
	/**
	 * 消息内容 
	 * @return 结果
	 */
	ISInfomationContentOutput infomationContent(ISInfomationContentInput inputParam);
	
	/**
	 * 删除银行卡 
	 * @return 结果
	 */
	ISCardNoDelOutput cardNoDel(ISCardNoDelInput inputParam);
	
	/**
	 * 银行卡列表 
	 * @return 结果
	 */
	ISCardNoListOutput cardNoList(ISCardNoListInput inputParam);
	
	/**
	 * 保存银行卡 
	 * @return 结果
	 */
	ISCardNoSaveOutput cardNoSave(ISCardNoSaveInput inputParam);
	
	/**
	 * 我的红包 
	 * @return 结果
	 */
	ISMyGiftOutput myGift(ISMyGiftInput inputParam);
}
