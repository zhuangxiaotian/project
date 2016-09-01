package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 资产查询功能输出参数
 */
public class DsMyAssetsQueryOutput extends topdeep.commonfund.entity.ds.def.DsBaseOutput implements Serializable {
	
	/**
	 * 总资产,
	 */
	private String totalAssets;
	
	private List<DsMyAssetsQueryOutputDetail> detail = new ArrayList<DsMyAssetsQueryOutputDetail>();
	
	public DsMyAssetsQueryOutput() {
		this.setZ_funcCode("u0c");
	}
	
	/**
	 * 总资产,
	 */
	public String getTotalAssets() {
		return this.totalAssets;
	}
	
	/**
	 * 总资产,
	 */
	public void setTotalAssets(String value)
	 {
		this.totalAssets = value;
	}
	
	public List<DsMyAssetsQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
