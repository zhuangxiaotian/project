package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询基金显示列表功能输出参数
 */
public class ISFundShowListQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISFundShowListQueryOutputDetail> detail = new ArrayList<ISFundShowListQueryOutputDetail>();
	
	private List<ISFundShowListQueryOutputCategoryDetail> categoryDetail = new ArrayList<ISFundShowListQueryOutputCategoryDetail>();
	
	public ISFundShowListQueryOutput() {
		this.setZ_funcCode("n0n");
	}
	
	public List<ISFundShowListQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
	
	public List<ISFundShowListQueryOutputCategoryDetail> getCategoryDetail() {
		return this.categoryDetail;
	}
	
}
