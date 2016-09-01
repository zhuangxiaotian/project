ClientBindInfoManage = {};
var grid;
ClientBindInfoManage.gridData=[];
ClientBindInfoManage.plugin = new Slick.AutoTooltips();
ClientBindInfoManage.bindSrc = [];
ClientBindInfoManage.contextPath=contextPath;
var PageUtil;
ClientBindInfoManage.initGrid = function() {
	var columns = [ {
		id : "custName",
		name : "客户名",
		field : "custName",
		editor : Slick.Editors.TextReadonly
	},{
		id : "openid",
		name : "设备ID",
		field : "openid",
		editor : Slick.Editors.TextReadonly
	} ,{
		id : "idType",
		name : "证件类型",
		field : "idType",
		formatter : ClientBindInfoManage.FormatIdType,
	},{
		id : "idNo",
		name : "证件号码",
		field : "idNo",
		editor : Slick.Editors.TextReadonly
	},{
		id : "mobilePhone",
		name : "手机号码",
		field : "mobilePhone",
		editor : Slick.Editors.TextReadonly
	},{
		id : "custSex",
		name : "客户性别",
		field : "custSex",
		formatter : ClientBindInfoManage.FormatSex,
	}, {
		id : "bindSrc",
		name : "来源",
		field : "bindSrc",
		formatter : ClientBindInfoManage.FormatBindSrc,
	},  {
		id : "channel",
		name : "渠道",
		field : "channel",
		editor : Slick.Editors.TextReadonly
	},{
		id : "lastVisitTime",
		name : "最后登录时间",
		field : "lastVisitTime",
		formatter : ClientBindInfoManage.FormatTime,
	},{
		id : "openTrade",
		name : "是否开通直销账号",
		field : "openTrade",
		formatter : ClientBindInfoManage.FormatFlag,
	} ,{
		id : "bindTime",
		name : "绑定时间",
		field : "bindTime",
		formatter : ClientBindInfoManage.FormatTime,
	}, {
		id : "bindFlag",
		name : "是否绑定",
		field : "bindFlag",
		formatter : ClientBindInfoManage.FormatFlag,
	}];

	var options = {
		autoEdit : true,
		editable : true,
		enableAddRow : false,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight :35
	};
	grid = new Slick.Grid("#grid", ClientBindInfoManage.gridData, columns, options);
	ClientBindInfoManage.grid = grid;
	grid.registerPlugin(ClientBindInfoManage.plugin);
	grid.autosizeColumns();
}

ClientBindInfoManage.initGrid1 = function() {
	var columns = [ {
		id : "custName",
		name : "客户名",
		field : "custName",
		editor : Slick.Editors.TextReadonly
	},{
		id : "openid",
		name : "设备ID",
		field : "openid",
		editor : Slick.Editors.TextReadonly
	} ,{
		id : "idType",
		name : "证件类型",
		field : "idType",
		formatter : ClientBindInfoManage.FormatIdType,
	},{
		id : "idNo",
		name : "证件号码",
		field : "idNo",
		editor : Slick.Editors.TextReadonly
	}, {
		id : "bindFlag",
		name : "是否绑定",
		field : "bindFlag",
		formatter : ClientBindInfoManage.FormatFlag,
	}];

	var options = {
		autoEdit : true,
		editable : true,
		enableAddRow : false,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight :35
	};
	grid = new Slick.Grid("#grid", ClientBindInfoManage.gridData, columns, options);
	ClientBindInfoManage.grid = grid;
	grid.registerPlugin(ClientBindInfoManage.plugin);
	grid.autosizeColumns();
}


ClientBindInfoManage.FormatSex = function(row, cell, value, columnDef,dataContext){
	if(value=="1"){
		return "男";
	}else if(value=="2"){
		return "女";
	}else{
		return "";
	}
}
ClientBindInfoManage.FormatFlag = function(row, cell, value, columnDef,dataContext){
	if(value=="0"){
		return "否";
	}else if(value=="1"){
		return "是";
	}else{
		return "";
	}
}
ClientBindInfoManage.FormatTime = function(row, cell, value, columnDef,dataContext){
	 return TopdeepCommon.formatDate(new Date(value), "yyyy-MM-dd hh:MM:ss");
}
ClientBindInfoManage.FormatBindSrc = function(row, cell, value, columnDef,dataContext){
	
	for(var i=0;i<ClientBindInfoManage.bindSrc.length;i++){
		if(value == ClientBindInfoManage.bindSrc[i].value){
			return ClientBindInfoManage.bindSrc[i].name;
		}
	}
	return "";
}
ClientBindInfoManage.FormatIdType = function(row, cell, value, columnDef,dataContext){
	if(value=="0"){
		return "身份证";
	}else if(value=="1"){
		return "护照";
	}else if(value=="2"){
		return "军官证";
	}else if(value=="3"){
		return "士兵证";
	}else if(value=="4"){
		return "回乡证";
	}else if(value=="5"){
		return "户口本";
	}else if(value=="6"){
		return "外国护照";
	}else if(value=="7"){
		return "其他";
	}else{
		return "";
	}
}

ClientBindInfoManage.initPage = function(){
	ClientBindInfoManage.initGrid1();
	PageUtil = new TopdeepUtil.pageUtil(null,ClientBindInfoManage.ajaxQuery,"");
	PageUtil.initPage();
	ClientBindInfoManage.ajaxQuery(0);
	$("#bind_info_search_button").click(function(){
		$("#bindFlag").val("");
		ClientBindInfoManage.ajaxQuery(0)
	})
}
$(document).on("click","#lookDetail",function(){
	ClientBindInfoManage.initGrid();
	PageUtil = new TopdeepUtil.pageUtil(null,ClientBindInfoManage.ajaxQuery,"");
	PageUtil.initPage();
	ClientBindInfoManage.ajaxQuery(0);
	$("#bind_info_search_button").click(function(){
		ClientBindInfoManage.ajaxQuery(0)
	})
})
$(document).on("click","#lookSimple",function(){ClientBindInfoManage.initPage()})

$(document).on("click","#bindFlag",function(){
	$("#searchKeyword").val("");
	ClientBindInfoManage.ajaxQuery(0);
})

ClientBindInfoManage.ajaxQuery = function(pageIndex) {
	var bindFlag = $("#bindFlag").val();
	$.ajax({
				type : "POST",
				url : ClientBindInfoManage.contextPath
						+ "/system/clientBindInfoManage!ajaxQuery.action",
				data : {
					"pageIndex" : pageIndex,
					"searchKeyword":$("#searchKeyword").val(),
					"bindInfo.bindFlag" : bindFlag,
				},
				datatype : "json",
				success : function(result) {
					try {
						if (result.success) {
							ClientBindInfoManage.gridData = result.bindInfos;
							ClientBindInfoManage.bindSrc = result.bindSrc;
							grid.setData(ClientBindInfoManage.gridData);
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


