<#macro jsimport>
<!-- iSroll -->
<script src="${base}/static/js/vendors/iscroll/iscroll.js" type="text/javascript"></script>
<script>
$(document).ready(function(){
	 //搜索框
    $(".searchIcon").click(function(){
        if($(".search-box").is(":hidden")){
            $(".search-box").show(300);
        }else{
            $(".search-box").hide(300);
        }
    });

	
	var ww = window.innerWidth;
	var size = $(".tab-fund>ul>li").length;
	var navW = 85;
	if(ww > 320 && ww <= 360){
		navW = 85;
	}else if(ww > 360){
		navW = 95;
	}
	$(".tab-fund").css("width",navW*size);
	$(".tab-fund ul li").css("width",navW);
	var myScroll;
	function xScroll(){
		myScroll = new IScroll('#wrapper', { eventPassthrough: true, scrollX: true, scrollY: false, preventDefault: false });

	}
	xScroll();
	$(document).on("click",".tab-fund>ul>li",function(){
		var pw = $(".tab-fund>ul>li.active").next().css("width");
		$(".tab-fund>ul>li.active").next().css("width",pw);
		$(".tab-fund>ul>li").removeClass("active");
		$(this).addClass("active");
	})
})
$(".data-range").on("click",function(){
        $(this).find(".icon-bottom").toggleClass("icon-top");
})
//select
function showSelect(nameId,selectId){
	function init(){
		var $nameId=$(nameId);
		$nameId.on("click",function(){
			$(this).find(".icon-down").addClass("icon-up");
			$(".select-detail").removeClass("active");
			$(this).parent().find(".select-detail").addClass("active");
			var $cover = $('#cover');
			var $selectList=$(selectId);
			$selectList.fadeIn();
			$selectList.find(".list-cell").on("click",function(){
				$nameId.parent().find(".select-detail").html($(this).html());
				$nameId.find(".icon-down").removeClass("icon-up");
				hideSelectList($selectList, $cover);
				$(this).addClass("active").siblings().removeClass("active");
			});
			$cover.show().focus().one('click',function(){
				$nameId.find(".icon-down").removeClass("icon-up");
				hideSelectList($selectList, $cover);
			});
		});
	};
	function hideSelectList(selectList,cover) {
		selectList.fadeOut();
		cover.fadeOut();
	}
	init();
}
new showSelect("#select1-target","#select1");
new showSelect("#select2-target","#select2");
$(".collection").click(function(){
    $(this).find(".icon-collect").toggleClass("icon-collect-s");
    if($(this).children().is(".icon-collect-s")){
        showAlert("收藏基金成功");
    }else {
        showAlert("取消收藏成功");
    }

});
</script>
</#macro>
<#macro htmlbody>
<header class="header-container">
	<a class="searchIcon" href="javascript:void(0);"><i></i></a>
	<h1 class="title">基金</h1>
	<a href="javascript:;">
		<dl class="collectIcon">
			<dt class="wjx1"></dt>
			<dd>已收藏基金</dd>
		</dl>
	</a>
</header>
<div class="header-placeholder"></div>
<div class="search-box flex" style="display:none;">
    	<input type="text" placeholder="请输入基金代码或基金名称" />
        <a href="javascript:;"><span class="sure">确定</span></a>
</div>
<div class="scroll-box" id="wrapper">
	<div id="scroller" class="tab-fund">
		<ul >
			<li class="active"><a href="javascript:;">推荐基金</a></li>
			<li><a href="javascript:;">我的基金</a></li>
			<li><a href="javascript:;">债券型</a></li>
			<li><a href="javascript:;">理财型</a></li>
			<li><a href="javascript:;">股票型</a></li>
			<li><a href="javascript:;">混合型</a></li>
			<li><a href="javascript:;">QDII</a></li>
		</ul>
	</div>
	<div class="icon-arrow-l"></div>
	<div class="icon-arrow-r"></div>
