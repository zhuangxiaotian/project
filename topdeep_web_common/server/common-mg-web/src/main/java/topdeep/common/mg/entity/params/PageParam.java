package topdeep.common.mg.entity.params;

import org.springframework.stereotype.Component;

import topdeep.common.entity.db.SystemParam;

@Component
public class PageParam extends SystemParam {

	private int rowsOfPage = 10;

	public int getRowsOfPage() {
		return rowsOfPage;
	}

	public void setRowsOfPage(int rowsOfPage) {
		this.rowsOfPage = rowsOfPage;
	}
	
}
