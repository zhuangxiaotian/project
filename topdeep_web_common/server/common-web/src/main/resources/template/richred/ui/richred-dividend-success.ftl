<#macro jsimport>
<script>
        $(document).ready(function(){
            $(".sub-radio").click(function(){
                $(this).parent().find("i").removeClass("icon-radios");
                $(this).find(".icon-radio").addClass('icon-radios');
            })
        })
    </script>
</#macro>
<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        分红方式变更
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<ul class="sub-form margin2">
    <li class="dividend-create">
        <div>
            <i class="icon-arrow-right"></i>诺安成长混合
            <span class="fund-code">(000818)</span>
        </div>
    </li>
    <li class="bill-diy">
        <div class="diy">选择分红方式：</div>
        <div class="bill-choice">
            <div class="sub-radio">
                <i class="icon-radio icon-radios"></i>
                <span>现金分红</span>
            </div>
            <div class="sub-radio sub-placeholder">
                <i class="icon-radio"></i>
                <span>红利再投</span>
            </div>
        </div>
    </li>
</ul>
<ul class="sub-form shadow-bottom">
    <li class="login-list">
        <label>交易密码</label>
        <div class="sub-input">
            <input type="password" placeholder="请输入交易密码"/>
        </div>
    </li>
</ul>
<div class="sub-tip">
    <p class="dividend-tip">分红方式变更将从下一个工作日起生效</p>
</div>
<div class="sub-btn sub-placeholder1">
    <a href="#" class="sub-btn1">确认修改</a>
</div>
</#macro>
<#include "../common/main.ftl">