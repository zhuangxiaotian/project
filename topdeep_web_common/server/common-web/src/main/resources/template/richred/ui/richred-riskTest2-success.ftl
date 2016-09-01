<#macro jsimport>
<script>
$(document).ready(function(){
    $(".sub-radio").click(function(){
        $(this).parent().parent().find("i").removeClass("icon-radios");
        $(this).parent().find(".icon-radio").addClass('icon-radios');
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
<ul class="sub-form shadow-bottom">
    <li class="risk-test">
        <span>1.您当前的个人及家庭财务状况属于以下哪一种：</span>
    </li>
    <li class="risk-test">
        <a href="javascript:;" class="sub-radio">
            <i class="icon-radio icon-radios"></i>
            有较大数额未到期负债
        </a>
    </li>
    <li class="risk-test">
        <a href="javascript:;" class="sub-radio">
            <i class="icon-radio"></i>
            收入和支出相抵
        </a>
    </li>
    <li class="risk-test">
        <a href="javascript:;" class="sub-radio">
            <i class="icon-radio"></i>
            有一定积蓄
        </a>
    </li>
    <li class="risk-test">
        <a href="javascript:;" class="sub-radio">
            <i class="icon-radio"></i>
            有较丰富的积蓄并有一定的投资
        </a>
    </li>
    <li class="risk-test">
        <a href="javascript:;" class="sub-radio">
            <i class="icon-radio"></i>
            比较富裕且有相当的投资
        </a>
    </li>
</ul>
<ul class="sub-form shadow-bottom">
    <li class="risk-test">
        <span>2.您当前的个人及家庭财务状况属于以下哪一种：</span>
    </li>
    <li class="risk-test">
        <a href="javascript:;" class="sub-radio">
            <i class="icon-radio icon-radios"></i>
            有较大数额未到期负债
        </a>
    </li>
    <li class="risk-test">
        <a href="javascript:;" class="sub-radio">
            <i class="icon-radio"></i>
            收入和支出相抵
        </a>
    </li>
    <li class="risk-test">
        <a href="javascript:;" class="sub-radio">
            <i class="icon-radio"></i>
            有一定积蓄
        </a>
    </li>
    <li class="risk-test">
        <a href="javascript:;" class="sub-radio">
            <i class="icon-radio"></i>
            有较丰富的积蓄并有一定的投资
        </a>
    </li>
    <li class="risk-test">
        <a href="javascript:;" class="sub-radio">
            <i class="icon-radio"></i>
            比较富裕且有相当的投资
        </a>
    </li>
</ul>
<div class="sub-btn sub-padding">
    <a href="${base}/ui/richred.action?type=riskTest3" class="sub-btn1">下一步</a>
</div>
</#macro>
<#include "../common/main.ftl">