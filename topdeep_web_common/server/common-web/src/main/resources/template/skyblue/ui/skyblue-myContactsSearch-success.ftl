<#macro jsimport>
<script>
$(document).ready(function(){
})
</script>
</#macro>
<#macro htmlbody>
<div class="container">
	<div class="header">
		<div class="header-container">
			<div class="hl">
				<a href="javascript:history.go(-1);" class="back">
					<i class="icon-back"></i>
				</a>
			</div>
			<div class="title">搜索</div>
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
		<div class="weui_cells sub-form bg-gray">
			<div class="weui_cell">
				<div class="weui_cell_bd weui_cell_primary">
					<div class="black">历史搜索记录</div>
				</div>
			</div>
			<div class="weui_cell">
				<div class="weui_cell_bd weui_cell_primary">
					<p>小猫</p>
				</div>
			</div>
			<div class="weui_cell">
				<div class="weui_cell_bd weui_cell_primary">
					<p>张希</p>
				</div>
			</div>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">