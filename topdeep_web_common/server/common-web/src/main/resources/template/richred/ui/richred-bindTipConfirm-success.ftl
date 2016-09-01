<#macro jsimport>
<script type="text/javascript">
$("#test").click(function(){
    showConfirm("Hi，您好！您尚未绑定手机号，绑定手机可以<span class=\"red\">提升账户安全</span>哦","暂不绑定","立即绑定","service");
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
    <a href="javascript:;" id="test" class="sub-btn1 sub-placeholder">下一步</a>
</div>
<div class="warm-tips location-rel">
    <div class="font-light"><i class="icon-yellow"></i><strong>温馨提示：</strong>为了保障您的资金安全，资金遵循同卡进出原则，从哪张银行卡存入的资金，取现也将回到该卡中。</div>
</div>
</#macro>
<#include "../common/main.ftl">