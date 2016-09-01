<#macro jsimport>
    <script type="text/javascript">
    $("#pwdConfirm").click(function(){
        pwdConfirm("取消","确认");
    })
    $("#oneConfirm").click(function(){
        showDialog("warning"," ","确定");
    })
    $("#twoConfirm").click(function(){
        showConfirm("Hi，您好！您尚未绑定手机号，绑定手机可以<span class=\"red\">提升账户安全</span>哦","暂不绑定","立即绑定","service");
    })
    $("#loadingConfirm").click(function(){
        showLoading();
    })
    </script>
</#macro>
<#macro htmlbody>
<header class="header">
    <div class="hl">&nbsp;</div>
    <div class="title">
        弹出框
    </div>
    <div class="hr">&nbsp;</div>
</header>
<div class="sub-btn sub-placeholder1">
    <a href="javascript:;" class="sub-btn1" id="pwdConfirm">密码框</a>
</div>
<div class="sub-btn sub-placeholder1">
    <a href="javascript:;" class="sub-btn1" id="oneConfirm">一个按钮</a>
</div>
<div class="sub-btn sub-placeholder1">
    <a href="javascript:;" class="sub-btn1" id="twoConfirm">两个按钮</a>
</div>
<div class="sub-btn sub-placeholder1">
    <a href="javascript:;" class="sub-btn1" id="loadingConfirm">loading</a>
</div>
</#macro>
<#include "../common/main.ftl">