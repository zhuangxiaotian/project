var EcTradeSeatManage = {};
EcTradeSeatManage.gridData = [];
EcTradeSeatManage.grid = null;
EcTradeSeatManage.contextPath=contextPath;
EcTradeSeatManage.pageUtil;

EcTradeSeatManage.ajaxQuery = function(pageIndex) {	
	var searchKeyword = $("#siteInfo_search_keyword").val();
	$.ajax({
				type : "POST",
				url : EcTradeSeatManage.contextPath
						+ "/systemParam/ecTradeSeatManage!ajaxQuery.action",
				data : {"pageIndex":pageIndex,"searchKeyword":searchKeyword},
				datatype : "json",
				contentType : "application/x-www-form-urlencoded; charset=utf-8",
				success : function(result) {		
					try{
						if(result.success){
							for(var i = 0;i<result.ecTradeSeatList.length;i++){
								result.ecTradeSeatList[i].orderField = TopdeepCommon.formatDate(new Date(result.ecTradeSeatList[i].orderField), "yyyy-MM-dd hh:mm:ss");
							}
							
							EcTradeSeatManage.gridData = result.ecTradeSeatList;
							EcTradeSeatManage.grid.setData(EcTradeSeatManage.gridData);
							EcTradeSeatManage.grid.render();
							EcTradeSeatManage.pageUtil.pageData = result.pageData;
							EcTradeSeatManage.pageUtil.refreshPage();
						}else{
							alert(result.tipMessage);
						}
					}catch(e){
							alert("获取直销交易渠道列表失败");
					}
				},
				error : function() {
				}
			});

};

EcTradeSeatManage.check = function(item){
	if(item.paySeatNo == undefined || item.paySeatNo == ""){alert("支付渠道代码不能为空");return false;}
	if(item.paySeatName == undefined || item.paySeatName == ""){alert("支付渠道名称不能为空");return false;}
	if(item.bankNo == undefined || item.bankNo == ""){alert("银行代码不能为空");return false;}
	if(item.bankName == undefined || item.bankName == ""){alert("银行名称不能为空");return false;}
	if(item.seatNo == undefined || item.seatNo == ""){alert("渠道代码不能为空");return false;}
	if(item.seatName == undefined || item.seatName == ""){alert("渠道名称不能为空");return false;}
	if(item.seatState == "1" || item.seatState == "0"){}else{alert("渠道状态不能为空");return false;}
	if(item.finatype == "0" || item.finatype == "1"){}else{alert("资金方式不能为空");return false;}
	if(item.fundTradeSupport == "0" || item.fundTradeSupport == "1"){}else{alert("是否支持定投不能为空");return false;}
	if(item.fastPaySupport == "0" || item.fastPaySupport == "1"){}else{alert("是否支持快捷支付不能为空");return false;}
	if(item.transactionLimit == undefined || item.transactionLimit == ""){alert("交易限额不能为空");return false;}
	if(item.discountInformation == undefined || item.discountInformation == ""){alert("折扣信息不能为空");return false;}
	if(item.extId == undefined || item.extId == ""){alert("网点代码不能为空");return false;}
	var reg = /^(?:19|20)[0-9][0-9]-(?:(?:0[1-9])|(?:1[0-2]))-(?:(?:[0-2][1-9])|(?:[1-3][0-1])) (?:(?:[0-2][0-3])|(?:[0-1][0-9])):[0-5][0-9]:[0-5][0-9]$/;
	if(reg.test(item.orderField)){}else{alert("时间格式不正确,请输入正确yyyy-MM-dd HH:mm:ss格式的时间");return false;}
	return true;
}

