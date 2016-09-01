<#macro jsimport>
<script>
$(document).ready(function(){
	$("#test").click(function(){
        showConfirm("您的风险测评已默认为<span>保守型</span>","重新测评","确定","success");
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
<div class="bind-phone">
    <img src="${base}/static/skin/${res.skin}/images/icon_risktest.png" alt="风险测评"/>
    <p class="fail-tip">您的投资风格为：<span class="red">稳健型</span></p>
    <p class="fail-tip">推荐您购买风险等级为中等的产品</p>
</div>
<div class="sub-btn sub-placeholder1">
    <a href="javascript:;" class="sub-btn1" id="test">确定</a>
</div>
</#macro>
<#include "../common/main.ftl">