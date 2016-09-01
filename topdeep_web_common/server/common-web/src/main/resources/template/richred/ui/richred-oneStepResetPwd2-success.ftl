<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        找回密码
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<div class="bind-phone">
    <div class="fail-tip">您的手机：<em class="red">136****6666</em></div>
</div>
<ul class="sub-form">
    <li>
        <label>身份证号</label>
        <div class="sub-input">
            <input type="text" placeholder="请输入您的身份证号"/>
        </div>
    </li>
</ul>
<div class="sub-btn sub-placeholder1">
    <a href="${base}/ui/richred.action?type=oneStepResetPwd3" class="sub-btn1">下一步</a>
</div>
</#macro>
<#include "../common/main.ftl">