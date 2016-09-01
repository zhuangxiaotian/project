<#macro jsimport>
	<script src="${base}/static/js/home/signIn.js"></script>
	<script>
		SignIn.initPage();
	</script>
</#macro>
<#macro htmlbody>
<div class="sub-login">
        <div class="container">
            <div class="row sub-login-content">
                <div class="col-xs-12 col-md-12 register-content">
                    <div class="row">
                        <div class="col-xs-12 col-md-2"></div>
                        <div class="col-xs-12 col-md-6">
                            <form class="form-horizontal">
                                <div class="form-group">
                                    <div class="col-sm-8 col-sm-offset-4 col-xs-12">
                                        <div class="sub-sign-title">注册</div>
                                    </div>
                                </div>
                                <#--<div class="form-group">
                                    <label for="operatorName" class="col-sm-4 control-label login-icon"><span>姓名:</span></label>
                                    <div class="col-sm-8 inputContent">
                                        <input type="text" class="form-control" id= "operatorName" placeholder="支持中文和英文">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="loginName" class="col-sm-4 control-label login-icon"><span>用户名:</span></label>
                                    <div class="col-sm-8 inputContent">
                                        <input type="text" class="form-control" id="loginName" placeholder="5-20位,支持数字字母下划线" autocomplete="off">
                                    </div>
                                </div>-->
                                 <div class="form-group">
                                    <label for="mobileTelephone" class="col-sm-4 control-label login-icon"><span>手机:</span></label>
                                    <div class="col-sm-8 inputContent">
                                        <input type="text" class="form-control" id="mobileTelephone" placeholder="请输入11位手机号码" autocomplete="off">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="operatorEmail" class="col-sm-4 control-label login-icon"><span>邮箱:</span></label>
                                    <div class="col-sm-8 inputContent">
                                        <input type="text" class="form-control" id="operatorEmail" placeholder="请输入邮箱(首次登录的登录名)" autocomplete="off">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="loginPass" class="col-sm-4 control-label login-icon"><span>密码:</span></label>
                                    <div class="col-sm-8 inputContent">
                                        <input type="password" class="form-control" id="loginPass" placeholder="5-20位,支持数字字母下划线" autocomplete="off">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="confirmPass" class="col-sm-4 control-label login-icon"><span>确认密码:</span></label>
                                    <div class="col-sm-8 inputContent">
                                        <input type="password" class="form-control" id="confirmPass" placeholder="请再次输入密码" autocomplete="off">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-4 col-xs-6 pull-right">
                                        <a href="${base}/h/logout.action" class="btn btn-block input-btn">返回</a>
                                    </div>
                                    <div class="col-sm-4 col-xs-6 pull-right">
                                        <button type="submit" class="btn btn-block input-btn" id="signIn-confirm">注册</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                        <div class="col-xs-12 col-md-3"></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</#macro>
<#include "../common/main.ftl">
