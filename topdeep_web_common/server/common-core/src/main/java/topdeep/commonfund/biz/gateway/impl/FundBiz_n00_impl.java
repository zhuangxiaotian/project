package topdeep.commonfund.biz.gateway.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import topdeep.commonfund.biz.gateway.FundBiz_n00;
import topdeep.commonfund.entity.ds.def.DsFundListQueryInput;
import topdeep.commonfund.entity.ds.def.DsFundListQueryOutput;
import topdeep.commonfund.entity.ds.def.DsFundListQueryOutputDetail;
import topdeep.commonfund.entity.gateway.def.ISFundListQueryInput;
import topdeep.commonfund.entity.gateway.def.ISFundListQueryOutput;
import topdeep.commonfund.entity.gateway.def.ISFundListQueryOutputDetail;
import topdeep.commonfund.entity.gateway.def.ISHisNetValueQueryInput;
import topdeep.commonfund.entity.gateway.def.ISHisNetValueQueryOutput;
import topdeep.commonfund.entity.gateway.def.ISNetValueQueryInput;
import topdeep.commonfund.entity.gateway.def.ISNetValueQueryOutput;
import topdeep.commonfund.entity.gateway.def.ISNewsCategoryListQueryInput;
import topdeep.commonfund.entity.gateway.def.ISNewsCategoryListQueryOutput;
import topdeep.commonfund.entity.gateway.def.ISNewsListQueryInput;
import topdeep.commonfund.entity.gateway.def.ISNewsListQueryOutput;
import topdeep.commonfund.entity.gateway.def.ISNewsQueryInput;
import topdeep.commonfund.entity.gateway.def.ISNewsQueryOutput;
import topdeep.commonfund.entity.gateway.def.ISResourceQueryInput;
import topdeep.commonfund.entity.gateway.def.ISResourceQueryOutput;

public class FundBiz_n00_impl extends FundBizImplBase implements FundBiz_n00 {

	public ISNewsCategoryListQueryOutput newsCategoryListQuery(ISNewsCategoryListQueryInput inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

	public ISNewsListQueryOutput newsListQuery(ISNewsListQueryInput inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

	public ISNewsQueryOutput newsQuery(ISNewsQueryInput inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

	public ISResourceQueryOutput resourceQuery(ISResourceQueryInput inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

	public ISFundListQueryOutput fundListQuery(ISFundListQueryInput inputParam) {
		ISFundListQueryOutput output = new ISFundListQueryOutput();
		try {
			DsFundListQueryInput input = new DsFundListQueryInput();
			input.setFundCode(inputParam.getFundCode());
			DsFundListQueryOutput out = dsDao.fundListQuery(input);
			for (DsFundListQueryOutputDetail de : out.getDetail()) {
				ISFundListQueryOutputDetail detail = new ISFundListQueryOutputDetail();
				detail.setFundCode(de.getFundCode());
				detail.setFundName(de.getFundName());
				detail.setNetValue(de.getNetValue());
				detail.setTotalNetValue(de.getTotalNetValue());
				detail.setPriceDate(new SimpleDateFormat("yyyyMMdd").parse(de.getNavDate()));
				output.getDetail().add(detail);
			}
			setSuccess(output);
		} catch (ParseException ex) {
			logger.error(ex.getMessage(), ex);
			setCodeMsg(output, ex);
		}
		return null;
	}

	public ISNetValueQueryOutput netValueQuery(ISNetValueQueryInput inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

	public ISHisNetValueQueryOutput hisNetValueQuery(ISHisNetValueQueryInput inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

}
