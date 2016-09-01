var ClientVersionManage = {};
var grid;
ClientVersionManage.gridData = [];
ClientVersionManage.clientVersions=[];
ClientVersionManage.contextPath=contextPath;
var clientType="";
var clientVersion="";
var plugin = new Slick.AutoTooltips();
var PageUtil;
ClientVersionManage.initGrid = function() {
//	var columnDefinition={};
//	checkboxSelector = new Slick.CheckboxSelectColumn({});
//	columnDefinition=checkboxSelector.getColumnDefinition();
	var columns = [{
		id : "clientType",
		name : "客户端类型",
		field : "clientType",
	}, {
		id : "clientVersion",
		name : "客户端版本",
		field : "clientVersion",
		editor : Slick.Editors.Text
	},{
		id : "clientState",
		name : "客户端状态",
		field : "clientState",
		formatter : ClientVersionManage.FormatClientState
	},  {
		id : "releaseTime",
		name : "发布时间",
		field : "releaseTime",
		editor : Slick.Editors.Text,
	}, {
		id : "clientSignature",
		name : "客户端签名",
		field : "clientSignature",
		editor : Slick.Editors.Text
	},{
		id : "currentInstallUrl",
		name : "当前版本下载地址",
		field : "currentInstallUrl",
		editor : Slick.Editors.Text
	},
	 {
		id : "nextUpdateUrl",
		name : "升级版本下载地址",
		field : "nextUpdateUrl",
		editor : Slick.Editors.Text
	},	{
		id : "clientEncryptKey",
		name : "客户端加密KEY",
		field : "clientEncryptKey",
		editor : Slick.Editors.Text
	},{
		id : "clientSignKey",
		name : "客户端签名KEY",
		field : "clientSignKey",
		editor : Slick.Editors.Text
	},{
		id : "operate",
		name : "操作",
		field : "",
		formatter : ClientVersionManage.addOperateButton
	} ];

	var options = {
		autoEdit : true,
		editable : true,
		enableAddRow : true,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 40
	};
	grid = new Slick.Grid("#grid", ClientVersionManage.gridData, columns, options);
	ClientVersionManage.grid = grid;
	grid.autosizeColumns();
	grid.registerPlugin(plugin);
	grid.autosizeColumns();
//	 grid.setSelectionModel(new Slick.RowSelectionModel({selectActiveRow: false}));
//	grid.registerPlugin(checkboxSelector);

	grid.onClick.subscribe(function(e) {
		e.preventDefault();
		var cell = grid.getCellFromEvent(e);
		if (cell.cell == 0) {
			$(".clientType").data("row", cell.row).css("top", e.pageY).css(
					"left", e.pageX).show();
		} else {
			$(".clientType").data("row", cell.row).css("top", e.pageY).css(
					"left", e.pageX).hide();
		}
		if (cell.cell == 2) {
			$(".clientState").data("row", cell.row).css("top", e.pageY).css(
					"left", e.pageX).show();
		} else {
			$(".clientState").data("row", cell.row).css("top", e.pageY).css(
					"left", e.pageX).hide();
		}
	})

	grid.onAddNewRow.subscribe(function(e, args) {
		var item = args.item;
		grid.invalidateRow(ClientVersionManage.gridData.length);
		ClientVersionManage.gridData.push(item);
		item.changed = true;
		item.isNew = true;
		grid.updateRowCount();
		grid.render();
	});

	grid.onCellChange.subscribe(function(e, args) {
		var item = args.item;
		item.changed = true;
		grid.updateRow(args.row);
	});
	$(".clientType").click(function(e) {
		if (!$(e.target).is("li")) {
			return;
		}
		if (!grid.getEditorLock().commitCurrentEdit()) {
			return;
		}
		var row = $(this).data("row");
		if (row == ClientVersionManage.gridData.length) {
			ClientVersionManage.gridData[row] = {};
		}
		ClientVersionManage.gridData[row].clientType = $(e.target).attr("data");
		ClientVersionManage.gridData[row].changed = true;
		grid.updateRow(row);
		$(".clientType").hide();
	});
	$(".clientState").click(function(e) {
		if (!$(e.target).is("li")) {
			return;
		}
		if (!grid.getEditorLock().commitCurrentEdit()) {
			return;
		}
		var row = $(this).data("row");
		if (row == ClientVersionManage.gridData.length) {
			ClientVersionManage.gridData[row] = {};
		}
		ClientVersionManage.gridData[row].clientState = $(e.target).attr("data");
		ClientVersionManage.gridData[row].changed = true;
		grid.updateRow(row);
		$(".clientState").hide();
	});
}

