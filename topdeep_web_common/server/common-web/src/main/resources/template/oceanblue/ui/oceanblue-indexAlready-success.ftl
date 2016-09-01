<#macro jsimport>
<!-- touchslide -->
<script src="${base}/static/js/vendors/touchslide/TouchSlide.1.1.js" type="text/javascript"></script>
<script>
	TouchSlide({
		slideCell:"#slideBox",
		titCell:".hd ul", //开启自动分页 autoPage:true ，此时设置 titCell 为导航元素包裹层
		mainCell:".bd ul",
		effect:"leftLoop",
		autoPage:true,//自动分页
		autoPlay:true //自动播放
	});
	$(document).ready(function(){
		var tabbar = {
			//菜单切换
			"tabExchange" : function() {
				$(".weui_tabbar>a").bind("click" , function(){
					$(this).addClass("active").siblings().removeClass("active");
					$(".tabbar-panel").hide();
					$(".tabbar-panel").eq($(this).index()).show();
				});
			}
		}
		tabbar.tabExchange();
	})
</script>
</#macro>
<#macro htmlbody>
		<!--header start-->
<header class="header-container">
	<h1 class="header-title">
		建信基金
	</h1>
	<a class="user" href=""><span class="icon"></span>周小白</a>
</header>
		<!--header end-->
		<!--banner start-->
<div class="banner">
	<div id="slideBox" class="slideBox">
		<div class="bd">
			<ul>
				<li><a class="pic" href="#"><img src="${base}/static/skin/${res.skin}/images/banner1.jpg" /></a></li>
				<li><a class="pic" href="#"><img src="${base}/static/skin/${res.skin}/images/banner1.jpg" /></a></li>
			</ul>
		</div>
		<div class="hd"><ul></ul></div>
	</div>
</div>
		<!--banner end-->
		<!--notice start-->
<div class="notice">
	<span class="icon"></span>
	<marquee>12月29日09:00至1月5日09:00，增值宝快速取现快来体验吧。</marquee>
</div>
		<!--notice end-->
		<!--fund start-->
<div class="fund-pro">
	<div class="fund-name">超级现金宝</div>
	<div class="seven-day">七日年化(12-29)</div>
	<a class="fund-data" href="javascript:;">
		<em>5.8460</em>%
		<i class="icon-right"></i>
	</a>
	<div class="fund-tag">
		<span class="fund-type-red"><i class="icon-tag1"></i>即买即用</span>
		<span class="fund-type-red"><i class="icon-tag2"></i>实时到账</span>
		<span class="fund-type-red"><i class="icon-tag3"></i>安全便捷</span>
	</div>
	<div class="fund-btn">
		<a href="javascript:;" class="btn">购买</a>
	</div>
</div>
<div class="fund-pro">
	<div class="fund-name">增值宝530002</div>
	<div class="seven-day">七日年化(12-29)</div>
	<a class="fund-data" href="javascript:;">
		<em>5.8460</em>%
		<i class="icon-right"></i>
	</a>
	<div class="fund-tag">
		<span class="fund-type-red"><i class="icon-tag1"></i>即买即用</span>
		<span class="fund-type-red"><i class="icon-tag2"></i>实时到账</span>
		<span class="fund-type-red"><i class="icon-tag3"></i>安全便捷</span>
	</div>
	<div class="fund-btn">
		<a href="javascript:;" class="btn">购买</a>
	</div>
</div>
		<!--fund end-->
<div class="place-index"></div>
<div class="navbar">
	<ul class="navbar-nav">
		<li class="active">
			<a href="${base}/ui/oceanblue.action?type=indexAlready">
				<span class="icon-home"></span>
				<span class="navbar-label">增值宝</span>
			</a>
		</li>
		<li class="">
			<a href="${base}/ui/oceanblue.action?type=fundDetail">
				<span class="icon-fund"></span>
				<span class="navbar-label">基金</span>
			</a>
		</li>
		<li class="">
			<a href="${base}/ui/oceanblue.action?type=assetsDetail">
				<span class="icon-high"></span>
				<span class="navbar-label">资产详情</span>
			</a>
		</li>
		<li class="">
			<a href="javascript:;">
				<span class="icon-more"></span>
				<span class="navbar-label">更多</span>
			</a>
		</li>
	</ul>
</div>
		</#macro>
<#include "../common/main.ftl">