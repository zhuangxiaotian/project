var FundCategoryManage = {};
FundCategoryManage.contextPath = contextPath;
FundCategoryManage.grid;
FundCategoryManage.gridData = [];
FundCategoryManage.grid1;
FundCategoryManage.gridData1 = [];
FundCategoryManage.grid2;
FundCategoryManage.gridData2 = [];
var PageUtil;
var PageUtil1;
var PageUtil2;

FundCategoryManage.ajaxQuery = function(pageIndex) {	
	var searchKeyword = $("#fundCategory_search_keyword").val();
	$.ajax({
		type : "POST",
		url : FundCategoryManage.contextPath
				+ "/trade/fundCategoryManage!ajaxQuery.action",
		data : {"pageIndex":pageIndex,"searchKeyword":searchKeyword},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {		
			try{
				if(result.success){
					FundCategoryManage.gridData = result.fundCategoryList;
					FundCategoryManage.showData();
					PageUtil.pageData = result.pageData;
					PageUtil.refreshPage();
				}else{
					alert(result.tipMessage);
				}
			}catch(e){
				alert("获取基金分类列表失败"+e);
			}
		},
		error : function() {
			alert("获取基金分类列表失败");
		}
	});

};

FundCategoryManage.ajaxQueryFundCategoryFundList = function(pageIndex,id) {	
	if(id==undefined){
		id = $("#currFundCategoryId").val();
	}
	$.ajax({
		type : "POST",
		url : FundCategoryManage.contextPath
				+ "/trade/fundCategoryManage!ajaxQueryFundCategoryFund.action",
		data : {"pageIndex":pageIndex,"fundCategory.id":id},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {		
			try{
				if(result.success){
					FundCategoryManage.initGrid1();
					FundCategoryManage.gridData1 = result.fundCategoryFundList;
					FundCategoryManage.showData1();
					PageUtil1.pageData = result.pageData;
					PageUtil1.refreshPage();
				}else{
					alert(result.tipMessage);
				}
			}catch(e){
				alert("获取基金分类下基金列表失败"+e);
			}
		},
		error : function() {
			alert("获取基金分类下基金列表失败");
		}
	});

};

FundCategoryManage.ajaxQueryFundFundList = function(pageIndex) {	
	$.ajax({
		type : "POST",
		url : FundCategoryManage.contextPath
				+ "/trade/fundInfoManage!ajaxQuery.action",
		data : {"pageIndex":pageIndex},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {		
			try{
				if(result.success){
					FundCategoryManage.gridData2 = result.fundInfoList;
					FundCategoryManage.showData2();
					PageUtil2.pageData = result.pageData;
					PageUtil2.refreshPage();
					FundCategoryManage.grid2.setSelectedRows([]);
				}else{
					alert(result.tipMessage);
				}
			}catch(e){
				alert("获取基金列表失败"+e);
			}
		},
		error : function() {
			alert("获取基金列表失败");
		}
	});

};

FundCategoryManage.ajaxAddFund = function(currFundcategoryId,fundCodeList){
	$.ajax({
		type : "POST",
		url : FundCategoryManage.contextPath
				+ "/trade/fundCategoryManage!ajaxAddFund.action",
		data : {"fundCategory.id":currFundcategoryId,"ids":fundCodeList},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {		
			try{
				if(result.success){
					FundCategoryManage.ajaxQueryFundCategoryFundList(0,currFundcategoryId);
					alert("添加成功");
				}else{
					alert("添加失败:"+result.tipMessage);
				}
			}catch(e){
				alert("添加失败:"+e);
			}
		},
		error : function() {
			alert("添加失败");
		}
	});
}

