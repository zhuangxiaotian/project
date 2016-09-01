var CustomerLogStatistics = {};
CustomerLogStatistics.contextPath = contextPath;

CustomerLogStatistics.initPage = function() {
	CustomerLogStatistics.ajaxQuery();
	
	$("#export").bind("click", function() {
		CustomerLogStatistics.exportCustomerLogStatistics();
	});
}

CustomerLogStatistics.ajaxQuery = function() {
	$.ajax({
		type : "POST",
		url : CustomerLogStatistics.contextPath + "/system/customerLogStatistics!ajaxQuery.action",
		data : "",
		datatype : "json",
		success : function(result) {
			try {
				if (result.success) {
					var html = "<tr><th>业务操作</th><th>近一周统计</th><th>近一个月统计</th><th>近一个季度统计</th><th>全部统计</th></tr>";
					for (var i = 0; i < result.statValueList.length; i++) {
						var detail = result.statValueList[i];
						html += "<tr><td>" + detail.statType + "</td><td>" + detail.value1 + "</td><td>" + detail.value2 + "</td><td>" + detail.value3
								+ "</td><td>" + detail.value4 + "</td></tr>";
					}
					$("#customerLogs").html(html)
				} else {
					alert(result.tipMessage);
				}
			} catch (e) {
				alert("查询失败" + e.message);
			}
		},
		error : function() {
			alert("查询失败");
		}
	})
}

CustomerLogStatistics.exportCustomerLogStatistics = function() {
	document.location.href= CustomerLogStatistics.contextPath + "/system/customerLogStatistics!exportCustomerLogStatistics.action";
};


