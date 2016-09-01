<#macro htmlhead>
<style>
    html,body {font-family:"Microsoft YaHei", "宋体", Verdana, Geneva, sans-serif;height:100%;}
    body {
      font-size: 16px;
      background: url(${base}/skin/cms/images/login-bg.jpg) no-repeat;
      position:relative;
      }
      .login-content {
      		margin-top: 10%; 
      	}
      @media (min-width: 768px) {
      	body {
      		min-height:640px;
      	}
      	.login-content {
      		margin-top: 20%; 
      	}
      }
    
    .register-content {
      margin-bottom: 50px;
    }
    .login-register {
      font-size: 30px;
      color: #ffffff;
      text-align: center;
    }
    .input-btn {
      font-size: 20px;
      color: #ffffff;
      background-color: #00b685; }

    .form-horizontal .login-icon {
      padding-top: 0px;
    }
    .login-icon {
      padding-right: 0;
    }
    .login-icon>span {
      font-size: 16px;
      color:#ffffff;
      line-height: 34px;
    }
    .inputContent>input {
      width: 100%;
    }
    @media (max-width: 480px ) {
      .inputContent>input {
        width: 100%;
      }
    }
    .footer {position:absolute;width:100%;bottom:10px;}
    .login-footer {
      text-align: center;
      font-size: 16px;
      color: #eeeeee;
      padding-top:20px;
      margin-bottom: 10px;
    }
  </style>
</#macro>

<#macro jsimport>
	<script src="${base}/js/cms/home/resetPwd.js"></script>
	<script src="${base}/js/cms/jquery.md5/jquery.md5.js"></script>
	<script>
		ResetPwd.initPage();
	</script>
</#macro>
<#macro htmlbody>
	<div class="container" id="resetBody">
            <div class="row">
              <div class="col-xs-12 col-sm-12 login-content">
                <div class="row">
                  <div class="col-xs-12 col-sm-2"></div>
                  <div class="col-xs-12 col-sm-6">
                    <form class="form-horizontal register-content">
                      <div class="form-group">
                        <div class="col-sm-12 col-sm-offset-2 col-xs-12">
                          <div class="login-register">设置密码</div>
                        </div>
                      </div>
                      <#if res.success==true>
                 <input type="hidden" id="canResetPwd" value="${res.success?c}"></input>
                <input type="hidden" id="flag" value="${res.flag}"></input>
                      <div class="form-group">
                        <label for="loginPass" class="col-sm-4 control-label login-icon"><span>新密码:</span></label>
                        <div class="col-sm-8 inputContent">
                          <input type="password" class="form-control" id="loginPass" placeholder="请输入至少六位新密码" autocomplete="off">
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="confirmPass" class="col-sm-4 control-label login-icon"><span>确认密码:</span></label>
                        <div class="col-sm-8   inputContent">
                          <input type="password" class="form-control" id="confirmPass" placeholder="请再次输入密码" autocomplete="off">
                        </div>
                      </div>

                      <div class="form-group">
                        <div class="col-sm-4 col-xs-6 pull-right">
                          <a href="javascript:history.go(-1)" class="btn btn-block input-btn">返回</a>
                        </div>
                        <div class="col-sm-4 col-xs-6 pull-right">
                          <button type="submit" class="btn btn-block input-btn" id="resetPwd-confirm">确定</button>
                        </div>
                      </div>
                      <#else>
                      	<a href="${base}/h/login.action" class="btn btn-lg btn-success btn-block" id="signIn_button">链接已经过期,点击返回登陆</a>
                      	</#if>
                    </form>
                  </div>
                  <div class="col-xs-12 col-sm-3"></div>
                </div>
              </div>
            </div>
          </div>
        <div class="footer">
      <div class="footer-placeholder"></div>
      <div class="login-footer">©2005-2016 玄谷信息技术南京有限公司</div>
    </div>
</#macro>

<#include "${res.template.main}">