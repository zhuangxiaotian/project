package topdeep.common.mg.entity.params;

import org.springframework.stereotype.Component;

@Component
public class CommonPageParam {

	private int rowsOfPage = 10;

	public int getRowsOfPage() {
		return rowsOfPage;
	}

	public void setRowsOfPage(int rowsOfPage) {
		this.rowsOfPage = rowsOfPage;
	}
	
}
