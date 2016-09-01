/**
 * 
 */
package topdeep.common.biz.common;

import java.util.List;

import topdeep.common.entity.view.SystemClientActivationExExample;
import topdeep.common.entity.view.SystemClientActivationManageView;

/**
 * @author niexin
 *
 */
public interface BaseBiz extends topdeep.common.entity.db.IBaseBiz {
	public <T> T selectSingleObject(List<T> tlist);

	public List<SystemClientActivationManageView> clientActivationViewSelectObjects(SystemClientActivationExExample clientActivationQueryCondition)
			throws Exception;

	public int clientActivationViewQuerySelectObjectsCount(SystemClientActivationExExample clientActivationQueryCondition) throws Exception;

}
