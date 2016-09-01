<#macro htmlbody>
<div class="container">
	<!--注册-->
	<div class="header">
		<div class="header-container">
			<div class="hl">
				<a href="javascript:history.go(-1);" class="back">
					<i class="icon-back"></i>
				</a>
			</div>
			<div class="title">注册-输入密码</div>
			<div class="hr">&nbsp;</div>
		</div>
	</div>
	<div class="weui_tab_bd">
		<div class="sub-content">您已为建信基金网上交易客户，可使用建信网上交易密码登录，并设置收付款功能，请输入交易密码。</div>
		<div class="weui_cells sub-form">
			<div class="weui_cell">
				<div class=""><label class="weui_label">输入交易密码</label></div>
				<div class="weui_cell_primary">
					<input class="weui_input" type="password"　 placeholder=""/>
				</div>
			</div>
		</div>
		<div class="btn padding-spacing sub-placeholder-lg">
			<a href="${base}/ui/skyblue.action?type=registerSet" class="weui_btn bg-blue">下一步</a>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">