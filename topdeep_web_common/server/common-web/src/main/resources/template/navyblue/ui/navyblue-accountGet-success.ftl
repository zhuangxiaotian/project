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
$(document).ready(function(){
	//loading
	function showLoading(){
		var loadBox = $('<div class="dialog"></div>');
		var loadContent;
		var loadBody = '';
		loadBody+= '<div class="loading-content"></div>';
		loadContent=$(loadBody);
		loadBox.append(loadContent);
		$("body").append(loadBox);
	}
	//移除loading
	function hideLoading(){
		if($(".dialog")){
			$(".dialog").remove();
		}
	}
	$("#loading").click(function(){
		showLoading();
	})
})
</script>
</#macro>
<#macro htmlbody>
<div class="box">
    <div class="section bg-account">
		<div class="place-border"></div>
        <div class="gongxi">
            <div class="">
				<img src="${base}/static/skin/${res.skin}/images/gongxi.png" alt="恭喜"/>
				<div class="get-score"><span class="gx-tip">获得<em>1000</em>积分</span></div>
			</div>
        </div>
        <div class="account">
            <img src="${base}/static/skin/${res.skin}/images/gift.png" alt="开户提取"/>
            <div class="account-tip">快去<span class="red">开户/绑定</span>吧！</div>
            <div class="account-content">有<span>10</span>元现金红包和<span>100</span>M手机流量任你选！</div>
        </div>
        <div class="btn1">
            <a href="javascript:;">开通账户提取积分</a>
        </div>
        <div class="btn2 padding-b">
            <a href="javascript:;" id="loading">绑定账户提取积分</a>
        </div>
    </div>
</div>
</#macro>
<#include "../common/main.ftl">