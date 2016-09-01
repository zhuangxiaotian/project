<#macro jsimport>
<script>
$(document).ready(function(){
	$("#test").click(function(){
		showConfirm("确认放弃收款？","取消","确认","warning");
	})
})
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
			<div class="title">放弃收款</div>
			<div class="hr">&nbsp;</div>
		</div>
	</div>
	<div class="weui_tab_bd">
		<div class="sub-content bg-white">
			<div class="state"><span class="icon-fail"></span></div>
			<div class="state-detail">您已放弃收款！</div>
			<div class="state-content">
				<div>收款金额：<em>100.00</em>元</div>
				<div>协议号：<em>100.00</em>元</div>
				<div>付款方：<span>*希</span></div>
				<div>备注：<span>玉石交易</span></div>
			</div>
		</div>
		<div class="btn padding-spacing sub-placeholder-lg">
			<a href="javascript:;" class="weui_btn bg-blue" id="test">返回主页</a>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">