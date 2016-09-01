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
	<h1 class="title">资讯视点</h1>
</header>
<ul class="tab-viewport">
	<li class="active"><a href="javascript:;">热点资讯</a></li>
	<li><a href="javascript:;">建信视点</a></li>
</ul>
<div class="tab-viewport-panel" style="">
	<a class="sub-cells hot">
		<div class="sub-cell hot-shots">
			<div class="hot-diamond"><i class="icon-diamond"></i></div>
			<div class="hot-question">稳增长仍是下半年主基调</div>
			<div class="hot-date"><span>2016-12-18</span></div>
		</div>
		<div class="hot-detail hot-open">上半年宏观经济运行数据将于近期上半年宏观经济运行数据将于近期上半年宏观经济运行数据将于近期上半年宏观经济运行数据将于近期</div>
	</a>
	<a class="sub-cells hot">
		<div class="sub-cell hot-shots">
			<div class="hot-diamond"><i class="icon-diamond"></i></div>
			<div class="hot-question">稳增长仍是下半年主基调</div>
			<div class="hot-date"><span>2016-12-18</span></div>
		</div>
		<div class="hot-detail">上半年宏观经济运行数据将于近期上半年宏观经济运行数据将于近期上半年宏观经济运行数据将于近期上半年宏观经济运行数据将于近期</div>
	</a>
	<a class="sub-cells hot">
		<div class="sub-cell hot-shots">
			<div class="hot-diamond"><i class="icon-diamond"></i></div>
			<div class="hot-question">稳增长仍是下半年主基调</div>
			<div class="hot-date"><span>2016-12-18</span></div>
		</div>
		<div class="hot-detail">上半年宏观经济运行数据将于近期上半年宏观经济运行数据将于近期上半年宏观经济运行数据将于近期上半年宏观经济运行数据将于近期</div>
	</a>
</div>
<div class="tab-viewport-panel" style="display: none;">
	<a class="sub-cells hot">
		<div class="sub-cell hot-shots">
			<div class="hot-diamond"><i class="icon-diamond"></i></div>
			<div class="hot-question">稳增长仍是下半年主基调</div>
			<div class="hot-date"><span>2016-12-18</span></div>
		</div>
		<div class="hot-detail">上半年宏观经济运行数据将于近期上半年宏观经济运行数据将于近期上半年宏观经济运行数据将于近期上半年宏观经济运行数据将于近期</div>
	</a>
	<a class="sub-cells hot">
		<div class="sub-cell hot-shots">
			<div class="hot-diamond"><i class="icon-diamond"></i></div>
			<div class="hot-question">稳增长仍是下半年主基调</div>
			<div class="hot-date"><span>2016-12-18</span></div>
		</div>
		<div class="hot-detail">上半年宏观经济运行数据将于近期上半年宏观经济运行数据将于近期上半年宏观经济运行数据将于近期上半年宏观经济运行数据将于近期</div>
	</a>
</div>
</#macro>
<#include "../common/main.ftl">