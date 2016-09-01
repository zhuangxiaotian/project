package topdeep.commonfund.dao.hundsun.impl.util;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

import flexjson.ObjectBinder;
import flexjson.ObjectFactory;

/**
 * 
 * @author shidewen
 * 
 */
public class HashMapObjectFactory implements ObjectFactory {

	public Object instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
		// if (value instanceof HashMap) {
		// EMI1002ResponseOrderList order = new EMI1002ResponseOrderList();
		// Set set = ((HashMap) value).keySet();
		// Iterator iterator = set.iterator();
		// while (iterator.hasNext()) {
		// Object obj = iterator.next();
		// Object val = ((HashMap) value).get(obj);
		// setMethod(obj, val, order);
		// }
		// return order;
		// }
		return null;
	}

	private void setMethod(Object method, Object value, Object thisObj) {
		Class c;
		try {
			c = Class.forName(thisObj.getClass().getName());
			String met = (String) method;
			met = met.trim();
			if (!met.substring(0, 1).equals(met.substring(0, 1).toUpperCase())) {
				met = met.substring(0, 1).toUpperCase() + met.substring(1);
			}
			if (!String.valueOf(method).startsWith("set")) {
				met = "set" + met;
			}
			Class types[] = new Class[1];
			types[0] = Class.forName("java.lang.String");
			Method m = c.getMethod(met, types);
			m.invoke(thisObj, value);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
