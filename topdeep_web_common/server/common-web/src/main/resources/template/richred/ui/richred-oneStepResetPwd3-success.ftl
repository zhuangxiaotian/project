<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        重置密码
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<div class="bind-phone">
    <img src="${base}/static/skin/${res.skin}/images/icon_success.png" alt="成功"/>
    <div class="fail-tip">身份认证已通过，请重置密码！</div>
</div>
<ul class="sub-form">
    <li>
        <label>设置密码</label>
        <div class="sub-input">
            <input type="password" placeholder="请输入6位密码" />
        </div>
    </li>

    <li>
        <label>确认密码</label>
        <div class="sub-input">
            <input type="password" placeholder="请再次输入6位密码" />
        </div>
    </li>
</ul>
<div class="sub-btn sub-padding">
    <a href="${base}/ui/richred.action?type=resetPwdSuccess" class="sub-btn1">确认</a>
</div>
</#macro>
<#include "../common/main.ftl">