<#macro jsimport>
<script>
$(document).ready(function(){
    $(".sub-radio").click(function(){
        $(".sub-radio").find("i").removeClass("icon-radios");
        $(this).find(".icon-radio").addClass('icon-radios');
    })
})
</script>
</#macro>
<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        风险测评
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<ul class="sub-form">
    <li class="risk-test">
        <img src="${base}/static/skin/${res.skin}/images/icon_edit.png" alt="">
        <div class="risk-tip">
            <p><span>夏沫</span>，您好！</p>
            <p class="risk-tip-detail">基金交易需要先进行风险评测哦！</p>
            <div class="sub-radio sub-placeholder1">
                <i class="icon-radio icon-radios"></i>
                默认为保守型
            </div>
            <div class="sub-radio sub-placeholder1">
                <i class="icon-radio"></i>
                风险评测
            </div>
        </div>
    </li>
</ul>
<div class="sub-btn sub-placeholder1">
    <a href="${base}/ui/richred.action?type=riskTest2" class="sub-btn1">下一步</a>
</div>
</#macro>
<#include "../common/main.ftl">