var NoticeManage = {};
NoticeManage.gridData = [];
NoticeManage.grid = null;
NoticeManage.contextPath=contextPath;
NoticeManage.pageUtil;

NoticeManage.ajaxQuery = function(pageIndex) {	
	var searchKeyword = $("#siteInfo_search_keyword").val();
	$.ajax({
				type : "POST",
				url : NoticeManage.contextPath
						+ "/fund_notice/noticeManage!ajaxQuery.action",
				data : {"pageIndex":pageIndex,"searchKeyword":searchKeyword},
				datatype : "json",
				contentType : "application/x-www-form-urlencoded; charset=utf-8",
				success : function(result) {		
					try{
						if(result.success){
							NoticeManage.gridData = result.fundCustMessageList;
							NoticeManage.grid.setData(NoticeManage.gridData);
							NoticeManage.grid.render();
							NoticeManage.pageUtil.pageData = result.pageData;
							NoticeManage.pageUtil.refreshPage();
							NoticeManage.grid.setSelectedRows([]);
						}else{
							alert(result.tipMessage);
						}
					}catch(e){
							alert("获取公告通知列表失败");
					}
				},
				error : function() {
				}
			});

};


NoticeManage.initSlickGrid = function(){
	var checkboxSelector = new Slick.CheckboxSelectColumn({});
	var columns = [ checkboxSelector.getColumnDefinition(),{
		id : "messageTitle",
		name : "标题",
		field : "messageTitle",
		editor : Slick.Editors.Text
	}, {
		id : "messageContent",
		name : "内容",
		field : "messageContent",
		editor : Slick.Editors.Text
	},{
		id : "messageType",
		name : "消息类型",
		field : "messageType",
		formatter : NoticeManage.formatType
	},{
		id : "auditState",
		name : "审核状态",
		field : "auditState",
		formatter : NoticeManage.formatAudit
	}, {
		id : "publishTime",
		name : "发布时间",
		field : "publishTime",
		fieldType: "datetime",
		formatter:NoticeManage.formatDate,
		editor : NoticeManage.DateEditor
	},{
		id : "showChannel",
		name : "发布渠道",
		field : "showChannel",
		formatter : NoticeManage.formatChannel
	}, {
		id : "operate",
		name : "操作",
		field : "",
		formatter : NoticeManage.operate
	} ];
	
	var options = {
		editable : true,
		enableAddRow : true,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 36
	};

	NoticeManage.grid = new Slick.Grid("#myGrid", NoticeManage.gridData, columns, options);
	NoticeManage.grid.autosizeColumns();

	NoticeManage.grid.onClick.subscribe(function(e) {
		e.preventDefault();
		var cell = NoticeManage.grid.getCellFromEvent(e);
		if (cell.cell == 3) {
			$("#contextMenu").data("row", cell.row).css("top", e.pageY).css(
					"left", e.pageX).show();
		}

	});

	NoticeManage.grid.onAddNewRow.subscribe(function(e, args) {
		var item = args.item;
		NoticeManage.grid.invalidateRow(NoticeManage.gridData.length);
		NoticeManage.gridData.push(item);
		item.changed = true;
		item.isNew = true;
		NoticeManage.grid.updateRowCount();
		NoticeManage.grid.render();
	});

	NoticeManage.grid.onCellChange.subscribe(function(e, args) {
		var item = args.item;
		item.changed = true;
		item.isNew=false;
		NoticeManage.grid.updateRow(args.row);
	});
	NoticeManage.grid.autosizeColumns();
	NoticeManage.grid.setSelectionModel(new Slick.RowSelectionModel({selectActiveRow: false}));
	NoticeManage.grid.registerPlugin(checkboxSelector);
}

