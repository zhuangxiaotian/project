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
        <a href="javascript:history.go(-1);"><i class="icon-left"></i></a>
    </div>
    <div class="title">
        选择赎回到
    </div>
    <div class="hr">
    </div>
</header>
<ul class="sub-list2">
    <li class="sub-radio">
        <div class="redeem-select">
            <div class="redeem-title">
                <i class="icon-cash"></i>
            </div>
            <div class="redeem-title">
                <div class="">现金宝</div>
                <div class="tip-sm">赎回资金T+1日到账，即可取现</div>
            </div>
        </div>
        <div class="redeem-radio">
            <i class="icon-radio icon-radios"></i>
        </div>
    </li>
    <li class="sub-radio">
        <div class="redeem-select">
            <div class="redeem-icon">
                <i class="bank-b002"></i>
            </div>
            <div class="redeem-title">
                <div class="">工商银行</div>
                <div class="tip-sm">赎回资金T+1日资金到卡</div>
            </div>
        </div>
        <div class="redeem-radio">
            <i class="icon-radio"></i>
        </div>
    </li>
</ul>
</#macro>
<#include "../common/main.ftl">