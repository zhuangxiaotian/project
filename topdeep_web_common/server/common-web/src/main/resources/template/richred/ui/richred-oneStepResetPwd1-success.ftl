<#macro jsimport>
<script>
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
        找回密码
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<ul class="sub-form">
    <li>
        <label>手机号</label>
        <div class="sub-input">
            <input type="text" placeholder="请输入您的手机号码" />
        </div>
    </li>
    <li>
        <label>验证码</label>
        <div class="sub-input">
            <input type="password" placeholder="请输入6位短信验证码" />
            <input type="text" value="获取" readonly="readonly" class="sub-yzm" onclick="settime(this)"/>
        </div>
    </li>
</ul>
<div class="sub-btn sub-placeholder1">
    <a href="${base}/ui/richred.action?type=oneStepResetPwd2" class="sub-btn1">下一步</a>
</div>
</#macro>
<#include "../common/main.ftl">