NoticeManage.DateEditor = function(args) {
	var $input;
	var defaultValue;
	var scope = this;
	var calendarOpen = false;
	this.init = function() {
		$input = $("<INPUT type=text readonly='readonly' class='editor-text' />");
		$input.appendTo(args.container);
		$input.focus().select();
		$input.datetimepicker(
		{
			lang:'ch', 
			minDate:"+0d",
			minTime:"+1s",
			format:'Y-m-d H:i',
			step:30,
			beforeShow : function() {
				calendarOpen = true
			},
			onClose : function() {
				calendarOpen = false
			}
	    });
		$input.width($input.width() - 18);
	};

	this.destroy = function() {
		$.datepicker.dpDiv.stop(true, true);
		$input.datepicker("hide");
		$input.datepicker("destroy");
		$input.remove();
	};

	this.focus = function() {
		$input.focus();
	};

	this.loadValue = function(item) {
		defaultValue = item[args.column.field];
		$input.val(defaultValue);
		$input[0].defaultValue = defaultValue;
		$input.select();
	};

	this.serializeValue = function() {
		return $input.val()+":00";
	};

	this.applyValue = function(item, state) {
		item[args.column.field] = state;
	};

	this.isValueChanged = function() {
		return (!($input.val() == "" && defaultValue == null))
				&& ($input.val() != defaultValue);
	};

	this.validate = function() {
		return {
			valid : true,
			msg : null
		};
	};

	this.init();
}

NoticeManage.operate = function(row, cell, value, columnDef, dataContext) {
	var item = NoticeManage.gridData[row];
	var ret = "";
	if(item.id!=null){
		if(item.changed){
			ret+= "<input id = 'save" + row + "'  type='button' class='commitRow btn btn-default' row='" + row + "' value='保存'/>";
		}
	}else{
		ret+= "<input id = 'save" + row + "' type='button' class='commitRow btn btn-default' row='" + row + "' value='保存'/>";
	}
	return ret;
}


NoticeManage.ajaxAudit = function(id,auditState){
	if(id == null){
		return null;
	}
	$.ajax({
		type:"POST",
		url:NoticeManage.contextPath + "/fund_notice/noticeManage!ajaxAudit.action",
		data:{"idList":id,"auditState":auditState},	
		datatype:"json",
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		success:function(result){
			try{
				if(result.success){
					NoticeManage.ajaxQuery(0);
					NoticeManage.grid.setSelectedRows([]);
				}else{
					alert(result.tipMessage);
				}
			}catch(e){
					alert("审核失败");
			}
		},
		error:function(){
			alert("审核失败");
		}
	});
};

