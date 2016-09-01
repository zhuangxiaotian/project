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
    <div class="section bg-account">
        <div class="place-border"></div>
        <div class="gongxi">
            <div class="">
				<img src="${base}/static/skin/${res.skin}/images/gongxi.png" alt="恭喜"/>
				<div class="get-score"><span class="gx-tip">获得<em>1000</em>积分</span></div>
			</div>
        </div>
        <div class="rule">
            <div class="rule-box">
                <div class="border-left"><img src="${base}/static/skin/${res.skin}/images/border-left.png" alt=""/></div>
                <div class="border-right"><img src="${base}/static/skin/${res.skin}/images/border-right.png" alt=""/></div>
                <div class="adv-content">
                    <div class="adv-title">您已成为建信小V经纪人啦</div>
                    <div class="adv-detail">现在快去“邀请好友”吧，还有一大波“<span class="red">积分</span>”正在向你袭来！</div>
                </div>
            </div>
        </div>
        <div class="btn1">
            <a href="javascript:;" id="test">邀请好友</a>
        </div>
        <div class="text-placeholder"></div>
    </div>
    <div class="warm">
            <div class="text-l">点击“<span class="red">&lt;返回</span>”到首页底部菜单，“精彩活动-我的积分”中查看您的积分呦～！</div>
    </div>
</div>
<div class="share">
	<img src="${base}/static/skin/${res.skin}/images/share_02.png" alt="引导分享">
</div>
</#macro>
<#include "../common/main.ftl">