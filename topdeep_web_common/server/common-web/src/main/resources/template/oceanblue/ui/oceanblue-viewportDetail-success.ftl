<#macro jsimport>
<script type="text/javascript">
$(function(){
	$(document).on("click",".tab-viewport>li",function(){
		$(this).addClass("active").siblings().removeClass("active");
		$(".tab-viewport-panel").hide();
		$(".tab-viewport-panel").eq($(this).index()).show();
	})
	$(document).on("click",".hot",function(){
		$(this).siblings().find(".hot-detail").removeClass("hot-open");
		$(this).find(".hot-detail").toggleClass("hot-open");
	})
});
</script>
</#macro>
<#macro htmlbody>
<header class="header-container">
	<a class="back" href="javascript:history.go(-1);"><i></i></a>
	<h1 class="title">热点资讯</h1>
	<a href="javascript:;" class="header-right"><i class="icon-share"></i></a>
</header>
<div class="section">
	<div class="viewport">
		<div class="viewport-title">稳增长仍是下半年主基调</div>
		<div class="viewport-date">2016-12-18</div>
		<div class="viewport-pic"><img src="${base}/static/skin/${res.skin}/images/icon_viewport.png" alt="热点资讯"/></div>
		<div class="viewport-detail">上半年宏观经济运行数据将于近期上半年宏观经济运行数据将于近期上半年宏观经济运行数据将于近期上半年宏观经济运行数据将于近期</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">