FundCategoryManage.ajaxDeleteFundCategoryFund = function(item){
	$.ajax({
		type : "POST",
		url : FundCategoryManage.contextPath
				+ "/trade/fundCategoryManage!ajaxDeleteFundCategoryFund.action",
		data : {"fundCatagoryFundRela.categoryId":item.categoryId,"fundCatagoryFundRela.fundCode":item.fundCode},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {		
			try{
				if(result.success){
					FundCategoryManage.ajaxQueryFundCategoryFundList(0,item.categoryId);
					alert("删除成功");
				}else{
					alert("删除失败:"+result.tipMessage);
				}
			}catch(e){
				alert("删除失败:"+e);
			}
		},
		error : function() {
			alert("删除失败");
		}
	});
}
FundCategoryManage.ajaxMoveFundCategoryFund = function(item,oprate){
	$.ajax({
		type : "POST",
		url : FundCategoryManage.contextPath
				+ "/trade/fundCategoryManage!ajaxMoveFundCategoryFund.action",
		data : {"fundCatagoryFundRela.categoryId":item.categoryId,"fundCatagoryFundRela.fundCode":item.fundCode,"moveOprate":oprate},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {		
			try{
				if(result.success){
					FundCategoryManage.ajaxQueryFundCategoryFundList(0,item.categoryId);
				}else{
					alert("移动失败:"+result.tipMessage);
				}
			}catch(e){
				alert("移动失败:"+e);
			}
		},
		error : function() {
			alert("移动失败");
		}
	});
}

FundCategoryManage.showData = function(){
	FundCategoryManage.grid.setData(FundCategoryManage.gridData);
	FundCategoryManage.grid.render();
}

FundCategoryManage.showData1 = function(){
	FundCategoryManage.grid1.setData(FundCategoryManage.gridData1);
	FundCategoryManage.grid1.render();
}

FundCategoryManage.showData2 = function(){
	FundCategoryManage.grid2.setData(FundCategoryManage.gridData2);
	FundCategoryManage.grid2.render();
}

FundCategoryManage.initGrid = function(){
	var columnDefinition={};
	var checkboxSelector = new Slick.CheckboxSelectColumn({});
	columnDefinition=checkboxSelector.getColumnDefinition();
	var columns = [ 
       columnDefinition,  {
		id : "categoryName",
		name : "基金分类名称",
		field : "categoryName"
	},
//	{
//		id : "categoryState",
//		name : "分类状态",
//		field : "categoryState",
//		formatter :FundCategoryManage.formatCategoryState
//	},
	{
		id : "auditState",
		name : "审核状态",
		field : "auditState",
		formatter :FundCategoryManage.formatAuditState
	},{
		id : "operate",
		name : "操作",
		field : "",
		formatter : FundCategoryManage.operate
	} ];

	var options = {
		editable : true,
		enableAddRow : false,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 40
	};

	FundCategoryManage.grid = new Slick.Grid("#grid", FundCategoryManage.gridData, columns, options);
	FundCategoryManage.grid.autosizeColumns();
	FundCategoryManage.grid.setSelectionModel(new Slick.RowSelectionModel({selectActiveRow: false}));
	FundCategoryManage.grid.registerPlugin(checkboxSelector);

	FundCategoryManage.grid.onClick.subscribe(function(e) {
		e.preventDefault();
		var cell = FundCategoryManage.grid.getCellFromEvent(e);
	});
	
	FundCategoryManage.grid.onAddNewRow.subscribe(function(e, args) {
		var item = args.item;
		FundCategoryManage.grid.invalidateRow(FundCategoryManage.gridData.length);
		FundCategoryManage.gridData.push(item);
		item.changed = true;
		FundCategoryManage.grid.updateRowCount();
		FundCategoryManage.grid.render();
	});
	
	FundCategoryManage.grid.onCellChange.subscribe(function(e, args) {
		var item = args.item;
		item.changed = true;
		FundCategoryManage.grid.updateRow(args.row);
	});
}

