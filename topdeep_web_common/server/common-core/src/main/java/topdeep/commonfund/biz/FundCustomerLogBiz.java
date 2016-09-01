package topdeep.commonfund.biz;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import topdeep.common.biz.common.impl.BaseBiz;
import topdeep.commonfund.dao.FundCustomerLogDao;
import topdeep.commonfund.entity.view.FundCustomerLogView;

@Service("fundCustomerLogBiz")
public class FundCustomerLogBiz extends BaseBiz {

	@Autowired
	@Qualifier("fundCustomerLogDao")
	private FundCustomerLogDao fundCustomerLogDao;

	/**
	 * 
	 */
	public FundCustomerLogBiz() {
		// TODO Auto-generated constructor stub
	}

	public List<FundCustomerLogView> selectCountByActionType(Date date) {
		return fundCustomerLogDao.selectCountByActionType(date);
	}

}