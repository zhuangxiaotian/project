var WhiteLists = {};
// 路径
var checked="1";

var whiteListsURLs;
WhiteLists.pageUtil;

WhiteLists.listTypeFormatter = function(row, cell, value, columnDef, dataContext){	
	var rel = value;
	for(var j=0;j<idTypes.length;j++){
		var	object = idTypes[j];
		if(value == object.ID)
		{
			rel = object.txt;
			return rel
		}
	}
	return rel;
}
WhiteLists.listTypeInvesFormatter = function(value){	
	var rel = value;
	for(var j=0;j<idTypes.length;j++){
		var	object = idTypes[j];
		if(value == object.txt)
		{
			rel = object.ID;
			return rel
		}
	}
	return rel;
}

WhiteLists.urlFormatter = function(row, cell, value, columnDef, dataContext){	
	var rel = value;
	for(var j=0;j<whiteListsURLs.length;j++){
		var	object = whiteListsURLs[j];
		if(value == object.codeDesc)
		{
			rel = object.codeName;
			return rel
		}
	}
	return rel;
}
WhiteLists.urlInvesFormatter = function(value){
	var rel = value;
	for(var j=0;j<whiteListsURLs.length;j++){
		var	object = whiteListsURLs[j];
		if(value === object.codeName)
		{
			rel = object.codeDesc;
			return rel
		}
	}
	return rel;
}

WhiteLists.statusFormatter= function(row, cell, value, columnDef, dataContext){	
	
	if("1" === value){
		return "<input type='button' value = '启动' onclick='WhiteLists.updateStatusListChange("+row+")' class='btn btn-outline btn-default btn-xs'/>";
	} else{
		return "<input type='button' value = '关闭' onclick='WhiteLists.updateStatusListChange("+row+")' class='btn btn-outline btn-default btn-xs'/>";
	}
}

WhiteLists.operaBtnFormatter= function(row, cell, value, columnDef, dataContext){	
	
	var id = "changeBtn_" + row;
	var fun = "WhiteLists.updateWhiteListChange('"+ row +"')";

	var rel =  "<input id='"+id+"'  type='button' value = '保存' onclick="+fun+"  class='btn btn-default btn-xs' />";
		
	return rel;
}

var grid;
var oldItems = [];
var data = [];
var dataView = new Slick.Data.DataView();
var columns = [];
var slickgrid = {};

slickgrid.options = {
		    editable: true,
		    enableAddRow: false,
		    enableCellNavigation: true,
		    asyncEditorLoading: false,
		    autoEdit: false,
		    autoHeight:false,
		    enableColumnReorder: false,
		    headerRowHeight: 45,
		    rowHeight: 40,
		    fullWidthRows: false,
		    selectedCellCssClass: "selected"
};

slickgrid.requiredFieldValidator=function(value){
	
	 if (value == null || value == undefined || !value.length) {
	      return {valid: false, msg: "不能为空"};
	    } else {
	      return {valid: true, msg: null};
	    }
}

var checkboxSelector = new Slick.CheckboxSelectColumn({});
columns.push(checkboxSelector.getColumnDefinition());
//columns.push({
//    id: "id",
//    name: "ID",
//    field: "id",
//    width: 200
//  });
columns.push({
    id: "idNo",
    name: "白名单号",
    field: "idNo",
    width: 200,
    editor: Slick.Editors.TopDeepEditor,
    validator: slickgrid.requiredFieldValidator
  });
columns.push({
	id: "idType",
	name: "类型",
	field: "idType",
	width: 300,
	datasource: idTypes,
	editor: Slick.Editors.TopDeepDropDownList,
	formatter: WhiteLists.listTypeFormatter,
    validator: slickgrid.requiredFieldValidator
});
columns.push({
	id: "funcUrl",
	name: "功能",
	field: "funcUrl",
	width: 200,
	datasource: urls,
	editor: Slick.Editors.TopDeepDropDownList,
	formatter: WhiteLists.urlFormatter,
    validator: slickgrid.requiredFieldValidator
});
columns.push({
	id: "status",
	name: "启动状态",
	field: "status",
	width: 100,
	formatter: WhiteLists.statusFormatter
});
columns.push({
	id: "operaBtn",
	name: "操作",
	field: "operaBtn",
	width: 100,
	formatter: WhiteLists.operaBtnFormatter
});

var pageIndexNow = 0;

