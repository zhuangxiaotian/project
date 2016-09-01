package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询资讯分类功能输出参数
 */
public class ISNewsCategoryListQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 返回记录数,返回的明细数据项长度
	 */
	private Integer rowsCount;
	
	private List<ISNewsCategoryListQueryOutputDetail> detail = new ArrayList<ISNewsCategoryListQueryOutputDetail>();
	
	public ISNewsCategoryListQueryOutput() {
		this.setZ_funcCode("n00");
	}
	
	/**
	 * 返回记录数,返回的明细数据项长度
	 */
	public Integer getRowsCount() {
		return this.rowsCount;
	}
	
	/**
	 * 返回记录数,返回的明细数据项长度
	 */
	public void setRowsCount(Integer value)
	 {
		this.rowsCount = value;
	}
	
	public List<ISNewsCategoryListQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
