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
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        绑定手机
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<div class="update">
    <div class="update-iphone">
        <img class="iphone" src="${base}/static/skin/${res.skin}/images/icon_iphone.png" alt="安全"/>
    </div>
    <div class="update-tip" >
        为了您的账户安全，<br/>请绑定您的手机号。
    </div>
</div>
<ul class="sub-form">
    <li>
        <label>手机号码</label>
        <div class="sub-input">
            <input type="text" placeholder="请输入您的手机号码" />
        </div>
    </li>

    <li>
        <label>验<i class="text-placeholder">a</i>证<i class="text-placeholder">b</i>码</label>
        <div class="sub-input">
            <input type="password" placeholder="请输入6位短信验证码" />
            <input type="text" value="获取" readonly="readonly" class="sub-yzm" onclick="settime(this)"/>
        </div>
    </li>
</ul>
<div class="sub-btn sub-placeholder1">
    <a href="javascript:;" class="sub-btn1">立即绑定</a>
</div>
</#macro>
<#include "../common/main.ftl">