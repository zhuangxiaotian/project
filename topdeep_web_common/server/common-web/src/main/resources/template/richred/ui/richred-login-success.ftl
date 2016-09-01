<#macro jsimport>
<script>
$(document).ready(function(){
	$("#test").click(function(){
        showDialog("user","请输入账号","确定");
    })
})
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
            登录
        </div>
        <div class="hr">
            &nbsp;
        </div>
    </header>
    <ul class="sub-form">
        <li class="login-list">
            <label>证件类型</label>
            <div class="form-control sub-select">
                <em class="select-detail">
                    身份证/手机号
                </em>
                    <span>
                        <i class="icon-down"></i>
                    </span>
                <ul class="select-list" style="display: none">
                    <li>
                        <a href="javascript:;">
                            身份证
                        </a>
                    </li>
                    <li>
                        <a href="javascript:;" >
                            毕业证
                        </a>
                    </li>
                    <li>
                        <a href="javascript:;">
                            各种证
                        </a>
                    </li>
                </ul>
            </div>
        </li>
        <li class="login-list">
            <label>号<i class="text-placeholder">号码</i>码</label>
            <div class="sub-input">
                <input type="password" placeholder="请输入您的身份证号" />
            </div>
        </li>
        <li class="login-list">
            <label>密<i class="text-placeholder">号码</i>码</label>
            <div class="sub-input">
                <input type="password" placeholder="请输入密码" />
            </div>
        </li>
    </ul>
    <div class="sub-tip">
        <a href="javascript:;" class="lost-pwd">忘记密码？</a>
    </div>
    <div class="sub-btn">
        <a href="javascript:;" class="sub-btn-l" id="test">立即登录</a>
        <a href="javascript:;" class="sub-btn-r">免费注册</a>
    </div>
    <div class="sub-tip">
        <a href="javascript:;" class="gift-tip">
            <i></i>
            注册可得新手礼包
        </a>
    </div>
</div>
<div class="warm-tips">
	<div class="font-light"><i class="icon-yellow"></i><strong>温馨提示：</strong>通过银行/券商/代销机构购买诺安基金产品的客户，可通过查询密码登录，初始查询密码为身份证号后六位。</div>
</div>
</#macro>
<#include "../common/main.ftl">