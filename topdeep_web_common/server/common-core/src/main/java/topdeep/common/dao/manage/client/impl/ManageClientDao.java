package topdeep.common.dao.manage.client.impl;
import org.springframework.stereotype.Service;

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
 * 网关JAVA客户端实现
 */
@Service("manageClientDao")
public class ManageClientDao extends topdeep.common.dao.manage.client.impl.ManageClientDaoBase {
	
	/**
	 * 重新加载参数 
	 * @return 结果
	 */
	public MSReloadSystemParamsOutput reloadSystemParams(MSReloadSystemParamsInput inputParam) throws Exception {
		MSReloadSystemParamsOutput outputParam = new MSReloadSystemParamsOutput();
		this.callServer(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 重新加载缓存 
	 * @return 结果
	 */
	public MSReloadCacheOutput reloadCache(MSReloadCacheInput inputParam) throws Exception {
		MSReloadCacheOutput outputParam = new MSReloadCacheOutput();
		this.callServer(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 绑定关系解除 
	 * @return 结果
	 */
	public MSUnbindCustomerOutput unbindCustomer(MSUnbindCustomerInput inputParam) throws Exception {
		MSUnbindCustomerOutput outputParam = new MSUnbindCustomerOutput();
		this.callServer(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 重新加载数据字典 
	 * @return 结果
	 */
	public MSReloadDictOutput reloadDict(MSReloadDictInput inputParam) throws Exception {
		MSReloadDictOutput outputParam = new MSReloadDictOutput();
		this.callServer(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 重新加载字典，缓存和参数 
	 * @return 结果
	 */
	public MSReloadAllOutput reloadAll(MSReloadAllInput inputParam) throws Exception {
		MSReloadAllOutput outputParam = new MSReloadAllOutput();
		this.callServer(inputParam, outputParam);
		return outputParam;
	}
}
