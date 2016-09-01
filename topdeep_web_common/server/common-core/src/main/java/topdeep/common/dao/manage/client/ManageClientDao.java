package topdeep.common.dao.manage.client;

import topdeep.common.entity.manage.def.MSReloadAllInput;
import topdeep.common.entity.manage.def.MSReloadAllOutput;
import topdeep.common.entity.manage.def.MSReloadCacheInput;
import topdeep.common.entity.manage.def.MSReloadCacheOutput;
import topdeep.common.entity.manage.def.MSReloadDictInput;
import topdeep.common.entity.manage.def.MSReloadDictOutput;
import topdeep.common.entity.manage.def.MSReloadSystemParamsInput;
import topdeep.common.entity.manage.def.MSReloadSystemParamsOutput;
import topdeep.common.entity.manage.def.MSUnbindCustomerInput;
import topdeep.common.entity.manage.def.MSUnbindCustomerOutput;

/**
 * 电商网关JAVA客户端接口
 */
public interface ManageClientDao {
	
	/**
	 * 重新加载参数 
	 * @return 结果
	 */
	MSReloadSystemParamsOutput reloadSystemParams(MSReloadSystemParamsInput inputParam) throws Exception;
	
	/**
	 * 重新加载缓存 
	 * @return 结果
	 */
	MSReloadCacheOutput reloadCache(MSReloadCacheInput inputParam) throws Exception;
	
	/**
	 * 绑定关系解除 
	 * @return 结果
	 */
	MSUnbindCustomerOutput unbindCustomer(MSUnbindCustomerInput inputParam) throws Exception;
	
	/**
	 * 重新加载数据字典 
	 * @return 结果
	 */
	MSReloadDictOutput reloadDict(MSReloadDictInput inputParam) throws Exception;
	
	/**
	 * 重新加载字典，缓存和参数 
	 * @return 结果
	 */
	MSReloadAllOutput reloadAll(MSReloadAllInput inputParam) throws Exception;
}
