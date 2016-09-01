var TradeParamConvertManage = {};
TradeParamConvertManage.ParamType = null;

TradeParamConvertManage.contextPath = contextPath;
TradeParamConvertManage.gridData = [];
TradeParamConvertManage.grid=null;
TradeParamConvertManage.pageUtil;

TradeParamConvertManage.ajaxQuery = function(pageIndex) {	
	var searchKeyword = $("#siteInfo_search_keyword").val();
	$.ajax({
				type : "POST",
				url : TradeParamConvertManage.contextPath
						+ "/systemParam/tradeParamConvertManage!ajaxQuery.action",
				data : {"pageIndex":pageIndex,"searchKeyword":searchKeyword},
				datatype : "json",
				contentType : "application/x-www-form-urlencoded; charset=utf-8",
				success : function(result) {		
					try{
						if(result.success){
							TradeParamConvertManage.gridData = result.tradeParamConvertList;
							TradeParamConvertManage.grid.setData(TradeParamConvertManage.gridData);
							TradeParamConvertManage.grid.render();
							TradeParamConvertManage.pageUtil.pageData = result.pageData;
							TradeParamConvertManage.pageUtil.refreshPage();
						}else{
							alert(result.tipMessage);
						}
					}catch(e){
							alert("获取系统参数列表失败"+e.message);
					}
				},
				error : function() {
				}
			});

};

TradeParamConvertManage.initSlickGrid = function(){
	var columns = [ {
		id : "bankNo",
		name : "银行代码",
		field : "bankNo",
		editor : Slick.Editors.Text
	}, {
		id : "paySeatNo",
		name : "支付渠道代码",
		field : "paySeatNo",
		editor : Slick.Editors.Text
	},{
		id : "seatNo",
		name : "渠道代码",
		field : "seatNo",
		editor : Slick.Editors.Text
	}, {
		id : "localValue",
		name : "本地值",
		field : "localValue",
		editor : Slick.Editors.Text
	}, {
		id : "bankValue",
		name : "银行值",
		field : "bankValue",
		editor : Slick.Editors.Text
	}, {
		id : "paramType",
		name : "参数类型",
		field : "paramType",
		formatter : TradeParamConvertManage.formatParamType
	},{
		id : "createTime",
		name : "创建时间",
		field : "createTime",
		formatter : TradeParamConvertManage.formatDate
	}, {
		id : "operate",
		name : "操作",
		field : "",
		formatter : TradeParamConvertManage.operate
	} ];

	var options = {
		editable : true,
		enableAddRow : true,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 40
	};

	TradeParamConvertManage.grid = new Slick.Grid("#myGrid", TradeParamConvertManage.gridData, columns, options);
	TradeParamConvertManage.grid.autosizeColumns();

	TradeParamConvertManage.grid.onClick.subscribe(function(e) {
		e.preventDefault();
		var cell = TradeParamConvertManage.grid.getCellFromEvent(e);
		if(cell.cell == 5){
			$("#contextMenu").data("row", cell.row).css("top", e.pageY).css("left", e.pageX).show();
		}else{
			$("#contextMenu").data("row", cell.row).css("top", e.pageY).css("left", e.pageX).hide();
		}
	});
	
	TradeParamConvertManage.grid.onAddNewRow.subscribe(function(e, args) {
		var item = args.item;
		TradeParamConvertManage.grid.invalidateRow(TradeParamConvertManage.gridData.length);
		TradeParamConvertManage.gridData.push(item);
		item.changed = true;
		TradeParamConvertManage.grid.updateRowCount();
		TradeParamConvertManage.grid.render();
	});
	
	TradeParamConvertManage.grid.onCellChange.subscribe(function(e, args) {
		var item = args.item;
		item.changed = true;
		TradeParamConvertManage.grid.updateRow(args.row);
	});
}

TradeParamConvertManage.operate = function(row, cell, value, columnDef, dataContext) {
	var item = TradeParamConvertManage.gridData[row];
	var ret = "";
	if(item.rowVersion != undefined){
		ret += "<input type='button' class='deleteRow btn btn-default' row='" + row + "' value='删除'/>"; 
	}else{
		item.createTime = new Date();
	}
	if(item.changed){
		$("#"+row).hide();
		ret+= "<input id = '" + row + "' type='button' class='commitRow btn btn-default' row='" + row + "' value='保存'/>";
	}
	return ret;
}

TradeParamConvertManage.check = function(item){
	if(item.paySeatNo == undefined || item.paySeatNo == ""){alert("支付渠道代码不能为空");return false;}
	if(item.bankNo == undefined || item.bankNo == ""){alert("银行代码不能为空");return false;}
	if(item.localValue == undefined || item.localValue == ""){alert("本地值不能为空");return false;}
	if(item.bankValue == undefined || item.bankValue == ""){alert("银行值不能为空");return false;}
	if(item.paramType == undefined || item.paramType == ""){alert("参数类型不能为空");return false;}
	return true;
}

