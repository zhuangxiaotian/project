<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:;">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        账户认证成功
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<div class="bind-phone">
    <img src="${base}/static/skin/${res.skin}/images/icon_success.png" alt="成功"/>
    <div class="fail-tip">夏沫，您已成功绑定基金账户！</div>
    <div class="fail-tip">您的交易密码将作为今后唯一的密码，</div>
    <div class="fail-tip">用于登录及交易确认，请牢记！</div>
</div>
<div class="sub-btn sub-padding">
    <a href="javascript:;" class="sub-btn1">开始交易</a>
</div>
</#macro>
<#include "../common/main.ftl">