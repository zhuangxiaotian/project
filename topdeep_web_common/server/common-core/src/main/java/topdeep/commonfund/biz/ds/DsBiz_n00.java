package topdeep.commonfund.biz.ds;
import topdeep.commonfund.entity.ds.def.*;
import java.util.*;
import java.io.*;
public interface DsBiz_n00 {
	
	/**
	 * 基金列表 
	 * @return 结果
	 */
	DsFundListQueryOutput fundListQuery(DsFundListQueryInput inputParam);
}
