<#macro htmlhead>
</#macro>

<#macro jsimport>
	<script src="${base}/static/js/home/changePwd.js"></script>
	<script>
		ChangePwd.initPage();
	</script>
</#macro>
<#macro htmlbody>
<div id="wrapper">
    <div class="container" id="resetBody">
        <div class="registration-heading">
        	<span class="registration-icon"></span>
        	<h3 class="registration-title">修改密码</h3>
        	<a href="javascript:history.go(-1)" class="back">返回>></a>
        </div>
        <div class="panel-body">
        	<form >
			    <fieldset>
			         <div class="form-group">
			          <label class="control-label" for="input01">原密码</label>
			            <input type="password" placeholder="请输入原密码"  id="loginPwd" class="form-control" value=""  autocomplete="off">
			        </div>
			     	<div class="form-group">
			          	<label class="control-label" for="input01">新密码</label>
			            <input type="password" placeholder="请输入至少六位的新密码"  id="newLoginPwd" class="form-control" value=""  autocomplete="off">
			        </div>
			        <div class="form-group">
			          	<label class="control-label" for="input01">确认密码</label>
			            <input type="password" placeholder="请确认密码"  id="confirmPass" class="form-control"  value=""  autocomplete="off">
			        </div>
			        <button class="btn btn-lg btn-primary btn-block" style="width:75%; margin-left:25%;"  id="changePwd-confirm">确认</button>
			    </fieldset>
			</form>
        </div>
    </div>
</div>
</#macro>
<#include "${res.template.main}">