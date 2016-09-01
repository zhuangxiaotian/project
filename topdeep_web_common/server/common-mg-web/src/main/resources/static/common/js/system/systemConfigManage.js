var SystemConfigManage = {};
SystemConfigManage.contextPath =contextPath;
var grid;
SystemConfigManage.gridData = [];
SystemConfigManage.PageUtil;
SystemConfigManage.ajaxQuery = function(pageIndex) {	
	var searchKeyword = $("#param_keyword_search").val();
	$.ajax({
				type : "POST",
				url : SystemConfigManage.contextPath
						+ "/system/systemConfigManage!ajaxQuery.action",
				data : {"pageIndex":pageIndex,"searchKeyword" : searchKeyword},
				datatype : "json",
				contentType : "application/x-www-form-urlencoded; charset=utf-8",
				success : function(result) {		
					try{
						if(result.success){
							SystemConfigManage.gridData = result.systemConfigList;
							SystemConfigManage.showData();
							SystemConfigManage.PageUtil.pageData = result.pageData;
							SystemConfigManage.PageUtil.refreshPage();
						}else{
							alert(result.tipMessage);
						}
					}catch(e){
							alert("获取系统参数列表失败");
					}
				},
				error : function() {
				}
			});
};

SystemConfigManage.showData = function(){
	var columns = [
	 {
		id : "systemParamName",
		name : "参数名称",
		field : "systemParamName",
	}, {
		id : "systemParamDesc",
		name : "参数说明",
		field : "systemParamDesc",
	}, {
		id : "systemParamValue",
		name : "参数值",
		field : "systemParamValue",
		editor : Slick.Editors.Text
	}, {
		id : "operate",
		name : "操作",
		field : "",
		formatter : SystemConfigManage.addConfigButton
	} ];

	var options = {
		editable : true,
		enableAddRow : false,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 30
	};

	grid = new Slick.Grid("#grid", SystemConfigManage.gridData, columns, options);
	grid.autosizeColumns();

	grid.onAddNewRow.subscribe(function(e, args) {
		var item = args.item;
		grid.invalidateRow(SystemConfigManage.gridData.length);
		SystemConfigManage.gridData.push(item);
		item.changed = true;
		grid.updateRowCount();
		grid.render();
	});
	
	grid.onCellChange.subscribe(function(e, args) {
		var item = args.item;
		item.changed = true;
		grid.updateRow(args.row);
	});
}

SystemConfigManage.addConfigButton = function(row, cell, value, columnDef, dataContext) {
	var item = SystemConfigManage.gridData[row];
	if(item.changed){
		return "<input type='button' class='commitRow btn btn-default' row='" + row + "' value='保存'/>";
	}else{
		return "";
	}
}

SystemConfigManage.ajaxSave = function(obj, row){
	$.ajax({
		type:"POST",
		url:SystemConfigManage.contextPath + "/system/systemConfigManage!ajaxSave.action",
		data:{
			"systemParamCode":obj.systemParamCode ,
			"systemParamCategory":obj.systemParamCategory,
			"systemParamValue":obj.systemParamValue
			},	
		datatype:"json",
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		success:function(result){
			try{
				if(result.success){
					if(row){
						obj.changed = false;
						grid.updateRow(row);
					}
					alert("保存成功!");
				}else{
					alert(result.tipMessage);
				}
			}catch(e){
					alert("参数修改失败");
			}
		},
		error:function(){
			alert("参数修改失败")
		}
	});
};

//初始化
SystemConfigManage.initPage = function(){	
	SystemConfigManage.PageUtil = new TopdeepUtil.pageUtil(null,SystemConfigManage.ajaxQuery,"");
	SystemConfigManage.PageUtil.initPage();
	$("#title").text("参数设置");
	SystemConfigManage.ajaxQuery("0");
	
	$(document).on("click", "#param_keyword_search_button", function() {
		SystemConfigManage.ajaxQuery("0");
	});
	
	$(document).on("click", ".commitRow", function() {
		var row = $(this).attr("row");
		var item = SystemConfigManage.gridData[row];
		if(SystemConfigManage.check(item)){
			SystemConfigManage.ajaxSave(SystemConfigManage.gridData[row], row);
		}
		return false;
	});
};

SystemConfigManage.check = function(item){
	if(item.systemParamValue == undefined || item.systemParamValue == ""){alert("参数值不能为空");return false;}else{
		if(item.systemParamValue.length > 900){
			alert("参数值太长");
			return false;
		}
		};
	return true;
}