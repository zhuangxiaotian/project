/**
 * $Id$
 */
package topdeep.commonfund.dao.hundsun.impl.util;

import java.lang.reflect.Type;

import flexjson.ObjectBinder;
import flexjson.ObjectFactory;

/**
 * @author niexin
 *
 */
public class IntegerObjectFactory implements ObjectFactory {

	/* (non-Javadoc)
	 * @see flexjson.ObjectFactory#instantiate(flexjson.ObjectBinder, java.lang.Object, java.lang.reflect.Type, java.lang.Class)
	 */
	public Object instantiate(ObjectBinder context, Object value,
			Type targetType, Class targetClass) {
	       if( value instanceof Number ) {
	            return ((Number)value).intValue();
	        } else {
	        	return Integer.parseInt(value.toString());
	            //throw context.cannotConvertValueToTargetType( value, Integer.class );
	        }
	}

}
