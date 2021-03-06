<#macro htmlbody>
<header class="header">
<div class="hl">
    <a href="javascript:history.go(-1);">
        <i class="icon-left"></i>
    </a>
</div>
<div class="title">充值结果</div>
<div class="hr">
    <a href="javascript:;">完成</a>
</div>
</div>
</header>
<div class="fund-state">
    <div class="fund-step">
        <img src="${base}/static/skin/${res.skin}/images/icon_state2.png" alt="step2"/>
    </div>
    <div class="state-tip">
        <div class="state1">
            <div class="">成功充值1000.00元</div>
            <div class="">所属交易日：11月11日</div>
        </div>
        <div class="state2">
            <div class="red">11月12日</div>
            <div class="font-color">开始计算收益</div>
        </div>
        <div class="state3">
            <div class="">11月13日</div>
            <div class="">收益到账</div>
        </div>
    </div>
</div>
</#macro>
<#include "../common/main.ftl">