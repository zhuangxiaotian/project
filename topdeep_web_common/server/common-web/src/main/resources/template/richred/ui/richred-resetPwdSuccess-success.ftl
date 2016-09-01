<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        密码重置结果
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<div class="bind-phone">
    <img src="${base}/static/skin/${res.skin}/images/icon_success.png" alt="成功"/>
    <div class="fail-tip">您的密码已重置成功，请牢记！</div>
</div>
<div class="sub-btn sub-placeholder1">
    <a href="${base}/ui/richred.action?type=login" class="sub-btn1">立即登录</a>
</div>
</#macro>
<#include "../common/main.ftl">