package topdeep.commonfund.dao;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import topdeep.commonfund.entity.view.FundCustomerLogView;
import topdeep.commonfund.entity.view.FundCustomerLogViewMapper;


@Repository("fundCustomerLogDao")
public class FundCustomerLogDao extends BaseDao {

	public FundCustomerLogDao() {

	}

	public List<FundCustomerLogView> selectCountByActionType(Date date) {
		FundCustomerLogViewMapper mapperImpl = this.getSqlSession().getMapper(FundCustomerLogViewMapper.class);
		return mapperImpl.selectCountByActionType(date);
	}

}
