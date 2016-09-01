<#macro jsimport>
<script>
$(document).ready(function(){
    $('.sub-choice').on('click', function(event) {
    	$(this).siblings().find(".icon-radio").removeClass('icon-radios');
        $(this).find(".icon-radio").addClass('icon-radios');
    });

})
</script>
</#macro>
<#macro htmlbody>
<div id="box">
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        现金宝取现
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<header class="header fund-pro">
    <div class="hl">&nbsp;</div>
    <div class="title">
        <span class="title-cash">现金宝余额：<em class="fontsize-l red">100,000.00</em>元</span>
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<ul class="sub-form">
    <li class="login-list">
        <label>取<i class="text-placeholder">a</i>现<i class="text-placeholder">b</i>到</label>
        <div class="sub-input">
            <a href="${base}/ui/richred.action?type=bankResources" class="clearfix">
                <i class="bank-b002"></i>
                <span>工商银行<em>0335</em></span>
                <i class="icon-right-red sub-float"></i>
            </a>
        </div>
    </li>
    <li class="login-list">
        <label>可用余额</label>
        <div class="sub-input">
           1,000,000,000.00元
        </div>
    </li>
    <li class="login-list">
        <label>取现金额</label>
        <div class="sub-input">
            <input type="text" placeholder="请输入取现金额"/>
        </div>
    </li>
    <li class="login-list">
        <!--  <label>取现方式</label>
        <div class="sub-input">
            <a href="#" class="clearfix">
                <span>快速取现</span>
                <span class="fontsize-13 red">(实时到账)</span>
                <i class="icon-right-red sub-float"></i>
            </a>
        </div>-->
        <a class="sub-choice">
            <div class="sub-radio">
                <i class="icon-radio icon-radios"></i>
                快速取现
                <div class="choice-detail">
                    <p class="sub-date">最快一分钟到账</p>
                    <p class="sub-date">当日无收益</p>
                    <p class="sub-date">单笔/单日100万</p>
                </div>
            </div>
        </a>
        <a class="sub-choice">
            <div class="sub-radio">
                <i class="icon-radio"></i>
                普通取现
                <div class="choice-detail">
                    <p class="sub-date">T+1日到账</p>
                    <p class="sub-date">当日有收益</p>
                    <p class="sub-date">单笔/单日无限额</p>
                </div>
            </div>
        </a>
    </li>
    <li class="login-list">
        <label>交易密码</label>
        <div class="sub-input">
            <input type="password" placeholder="请输入交易密码">
        </div>
    </li>
</ul>
<div class="sub-btn sub-placeholder sub-padding">
    <a href="${base}/ui/richred.action?type=cashBaoCash2" class="sub-btn1">确认取现</a>
</div>
</div>
</#macro>
<#include "../common/main.ftl">