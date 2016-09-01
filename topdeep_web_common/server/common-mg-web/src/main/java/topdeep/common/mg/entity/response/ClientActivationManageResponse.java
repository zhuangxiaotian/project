package topdeep.common.mg.entity.response;

import java.util.ArrayList;
import java.util.List;

import topdeep.common.entity.db.SystemClientActivation;
import topdeep.common.entity.view.SystemClientActivationManageView;
import topdeep.common.mg.entity.response.PageResponse;

public class ClientActivationManageResponse extends PageResponse {

	private int paramInt;
	/**
	 * 客户端激活量数据分析集合
	 */
	private List<SystemClientActivation> clientActivationList = new ArrayList<SystemClientActivation>();

	private List<SystemClientActivationManageView> clientActivationList1 = new ArrayList<SystemClientActivationManageView>();

	public List<SystemClientActivationManageView> getClientActivationList1() {
		return clientActivationList1;
	}

	public void setClientActivationList1(List<SystemClientActivationManageView> clientActivationList1) {
		this.clientActivationList1 = clientActivationList1;
	}

	public int getParamInt() {
		return paramInt;
	}

	public void setParamInt(int paramInt) {
		this.paramInt = paramInt;
	}

	public List<SystemClientActivation> getClientActivationList() {
		return clientActivationList;
	}

	public void setClientActivationList(List<SystemClientActivation> clientActivationList) {
		this.clientActivationList = clientActivationList;
	}

}