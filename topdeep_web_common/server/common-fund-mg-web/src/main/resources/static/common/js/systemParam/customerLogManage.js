CustomerLogManage = {};
var grid;
CustomerLogManage.contextPath=contextPath;
CustomerLogManage.gridData=[];
CustomerLogManage.idTypeList=[];
var plugin = new Slick.AutoTooltips();
var PageUtil;
CustomerLogManage.initGrid = function() {
	var columns = [ {
		id : "customerNo",
		name : "客户编号",
		field : "customerNo",
		editor : Slick.Editors.TextReadonly
	},{
		id : "idType",
		name : "证件类型",
		field : "idType",
		formatter : CustomerLogManage.FormatIdType
	} ,{
		id : "idNO",
		name : "证件号码",
		field : "idNo",
		editor : Slick.Editors.TextReadonly
	},{
		id : "clientSrc",
		name : "来源",
		field : "clientSrc",
		formatter : CustomerLogManage.FormatSrc
	},{
		id : "actionTime",
		name : "访问时间",
		field : "actionTime",
		formatter : CustomerLogManage.FormatTime
	},{
		id : "actionType",
		name : "访问类型",
		field : "actionType",
		editor : Slick.Editors.TextReadonly
	}, {
		id : "actionParam1",
		name : "参数1",
		field : "actionParam1",
		editor : Slick.Editors.TextReadonly
	},  {
		id : "actionParam2",
		name : "参数2",
		field : "actionParam2",
		editor : Slick.Editors.TextReadonly
	},{
		id : "actionParam3",
		name : "参数3",
		field : "actionParam3",
		editor : Slick.Editors.TextReadonly
	} ];

	var options = {
		autoEdit : true,
		editable : true,
		enableAddRow : false,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight :40
	};
	grid = new Slick.Grid("#grid", CustomerLogManage.gridData, columns, options);
	CustomerLogManage.grid = grid;
	grid.registerPlugin(plugin);
	grid.autosizeColumns();
}

CustomerLogManage.FormatTime = function(row, cell, value, columnDef,dataContext){
	 return TopdeepCommon.formatDate(new Date(value), "yyyy-MM-dd hh:MM:ss");
}
CustomerLogManage.FormatSrc = function(row, cell, value, columnDef,dataContext){
	if(value=="0"){
		return "门户网站";
	}else if(value=="1"){
		return "手机网站";
	}else if(value=="2"){
		return "客户端";
	}else if(value=="3"){
		return "交易网站";
	}else if(value=="4"){
		return "微信网关";
	}else if(value=="5"){
		return "微信网站";
	}
}
CustomerLogManage.FormatIdType = function(row, cell, value, columnDef,dataContext){
	for(var i=0;i<CustomerLogManage.idTypeList.length;i++){
		if(CustomerLogManage.idTypeList[i].name==value){
			return CustomerLogManage.idTypeList[i].value;
		}
	}

}


CustomerLogManage.initPage = function(idTypeList){
	CustomerLogManage.idTypeList = idTypeList;
	CustomerLogManage.initGrid();
	PageUtil = new TopdeepUtil.pageUtil(null,CustomerLogManage.ajaxQuery,"");
	PageUtil.initPage();
	CustomerLogManage.ajaxQuery(0);
	$("#customer_log_search_button").click(function(){
	CustomerLogManage.ajaxQuery(0)
	})
}


CustomerLogManage.ajaxQuery = function(pageIndex) {
	$.ajax({
				type : "POST",
				url : CustomerLogManage.contextPath
						+ "/system/customerLogManage!ajaxQuery.action",
				data : {
					"pageIndex" : pageIndex,
					"searchKeyword":$("#searchKeyword").val(),
				},
				datatype : "json",
				success : function(result) {
					try {
						if (result.success) {
							CustomerLogManage.gridData = result.customerLogs;
							grid.setData(CustomerLogManage.gridData);
							PageUtil.pageData = result.pageData;
							grid.render();
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

$(document).on("click","#exportCurrentPage",function(){
	CustomerLogManage.exportCurrentPage();
	return false;
})
$(document).on("click","#exportAll",function(){
	CustomerLogManage.exportAll();
	return false;
})

CustomerLogManage.exportAll  = function(){
	window.location.href= CustomerLogManage.contextPath + "/system/customerLogManage!exportCustomerLog.action?pageIndex=-1";
	return false;
};
CustomerLogManage.exportCurrentPage = function(){
	window.location.href= CustomerLogManage.contextPath + "/system/customerLogManage!exportCustomerLog.action?pageIndex="+$("#pageIndex").val()+"&searchKeyword="+$("#searchKeyword").val();
	return false;
};

