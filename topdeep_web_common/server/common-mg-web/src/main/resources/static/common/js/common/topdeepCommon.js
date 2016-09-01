var TopdeepCommon= {}
TopdeepCommon.contextPath = contextPath;
TopdeepCommon.parentUuid = "************************";
String.prototype.replaceAll = function(str1, str2) {
	var str = this;
	var result = str.replace(eval("/" + str1 + "/gi"), str2);
	return result;
}

TopdeepCommon.getJQuerySelectId = function(id) {
	var result = id;
	if (id) {
		result = id.replaceAll('\\.', '\\.');
	}
	return result;
}

TopdeepCommon.formatDate = function(date, format) {
	var paddNum = function(num) {
		num += "";
		return num.replace(/^(\d)$/, "0$1");
	}
	// 指定格式字符
	var cfg = {
		yyyy : date.getFullYear() // 年 : 4位
		,
		yy : date.getFullYear().toString().substring(2)// 年 : 2位
		,
		M : date.getMonth() + 1 // 月 : 如果1位的时候不补0
		,
		MM : paddNum(date.getMonth() + 1) // 月 : 如果1位的时候补0
		,
		d : date.getDate() // 日 : 如果1位的时候不补0
		,
		dd : paddNum(date.getDate())// 日 : 如果1位的时候补0
		,
		hh : paddNum(date.getHours()) // 时
		,
		mm : paddNum(date.getMinutes()) // 分
		,
		ss : paddNum(date.getSeconds())
	// 秒
	}
	format || (format = "yyyy-MM-dd hh:mm:ss");
	return format.replace(/([a-z])(\1)*/ig, function(m) {
		return cfg[m];
	});
}

// 图片验证码链接
TopdeepCommon.picturValidatacodeUrl = TopdeepCommon.contextPath + "/v/VerifyCodeServlet.action?seed=";
// 密码正则表达式
TopdeepCommon.passwordReg = /^\d{6}$/;
// 密码为非6位数字时的提示语句
TopdeepCommon.showDiv = function(showPageStepList, stepID) {
	if (!showPageStepList || !stepID) {
		return false;
	}
	var isShow = false;
	for (var i = 0; i < showPageStepList.length; i++) {
		var item = showPageStepList[i];
		$("#" + item).hide();
		if (item == stepID) {
			isShow = true;
		}
	}
	if (isShow) {
		$(window).scrollTop(0);
		$("#" + stepID).show();
	}
};

