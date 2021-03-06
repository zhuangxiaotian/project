<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        实名认证成功
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<div class="bind-phone">
    <img src="${base}/static/skin/${res.skin}/images/icon_success.png" alt="成功"/>
    <div class="fail-tip"><span>夏沫</span>，您已通过实名认证！</div>
    <div class="fail-tip">可以进行基金交易啦！</div>
</div>
<div class="sub-btn sub-placeholder1">
    <a href="javascript:;" class="sub-btn1">开始交易</a>
</div>
</#macro>
<#include "../common/main.ftl">