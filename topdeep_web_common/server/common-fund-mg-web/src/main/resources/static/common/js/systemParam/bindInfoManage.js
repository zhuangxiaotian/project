BindInfoManage = {};
var grid;
BindInfoManage.gridData=[];
BindInfoManage.plugin = new Slick.AutoTooltips();
BindInfoManage.bindSrc = [];
BindInfoManage.contextPath=contextPath;
var PageUtil;

BindInfoManage.initGrid = function() {
	var columns = [ {
		id : "custName",
		name : "客户名",
		field : "custName",
		editor : Slick.Editors.TextReadonly
	},{
		id : "openid",
		name : "OPENID",
		field : "openid",
		editor : Slick.Editors.TextReadonly
	} ,{
		id : "idType",
		name : "证件类型",
		field : "idType",
		formatter : BindInfoManage.FormatIdType,
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
		formatter : BindInfoManage.FormatSex,
	}, {
		id : "bindSrc",
		name : "来源",
		field : "bindSrc",
		formatter : BindInfoManage.FormatBindSrc,
	},  {
		id : "channel",
		name : "渠道",
		field : "channel",
		editor : Slick.Editors.TextReadonly
	},{
		id : "lastVisitTime",
		name : "最后登录时间",
		field : "lastVisitTime",
		formatter : BindInfoManage.FormatTime,
	},{
		id : "openTrade",
		name : "是否开通直销账号",
		field : "openTrade",
		formatter : BindInfoManage.FormatFlag,
	} ,{
		id : "bindTime",
		name : "绑定时间",
		field : "bindTime",
		formatter : BindInfoManage.FormatTime,
	}, {
		id : "bindFlag",
		name : "是否绑定",
		field : "bindFlag",
		formatter : BindInfoManage.FormatFlag,
	},{
		id : "operate",
		name : "操作",
		field : "",
		formatter : BindInfoManage.addOperateButton,
	} ];

	var options = {
		autoEdit : true,
		editable : true,
		enableAddRow : false,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight :35
	};
	grid = new Slick.Grid("#grid", BindInfoManage.gridData, columns, options);
	BindInfoManage.grid = grid;
	grid.registerPlugin(BindInfoManage.plugin);
	grid.autosizeColumns();
}

BindInfoManage.initGrid1 = function() {
	var columns = [ {
		id : "custName",
		name : "客户名",
		field : "custName",
		editor : Slick.Editors.TextReadonly
	},{
		id : "openid",
		name : "OPENID",
		field : "openid",
		editor : Slick.Editors.TextReadonly
	} ,{
		id : "idType",
		name : "证件类型",
		field : "idType",
		formatter : BindInfoManage.FormatIdType,
	},{
		id : "idNo",
		name : "证件号码",
		field : "idNo",
		editor : Slick.Editors.TextReadonly
	}, {
		id : "bindFlag",
		name : "是否绑定",
		field : "bindFlag",
		formatter : BindInfoManage.FormatFlag,
	},{
		id : "operate",
		name : "操作",
		field : "",
		formatter : BindInfoManage.addOperateButton,
	} ];

	var options = {
		autoEdit : true,
		editable : true,
		enableAddRow : false,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight :35
	};
	grid = new Slick.Grid("#grid", BindInfoManage.gridData, columns, options);
	BindInfoManage.grid = grid;
	grid.registerPlugin(BindInfoManage.plugin);
	grid.autosizeColumns();
}


BindInfoManage.FormatSex = function(row, cell, value, columnDef,dataContext){
	if(value=="1"){
		return "男";
	}else if(value=="2"){
		return "女";
	}else{
		return "";
	}
}
BindInfoManage.FormatFlag = function(row, cell, value, columnDef,dataContext){
	if(value=="0"){
		return "否";
	}else if(value=="1"){
		return "是";
	}else{
		return "";
	}
}
BindInfoManage.FormatTime = function(row, cell, value, columnDef,dataContext){
	 return TopdeepCommon.formatDate(new Date(value), "yyyy-MM-dd hh:MM:ss");
}
BindInfoManage.FormatBindSrc = function(row, cell, value, columnDef,dataContext){
	
	for(var i=0;i<BindInfoManage.bindSrc.length;i++){
		if(value == BindInfoManage.bindSrc[i].value){
			return BindInfoManage.bindSrc[i].name;
		}
	}
	return "";
}
BindInfoManage.FormatIdType = function(row, cell, value, columnDef,dataContext){
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
BindInfoManage.addOperateButton = function(row, cell, value, columnDef,dataContext){
	var item = BindInfoManage.gridData[row];
	var ret = "";
	if (item.bindFlag==1) {
		ret += "<input type='button' id='removeBind'  class='btn btn-default btn-sm' row='" + row
				+ "' value='解绑'/>";
	}
	return ret;
}

$(document).on("click","#removeBind",function(){
	var row = $(this).attr("row");
	var item = BindInfoManage.gridData[row];
	BindInfoManage.removeBind(item.bindSrc,item.openid);
})

BindInfoManage.initPage = function(){
	BindInfoManage.initGrid1();
	PageUtil = new TopdeepUtil.pageUtil(null,BindInfoManage.ajaxQuery,"");
	PageUtil.initPage();
	BindInfoManage.ajaxQuery(0);
	$("#bind_info_search_button").click(function(){
		$("#bindFlag").val("");
		BindInfoManage.ajaxQuery(0)
	})
}
$(document).on("click","#lookDetail",function(){
	BindInfoManage.initGrid();
	PageUtil = new TopdeepUtil.pageUtil(null,BindInfoManage.ajaxQuery,"");
	PageUtil.initPage();
	BindInfoManage.ajaxQuery(0);
	$("#bind_info_search_button").click(function(){
		BindInfoManage.ajaxQuery(0)
	})
})
$(document).on("click","#lookSimple",function(){BindInfoManage.initPage()})

BindInfoManage.removeBind = function(bindSrc,openid){
	var flag = window.confirm("是否确认解绑?");
	if(!flag){
		return false;
	}
	$.ajax({
		type : "POST",
		url : BindInfoManage.contextPath
				+ "/system/bindInfoManage!ajaxRemoveBind.action",
		data : {
			"bindInfo.bindSrc" : bindSrc,
			"bindInfo.openid" : openid,
		},
		datatype : "json",
		success : function(result) {
			try {
				if (result.success) {
					BindInfoManage.ajaxQuery(0);
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

$(document).on("click","#bindFlag",function(){
	$("#searchKeyword").val("");
	BindInfoManage.ajaxQuery(0);
})

BindInfoManage.ajaxQuery = function(pageIndex) {
	var bindFlag = $("#bindFlag").val();
	$.ajax({
				type : "POST",
				url : BindInfoManage.contextPath
						+ "/system/bindInfoManage!ajaxQuery.action",
				data : {
					"pageIndex" : pageIndex,
					"searchKeyword":$("#searchKeyword").val(),
					"bindInfo.bindFlag" : bindFlag,
				},
				datatype : "json",
				success : function(result) {
					try {
						if (result.success) {
							BindInfoManage.gridData = result.bindInfos;
							BindInfoManage.bindSrc = result.bindSrc;
							grid.setData(BindInfoManage.gridData);
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


