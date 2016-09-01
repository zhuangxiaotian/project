BankCardBinManage = {};
var grid;
BankCardBinManage.gridData=[];
BankCardBinManage.plugin = new Slick.AutoTooltips();
BankCardBinManage.contextPath=contextPath;
var PageUtil;

BankCardBinManage.initPage = function(){
	$("#pass").val("0");
	$("#pass").attr("checked","checked");
	BankCardBinManage.initGrid();
	PageUtil = new TopdeepUtil.pageUtil(null,BankCardBinManage.ajaxQuery,"");
	PageUtil.initPage();
	BankCardBinManage.ajaxQuery(0);
	
	$(document).on("click", ".commitRow", function() {
		var row = $(this).attr("row");
		var item = BankCardBinManage.gridData[row];
		if(BankCardBinManage.check(item)){
			BankCardBinManage.ajaxSave(BankCardBinManage.gridData[row], row);
		}
		return false;
	});
	
	$(document).on("click", ".deleteRow", function() {
		var row = $(this).attr("row");
		var item = BankCardBinManage.gridData[row];
		 if(confirm("确认删除吗？")){
			 BankCardBinManage.ajaxDelete(BankCardBinManage.gridData[row],row);
		}
		return false;
	});
	
	$("#bin_search_button").click(function(){
		BankCardBinManage.ajaxQuery(0);
	});
	
	$("#down_load_button1").click(function(){
		BankCardBinManage.exportToExcel();
	});
	
	$("#pass").on("click", function(){
		if($(this).attr("checked") == "checked"){
			$(this).val("");
			$(this).removeAttr("checked");
		}else{
			$(this).val("0");
			$(this).attr("checked","checked");
		}
		$("#overWrite").removeAttr("checked");
		$("#overWrite").val("");
		BankCardBinManage.ajaxChangeType($(this).val());
	});
	
	$("#overWrite").on("click", function(){
		if($(this).attr("checked") == "checked"){
			$(this).val("");
			$(this).removeAttr("checked");
		}else{
		$(this).val("1");
		$(this).attr("checked","checked");
		}
		$("#pass").removeAttr("checked");
		$("#pass").val("");
		BankCardBinManage.ajaxChangeType($(this).val());
	});
	
}

BankCardBinManage.ajaxChangeType = function(type) {
	$.ajax({
				type : "POST",
				url : BankCardBinManage.contextPath
						+ "/system/bankCardBinManage!ajaxChangeType.action",
				data : {
					"type":type
				},
				datatype : "json",
				success : function(result) {
					try {
						if (result.success) {
							
						} else {
							alert(result.tipMessage);
						}
					} catch (e) {
						alert(e)
					}
				},
				error : function() {
				}
			});
}

BankCardBinManage.check1 = function(){
if($("#pass").val() == "" && $("#overWrite").val() == ""){
	alert("导入如重复类型不能为空");
	return false;
}	
return true;
}

//导出
BankCardBinManage.exportToExcel  = function(){
	var searchKeyword = $("#searchKeyword").val();
	document.location.href= BankCardBinManage.contextPath + "/system/bankCardBinManage!ajaxExport.action?searchKeyword="+searchKeyword;
};

//导入
BankCardBinManage.ajaxResourceAdd = function() {
	if(BankCardBinManage.check1()){
		// file验证
		var file = document.getElementById('fileToUpload').files[0];
		if (file) {
			if (file.type.indexOf("excel") > 0) {
				if (file.size > 8192000) {
					alert('您这张"' + file.name + '"资源大小过大，应小于8M');
					return false;
				}
			}else{
				alert("请上传Excel资源");
				return false;
			}
		} else {
			alert("请重新选择资源");
			return false;
		}
		$.ajaxFileUpload({
			url : BankCardBinManage.contextPath + "/system/bankCardBinManage!ajaxUpload.action", // 需要链接到服务器地址
			secureuri : false, // 是否启用安全提交,默认为false
			fileElementId : 'fileBrother', // 文件选择框的id属性
			dataType : 'text', // 服务器返回的格式，可以是json、xml
			success : function(data, status) {
				// ajaxFileUpload会对服务器响应回来的text内容加上<pre>text</pre>前后缀
					var start = data.indexOf(">");
					var end = data.lastIndexOf("<");
					data = data.substring(start + 1, end);
					if (data.substring(0, 1) == 0) { // 0表示上传成功,1表示失败
						var list = data.split("^");
						var errorCode = list[1];
						if(errorCode == "99999"){
							alert("没有管理权限");
						}else{
							alert("上传成功");
						}
					BankCardBinManage.ajaxQuery();
				} else {
					alert(result.tipMessage);
					$("#closeBtn").click();
				}
			},
			error : function(data, status, e) {
				$("#closeBtn").click();
				alert("excel上传失败，请重试！");
			}
		});
	}
};

BankCardBinManage.check = function(item){
	 var reg = new RegExp("^[0-9]*$");
	if(item.bankNo == undefined || item.bankNo == ""){alert("银行代码不能为空");return false;}
	if(item.bankName == undefined || item.bankName == ""){alert("银行名称不能为空");return false;}
	if(item.bankCardLength == undefined || item.bankCardLength == ""){alert("卡长度不能为空");return false;}
	if(!reg.test(item.bankCardLength)){  
        alert("卡长度请输入数字!");
        return false;
    }
	if(item.bankCardBin == undefined || item.bankCardBin == ""){alert("卡Bin不能为空");return false;}
	if(!reg.test(item.bankCardBin)){  
        alert("卡Bin请输入数字!");
        return false;
    }
	if(item.bankCardBin.length != 6){  
        alert("卡Bin只能是6位数字!");
        return false;
    } 
	return true;
}

