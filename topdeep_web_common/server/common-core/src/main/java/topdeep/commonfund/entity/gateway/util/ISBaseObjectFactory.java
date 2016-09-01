package topdeep.commonfund.entity.gateway.util;

import java.lang.reflect.Type;
import java.util.Map;

import common.util.StringUtils;

import flexjson.ObjectBinder;
import flexjson.ObjectFactory;

public class ISBaseObjectFactory implements ObjectFactory {
	
	protected static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ISBaseObjectFactory.class);
	
	public Object instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
//		System.out.println(value);
		if(value instanceof Map){
			Map map = (Map)value;
			String funcCode = "";
			if(map.containsKey("Z_funcCode")){
				funcCode = (String)map.get("Z_funcCode");
			}else if(map.containsKey("z_funcCode")){
				funcCode = (String)map.get("z_funcCode");
			}
			if(!StringUtils.isNullOrEmpty(funcCode)){
				Object obj = createObject(funcCode);
				log.debug("ObjectBinder to "+funcCode+" is "+obj.getClass().getName());
				return context.bindIntoObject((Map)value, createObject(funcCode), targetType);
			}
			log.debug("ObjectBinder to Default");
			return context.bindIntoObject((Map)value, createBaseObject(), targetType);
		}
		return null;
	}
	
	protected Object createBaseObject(){
		return null;
	}
	
	protected Object createObject(String funcCode){
		return createBaseObject(); 
	}

}
