/**
 * 
 */
var ResetPwd = {};

ResetPwd.ajaxResetPwd = function() {
	var flag = $("#flag").val();
	var loginPass = $("#loginPass").val();
	var confirmPass = $("#confirmPass").val();
	if (!ResetPwd.checkInput(loginPass, confirmPass)) {
		return false;
	}
	$.ajax({
		type : "POST",
		url : contextPath + "/h/forgetPwd!ajaxResetPwd.action",
		data : {
			"flag" : flag,
			"loginPass" : $.md5(loginPass)
		},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (result && result.success) {
					alert("修改成功,请重新登录");
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
	return false;
}

ResetPwd.checkInput = function(loginPass, confirmPass) {
	var passReg=/^(\w){6,100}$/;   
	if (!loginPass) {
		alert("请输入新密码");
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
			alert("确认密码输入格式有误")
			return false;
		}   
	}
	if (loginPass != confirmPass) {
		alert("两次密码不一致")
		return false;
	}
	return true;
}

ResetPwd.initPage = function() {
	var canResetPwd = $("#canResetPwd").val();
	if (canResetPwd) {
		$('#resetPwd-confirm').click(function() {
			ResetPwd.ajaxResetPwd();
			return false;
		});
	}
}
