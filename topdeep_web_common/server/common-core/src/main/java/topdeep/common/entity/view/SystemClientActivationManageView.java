package topdeep.common.entity.view;

import topdeep.common.entity.base.BaseEntity;

import common.entity.Page;

public class SystemClientActivationManageView extends BaseEntity {
	/**
	 * 设备标志
	 */
	private String deviceId;
	/**
	 * 客户端屏幕宽度
	 */
	private String clientScreenWidth;
	/**
	 * 激活状态 0 无效 1有效，表示最后激活的相同设备
	 */
	private String state;
	/**
	 * 下载渠道
	 */
	private String channel;
	/**
	 * 设备型号
	 */
	private String clientModel;
	/**
	 * 客户端屏幕密度
	 */
	private String clientScreenDensity;
	/**
	 * 客户端屏幕高度
	 */
	private String clientScreenHeight;
	/**
	 * 客户端类型
	 */
	private String clientType;
	/**
	 * 客户端版本
	 */
	private String clientVersion;

	/**
	 * 客户端操作系统版本
	 */
	private String clientOsVersion;

	/**
	 * 开始时间
	 */
	private String startDate;
	/**
	 * 结束时间
	 */
	private String endDate;
	/**
	 * 需要显示的列和总数的条件
	 */
	private String groupMethod;
	/**
	 * 客户端操作系统
	 */
	private String clientOs;

	protected Page page;

	private Integer total;
	protected String orderByClause;

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getClientScreenWidth() {
		return clientScreenWidth;
	}

	public void setClientScreenWidth(String clientScreenWidth) {
		this.clientScreenWidth = clientScreenWidth;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getClientModel() {
		return clientModel;
	}

	public void setClientModel(String clientModel) {
		this.clientModel = clientModel;
	}

	public String getClientScreenDensity() {
		return clientScreenDensity;
	}

	public void setClientScreenDensity(String clientScreenDensity) {
		this.clientScreenDensity = clientScreenDensity;
	}

	public String getClientScreenHeight() {
		return clientScreenHeight;
	}

	public void setClientScreenHeight(String clientScreenHeight) {
		this.clientScreenHeight = clientScreenHeight;
	}

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getClientOsVersion() {
		return clientOsVersion;
	}

	public void setClientOsVersion(String clientOsVersion) {
		this.clientOsVersion = clientOsVersion;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getGroupMethod() {
		return groupMethod;
	}

	public void setGroupMethod(String groupMethod) {
		this.groupMethod = groupMethod;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public Page getPage() {
		return page;
	}

	public String getClientVersion() {
		return clientVersion;
	}

	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
	}

	public String getClientOs() {
		return clientOs;
	}

	public void setClientOs(String clientOs) {
		this.clientOs = clientOs;
	}

}
