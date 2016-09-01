<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:;">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        绑定基金账户
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
        <div class="fail-tip">夏沫，经检测您已是诺安基金的直销用户，直接输入诺安网上交易密码即可完成账户认证。</div>
    </div>
</div>
<ul class="sub-form">
    <li class="login-list">
        <label>交易密码</label>
        <div class="sub-input">
            <input type="password" placeholder="请输入您在诺安直销的交易密码" />
        </div>
    </li>
</ul>
<div class="sub-tip">
    <a href="javascript:;" class="lost-pwd">忘记密码？</a>
</div>
<div class="sub-btn sub-padding">
    <a href="javascript:;" class="sub-btn1">立即认证</a>
</div>
</#macro>
<#include "../common/main.ftl">