package topdeep.common.web.biz;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import topdeep.common.biz.common.impl.CommonSystemParamBiz;
import topdeep.common.web.entity.params.CommonWebParam;


/**
 * @author niexin
 *
 */
@Service("commonWebSystemParamBiz")
public class CommonWebSystemParamBiz extends CommonSystemParamBiz implements InitializingBean {

	@Autowired
	private CommonWebParam webParam;

	public CommonWebParam getWebParam() {
		return webParam;
	}


	public void init(){
		// logger.info("load param from db");
		// try {
		// Map<String, BaseSystemParam> paramMap = getParamMap();
		// List<SystemParam> paramList = baseBiz.systemParamSelectObjects(new SystemParamExample());
		// for (SystemParam item : paramList) {
		// BaseSystemParam param = paramMap.get(item.getSystemParamCategory());
		// if (param != null) {
		// setFieldValue(param, item.getSystemParamCode(), item.getSystemParamValue());
		// }
		// }
		// } catch (Exception e) {
		// logger.error("初始化系统参数错误!", e);
		// }
		// debugParams();
	}


	public void afterPropertiesSet() throws Exception {
		init();
	}

}
