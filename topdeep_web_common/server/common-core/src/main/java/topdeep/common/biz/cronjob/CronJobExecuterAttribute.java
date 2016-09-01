/**
 * 
 */
package topdeep.common.biz.cronjob;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CronJobExecuterAttribute {
	/**
	 * BeanId
	 * 
	 * @return
	 */
	String BeanId();
}
