<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        交易密码
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<div class="update service-help">
    <div class="update-users">
        <img src="${base}/static/skin/${res.skin}/images/icon-user.png" alt="用户"/>
    </div>
    <div class="update-tip">
        <div class="fail-tip">您正在<span>增加银行卡</span>，请输入交易密码确认。</div>
    </div>
</div>
<ul class="sub-form">
    <li>
        <label>交易密码</label>
        <div class="sub-input">
            <input type="password" placeholder="请输入交易密码"/>
        </div>
    </li>
</ul>
<div class="sub-btn">
    <a href="${base}/ui/richred.action?type=updateAccount2" class="sub-btn1">确认</a>
</div>
</#macro>
<#include "../common/main.ftl">