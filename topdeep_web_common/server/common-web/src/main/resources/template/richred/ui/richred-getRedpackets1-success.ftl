<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">评价领红包</div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<div class="trade-comment">
    <p>评价交易流程</p>
        <span class="trade-star">
            <a href="javascript:;"><i class="icon-star"></i></a>
            <a href="javascript:;"><i class="icon-star"></i></a>
            <a href="javascript:;"><i class="icon-star"></i></a>
            <a href="javascript:;"><i class="icon-star"></i></a>
            <a href="javascript:;"><i class="icon-star"></i></a>
        </span>
    <textarea name="" id="" cols="" rows="" placeholder="欢迎向我们提出您的意见和建议，我们会认真采纳！"></textarea>
</div>
<div class="group-btn sub-placeholder1">
    <div class="sub-btn">
        <a href="javascript:;" class="sub-btn-l bg-yellow">返回</a>
        <a href="${base}/ui/richred.action?type=getRedpackets2" class="sub-btn-r">提交</a>
    </div>
</div>
</#macro>
<#include "../common/main.ftl">