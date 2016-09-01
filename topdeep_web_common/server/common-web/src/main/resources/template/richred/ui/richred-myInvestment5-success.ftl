<#macro htmlbody>
<div id="box">
    <header class="header">
        <div class="hl">
            <a href="javascript:history.go(-1);">
                <i class="icon-left"></i>
            </a>
        </div>
        <div class="title">
            定投明细（暂停）
        </div>
        <div class="hr">
            &nbsp;
        </div>
    </header>
    <ul class="sub-form">
        <li class="login-list">
            <label class="investment-title">基金名称：</label>
            <div class="sub-input">
                <span class="fund-discount">诺安成长混合(000818)</span>
            </div>
        </li>
        <li class="login-list">
            <label class="investment-title">资金来源：</label>
            <div class="sub-box">
                <div class="sub-input">
                    <div class="fund-discount">
                        <i class="icon-cebb"></i>
                        <span>光大银行</span>
                    </div>
                    <br>
                    <div class="bank-tip fund-discount">单笔10万，单日20万</div>
                </div>

            </div>
        </li>
        <li class="login-list">
            <label class="investment-title">定投周期：</label>
            <div class="sub-input">
                <span class="fund-discount">每月15日</span>
            </div>
        </li>
        <li class="login-list">
            <label class="investment-title">定投金额：</label>
            <div class="sub-input">
                <span class="fund-discount">1000.00</span>
            </div>
        </li>
    </ul>
</div>
    <div class="group-btn sub-placeholder1">
        <div class="sub-btn">
            <a href="javascript:;" class="sub-btn2">终止</a>
        </div>
        <div class="sub-btn">
            <a href="javascript:;" class="sub-btn2">恢复</a>
        </div>
        <div class="sub-btn">
            <a href="${base}/ui/richred.action?type=myInvestment4" class="sub-btn2 bg-yellow">修改</a>
        </div>
    </div>
</#macro>
<#include "../common/main.ftl">