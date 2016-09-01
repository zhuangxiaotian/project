/**
 * 
 */
var ForgetPwd = {};

ForgetPwd.ajaxForgetPwd = function(){
	var operatorEmail= $("#operatorEmail").val();
	var loginName = $("#operatorEmail").val();
	if(!ForgetPwd.checkInput(loginName,operatorEmail)){
		return false;
	}
	  $.ajax({
			type:"POST",
			url:contextPath + "/h/forgetPwd!ajaxUserConfirm.action",
			data:{"loginName":loginName,"operatorEmail":operatorEmail},
			datatype:"json",
			contentType: "application/x-www-form-urlencoded; charset=utf-8",
			success:function(result){
				try{
					if(result && result.success){
						alert("请前往邮箱确认");
						window.location.href=contextPath+"/h/login.action";
					}else{
						alert(result.tipMessage);
						return false;
					}
				}catch(e){
				}
			},
			error:function(){
				return false;
				alert("error")
			},
		});
}



ForgetPwd.checkInput = function(loginName,operatorEmail) {
   var operatorEmailReg =  /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
   if(!operatorEmail){
	   alert("请输入邮箱")
	   return false;
   }
   else if(!operatorEmailReg.test(operatorEmail)) {
	   	 alert("邮箱格式有误")
	   	 return false;
	   }
   return true;
}

ForgetPwd.initPage = function(){
	$('#forgetPwd-confirm').click(function(){
		ForgetPwd.ajaxForgetPwd();
		return false;
	});

}


