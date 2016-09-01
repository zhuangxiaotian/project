<#macro htmlhead>
</#macro>
<#macro jsimport>
	<script src="${base}/static/js/home/login.js"></script>
	<script>
	$(document).ready(function(){
		Login.initPage("${res.returnUrl!''}");
		$("#loginName").removeAttr("disabled");
		$("#loginPass").removeAttr("disabled");
		$("#phoneMsg").removeAttr("disabled");
	});
	</script>
</#macro>
<#macro htmlbody>
<div class="sub-login">
    <div class="container">
        <div class="row sub-login-content">
            <div class="col-xs-12 col-md-12 login-content">
                <div class="row">
                    <div class="col-xs-12 col-md-4"></div>
                    <div class="col-xs-12 col-md-4">
                        <form class="form-horizontal">
                            <div class="form-group">
                                <label for="inputTitle" class="col-xs-2 control-label">
                                    <img class="sub-logo pull-left" src="${base}/static/common/skin/${res.mainSkin}/images/logo.png" alt="TopDeep">
                                </label>
                                <div class="col-xs-10">
                                    <div id="inputTitle">
                                        <span class="pull-left sub-logo-title">${res.appName!'玄谷通用统一后台'}</span>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-xs-12">
                                    <input type="text" class="form-control" disabled  id="loginName" placeholder="登录名称(或邮箱)" autofocus="">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-xs-12">
                                    <input type="password" class="form-control" id="loginPass" placeholder="登录密码" autofocus="">
                                    <#if res.phoneMsgRemind??>
					                <input id = "phoneMsg" type="hidden"  disabled value="${res.phoneMsgRemind}">
					                <#else>
					                </#if>
                                </div>
                            </div>
                            <#---
                            <div class="form-group">
                                <div class="col-xs-9">
                                    <input type="text" class="form-control"  placeholder="请输入右侧显示验证码" autofocus="">
                                </div>
                                <div class="col-xs-3">
                                    <div  class="lose-pwd" style="">
                                        <a href="javascript:void(0)">
                                            <img src=" " alt="验证码">
                                        </a>
                                    </div>
                                </div>
                            </div>-->
                            <div class="form-group">
                                 <#--<div class="col-xs-6">
                                    <div class="checkbox">
                                        <label>
                                            <input type="checkbox" id="remeber"> <span class="inputFont">记住登录信息</span>
                                        </label>
                                    </div>
                                </div>
                               <div class="col-xs-6">
                                    <div class="lose-pwd" style="">
                                        <a href="${base}/h/forgetPwd.action" class="input-font">忘记密码?</a>
                                    </div>
                                </div>-->
                            </div>
                            <#if res.registerOpen>
                            <div class="form-group">
                                <div class="col-xs-6">
                                    <button type="submit" class="btn btn-block input-btn" id="login_button">登录</button>
                                </div>
                                <div class="col-xs-6">
                                    <button type="submit" class="btn btn-block input-btn" id="signin_button">注册</button>
                                </div>
                            </div>
							<#else>
							<div class="form-group">
                                <div class="col-xs-12">
                                    <button type="submit" class="btn btn-block input-btn" id="login_button">登录</button>
                                </div>
                            </div>
							</#if>
                        </form>
                    </div>
                    <div class="col-xs-12 col-md-4"></div>
                </div>
            </div>
        </div>
    </div>
</div>
</#macro>
<#include "../common/main.ftl">
