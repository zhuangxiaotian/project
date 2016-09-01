<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        实名认证失败
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<div class="bind-phone">
    <img src="${base}/static/skin/${res.skin}/images/icon_fail.png" alt="失败"/>
    <div class="fail-tip">您的实名认证失败！</div>
    <div class="fail-tip">
        失败原因：<span class="fontsize-16">返回银行错误提示</span>
    </div>
</div>
<div class="sub-btn">
    <a href="javascript:;" class="sub-btn1">换一张银行卡重新认证</a>
</div>
</#macro>
<#include "../common/main.ftl">