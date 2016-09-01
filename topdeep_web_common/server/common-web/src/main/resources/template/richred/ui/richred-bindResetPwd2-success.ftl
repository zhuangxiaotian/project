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
        银行卡验证身份
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<ul class="sub-form">
    <li class="list-s">
        <label class="investment-title">持<i class="text-placeholder">a</i>卡<i class="text-placeholder">b</i>人：</label>
        <div class="sub-input">
            <span>小明</span>
        </div>
    </li>
    <li class="list-s">
        <label class="investment-title">身份证号：</label>
        <div class="sub-input">
            <span>3404********0526</span>
        </div>
    </li>
</ul>
<ul class="sub-form">
    <li class="login-list">
        <label>验证银行</label>
        <div class="sub-input">
            <a href="${base}/ui/richred.action?type=bankSelect">
                <em class="select-detail">
                    <i class="bank-b004"></i>中国银行(尾号<em>0335</em>)
                </em>
                    <span class="sub-r">
                        <i class="icon-right-red"></i>
                    </span>
            </a>
        </div>
    </li>
    <li class="login-list">
        <label>银行卡号</label>
        <div class="sub-input">
            <input type="password" placeholder="请输入您绑定的银行卡号" />
        </div>
    </li>
    <li class="login-list">
        <label>手<i class="text-placeholder">a</i>机<i class="text-placeholder">c</i>号</label>
        <div class="sub-input">
            <input type="password" placeholder="请输入在银行预留的手机号码" />
        </div>
    </li>
    <li class="login-list">
        <label>验<i class="text-placeholder">a</i>证<i class="text-placeholder">c</i>码</label>
        <div class="sub-input">
            <input type="password" placeholder="请输入6位短信验证码" />
            <input type="text" value="获取" readonly="readonly" class="sub-yzm" onclick="settime(this)"/>
        </div>
    </li>
</ul>
<div class="sub-btn sub-placeholder1 sub-padding">
    <a href="${base}/ui/richred.action?type=oneStepResetPwd3" class="sub-btn1">下一步</a>
</div>
</#macro>
<#include "../common/main.ftl">