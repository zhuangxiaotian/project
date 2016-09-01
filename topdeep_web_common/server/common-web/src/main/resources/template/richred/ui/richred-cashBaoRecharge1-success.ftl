<#macro htmlbody>
<div id="box">
    <header class="header">
        <div class="hl">
            <a href="javascript:history.go(-1);">
                <i class="icon-left"></i>
            </a>
        </div>
        <div class="title">
            现金宝充值
        </div>
        <div class="hr">
            &nbsp;
        </div>
    </header>
    <ul class="sub-form">
        <li class="login-list">
            <label>资金来源</label>
            <div class="sub-input">
                <a href="${base}/ui/richred.action?type=fundResources">
                    <span class="redeem-cash">光大银行<em>0335</em>腾付通</span>
                    <span class="redeem-cash">
                      <i class="icon-cebb"></i>
                    </span>
                    <i class="icon-right-red sub-float"></i>
                </a>
            </div>
        </li>
        <li class="login-list">
            <label>充值金额</label>
            <div class="sub-input">
                <input type="text" placeholder="建议充值100元以上金额">
            </div>
        </li>
        <!--<li class="login-list">-->
            <!--<div class="sub-input">-->
                    <!--<a href="javascript:;">-->
                    <!--<span class="sub-check">-->
                        <!--<i class="icon-checkbox"></i>-->
                        <!--使用代金券/红包-->
                    <!--</span>-->
                    <!--<span class="fund-discount red">立减10元</span>-->
                    <!--<i class="icon-right-red sub-float"></i>-->
                <!--</a>-->
            <!--</div>-->
        <!--</li>-->
        <li class="login-list">
            <label>交易密码</label>
            <div class="sub-input">
                <input type="password" placeholder="请输入交易密码">
            </div>
        </li>
    </ul>
    <div class="sub-tip">
          <span class="sub-check font-color sub-check1">
            <i class="icon-checkbox"></i>默认您的风险等级为保守型，如确认充值视为您同意本次交易
          </span>
    </div>
    <div class="sub-tip">
        <a href="javascript:;" class="red lost-pwd">重新测评</a>
    </div>
    <div class="sub-btn">
        <a href="${base}/ui/richred.action?type=cashBaoRecharge2" class="sub-btn1 sub-placeholder">确认充值</a>
    </div>
</div>
<div class="warm-tips">
    <div class="font-light"><i class="icon-yellow"></i><strong>温馨提示：</strong>为了保障您的资金安全，资金遵循同卡进出原则，从哪张银行卡存入的资金，取现也将回到该卡中。</div>
</div>
</#macro>
<#include "../common/main.ftl">