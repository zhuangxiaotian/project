<#macro jsimport>
<script>
	$(document).on("click",".sub-radio",function(){
		$(this).parent().siblings().find(".icon-radio").removeClass("icon-radio-s");
		$(this).find(".icon-radio").addClass('icon-radio-s');
	})
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
			<div class="title">取现</div>
			<div class="hr">&nbsp;</div>
		</div>
	</div>
	<div class="weui_tab_bd">
		<div class="weui_cells_title">预计XX日到账</div>
		<div class="weui_cells sub-form">
			<div class="weui_cell sub-select">
				<div>
					<label class="weui_label">到账银行卡</label>
				</div>
				<div class="weui_cell_primary">
					<div class="select" id="bankSelect"></div>
				</div>
			</div>
			<div class="weui_cell">
				<div class=""><label class="weui_label">可取金额 (元)</label></div>
				<div class="weui_cell_primary">
					<div class="text-r red">
						1000,000.00元
					</div>
				</div>
			</div>
			<div class="weui_cell">
				<div class=""><label class="weui_label">取现金额 (元)</label></div>
				<div class="weui_cell_primary">
					<div class="sub-l">
						<a href="javascript:;" class="weui_btn bg-yellow-l">全部取现</a>
					</div>
					<div class="text-r red">
						1000,000.00元
					</div>
				</div>
			</div>
			<div class="weui_cell">
				<div class=""><label class="weui_label">取现方式</label></div>
				<div class="weui_cell_primary">
					<div class="text-r">
						<ul class="radio-list clearfix">
							<li data-number="1" data-name="draw" class="active"><i class="icon-radio"></i>实时</li>
							<li data-number="2" data-name="draw"><i class="icon-radio"></i>普通</li>
						</ul>
					</div>
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