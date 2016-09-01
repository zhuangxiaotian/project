<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        赎回
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<div class="fund-name">诺安成长混合(000818)</div>
<ul class="sub-form">
    <li class="login-list">
        <label class="investment-title">赎回到</label>
        <div class="sub-input">
            <a href="${base}/ui/richred.action?type=fundRedeemTo">
                <span class="redeem-cash sub-l">
                    <i class="icon-cash"></i>
                </span>
                <span class="redeem-cash sub-l">
                  <div class="">现金宝</div>
                  <div class="tip-sm">赎回基金T+1日资金到现金宝</div>
                </span>
                <i class="icon-right-red sub-float"></i>
            </a>
        </div>
    </li>
    <li class="login-list">
        <label >赎回账户</label >
        <div class="sub-input">
            <a href="${base}/ui/richred.action?type=bankSelect">
                <i class="bank-b002"></i>
                <span>工商银行<em>0335</em></span>
                <i class="icon-right-red sub-float"></i>
            </a>
        </div>
    </li>

    <li class="login-list">
        <label>赎回份额</label>
        <div class="sub-input">
            <input type="text" placeholder="最多可赎回400.00份"/>
            <input type="text" readonly="readonly" value="全部赎回"  class="sub-redeem"/>
        </div>
    </li>
</ul>
<div class="sub-btn">
    <a href="${base}/ui/richred.action?type=fundRedeem2" class="sub-btn1 sub-placeholder">下一步</a>
</div>
<div class="warm-tips location-rel">
    <div class="font-light"><i class="icon-yellow"></i><strong>温馨提示：</strong>为了保障您的资金安全，资金遵循同卡进出原则，从哪张银行卡存入的资金，取现也将回到该卡中。</div>
</div>
        <!--confirm-->
<div class="dialog">
    <div class="cover"></div>
    <div class="dialog-content">
        <div class="dialog-style">
            <a href="javascript:;" class="dialog-close" ><i></i></a>
        </div>
        <div class="dialog-input"><input type="password" placeholder="请输入密码"/></div>
        <div class="sub-btn dialog-btn sub-placeholder1">
            <a href="javascript:;" class="sub-btn-l bg-yellow">取消</a>
            <a href="javascript:;" class="sub-btn-r">确定</a>
        </div>
    </div>
</div>
</#macro>
<#include "../common/main.ftl">