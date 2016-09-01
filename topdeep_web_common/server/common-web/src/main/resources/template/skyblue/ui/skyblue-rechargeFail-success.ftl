<#macro htmlbody>
<div class="container">
	<div class="header">
		<div class="header-container">
			<div class="hl">
				<a href="javascript:history.go(-1);" class="back">
					<i class="icon-back"></i>
				</a>
			</div>
			<div class="title">充值失败</div>
			<div class="hr">&nbsp;</div>
		</div>
	</div>
	<div class="weui_tab_bd">
		<div class="sub-content bg-white">
			<div class="state"><span class="icon-fail"></span></div>
			<div class="state-detail">充值受理失败！</div>
			<div class="state-content">
				<div>失败原因：</div>
				<div>该银行卡余额不足！</div>
			</div>

		</div>
		<div class="btn padding-spacing sub-placeholder-lg">
			<a href="javascript:;" class="weui_btn bg-blue" id="test">返回主页</a>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">