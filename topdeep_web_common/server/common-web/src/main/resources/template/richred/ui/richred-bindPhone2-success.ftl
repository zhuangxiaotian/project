<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:;">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        绑定新手机号
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<div class="bind-phone">
    <img src="${base}/static/skin/${res.skin}/images/icon_success.png" alt="成功"/>
    <div class="sub-padding">实名认证已通过，请绑定新手机号！</div>
    <div class="bind-tip">您在银行的预留手机号为：</div>
    <div class="bind-number">13688886666</div>
    <div class="bind-tip">是否使用该手机号作为您的绑定手机号？</div>
</div>
<div class="sub-btn">
    <a href="javascript:;" class="sub-btn1">绑定该手机</a>
</div>
<div class="sub-btn sub-placeholder1">
    <a href="javascript:;" class="sub-btn1 bg-orange">绑定其他手机</a>
</div>
</#macro>
<#include "../common/main.ftl">