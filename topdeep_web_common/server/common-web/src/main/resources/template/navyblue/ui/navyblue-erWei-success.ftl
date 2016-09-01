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
    <div class="section bg-jjr">
        <div class="place-border"></div>
        <div class="rule rule-jjr padding-b">
            <div class="rule-box">
                <div class="border-left"><img src="${base}/static/skin/${res.skin}/images/border-left.png" alt=""/></div>
                <div class="border-right"><img src="${base}/static/skin/${res.skin}/images/border-right.png" alt=""/></div>
                <div class="adv-content">
                    <div class="adv-detail">长按二维码,快来关注“建信小V” 只需一步，1000积分就是你的！兑换就有豪礼相送哦！</span></div>
                <div class="erwei">
                    <img src="${base}/static/skin/${res.skin}/images/erwei.png" alt="二维码"/>
                    <div class="erwei-content">(长按二维码添加关注)</div>
                </div>
            </div>
        </div>
    </div>
</div>
</#macro>
<#include "../common/main.ftl">