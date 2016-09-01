<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:;">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        设置交易密码
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<div class="bind-phone">
    <img src="${base}/static/skin/${res.skin}/images/icon_success.png" alt="成功"/>
    <div class="fail-tip">您已通过实名认证，请设置交易密码！</div>
    <div class="fail-tip">交易密码用于登录、交易操作，请牢记！</div>
</div>
<ul class="sub-form">
    <li>
        <label>设置密码</label>
        <div class="sub-input">
            <input type="password" placeholder="请设置6位数字密码" />
        </div>
    </li>

    <li>
        <label>确认密码</label>
        <div class="sub-input">
            <input type="password" placeholder="请再次输入6位数字密码" />
        </div>
    </li>
</ul>
<div class="sub-btn sub-placeholder1">
    <a href="javascript:;" class="sub-btn1">确认</a>
</div>
</#macro>
<#include "../common/main.ftl">