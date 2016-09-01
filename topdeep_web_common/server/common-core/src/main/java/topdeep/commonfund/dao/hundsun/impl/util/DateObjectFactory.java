/**
 * $Id$
 */
package topdeep.commonfund.dao.hundsun.impl.util;

import java.lang.reflect.Type;
import java.text.ParseException;

import common.util.StringUtils;

import flexjson.ObjectBinder;
import flexjson.ObjectFactory;

/**
 * @author niexin
 *
 */
public class DateObjectFactory implements ObjectFactory {
	
	public Object instantiate(ObjectBinder context, Object value,
			Type targetType, Class targetClass) {
		try {
			if(value == null){
				return null;
			}
			if(StringUtils.isNullOrEmpty(value.toString().trim())){
				return null;
			}
			return StringUtils.stringToDate(value.toString(), "yyyyMMdd");
		} catch (ParseException e) {
			throw context.cannotConvertValueToTargetType( value, Double.class );
		}
	}

}
