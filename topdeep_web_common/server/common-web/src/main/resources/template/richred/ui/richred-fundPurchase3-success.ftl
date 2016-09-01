<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">订单受理结果</div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<div class="fund-state">
    <div class="fund-step">
        <img src="${base}/static/skin/${res.skin}/images/icon_state1.png" alt="step1"/>
    </div>
    <div class="state-tip">
        <div class="state1">
            <div class="red fontsize-16">订单受理成功!</div>
            <div class="font-color">购买10000元诺安成长</div>
            <div class="font-color">所属交易日：11月11日</div>
        </div>
        <div class="state2">
            <div class="">11月12日</div>
            <div class="">确认份额，开始赚钱</div>
        </div>
        <div class="state3">
            <div class="">11月13日</div>
            <div class="">可查询盈亏</div>
        </div>
    </div>
</div>
<div class="trade-comment">
    <p>评价交易流程</p>
        <span class="trade-star">
            <a href="javascript:;"><i class="icon-stars"></i></a>
            <a href="javascript:;"><i class="icon-stars"></i></a>
            <a href="javascript:;"><i class="icon-star"></i></a>
            <a href="javascript:;"><i class="icon-star"></i></a>
            <a href="javascript:;"><i class="icon-star"></i></a>
        </span>
    <textarea name="" id="" cols="" rows="" placeholder="欢迎向我们提出您的意见和建议，我们会认真采纳！"></textarea>
</div>
<div class="group-btn sub-padding">
<div class="sub-btn">
    <a href="javascript:;" class="sub-btn-l bg-yellow">返回</a>
    <a href="javascript:;" class="sub-btn-r">提交</a>
</div>
</div>
</#macro>
<#include "../common/main.ftl">