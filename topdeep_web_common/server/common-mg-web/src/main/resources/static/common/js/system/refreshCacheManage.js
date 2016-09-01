var RefreshCacheManage = {};
// 路径
RefreshCacheManage.contextPath = contextPath;

RefreshCacheManage.ajaxRefreshList = function() {
	$.ajax({
		type : "POST",
		url : RefreshCacheManage.contextPath + "/system/RefreshCacheManage!ajaxRefreshList.action",
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (!result.success) {
					alert(result.tipMessage);
				} else {
					$("#refreshList_tbody_table").html("");
					RefreshCacheManage.dealRefreshList(result);
				}
			} catch (e) {
				alert(e);
			}
		},
		error : function() {
			alert("请求失败，请检查服务是否启动！");
		}
	});
};

RefreshCacheManage.ajaxRefresh = function(target,type,systemType) {
	$('.button_text1').addClass("disabled");

	$.ajax({
		type : "POST",
		url : RefreshCacheManage.contextPath + "/system/RefreshCacheManage!ajaxRefresh.action",
		data : {
			"type" : type,
			"target" : target,
			"systemType" : systemType
		},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (!result.success) {
					alert("刷新失败");
				} else {
					alert("刷新成功");
				}
				$('.button_text1').removeClass("disabled");
			} catch (e) {
				alert(e);
				$('.button_text1').removeClass("disabled");
			}
		},
		error : function() {
			alert("请求失败，请检查服务是否启动！");
		}
	});
};

RefreshCacheManage.dealRefreshList = function(result){
	if (result.baseInfoList && result.baseInfoList.length > 0) {
		var id = 0;
		for (var i = 0; i < result.baseInfoList.length; i++) {
			var item = result.baseInfoList[i].codeId;
			var ip = RefreshCacheManage.getIpForRefresh(item);
			if ('' === ip) {
				continue;
			}
			var trHtml = "<tr >"
					+ "<td><span title = '"
					+ item
					+ "' >"
					+ ip
					+ "</span></td>"
					+ "<td><div class='button_text1 btn btn-outline btn-info' id = 'param_button_"
					+ id
					+ "' name ='refresh_button'  >刷新</div></td>"
					+ "<td><div class='button_text1 btn btn-outline btn-info'  id = 'cache_button_"
					+ id
					+ "' name ='refresh_button'  >刷新</div></td>"
//					+ "<td><div class='button_text1 btn btn-outline btn-info'  id = 'unbind_button_"
//					+ id
//					+ "' name ='refresh_button'  >刷新</div></td>"
					+ "<td><div class='button_text1 btn btn-outline btn-info'  id = 'dict_button_"
					+ id
					+ "' name ='refresh_button'  >刷新</div></td>"
					+ "<td><div class='button_text1 btn btn-outline btn-info' id = 'all_button_"
					+ id
					+ "' name ='refresh_button'  >刷新</div></td>"
					+ "</tr>";

			$("#refreshList_tbody_table").append(trHtml);
			RefreshCacheManage.ItemClick(item, id,result.baseInfoList[i].systemType);
			id += 1;
		}
	}
};

RefreshCacheManage.getIpForRefresh = function(str) {
	var durl = /http:\/\/([^\/]+)\//i;
	domain = str.match(durl);
	if (domain && domain.length > 1) {
		return domain[1];
	} else {
		return '';
	}
};

RefreshCacheManage.ItemClick = function(refreshPath, id,systemType) {
	$("#param_button_" + id).bind("click", function() {
		if(confirm("确定刷新吗？")){
			RefreshCacheManage.ajaxRefresh(refreshPath,"c01",systemType);
		}
	});
	$("#cache_button_" + id).bind("click", function() {
		if(confirm("确定刷新吗？")){
			RefreshCacheManage.ajaxRefresh(refreshPath,"c02",systemType);
		}
	});
//	$("#unbind_button_" + id).bind("click", function() {
//		if(confirm("确定刷新吗？")){
//			RefreshCacheManage.ajaxRefresh(refreshPath,"c03",systemType);
//		}
//	});
	$("#dict_button_" + id).bind("click", function() {
		if(confirm("确定刷新吗？")){
			RefreshCacheManage.ajaxRefresh(refreshPath,"c04",systemType);
		}
	});
	$("#all_button_" + id).bind("click", function() {
		if(confirm("确定刷新吗？")){
			RefreshCacheManage.ajaxRefresh(refreshPath,"c05",systemType);
		}
	});

};

// 初始化
RefreshCacheManage.initPage = function() {
	RefreshCacheManage.ajaxRefreshList();
};


