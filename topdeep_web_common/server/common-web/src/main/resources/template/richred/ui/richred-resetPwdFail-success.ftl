<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        身份验证失败
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<div class="bind-phone">
    <img src="${base}/static/skin/${res.skin}/images/icon_fail.png" alt="成功"/>
    <div class="fail-tip">您的身份验证失败！</div>
    <div class="fail-tip">
        失败原因：<span>返回银行错误提示</span>
    </div>
</div>
<div class="sub-btn">
    <a href="javascript:;" class="sub-btn1">返回重新认证</a>
</div>
</#macro>
<#include "../common/main.ftl">