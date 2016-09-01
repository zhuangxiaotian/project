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
    <div class="section bg-exchange">
    	<div class="place-border"></div>
        <div class="adv2">
            <div>您本次最多可兑换<span>10</span>元红包</div>
        </div>
        <div class="flex-btn">
            <div>
                <div class="input-s">
                	<div class="place-border">&nbsp;</div>
                	<input type="text" placeholder="请输入金额"/>
                </div>
                <div class="btn3">
                    <a href="javascript:;">全部兑换</a>
                </div>
            </div>
        </div>
        <div class="btn4 padding-b">
            <div>
                <a href="javascript:;">确认兑换</a>
            </div>
        </div>
    </div>
</div>
</#macro>
<#include "../common/main.ftl">