<#macro htmlbody>
<div class="container bg-gray">
	<div class="header">
		<div class="header-container">
			<div class="hl">
				<a href="javascript:history.go(-1);" class="back">
					<i class="icon-back"></i>
				</a>
			</div>
			<div class="title">历史交易明细</div>
			<div class="hr"><a href="javascript:;"><i class="icon-search"></i></a></div>
		</div>
	</div>
	<div class="weui_tab">
		<div class="weui_navbar tab">
			<div class="weui_navbar_item active">
				基金交易记录
			</div>
			<div class="weui_navbar_item">
				收付款记录
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
					<div class="weui_cell_ft trade-detail">
						<div class="fund-name red">2,000.00元</div>
						<div class="fontsize-16 red">成功</div>
					</div>
				</a>
			</div>
			<div class="weui_cells sub-form">
				<a class="weui_cell" href="javascript:;">
					<div class="trade-type">
						<span class="type-blue">收款</span>
					</div>
					<div class="weui_cell_primary">
						<div class="fund-name fontsize-16">建行[尾号1501]</div>
						<div>2016-12-26 13:45:59</div>
					</div>
					<div class="weui_cell_ft trade-detail">
						<div class="fund-name red">2,000.00元</div>
						<div class="fontsize-16 green">失败</div>
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
					<div class="weui_cell_ft trade-detail">
						<div class="fund-name green">2,000.00元</div>
						<div class="fontsize-16 red">成功</div>
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
</div>
</#macro>
<#include "../common/main.ftl">