package topdeep.commonfund.dao.gateway.client;

import topdeep.commonfund.entity.gateway.def.ISCheckVersionInput;
import topdeep.commonfund.entity.gateway.def.ISCheckVersionOutput;

/**
 * 网关JAVA客户端实现
 */
public class FundDao extends topdeep.commonfund.dao.gateway.client.FundDaoBase {

	/**
	 * 检查版本
	 * 
	 * @return 结果
	 */
	public ISCheckVersionOutput checkVersion(ISCheckVersionInput inputParam) throws Exception {
		return ((ISCheckVersionOutput) (this.callServer(inputParam)));
	}

}
