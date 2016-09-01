/**
 * 
 */
package topdeep.commonfund.biz.common;

import java.util.List;

/**
 * @author niexin
 *
 */
public interface BaseBiz extends topdeep.commonfund.entity.db.IBaseBiz {
	public <T> T selectSingleObject(List<T> tlist);
}
