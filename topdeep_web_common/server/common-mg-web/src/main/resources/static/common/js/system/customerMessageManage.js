var CustomerMessageManage = {};
CustomerMessageManage.contextPath =contextPath;
var grid;
var plugin;
CustomerMessageManage.gridData = [];
CustomerMessageManage.PageUtil;
CustomerMessageManage.ajaxQuery = function(pageIndex) {	
	var searchKeyword = $("#param_keyword_search").val();
	var replyState = $("#replyState").val();
	var aduitState = $("#aduitState").val();
	$.ajax({
				type : "POST",
				url : CustomerMessageManage.contextPath
						+ "/system/customerMessageManage!ajaxQuery.action",
				data : {"pageIndex":pageIndex,"searchKeyword" : searchKeyword,"systemVisitMessage.replyStatus":replyState,"systemVisitMessage.auditState":aduitState},
				datatype : "json",
				contentType : "application/x-www-form-urlencoded; charset=utf-8",
				success : function(result) {		
					try{
						if(result.success){
							CustomerMessageManage.gridData = result.systemVisitMessageList;
							CustomerMessageManage.showData();
							CustomerMessageManage.PageUtil.pageData = result.pageData;
							CustomerMessageManage.PageUtil.refreshPage();
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

CustomerMessageManage.showData = function(){
	var columns = [ {
		id : "operate",
		name : "操作",
		field : "",
		formatter : CustomerMessageManage.addParamButton,
		width:50
	},{
		id : "title",
		name : "标题",
		field : "title",
		width:50
	}, {
		id : "message",
		name : "留言内容",
		field : "message",
		width:50
	}, {
		id : "nickname",
		name : "客户姓名",
		field : "nickname",
		width:20
	},{
		id : "replyContent",
		name : "回复内容",
		field : "replyContent",
		editor : Slick.Editors.Text,
		width:50
	},{
		id : "replyer",
		name : "回复人",
		field : "replyer",
		editor : Slick.Editors.Text,
		width:20
	},{
		id : "customerNo",
		name : "客户号",
		field : "customerNo",
		width:20
	},{
		id : "email",
		name : "email",
		field : "email",
		width:20
	},{
		id : "telephone",
		name : "手机/电话",
		field : "telephone",
		width:20
	},{
		id : "address",
		name : "联系地址",
		field : "address",
		width:30
	},{
		id : "visitTime",
		name : "留言时间",
		field : "visitTime",
		formatter : CustomerMessageManage.formatTime,
		width:20
	},{
		id : "replyTime",
		name : "回复时间",
		field : "replyTime",
		formatter : CustomerMessageManage.formatTime,
		width:20
	}];

	var options = {
		autoEdit : true,
		editable : true,
		enableAddRow : false,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 40
	};

	grid = new Slick.Grid("#grid", CustomerMessageManage.gridData, columns, options);
	grid.autosizeColumns();
	plugin = new Slick.AutoTooltips();
	grid.registerPlugin(plugin);
	grid.onAddNewRow.subscribe(function(e, args) {
		var item = args.item;
		grid.invalidateRow(CustomerMessageManage.gridData.length);
		CustomerMessageManage.gridData.push(item);
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

CustomerMessageManage.addParamButton = function(row, cell, value, columnDef, dataContext) {
	var item = CustomerMessageManage.gridData[row];
	var html = "";
		html+="<input type='button' class='commitRow btn btn-default' row='" + row + "' value='保存'/>";
		if(item.auditState == "0"){
			html+="<input type='button' class='aduitRow btn btn-default' row='" + row + "' value='审核'/>";
		}else{
			html+="<input type='button' class='aduitReverseRow btn btn-default' row='" + row + "' value='反审核'/>";
		}
		return html;
}

CustomerMessageManage.formatTime = function(row, cell, value, columnDef, dataContext) {
		if(value == undefined){
			return "";
		}
		var value = TopdeepCommon.formatDate(new Date(value),"yyyy-MM-dd hh:mm:ss");
		return value;
	}

CustomerMessageManage.ajaxSave = function(obj, row){
	$.ajax({
		type:"POST",
		url:CustomerMessageManage.contextPath + "/system/customerMessageManage!ajaxSave.action",
		data:{"systemVisitMessage.id":obj.id ,"systemVisitMessage.replyContent":obj.replyContent,"systemVisitMessage.replyer":obj.replyer},	
		datatype:"json",
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		success:function(result){
			try{
				if(result.success){
					if(row){
						obj.changed = false;
						grid.updateRow(row);
					}
					CustomerMessageManage.ajaxQuery("0");
					alert("保存成功!");
				}else{
					alert(result.tipMessage);
				}
			}catch(e){
					alert("留言记录修改失败");
			}
		},
		error:function(){
			alert("留言记录修改失败")
		}
	});
};

CustomerMessageManage.ajaxUpdateAduit = function(obj, state,row){
	$.ajax({
		type:"POST",
		url:CustomerMessageManage.contextPath + "/system/customerMessageManage!ajaxUpdateAduit.action",
		data:{"systemVisitMessage.id":obj.id,"systemVisitMessage.auditState":state},	
		datatype:"json",
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		success:function(result){
			try{
				if(result.success){
					if(row){
						obj.changed = false;
						grid.updateRow(row);
					}
					CustomerMessageManage.ajaxQuery("0");
					if(state == "1"){
						alert("审核成功!");
					}else{
						alert("反审核成功!");
					}
				}else{
					alert(result.tipMessage);
				}
			}catch(e){
				alert("留言记录修改失败");
			}
		},
		error:function(){
			alert("留言记录修改失败")
		}
	});
};

//初始化
CustomerMessageManage.initPage = function(){	
	CustomerMessageManage.PageUtil = new TopdeepUtil.pageUtil(null,CustomerMessageManage.ajaxQuery,"");
	CustomerMessageManage.PageUtil.initPage();
	CustomerMessageManage.ajaxQuery("0");
	
	$(document).on("click", "#message_keyword_search_button", function() {
		CustomerMessageManage.ajaxQuery("0");
	});
	
	$(document).on("click", ".commitRow", function() {
		var row = $(this).attr("row");
		var item = CustomerMessageManage.gridData[row];
			CustomerMessageManage.ajaxSave(CustomerMessageManage.gridData[row], row);
		return false;
	});
	
	$(document).on("click", ".aduitRow", function() {
		var row = $(this).attr("row");
		var item = CustomerMessageManage.gridData[row];
		CustomerMessageManage.ajaxUpdateAduit(CustomerMessageManage.gridData[row], "1", row);
		return false;
	});
	
	$(document).on("click", ".aduitReverseRow", function() {
		var row = $(this).attr("row");
		var item = CustomerMessageManage.gridData[row];
		CustomerMessageManage.ajaxUpdateAduit(CustomerMessageManage.gridData[row], "0", row);
		return false;
	});
};
