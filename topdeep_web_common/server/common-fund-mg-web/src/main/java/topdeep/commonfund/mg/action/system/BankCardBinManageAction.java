package topdeep.commonfund.mg.action.system;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import topdeep.common.entity.base.PageImpl;
import topdeep.common.util.UUIDGenerator;
import topdeep.commonfund.entity.db.FundBankCardBin;
import topdeep.commonfund.entity.db.FundBankCardBinExample;
import topdeep.commonfund.mg.action.base.BaseAction;
import topdeep.commonfund.mg.entity.FundPrivilegeConfig;
import topdeep.commonfund.mg.entity.request.BankCardBinRequest;
import topdeep.commonfund.mg.entity.response.BankCardBinResponse;
import topdeep.commonfund.mg.entity.response.BindInfoResponse;
import common.cache2.CacheException;
import common.dbvisit.DbException;
import common.privilege.PrivilegeOperate;
import common.util.StringUtils;
import common.util.excel.ExcelUtils;
import common.util.excel.ReadObjectValue;
import common.web.annotation.TopdeepMethodAttribute;

@Controller
@RequestMapping(value = "/system")
public class BankCardBinManageAction extends BaseAction {

	@TopdeepMethodAttribute
	@RequestMapping("/bankCardBinManage")
	public String execute(BankCardBinRequest req, Model model) {
		BankCardBinResponse res = new BankCardBinResponse();
		model.addAttribute("res", res);
		checkPrivilege(res, FundPrivilegeConfig.FUNC_BANK_CARD_BIN_MANAGE, PrivilegeOperate.Read);
		if (res.isSuccess()) {
		super.execute(req, res, false);
		}
		if (res.isSuccess()) {
			fundSystemBiz.setUploadType("0");
			return res.getTarget("/systemParam/bank-card-bin-success");
		}
		res.setTitle("银行卡Bin查询");
		return res.getTarget("/common/tip");
	}

