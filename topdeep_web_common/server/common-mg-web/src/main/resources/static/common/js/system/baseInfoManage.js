var BaseInfoManage = {};
BaseInfoManage.contextPath = contextPath;
BaseInfoManage.baseInfoTypeList = null;
BaseInfoManage.gridData = [];
BaseInfoManage.grid = null;
BaseInfoManage.customPriList = [];
BaseInfoManage.typeEditInfo = null;
var PageUtil;
BaseInfoManage.ajaxQuery = function(pageIndex) {
	var searchKeyword = $("#baseInfo_search_keyword").val();
	$.ajax({
		type : "POST",
		url : BaseInfoManage.contextPath + "/system/baseInfoManage!ajaxQuery.action",
		data : {
			"pageIndex" : pageIndex,
			"searchKeyword" : searchKeyword,
			"codeType" : BaseInfoManage.typeEditInfo.codeTypeId
		},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (result.success) {
					BaseInfoManage.gridData = result.baseInfoList;
					BaseInfoManage.gridData.getItemMetadata = function(row) {
						var item = BaseInfoManage.gridData[row];
						if (item) {
							if (!item.isNew) {
								var columnsDefine =
								 {
									"columns" : {
										"codeId" : {
											editor : null
										}
									}
								};
								if(BaseInfoManage.typeEditInfo.codeDescParamType == "privilegeId"){
									columnsDefine.columns.codeDesc = {
											datasource : BaseInfoManage.customPriList,
											editor : Slick.Editors.TopDeepDropDownList
										};
								}
								return columnsDefine;
							}else{
							}
						}
					};
					BaseInfoManage.grid.setData(BaseInfoManage.gridData);
					BaseInfoManage.grid.render();
					PageUtil.pageData = result.pageData;
					PageUtil.refreshPage();
				} else {
					alert(result.tipMessage);
				}
			} catch (e) {
				alert("获取系统参数列表失败");
			}
		},
		error : function() {
		}
	});

};

BaseInfoManage.initGrid = function() {
	var columns = [ 
	{
		id : "codeId",
		name : BaseInfoManage.typeEditInfo.codeTypeName+"编号",
		field : "codeId",
		editor : Slick.Editors.Text
	}, {
		id : "codeName",
		name : BaseInfoManage.typeEditInfo.codeTypeName+"名称",
		field : "codeName",
		editor : Slick.Editors.Text
	}, {
		id : "codeDesc",
		name : BaseInfoManage.typeEditInfo.codeTypeDescName,
		field : "codeDesc",
		editor : Slick.Editors.Text,
		formatter: BaseInfoManage.formatDesc
	}, {
		id : "orderField",
		name : "显示顺序",
		field : "orderField",
		editor : Slick.Editors.Text
	}, {
		id : "operate",
		name : "操作",
		field : "",
		formatter : BaseInfoManage.operate
	}];

	var options = {
		editable : true,
//		enableAddRow : true,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 40,
		rowWidth : 1493
	};
	
	if(BaseInfoManage.typeEditInfo.editType == "0"){
		options.enableAddRow = true;
	}

	BaseInfoManage.grid = new Slick.Grid("#grid", BaseInfoManage.gridData, columns, options);
	BaseInfoManage.grid.autosizeColumns();

	BaseInfoManage.grid.onClick.subscribe(function(e) {
		e.preventDefault();
		var cell = BaseInfoManage.grid.getCellFromEvent(e);
		var item = BaseInfoManage.gridData[cell.row];
	});

	BaseInfoManage.grid.onAddNewRow.subscribe(function(e, args) {
		var item = args.item;
		BaseInfoManage.grid.invalidateRow(BaseInfoManage.gridData.length);
		BaseInfoManage.gridData.push(item);
		item.changed = true;
		item.isNew = true;
		BaseInfoManage.grid.updateRowCount();
		BaseInfoManage.grid.render();
	});

	BaseInfoManage.grid.onCellChange.subscribe(function(e, args) {
		var item = args.item;
		item.changed = true;
		BaseInfoManage.grid.updateRow(args.row);
	});
	
}


BaseInfoManage.operate = function(row, cell, value, columnDef, dataContext) {
	var item = BaseInfoManage.gridData[row];
	var ret = "";
	if (item.changed) {
		ret += "<input id ='" + row + "' type='button' class='commitRow btn btn-default' row='" + row + "' value='保存'/>";
	}
	if(BaseInfoManage.typeEditInfo.editType == "0"){
		ret += "<input type='button' class='deleteRow btn btn-default' row='" + row + "' value='删除'/>";
	}
	
	return ret;
}

BaseInfoManage.formatDesc = function(row, cell, value, columnDef, dataContext) {
	if(BaseInfoManage.typeEditInfo.codeDescParamType == "privilegeId"){
		for(var i=0;i<BaseInfoManage.customPriList.length;i++){
			if(BaseInfoManage.customPriList[i].ID == value){
				return BaseInfoManage.customPriList[i].txt;
			}
		}
	}
	if(value == undefined){
		value = "";
	}
	return value;
}