TopdeepCommon.alertTipMessage = function(title, tipMessage, callback) {
	if (arguments.length <= 1) {
		tipMessage = title;
		title = "提示信息";
	}
	var $dlg = $("#dialog_div");
	$dlg.empty();
	var dialogContentHtml = "<div id='global_alert_title' class='dlg_title'>"
			+ title
			+ "</div>"
			+ "<div id='global_alert_content' class='dlg_content' style='text-align:left;max-width:280px;word-wrap: break-word;min-height: 70px;height: initial;'>&nbsp;&nbsp;&nbsp;&nbsp;"
			+ tipMessage + "</div>" + "<div class='dlg_bar' style='margin-bottom:20px;'>" + "<button id='alertConfirm_btn' class='btn btn_center'>确定</button>"
			+ "</div>";
	$dlg.append(dialogContentHtml);
	TopdeepCommon.createMask();
	TopdeepCommon.centerDlg($dlg);
	$dlg.show();
	$("#alertConfirm_btn").bind("click", function() {
		TopdeepCommon.deleteMask();
		$dlg.hide();
		if (callback && typeof (callback) == "function") {
			callback();
		}
	});
};
// 确认对话框
TopdeepCommon.confirmDialog = function(title, tipMessage, callback) {
	if (arguments.length <= 1) {
		tipMessage = title;
		title = "提示信息";
	}
	var $dlg = $("#dialog_div");
	$dlg.empty();
	var dialogContentHtml = "<div class='dlg_title'>"
			+ title
			+ "</div>"
			+ "<div class='dlg_content' style='text-align:left;max-width:280px;word-wrap: break-word;min-height: 70px;height: initial;'>&nbsp;&nbsp;&nbsp;&nbsp;"
			+ tipMessage + "</div>" + "<div class='dlg_bar' style='margin-bottom:20px;'>" + "<button id='dialogConfirm_btn' class='btn btn_left'>确定</button>"
			+ "<button id='dialogCancle_btn' class='btn btn_right'>返回</button>" + "</div>";
	$dlg.append(dialogContentHtml);
	TopdeepCommon.createMask();
	TopdeepCommon.centerDlg($dlg);
	$dlg.show();

	$("#dialogConfirm_btn").bind("click", function() {
		TopdeepCommon.deleteMask();
		$dlg.hide();
		if (callback && typeof (callback) == "function") {
			callback();
		}
	});
	$("#dialogCancle_btn").bind("click", function() {
		TopdeepCommon.deleteMask();
		$dlg.hide();
	});
};
// 创建遮盖层并显示
TopdeepCommon.createMask = function() {

	var $mask = $("#mask_div");
	if ($mask.length > 0) {
		var showCount = parseInt($mask.attr("showCount"));
		showCount++;
		$mask.attr("showCount", showCount);
	} else {
		var bodyObj = $($("body")[0]);
		bodyObj.append("<div id='mask_div' showCount='1' class='dlg_mask' style='display: block;'></div>");

		var maskObj = $("#mask_div").get(0);
		maskObj.className = "dlg_mask";
		maskObj.style.height = TopdeepCommon.maxHeight() + "px"; // document.body.scrollHeight+"px";
	}
};
// 删除遮照层
TopdeepCommon.deleteMask = function() {
	var $mask = $("#mask_div");
	if ($mask.length > 0) {
		var showCount = parseInt($mask.attr("showCount"));
		if (showCount > 1) {
			showCount--;
			$mask.attr("showCount", showCount);
		} else {
			$mask.remove();
		}
	}
};
// 计算当前页面窗口的最大高度
TopdeepCommon.maxHeight = function() {
	var maxHeight = document.documentElement.offsetHeight;
	if (maxHeight <= document.documentElement.scrollHeight) {
		maxHeight = document.documentElement.scrollHeight;
	}
	if (maxHeight <= document.documentElement.clientHeight) {
		maxHeight = document.documentElement.clientHeight;
	}
	if (maxHeight <= window.screen.height) {
		maxHeight = window.screen.height;
	}
	return maxHeight;
};

TopdeepCommon.centerDlg = function($dlg) {
	if ($dlg.length <= 0) {
		return;
	}
	var dlgWidth = $dlg.width();
	var dlgHeight = $dlg.height();
	var windowWidth = $(window).width();
	var windowHeight = $(window).height();
	var dlgLeft = (windowWidth - dlgWidth) / 2;
	var dlgTop = (windowHeight - dlgHeight) / 2;
	// alert(dlgLeft+","+dlgTop);
	$dlg.css("left", "");
	$dlg.css("top", "");
	$dlg.offset({
		top : dlgTop,
		left : dlgLeft
	});
	// var props = {};
	// props.left = dlgLeft;
	// props.top = dlgTop;
	// $dlg.css(props);
}

TopdeepCommon.doResize = function() {
	var obj = document.getElementsByTagName("select");

	for (var i = 0; i < obj.length; i++) {
		TopdeepCommon.resizeSel(obj[i]);
	}
};
TopdeepCommon.resizeSel = function(selObj) {
	var coverObj = selObj.parentNode;
	var w = coverObj.parentNode.offsetWidth;

	selObj.style.width = w + "px";
	coverObj.style.width = (w - 20) + "px";
};
TopdeepCommon.selInfo = function(obj) {
	var objs = document.getElementsByName("info_list");

	for (var i = 0; i < objs.length; i++) {
		objs[i].className = "info_list info_unsel";
	}
	obj.className = "info_list info_sel";
};

