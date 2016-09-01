/**
 * 
 */
package topdeep.common.mg.biz.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import topdeep.common.biz.common.impl.CommonSystemParamBiz;
import topdeep.common.mg.entity.params.CommonBuildParam;
import topdeep.common.mg.entity.params.CommonMgApplicationParam;
import topdeep.common.mg.entity.params.CommonPageParam;


/**
 * 
 * @author shidewen
 * 
 */
@Service("commonMgSystemParamBiz")
public class CommonMgSystemParamBiz extends CommonSystemParamBiz {

	@Autowired
	private CommonMgApplicationParam commonMgApplicationParam;

	@Autowired
	private CommonBuildParam commonBuildParam;

	@Autowired
	private CommonPageParam commoPpageParam;

	public CommonMgApplicationParam getCommonMgApplicationParam() {
		return commonMgApplicationParam;
	}

	public CommonBuildParam getCommonBuildParam() {
		return commonBuildParam;
	}

	public CommonPageParam getCommoPpageParam() {
		return commoPpageParam;
	}


	

}