TradeParamConvertManage.ajaxSave = function(obj, row){
	$.ajax({
		type:"POST",
		url:TradeParamConvertManage.contextPath + "/systemParam/tradeParamConvertManage!ajaxSave.action",
		data:{"tradeParamConvert.paramType":obj.paramType,"tradeParamConvert.paySeatNo":obj.paySeatNo,
			"tradeParamConvert.id":obj.id,"tradeParamConvert.rowVersion":obj.rowVersion,
			"tradeParamConvert.bankNo":obj.bankNo,"tradeParamConvert.localValue":obj.localValue,
			"tradeParamConvert.bankValue":obj.bankValue,"tradeParamConvert.seatNo":obj.seatNo},	
		datatype:"json",
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		success:function(result){
			try{
				if(result.success){
					alert("保存成功!");
					if(TradeParamConvertManage.gridData[row].rowVersion == undefined || TradeParamConvertManage.gridData[row].rowVersion == null){
						$("#"+row).attr("value","删除");
						$("#"+row).attr("class","deleteRow btn btn-default");
					}else{
						$("#"+row).hide();
					}
					TradeParamConvertManage.gridData[row].changed = false;
					TradeParamConvertManage.gridData[row].rowVersion = result.rowVersion;
					TradeParamConvertManage.gridData[row].id = result.id;
				}else{
					alert(result.tipMessage);
				}
			}catch(e){
					alert("交易参数转换保存失败");
			}
		},
		error:function(){
			alert("交易参数转换失败");
		}
	});
};

TradeParamConvertManage.ajaxDelete = function(id,row) {

	$.ajax({
		type : "POST",
		url : TradeParamConvertManage.contextPath + "/systemParam/tradeParamConvertManage!ajaxDelete.action",
		data : {"tradeParamConvert.id":id},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (result.success) {
					var list1 =TradeParamConvertManage.gridData.slice(0,row);
					var list2 =TradeParamConvertManage.gridData.slice(parseInt(row)+1,TradeParamConvertManage.gridData.length);
					TradeParamConvertManage.gridData = [];
					TradeParamConvertManage.gridData = TradeParamConvertManage.gridData.concat(list1,list2);
					TradeParamConvertManage.grid.setData(TradeParamConvertManage.gridData);	
					TradeParamConvertManage.grid.render();
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

TradeParamConvertManage.formatDate = function(row, cell, value, columnDef, dataContext) {
	if (value == "" || value == undefined) {
		value = "";
	} else {
		value = TopdeepCommon.formatDate(new Date(value), "yyyy-MM-dd hh:mm:ss");
	}
	return value;
};

TradeParamConvertManage.formatParamType = function(row, cell, value, columnDef, dataContext){	
	       for(var i=0;i<TradeParamConvertManage.ParamType.length;i++){	
             var item = TradeParamConvertManage.ParamType[i];	
             if(value == item.value ){
            	    return item.name;	
            	 }
       }	
	       return "";
	}

//初始化
TradeParamConvertManage.initPage = function(ParamType){	
	TradeParamConvertManage.initSlickGrid();
	TradeParamConvertManage.pageUtil = new TopdeepUtil.pageUtil(null,TradeParamConvertManage.ajaxQuery,"");
	TradeParamConvertManage.pageUtil.initPage();
	TradeParamConvertManage.ParamType = ParamType;
	TradeParamConvertManage.ajaxQuery("0");
	
	
	$(document).on("click", ".commitRow", function() {
		var row = $(this).attr("row");
		var item = TradeParamConvertManage.gridData[row];
		if(TradeParamConvertManage.check(item)){
			TradeParamConvertManage.ajaxSave(TradeParamConvertManage.gridData[row], row);
		}
		return false;
	});
	
	     for(var i=0;i<TradeParamConvertManage.ParamType.length;i++){ 	
	           var item = TradeParamConvertManage.ParamType[i]; 	
          var trHtml = "<li data="+item.value+">"+item.name+"</li>"; 	
	       $("#contextMenu").append(trHtml); 	
	      } 	

	$("#contextMenu").click(function(e) {
		if (!$(e.target).is("li")) {
			return;
		}
		if (!TradeParamConvertManage.grid.getEditorLock().commitCurrentEdit()) {
			return;
		}
		var row = $(this).data("row");
		if (row == TradeParamConvertManage.gridData.length) {
			TradeParamConvertManage.gridData[row] = {};
		}
		TradeParamConvertManage.gridData[row].paramType = $(e.target).attr("data");
		var status = $(e.target).attr("data");
		TradeParamConvertManage.gridData[row].changed = true;
		TradeParamConvertManage.grid.updateRow(row);

		$("#contextMenu").hide();
	});
	
	$(document).on("click", ".deleteRow", function() {
		var row = $(this).attr("row");
		var item = TradeParamConvertManage.gridData[row];
		 if(confirm("确认删除吗？")){
			TradeParamConvertManage.ajaxDelete(item.id,row);
		}
		return false;
	});
	
	$("#siteInfo_search_keyword_button").click(function(){
		TradeParamConvertManage.ajaxQuery(0);
	});
	
};
