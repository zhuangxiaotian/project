/**
 * 
 */
package topdeep.commonfund.biz.gateway;

import topdeep.commonfund.entity.gateway.GatewayReturn;

/**
 * @author niexin
 *
 */
public interface ServiceApi {
	/**
	 * 实现服务调用的通用函数，输入数据为简单的JSON序列化后的数据，不再包含签名等信息，Servlet负责签名打包的校验
	 * 
	 * @param inputParam
	 * @return
	 */
	String execute(String inputParam);

	/**
	 * @param inputParam
	 * @param sessionKey
	 * @param commerceId
	 * @param tradeType
	 * @return
	 */
	GatewayReturn execute(String inputParam, String sessionKey, String commerceId, String tradeType);

	/**
	 * 实现服务调用的通用函数，输入数据为简单的JSON序列化后的数据，不再包含签名等信息，Servlet负责签名打包的校验
	 * 
	 * @param inputParam
	 * @return
	 */
	String executeCheckVersion(String inputParam);

	/**
	 * @param inputParam
	 * @param sessionKey
	 * @param commerceId
	 * @param tradeType
	 * @return
	 */
	GatewayReturn executeCheckVersion(String inputParam, String sessionKey, String commerceId, String tradeType);
}
