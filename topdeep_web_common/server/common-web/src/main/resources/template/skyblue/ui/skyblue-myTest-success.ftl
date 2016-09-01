<#macro jsimport>
<script>
$(document).on("click",".sub-radio",function(){
	$(this).parent().siblings().find(".icon-radio").removeClass("icon-radio-s");
	$(this).find(".icon-radio").addClass('icon-radio-s');
})
$(document).on("click","#test",function(){
	showConfirm("您的得分是：<strong>9.99</strong>分<br/>您的风险测评等级是：稳健型","留在此页","返回首页","warning");
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
			<div class="title">问卷调查</div>
			<div class="hr">&nbsp;</div>
		</div>
	</div>
	<div class="progress">
		<div class="weui_progress">
			<div class="weui_progress_bar">
				<div class="weui_progress_inner_bar js_progress" style="width: 89%;"></div>
			</div>
			<div><em class="blue">10</em>/<em>12</em></div>
		</div>
	</div>
	<div class="weui_tab_bd risk-test">
		<div class="weui_cells sub-form">
			<div class="weui_cell">
				<div class="weui_cell_primary">
					<div class="fontsize-16">1.您当前的个人及家庭财务状况属于以下哪一种?</div>
					<div>
						<a href="javascript:;" class="sub-radio">
							<i class="icon-radio icon-radio-s"></i>
							有较大数额未到期负债
						</a>
					</div>
					<div>
						<a href="javascript:;" class="sub-radio">
							<i class="icon-radio"></i>
							收入和支出相抵
						</a>
					</div>
					<div>
						<a href="javascript:;" class="sub-radio">
							<i class="icon-radio"></i>
							有一定积蓄
						</a>
					</div>
					<div>
						<a href="javascript:;" class="sub-radio">
							<i class="icon-radio"></i>
							有较丰富的积蓄并有一定的投资
						</a>
					</div>
				</div>
			</div>
			<div class="weui_cell">
				<div class="weui_cell_primary">
					<div class="weui_cell_primary">
						<div class="fontsize-16">2.您当前的个人及家庭财务状况属于以下哪一种?</div>
						<div>
							<a href="javascript:;" class="sub-radio">
								<i class="icon-radio icon-radio-s"></i>
								有较大数额未到期负债
							</a>
						</div>
						<div>
							<a href="javascript:;" class="sub-radio">
								<i class="icon-radio"></i>
								收入和支出相抵
							</a>
						</div>
						<div>
							<a href="javascript:;" class="sub-radio">
								<i class="icon-radio"></i>
								有一定积蓄
							</a>
						</div>
						<div>
							<a href="javascript:;" class="sub-radio">
								<i class="icon-radio"></i>
								有较丰富的积蓄并有一定的投资
							</a>
						</div>
					</div>
				</div>
			</div>
			<div class="weui_cell">
				<div class="weui_cell_primary">
					<div class="weui_cell_primary">
						<div class="fontsize-16">3.您当前的个人及家庭财务状况属于以下哪一种?</div>
						<div>
							<a href="javascript:;" class="sub-radio">
								<i class="icon-radio icon-radio-s"></i>
								有较大数额未到期负债
							</a>
						</div>
						<div>
							<a href="javascript:;" class="sub-radio">
								<i class="icon-radio"></i>
								收入和支出相抵
							</a>
						</div>
						<div>
							<a href="javascript:;" class="sub-radio">
								<i class="icon-radio"></i>
								有一定积蓄
							</a>
						</div>
						<div>
							<a href="javascript:;" class="sub-radio">
								<i class="icon-radio"></i>
								有较丰富的积蓄并有一定的投资
							</a>
						</div>
					</div>
				</div>
			</div>
			<div class="weui_cell">
				<div class="weui_cell_primary">
					<div class="weui_cell_primary">
						<div class="fontsize-16">4.您当前的个人及家庭财务状况属于以下哪一种?</div>
						<div>
							<a href="javascript:;" class="sub-radio">
								<i class="icon-radio icon-radio-s"></i>
								有较大数额未到期负债
							</a>
						</div>
						<div>
							<a href="javascript:;" class="sub-radio">
								<i class="icon-radio"></i>
								收入和支出相抵
							</a>
						</div>
						<div>
							<a href="javascript:;" class="sub-radio">
								<i class="icon-radio"></i>
								有一定积蓄
							</a>
						</div>
						<div>
							<a href="javascript:;" class="sub-radio">
								<i class="icon-radio"></i>
								有较丰富的积蓄并有一定的投资
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="btn sub-placeholder-lg padding-spacing">
			<a href="javascript:;" class="weui_btn bg-blue" id="test">确认提交</a>
		</div>
	</div><!--weui_tab_bd-->
</div>
</#macro>
<#include "../common/main.ftl">