EcTradeSeatManage.initSlickGrid = function(){
	var columns = [ {
		id : "paySeatNo",
		name : "支付渠道代码",
		field : "paySeatNo",
		editor : Slick.Editors.Text
	}, {
		id : "paySeatName",
		name : "支付渠道名称",
		field : "paySeatName",
		editor : Slick.Editors.Text
	},  {
		id : "bankNo",
		name : "银行代码",
		field : "bankNo",
		editor : Slick.Editors.Text
	},  {
		id : "bankName",
		name : "银行名称",
		field : "bankName",
		editor : Slick.Editors.Text
	},  {
		id : "seatNo",
		name : "渠道代码",
		field : "seatNo",
		editor : Slick.Editors.Text
	},   {
		id : "seatName",
		name : "渠道名称",
		field : "seatName",
		editor : Slick.Editors.Text
	},{
		id : "seatState",
		name : "渠道状态",
		field : "seatState",
		formatter : EcTradeSeatManage.formatSeatState
	},{
		id : "finatype",
		name : "资金方式",
		field : "finatype",
		formatter : EcTradeSeatManage.formatFinatype
	}, {
		id : "orderField",
		name : "排序",
		field : "orderField",
		editor : Slick.Editors.Text
	},{
		id : "createTime",
		name : "创建时间",
		field : "createTime",
		formatter : EcTradeSeatManage.formatDate
	},{
		id : "fundTradeSupport",
		name : "是否支持定投",
		field : "fundTradeSupport",
		formatter : EcTradeSeatManage.formatTradeSupport
	},{
		id : "fastPaySupport",
		name : "是否支持快捷支付",
		field : "fastPaySupport",
		formatter : EcTradeSeatManage.formatPaySupport
	},{
		id : "transactionLimit",
		name : "交易限额",
		field : "transactionLimit",
		editor : Slick.Editors.Text
	},{
		id : "discountInformation",
		name : "折扣信息",
		field : "discountInformation",
		editor : Slick.Editors.Text
	}, {
		id : "extId",
		name : "网点代码",
		field : "extId",
		editor : Slick.Editors.Text
	}, {
		id : "operate",
		name : "操作",
		field : "",
		formatter : EcTradeSeatManage.operate
	} ];
	
	var options = {
			editable : true,
			enableAddRow : true,
			enableCellNavigation : true,
			asyncEditorLoading : false,
			rowHeight : 36
		};

		EcTradeSeatManage.grid = new Slick.Grid("#myGrid", EcTradeSeatManage.gridData, columns, options);
		EcTradeSeatManage.grid.autosizeColumns();

		EcTradeSeatManage.grid.onClick.subscribe(function(e) {
			e.preventDefault();
			var cell = EcTradeSeatManage.grid.getCellFromEvent(e);
			if(cell.cell == 6){
				 $("#contextMenu").data("row", cell.row).css("top", e.pageY).css("left", e.pageX).show();
				 $("#contextMenu1").data("row", cell.row).css("top", e.pageY).css("left", e.pageX).hide();
				 $("#contextMenu2").data("row", cell.row).css("top", e.pageY).css("left", e.pageX).hide();
				 $("#contextMenu3").data("row", cell.row).css("top", e.pageY).css("left", e.pageX).hide();
			}else if(cell.cell == 7){
				 $("#contextMenu").data("row", cell.row).css("top", e.pageY).css("left", e.pageX).hide();			
				 $("#contextMenu1").data("row", cell.row).css("top", e.pageY).css("left", e.pageX).show();
				 $("#contextMenu2").data("row", cell.row).css("top", e.pageY).css("left", e.pageX).hide();
				 $("#contextMenu3").data("row", cell.row).css("top", e.pageY).css("left", e.pageX).hide();
			}else if(cell.cell == 10){
				 $("#contextMenu").data("row", cell.row).css("top", e.pageY).css("left", e.pageX).hide();			
				 $("#contextMenu1").data("row", cell.row).css("top", e.pageY).css("left", e.pageX).hide();
				 $("#contextMenu2").data("row", cell.row).css("top", e.pageY).css("left", e.pageX).show();
				 $("#contextMenu3").data("row", cell.row).css("top", e.pageY).css("left", e.pageX).hide();
			}else if(cell.cell == 11){
				 $("#contextMenu").data("row", cell.row).css("top", e.pageY).css("left", e.pageX).hide();			
				 $("#contextMenu1").data("row", cell.row).css("top", e.pageY).css("left", e.pageX).hide();
				 $("#contextMenu2").data("row", cell.row).css("top", e.pageY).css("left", e.pageX).hide();
				 $("#contextMenu3").data("row", cell.row).css("top", e.pageY).css("left", e.pageX).show();
			}else{
				$("#contextMenu").data("row", cell.row).css("top", e.pageY).css("left", e.pageX).hide();			
				 $("#contextMenu1").data("row", cell.row).css("top", e.pageY).css("left", e.pageX).hide();
				 $("#contextMenu2").data("row", cell.row).css("top", e.pageY).css("left", e.pageX).hide();
				 $("#contextMenu3").data("row", cell.row).css("top", e.pageY).css("left", e.pageX).hide();
			}

		});

		EcTradeSeatManage.grid.onAddNewRow.subscribe(function(e, args) {
			var item = args.item;
			EcTradeSeatManage.grid.invalidateRow(EcTradeSeatManage.gridData.length);
			EcTradeSeatManage.gridData.push(item);
			item.changed = true;
			item.isNew = true;
			EcTradeSeatManage.grid.updateRowCount();
			EcTradeSeatManage.grid.render();
		});

		EcTradeSeatManage.grid.onCellChange.subscribe(function(e, args) {
			var item = args.item;
			item.changed = true;
			item.isNew=false;
			EcTradeSeatManage.grid.updateRow(args.row);
		});

}

