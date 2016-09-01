<#macro htmlhead>
 <style>
    html,body {font-family:"Microsoft YaHei", "宋体", Verdana, Geneva, sans-serif;}
    body {font-size: 16px;  background: url(${base}/static/skin/cms/images/login-bg.png) no-repeat}
    .login-content {
      margin-top: 30%; }
    .input-btn {
      font-size: 20px;
      color: #ffffff;
      background-color: #00b685; }
    .form-horizontal .login-icon {
      padding-top: 0px;
    }
    .login-icon>span {
      display: inline-block;
      background-color: #ffffff;
      width: 34px;
      height: 34px;
      padding: 5px;
      -webkit-border-radius: 4px;
      -moz-border-radius: 4px;
      -ms-border-radius:4px;
      -o-border-radius:4px;
      border-radius: 4px;
    }
    .icon-user,.icon-email {
      display: inline-block;
      width: 25px;
      height:25px;
    }
    .icon-user {
      background: url("${base}/static/skin/cms/images/zw_iconlist.png") no-repeat 2px -53px;
    }
    .icon-email {
      background: url("${base}/static/skin/cms/images/zw_iconlist.png") no-repeat 2px -348px;
    }
    .inputContent {
      padding-left:0;
    }
    .lose-pwd {
      font-size: 30px;
      color: #ffffff;
      text-align: center;
    }

    .footer-placeholder {  height:50px; }
    .login-footer {
      text-align: center;
      font-size: 16px;
      color: #eeeeee;
    }

  </style>
</#macro>

<#macro jsimport>
	<script src="${base}/static/js/cms/home/forgetPwd.js"></script>
	<script src="${base}/static/js/cms/jquery.md5/jquery.md5.js"></script>
	<script>
		ForgetPwd.initPage();
	</script>
</#macro>
<#macro htmlbody>
<div class="container">
  <div class="row">
    <div class="col-xs-12 col-md-12 login-content">
      <div class="row">
        <div class="col-xs-12 col-md-4"></div>
        <div class="col-xs-12 col-md-4">
           <form class="form-horizontal" id="signInForm">
             <div class="form-group">
               <div class="col-xs-12">
                 <div class="lose-pwd"><span>找回密码</span></div>
               </div>
             </div>
             <div class="form-group">
               <label for="operatorEmail" class="col-xs-2 control-label login-icon"><span><i class="icon-email"></i></span></label>
               <div class="col-xs-10 inputContent">
                 <input type="text" class="form-control" id="operatorEmail" placeholder="请输入邮箱" autocomplete="off">
               </div>
             </div>

             <div class="form-group">
               <div class="col-xs-6">
                 <button type="submit" class="btn btn-block input-btn" id="forgetPwd-confirm">确认</button>
               </div>
               <div class="col-xs-6">
                 <a href="${base}/h/logout.action" class="btn btn-block input-btn">返回</a>
               </div>

             </div>
           </form>
        </div>
        <div class="col-xs-12 col-md-4"></div>
      </div>
    </div>
  </div>
</div>
<div class="navbar navbar-fixed-bottom">
  <div class="footer-placeholder"></div>
  <div class="login-footer">©2005-2015 玄谷信息技术南京有限公司</div>
</div>

</#macro>

<#include "${res.template.main}">