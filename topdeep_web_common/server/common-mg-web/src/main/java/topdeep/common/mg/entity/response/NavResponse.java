package topdeep.common.mg.entity.response;

import java.util.List;

import topdeep.common.entity.constant.NameValue;
import topdeep.common.mg.entity.system.SystemMenu;

public class NavResponse extends BaseResponse {
	private List<SystemMenu> menuList;

	private List<NameValue> rightMenuList;

	private List<NameValue> switchMenuList;

	/**
	 * @return the menuList
	 */
	public List<SystemMenu> getMenuList() {
		return menuList;
	}

	/**
	 * @param menuList the menuList to set
	 */
	public void setMenuList(List<SystemMenu> menuList) {
		this.menuList = menuList;
	}

	public List<NameValue> getRightMenuList() {
		return rightMenuList;
	}

	public void setRightMenuList(List<NameValue> rightMenuList) {
		this.rightMenuList = rightMenuList;
	}

	/**
	 * @return the switchMenuList
	 */
	public List<NameValue> getSwitchMenuList() {
		return switchMenuList;
	}

	/**
	 * @param switchMenuList the switchMenuList to set
	 */
	public void setSwitchMenuList(List<NameValue> switchMenuList) {
		this.switchMenuList = switchMenuList;
	}

}
