package topdeep.commonfund.entity.view;

import java.util.Date;
import java.util.List;

public interface FundCustomerLogViewMapper {

	List<FundCustomerLogView> selectCountByActionType(Date date);


}
