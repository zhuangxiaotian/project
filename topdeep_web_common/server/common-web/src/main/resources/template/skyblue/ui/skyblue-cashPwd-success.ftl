<#macro jsimport>
<script>
	$(document).on("click",".sub-radio",function(){
		$(this).parent().siblings().find(".icon-radio").removeClass("icon-radio-s");
		$(this).find(".icon-radio").addClass('icon-radio-s');
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
			<div class="title">取现</div>
			<div class="hr">&nbsp;</div>
		</div>
	</div>
	<div class="weui_tab_bd">
		<div class="weui_cells_title">预计XX日到账</div>
		<div class="weui_cells sub-form">
			<div class="weui_cell">
				<div class=""><label class="weui_label">到账银行卡</label></div>
				<div class="weui_cell_primary">
					<div class="text-r">
						<i class="bank-b005"></i><span>建设银行[尾号5102]</span>
					</div>
				</div>
			</div>
			<div class="weui_cell">
				<div class=""><label class="weui_label">取现金额 (元)</label></div>
				<div class="weui_cell_primary">
					<div class="text-r red">
						1000,000.00元
					</div>
				</div>
			</div>
			<div class="weui_cell">
				<div class=""><label class="weui_label">取现方式</label></div>
				<div class="weui_cell_primary">
					<div class="text-r">实时</div>
				</div>
			</div>
		</div>
		<div class="weui_cells sub-form">
			<div class="weui_cell">
				<div class=""><label class="weui_label">交易密码</label></div>
				<div class="weui_cell_primary">
					<input class="weui_input" type="password"　 placeholder=""/>
				</div>
			</div>
		</div>
		<div class="btn sub-placeholder-lg padding-spacing">
			<a href="javascript:;" class="weui_btn bg-blue">下一步</a>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">