WhiteLists.contextPath = contextPath;
WhiteLists.ajaxQuerywhiteList = function(pageIndex){
	pageIndexNow = pageIndex;
	
	var ajaxurl = "/system/whiteListsManage!ajaxWhiteLists.action";
	
	var listType = $("#listType_query").val();
	var url = $("#sel").val();
	var listNo=$("#idNo_query").val();
	var type=$("#funcType").val();
	$.ajax({
		type:"POST",
		url:WhiteLists.contextPath + ajaxurl,
		data:{"pageIndex":pageIndex,"listType":listType,"url":url,"listNo":listNo,"type":type},
		datatype:"json",
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		success:function(result){
			try{
				if(!result.success){
					alert(result.tipMessage);
				}else{
						whiteListsURLs = result.whiteListsURL;
						data = [];
						oldItems = [];
						if(result.whiteLists && result.whiteLists.length > 0)
						{
							for(var i=0;i<result.whiteLists.length;i++){
								var d = (data[i] = {});
								
								var item = result.whiteLists[i];
								oldItems.push(item);
								d["id"] = item.id;
								d["idNo"] = item.idNo;
								d["idType"] = item.idType;
								
								for(var j=0;j<result.whiteListsURL.length;j++){
									var	object = result.whiteListsURL[j];
									if(item.funcUrl==object.codeDesc)
									{
										
										d["funcUrl"] = object.codeDesc;
									}
								}
								d["status"] = item.status;
								
							}
						
						}
						WhiteLists.pageUtil.pageData = result.pageData;
						WhiteLists.pageUtil.refreshPage();
						
						dataView.setItems(data);
						grid.setData(data,true);
						grid.render();
						grid.autosizeColumns();
						grid.setSelectedRows([]);

						if(data.length ==0 && pageIndexNow > 0){
							WhiteLists.ajaxQuerywhiteList(pageIndexNow - 1);
						}
				}
			}catch(e){
				alert(e.message);
			}
		},
		error:function(e){
			alert(e.message);
		}
	});
};




WhiteLists.createWhiteLists=function(){
	$("#errorMsg").html(""); 
	$("#myModalLabel").html("新建白名单");	
	$("#create_white_button").show();	
	$("#status_tr").show();
}

check = function(check){
	checked = check;
} ;

WhiteLists.chooseDelete=function(){
	 
	var rowIds = grid.getSelectedRows();
	
	if(rowIds.length == 0)
	{
		alert("请选择删除项");
		return false;
	}
	
	if(window.confirm("是否确认删除?")){
		$.each(rowIds,function(name,value){ 
	        var object = dataView.getItem(value);
	        console.log(object);
	        WhiteLists.beginDelete(object);
	       });
	}
};

WhiteLists.beginDelete=function(item){
    WhiteLists.ajaxDeletewhiteList(item.idNo,item.funcUrl,item.idType,item.status,item.id);
}



WhiteLists.ajaxSearchWhiteLists  = function(){
	
	WhiteLists.ajaxQuerywhiteList(0); 
	
};


WhiteLists.ajaxUpdateStatusListChange = function(listNo,url,listType,status,whiteId,id){
	var type=$("#funcType").val();
	$.ajax({
		type:"POST",
		url:WhiteLists.contextPath + "/system/whiteListsManage!ajaxUpdateStatusList.action",
		data:{"listNo":listNo,"url":url,"listType":listType,"status":status,"type":type,"id":id},
		datatype:"json",
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		success:function(result){
			try{
				if(!result.success){
					alert(result.tipMessage);
				}else{
					WhiteLists.ajaxQuerywhiteList(pageIndexNow);
				}
			}catch(e){
				alert(e.message);
			}
		},
		error:function(e){
			alert(e.message);
		}
	});
};


WhiteLists.ajaxCreateStatusList = function(){

	var listNo = $("#idNo_u").val();

	var url = $("#sel_u").val();
	var listType = $("#listType_u").val();
	var status =  $("#status_u").val();
	var type=$("#funcType").val();
	
	$.ajax({
		type:"POST",
		url:WhiteLists.contextPath + "/system/whiteListsManage!ajaxCreateWhiteLists.action",
		data:{"listNo":listNo,"url":url,"listType":listType,"status":status,"type":type},
		datatype:"json",
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		success:function(result){
			
			try{
				if(!result.success){
					$("#errorMsg").html(result.tipMessage);
				}else{
					WhiteLists.ajaxQuerywhiteList();
					$("#closeBtn").click();
					$('#contact-form')[0].reset();
					$("#errorMsg").html("");
				}
			}catch(e){
				alert(e.message);
			}
		},
		error:function(e){
			$("#closeBtn").click();
			alert(e.message);
		}
	});
	
};

WhiteLists.ajaxDeletewhiteList = function(listNo,url,listType,status,id){
	var type=$("#funcType").val();
	$.ajax({
		type:"POST",
		url:WhiteLists.contextPath + "/system/whiteListsManage!ajaxDeletewhiteList.action",
		data:{"listNo":listNo,"url":url,"listType":listType,"status":status,"type":type,"id":id},
		datatype:"json",
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		success:function(result){
			try{
				if(!result.success){
					alert(result.tipMessage);
				}else{
					WhiteLists.ajaxQuerywhiteList(pageIndexNow);
					grid.setSelectedRows([]);
				}
			}catch(e){
				alert(e.message);
			}
		},
		error:function(e){
			alert(e.message);
		}
	});
// }
};


