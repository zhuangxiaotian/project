var ClientActivationManage = {};
ClientActivationManage.gridData = [];
var grid;
ClientActivationManage.contextPath = contextPath;
var PageUtil;
ClientActivationManage.ajaxQuery = function(pageIndex,_ObjBtn) {
	var startDate = $("#startDate").val();
	var state=$("#state option:selected").val();
	var endDate = $("#endDate").val();
	var deviceId = $("#deviceId").val();
	var clientScreenWidth = $("#clientScreenWidth").val();
	var channel = $("#channel").val();
	var clientModel = $("#clientModel").val();
	var clientScreenHeight = $("#clientScreenHeight").val();
	var clientOsVersion = $("#clientOsVersion").val();
	var clientScreenDensity = $("#clientScreenDensity").val();
	var clientOs = $("#clientOs").val();
	var clientType = $("#clientType").val();
	var groupMethod = $("#groupMethod1").val();
	ClientActivationManage.checkDate(startDate,endDate);
	if("" != startDate){
		var startTime = TopdeepCommon.formatDate(new Date(startDate), "yyyy-MM-dd");
		if(startTime == "NaN-NaN-NaN"){
			alert("开始时间格式不对 yyyy-MM-dd");
			return false;
		}
	}
	if("" != endDate){
		var endTime = TopdeepCommon.formatDate(new Date(endDate), "yyyy-MM-dd");
		if(endTime == "NaN-NaN-NaN"){
			alert("结束时间格式不对 yyyy-MM-dd");
			return false;
		}
	}
	$.ajax({
		type : "POST",
		url : ClientActivationManage.contextPath
				+ "/client/ClientActivationManage!ajaxQuery.action",
		data : {
			"pageIndex" : pageIndex,
			"state":state,
			"startDate" : startTime,
			"endDate" : endTime,
			"deviceId" : deviceId,
			"clientType" : clientType,
			"clientScreenWidth" : clientScreenWidth,
			"channel" : channel,
			"clientModel" : clientModel,
			"clientScreenHeight" : clientScreenHeight,
			"clientOsVersion" : clientOsVersion,
			"clientScreenDensity" : clientScreenDensity,
			"deviceId" : deviceId,
			"groupMethod" : groupMethod
			
		},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			if(result.success){
				if(result.paramInt == "0"){
					ClientActivationManage.initGrid("");
					if(result.clientActivationList.length >0){
					}else{
						alert("无数据显示查询无记录");
					}
					ClientActivationManage.gridData = result.clientActivationList;
				}else{
					ClientActivationManage.initGrid(groupMethod);
					if(result.clientActivationList1.length >0){
					}else{
						alert("无数据显示查询无记录");
					}
					ClientActivationManage.gridData = result.clientActivationList1;
				}
				
				
				grid.setData(ClientActivationManage.gridData);
				grid.render();
				PageUtil.pageData = result.pageData;
				PageUtil.refreshPage();
			}else{
				alert(result.tipMessage);
			}
			TopdeepCommon.enableButton(_ObjBtn,"clientActivation_search_keyword_button");
		},
		error : function() {
			TopdeepCommon.enableButton(_ObjBtn,"clientActivation_search_keyword_button");
		}
	});

};
var map={
	    "channel":'下载渠道',
	    "clientType":'客户端类型',
	    "clientVersion":'客户端版本',
	    "deviceId":'设备标识',
	    "clientModel":'设备型号',
	    "clientOs":'客户端操作系统',
	    "clientOsVersion":'客户端操作系统版本',
	    "clientScreenWidth":'客户端屏幕宽度',
	    "clientScreenHeight":'客户端屏幕高度',
	    "clientScreenDensity":'客户端屏幕密度'
	};

var mapKey='';
var mapValue='';
ClientActivationManage.clientGroupCondition = function(){
	mapKey='';
	mapValue='';
	var obj=document.getElementsByName('checkbox');
	ClientActivationManage.clientGroup(obj);
	$("#groupMethod").val(mapValue.substring(0,mapValue.length-1));
	$("#groupMethod1").val(mapKey.substring(0,mapKey.length-1));
}

ClientActivationManage.clientGroup = function(obj){
	for(var i=0; i<obj.length; i++){
		if(obj[i].checked) {
			if(obj[i].value == "channel"){
				mapKey+=obj[i].value+',';
				mapValue+=map.channel+',';
			}else if(obj[i].value == "clientType"){
				mapKey+=obj[i].value+',';
				mapValue+=map.clientType+',';
			}else if(obj[i].value == "clientVersion"){
				mapKey+=obj[i].value+',';
				mapValue+=map.clientVersion+',';
			}else if(obj[i].value == "deviceId"){
				mapKey+=obj[i].value+',';
				mapValue+=map.deviceId+',';
			}else if(obj[i].value == "clientModel"){
				mapKey+=obj[i].value+',';
				mapValue+=map.clientModel+',';
			}else if(obj[i].value == "clientOs"){
				mapKey+=obj[i].value+',';
				mapValue+=map.clientOs+',';
			}else if(obj[i].value == "clientOsVersion"){
				mapKey+=obj[i].value+',';
				mapValue+=map.clientOsVersion+',';
			}else if(obj[i].value == "clientScreenWidth"){
				mapKey+=obj[i].value+',';
				mapValue+=map.clientScreenWidth+',';
			}else if(obj[i].value == "clientScreenHeight"){
				mapKey+=obj[i].value+',';
				mapValue+=map.clientScreenHeight+',';
			}else if(obj[i].value == "clientScreenDensity"){
				mapKey+=obj[i].value+',';
				mapValue+=map.clientScreenDensity+',';
			}
		} 
	}
}