ClientVersionManage.FormatClientState = function(row, cell, value, columnDef,dataContext) {
	if ("0" == value) {
		return "版本最新,允许运行";
	} else if ("1" == value) {
		return "版本已旧,允许运行";
	} else if("2"==value){
		return "版本已旧,禁止运行";
	}else{
		return "";
	}
}

ClientVersionManage.addOperateButton = function(row, cell, value, columnDef,dataContext) {
	var item = ClientVersionManage.gridData[row];
	var ret = "";
	if (!item.isNew) {
		ret += "<input type='button' id='deleteRow' class='btn btn-default btn_sm' row='" + row
				+ "' value='删除'/>";
	}
	if (item.changed) {
		ret += "<input type='button' id='commitRow'  class='btn btn-default btn_sm' row='" + row
				+ "' value='保存'/>";
	}
	return ret;

}

ClientVersionManage.ajaxSave = function(obj, row) {
	if(ClientVersionManage.clientVersions[row]){
		if(ClientVersionManage.clientVersions[row].clientType!=obj.clientType){
			alert("客户端类型不可修改");
			return false;
		}
		if(ClientVersionManage.clientVersions[row].clientVersion!=obj.clientVersion){
			alert("客户端版本不可修改");
			return false;
		}
	}
	if(obj.clientVersion != null){
		if(obj.clientVersion.length > 50){
			alert("客户端版本长度不能超过50");
			return false;
		}
	}
	
	if(obj.clientSignature != null){
		if(obj.clientSignature.length > 200){
			alert("客户端签名长度不能超过200");
			return false;
		}
	}
	
	if(obj.currentInstallUrl != null){
		if(obj.currentInstallUrl.length > 500){
			alert("当前版本下载地址和升级版本下载地址长度不能超过500");
			return false;
		}
	}
	
	if(obj.clientEncryptKey != null){
		if(obj.clientEncryptKey.length > 100){
			alert("客户端加密key长度不能超过100");
			return false;
		}
	}
	
	if(obj.clientSignKey != null){
		if(obj.clientSignKey.length > 100){
			alert("客户端签名key长度不能超过100");
			return false;
		}
	}
	
	$.ajax({
		type : "POST",
		url : ClientVersionManage.contextPath + "/client/clientVersionManage!ajaxSave.action",
		data : {"clientVersion.clientType":obj.clientType,"clientVersion.clientVersion":obj.clientVersion,"clientVersion.clientState":obj.clientState,
			"clientVersion.releaseTime":TopdeepCommon.formatDate(new Date(obj.releaseTime),"yyyy-MM-dd hh:mm:ss"),"clientVersion.clientSignature":obj.clientSignature,"clientVersion.currentInstallUrl":obj.currentInstallUrl,
			"clientVersion.nextUpdateUrl":obj.currentInstallUrl,"clientVersion.clientEncryptKey":obj.clientEncryptKey,"clientVersion.clientSignKey":obj.clientSignKey,
			"clientVersion.createTime":obj.createTime==undefined?"":TopdeepCommon.formatDate(new Date(obj.createTime),"yyyy-MM-dd hh:mm:ss"),"clientVersion.rowVersion":obj.rowVersion==undefined?"":obj.rowVersion},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (result.success) {
					alert("保存成功");
					ClientVersionManage.ajaxQuery(0);
				} else {
					alert(result.tipMessage);
				}
			} catch (e) {
				alert("添加客户端版本失败" + e);
			}
		},
		error : function() {
			alert("添加失败");
		}
	});
};

