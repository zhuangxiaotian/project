<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        修改密码
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<ul class="sub-form">
    <li>
        <label>原密码</label>
        <div class="sub-input">
            <input type="password" placeholder="请输入原密码" />
        </div>
    </li>
</ul>
<div class="sub-tip sub-placeholder">
    <a href="javascript:;" class="lost-pwd">忘记密码?</a>
</div>
<div class="sub-tip">
    <i class="icon-password"></i><span> 设置新密码</span>
</div>
<ul class="sub-form">
    <li>
        <label>新密码</label>
        <div class="sub-input">
            <input type="password" placeholder="请设置6位新密码" />
        </div>
    </li>

    <li>
        <label>新密码</label>
        <div class="sub-input">
            <input type="password" placeholder="请再次输入6位新密码" />
        </div>
    </li>
</ul>
<div class="sub-btn">
    <a href="javascript:;" class="sub-btn1">确定</a>
</div>
</#macro>
<#include "../common/main.ftl">