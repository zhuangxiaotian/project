package topdeep.common.entity.view;

import java.util.List;

public interface SystemClientActivationManageViewMapper {
	List<SystemClientActivationManageView> selectByExample(SystemClientActivationExExample clientActivationQueryCondition);

	int countByExample(SystemClientActivationExExample clientActivationQueryCondition);
}