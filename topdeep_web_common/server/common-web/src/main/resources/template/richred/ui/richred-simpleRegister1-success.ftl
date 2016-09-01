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
<div id="box">
    <header class="header">
        <div class="hl">
            <a href="javascript:history.go(-1);">
                <i class="icon-left"></i>
            </a>
        </div>
        <div class="title">
            注册
        </div>
        <div class="hr">
            &nbsp;
        </div>
    </header>
    <div class="sub-step">
        <img  src="${base}/static/skin/${res.skin}/images/icon_step11.png" alt="第1步"/>
    </div>
    <ul class="sub-form">
        <li class="login-list">
            <label>姓<i class="text-placeholder">一</i>名</label>
            <div class="sub-input">
                <input type="password" placeholder="请输入您的真实姓名" />
            </div>
        </li>
        <li class="login-list">
            <label>号<i class="text-placeholder">二</i>码</label>
            <div class="sub-input">
                <input type="password" placeholder="请输入您的手机号" />
            </div>
        </li>
        <li class="login-list">
            <label>验证码</label>
            <div class="sub-input">
                <input type="password" placeholder="请输入6位短信验证码" />
                <input type="text" value="获取" readonly="readonly" class="sub-yzm" onclick="settime(this)"/>
            </div>
        </li>
    </ul>
    <div class="sub-check sub-check1">
        <i class="icon-checkbox"></i>
        <span>我已经阅读并同意：</span><a href="javascript:;" class="orange">《诺安基金注册协议》</a>
    </div>
    <div class="sub-btn sub-placeholder1">
        <a href="${base}/ui/richred.action?type=simpleRegister2" class="sub-btn1">下一步</a>
    </div>
    <div class="sub-tip center">
    	<i class="icon-hongbao"></i>新手注册获得新手现金红包
	</div>
</div>
<div class="warm-tips">
    <div><i class="icon-yellow"></i><strong>安全提示：</strong>诺安基金不会在任何地方泄露您的手机号码。</div>	
</div>
</#macro>
<#include "../common/main.ftl">