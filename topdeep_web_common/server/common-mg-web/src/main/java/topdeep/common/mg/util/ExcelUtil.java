package topdeep.common.mg.util;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import topdeep.common.entity.db.SystemAdminLog;
import topdeep.common.entity.db.SystemClientActivation;
import topdeep.common.entity.view.SystemClientActivationManageView;
import topdeep.common.mg.entity.view.StatDetailView;
import topdeep.commonfund.entity.db.FundCustomerLog;

import common.util.excel.ExcelUtils;
import common.util.excel.ReadObjectValue;

@Service("excelUtil")
public class ExcelUtil {

	protected static Log log = LogFactory.getLog(ExcelUtil.class);

	public InputStream getCustomerInfoExcelInputStream(List<FundCustomerLog> list, String sheetName, String fileName) throws IOException, SecurityException,
			IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		String[] fieldNames = {
				"客户编号", "客户证件类型", "客户证件号码", "来源", "访问时间", "访问类型", "参数1", "参数2", "参数3"
		};
		String[] fields = new String[] {
				"customerNo", "idType", "idNo", "clientSrc", "actionTime", "actionType", "actionParam1", "actionParam1", "actionParam2"
		};
		ExcelUtils excelUtils = new ExcelUtils();
		return excelUtils.exportToExcel("用户操作日志列表", list, fields, fieldNames, new ReadObjectValue() {
			public Object readValue(int row, int column, Object srcObj) {
				return srcObj;
			}
		});
	}

	public InputStream getOperateLogExcelInputStream(List<SystemAdminLog> list, String sheetName, String fileName) throws IOException, SecurityException,
			IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		String[] fieldNames = {
				"操作员ID", "操作员名称", "操作时间", "操作类型", "操作内容"
		};
		String[] fields = new String[] {
				"operatorId", "operatorName", "operateTime", "operateType", "operateContent"
		};
		ExcelUtils excelUtils = new ExcelUtils();
		return excelUtils.exportToExcel("系统操作日志列表", list, fields, fieldNames, new ReadObjectValue() {
			public Object readValue(int row, int column, Object srcObj) {
				return srcObj;
			}
		});
	}

	public InputStream getCustomerLogStatisticsExcelInputStream(List<StatDetailView> list, String sheetName, String fileName) throws IOException,
			SecurityException, IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		String[] fieldNames = {
				"业务操作", "近一周统计", "近一个月统计", "近一个季度统计", "全部统计"
		};
		String[] fields = new String[] {
				"statType", "value1", "value2", "value3", "value4"
		};
		ExcelUtils excelUtils = new ExcelUtils();
		return excelUtils.exportToExcel("数据统计分析列表", list, fields, fieldNames, new ReadObjectValue() {
			public Object readValue(int row, int column, Object srcObj) {
				return srcObj;
			}
		});
	}

	public InputStream getClientActivationExcelInputStream(List<SystemClientActivationManageView> list, String[] groupMethodName, String[] groupMethod)
			throws IOException, SecurityException, IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		ExcelUtils excelUtils = new ExcelUtils();
		return excelUtils.exportToExcel("客户端激活量分析列表", list, groupMethod, groupMethodName, new ReadObjectValue() {
			public Object readValue(int row, int column, Object srcObj) {
				return srcObj;
			}
		});
	}

	public InputStream getClientActivationExcelInputStream1(List<SystemClientActivation> list, String[] groupMethodName, String[] groupMethod)
			throws IOException, SecurityException, IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		ExcelUtils excelUtils = new ExcelUtils();
		return excelUtils.exportToExcel("客户端激活量分析列表", list, groupMethod, groupMethodName, new ReadObjectValue() {
			public Object readValue(int row, int column, Object srcObj) {
				return srcObj;
			}
		});
	}

}
