<#macro jsimport>
<script type="text/javascript">
$(document).ready(function(){
	function showSheet(idName,sheetName){
		function init(){
			var $idName=$(idName);
			$idName.on("click",function(){
				var $mask = $('#mask');
				var $sheetList=$(sheetName);
				$sheetList.addClass('sheet-list-toggle');
				$sheetList.find(".sheet-cell").on("click",function(){
					$idName.html($(this).html());
					hideSheetList($sheetList, $mask);
				})
				$mask.fadeIn().focus().one('click',function(){
					hideSheetList($sheetList, $mask);
				});
				$mask.unbind('transitionend').unbind('webkitTransitionEnd');
			});

		};
		function hideSheetList(sheetList, mask) {
			sheetList.removeClass('sheet-list-toggle');
			mask.fadeOut();
			mask.on('transitionend', function () {
				mask.hide();
			}).on('webkitTransitionEnd', function () {
				mask.hide();
			})
		}
		init();
	}
	new showSheet("#bankSelect","#bankList");

	$(".sub-radio").on("click",function(){
		$(this).siblings().find(".icon-radio").removeClass("icon-radio-s");
		$(this).find(".icon-radio").addClass("icon-radio-s");
	})
})
</script>
</#macro>
<#macro htmlbody>
<header class="header-container">
	<a class="back" href="javascript:history.go(-1);"><i></i></a>
	<h1 class="title">增值宝存入</h1>
</header>
<div class="section">
	<div class="fund-tip">预计 <span class="red">2016-12-12</span> 可以享受收益</div>
	<ul class="sub-list maginTop15">
		<li>
			<i class="d"></i>
			<div class="list-detail">
				<span class="fl">付款银行卡</span>
				<a class="fr"><span id="bankSelect" class="select-target"><i class="bank-b005"></i>建设银行****1501</span><i class="icon-down"></i></a>
			</div>
		</li>
		<li>
			<i class="d"></i>
			<div class="list-detail">
				<span class="fl">存入金额</span>
				<span class="fr red">1000.00元</span>
			</div>
		</li>
		<li>
			<i class="d"></i>
			<div class="list-detail">
				<span class="fl">手续费</span>
				<span class="fr">6.00元</span>
			</div>
		</li>
	</ul>
	<ul class="sub-list maginTop15">
		<li>
			<i class="d"></i>
			<div class="list-detail">
				<span class="fl line-right">存入方式</span>
				<div class="flex radio-box">
					<a class="flex-cell text-l sub-radio"><i class="icon-radio icon-radio-s"></i>实时</a>
					<a class="flex-cell text-l sub-radio"><i class="icon-radio"></i>定期</a>
					<a class="flex-cell text-l sub-radio"><i class="icon-radio"></i>预约</a>
				</div>
			</div>
		</li>
		<li>
			<i class="d"></i>
			<div class="list-detail">
				<span class="fl">定投周期</span>
				<a class="fr"><span id="dateSelect" class="select-target">1月</span><i class="icon-down"></i></a>
			</div>
		</li>
		<li>
			<i class="d"></i>
			<div class="list-detail">
				<span class="fl">开始存入时间</span>
				<a class="fr"><span id="weekSelect" class="select-target">周一</span><i class="icon-down"></i></a>
			</div>
		</li>
	</ul>
	<div class="sub-margin-lr sub-padding">
		<a href="javascript:;" class="btn">下一步</a>
	</div>
	<div class="warm-tips">
		<div class="tip-title"><i class="icon-tip"></i>温馨提示</div>
		<div class="tip-content">购买增值宝即申购建信增值宝货币市场基金，最低1分钱起存。</div>
	</div>
</div>
<div class="select-content">
	<div class="mask" id="mask"></div>
	<div class="sheet-list" id="bankList">
		<div class="sheet-menu">
			<div class="sheet-cell"><i class="bank-b005"></i>建设银行****1501</div>
			<div class="sheet-cell"><i class="bank-b004"></i>中国银行****0335</div>
			<div class="sheet-cell"><i class="bank-b002"></i>工商银行****0762</div>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">