WhiteLists.updateStatusListChange = function(row){
	$("#changeBtn_"+row).parent().click();	
	var item = dataView.getItem(row);
	item.funcUrl = WhiteLists.urlInvesFormatter(item.funcUrl);
	item.idType = WhiteLists.listTypeInvesFormatter(item.idType);
	var oldItem = oldItems[row];	
	if((oldItem.idType != item.idType) || (oldItem.funcUrl != item.funcUrl) || (oldItem.idNo != item.idNo)){
		alert("数据有变更,请先修改");
		return;
	}
	var comfirmMessage = "";
	var status = "";
	if("1" == item.status)
	{
		status = "0";
		comfirmMessage = "确定关闭该白名单吗？";
	}
	else
	{
		status = "1";
		comfirmMessage = "确定启用该白名单吗？";
	}
	
	if(window.confirm(comfirmMessage)){
		WhiteLists.ajaxUpdateStatusListChange(item.idNo,item.funcUrl,item.idType,status,null,item.id);
	}
}

WhiteLists.updateWhiteListChange = function(row){
	$("#changeBtn_"+row).parent().click();
	var item = dataView.getItem(row);
	var oldItem = oldItems[row];
	item.funcUrl = WhiteLists.urlInvesFormatter(item.funcUrl);
	item.idType = WhiteLists.listTypeInvesFormatter(item.idType);
	if((oldItem.idType == item.idType) && (oldItem.funcUrl == item.funcUrl) && (oldItem.idNo == item.idNo)){
		alert("数据没有变更");
		return;
	}
	
	if(item.idNo.length > 50){
		alert("证件号长度不能超出50位！");
		return;
	}
	if(item.idType == '0'&&!TopdeepCommon.IdentityCodeValid(item.idNo)){
		alert("身份证格式不正确！");
		return;
	}
	
	WhiteLists.ajaxUpdateStatusList(row,item.status,oldItem.idNo,oldItem.funcUrl,oldItem.idType,item.idNo,item.funcUrl,item.idType,item.id);
}



WhiteLists.ajaxUpdateStatusList = function(row,status,listNo,url,listType,listNoUpdate,urlUpdate,listTypeUpdate,id){
	var type=$("#funcType").val();
	$.ajax({
		type:"POST",
		url:WhiteLists.contextPath + "/system/whiteListsManage!ajaxUpdateWhiteLists.action",
		data:{"listNo":listNo,"url":url,"listType":listType,"status":status,"listNoUpdate":listNoUpdate,"urlUpdate":urlUpdate,"listTypeUpdate":listTypeUpdate,"type":type,"id":id},
		datatype:"json",
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		success:function(result){
			try{
				if(!result.success){
					alert(result.tipMessage);
				}else{
					WhiteLists.ajaxQuerywhiteList(pageIndexNow);
					grid.setSelectedRows([]);
					alert("修改成功!");
				}
			}catch(e){
				alert(e.message);
			}
		},
		error:function(e){
			alert(e.message);
		}
	});
	
};

WhiteLists.resetQuery = function ()
{
	$(".form-inline").find("input[type=text]").each(function () { 
		$(this).val(""); 
	}); 
	
	
	$(".selector").each(function () { 
		
//		alert($(this)[0].selectedIndex);
		$(this)[0].selectedIndex=0;
//		$(this).options[0].selected = true;
//		$(this).find("option[value='']").attr("selected",true);
	}); 
}


// 初始化
WhiteLists.initPage = function(){
	
	grid = new Slick.Grid("#myGrid", dataView, columns, slickgrid.options);
	grid.setSelectionModel(new Slick.RowSelectionModel({selectActiveRow: false}));
	grid.registerPlugin(checkboxSelector);
	grid.registerPlugin(new Slick.AutoTooltips());
	
	grid.onValidationError.subscribe(function (e, args) {
	      alert(args.validationResults.msg);
	    });
	
	WhiteLists.pageUtil = new TopdeepUtil.pageUtil(null,WhiteLists.ajaxQuerywhiteList,"");
	WhiteLists.pageUtil.initPage();
	
	WhiteLists.ajaxQuerywhiteList(0); 
	$("#create_white_button").bind("click",function(){
		
		var listType = $("#listType_u").val();
		
		if ($('#contact-form').valid()){
			
			if($("#idNo_u").val().length > 50){
				alert("证件号长度不能超出50位！");
				return;
			}
			if(listType == '0'&&!TopdeepCommon.IdentityCodeValid($("#idNo_u").val())){
				alert("身份证格式不正确！");
				return;
			}
			WhiteLists.ajaxCreateStatusList();
		}
	});
	
	$("#refresh_cache_button").click(function(){
		$.ajax({
			type:"POST",
			url:WhiteLists.contextPath + "/system/refreshTrade.action",
			data:{"type":"REFRESH_WHITE_LIST","target":""},
			datatype:"json",
			contentType: "application/x-www-form-urlencoded; charset=utf-8",
			success:function(result){
				try{
					if(!result.success){
						alert(result.tipMessage);
					}else{
						alert("刷新成功");
					}
				}catch(e){
					alert(e.message);
				}
			},
			error:function(e){
				alert(e.message);
			}
		});

	});
	
};
