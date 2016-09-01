package topdeep.common.entity.constant;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.LogFactory;

import topdeep.common.entity.base.BeanFieldAttribute;

import common.util.TwoTuple;

/**
 * 网关接口数据字典类型定义
 */
public class BaseInfoType {
	private static org.apache.commons.logging.Log logger = LogFactory.getLog(BaseInfoType.class);
	private static Object syncObj = new Object();
	/**
	 * 个人证件类型
	 */
	@BeanFieldAttribute(Name = "开户证件类型")
	public static String ID_TYPE = "001";

	/**
	 * 机构证件类型
	 */
	public static String ENTERPRISE_ID_TYPE = "002";

	/**
	 * 白名单功能号
	 */
	public static String WHITELISTS_URL = "021";

	/**
	 * 前端管理地址
	 */
	public static final String MOBILE_MANAGE_ADDRESS = "026";
	/**
	 * 支付状态
	 */
	@BeanFieldAttribute(Name = "支付状态")
	public static String PAY_STATUS = "014";

	/**
	 * 登录证件类型，比证件类型多一个基金账号登录
	 */
	@BeanFieldAttribute(Name = "登录证件类型")
	public static String LOGIN_ID_TYPE = "015";

	/**
	 * 数据字典对应类型
	 */
	@BeanFieldAttribute(Name = "数据字典对应类型")
	public static final String BASE_DICT_TYPE = "1000";
	/**
	 * 此字典类型存放允许用户编辑的字典类型
	 */
	public static final String USER_BASE_INFO_TYPE_LIST = "T01";
	/**
	 * 此字典类型存放允许用户编辑的类型的ID参数类型
	 */
	public static final String USER_BASE_INFO_ID_PARAM_TYPE_LIST = "T02";
	/**
	 * 此字典类型存放允许用户编辑的类型的Name参数类型
	 */
	public static final String USER_BASE_INFO_NAME_PARAM_TYPE_LIST = "T03";
	/**
	 * 此字典类型存放允许用户编辑的类型的Desc参数类型
	 */
	public static final String USER_BASE_INFO_DESC_PARAM_TYPE_LIST = "T04";
	/**
	 * 此字典类型存放允许用户编辑的类型的操作列表 0 只允许查看 1允许修改 2允许添加
	 */
	public static final String USER_BASE_INFO_OPERATE_LIST = "T05";

	/**
	 * 此字典类型存放允许用户编辑的类型的描述字段的名称
	 */
	public static final String USER_BASE_INFO_DESC_NAME_LIST = "T06";

	private static List<TwoTuple<String, String>> typeList = null;

	public static List<TwoTuple<String, String>> getTypeList() {
		if (typeList == null) {
			synchronized (syncObj) {
				if (typeList == null) {
					typeList = new ArrayList<TwoTuple<String, String>>();
					Class<?> type = BaseInfoType.class;
					Field[] fields = type.getDeclaredFields();
					for (Field item : fields) {
						BeanFieldAttribute attr = item.getAnnotation(BeanFieldAttribute.class);
						if (attr != null) {
							try {
								String value = (String) item.get(null);
								typeList.add(new TwoTuple<String, String>(value, attr.Name()));
							} catch (Exception e) {
								logger.error("baseInfoType getTypeList error " + attr.Name() + ": ", e);
							}
						}
					}
				}
			}
		}
		return typeList;
	}
}
