/**
 * 
 */
package topdeep.common.mg.entity.response;

/**
 * @author niexin
 *
 */
public class ViewTemplate {
	private String main;
	private String nav;
	private String head;
	private String page;
	private String noPrivilege;

	/**
	 * @return the main
	 */
	public String getMain() {
		return main;
	}

	/**
	 * @param main the main to set
	 */
	public void setMain(String main) {
		this.main = main;
	}

	/**
	 * @return the page
	 */
	public String getPage() {
		return page;
	}

	/**
	 * @param page the page to set
	 */
	public void setPage(String page) {
		this.page = page;
	}

	/**
	 * @return the nav
	 */
	public String getNav() {
		return nav;
	}

	/**
	 * @param nav the nav to set
	 */
	public void setNav(String nav) {
		this.nav = nav;
	}

	/**
	 * @return the head
	 */
	public String getHead() {
		return head;
	}

	/**
	 * @param head the head to set
	 */
	public void setHead(String head) {
		this.head = head;
	}

	public String getNoPrivilege() {
		return noPrivilege;
	}

	public void setNoPrivilege(String noPrivilege) {
		this.noPrivilege = noPrivilege;
	}

}
