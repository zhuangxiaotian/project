<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        购买
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<div class="fund-name">诺安成长混合(000818)</div>
<ul class="sub-form">
    <li class="login-list">
        <label>资金来源</label>
        <div class="sub-input">
            <a href="javascript:;">
                <i class="icon-cebb"></i>
                <span>光大银行<em>0335</em></span>
                <span class="fund-discount red">4折</span>
                <i class="icon-right-red sub-float"></i>
            </a>
        </div>
    </li>
    <li class="login-list">
        <label>购买金额</label>
        <div class="sub-input">
            <input type="text" placeholder="≥10元">
        </div>
    </li>
    <li class="login-list">
        <div class="sub-input">
            <a  href="javascript:;">
                  <span class="sub-check">
                    <i class="icon-checkbox"></i>
                    使用代金券/红包
                  </span>

                <span class="fund-discount red">立减10元</span>
                <i class="icon-right-red sub-float"></i>
            </a>
        </div>
    </li>
    <li class="login-list">
        <div class="sub-input">
            <span>实际需支付：</span>
            <span class="red sub-r">10000.00元</span>
        </div>
    </li>
</ul>
<div class="sub-btn">
    <a href="${base}/ui/richred.action?type=fundPurchase2" class="sub-btn1 sub-placeholder">下一步</a>
</div>
<div class="warm-tips">
    <div class="font-light"><i class="icon-yellow"></i><strong>温馨提示：</strong>为了保障您的资金安全，资金遵循同卡进出原则，从哪张银行卡存入的资金，取现也将回到该卡中。</div>
</div>
</#macro>
<#include "../common/main.ftl">