FundCategoryManage.initGrid1 = function(){
	var columnDefinition={};
	var checkboxSelector = new Slick.CheckboxSelectColumn({});
	columnDefinition=checkboxSelector.getColumnDefinition();
	var columns = [ 
       columnDefinition,  {
		id : "categoryName",
		name : "基金分类名称",
		field : "categoryName",
	}, {
		id : "fundName",
		name : "基金名称",
		field : "fundName",
	},{
		id : "operate",
		name : "操作",
		field : "",
		formatter : FundCategoryManage.operateFundList,
	} ];

	var options = {
		editable : true,
		enableAddRow : false,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 40
	};


	FundCategoryManage.grid1 = new Slick.Grid("#grid1", FundCategoryManage.gridData1, columns, options);
	FundCategoryManage.grid1.autosizeColumns();
	FundCategoryManage.grid1.setSelectionModel(new Slick.RowSelectionModel({selectActiveRow: false}));
	FundCategoryManage.grid1.registerPlugin(checkboxSelector);

	FundCategoryManage.grid1.onClick.subscribe(function(e) {
		e.preventDefault();
		var cell = FundCategoryManage.grid1.getCellFromEvent(e);
	});
	
	FundCategoryManage.grid1.onAddNewRow.subscribe(function(e, args) {
		var item = args.item;
		FundCategoryManage.grid1.invalidateRow(FundCategoryManage.gridData1.length);
		FundCategoryManage.gridData1.push(item);
		item.changed = true;
		FundCategoryManage.grid1.updateRowCount();
		FundCategoryManage.grid1.render();
	});
	
	FundCategoryManage.grid1.onCellChange.subscribe(function(e, args) {
		var item = args.item;
		item.changed = true;
		FundCategoryManage.grid1.updateRow(args.row);
	});
}

FundCategoryManage.initGrid2 = function(){
	var columnDefinition={};
	var checkboxSelector = new Slick.CheckboxSelectColumn({});
	columnDefinition=checkboxSelector.getColumnDefinition();
	var columns = [ 
       columnDefinition,  {
		id : "fundCode",
		name : "基金代码",
		field : "fundCode"
	}, {
		id : "fundName",
		name : "基金简称",
		field : "fundName",
	}];

	var options = {
		editable : true,
		enableAddRow : false,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 40
	};


	FundCategoryManage.grid2 = new Slick.Grid("#grid2", FundCategoryManage.gridData2, columns, options);
	FundCategoryManage.grid2.autosizeColumns();
	FundCategoryManage.grid2.setSelectionModel(new Slick.RowSelectionModel({selectActiveRow: false}));
	FundCategoryManage.grid2.registerPlugin(checkboxSelector);

}

FundCategoryManage.formatAuditState=  function(row, cell, value, columnDef, dataContext) {
	if(value=="0"){
		return "未审核";
	}
	if(value=="1"){
		return "审核通过";
	}
	if(value=="2"){
		return "审核未通过";
	}
	return"";
	
}

FundCategoryManage.formatCategoryState=  function(row, cell, value, columnDef, dataContext) {
	if(value=="0"){
		return "不显示";
	}
	if(value=="1"){
		return "显示";
	}
	
	return"";
	
}

FundCategoryManage.operate = function(row, cell, value, columnDef, dataContext) {
	var item = FundCategoryManage.gridData[row];
	var ret = "";
	ret += "<input type='button' class='fundlist btn btn-default' row='" + row + "' value='基金列表'/>"; 
	ret += "<input type='button' class='updateRow btn btn-default' row='" + row + "' data-target='#poptext' data-toggle='modal' value='修改'/>"; 
	if(!item.isNew){
		ret += "<input type='button' class='deleteRow btn btn-default' row='" + row + "' value='删除'/>"; 
	}
	if(item.changed){
		ret+= "<input type='button' class='commitRow btn btn-default' row='" + row + "' value='保存'/>";
	}
	return ret;
}

FundCategoryManage.operateFundList = function(row, cell, value, columnDef, dataContext) {
	var item = FundCategoryManage.gridData1[row];
	var ret = "";
	ret += "<button type='button' class='fundListMoveUp btn btn-default' row='" + row
	+ "'><span class='glyphicon glyphicon-arrow-up'></span></button>";
	ret += "<button type='button' class='fundListMoveDown btn btn-default' row='" + row
	+ "'><span class='glyphicon glyphicon-arrow-down'></span></button>";
//	ret += "<input type='button' class='fundListMoveToTop btn btn-sm btn-default' row='"
//		+ row + "' value='置顶'/>";
	ret += "<input type='button' class='fundListDeleteRow btn btn-sm btn-default'  row='"
		+ row + "' value='删除'/>";
	return ret;
}

