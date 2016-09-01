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
            <div>您本次最多可兑换<span>100</span>M流量</div>
        </div>
        <div class="input1">
            <div>
                <div class="place-border">&nbsp;</div>
                <input type="text" placeholder="请输入您的手机号"/>
            </div>
        </div>
        <div class="flex-btn">
            <div>
                <div class="select">
                <!--
                    <div class="select-tip">选择兑换流量</div>
                    <div class="select-list">
                        <div>20M</div>
                        <div>40M</div>
                        <div>60M</div>
                        <div>80M</div>
                    </div>  -->
                     <select class="select-tip" name="select">
                     	<option selected value="0">选择兑换流量</option>
	                    <option value="1">20M</option>
	                    <option value="2">40M</option>
	                    <option value="3">60M</option>
	                    <option value="4">80M</option>
	                </select>
	                <div class="arrow-down"></div>
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