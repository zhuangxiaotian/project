<#macro htmlbody>
<div class="container">
	<div class="header">
		<div class="header-container">
			<div class="hl">
				<a href="javascript:history.go(-1);" class="back">
					<i class="icon-back"></i>
				</a>
			</div>
			<div class="title">常见问题</div>
			<div class="hr">&nbsp;</div>
		</div>
	</div>
	<div class="weui_tab_bd">
		<div class="weui_cells sub-form">
			<a class="weui_cell" href="${base}/ui/skyblue.action?type=myQuestionDetail">
				<em class="msg-number-yellow">1</em>
				<div class="weui_cell_primary">
					<div class="fontsize-16">什么是结算易？</div>
				</div>
			</a>
			<a class="weui_cell" href="${base}/ui/skyblue.action?type=myQuestionDetail">
				<em class="msg-number-yellow">2</em>
				<div class="weui_cell_primary">
					<div class="fontsize-16">结算易收益怎么计算？</div>
				</div>
			</a>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">