ClientActivationManage.initGrid = function(groupMethod) {
	var columns = []; 
	if("" == groupMethod){
		columns.push({
			id : "channel",
			name : "下载渠道",
			field : "channel"
		});
		columns.push({
			id : "clientType",
			name : "客户端类型",
			field : "clientType"
		});
		columns.push({
			id : "clientVersion",
			name : "客户端版本",
			field : "clientVersion"
		});
		columns.push({
			id : "deviceId",
			name : "设备标识",
			field : "deviceId"
		});
		columns.push({
			id : "clientModel",
			name : "设备型号",
			field : "clientModel"
		});
		columns.push({
			id : "clientOs",
			name : "客户端操作系统",
			field : "clientOs"
		});
		columns.push({
			id : "clientOsVersion",
			name : "客户端操作系统版本",
			field : "clientOsVersion"
		});
		columns.push({
			id : "clientScreenWidth",
			name : "客户端屏幕宽度",
			field : "clientScreenWidth"
		});
		columns.push({
			id : "clientScreenHeight",
			name : "客户端屏幕高度",
			field : "clientScreenHeight"
		});
		columns.push({
			id : "clientScreenDensity",
			name : "客户端屏幕密度",
			field : "clientScreenDensity"
		});
	}else{
		var clientGroup = groupMethod.split(",");
		ClientActivationManage.clientGroup(clientGroup);
		var groupMethod = mapValue.substring(0,mapValue.length-1).split(",");
		var groupMethod1 = mapKey.substring(0,mapKey.length-1).split(",");
		for (var i = 0; i < groupMethod.length; i++) {
			columns.push({
				id : groupMethod1[i],
				name : groupMethod[i],
				field : groupMethod1[i]
			});
		}
		columns.push({
			id : "total",
			name : "总数",
			field : "total"
		});
	}
	
	var options = {
		editable : true,
		enableAddRow : false,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 40
	};

	grid = new Slick.Grid("#grid", ClientActivationManage.gridData, columns,
			options);
	grid.autosizeColumns();

}

ClientActivationManage.checkDate = function(startDate,endDate){
	if("" != startDate){
		var startdate = new Date(startDate);  
	    var date = new Date();  
	    if(startdate > date) 
	    {
	    	alert("开始时间不能大于当前时间！");
	        return false;
	    }
	}
	if("" != endDate){
		var enddate = new Date(endDate);  
	    var date = new Date();  
	    if(enddate > date) 
	    {
	    	alert("结束时间不能大于当前时间！");
	        return false;
	    }
	}
	if("" != startDate && "" != endDate){
		var startDate1 = startDate.replaceAll("-","");
		var endDate1 = endDate.replaceAll("-","");
		if(startDate1 > endDate1){
			alert("开始时间不能大于结束时间");
			return false;
		}
	}
	if("" != startDate && "" == endDate){
		alert("开始时间和结束时间必须同时满足都为空或都不为空");
		return false;
	}
	if("" == startDate && "" != endDate){
		alert("开始时间和结束时间必须同时满足都为空或都不为空");
		return false;
	}
}

// 初始化
ClientActivationManage.initPage = function(groupMethod) {
	ClientActivationManage.initGrid(groupMethod);
	PageUtil = new TopdeepUtil.pageUtil(null,ClientActivationManage.ajaxQuery,"");
	PageUtil.initPage();
	$("#clientActivation_search_keyword_button").click(function() {
		var _this = $("#clientActivation_search_keyword_button");
		if(TopdeepCommon.checkEnableButton(_this)){
			TopdeepCommon.disableButton(_this,"clientActivation_search_keyword_button");
			ClientActivationManage.ajaxQuery(0,_this);
		}
	});
	
	$("#reset").click(function() {
		window.location.href="";
	});
	
	$(document).on("click","#exportAll",function(){
		ClientActivationManage.exportAll();
		return false;
	})

	ClientActivationManage.exportAll  = function(){
		var startDate = $("#startDate").val();
		var state=$("#state option:selected").val();
		var endDate = $("#endDate").val();
		var deviceId = $("#deviceId").val();
		var clientScreenWidth = $("#clientScreenWidth").val();
		var channel = $("#channel").val();
		var clientModel = $("#clientModel").val();
		var clientScreenHeight = $("#clientScreenHeight").val();
		var clientOsVersion = $("#clientOsVersion").val();
		var clientScreenDensity = $("#clientScreenDensity").val();
		var clientOs = $("#clientOs").val();
		var clientType = $("#clientType").val();
		var groupMethod = $("#groupMethod1").val();
		var groupMethodName = $("#groupMethod").val();
		if("" != groupMethod){
			groupMethod = groupMethod +",total";
		}
		if("" != groupMethodName){
			groupMethodName = encodeURI(groupMethodName +",总数");
		}
		document.location.href= ClientActivationManage.contextPath + "/client/clientActivationManage!exportClientActivation.action?state="+state+
								"&startDate="+startDate+"&endDate="+endDate+"&deviceId="+deviceId+"&clientType="+clientType+
								"&clientScreenWidth="+clientScreenWidth+"&channel="+channel+"&clientModel="+clientModel+
								"&clientScreenHeight="+clientScreenHeight+"&clientOsVersion="+clientOsVersion+
								"&clientScreenDensity="+clientScreenDensity+"&clientOs="+clientOs+"&groupMethod="+groupMethod+"&groupMethodName="+groupMethodName;
		return false;
	};
};