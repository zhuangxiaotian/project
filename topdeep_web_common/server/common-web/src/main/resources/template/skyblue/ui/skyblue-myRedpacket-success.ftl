<#macro htmlbody>
<div class="container">
	<div class="header">
		<div class="header-container">
			<div class="hl">
				<a href="javascript:history.go(-1);" class="back">
					<i class="icon-back"></i>
				</a>
			</div>
			<div class="title">我的红包</div>
			<div class="hr">&nbsp;</div>
		</div>
	</div>
	<div class="weui_tab_bd">
		<div class="bg-redpacket">
			<div class="sub-cell font-white padding-spacing-lr">
				<div class="flex-cell">
					红包总金额
				</div>
			</div>
			<div class="sub-cell">
				<div class="weui_cell_primary my-redpacket">
					<span class="money">12.85</span>元
				</div>
			</div>
		</div>
		<div class="sub-cell padding-spacing-lr">
			<div class="flex-cell fontsize-16 black">红包活动明细</div>
		</div>
		<div class="weui_cells sub-form margin-spacing0">
			<div class="weui_cell" href="javascript:;">
				<div class="trade-type">
					<span class="icon-redpacket"></span>
				</div>
				<div class="weui_cell_primary">
					<div class="fund-name fontsize-16">红包</div>
					<div>2016-12-26 13:45:59</div>
				</div>
				<div class="red fontsize-18">10元</div>
			</div>
			<div class="weui_cell" href="javascript:;">
				<div class="trade-type">
					<span class="icon-redpacket"></span>
				</div>
				<div class="weui_cell_primary">
					<div class="fund-name fontsize-16">红包</div>
					<div>2016-12-26 13:45:59</div>
				</div>
				<div class="red fontsize-18">20元</div>
			</div>
			<div class="weui_cell" href="javascript:;">
				<div class="trade-type">
					<span class="icon-redpacket"></span>
				</div>
				<div class="weui_cell_primary">
					<div class="fund-name fontsize-16">红包</div>
					<div>2016-12-26 13:45:59</div>
				</div>
				<div class="red fontsize-18">30元</div>
			</div>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">