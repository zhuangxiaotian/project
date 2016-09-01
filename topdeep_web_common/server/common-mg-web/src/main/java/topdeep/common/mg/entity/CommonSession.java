package topdeep.common.mg.entity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import topdeep.common.entity.ManageSession;

import common.util.StringUtils;

/**
 * 
 * @author shidewen
 * 
 */
public class CommonSession extends ManageSession {

	private static final long serialVersionUID = 2402202552240282586L;

	/**
	 * 当前是否登录
	 */
	private boolean isLogin;

	/**
	 * 当前登录用户的权限
	 */
	private Map<Integer, Integer> privileges = new HashMap<Integer, Integer>();

	/**
	 * 数据库中的权限Map
	 */
	// private Map<Integer, SystemPrivilege> privilegeMap = new HashMap<Integer, SystemPrivilege>();

	public boolean isLogin() {
		return isLogin && !StringUtils.isNullOrEmpty(loginUserId);
	}

	public void setLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}

	public void logout() {
		removeAllPrivileges();
		isLogin = false;
		data.clear();
		// privilegeMap.clear();
		manageSessionClear();
	}

	/**
	 * 
	 * @Title: addPrivilege
	 * @Description: 给登录的用户添加权限
	 * @param @param privilege 权限值
	 * @return void 返回类型
	 * @throws
	 */
	public void addPrivilege(String privilegeValue) {
		if (null == privilegeValue) {
			return;
		}
		String[] privilegeList = privilegeValue.split(",");
		for (int i = 0; i < privilegeList.length; i++) {
			String pristrvalue = privilegeList[i].trim();
			if (pristrvalue.equals("")) {
				continue;
			}
			int priValue = Integer.parseInt(pristrvalue.trim());
			int func = priValue >> 8; // 功能
			int oper = priValue & 0xff; // 操作
			if (privileges.containsKey(func)) {
				int value = ((Integer) privileges.get(func)).intValue();
				value = value | oper;// 进行与或操作,判断权限值是否相同
				privileges.remove(func);
				privileges.put(func, value);
			} else {
				privileges.put(func, oper);
			}
		}
	}

	public void removeAllPrivileges() {
		privileges.clear();
	}

	/**
	 * 
	 * @Title: getPrivilegeString
	 * @Description: 获取权限字符窜
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	public String getPrivilegeString() {
		Set<Integer> keys = privileges.keySet();
		Iterator<Integer> iter = keys.iterator();
		StringBuilder sb = new StringBuilder();
		while (iter.hasNext()) {
			Integer func = iter.next();
			Integer operate = privileges.get(func);
			if (!"".equals(sb.toString())) {
				sb.append(",");
			}
			sb.append((func << 8) + operate);
		}

		return sb.toString();
	}

	/**
	 * 
	 * @Title: hasPrivilege
	 * @Description: 判断用户是否有指定功能指定操作的权限
	 * @param @param func 功能
	 * @param @param operate 权限
	 * @param @return 设定文件
	 * @return boolean 返回类型
	 * @throws
	 */
	public boolean hasPrivilege(int func, int operate) {
		// if (!privilegeMap.containsKey(func)) {
		// return false;
		// }
		// if (operator.getParentAdminId().equals(UUIDGenerator.PARENT_ID)) {
		// return true;
		// }
		if (func <= 0) {
			return true;
		}
		if (!privileges.containsKey(func)) {
			return false;
		}
		if ((privileges.get(func) & operate) != 0) {
			return true;
		}
		return false;
	}

	public Map<Integer, Integer> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(Map<Integer, Integer> privileges) {
		this.privileges = privileges;
	}

	// public Map<Integer, SystemPrivilege> getPrivilegeMap() {
	// return privilegeMap;
	// }
	//
	// public void setPrivilegeMap(Map<Integer, SystemPrivilege> privilegeMap) {
	// this.privilegeMap = privilegeMap;
	// }
}
