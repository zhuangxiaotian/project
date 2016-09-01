<#macro jsimport>
<script>
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
        选择银行
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<ul class="sub-list2">
    <li class="sub-radio">
        <div class="redeem-select">
            <div class="redeem-icon">
                <i class="bank-b004"></i>
            </div>
            <div class="redeem-title">
                <div class="">中国银行</div>
                <div class="tip-sm">可用<em class="red">400.00</em>份</div>
            </div>
        </div>
        <div class="redeem-radio">
            <i class="icon-radio"></i>
        </div>
    </li>
    <li class="sub-radio">
        <div class="redeem-select">
            <div class="redeem-icon">
                <i class="bank-b004"></i>
            </div>
            <div class="redeem-title">
                <div class="">中国银行</div>
                <div class="tip-sm">可用<em class="red">400.00</em>份</div>
            </div>
        </div>
        <div class="redeem-radio">
            <i class="icon-radio"></i>
        </div>
    </li>
</ul>
</#macro>
<#include "../common/main.ftl">