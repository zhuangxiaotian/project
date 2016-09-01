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
        免费升级
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<div class="sub-tip">
    <div class="gift-tip1 sub-padding">
        升级账户，需进行实名认证
    </div>
</div>
<ul class="sub-form">
    <li>
        <label>选择银行</label>
        <div class="form-control sub-select">
            <em class="select-detail">
                <i class="bank-b004"></i>中国银行
            </em>
                <span>
                    <i class="icon-down"></i>
                </span>
            <ul class="select-list" style="display: none">
                <li>
                    <a href="javascript:;">
                        <i class="bank-b004"></i>中国银行
                    </a>
                </li>
                <li>
                    <a href="javascript:;">
                        <i class="bank-b002"></i>工商银行
                    </a>
                </li>
            </ul>
        </div>
    </li>
    <li>
        <label>银行卡号</label>
        <div class="sub-input">
            <input type="password" placeholder="请输入卡号" />
        </div>
    </li>
    <li>
        <label>预留手机</label>
        <div class="sub-input">
            <input type="password" placeholder="请输入在银行预留的手机号码" />
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
<div class="agree-content clearfix">
    <a href="javascript:;" class="lost-yzm sub-r">收不到验证码？</a>
</div>
<div class="sub-check sub-check1">
    <i class="icon-checkbox"></i>
    <span>我已阅读并同意</span><a href="javascript:;" class="orange">《诺安基金网上交易协议》</a>
</div>
<div class="sub-btn sub-padding">
    <a href="javascript:;" class="sub-btn1">下一步</a>
</div>
</#macro>
<#include "../common/main.ftl">