<#macro htmlbody>
<div class="container">
	<div class="header">
		<div class="header-container">
			<div class="hl">
				<a href="javascript:history.go(-1);" class="back">
					<i class="icon-back"></i>
				</a>
			</div>
			<div class="title">取现成功</div>
			<div class="hr">&nbsp;</div>
		</div>
	</div>
	<div class="weui_tab_bd">
		<div class="sub-content bg-white">
			<div class="state"><span class="icon-success"></span></div>
			<div class="state-detail">取现受理成功！</div>
			<div class="sub-step">
				<div class="step-pic">
					<img src="${base}/static/skin/${res.skin}/images/icon_step_f.png" alt="状态一">
				</div>
				<div class="step">
					<div class="step1">
						<div>16-02-14 16:48:59</div>
						<div class="fontsize-16">取现金额<em>1999.99</em>元</div>
					</div>
					<div class="step2 over">
						<div>16-02-14</div>
						<div class="fontsize-16">预计资金到账</div>
					</div>
				</div>
			</div>
		</div>
		<div class="btn padding-spacing sub-placeholder-lg">
			<a href="javascript:;" class="weui_btn bg-blue" id="test">返回主页</a>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">