</div>
<div class="sub-cells fund-list">
	<div class="sub-cell fund-show">
		<div class="flex-cell sub-select">
			<a class="data-range"><span class="select-detail active" >累计净值</span><i class="icon-bottom"></i></a>
			<a class="arrow-toggle" id="select1-target"><i class="icon-down"></i></a>
			<div class="select-content" id="select1" style="display: none;">
				<ul class="select-list">
					<li class="list-cell">最新净值</li>
					<li class="list-cell active">累计净值</li>
				</ul>
			</div>
		</div>
		<div class="flex-cell sub-select">
			<a class="data-range">
				<span class="select-detail">日涨跌幅</span>
				<i class="icon-bottom"></i>
			</a>
			<a class="arrow-toggle" id="select2-target"><i class="icon-down"></i></a>
			<div class="select-content" id="select2" style="display: none;">
				<ul class="select-list">
					<li class="list-cell active">日涨跌幅</li>
                    <li class="list-cell">近一个月收益率</li>
                    <li class="list-cell">近三个月收益率</li>
                    <!--<li class="list-cell">近六个月收益率</li>-->
                    <li class="list-cell">近一年收益率</li>
				</ul>
			</div>
		</div>
		<div class="divider"></div>
	</div>
</div>
<div class="sub-cells fund-list">
	<div class="sub-cell">
		<div class="blue-left"></div>
		<div class="fund-name">增值宝(建信货币市场基金) 530002</div>
		<div class="collection"><i class="icon-collect"></i></div>
		<div class="flex-cell state">正常</div>
	</div>
	<a class="sub-cell fund-list-detail">
		<div class="flex-cell">
			<div class="data-number">1,000.26</div>
			<div class="data-name">最新净值(08-26)</div>
		</div>
		<div class="flex-cell">
			<div class="data-number red">3.14%</div>
			<div class="data-name">日涨幅</div>
		</div>
		<i class="icon-right"></i>
		<div class="divider"></div>
	</a>
</div>
<div class="sub-cells fund-list">
	<div class="sub-cell">
		<div class="blue-left"></div>
		<div class="fund-name">建信优选成长股票 53003</div>
		<div class="collection"><i class="icon-collect"></i></div>
		<div class="flex-cell state green">停止交易</div>
	</div>
	<a class="sub-cell fund-list-detail">
		<div class="flex-cell">
			<div class="data-number">1,000.26</div>
			<div class="data-name">最新净值(08-26)</div>
		</div>
		<div class="flex-cell">
			<div class="data-number green">-3.14%</div>
			<div class="data-name">日涨幅</div>
		</div>
		<i class="icon-right"></i>
		<div class="divider"></div>
	</a>
</div>
<div class="sub-cells fund-list">
	<div class="sub-cell">
		<div class="blue-left"></div>
		<div class="fund-name">建信优选成长股票 53003</div>
		<div class="collection"><i class="icon-collect"></i></div>
		<div class="flex-cell state red">发行</div>
	</div>
	<a class="sub-cell fund-list-detail">
		<div class="flex-cell">
			<div class="data-number">1,000.26</div>
			<div class="data-name">最新净值(08-26)</div>
		</div>
		<div class="flex-cell">
			<div class="data-number light">0.00%</div>
			<div class="data-name">日涨幅</div>
		</div>
		<i class="icon-right"></i>
		<div class="divider"></div>
	</a>
	<div class="sub-cell">
		<div class="description"><i class="icon-des"></i></div>
		<div class="flex-cell description-detail">2014年3月建信研究精选基金成为603只股票基金中唯一建信研究精选基金成为研究精选基金</div>
	</div>
</div>
<div class="place-index"></div>
<div class="navbar">
	<ul class="navbar-nav">
		<li class="">
			<a href="${base}/ui/oceanblue.action?type=indexAlready">
				<span class="icon-home"></span>
				<span class="navbar-label">增值宝</span>
			</a>
		</li>
		<li class="active">
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
<div class="cover" id="cover" style="display: none;"></div>
</#macro>
<#include "../common/main.ftl">