<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        解绑银行卡
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<ul class="sub-list1 sub-margin-d shadow-bottom">
    <li>
        <div class="red sub-padding center">解绑该银行卡后，将无法通过该卡进行交易</div>
        <div class="bank-unbind sub-padding">
                <i class="bank-b002"></i>
                工商银行<em class="tip-sm">(尾号0335)</em>
        </div>
    </li>
</ul>
<ul class="sub-form shadow-bottom">
    <li>
        <label>输入密码</label>
        <div class="sub-input">
            <input type="password" placeholder="请输入您的交易密码" />
        </div>
    </li>
</ul>
<div class="group-btn sub-placeholder1">
    <div class="sub-btn">
        <a href="javascript:;" class="sub-btn1">确认</a>
    </div>
</div>
</#macro>
<#include "../common/main.ftl">