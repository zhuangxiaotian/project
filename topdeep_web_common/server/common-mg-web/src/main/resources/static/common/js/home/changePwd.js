var ChangePwd = {};
ChangePwd.contextPath = contextPath;

ChangePwd.initPage = function(){
	$("#changePwd-confirm").click(function(){
		var loginPwd = $("#loginPwd").val();
		var newLoginPwd = $("#newLoginPwd").val();
		var confirmPass = $("#confirmPass").val();
		if (!ChangePwd.checkInput(loginPwd, newLoginPwd, confirmPass)) {
			return false;
		}else{
		   $.ajax({
				type:"POST",
				url:ChangePwd.contextPath + "/h/changePwd!ajaxChangePwd.action",
				data:{"loginPass":$.md5(loginPwd),"newLoginPass":$.md5(newLoginPwd)},
				datatype:"json",
				contentType: "application/x-www-form-urlencoded; charset=utf-8",
				success:function(result){
					try{
						if(result && result.success){
							alert("修改成功，点击确认重新登陆");
							window.location.href=ChangePwd.contextPath+"/h/logout.action";
						}else{
							if(result.errorTimes==3){
								alert("验证超过三次，请点击确定重新登陆")
								window.location.href=ChangePwd.contextPath+"/h/logout.action";
							}else{
								alert(result.tipMessage);
							}
						}
					}catch(e){
					}
				},
				error:function(){
					alert("error")
					return false;
				}
			});
		}
		return false;
	});

	
}



ChangePwd.checkInput = function(loginPwd, newLoginPwd, confirmPass) {
	if (!loginPwd) {
		alert("请输入原密码")
		return false;
	} 
	var passReg=/^(\w){6,100}$/;   
	if (!newLoginPwd) {
		alert("请输入新密码");
		return false;
	}else{
		if (!passReg.test(newLoginPwd)){ 
			alert("新密码输入格式有误")
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
	if (newLoginPwd != confirmPass) {
		alert("两次密码不一致")
		return false;
	}
	return true;
}