TopdeepCommon.redeemClick = function($_obj, fundItem, redeemToTradeAccMap) {
	$_obj.bind("click", function() {
		TopdeepCommon.alertTipMessage("未实现每支基金的click事件,此方法如果是赎回需要在Redeem.js中重写");
	});
};
TopdeepCommon.checkDate = function(dateStr) {
	var reg = /((^((1[8-9]\d{2})|([2-9]\d{3}))(-)(10|12|0?[13578])(-)(3[01]|[12][0-9]|0?[1-9])$)|(^((1[8-9]\d{2})|([2-9]\d{3}))(-)(11|0?[469])(-)(30|[12][0-9]|0?[1-9])$)|(^((1[8-9]\d{2})|([2-9]\d{3}))(-)(0?2)(-)(2[0-8]|1[0-9]|0?[1-9])$)|(^([2468][048]00)(-)(0?2)(-)(29)$)|(^([3579][26]00)(-)(0?2)(-)(29)$)|(^([1][89][0][48])(-)(0?2)(-)(29)$)|(^([2-9][0-9][0][48])(-)(0?2)(-)(29)$)|(^([1][89][2468][048])(-)(0?2)(-)(29)$)|(^([2-9][0-9][2468][048])(-)(0?2)(-)(29)$)|(^([1][89][13579][26])(-)(0?2)(-)(29)$)|(^([2-9][0-9][13579][26])(-)(0?2)(-)(29)$))/;
	return reg.test(dateStr);
};

TopdeepCommon.checkDate1 = function(dateStr) {
	var reg = /((^((1[8-9]\d{2})|([2-9]\d{3}))(10|12|0?[13578])(3[01]|[12][0-9]|0?[1-9])$)|(^((1[8-9]\d{2})|([2-9]\d{3}))(11|0?[469])(30|[12][0-9]|0?[1-9])$)|(^((1[8-9]\d{2})|([2-9]\d{3}))(0?2)(2[0-8]|1[0-9]|0?[1-9])$)|(^([2468][048]00)(0?2)(29)$)|(^([3579][26]00)(0?2)(29)$)|(^([1][89][0][48])(0?2)(29)$)|(^([2-9][0-9][0][48])(0?2)(29)$)|(^([1][89][2468][048])(0?2)(29)$)|(^([2-9][0-9][2468][048])(0?2)(29)$)|(^([1][89][13579][26])(0?2)(29)$)|(^([2-9][0-9][13579][26])(0?2)(29)$))/;
	return reg.test(dateStr);
};
// 后退功能，如果是风险测评页面，再跳到上一页面
TopdeepCommon.goBackPre = function() {
	history.go(-1);
};
// 关闭窗口，退出微信
TopdeepCommon.closeWindow = function() {
	var ua = navigator.userAgent;
	if (ua.indexOf("MicroMessenger") > -1) {
		WeixinJSBridge.call('closeWindow');
	} else {
		// Scripts may close only the windows that were opened by it.
		window.opener = null;
		window.open('', '_self');
		window.close();
	}
};

TopdeepCommon.Redirect = function(targetUrl) {
	if (targetUrl) {
		window.location.href = targetUrl;
	}
}

TopdeepCommon.locationReplace = function(directUrl) {
	if (directUrl) {
		window.location.replace(directUrl);
	}
};

