package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 取消收付款功能输出参数
 */
public class ISPayOrPayeeCancelOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	public ISPayOrPayeeCancelOutput() {
		this.setZ_funcCode("m0d");
	}
}
