<#macro htmlbody>
<div class="container">
	<div class="header">
		<div class="header-container">
			<div class="hl">
				<a href="javascript:history.go(-1);" class="back">
					<i class="icon-back"></i>
				</a>
			</div>
			<div class="title">今日收/付款</div>
			<div class="hr">&nbsp;</div>
		</div>
	</div>
	<div class="weui_tab_bd">
		<div class="weui_cells sub-form">
			<a class="weui_cell" href="javascript:;">
				<div class="trade-type">
					<span class="type-blue">收款</span>
				</div>
				<div class="weui_cell_primary">
					<div class="fund-name fontsize-16">建行[尾号1501]</div>
					<div>2016-12-26 13:45:59</div>
				</div>
				<div class="weui_cell_ft red trade-detail">
					<div class="fund-name">2,000.00元</div>
					<div class="fontsize-16 ">成功</div>
				</div>
			</a>
		</div>
		<div class="weui_cells sub-form">
			<a class="weui_cell" href="javascript:;">
				<div class="trade-type">
					<span class="type-orange">付款</span>
				</div>
				<div class="weui_cell_primary">
					<div class="fund-name fontsize-16">建行[尾号1501]</div>
					<div>2016-12-26 13:45:59</div>
				</div>
				<div class="weui_cell_ft green trade-detail">
					<div class="fund-name">2,000.00元</div>
					<div class="fontsize-16 ">失败</div>
				</div>
			</a>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">