FundCategoryManage.getSelected = function(){
	var rowIds =FundCategoryManage.grid.getSelectedRows();
	var ids = '';
	for (var i = 0; i < rowIds.length; i++) {
		ids += FundCategoryManage.gridData[rowIds[i]].id + ",";
	}
	return ids;
}


FundCategoryManage.ajaxSetAuditState = function(ids,auditState) {
	$.ajax({
		type : "POST",
		url : FundCategoryManage.contextPath + "/trade/fundCategoryManage!ajaxSetAuditState.action",
		data : {
			"ids" : ids,
			"auditState"  : auditState
		},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (result.success) {
					FundCategoryManage.ajaxQuery($("#pageIndex").val());
					FundCategoryManage.grid.setSelectedRows([]);
				} else {
					alert(result.tipMessage);
				}
			} catch (e) {
				alert("审核失败" + e);
			}
		},
		error : function() {
			alert("审核失败");
		}
	});
};

//FundCategoryManage.ajaxSave = function(){
//	$.ajax({
//		type:"POST",
//		url:FundCategoryManage.contextPath + "/trade/fundCategoryManage!ajaxSave.action",
//		data:{"fundCategory.categoryName":$("#fundCategoryName_create").val()},	
//		datatype:"json",
//		contentType: "application/x-www-form-urlencoded; charset=utf-8",
//		success:function(result){
//			try{
//				if(result.success){
//					alert("保存成功!");
//					FundCategoryManage.ajaxQuery(0);
//					$("#fundCategoryName_create").val("");
//				}else{
//					alert(result.tipMessage);
//				}
//			}catch(e){
//				alert("保存失败");
//			}
//		},
//		error:function(){
//			alert("保存失败");
//		}
//	});
//};

FundCategoryManage.ajaxSave = function(obj, row){
	$.ajax({
		type:"POST",
		url:FundCategoryManage.contextPath + "/trade/fundCategoryManage!ajaxSave.action",
		data:{"fundCategory.categoryName":$("#fundCategoryName_create").val(),"fundCategory.id":$("#categoryId").val()},	
		datatype:"json",
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		success:function(result){
			try{
				if(result.success){
					alert("保存成功!");
					FundCategoryManage.ajaxQuery(0);
				}else{
					alert(result.tipMessage);
				}
			}catch(e){
					alert("保存失败");
			}
		},
		error:function(){
			alert("保存失败");
		}
	});
};

FundCategoryManage.ajaxDelete = function(id) {
	$.ajax({
		type : "POST",
		url : FundCategoryManage.contextPath + "/trade/fundCategoryManage!ajaxDelete.action",
		data : {"fundCategory.id":id},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (result.success) {
					alert("删除成功");
					FundCategoryManage.ajaxQuery($("#pageIndex").val());
				} else {
					alert(result.tipMessage);
				}
			} catch (e) {
				alert("删除失败");
			}
		},
		error : function() {
			alert("删除失败");
		}
	});
};

FundCategoryManage.formatDate = function(row, cell, value, columnDef, dataContext) {
	if (value == "" || value == undefined) {
		value = "";
	} else {
		value = TopdeepCommon.formatDate(new Date(value), "yyyy-MM-dd hh:mm:ss");
	}
	return value;
};