EcTradeSeatManage.operate = function(row, cell, value, columnDef, dataContext) {
	var item = EcTradeSeatManage.gridData[row];
	var ret = "";
	if(item.rowVersion != undefined){
		ret += "<input type='button' class='deleteRow btn btn-default' row='" + row + "' value='删除'/>"; 
	}else{
		item.createTime = new Date();
		item.orderField = TopdeepCommon.formatDate(new Date(), "yyyy-MM-dd hh:mm:ss");
	}
	if(item.changed){
		$("#"+row).show();
		ret+= "<input id = '" + row + "' type='button' class='commitRow btn btn-default' row='" + row + "' value='保存'/>";
	}
	return ret;
}

EcTradeSeatManage.ajaxSave = function(obj, row){
	
	$.ajax({
		type:"POST",
		url:EcTradeSeatManage.contextPath + "/systemParam/ecTradeSeatManage!ajaxSave.action",
		data:{"ecTradeSeat.id":obj.id,"ecTradeSeat.paySeatNo":obj.paySeatNo,"ecTradeSeat.paySeatName":obj.paySeatName,"ecTradeSeat.bankNo":obj.bankNo,"ecTradeSeat.bankName":obj.bankName,"ecTradeSeat.seatNo":obj.seatNo,"ecTradeSeat.seatName":obj.seatName,
			"ecTradeSeat.seatState":obj.seatState,"orderField":obj.orderField,"ecTradeSeat.finatype":obj.finatype,"ecTradeSeat.pub0":obj.pub0,"ecTradeSeat.pub1":obj.pub1,"ecTradeSeat.pub2":obj.pub2,"ecTradeSeat.fastPaySupport":obj.fastPaySupport,
			"ecTradeSeat.pub3":obj.pub3,"ecTradeSeat.pub4":obj.pub4,"ecTradeSeat.rowVersion":obj.rowVersion,"ecTradeSeat.fundTradeSupport":obj.fundTradeSupport,"ecTradeSeat.fundTradeSupport":obj.fundTradeSupport,"ecTradeSeat.transactionLimit":obj.transactionLimit,"ecTradeSeat.discountInformation":obj.discountInformation,"ecTradeSeat.extId":obj.extId},	
		datatype:"json",
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		success:function(result){
			try{
				if(result.success){
					alert("保存成功!");
					if(EcTradeSeatManage.gridData[row].rowVersion == undefined || EcTradeSeatManage.gridData[row].rowVersion == null){
						$("#"+row).attr("value","删除");
						$("#"+row).attr("class","deleteRow btn btn-default");
					}else{
						$("#"+row).hide();
					}
					EcTradeSeatManage.gridData[row].changed = false;
					EcTradeSeatManage.gridData[row].rowVersion = result.rowVersion;
					EcTradeSeatManage.gridData[row].id = result.id;
				}else{
					alert(result.tipMessage);
				}
			}catch(e){
					alert("直销交易渠道保存失败");
			}
		},
		error:function(){
			alert("直销交易渠道失败");
		}
	});
};