BaseInfoManage.checkSaveInput = function(row){
	var item = BaseInfoManage.gridData[row];
	if (!item.codeId) {
		alert("编号不能为空");
		return false;
	}
	if (!item.codeName) {
		alert("名称不能为空");
		return false;
	}

	if(item.codeId.length > 50){
		alert("编号长度不得超过50");
		return false;
	}
	if(item.codeName.length > 100){
		alert("名称长度不得超过100");
		return false;
	}
	if(item.codeDesc){
		if(item.codeDesc.length > 500){
			alert("描述长度不得超过500");
			return false;
		}
	}
	if(!item.orderField){
		alert("缺少显示顺序");
		return false;
	}
	return true;
}

BaseInfoManage.ajaxSave = function(row) {
	var item = BaseInfoManage.gridData[row];
	var codeType = BaseInfoManage.typeEditInfo.codeTypeId;
	$.ajax({
		type : "POST",
		url : BaseInfoManage.contextPath + "/system/baseInfoManage!ajaxSave.action",
		data : {
			"baseInfo.codeId" : item.codeId,
			"baseInfo.codeType" : codeType,
			"baseInfo.codeName" : item.codeName,
			"baseInfo.codeDesc" : item.codeDesc,
			"baseInfo.orderField" : item.orderField,
			"baseInfo.rowVersion" : item.rowVersion
		},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (result.success) {
					BaseInfoManage.gridData[row] = result.baseInfo;
					BaseInfoManage.grid.updateRow(row);
				} else {
					alert(result.tipMessage);
				}
			} catch (e) {
				alert("保存失败:" + e.message);
			}
		},
		error : function() {
			alert("失败");
		}
	});
};

BaseInfoManage.ajaxDelete = function(row) {
	var item = BaseInfoManage.gridData[row];
	$.ajax({
		type : "POST",
		url : BaseInfoManage.contextPath + "/system/baseInfoManage!ajaxDelete.action",
		data : {
			"baseInfo.codeId" : item.codeId,
			"baseInfo.codeType" : BaseInfoManage.typeEditInfo.codeTypeId
		},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (result.success) {
					BaseInfoManage.gridData.splice(row, 1);
					BaseInfoManage.grid.invalidate();
				} else {
					alert(result.tipMessage);
				}
			} catch (e) {
				alert("删除失败: "+e.message);
			}
		},
		error : function() {
			alert("删除失败");
		}
	});
};

BaseInfoManage.formatDate = function(row, cell, value, columnDef, dataContext) {
	if (value == "" || value == undefined) {
		value = "";
	} else {
		value = TopdeepCommon.formatDate(new Date(value), "yyyy-MM-dd hh:mm:ss");
	}
	return value;
};

// 初始化
BaseInfoManage.initPage = function(baseInfoEditType, baseInfoTypeList, customPriList) {
	BaseInfoManage.typeEditInfo = baseInfoEditType;
	BaseInfoManage.baseInfoTypeList = baseInfoTypeList;
	BaseInfoManage.customPriList = customPriList;
	BaseInfoManage.initGrid();

	PageUtil = new TopdeepUtil.pageUtil(null,BaseInfoManage.ajaxQuery,"");
	PageUtil.initPage();
	BaseInfoManage.ajaxQuery("0");

	$(document).on("click", ".commitRow", function() {
		var row = $(this).attr("row");
		if (BaseInfoManage.checkSaveInput(row)) {
			BaseInfoManage.ajaxSave(row);
		}
		return false;
	});

	$(document).on("click", ".deleteRow", function() {
		var row = $(this).attr("row");
		var item = BaseInfoManage.gridData[row];
		if(item.isNew){
			BaseInfoManage.gridData.slice(row, 1);
			BaseInfoManage.grid.invalidate();
		}else{
			BaseInfoManage.ajaxDelete(row);
		}
		return false;
	});

	$("#baseInfo_search_keyword_button").click(function() {
		BaseInfoManage.ajaxQuery(0);
	});

	$("#baseType_selected").change(function() {
		var options = $("#baseType_selected option:selected");
		var index = options.val();
		BaseInfoManage.ajaxQuery(0);
	});

//	$("#contextMenu").click(function(e) {
//		if (!$(e.target).is("li")) {
//			return;
//		}
//		if (!BaseInfoManage.grid.getEditorLock().commitCurrentEdit()) {
//			return;
//		}
//		var row = $(this).data("row");
//		if (row == BaseInfoManage.gridData.length) {
//			BaseInfoManage.gridData[row] = {};
//		}
//		BaseInfoManage.gridData[row].codeType = $(e.target).attr("data");
//		BaseInfoManage.gridData[row].changed = true;
//		BaseInfoManage.grid.updateRow(row);
//		$("#contextMenu").hide();
//	});
};
