<#macro htmlbody>
<div id="box">
    <header class="header">
        <div class="hl">
            <a href="javascript:history.go(-1);">
                <i class="icon-left"></i>
            </a>
        </div>
        <div class="title">
            设置密码
        </div>
        <div class="hr">
            &nbsp;
        </div>
    </header>
    <div class="sub-step">
        <img  src="${base}/static/skin/${res.skin}/images/icon_step22.png" alt="第2步"/>
    </div>
    <ul class="sub-form">
        <li class="login-list">
            <label>设置密码</label>
            <div class="sub-input">
                <input type="password" placeholder="请设置6位数密码" />
            </div>
        </li>
        <li class="login-list">
            <label>确认密码</label>
            <div class="sub-input">
                <input type="password" placeholder="请再次输入6位数字密码" />
            </div>
        </li>
    </ul>
    <div class="sub-btn sub-placeholder1">
        <a href="${base}/ui/richred.action?type=simpleRegister3" class="sub-btn1">下一步</a>
    </div>
</div>
</#macro>
<#include "../common/main.ftl">