BankCardBinManage.initGrid = function() {
	var columns = [ {
		id : "bankNo",
		name : "银行代码",
		field : "bankNo",
		editor : Slick.Editors.Text
	},{
		id : "bankName",
		name : "银行名称",
		field : "bankName",
		editor : Slick.Editors.Text
	} ,{
		id : "bankCardLength",
		name : "卡长度",
		field : "bankCardLength",
		editor : Slick.Editors.Text
	},{
		id : "bankCardBin",
		name : "卡Bin",
		field : "bankCardBin",
		editor : Slick.Editors.Text
	}, {
		id : "operate",
		name : "操作",
		field : "",
		formatter : BankCardBinManage.operate
	} ];

	var options = {
		autoEdit : true,
		editable : true,
		enableAddRow : true,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight :30
	};
	grid = new Slick.Grid("#grid", BankCardBinManage.gridData, columns, options);
	BankCardBinManage.grid = grid;
	grid.registerPlugin(BankCardBinManage.plugin);
	grid.autosizeColumns();
	
	BankCardBinManage.grid.onAddNewRow.subscribe(function(e, args) {
		var item = args.item;
		BankCardBinManage.grid.invalidateRow(BankCardBinManage.gridData.length);
		BankCardBinManage.gridData.push(item);
		item.changed = true;
		item.isNew = true;
		BankCardBinManage.grid.updateRowCount();
		BankCardBinManage.grid.render();
	});

	BankCardBinManage.grid.onCellChange.subscribe(function(e, args) {
		var item = args.item;
		item.changed = true;
		item.isNew=false;
		BankCardBinManage.grid.updateRow(args.row);
	});
}

BankCardBinManage.operate = function(row, cell, value, columnDef, dataContext) {
	var item = BankCardBinManage.gridData[row];
	var ret = "";
	if(item.changed){
		$("#"+row).show();
		ret+= "<input id = '" + row + "' row = '" + row + "' type='button' class='commitRow btn btn-default' value='保存'/>";
	}
	if(item.id != undefined){
		ret += "<input type='button' class='deleteRow btn btn-default' row='" + row + "' value='删除'/>"; 
	}
	return ret;
}

BankCardBinManage.ajaxQuery = function(pageIndex) {
	$.ajax({
				type : "POST",
				url : BankCardBinManage.contextPath
						+ "/system/bankCardBinManage!ajaxQuery.action",
				data : {
					"pageIndex" : pageIndex,
					"searchKeyword":$("#searchKeyword").val()
				},
				datatype : "json",
				success : function(result) {
					try {
						if (result.success) {
							BankCardBinManage.gridData = result.fundBankCardBinList;
							grid.setData(BankCardBinManage.gridData);
							grid.render();
							PageUtil.pageData = result.pageData;
							PageUtil.refreshPage();
						} else {
							alert(result.tipMessage);
						}
					} catch (e) {
						alert(e)
					}
				},
				error : function() {
				}
			});
}

BankCardBinManage.ajaxSave = function(obj, row) {
	$.ajax({
				type : "POST",
				url : BankCardBinManage.contextPath
						+ "/system/bankCardBinManage!ajaxSave.action",
				data : {
					"bankCardBin.id":obj.id,"bankCardBin.bankNo":obj.bankNo,"bankCardBin.bankName":obj.bankName,"bankCardBin.bankCardLength":obj.bankCardLength,"bankCardBin.bankCardBin":obj.bankCardBin 
				},
				datatype : "json",
				success : function(result) {
					try {
						if (result.success) {
							alert("保存成功!");
							if(BankCardBinManage.gridData[row].rowVersion == undefined || BankCardBinManage.gridData[row].rowVersion == null){
								$("#"+row).attr("value","删除");
								$("#"+row).attr("class","deleteRow btn btn-default");
							}else{
								$("#"+row).hide();
							}
							BankCardBinManage.gridData[row].changed = false;
							BankCardBinManage.gridData[row].rowVersion = result.rowVersion;
							BankCardBinManage.gridData[row].id = result.id;
						} else {
							alert(result.tipMessage);
						}
					} catch (e) {
						alert(e)
					}
				},
				error : function() {
				}
			});
}

BankCardBinManage.ajaxDelete = function(obj, row) {
	$.ajax({
				type : "POST",
				url : BankCardBinManage.contextPath
						+ "/system/bankCardBinManage!ajaxDelete.action",
				data : {
					"bankCardBin.id":obj.id
				},
				datatype : "json",
				success : function(result) {
					try {
						if (result.success) {
							var list1 =BankCardBinManage.gridData.slice(0,row);
							var list2 =BankCardBinManage.gridData.slice(parseInt(row)+1,BankCardBinManage.gridData.length);
							BankCardBinManage.gridData = [];
							BankCardBinManage.gridData = BankCardBinManage.gridData.concat(list1,list2);
							BankCardBinManage.grid.setData(BankCardBinManage.gridData);	
							BankCardBinManage.grid.render();
						} else {
							alert(result.tipMessage);
						}
					} catch (e) {
						alert(e)
					}
				},
				error : function() {
				}
			});
}