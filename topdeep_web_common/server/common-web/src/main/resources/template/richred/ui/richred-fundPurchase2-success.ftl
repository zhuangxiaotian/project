<#macro htmlbody>
<div id="box">
    <header class="header">
        <div class="hl">
            <a href="javascript:history.go(-1);">
                <i class="icon-left"></i>
            </a>
        </div>
        <div class="title">
            确认购买
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
            <label class="investment-title">资金来源：</label>
            <div class="sub-input">
              <span class="fund-discount">
                <i class="bank-b002"></i>
                <span>工商银行<em>0335</em></span>
              </span>
            </div>
        </li>
        <li class="login-list">
            <label class="investment-title">购买金额：</label>
            <div class="sub-input">
                <span class="fund-discount red">9999.00元</span>
            </div>
        </li>
        <li class="login-list">
            <div class="sub-input">红包抵扣<em class="red">10元</em>＋实际支付<em class="red">1,111,000.00元</em></div>
        </li>
        <li class="login-list">
            <label>交易密码</label>
            <div class="sub-input">
                <input type="password" placeholder="请输入交易密码">
            </div>
        </li>
    </ul>
    <div class="sub-tip">
          <span class="font-light sub-check sub-check1">
           <i class="icon-checkbox"></i>
           您要购买的产品风险等级超出您当前的承受能力（保守型），如确认交易视为您同意本次交易
          </span>
    </div>
    <div class="sub-tip">
        <a href="javascript:;" class="red lost-pwd">重新测评</a>
    </div>
    <div class="sub-btn">
        <a href="${base}/ui/richred.action?type=fundPurchase3" class="sub-btn1 sub-placeholder">确认</a>
    </div>
</div>
<div class="warm-tips">
    <div class="font-light"><i class="icon-yellow"></i><strong>温馨提示：</strong>为了保障您的资金安全，资金遵循同卡进出原则，从哪张银行卡存入的资金，取现也将回到该卡中。</div>
</div>
</#macro>
<#include "../common/main.ftl">