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
			<div class="hr">&nbsp;</div>
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
					<div class="text-r red">
						1000,000.00元
					</div>
				</div>
			</div>
			<div class="weui_cell">
				<div class=""><label class="weui_label">协议号</label></div>
				<div class="weui_cell_primary">
					<div class="text-r">
						
					</div>
				</div>
			</div>
			<div class="weui_cell">
				<div class=""><label class="weui_label">备注</label></div>
				<div class="weui_cell_primary">
					<div class="text-r">
						天黑请闭眼
					</div>
				</div>
			</div>
		</div>
		<div class="qrcode">
			<div class="qrcode-box">
				<img src="${base}/static/skin/${res.skin}/images/qrcode.jpg" alt="二维码"/>
				<div class="qrcode-scan">请付款方扫描二维码</div>
			</div>
		</div>
		<div class="btn padding-spacing sub-placeholder-lg">
			<a href="javascript:;" class="weui_btn bg-blue">取消收款</a>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">