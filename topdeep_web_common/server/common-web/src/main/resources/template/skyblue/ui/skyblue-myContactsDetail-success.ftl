<#macro htmlbody>
<div class="container">
	<div class="header">
		<div class="header-container">
			<div class="hl">
				<a href="javascript:history.go(-1);" class="back">
					<i class="icon-back"></i>
				</a>
			</div>
			<div class="title">详细资料</div>
			<div class="hr"><a href="javascript:;"><i class="icon-search"></i></a></div>
		</div>
	</div>
	<div class="weui_tab_bd">
		<div class="weui_cells sub-form">
			<div class="weui_cell">
				<div class=""><label class="weui_label">昵称</label></div>
				<div class="weui_cell_primary">
					<div class="text-r">
						听风。
					</div>
				</div>
			</div>
			<div class="weui_cell">
				<div class=""><label class="weui_label">姓名</label></div>
				<div class="weui_cell_primary">
					<div class="text-r">
						夏沫
					</div>
				</div>
			</div>
			<div class="weui_cell">
				<div class=""><label class="weui_label">手机号</label></div>
				<div class="weui_cell_primary">
					<div class="text-r">
						138****0653
					</div>
				</div>
			</div>
		</div>
		<div class="weui_cells sub-form">
			<div class="weui_cell">
				<div class=""><label class="weui_label">备注</label></div>
				<div class="weui_cell_primary">
					<div class="text-r">
						听风。
					</div>
				</div>
			</div>
			<div class="weui_cell">
				<div class=""><label class="weui_label">标记</label></div>
				<div class="weui_cell_primary">
					<div class="text-r">
						<ul class="radio-list clearfix">
							<li data-number="1" data-name="draw" class="active"><i class="icon-radio"></i>无</li>
							<li data-number="2" data-name="draw"><i class="icon-radio"></i>关注</li>
							<li data-number="3" data-name="draw"><i class="icon-radio"></i>黑名单</li>
						</ul>
					</div>
				</div>
			</div>
			<a class="weui_cell" href="javascript:;">
				<div class="weui_cell_primary">
					<p>交易记录</p>
				</div>
				<div class="weui_cell_ft"></div>
			</a>
		</div>
		<div class="btn padding-spacing sub-placeholder-lg">
			<a href="javascript:;" class="weui_btn bg-blue">我要收付款</a>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">