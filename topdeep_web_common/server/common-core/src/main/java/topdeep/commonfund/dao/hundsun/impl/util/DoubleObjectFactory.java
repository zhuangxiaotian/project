/**
 * $Id$
 */
package topdeep.commonfund.dao.hundsun.impl.util;

import java.lang.reflect.Type;

import common.util.StringUtils;

import flexjson.ObjectBinder;
import flexjson.ObjectFactory;

/**
 * @author niexin
 *
 */
public class DoubleObjectFactory implements ObjectFactory {

	public Object instantiate(ObjectBinder context, Object value,
			Type targetType, Class targetClass) {
	       if( value instanceof Number ) {
	            return ((Number)value).doubleValue();
	        } else {
	        	return StringUtils.stringToDouble(value.toString());
	            //throw context.cannotConvertValueToTargetType( value, Double.class );
	        }
	}

}