	@TopdeepMethodAttribute
	@RequestMapping("/bankCardBinManage!ajaxQuery")
	@ResponseBody
	public BankCardBinResponse ajaxQuery(BankCardBinRequest req) {
		BankCardBinResponse res = new BankCardBinResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_BANK_CARD_BIN_MANAGE, PrivilegeOperate.Read);
		if (res.isSuccess()) {
		super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			try {
				FundBankCardBinExample condition = new FundBankCardBinExample();
					if (!StringUtils.isNullOrEmpty(req.getSearchKeyword())) {
						condition.or().andBankNoEqualTo(req.getSearchKeyword());
						condition.or().andBankCardBinEqualTo(req.getSearchKeyword());
					}
					condition.setOrderByClause("BANK_CARD_BIN asc");
				condition.setPage(new PageImpl(req.getPageIndex(), req.getRowsOfPage()));
				List<FundBankCardBin> fundBankCardBinList = fundSystemBiz.fundBankCardBinSelectObjects(condition);
				int count = fundSystemBiz.fundBankCardBinQuerySelectObjectsCount(condition);
				if (count > 0) {
					res.getPageData().setPageInfo(req.getPageIndex(), req.getRowsOfPage(), count);
				} else {
					res.getPageData().setPageInfo(0, req.getRowsOfPage(), 0);
				}
				res.setFundBankCardBinList(fundBankCardBinList);
				res.setResult(true, "查询成功");
				res.setTitle("银行卡Bin查询");
			} catch (Exception e) {
				logger.error("ajaxQuery!error", e);
				res.setResult(false, "银行卡Bin查询失败" + e.getMessage());
			}
		}
		return res;
	}

	@TopdeepMethodAttribute
	@RequestMapping("/bankCardBinManage!ajaxSave")
	@ResponseBody
	public BankCardBinResponse ajaxSave(BankCardBinRequest req) {
		BankCardBinResponse res = new BankCardBinResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_BANK_CARD_BIN_MANAGE, PrivilegeOperate.Write);
		if (res.isSuccess()) {
			super.execute(req, res, true);
			req.check(res);
		}
		if (res.isSuccess()) {
			try {
				FundBankCardBinExample example = new FundBankCardBinExample();
				example.or().andBankCardBinEqualTo(req.getBankCardBin().getBankCardBin());
				example.setPage(new PageImpl(0, 1));
				FundBankCardBin oldSeat = fundSystemBiz.selectSingleObject(fundSystemBiz.fundBankCardBinSelectObjects(example));
				FundBankCardBin bin = null;
				if (!StringUtils.isNullOrEmpty(req.getBankCardBin().getId())) {
					bin = fundSystemBiz.fundBankCardBinSelectByPrimaryKey(req.getBankCardBin().getId());
				}
				boolean newObj = bin == null;
				if (newObj) {
					if (oldSeat != null) {
						res.setResult(false, "卡Bin数据已存在,保存失败!请先删除原卡bin数据。");
					}
				} else {
					if (oldSeat != null) {
						if (!oldSeat.getId().equals(bin.getId())) {
							res.setResult(false, "卡Bin数据已存在,保存失败!请先删除原卡bin数据。");
						}
					}
				}
				if (res.isSuccess()) {
					if (newObj) {
						bin = new FundBankCardBin();
						bin.setId(UUIDGenerator.getUUID24());
						bin.setRowVersion(0);
						bin.setCreateTime(new Date());
						bin.setAuditTime(new Date());
						bin.setDeleted("0");
					}
					bin.setBankNo(req.getBankCardBin().getBankNo());
					bin.setBankName(req.getBankCardBin().getBankName());
					bin.setBankCardLength(req.getBankCardBin().getBankCardLength());
					bin.setBankCardBin(req.getBankCardBin().getBankCardBin());
					bin.setModifyTime(new Date());
					if (newObj) {
						fundSystemBiz.fundBankCardBinInsert(bin);
					} else {
						fundSystemBiz.fundBankCardBinUpdate(bin);
					}
					res.setTitle("银行卡Bin保存");
					res.setId(bin.getId());
					res.setRowVersion(bin.getRowVersion());
				}
			} catch (Exception e) {
				logger.error("ajaxQuery!error", e);
				res.setResult(false, "银行卡Bin保存失败" + e.getMessage());
			}
		}
		return res;
	}
	
	@TopdeepMethodAttribute
	@RequestMapping("/bankCardBinManage!ajaxDelete")
	@ResponseBody
	public BankCardBinResponse ajaxDelete(BankCardBinRequest req) {
		BankCardBinResponse res = new BankCardBinResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_BANK_CARD_BIN_MANAGE, PrivilegeOperate.Delete);
		if (res.isSuccess()) {
		super.execute(req, res, true);
		}
		res.checkStringEmpty(req.getBankCardBin().getId(), "数据ID不能为空");
		if (res.isSuccess()) {
			try {
				FundBankCardBin bin = fundSystemBiz.fundBankCardBinSelectByPrimaryKey(req.getBankCardBin().getId());
				if(bin != null){
					fundSystemBiz.fundBankCardBinDeleteByPrimaryKey(req.getBankCardBin().getId());
					res.setResult(true, "删除成功");
				}else{
					res.setResult(false, "删除失败,数据ID不存在");
				}
				res.setTitle("银行卡Bin删除");
			} catch (Exception e) {
				logger.error("ajaxQuery!error", e);
				res.setResult(false, "银行卡Bin删除失败" + e.getMessage());
			}
		}
		return res;
	}
	
	/**
	 * 导出
	 * @param req
	 * @param response
	 * @param model
	 * @return
	 * @throws IOException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws NoSuchMethodException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws DbException
	 * @throws SQLException
	 * @throws CacheException
	 * @throws ParseException
	 */
	@TopdeepMethodAttribute(loginRequired = true, isAjaxMethod = true)
	@RequestMapping(value = "/bankCardBinManage!ajaxExport")
	public void ajaxExportDataAnalysis(BankCardBinRequest req, HttpServletResponse response, Model model) throws IOException, SecurityException, IllegalArgumentException,
	NoSuchMethodException, IllegalAccessException, InvocationTargetException, DbException, SQLException, CacheException, ParseException {
		BankCardBinResponse res = new BankCardBinResponse();
		checkPrivilege(res,FundPrivilegeConfig.FUNC_BANK_CARD_BIN_MANAGE, PrivilegeOperate.Report);
		if (res.isSuccess()) {
			super.execute(req, res);
		}else{
			return;
		}
		if (res.isSuccess()) {
		try {
			if(res.isSuccess()){
				String fileName = "银行卡Bin数据";
				FundBankCardBinExample condition = new FundBankCardBinExample();
				if (!StringUtils.isNullOrEmpty(req.getSearchKeyword())) {
					condition.or().andBankNoEqualTo(req.getSearchKeyword());
					condition.or().andBankCardBinEqualTo(req.getSearchKeyword());
				}
				condition.setOrderByClause("BANK_CARD_BIN asc");
			condition.setPage(new PageImpl(req.getPageIndex(), req.getRowsOfPage()));
			List<FundBankCardBin> fundBankCardBinList = new ArrayList<FundBankCardBin>();
				// 设置response参数，可以打开下载页面
				response.reset();
				response.setContentType("application/vnd.ms-excel;charset=utf-8");
				response.setHeader("Content-Disposition", "attachment;filename=" + new String((fileName + ".xls").getBytes(), "iso-8859-1"));
				ServletOutputStream out = response.getOutputStream();
				BufferedInputStream bis = null;
				BufferedOutputStream bos = null;
				try {
					bis = new BufferedInputStream(this.getDataAnalysisExcelInputStream(fundBankCardBinList, "1", "12"));
					bos = new BufferedOutputStream(out);
					byte[] buff = new byte[2048];
					int bytesRead;
					while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
						bos.write(buff, 0, bytesRead);
					}
				} catch (Exception e) {
					res.setResult(false,e.getMessage());
				} finally {
					if (bis != null)
						bis.close();
					if (bos != null)
						bos.close();
				}
			}
		 } catch (Exception e) {
			logger.error("ajaxExport!error", e);
			res.setResult(false,e.getMessage());
		 }
		}
	}
	
	/**
	 * 
	 * @Title:  getDataAnalysisExcelInputStream   
	 * @Description:  封装--excel表格内容
	 * @param:  @param list
	 * @param:  @param sheetName
	 * @param:  @param fileName
	 * @param:  @return
	 * @param:  @throws IOException
	 * @param:  @throws SecurityException
	 * @param:  @throws IllegalArgumentException
	 * @param:  @throws NoSuchMethodException
	 * @param:  @throws IllegalAccessException
	 * @param:  @throws InvocationTargetException      
	 * @return:  InputStream      
	 * @throws
	 */
	public InputStream getDataAnalysisExcelInputStream(List<FundBankCardBin> list, String sheetName,String fileName) 
			throws IOException, SecurityException, IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException{
		String[] fieldNames = { "银行代码", "银行名称", "卡长度", "卡Bin"};
		String[] fields = new String[]{"bankNo","bankName","bankCardLength","bankCardBin"};
		ExcelUtils excelUtils = new ExcelUtils();
		return excelUtils.exportToExcel("银行卡Bin数据列表", list,fields ,fieldNames,  new ReadObjectValue() {
			public Object readValue(int row, int column, Object srcObj) {
					return srcObj;
			}
		});
	}
	
	@TopdeepMethodAttribute
	@RequestMapping("/bankCardBinManage!ajaxChangeType")
	@ResponseBody
	public BankCardBinResponse ajaxChangeType(BankCardBinRequest req) {
		BankCardBinResponse res = new BankCardBinResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_BANK_CARD_BIN_MANAGE, PrivilegeOperate.Write);
		if (res.isSuccess()) {
		super.execute(req, res, true);
		}
		res.checkStringEmpty(req.getType(), "导入如重复类型不能为空");
		if (res.isSuccess()) {
			try {
				fundSystemBiz.setUploadType(req.getType());
			} catch (Exception e) {
				logger.error("ajaxQuery!error", e);
				res.setResult(false, "ajaxChangeType失败" + e.getMessage());
			}
		}
		return res;
	}
	
	/**
     * @Description 上传Excel
     * @param req
     * @return
     */
	@TopdeepMethodAttribute
    @RequestMapping("/bankCardBinManage!ajaxUpload")
	@ResponseBody
    public void ajaxUpload(BankCardBinRequest req,HttpServletRequest request,@RequestParam MultipartFile file,HttpServletResponse response) throws IOException {
    	BankCardBinResponse res = new BankCardBinResponse();
    	checkPrivilege(res,FundPrivilegeConfig.FUNC_BANK_CARD_BIN_MANAGE, PrivilegeOperate.Report);
    	if(res.isSuccess()){
    		ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
    		InputStream is = file.getInputStream();
            int readCount = is.read(buf);
            while (readCount >= 0) {
                baos.write(buf, 0, readCount);
                readCount = is.read(buf);
            }
            is.close();
            byte[] inputData = baos.toByteArray();
            ByteArrayInputStream stream = new ByteArrayInputStream(inputData);
            Map<String, List<String>> mapPushInfoMap = new HashMap<String, List<String>>();
            List<FundBankCardBin> fundBankCardBinList = new ArrayList<FundBankCardBin>();
            HttpSession session=request.getSession();
            String url=(String) session.getAttribute("type");
            saveExcelToSession(stream, mapPushInfoMap, fundBankCardBinList);
          //读取数据库数据
            FundBankCardBinExample condition = new FundBankCardBinExample();
            try {
    			List<FundBankCardBin> fundBankCardBinList1 = fundSystemBiz.fundBankCardBinSelectObjects(condition);
    			List<String> cardBinList = new ArrayList<String>();
    			for(FundBankCardBin item : fundBankCardBinList1){
    				cardBinList.add(item.getBankCardBin());
    			}
    			boolean flag;
    			FundBankCardBin bin = null;
    			for(FundBankCardBin fundBankCardBin : fundBankCardBinList){
    				if(fundBankCardBin.getBankCardBin() == null){
    					continue;
    				}
    				if(fundBankCardBin.getBankCardBin().length() != 6){
    					continue;
    				}
    				try{
    					flag = true;
        				if(cardBinList.contains(fundBankCardBin.getBankCardBin())){
        					flag = false;
        				}else{
        					flag = true;
        				}
        				if(flag){
        					bin = new FundBankCardBin();
        					bin.setId(UUIDGenerator.getUUID24());
        					bin.setBankNo(formatBankNoData(fundBankCardBin.getBankNo()));
        					bin.setBankName(formatData(fundBankCardBin.getBankName()));
        					bin.setBankCardLength(Integer.parseInt(formatData(fundBankCardBin.getBankCardLength()))+"");
        					bin.setBankCardBin(Integer.parseInt(formatData(fundBankCardBin.getBankCardBin()))+"");
        					bin.setRowVersion(0);
        					bin.setCreateTime(new Date());
        					bin.setAuditTime(new Date());
        					bin.setDeleted("0");
        					bin.setModifyTime(new Date());
        					fundSystemBiz.fundBankCardBinInsert(bin);
        				 }else{
        					 if("0".equals(fundSystemBiz.getUploadType())){
        							continue;
        					}else if("1".equals(fundSystemBiz.getUploadType())){
        						bin = fundBankCardBin(fundBankCardBinList1,fundBankCardBin.getBankCardBin());
        							if(bin != null){
        								bin.setBankNo(formatBankNoData(fundBankCardBin.getBankNo()));
        								bin.setBankName(formatData(fundBankCardBin.getBankName()));
        								bin.setBankCardLength(formatData(fundBankCardBin.getBankCardLength()));
        								bin.setBankCardBin(formatData(fundBankCardBin.getBankCardBin()));
        								bin.setModifyTime(new Date());
        								fundSystemBiz.fundBankCardBinUpdate(bin);
        							}
        						}
        				 }
    				}catch(Exception e){
    					continue;
    				}
    				}
            } catch (Exception e) {
    			logger.error("ajaxUpload!error", e);
    			res.setResult(false,e.getMessage());
    		}
		}else{
			response.reset();
			PrintWriter out = response.getWriter();
			out.print("0^99999^没有管理权限");
			out.flush();
		}
    }
	
	private String formatData(String value){
	String str = "";
	int index = value.indexOf(".");
		if(index > 0){
			str = value.substring(0, index);
		}else{
			str = value;
		}
		return str;
	}
	
	private String formatBankNoData(String value){
		String str = "";
		if(value.indexOf("E")>0 || value.indexOf("e") >0){
			Double tmpDou = Double.parseDouble(value);//转换单元格值的类型为double类型
			value = tmpDou.longValue()+"";
		}
		int index = value.indexOf(".");
		if(index > 0){
			str = value.substring(0, index);
		}else{
			str = value;
		}
		return str;
	}
	
    private FundBankCardBin fundBankCardBin (List<FundBankCardBin> fundBankCardBinList,String bankCardBin) throws Exception{
    	FundBankCardBin cardBin = null;
    	for(FundBankCardBin item : fundBankCardBinList){
    		if(item.getBankCardBin().endsWith(bankCardBin)){
    			cardBin = item;
    		}
    	}
		return cardBin;
    }
    
    private void saveExcelToSession(ByteArrayInputStream stream, Map<String, List<String>> mapPushInfoMap, List<FundBankCardBin> fundBankCardBinList) {
        try {
            // 创建对Excel工作簿文件的引用
            HSSFWorkbook workbook = new HSSFWorkbook(stream);
            // 创建对工作表的引用。
            // 也可用getSheetAt(int index)按索引引用，
            // 在Excel文档中，第一张工作表的缺省索引是0，
            // 其语句为：HSSFSheet sheet = workbook.getSheetAt(0);
            // 读取左上端单元
            for (int i = 0; i < workbook.getNumberOfSheets(); i++) {// 循环sheet
                HSSFSheet childSheet = workbook.getSheetAt(i);
                for (int r = 1; r < childSheet.getPhysicalNumberOfRows(); r++) {
                	FundBankCardBin fundBankCardBin = new FundBankCardBin();
                    for (short c = 0; c < childSheet.getRow(r).getPhysicalNumberOfCells(); c++) {// 循环该子sheet行对应的单元格项
                        HSSFCell cell = childSheet.getRow(r).getCell(c);
                        String value = null;

                        if (cell == null)
                            continue;
                        switch (cell.getCellType()) {

                            case HSSFCell.CELL_TYPE_NUMERIC:
                                value = "" + cell.getNumericCellValue();
                                break;

                            case HSSFCell.CELL_TYPE_STRING:
                                value = cell.getStringCellValue();
                                break;
                            case HSSFCell.CELL_TYPE_BLANK:
                                ;
                                break;
                            default:
                        }
                        if (value != null) {
                            if (c == 0) {
                            	fundBankCardBin.setBankNo(formatBankNoData(value));
                            } else if (c == 1) {
                            	fundBankCardBin.setBankName(value);
                            } else if (c == 2) {
                            	fundBankCardBin.setBankCardLength(formatData(value));
                            }else if (c == 3) {
                               fundBankCardBin.setBankCardBin(formatData(value));
                                }
                        }
                    }
                    boolean flag = true;
                    for(FundBankCardBin item : fundBankCardBinList){
                    	if(item == null || fundBankCardBin == null || fundBankCardBin.getBankCardBin() == null){
                    		 flag = false;
                    	}else{
                    		if(item.getBankCardBin().equals(fundBankCardBin.getBankCardBin())){
                       		 flag = false;
                       	}
                    	}
                       }
                    if(flag){
                    	 fundBankCardBinList.add(fundBankCardBin);
                      }
                    }
                }
        } catch (Exception e) {
            logger.error("saveExcelToSession() " + e.getStackTrace(), e);
        }
    }
    
}
