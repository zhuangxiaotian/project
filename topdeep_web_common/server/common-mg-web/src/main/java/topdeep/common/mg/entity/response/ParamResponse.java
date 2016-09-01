package topdeep.common.mg.entity.response;

import java.util.ArrayList;
import java.util.List;

import topdeep.common.entity.db.SystemParam;

public class ParamResponse extends PageResponse{

	private List<SystemParam> paramList = new ArrayList<SystemParam>();

	public List<SystemParam> getParamList() {
		return paramList;
	}

	public void setParamList(List<SystemParam> paramList) {
		this.paramList = paramList;
	}
	
}
