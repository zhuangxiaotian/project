/**
 * 
 */
package topdeep.common.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import topdeep.common.entity.constant.NameValue;

import common.util.StringUtils;

/**
 * @author niexin
 *
 */
public class EnumTypeUtil {

	protected static Log log = LogFactory.getLog(EnumTypeUtil.class);
	
	@SuppressWarnings("unchecked")
	public static <T> T valueOf(String value, Class<T> clazz) {
		if(StringUtils.isNullOrEmpty(value)){
			return null;
		}
		try {
			Method valuesMethod = clazz.getMethod("values");
			Method valuemethod = clazz.getMethod("getValue");
			T[] values = (T[]) valuesMethod.invoke(clazz);
			for (T t : values) {
				if(value.equals((String)valuemethod.invoke(t))){
					return t;
				}
			}
		} catch (Exception e) {
			log.error(e.getMessage(),e);
		}
		return null;
	}
	
	public static <T> List<NameValue> valuesOf(Class<?> clazz){
		List<NameValue> list = new ArrayList<NameValue>();
		try {
			Method valuesMethod = clazz.getMethod("values");
			Method valueMethod = clazz.getMethod("getValue");
			Method nameMethod = clazz.getMethod("getName");
			@SuppressWarnings("unchecked")
			T[] values = (T[]) valuesMethod.invoke(clazz);
			for (T t : values) {
				String name = (String)nameMethod.invoke(t);
				String value = (String)valueMethod.invoke(t);
				list.add(new NameValue(name, value));
			}
		} catch (Exception e) {
			log.error(e.getMessage(),e);
		}
		return list;
	}

}
