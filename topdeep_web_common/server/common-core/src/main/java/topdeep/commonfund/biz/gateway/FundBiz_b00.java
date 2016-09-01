package topdeep.commonfund.biz.gateway;
import topdeep.commonfund.entity.gateway.def.*;
import java.util.*;
import java.io.*;
public interface FundBiz_b00 {
	
	/**
	 * 更新Session中的用户 
	 * @return 结果
	 */
	ISSessionUserUpdateOutput sessionUserUpdate(ISSessionUserUpdateInput inputParam);
	
	/**
	 * 检查版本 
	 * @return 结果
	 */
	ISVersionCheckOutput versionCheck(ISVersionCheckInput inputParam);
	
	/**
	 * 登录 
	 * @return 结果
	 */
	ISLoginOutput login(ISLoginInput inputParam);
	
	/**
	 * 登出 
	 * @return 结果
	 */
	ISLogoutOutput logout(ISLogoutInput inputParam);
	
	/**
	 * 字典查询 
	 * @return 结果
	 */
	ISBaseInfoQueryOutput baseInfoQuery(ISBaseInfoQueryInput inputParam);
}
