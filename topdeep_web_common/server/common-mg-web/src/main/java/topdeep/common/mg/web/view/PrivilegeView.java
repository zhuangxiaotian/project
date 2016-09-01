/**
 * Project Name:wechat-mg-web
 * File Name:PrivilegeView.java
 * Package Name:topdeep.wechat.mg.web.view
 * Date:2015年3月24日上午9:48:44
 * Copyright (c) 2015, chenzhou1025@126.com All Rights Reserved.
 *
 */

package topdeep.common.mg.web.view;

import java.util.ArrayList;

/**
 * ClassName:PrivilegeView <br/>
 * Function: 权限信息视图 <br/>
 * Date: 2015年3月24日 上午9:48:44 <br/>
 * 
 * @author develop
 * @version
 * @see
 */
@SuppressWarnings("rawtypes")
public class PrivilegeView {
	private String privilegeName;

	private String privilegeGroup;
	private ArrayList operateList;

	public String getPrivilegeName() {
		return privilegeName;
	}

	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}

	public ArrayList getOperateList() {
		return operateList;
	}

	public void setOperateList(ArrayList operateList) {
		this.operateList = operateList;
	}

	public String getPrivilegeGroup() {
		return privilegeGroup;
	}

	public void setPrivilegeGroup(String privilegeGroup) {
		this.privilegeGroup = privilegeGroup;
	}

}
