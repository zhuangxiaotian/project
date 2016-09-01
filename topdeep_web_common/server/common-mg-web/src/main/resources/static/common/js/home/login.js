var Login = {};
Login.contextPath = contextPath;
Login.returnUrl = "";
Login.ajaxLogin = function() {

	if (!Login.checkInput()) {
		return false;
	}
	// login
	$.ajax({
		type : "POST",
		url : Login.contextPath + "/h/login!ajaxLogin.action",
		data : {
			"username" : $("#loginName").val(),
			"password" : $.md5($("#loginPass").val()),
			"returnUrl" : Login.returnUrl
		},
		datatype : "json",
		success : function(result) {
			try {
				if (result && result.success) {
					if(sessionStorage.navMenus)
					sessionStorage.navMenus = null;
					if(sessionStorage.rightMenus)
					sessionStorage.rightMenus = null;
					if(sessionStorage.switchMenus)
					sessionStorage.switchMenus = null;
					if (result.returnUrl && result.returnUrl != "") {
						window.location.href = result.returnUrl;
					} else {
						window.location.href = Login.contextPath + "/h/index.action";
					}

				} else {
					alert(result.tipMessage);
				}
			} catch (e) {
				alert("error");
			}
		},
		error : function() {
			alert("error");
		}
	});
}

Login.checkInput = function() {
	var username = $("#loginName").val();
	var password = $("#loginPass").val();
	if (!username) {
		alert("请填写登录名(或邮箱)")
		return false;
	}
	if (!password) {
		alert("请填写密码")
		return false;
	}
	return true;
}

Login.initPage = function(returnUrl){
	sessionStorage.navMenus = null;
	sessionStorage.rightMenus = null;
	sessionStorage.switchMenus = null;
	$("#loginName").val($.cookie('system_Account'));
	$("#remeber").attr("checked",$.cookie('remeber_Account'));
	Login.returnUrl = returnUrl;
	$(document).keydown(function(event){
	    if(event.keyCode==13){
	    	Login.checkCookie();
	    	Login.ajaxLogin();
			return false;
	    }
    });
	
	$('#login_button').click(function(){
		Login.checkCookie();
		Login.ajaxLogin();
		return false;
	});
	
	$('#signin_button').click(function(){
		window.location.href=Login.contextPath + "/h/signIn.action";
		return false;
	});
}

Login.checkCookie = function(){
	if($('#remeber').is(':checked')){
		$.cookie('system_Account', $("#loginName").val(), {
			expires : 99999,
			path : '/'
		});
		$.cookie('remeber_Account', $('#remeber').is(':checked'), {
			expires : 99999,
			path : '/'
		});
	}else{
		$.cookie('system_Account', null);
		$.cookie('remeber_Account', null);
	}

}
