<#macro jsimport>
<script>
	new showSelect("#bankSelect","#bankList");
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
			<div class="title">充值</div>
			<div class="hr">&nbsp;</div>
		</div>
	</div>
	<div class="weui_tab_bd">
		<div class="weui_cells_title">预计XX日享受收益</div>
		<div class="weui_cells sub-form">
			<div class="weui_cell sub-select">
				<div>
					<label class="weui_label">付款银行卡</label>
				</div>
				<div class="weui_cell_primary">
					<div class="select" id="bankSelect"></div>
				</div>
			</div>
			<div class="weui_cell">
				<div class=""><label class="weui_label">充值金额 (元)</label></div>
				<div class="weui_cell_primary">
					<div class="text-r red">
						1000,000.00元
					</div>
				</div>
			</div>
		</div>
		<div class="weui_cells sub-form">
			<div class="weui_cell">
				<div class=""><label class="weui_label">交易密码</label></div>
				<div class="weui_cell_primary">
					<input class="weui_input" type="password" placeholder=""/>
				</div>
			</div>
		</div>
		<div class="btn sub-placeholder-lg padding-spacing">
			<a href="javascript:;" class="weui_btn bg-blue">下一步</a>
		</div>
	</div>
</div>
<div class="select-content">
	<div class="weui_mask_transition" id="mask" style="display: none;"></div>
	<div class="weui_actionsheet select-list" id="bankList">
		<div class="weui_actionsheet_menu select-menu">
			<div class="weui_actionsheet_cell"><i class="bank-b005"></i>建设银行[尾号0501]</div>
			<div class="weui_actionsheet_cell"><i class="bank-b004"></i>中国银行[尾号0335]</div>
			<div class="weui_actionsheet_cell"><i class="bank-b002"></i>工商银行[尾号0987]</div>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">