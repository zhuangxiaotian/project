var ParamManage = {};
ParamManage.contextPath =contextPath;
var grid;
ParamManage.gridData = [];
ParamManage.PageUtil;
ParamManage.ajaxQuery = function(pageIndex) {	
	var searchKeyword = $("#param_keyword_search").val();
	$.ajax({
				type : "POST",
				url : ParamManage.contextPath
						+ "/system/paramManage!ajaxQuery.action",
				data : {"pageIndex":pageIndex,"searchKeyword" : searchKeyword},
				datatype : "json",
				contentType : "application/x-www-form-urlencoded; charset=utf-8",
				success : function(result) {		
					try{
						if(result.success){
							ParamManage.gridData = result.paramList;
							ParamManage.showData();
							ParamManage.PageUtil.pageData = result.pageData;
							ParamManage.PageUtil.refreshPage();
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

ParamManage.showData = function(){
	var columns = [
	 {
		id : "paramName",
		name : "参数名称",
		field : "paramName",
	}, {
		id : "paramDesc",
		name : "参数说明",
		field : "paramDesc",
	}, {
		id : "paramValue",
		name : "参数值",
		field : "paramValue",
		editor : Slick.Editors.Text
	}, {
		id : "operate",
		name : "操作",
		field : "",
		formatter : ParamManage.addParamButton
	} ];

	var options = {
		editable : true,
		enableAddRow : false,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 30
	};

	grid = new Slick.Grid("#grid", ParamManage.gridData, columns, options);
	grid.autosizeColumns();

	grid.onAddNewRow.subscribe(function(e, args) {
		var item = args.item;
		grid.invalidateRow(ParamManage.gridData.length);
		ParamManage.gridData.push(item);
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

ParamManage.addParamButton = function(row, cell, value, columnDef, dataContext) {
	var item = ParamManage.gridData[row];
	if(item.changed){
		return "<input type='button' class='commitRow btn btn-default' row='" + row + "' value='保存'/>";
	}else{
		return "";
	}
}

ParamManage.ajaxSave = function(obj, row){
	$.ajax({
		type:"POST",
		url:ParamManage.contextPath + "/system/paramManage!ajaxSave.action",
		data:{"id":obj.id ,"paramValue":obj.paramValue,"paramCode":obj.paramCode},	
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
ParamManage.initPage = function(){	
	ParamManage.PageUtil = new TopdeepUtil.pageUtil(null,ParamManage.ajaxQuery,"");
	ParamManage.PageUtil.initPage();
	$("#title").text("系统参数管理");
	ParamManage.ajaxQuery("0");
	
	$(document).on("click", "#param_keyword_search_button", function() {
		ParamManage.ajaxQuery("0");
	});
	
	$(document).on("click", ".commitRow", function() {
		var row = $(this).attr("row");
		var item = ParamManage.gridData[row];
		if(ParamManage.check(item)){
			ParamManage.ajaxSave(ParamManage.gridData[row], row);
		}
		return false;
	});
};

ParamManage.check = function(item){
	if(item.paramValue == undefined || item.paramValue == ""){alert("参数值不能为空");return false;}else{
		if(item.paramValue.length > 900){
			alert("参数值太长");
			return false;
		}
		};
	return true;
}