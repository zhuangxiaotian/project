<#macro jsimport>
<script>
$(document).ready(function(){
	$(".msg").on("click", function(){
			$(this).find(".msg-title").toggleClass("msg-toggle");
			$(this).next().toggle();
		}
	);
});
</script>
</#macro>
<#macro htmlbody>
<div class="container">
	<div class="header">
		<div class="header-container">
			<div class="hl">
				<a href="javascript:history.go(-1);" class="back">
					<i class="icon-back"></i>
				</a>
			</div>
			<div class="title">消息</div>
			<div class="hr">&nbsp;</div>
		</div>
	</div>
	<div class="weui_tab_bd">
		<div class="weui_cells sub-form">
			<a class="weui_cell msg">
				<div class="weui_cell_primary msg-title">
					<div class="fontsize-18">结算易app上线啦</div>
					<div class="font-light">2016-12-28</div>
				</div>
			</a>
			<div class="weui_cell msg-detail" style="display:none;">
				<div class="weui_cell_primary">
					结算易APP是一款为特定平台提供交易结算功能的APP,基本功能是为参与交易的收款方和付款方提供一种新的资金交收方式，并附加资金增值功能……
				</div>
			</div>
		</div>
		<div class="weui_cells sub-form">
			<a class="weui_cell msg">
				<div class="weui_cell_primary msg-title ">
					<div class="fontsize-18">结算易app上线啦</div>
					<div class="font-light">2016-12-28</div>
				</div>
			</a>
		</div>
		<div class="weui_cells sub-form">
			<a class="weui_cell msg">
				<div class="weui_cell_primary msg-title">
					<div class="fontsize-18">结算易app上线啦</div>
					<div class="font-light">2016-12-28</div>
				</div>
			</a>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">