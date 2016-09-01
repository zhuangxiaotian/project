var SignIn = {};
SignIn.contextPath = contextPath;
SignIn.ajaxSignIn = function() {
	var operatorName = $("#operatorEmail").val();
	var loginName = $("#operatorEmail").val();
	var loginPass = $("#loginPass").val();
	var confirmPass = $("#confirmPass").val();
	var mobileTelephone = $("#mobileTelephone").val();
	var operatorEmail = $("#operatorEmail").val();
	if (!SignIn.checkInput(operatorName, loginName, loginPass, confirmPass, mobileTelephone, operatorEmail)) {
		return false;
	}
	$.ajax({
		type : "POST",
		url : SignIn.contextPath + "/h/ajaxSignIn.action",
		data : {
			"operatorName" : operatorName,
			"loginName" : loginName,
			"loginPass" : $.md5(loginPass),
			"mobileTelephone" : mobileTelephone,
			"otherTelephone" : "",
			"operatorEmail" : operatorEmail
		},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (result && result.success) {
					alert(result.tipMessage);
					window.location.href=contextPath + "/h/login.action";
				} else {
					alert(result.tipMessage);
				}
			} catch (e) {
			}
		},
		error : function() {
		}
	});
}

SignIn.checkInput = function(operatorName, loginName, loginPass, confirmPass, mobileTelephone, operatorEmail) {
	var operatorEmailReg = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	if (!operatorEmail) {
		alert("请输入邮箱")
		return false;
	} else if (!operatorEmailReg.test(operatorEmail)) {
		alert("邮箱输入有误")
		return false;
	}
	var passReg=/^(\w){6,100}$/;   
	if (!loginPass ) {
		alert("请输入密码");
		return false;
	}else{
		if (!passReg.test(loginPass)){ 
			alert("密码输入格式有误")
			return false;
		}   
	}
	if (!confirmPass) {
		alert("请输入确认密码")
		return false;
	}else{
		if (!passReg.test(confirmPass)){
			alert("确认密码有误")
			return false;
		}   
	}
	if (loginPass != confirmPass) {
		alert("两次密码不一致")
		return false;
	}
	var mobileTelephoneReg = /^1[3|4|5|8][0-9]\d{8}$/;
	if (!mobileTelephone) {
		alert("请输入手机号码")
		return false;
	} else if (!mobileTelephoneReg.test(mobileTelephone)) {
		alert("手机号输入有误")
		return false;
	}
	return true;
}

SignIn.initPage = function() {
	$('#signIn-confirm').click(function() {
		SignIn.ajaxSignIn();
		return false;
	});

}
