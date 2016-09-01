/**   
* @Title: SystemMenu.java 
* @Package topdeep.wechat.mg.entity.system 
* @author Yewenhai   
* @date Dec 10, 2014 2:44:09 PM 
* @version V1.0   
*/
package topdeep.common.mg.entity.system;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: SystemMenu
 * @Description: 菜单
 * @author lei.yuan
 * @date Jan 21, 2016 2:44:09 PM
 * 
 */
public class SystemMenu {
	/**
	 * 菜单ID
	 */
	private int id;
	/**
	 * 菜单链接
	 */
	private String url;
	/**
	 * 菜单名称
	 */
	private String name;
	
	/**
	 * 图标类型
	 */
	private String iconClass;
	/**
	 * 菜单层级(0:顶级菜单, 1:子菜单)
	 */
	private int level;
	/**
	 * 父菜单ID
	 */
	private int parentId;
	/**
	 * 子菜单
	 */
	private List<SystemMenu> childList = new ArrayList<SystemMenu>();
	/**
	 * 打开菜单所需要的权限模块
	 */
	private int privilegeFunc;
	
	/**
	 * 打开权限所需要的操作
	 */
	private int privilegeOperate;

	public SystemMenu(int id, int parentId, String url, String name, int level, String iconClass) {
		this.id = id;
		this.parentId = parentId;
		this.url = url;
		this.name = name;
		this.level = level;
		this.iconClass = iconClass;
	}
	
	public SystemMenu(int id, int parentId, String url, String name, int level, int privilegeFunc, int privilegeOperate, String iconClass) {
		this.id = id;
		this.parentId = parentId;
		this.url = url;
		this.name = name;
		this.level = level;
		this.privilegeFunc = privilegeFunc;
		this.privilegeOperate = privilegeOperate;
		this.iconClass = iconClass;
	}
	
	public List<SystemMenu> getChildList() {
		return childList;
	}


	public void setChildList(List<SystemMenu> childList) {
		this.childList = childList;
	}


	public boolean isHasChild() {
		return childList.size() > 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}




	public int getParentId() {
		return parentId;
	}




	public void setParentId(int parentId) {
		this.parentId = parentId;
	}




	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	* @Title: addChildMenu 
	* @Description: 添加子菜单
	* @param @param childMenu    设定文件 
	* @return void    返回类型 
	* @throws
	 */
	public void addChildMenu(SystemMenu childMenu) {
		childList.add(childMenu);
	}


	/**
	 * @return the privilegeFunc
	 */
	public int getPrivilegeFunc() {
		return privilegeFunc;
	}


	/**
	 * @param privilegeFunc the privilegeFunc to set
	 */
	public void setPrivilegeFunc(int privilegeFunc) {
		this.privilegeFunc = privilegeFunc;
	}


	/**
	 * @return the privilegeOperate
	 */
	public int getPrivilegeOperate() {
		return privilegeOperate;
	}


	/**
	 * @param privilegeOperate the privilegeOperate to set
	 */
	public void setPrivilegeOperate(int privilegeOperate) {
		this.privilegeOperate = privilegeOperate;
	}


	/**
	 * @return the iconClass
	 */
	public String getIconClass() {
		return iconClass;
	}


	/**
	 * @param iconClass the iconClass to set
	 */
	public void setIconClass(String iconClass) {
		this.iconClass = iconClass;
	}
	
	
	
	

}
