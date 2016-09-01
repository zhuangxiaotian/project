var FundInfoManage = {};
var PageUtil;
FundInfoManage.contextPath = contextPath;
FundInfoManage.grid;
FundInfoManage.gridData = [];

FundInfoManage.ajaxQuery = function(pageIndex) {	
	var searchKeyword = $("#fundInfo_search_keyword").val();
	$.ajax({
				type : "POST",
				url : FundInfoManage.contextPath
						+ "/trade/fundInfoManage!ajaxQuery.action",
				data : {"pageIndex":pageIndex,"searchKeyword":searchKeyword},
				datatype : "json",
				contentType : "application/x-www-form-urlencoded; charset=utf-8",
				success : function(result) {		
					try{
						if(result.success){
							FundInfoManage.gridData = result.fundInfoList;
							FundInfoManage.showData();
							PageUtil.pageData = result.pageData;
							PageUtil.refreshPage();
						}else{
							alert(result.tipMessage);
						}
					}catch(e){
							alert("获取基金列表失败"+e);
					}
				},
				error : function() {
				}
			});

};

FundInfoManage.ajaxQueryFundProperty = function(fundcode) {	
	$.ajax({
		type : "POST",
		url : FundInfoManage.contextPath
				+ "/trade/fundInfoManage!ajaxQueryFundProperty.action",
		data : {"fundInfo.fundCode":fundcode},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {		
			try{
				if(result.success){
					if(result.fundPropertyList.length>0){
						for(var i=0; i<result.fundPropertyList.length ;i++){
							$("#fund_"+result.fundPropertyList[i].propertyType).val(result.fundPropertyList[i].propertyValue);
						}
					}
					
				}else{
					alert(result.tipMessage);
				}
			}catch(e){
				alert("获取基金属性失败"+e);
			}
		},
		error : function() {
			alert("获取基金属性失败"+e);
		}
	});

};

FundInfoManage.showData = function(){
	FundInfoManage.grid.setData(FundInfoManage.gridData);
	FundInfoManage.grid.render();
}

FundInfoManage.initGrid = function(){
	var columnDefinition={};
	checkboxSelector = new Slick.CheckboxSelectColumn({});
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
		editor : Slick.Editors.Text
	}, {
		id : "fundFullName",
		name : "基金全称",
		field : "fundFullName",
		editor : Slick.Editors.Text
	},{
		id : "createTime",
		name : "创建时间",
		field : "createTime",
		formatter : FundInfoManage.formatDate
	}, {
		id : "auditState",
		name : "审核状态",
		field : "auditState",
		formatter : FundInfoManage.formatAuditState
	},{
		id : "operate",
		name : "操作",
		field : "",
		formatter : FundInfoManage.operate
	} ];

	var options = {
		editable : true,
		enableAddRow : false,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 40
	};

	FundInfoManage.grid = new Slick.Grid("#grid", FundInfoManage.gridData, columns, options);
	FundInfoManage.grid.autosizeColumns();
	 FundInfoManage.grid.setSelectionModel(new Slick.RowSelectionModel({selectActiveRow: false}));
	FundInfoManage.grid.registerPlugin(checkboxSelector);

	FundInfoManage.grid.onClick.subscribe(function(e) {
		e.preventDefault();
		var cell = FundInfoManage.grid.getCellFromEvent(e);
	});
	
	FundInfoManage.grid.onAddNewRow.subscribe(function(e, args) {
		var item = args.item;
		FundInfoManage.grid.invalidateRow(FundInfoManage.gridData.length);
		FundInfoManage.gridData.push(item);
		item.changed = true;
		FundInfoManage.grid.updateRowCount();
		FundInfoManage.grid.render();
	});
	
	FundInfoManage.grid.onCellChange.subscribe(function(e, args) {
		var item = args.item;
		item.changed = true;
		FundInfoManage.grid.updateRow(args.row);
	});
}