//初始化
FundCategoryManage.initPage = function(){
	PageUtil = new TopdeepUtil.pageUtil(null,FundCategoryManage.ajaxQuery,"");
	PageUtil.initPage();
	PageUtil1 = new TopdeepUtil.pageUtil(null,FundCategoryManage.ajaxQueryFundCategoryFundList,"1");
	PageUtil1.initPage();
	PageUtil2 = new TopdeepUtil.pageUtil(null,FundCategoryManage.ajaxQueryFundFundList,"2");
	PageUtil2.initPage();
	FundCategoryManage.initGrid();
	FundCategoryManage.initGrid1();
	FundCategoryManage.initGrid2();
	$("#step2").hide();
	FundCategoryManage.ajaxQuery("0");
	$(document).on("click", ".commitRow", function() {
		var row = $(this).attr("row");
		var item = FundCategoryManage.gridData[row];
		if(FundCategoryManage.check(item)){
			FundCategoryManage.ajaxModify(FundCategoryManage.gridData[row], row);
		}
		return false;
	});
	
	$(document).on("click", ".deleteRow", function() {
		var row = $(this).attr("row");
		var item = FundCategoryManage.gridData[row];
		 if(confirm("确认删除吗？")){
			FundCategoryManage.ajaxDelete(item.id);
		 }
		return false;
	});
	
	$(document).on("click", ".updateRow", function() {
		var row = $(this).attr("row");
		var item = FundCategoryManage.gridData[row];
		$("#categoryId").val(item.id);
		$("#fundCategoryName_create").val(item.categoryName);
		return false;
	});
	
	$(document).on("click", "#changeAuditState", function() {
		var ids = FundCategoryManage.getSelected();
		if(ids.length==0){
			alert("请勾选审核项");
			return false;
		}
		if(!window.confirm("是否审核这些项?")){
			return false;
		}
		FundCategoryManage.ajaxSetAuditState(ids,"1");
	})

	$(document).on("click", "#removeAuditState", function() {
		var ids = FundCategoryManage.getSelected();
		if(ids.length==0){
			alert("请勾选反审核项");
			return false;
		}
		if(!window.confirm("是否反审核这些项?")){
			return false;
		}
		FundCategoryManage.ajaxSetAuditState(ids,"2");
	})
	
	$(document).on("click", ".fundlist", function() {
		var row = $(this).attr("row");
		var item = FundCategoryManage.gridData[row];
		if(item!=null){
			$("#step1").hide();
			$("#step2").show();
			$("#currFundCategoryId").val(item.id);
			FundCategoryManage.grid1.setData([]);
			FundCategoryManage.grid1.render();
			FundCategoryManage.ajaxQueryFundCategoryFundList(0,item.id);
		}
		return false;
	})
	
	$(document).on("click", "#addFund", function() {
		FundCategoryManage.ajaxQueryFundFundList(0);
		return false;
	})
	
	$(document).on("click", "#addSelectedFund", function() {
		var rowIds =FundCategoryManage.grid2.getSelectedRows();
		if(rowIds.length<=0){
			alert("请选择要添加的基金");
			return false;
		}
		var fundCodeList = '';
		for (var i = 0; i < rowIds.length; i++) {
			fundCodeList += FundCategoryManage.gridData2[rowIds[i]].fundCode + ",";
		}
		var currFundcategoryId = $("#currFundCategoryId").val();
		FundCategoryManage.ajaxAddFund(currFundcategoryId,fundCodeList);
		return false;
	})
	
	$(document).on("click", "#gobackfundCategory", function() {
		$("#step1").show();
		$("#step2").hide();
		return false;
	})
	
	$("#creatFundCategory").click(function(){
		$("#categoryId").val("");
		$("#fundCategoryName_create").val("");
	})
	
	$("#fundCategory_search_keyword_button").click(function(){
		FundCategoryManage.ajaxQuery(0);
	});
	
	$("#commit").click(function(){
		if(FundCategoryManage.ckeckCreate()){
			FundCategoryManage.ajaxSave();
		}
	});
	
	$(document).on("click", ".fundListDeleteRow", function() {
		var row = $(this).attr("row");
		var item = FundCategoryManage.gridData1[row];
		 if(confirm("确认删除吗？")){
			FundCategoryManage.ajaxDeleteFundCategoryFund(item);
		 }
		return false;
	});
	
	$(document).on("click", ".fundListMoveUp", function() {
		var row = $(this).attr("row");
		var item = FundCategoryManage.gridData1[row];
		FundCategoryManage.ajaxMoveFundCategoryFund(item,"1");
		return false;
	});
	
	$(document).on("click", ".fundListMoveDown", function() {
		var row = $(this).attr("row");
		var item = FundCategoryManage.gridData1[row];
		FundCategoryManage.ajaxMoveFundCategoryFund(item,"2");
		return false;
	});
	
};

FundCategoryManage.ckeckCreate = function(){
	var name = $("#fundCategoryName_create").val();
	if(name == undefined || name == "" || $.trim(name)==""){alert("分类不能为空");return false;}
	if(name.length>20){
		alert("分类名称过长");return false;
	}
	return true;
}
