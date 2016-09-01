<#macro htmlbody>
<div class="container">
	<div class="header">
		<div class="header-container">
			<div class="hl">
				<a href="javascript:history.go(-1);" class="back">
					<i class="icon-back"></i>
				</a>
			</div>
			<div class="title">修改密码</div>
			<div class="hr">&nbsp;</div>
		</div>
	</div>
	<div class="weui_tab_bd">
		<div class="weui_cells sub-form">
			<a class="weui_cell" href="javascript:;">
				<div class="weui_cell_primary text-center">
					<div class="padding-spacing"><i class="icon-success"></i></div>
					<div class="padding-spacing fontsize-16">付款密码已修改成功</div>
				</div>
			</a>
		</div>
		<div class="btn sub-placeholder-lg padding-spacing">
			<a href="${base}/ui/skyblue.action?type=indexAlready" class="weui_btn bg-blue">返回主页</a>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">