FundInfoManage.formatAuditState=  function(row, cell, value, columnDef, dataContext) {
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

FundInfoManage.operate = function(row, cell, value, columnDef, dataContext) {
	var item = FundInfoManage.gridData[row];
	var ret = "";
	ret += "<input type='button' class='detailRow btn btn-default' data-target='#poptext' data-toggle='modal' row='" + row + "' value='基金属性'/>"; 
	if(!item.isNew){
		ret += "<input type='button' class='deleteRow btn btn-default' row='" + row + "' value='删除'/>"; 
	}
	if(item.changed){
		ret+= "<input type='button' class='commitRow btn btn-default' row='" + row + "' value='保存'/>";
	}
	return ret;
}

$(document).on("click", "#changeAuditState", function() {
	var ids = FundInfoManage.getSelected();
	if(ids.length==0){
		alert("请勾选审核项");
		return false;
	}
	
	if(!window.confirm("是否审核这些项?")){
		return false;
	}
	FundInfoManage.ajaxSetAuditState(ids,"1");
})

$(document).on("click", "#removeAuditState", function() {
	var ids = FundInfoManage.getSelected();
	if(ids.length==0){
		alert("请勾选反审核项");
		return false;
	}
	
	if(!window.confirm("是否反审核这些项?")){
		return false;
	}
	FundInfoManage.ajaxSetAuditState(ids,"2");
})

FundInfoManage.getSelected = function(){
	var rowIds =FundInfoManage.grid.getSelectedRows();
	var ids = '';
	for (var i = 0; i < rowIds.length; i++) {
		ids += FundInfoManage.gridData[rowIds[i]].fundCode + ",";
	}
	return ids;
}


FundInfoManage.ajaxSetAuditState = function(ids,auditState) {
	$.ajax({
		type : "POST",
		url : FundInfoManage.contextPath + "/trade/fundInfoManage!ajaxSetAuditState.action",
		data : {
			"ids" : ids,
			"auditState"  : auditState
		},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (result.success) {
					FundInfoManage.ajaxQuery($("#pageIndex").val());
					FundInfoManage.grid.setSelectedRows([]);
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





FundInfoManage.ajaxModify = function(obj, row){
	$.ajax({
		type:"POST",
		url:FundInfoManage.contextPath + "/trade/fundInfoManage!ajaxSave.action",
		data:{"fundInfo.fundCode":obj.fundCode,"fundInfo.fundName":obj.fundName,"fundInfo.fundFullName":obj.fundFullName,"fundInfo.rowVersion":obj.rowVersion},	
		datatype:"json",
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		success:function(result){
			try{
				if(result.success){
					alert("保存成功!");
					FundInfoManage.ajaxQuery();
				}else{
					alert(result.tipMessage);
				}
			}catch(e){
					alert("基金信息保存失败");
			}
		},
		error:function(){
			alert("基金信息失败");
		}
	});
};

FundInfoManage.ajaxDelete = function(fundCode) {

	$.ajax({
		type : "POST",
		url : FundInfoManage.contextPath + "/trade/fundInfoManage!ajaxDelete.action",
		data : {"fundInfo.fundCode":fundCode},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (result.success) {
					alert("删除成功");
						FundInfoManage.ajaxQuery(0);
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

FundInfoManage.ajaxSave = function(){
//	var fundPropertyListForm= $("#fundPropertyListForm");
//	fundPropertyListForm.empty();
//	$(".fundPropertyListClass").each(function(index,element){
//		var name = $(this).attr("name");
//		var propertyType = $("<input type='hidden' name='fundPropertyList["+index+"].propertyType' value='"+name+"' />");
//		var propertyValue = $("<input type='hidden' name='fundPropertyList["+index+"].propertyValue' value='"+$(this).val()+"' />");
//		fundPropertyListForm.append(propertyType).append(propertyValue);
//	})
//	var data = fundPropertyListForm.serialize()+"&fundInfo.fundCode="+ $("#fundCode_create").val()+"&fundInfo.fundName="+ $("#fundName_create").val()+"&fundInfo.fundFullName="+ $("#fundFullName_create").val();
	var data = FundInfoManage.getData();
	$.ajax({
		type:"POST",
		url:FundInfoManage.contextPath + "/trade/fundInfoManage!ajaxSave.action",
		data:data,	
		datatype:"json",
		//contentType: "application/x-www-form-urlencoded; charset=utf-8",
		success:function(result){
			try{
				if(result.success){
					alert("保存成功!");
					FundInfoManage.ajaxQuery();
					$("#fundName_create").val("");
					$("#fundFullName_create").val("");
					$("#fundCode_create").val("");
				}else{
					alert(result.tipMessage);
				}
			}catch(e){
					alert("基金信息保存失败");
			}
		},
		error:function(){
			alert("基金信息保存失败");
		}
	});
};

FundInfoManage.getData = function(){
	var data= "";
	$(".fundPropertyListClass").each(function(index,element){
		var propertyType = $(this).attr("name");
		var propertyValue = $(this).val();
		if(index>0){
			data+="&";
		}
		data += "fundPropertyList["+index+"].propertyType="+propertyType+"&fundPropertyList["+index+"].propertyValue="+propertyValue;
		
	})
	data +="&fundInfo.fundCode="+ $("#fundCode_create").val()+"&fundInfo.fundName="+ $("#fundName_create").val()+"&fundInfo.fundFullName="+ $("#fundFullName_create").val()+"&fundInfo.rowVersion="+ $("#fund_rowVersion").val();
	
	return encodeURI(data);
}

FundInfoManage.formatDate = function(row, cell, value, columnDef, dataContext) {
	if (value == "" || value == undefined) {
		value = "";
	} else {
		value = TopdeepCommon.formatDate(new Date(value), "yyyy-MM-dd hh:mm:ss");
	}
	return value;
};

//初始化
FundInfoManage.initPage = function(){
	PageUtil = new TopdeepUtil.pageUtil(null,FundInfoManage.ajaxQuery,"");
	PageUtil.initPage();
	FundInfoManage.initGrid();
	FundInfoManage.ajaxQuery("0");
	
	$(document).on("click", "#creatFundInfo", function() {
		$("#fundInfoDetail input").each(function(index,element){
			$(this).val("");
		})
	})
	
	$(document).on("click", ".commitRow", function() {
		var row = $(this).attr("row");
		var item = FundInfoManage.gridData[row];
		if(FundInfoManage.check(item)){
			FundInfoManage.ajaxModify(FundInfoManage.gridData[row], row);
		}
		return false;
	});
	
	$(document).on("click", ".deleteRow", function() {
		var row = $(this).attr("row");
		var item = FundInfoManage.gridData[row];
		 if(confirm("确认删除吗？")){
			FundInfoManage.ajaxDelete(item.fundCode);
		 }
		return false;
	});
	
	$(document).on("click", ".detailRow", function() {
		$("#fundInfoDetail input").each(function(index,element){
			$(this).val("");
		})
		var row = $(this).attr("row");
		var item = FundInfoManage.gridData[row];
		$("#fundCode_create").val(item.fundCode);
		$("#fundName_create").val(item.fundName);
		$("#fundFullName_create").val(item.fundFullName);
		$("#fund_rowVersion").val(item.rowVersion);
		FundInfoManage.ajaxQueryFundProperty(item.fundCode);
		return false;
	});
	
	$("#fundInfo_search_keyword_button").click(function(){
		FundInfoManage.ajaxQuery(0);
	});
	
	$("#commit").click(function(){
		if(FundInfoManage.ckeckCreate()){
			FundInfoManage.ajaxSave();
		}
	});
	
	$("#contextMenu").click(function(e) {
		if (!$(e.target).is("li")) {
			return;
		}
		if (!FundInfoManage.grid.getEditorLock().commitCurrentEdit()) {
			return;
		}
		var row = $(this).data("row");
		if (row == FundInfoManage.gridData.length) {
			FundInfoManage.gridData[row] = {};
		}
		FundInfoManage.gridData[row].siteName= $(e.target).attr("data");
		FundInfoManage.gridData[row].changed = true;
		FundInfoManage.grid.updateRow(row);
		$("#contextMenu").hide();
	});
};

FundInfoManage.ckeckCreate = function(){
	var fundCode = $("#fundCode_create").val();
	fundcode = $.trim(fundCode);
	 var reg1 = /[0-9]/;	
     if(!reg1.test(fundCode)){	
    	 $("#commit").attr("data-dismiss", "");
           alert("基金代码必须是6位数字组成");	
           return false;	
          } 	
     if (fundCode == undefined || fundCode == "") {	
    	 $("#commit").attr("data-dismiss", "");
            alert("基金代码不能为空");	
            return false;	
        }else{	
               if(fundCode.length>6){	
            	   $("#commit").attr("data-dismiss", "");
                 alert("基金代码过长,必须是6位数字组成");	
                 return false;	
	             }else if(fundCode.length<6){
	            	 $("#commit").attr("data-dismiss", "");
	                 alert("基金代码过短,必须是6位数字组成");	
	                 return false;	
	               }
	      }
     var fundName = $.trim($("#fundName_create").val());
     var fundFullName = $.trim($("#fundFullName_create").val());
	if(fundName == undefined || fundName == ""){$("#commit").attr("data-dismiss", "");alert("基金简称不能为空");return false;}
	if(fundName.length>20 ){$("#commit").attr("data-dismiss", "");alert("基金简称长度不能超过20");return false;}
	if(fundFullName == undefined || fundFullName == ""){$("#commit").attr("data-dismiss", "");alert("基金全称不能为空");return false;}
	if(fundFullName.length>40 ){$("#commit").attr("data-dismiss", "");alert("基金全称长度不能超过40");return false;}
	$("#commit").attr("data-dismiss", "modal");
	return true;
}

FundInfoManage.check = function(item){
	var fundName = $.trim(item.fundName);
	var fundFullName = $.trim(item.fundFullName);
	if(fundName == undefined || fundName == ""){alert("基金简称不能为空");return false;}
	if(fundName.length>20 ){alert("基金简称长度不能超过20");return false;}
	if(fundFullName == undefined || fundFullName == ""){alert("基金全称不能为空");return false;}
	if(fundFullName.length>40 ){alert("基金全称长度不能超过40");return false;}
	return true;
}