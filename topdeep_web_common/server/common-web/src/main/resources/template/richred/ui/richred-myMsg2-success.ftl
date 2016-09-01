<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        我的消息
    </div>
    <div class="hr">
        <!--<div class="sub-check" id="selectAll">-->
            <!--<i class="icon-checkbox"></i>-->
        <!--</div>-->
        <a href="#">全选</a>
    </div>
</header>
<ul class="sub-list1 shadow-bottom sub-margin-d">
    <li>
        <span>全部消息</span>
            <span class="sub-r">
                <i class="icon-down"></i>
            </span>
    </li>
</ul>
<ul class="sub-list2 shadow-bottom">
    <a href="javascript:;">
        <li>
            <div class="fund-type">交易</div>
            <div class="msg">
                <div class="msg-detail">您已成功购入诺安天天宝，确认份额</div>
                <div class="sub-date">2016-11-11 11:11</div>
            </div>
            <div class="sub-check">
                <i class="icon-checkbox"></i>
            </div>
        </li>
    </a>
    <a href="javascript:;">
        <li>
            <div class="fund-type bg-yellow">系统</div>
            <div class="msg">
                <div class="msg-detail">您已成功购入诺安天天宝，确认份额确认份额确认份额确认份额</div>
                <div class="sub-date">2016-11-11 11:11</div>
            </div>
            <div class="sub-check">
                <i class="icon-checkbox"></i>
            </div>
        </li>
    </a>
    <a href="javascript:;">
        <li>
            <div class="fund-type">活动</div>
            <div class="msg">
                <div class="msg-detail">您已成功购入诺安天天宝，确认份额确认份额确认份额确认份额</div>
                <div class="sub-date">2016-11-11 11:11</div>
            </div>
            <div class="sub-check">
                <i class="icon-checkbox"></i>
            </div>
        </li>
    </a>
</ul>
<div class="sub-btn sub-placeholder1">
    <a href="javascript:;" class="sub-btn1">删除</a>
</div>
</#macro>
<#include "../common/main.ftl">