ClientVersionManage.ajaxDelete = function(row) {
	var item = ClientVersionManage.gridData[row];
	if(!window.confirm("是否确认删除")){
		return false;
	}
	$.ajax({
		type : "POST",
		url : ClientVersionManage.contextPath
				+ "/client/clientVersionManage!ajaxDelete.action",
		data : {
			"clientVersion.clientType" : item.clientType,
			"clientVersion.clientVersion":item.clientVersion
		},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (result.success) {
					ClientVersionManage.ajaxQuery(0);
				} else {
					alert(result.tipMessage);
				}
			} catch (e) {
				alert("删除版本失败" + e);
			}
		},
		error : function() {
			alert("删除版本失败");
		}
	});
};


ClientVersionManage.ajaxQuery = function(pageIndex) {
	var searchKeyword = $("#searchKeyword").val();
	$.ajax({
				type : "POST",
				url : ClientVersionManage.contextPath
						+ "/client/clientVersionManage!ajaxQuery.action",
				data : {
					"pageIndex" : pageIndex,
					"searchKeyword" : searchKeyword,
				},
				datatype : "json",
				success : function(result) {
					try {
						if (result.success) {
							ClientVersionManage.clientVersions  = jQuery.extend(true,{}, result.clientVersions); 
							ClientVersionManage.gridData = result.clientVersions;
							for(var i=0;i<result.clientVersions.length;i++){
								var clientVersion = result.clientVersions[i];
								clientVersion.releaseTime = TopdeepCommon.formatDate(new Date(clientVersion.releaseTime),"yyyy-MM-dd hh:mm:ss");
							}
							grid.setData(ClientVersionManage.gridData);
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
					alert("查询失败")
				}
			});
}

ClientVersionManage.initPage = function() {
	ClientVersionManage.initGrid();
	PageUtil = new TopdeepUtil.pageUtil(null,ClientVersionManage.ajaxQuery,"");
	PageUtil.initPage();
	ClientVersionManage.ajaxQuery(0)
	$("#client_version_search_button").click(function(){
		ClientVersionManage.ajaxQuery(0)
	})

	$(document).on("click", "#commitRow", function() {
		var row = $(this).attr("row");
		var item = ClientVersionManage.gridData[row];
		if (ClientVersionManage.check(item)) {
			ClientVersionManage.ajaxSave(item, row);
		}
		return false;
	});

	$(document).on("click", "#deleteRow", function() {
		var row = $(this).attr("row");
		ClientVersionManage.ajaxDelete(row);
		return false;
	});
}

ClientVersionManage.check = function(item) {
	if(item.clientType==""||item.clientType==undefined){
		alert("请输入客户端类型");
		return false;
	}
	if(item.clientVersion==""||item.clientVersion==undefined){
		alert("请输入客户端版本");
		return false;
	}
	if(item.clientState==""||item.clientState==undefined){
		alert("请选择客户端状态");
		return false;
	}
	if(item.releaseTime==""||item.releaseTime==undefined||TopdeepCommon.formatDate(new Date(item.releaseTime),"yyyy-MM-dd hh:mm:ss")=="NaN-NaN-NaN NaN:NaN:NaN"){
		alert("请输入正确的发布时间,格式为yyyy-MM-dd hh:mm:ss");
		return false;
	}if(item.clientEncryptKey==""||item.clientEncryptKey==undefined){
		alert("请输入客户端加密KEY");
		return false;
	}
	if(item.clientSignKey==""||item.clientSignKey==undefined){
		alert("请输入客户端签名KEY");
		return false;
	}
	
	return true;
}