TopdeepCommon.loadingMaskShow = function() {
	TopdeepCommon.createMask();
	var bodyObj = $($("body")[0]);
	var $loading = $("#loading_div");
	$loading.empty();
	var loadingHtml = "<div id='loading_div2' class='dlg_content' style='text-align:center;'>" + "<div><image src='" + TopdeepCommon.contextPath
			+ "/skin/weixin/images/common/loading.gif'/></div>" + "<div style='color:#222;font-size:18px;font-weight:600;'>加载中...</div>" + "</div>";
	$loading.append(loadingHtml);
	var clientHeight = 100;// document.documentElement.clientHeight;
	// if(!clientHeight){
	// clientHeight = 200;
	// }
	// clientHeight = clientHeight/2-20;
	// TopdeepCommon.centerDlg($loading);
	$loading.css("top", "");
	$loading.css("left", "");
	$loading.offset({
		left : 0,
		top : $("body").height() / 2
	});
	$loading.show();
	// bodyObj.append(loadingHtml);
	// $("#loading_div1").get(0).style.top = clientHeight + "px";
};
// 删除遮照层和加载div
TopdeepCommon.closeLoadingMask = function() {
	var $loading = $("#loading_div");
	$loading.hide();
	TopdeepCommon.deleteMask();
	// $("#loading_div1").remove();
};
// 换成可点击按钮的样式
TopdeepCommon.enableButton = function($button, disableClass) {
	if (TopdeepCommon.checkEnableButton($button)) {
		return;
	}
	$button.removeAttr("disabled");
	$button.removeClass(disableClass);

	TopdeepCommon.closeLoadingMask();
};
// 把可点击的按钮变成不可点击样式
TopdeepCommon.disableButton = function($button, disableClass) {
	if (TopdeepCommon.checkEnableButton($button)) {
		$button.attr("disabled", "disabled");
		$button.addClass(disableClass);
		TopdeepCommon.loadingMaskShow();
	}
};
// 按钮是否可点击
TopdeepCommon.checkEnableButton = function($button) {
	return $button.attr("disabled") != "disabled";
};
// 给传进来的上一页的html对象设置后退的class的属性值,此方法目前只在绑定、开户、菜单页使用
TopdeepCommon.setBackPreClassValue = function($_obj) {
	if ($_obj) {
		$_obj.removeClass("closeWindowPage");
		$_obj.addClass("gotoPrevPage");

		var queryString = location.search;
		if (queryString) {
			var p1 = "";
			var p3 = "";
			var p99 = "";
			var index1 = queryString.indexOf("?") + 1;
			queryString = queryString.substring(index1);
			var paramArr = queryString.split("&");
			for (var i = 0; i < paramArr.length; i++) {
				try {
					var item = paramArr[i];
					var key = item.substring(0, item.indexOf("="));
					if (key == "p1") {
						p1 = item.substring(item.indexOf("=") + 1);
					}
					if (key == "p3") {
						p3 = item.substring(item.indexOf("=") + 1);
					}
					if (key == "p99") {
						p99 = item.substring(item.indexOf("=") + 1);
					}
				} catch (e) {
				}
			}
			if (p1 && p3 && p99) {
				$_obj.addClass("closeWindowPage");
				$_obj.removeClass("gotoPrevPage");
			}
		}
	}
};
TopdeepCommon.placeholderDateInput = function($_obj) {
	if (!$_obj || $_obj.length == 0) {
		return false;
	}
	// var date = new Date();
	// var year = date.getFullYear();
	// var month = date.getMonth() + 1;
	// if(month < 10){
	// month = "0"+month;
	// }
	// var _date = date.getDate();
	// if(_date < 10){
	// _date = "0" + _date;
	// }
	$_obj.attr("placeholder", "yyyyMMdd");
	return true;
};

TopdeepCommon.saveSuccessReturn = function(item, redirectUrl) {
	var i = 3;
	var intervalid;
	intervalid = setInterval(function() {
		if (i == 0) {
			window.location.href = redirectUrl;
			clearInterval(intervalid);
		}
		item.html("<tr><td colspan='3' style='background-color:#6DA4D2;'>保存成功，倒数 " + i + " 秒返回</td></tr>");
		// item.innerHTML = "保存成功，倒数"+i+"秒返回";
		i--;
	}, 1000);
}
//

TopdeepCommon.resetQuery = function() {
	$(".tablestyle_query").find("input[type=text]").each(function() {
		$(this).val("");
	});

	$(".selector").each(function() {

		// alert($(this)[0].selectedIndex);
		$(this)[0].selectedIndex = 0;
		// $(this).options[0].selected = true;
		// $(this).find("option[value='']").attr("selected",true);
	});
}

TopdeepCommon.getStringUTF8Length = function utf8ByteLength(str) {
	if (!str)
		return 0;
	var escapedStr = encodeURI(str);
	var match = escapedStr.match(/%/g);
	return match ? (escapedStr.length - match.length * 2) : escapedStr.length;
}

