<#macro htmlbody>
<div id="box">
    <header class="header">
        <div class="hl">
            <a href="javascript:history.go(-1);">
                <i class="icon-left"></i>
            </a>
        </div>
        <div class="title">
            确认赎回
        </div>
        <div class="hr">
            &nbsp;
        </div>
    </header>
    <ul class="sub-form">
        <li class="login-list">
            <label class="investment-title">基金名称：</label>
            <div class="sub-input">
                <span class="fund-discount">诺安成长混合</span>
            </div>
        </li>
        <li class="login-list">
            <label class="investment-title">赎回账户：</label>
            <div class="sub-input">
              <span class="fund-discount">
                <i class="bank-b002"></i>
                <span>工商银行<em>0335</em></span>
              </span>
            </div>
        </li>
        <li class="login-list">
            <label class="investment-title">赎回到：</label>
            <div class="sub-input">
              <span class="fund-discount">
                <i class="icon-cash"></i>
                <span>现金宝</span>
              </span>
            </div>
        </li>
        <li class="login-list">
            <label class="investment-title">赎回份额：</label>
            <div class="sub-input">
                <span class="fund-discount"><em class="red">9999.00</em>份</span>
            </div>
        </li>
        <li class="login-list">
            <label>交易密码</label>
            <div class="sub-input">
                <input type="password" placeholder="请输入交易密码">
            </div>
        </li>
    </ul>
    <div class="sub-btn">
        <a href="${base}/ui/richred.action?type=fundPurchase3" class="sub-btn1 sub-placeholder">确认</a>
    </div>
</div>
<div class="warm-tips">
    <div class="font-light"><i class="icon-yellow"></i><strong>温馨提示：</strong>为了保障您的资金安全，资金遵循同卡进出原则，从哪张银行卡存入的资金，取现也将回到该卡中。</div>
</div>
</#macro>
<#include "../common/main.ftl">