<#macro htmlbody>
<div class="container">
	<div class="header">
		<div class="header-container">
			<div class="hl">
				<a href="javascript:history.go(-1);" class="back">
					<i class="icon-back"></i>
				</a>
			</div>
			<div class="title">我的密码</div>
			<div class="hr">&nbsp;</div>
		</div>
	</div>
	<div class="weui_tab_bd">
		<div class="weui_cells sub-form">
			<div class="weui_cell">
				<div class=""><label class="weui_label">使用手势密码</label></div>
				<div class="weui_cell_primary">
					<div class="text-r">
						<input class="weui_switch" type="checkbox"/>
					</div>
				</div>
			</div>
		</div>
		<div class="weui_cells sub-form">
			<a class="weui_cell" href="javascript:;">
				<div class="weui_cell_primary">
					<p>修改手势密码</p>
				</div>
				<div class="weui_cell_ft"></div>
			</a>
			<a class="weui_cell" href="${base}/ui/skyblue.action?type=myPwdReset">
				<div class="weui_cell_primary">
					<p>修改交易密码</p>
				</div>
				<div class="weui_cell_ft"></div>
			</a>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">