/*
根据〖中华人民共和国国家标准 GB 11643-1999〗中有关公民身份号码的规定，公民身份号码是特征组合码，由十七位数字本体码和一位数字校验码组成。排列顺序从左至右依次为：六位数字地址码，八位数字出生日期码，三位数字顺序码和一位数字校验码。
    地址码表示编码对象常住户口所在县(市、旗、区)的行政区划代码。
    出生日期码表示编码对象出生的年、月、日，其中年份用四位数字表示，年、月、日之间不用分隔符。
    顺序码表示同一地址码所标识的区域范围内，对同年、月、日出生的人员编定的顺序号。顺序码的奇数分给男性，偶数分给女性。
    校验码是根据前面十七位数字码，按照ISO 7064:1983.MOD 11-2校验码计算出来的检验码。

出生日期计算方法。
    15位的身份证编码首先把出生年扩展为4位，简单的就是增加一个19或18,这样就包含了所有1800-1999年出生的人;
    2000年后出生的肯定都是18位的了没有这个烦恼，至于1800年前出生的,那啥那时应该还没身份证号这个东东，⊙﹏⊙b汗...
下面是正则表达式:
 出生日期1800-2099  (18|19|20)?\d{2}(0[1-9]|1[12])(0[1-9]|[12]\d|3[01])
 身份证正则表达式 /^\d{6}(18|19|20)?\d{2}(0[1-9]|1[12])(0[1-9]|[12]\d|3[01])\d{3}(\d|X)$/i            
 15位校验规则 6位地址编码+6位出生日期+3位顺序号
 18位校验规则 6位地址编码+8位出生日期+3位顺序号+1位校验位
 
 校验位规则     公式:∑(ai×Wi)(mod 11)……………………………………(1)
                公式(1)中： 
                i----表示号码字符从由至左包括校验码在内的位置序号； 
                ai----表示第i位置上的号码字符值； 
                Wi----示第i位置上的加权因子，其数值依据公式Wi=2^(n-1）(mod 11)计算得出。
                i 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
                Wi 7 9 10 5 8 4 2 1 6 3 7 9 10 5 8 4 2 1

*/
//身份证号合法性验证 
//支持15位和18位身份证号
//支持地址编码、出生日期、校验位验证
TopdeepCommon.IdentityCodeValid = function(code) { 
            var city={11:"北京",12:"天津",13:"河北",14:"山西",15:"内蒙古",21:"辽宁",22:"吉林",23:"黑龙江 ",31:"上海",32:"江苏",33:"浙江",34:"安徽",35:"福建",36:"江西",37:"山东",41:"河南",42:"湖北 ",43:"湖南",44:"广东",45:"广西",46:"海南",50:"重庆",51:"四川",52:"贵州",53:"云南",54:"西藏 ",61:"陕西",62:"甘肃",63:"青海",64:"宁夏",65:"新疆",71:"台湾",81:"香港",82:"澳门",91:"国外 "};
            var tip = "";
            var pass= true;
            
            if (!code || !/^[1-9][0-9]{5}(19[0-9]{2}|200[0-9]|2010)(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])[0-9]{3}[0-9xX]$/i.test(code)) {
                tip = "身份证号格式错误";
                pass = false;
            }
            
           else if(!city[code.substr(0,2)]){
                tip = "地址编码错误";
                pass = false;
            }
            else{
                //18位身份证需要验证最后一位校验位
                if(code.length == 18){
                    code = code.split('');
                    //∑(ai×Wi)(mod 11)
                    //加权因子
                    var factor = [ 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 ];
                    //校验位
                    var parity = [ 1, 0, 'X', 9, 8, 7, 6, 5, 4, 3, 2 ];
                    var sum = 0;
                    var ai = 0;
                    var wi = 0;
                    for (var i = 0; i < 17; i++)
                    {
                        ai = code[i];
                        wi = factor[i];
                        sum += ai * wi;
                    }
                    var last = parity[sum % 11];
                    if(parity[sum % 11] != code[17]){
                        tip = "校验位错误";
                        pass =false;
                    }
                }
            }
            
            return pass;
}
