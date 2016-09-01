<#macro htmlbody>
<div class="container">
	<div class="header">
		<div class="header-container">
			<div class="hl">
				<a href="javascript:history.go(-1);" class="back">
					<i class="icon-back"></i>
				</a>
			</div>
			<div class="title">我的银行卡</div>
			<div class="hr">&nbsp;</div>
		</div>
	</div>
	<div class="weui_tab_bd">
		<div class="weui_cells sub-form">
			<a class="weui_cell" href="javascript:;">
				<div class="weui_cell_primary text-center">
					<div><i class="icon-add"></i></div>
					<div class="fund-name fontsize-18">开通银行卡</div>
				</div>
			</a>
		</div>
		<div class="weui_cells sub-form">
			<a class="weui_cell" href="${base}/ui/skyblue.action?type=myBankDetail">
				<div class="trade-type">
					<span class="bank-b005"></span>
				</div>
				<div class="weui_cell_primary">
					<div class="fund-name fontsize-16">建设银行[尾号1501]</div>
					<div class="font-light">已开通收付款</div>
				</div>
				<div class="weui_cell_ft">
				</div>
			</a>
		</div>
		<div class="weui_cells sub-form">
			<a class="weui_cell" href="${base}/ui/skyblue.action?type=myBankDetail">
				<div class="trade-type">
					<span class="bank-b002"></span>
				</div>
				<div class="weui_cell_primary">
					<div class="fund-name fontsize-16">中国银行[尾号0339]</div>
					<div class="font-light">未开通收付款</div>
				</div>
				<div class="">
					<button class="weui_btn btn-sm bg-red">删除</button>
				</div>
			</a>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">