NoticeManage.ajaxSave = function(obj){
	$.ajax({
		type:"POST",
		url:NoticeManage.contextPath + "/fund_notice/noticeManage!ajaxSave.action",
		data:{"title":obj.messageTitle,"content":obj.messageContent,"date":obj.publishTime,"type":obj.messageType,"channel":obj.showChannel,"id":obj.id},	
		datatype:"json",
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		success:function(result){
			try{
				if(result.success){
					alert("保存成功!");
					NoticeManage.ajaxQuery(0);
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

NoticeManage.formatDate = function(row, cell, value, columnDef, dataContext) {
	if (value == "" || value == undefined) {
		value = "";
	} else {
		if(value.length != 19){
			value = TopdeepCommon.formatDate(new Date(value), "yyyy-MM-dd hh:mm:ss");
		}
		NoticeManage.gridData[row].publishTime = value;
	}
	return value;
};

NoticeManage.formatChannel = function(row, cell, value, columnDef, dataContext) {
	var wxCheck = "";
	var ret = "";
	if(value !=null && value.indexOf("1")>=0){
		wxCheck = "checked='checked'";
	}
	ret+= "<input type='checkbox' "+wxCheck+" id = 'wxcheckbox" + row + "' value='1' onclick='checkBox(\""+row+"\")' row='"+row+"'> 微信";
	var appCheck = "";
	if(value !=null && value.indexOf("2")>=0){
		appCheck = "checked='checked'";
	}
	ret+= "<input type='checkbox' "+appCheck+" id = 'appcheckbox" + row + "' value='2' onclick='checkBox(\""+row+"\")'  row='"+row+"'> app";
	var webCheck = "";
	if(value !=null && value.indexOf("3")>=0){
		webCheck = "checked='checked'";
	}
	ret+= "<input type='checkbox' "+webCheck+" id = 'webcheckbox" + row + "' value='3' onclick='checkBox(\""+row+"\")'  row='"+row+"'> PC";
	return ret;
}

function checkBox(row){
	
	if (row == NoticeManage.gridData.length) {
		NoticeManage.gridData[row] = {};
	}
	var checked = "";
	if($("#wxcheckbox"+row).is(':checked')){
		checked = "1";
	}
	if($("#appcheckbox"+row).is(':checked')){
		if(checked!=""){
			checked +=",";
		}
		checked += "2";
	}
	if($("#webcheckbox"+row).is(':checked')){
		if(checked!=""){
			checked +=",";
		}
		checked += "3";
	}
	NoticeManage.gridData[row].showChannel = checked;
	NoticeManage.gridData[row].changed = true;
	NoticeManage.grid.updateRow(row);
}

NoticeManage.formatAudit = function(row, cell, value, columnDef, dataContext) {
	if(value == "1"){
		value = "审核通过";
	}else if(value == "2"){
		value = "审核拒绝";
	}else if(value=="0"){
		value = "未审核";
	}else{
		value = "未审核";
	}
	return value;
};

NoticeManage.formatType = function(row, cell, value, columnDef, dataContext) {
	if(value == "1"){
		value = "交易消息";
	}else if(value == "2"){
		value = "系统消息";
	}else if(value=="3"){
		value = "活动消息";
	}else{
		value = "交易消息";
	}
	return value;
};

NoticeManage.getSelected = function(){
	var rowIds =NoticeManage.grid.getSelectedRows();
	var ids = '';
	for (var i = 0; i < rowIds.length; i++) {
		ids += NoticeManage.gridData[rowIds[i]].id + ",";
	}
	return ids;
}

//初始化
NoticeManage.initPage = function(){	
	NoticeManage.initSlickGrid();
	NoticeManage.pageUtil = new TopdeepUtil.pageUtil(null,NoticeManage.ajaxQuery,"");
	NoticeManage.pageUtil.initPage();
	NoticeManage.ajaxQuery("0");
	$(document).on("click", ".commitRow", function() {
		var row = $(this).attr("row");
		NoticeManage.ajaxSave(NoticeManage.gridData[row]);
		return false;
	});
	$("#contextMenu").click(function(e) {
		if (!$(e.target).is("li")) {
			return;
		}
		if (!NoticeManage.grid.getEditorLock().commitCurrentEdit()) {
			return;
		}
		var row = $(this).data("row");
		if (row == NoticeManage.gridData.length) {
			NoticeManage.gridData[row] = {};
		}
		NoticeManage.gridData[row].messageType = $(e.target).attr("data");
		NoticeManage.gridData[row].changed = true;
		NoticeManage.grid.updateRow(row);

		$("#contextMenu").hide();
	});
	
	$("#siteInfo_search_keyword_button").click(function(e) {
		NoticeManage.ajaxQuery(0);
	});
	function audit(row){
		var id = NoticeManage.gridData[row].id;
		var auditState = "1";
		
	}

	function auditnot(row){
		var id = NoticeManage.gridData[row].id;
		var auditState = "2";
		NoticeManage.ajaxAudit(id,auditState);
	}

	$(document).on("click", "#changeAuditState", function() {
		var ids = NoticeManage.getSelected();
		if(ids.length==0){
			alert("请勾选审核项");
			return false;
		}
		if(!window.confirm("是否审核这些项?")){
			return false;
		}
		var auditState = "1";
		NoticeManage.ajaxAudit(ids,auditState);
	})

	$(document).on("click", "#removeAuditState", function() {
		var ids = NoticeManage.getSelected();
		if(ids.length==0){
			alert("请勾选反审核项");
			return false;
		}
		if(!window.confirm("是否反审核这些项?")){
			return false;
		}
		var auditState = "2";
		NoticeManage.ajaxAudit(ids,auditState);
	})
	
};
