<#macro jsimport>
    <script type="text/javascript">
    var countdown=60;
    function settime(val) {
        if (countdown == 0) {
            val.value="获取";
            countdown = 60;
        } else {
            val.setAttribute("disabled", true);
            val.style.backgroundColor="#a9a9a9";
            val.value=countdown+"秒";
            countdown--;
        }
        setTimeout(function() {
            settime(val)
        },1000)
    }
    </script>
</#macro>
<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:;">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        绑定新手机号
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<div class="bind-phone">
    <img src="${base}/static/skin/${res.skin}/images/icon_success.png" alt="成功"/>
    <div class="fail-tip">检测您的密码过于简单！</div>
    <div class="fail-tip">为了您的账户安全，请重置密码！</div>
    <div class="fail-tip">输入密码后，手机变更生效</div>
</div>
<ul class="sub-form">
    <li>
        <label>手机号码</label>
        <div class="sub-input">
            <input type="text" placeholder="请输入您的手机号码" />
        </div>
    </li>

    <li>
        <label>验<i class="text-placeholder">a</i>证<i class="text-placeholder">c</i>码</label>
        <div class="sub-input">
            <input type="password" placeholder="请输入6位短信验证码" />
            <input type="text" value="获取" readonly="readonly" class="sub-yzm" onclick="settime(this)"/>
        </div>
    </li>
</ul>
<div class="sub-btn sub-placeholder1">
    <a href="javascript:;" class="sub-btn1">确认绑定手机和新密码</a>
</div>
</#macro>
<#include "../common/main.ftl">