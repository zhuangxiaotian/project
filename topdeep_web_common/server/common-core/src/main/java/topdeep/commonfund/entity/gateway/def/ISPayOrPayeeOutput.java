package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 收款或付款功能输出参数
 */
public class ISPayOrPayeeOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	public ISPayOrPayeeOutput() {
		this.setZ_funcCode("m0b");
	}
}
