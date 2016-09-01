package topdeep.commonfund.biz.ds.impl;

import topdeep.commonfund.biz.ds.DsBiz_n00;
import topdeep.commonfund.entity.ds.def.DsFundListQueryInput;
import topdeep.commonfund.entity.ds.def.DsFundListQueryOutput;
import topdeep.commonfund.entity.ds.def.DsFundListQueryOutputDetail;
import topdeep.commonfund.entity.hundsun.HundsunCallSession;
import topdeep.commonfund.entity.hundsun.S010Input;
import topdeep.commonfund.entity.hundsun.S010Output;
import topdeep.commonfund.entity.hundsun.S010OutputReturnlist;

import common.util.StringUtils;

public class DsBiz_n00_impl extends FundBizImplBase implements DsBiz_n00 {

	public DsFundListQueryOutput fundListQuery(DsFundListQueryInput inputParam) {
		DsFundListQueryOutput output = new DsFundListQueryOutput();
		HundsunCallSession callSession = new HundsunCallSession();
		callSession.setMerid("ccbfund");
		callSession.setMerPassword("ccbfund");
		try {
			S010Input in = new S010Input();
			in.setApplyrecordno("10000");
			in.setPageno("0");
			S010Output out = tradeDao.s010(in, callSession);
			for (S010OutputReturnlist o : out.getReturnlist()) {
				DsFundListQueryOutputDetail detail = new DsFundListQueryOutputDetail();
				detail.setFundCode(o.getFundcode());
				detail.setFundName(o.getFundname());
				detail.setFundType(o.getFundtype());
				if ("2".equals(o.getFundtype())) {
					detail.setNetValue(o.getHfincomeratio());
					detail.setTotalNetValue(o.getIncomeratio());
				} else {
					detail.setNetValue(o.getTotalnetvalue());
					detail.setTotalNetValue(o.getPernetvalue());
				}
				detail.setNavDate(o.getNavdate());
				if (!StringUtils.isNullOrEmpty(inputParam.getFundCode()) && inputParam.getFundCode().equals(o.getFundcode())) {
					output.getDetail().add(detail);
					break;
				} else if (StringUtils.isNullOrEmpty(inputParam.getFundCode())) {
					output.getDetail().add(detail);
				}
			}
			setSuccess(output);
		} catch (Exception e) {
			setCodeMsg(output, e);
		}
		return output;
	}

}