EcTradeSeatManage.ajaxDelete = function(id,row) {

	$.ajax({
		type : "POST",
		url : EcTradeSeatManage.contextPath + "/systemParam/ecTradeSeatManage!ajaxDelete.action",
		data : {"ecTradeSeat.id":id},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (result.success) {
					var list1 =EcTradeSeatManage.gridData.slice(0,row);
					var list2 =EcTradeSeatManage.gridData.slice(parseInt(row)+1,EcTradeSeatManage.gridData.length);
					EcTradeSeatManage.gridData = [];
					EcTradeSeatManage.gridData = EcTradeSeatManage.gridData.concat(list1,list2);
					EcTradeSeatManage.grid.setData(EcTradeSeatManage.gridData);	
					EcTradeSeatManage.grid.render();
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

EcTradeSeatManage.formatDate = function(row, cell, value, columnDef, dataContext) {
	if (value == "" || value == undefined) {
		value = "";
	} else {
		value = TopdeepCommon.formatDate(new Date(value), "yyyy-MM-dd hh:mm:ss");
	}
	return value;
};

EcTradeSeatManage.formatSeatState = function(row, cell, value, columnDef, dataContext) {
	if(value == "0"){
		value = "禁止";
	}else if(value == "1"){
		value = "激活";
	}else{
		value = "";
	}
	return value;
}

EcTradeSeatManage.formatPaySupport = function(row, cell, value, columnDef, dataContext) {
	 if(value == "0"){
		value = "否";
	}else if(value == "1"){
		value = "是";
	}else{
		value = "";
	}
	return value;
}

EcTradeSeatManage.formatTradeSupport = function(row, cell, value, columnDef, dataContext) {
	 if(value == "0"){
		value = "否";
	}else if(value == "1"){
		value = "是";
	}else{
		value = "";
	}
	return value;
}
EcTradeSeatManage.formatFinatype= function(row, cell, value, columnDef, dataContext) {
	 if(value == "1"){
			value = "代扣";
		}else{
			value = "";
		}
		return value;
	}


//初始化
EcTradeSeatManage.initPage = function(){	
	EcTradeSeatManage.initSlickGrid();
	EcTradeSeatManage.pageUtil = new TopdeepUtil.pageUtil(null,EcTradeSeatManage.ajaxQuery,"");
	EcTradeSeatManage.pageUtil.initPage();
	EcTradeSeatManage.ajaxQuery("0");
	$(document).on("click", ".commitRow", function() {
		var row = $(this).attr("row");
		var item = EcTradeSeatManage.gridData[row];
		if(EcTradeSeatManage.check(item)){
			EcTradeSeatManage.ajaxSave(EcTradeSeatManage.gridData[row], row);
		}
		return false;
	});
	
	$("#contextMenu").click(function(e) {
		if (!$(e.target).is("li")) {
			return;
		}
		if (!EcTradeSeatManage.grid.getEditorLock().commitCurrentEdit()) {
			return;
		}
		var row = $(this).data("row");
		if (row == EcTradeSeatManage.gridData.length) {
			EcTradeSeatManage.gridData[row] = {};
		}
		EcTradeSeatManage.gridData[row].seatState = $(e.target).attr("data");
		EcTradeSeatManage.gridData[row].changed = true;
		EcTradeSeatManage.grid.updateRow(row);

		$("#contextMenu").hide();
	});
	
	$("#contextMenu1").click(function(e) {
		if (!$(e.target).is("li")) {
			return;
		}
		if (!EcTradeSeatManage.grid.getEditorLock().commitCurrentEdit()) {
			return;
		}
		var row = $(this).data("row");
		if (row == EcTradeSeatManage.gridData.length) {
			EcTradeSeatManage.gridData[row] = {};
		}
		EcTradeSeatManage.gridData[row].finatype = $(e.target).attr("data");
		EcTradeSeatManage.gridData[row].changed = true;
		EcTradeSeatManage.grid.updateRow(row);

		$("#contextMenu1").hide();
	});
	
	$("#contextMenu2").click(function(e) {
		if (!$(e.target).is("li")) {
			return;
		}
		if (!EcTradeSeatManage.grid.getEditorLock().commitCurrentEdit()) {
			return;
		}
		var row = $(this).data("row");
		if (row == EcTradeSeatManage.gridData.length) {
			EcTradeSeatManage.gridData[row] = {};
		}
		EcTradeSeatManage.gridData[row].fundTradeSupport = $(e.target).attr("data");
		EcTradeSeatManage.gridData[row].changed = true;
		EcTradeSeatManage.grid.updateRow(row);

		$("#contextMenu2").hide();
	});
	
	$("#contextMenu3").click(function(e) {
		if (!$(e.target).is("li")) {
			return;
		}
		if (!EcTradeSeatManage.grid.getEditorLock().commitCurrentEdit()) {
			return;
		}
		var row = $(this).data("row");
		if (row == EcTradeSeatManage.gridData.length) {
			EcTradeSeatManage.gridData[row] = {};
		}
		EcTradeSeatManage.gridData[row].fastPaySupport = $(e.target).attr("data");
		EcTradeSeatManage.gridData[row].changed = true;
		EcTradeSeatManage.grid.updateRow(row);

		$("#contextMenu3").hide();
	});
	
	$(document).on("click", ".deleteRow", function() {
		var row = $(this).attr("row");
		var item = EcTradeSeatManage.gridData[row];
		 if(confirm("确认删除吗？")){
			EcTradeSeatManage.ajaxDelete(item.id,row);
		}
		return false;
	});
	
	$("#siteInfo_search_keyword_button").click(function(){
		EcTradeSeatManage.ajaxQuery(0);
	});
	
};
