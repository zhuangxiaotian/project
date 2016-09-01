package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 字典查询功能输出参数
 */
public class ISBaseInfoQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISBaseInfoQueryOutputDetail> detail = new ArrayList<ISBaseInfoQueryOutputDetail>();
	
	public ISBaseInfoQueryOutput() {
		this.setZ_funcCode("b06");
	}
	
	public List<ISBaseInfoQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
