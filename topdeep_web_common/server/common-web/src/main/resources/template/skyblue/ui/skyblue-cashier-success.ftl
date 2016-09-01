<#macro jsimport>
<script>
$(document).ready(function(){
	$("#test").click(function(){
		pwdConfirm("text","添加收款备注","取消","确认");
	})
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
			<div class="title">收款</div>
			<div class="hr"><a href="javascript:;" id="test">添加备注</a></div>
		</div>
	</div>
	<div class="weui_tab_bd">
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
				<div class=""><label class="weui_label">收款金额</label></div>
				<div class="weui_cell_primary">
					<div class="text-r">
						1000,000.00元
					</div>
				</div>
			</div>
		</div>
		<div class="sub-cell login">
                    <div class="text-l sub-check sub-check-s">
                        <i class="icon-checkbox"></i><span>我已阅读并同意</span>
                    </div>
                    <div class="flex-cell"><a href="javascript:;" class="blue">《建信基金XX协议》</a></div>
        </div>
		<div class="btn padding-spacing sub-placeholder-lg">
			<a href="javascript:;" class="weui_btn bg-blue">下一步</a>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">