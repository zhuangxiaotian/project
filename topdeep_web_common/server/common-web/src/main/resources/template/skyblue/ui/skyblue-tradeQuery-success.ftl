<#macro htmlbody>
<div class="container">
	<div class="header">
		<div class="header-container">
			<div class="hl">
				<a href="javascript:history.go(-1);" class="back">
					<i class="icon-back"></i>
				</a>
			</div>
			<div class="title">分类查询</div>
			<div class="hr">&nbsp;</div>
		</div>
	</div>
	<div class="weui_tab_bd">
		<div class="weui_search_bar">
			<form class="weui_search_outer">
				<div class="weui_search_inner">
					<i class="weui_icon_search"></i>
					<input type="search" class="weui_search_input"  placeholder="搜索" required="">
				</div>
			</form>
		</div>
		<div class="weui_cells sub-form margin-spacing0">
			<div class="weui_cell">
				<div class="weui_cell_bd weui_cell_primary">
					<p>充值</p>
				</div>
			</div>
			<div class="weui_cell">
				<div class="weui_cell_bd weui_cell_primary">
					<p>取现</p>
				</div>
			</div>
			<div class="weui_cell">
				<div class="weui_cell_bd weui_cell_primary">
					<p>收益</p>
				</div>
			</div>
			<div class="weui_cell">
				<div class="weui_cell_bd weui_cell_primary">
					<p>收款</p>
				</div>
			</div>
			<div class="weui_cell">
				<div class="weui_cell_bd weui_cell_primary">
					<p>付款</p>
				</div>
			</div>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">