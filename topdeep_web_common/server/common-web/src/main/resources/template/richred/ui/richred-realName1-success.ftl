<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        实名认证
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<div class="sub-tip">
    <div class="tip-detail">
        <i class="icon-yellow"></i>根据中国证监会规定，只有经过实名认证的客户才可以进行基金交易，请您按页面提示进行实名认证。
    </div>
</div>
<ul class="sub-form">
    <li class="login-list">
        <label>姓<i class="text-placeholder">姓名</i>名</label>
        <div class="sub-input">
            <input type="text" placeholder="请输入您的真实姓名" />
        </div>
    </li>
    <li class="login-list">
        <label>身份证号</label>
        <div class="sub-input">
            <input type="text" placeholder="请输入您的身份证号码" />
        </div>
    </li>
</ul>
<div class="sub-btn sub-placeholder1">
    <a href="${base}/ui/richred.action?type=realName2" class="sub-btn1">下一步</a>
</div>
</#macro>
<#include "../common/main.ftl">