<#macro jsimport>
    <script type="text/javascript">
    $(document).ready(function(){
        $(".sub-radio").click(function(){
            $(".sub-radio").find("i").removeClass("icon-radios");
            $(this).find(".icon-radio").addClass('icon-radios');
        })
    })
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
        电子对账单
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<ul class="sub-form">
    <li>
        <label>邮箱地址</label>
        <div class="sub-input">
            <input type="password" placeholder="请输入您的电子邮箱" />
        </div>
    </li>
    <li class="bill-diy">
        <div class="diy">定制对账单</div>
        <div class="bill-choice">
            <div class="sub-radio">
                <i class="icon-radio icon-radios"></i>
                <span>月度对账单</span>
            </div>
            <div class="sub-radio">
                <i class="icon-radio"></i>
                <span>季度对账单</span>
            </div>
            <div class="sub-radio">
                <i class="icon-radio"></i>
                <span>半年度对账单</span>
            </div>
            <div class="sub-radio">
                <i class="icon-radio"></i>
                <span>年度对账单</span>
            </div>
        </div>
    </li>
</ul>
<div class="sub-btn">
    <a href="#" class="sub-btn1">确定</a>
</div>
</#macro>
<#include "../common/main.ftl">