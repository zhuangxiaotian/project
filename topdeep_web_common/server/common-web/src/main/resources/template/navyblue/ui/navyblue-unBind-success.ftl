<#macro jsimport>
<script>
window.onload=function(){
	//screenHeight
    function resizeBoxHeight(){
        var bodyHeight = $("body").outerHeight(true);
        var docHeight=$(".box").outerHeight(true);
        if(bodyHeight>docHeight){
            $(".box").css("height",bodyHeight);
        }else {
            $(".box").css("height",docHeight);
        }
    }
	 resizeBoxHeight();
	 $(window).resize(function(){
	        resizeBoxHeight();
	 })
}
</script>
        </#macro>
<#macro htmlbody>
<div class="box">
    <div class="section bg-bind">
        <div class="place-border"></div>
        <div class="adv1">
            <div>亲～您还未开户或绑定小V呢～表着急哦～ 只需轻松<span class="red">两步</span>，10元现金红包和100M手机 流量任你选！</div>
        </div>
        <div class="btn1" id="test">
            <a href="javascript:;">开通账户提取积分</a>
        </div>
        <div class="btn2 padding-b">
            <a href="javascript:;" id="share">绑定账户提取积分</a>
        </div>
    </div>
</div>
</#macro>
<#include "../common/main.ftl">