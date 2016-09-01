<#macro jsimport>
<script>
	$(document).ready(function(){
		$('.tab-fund>div').on('click', function(event) {
			$('.tab-fund>div').removeClass('active');
			$(this).addClass('active');
			$('.tab-fund-pannel').hide();
			$('.tab-fund-pannel').eq($(this).index()).show();
		});
		$('.tab-chart li').on('click', function(event) {
			$('.tab-chart li').removeClass('active');
			$(this).addClass('active');
			$('.tab-cont').hide();
			$('.tab-cont').eq($(this).index()).show();
		});
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
			<div class="title">建信货币基金（530002）</div>
			<div class="hr">&nbsp;</div>
		</div>
	</div>
	<div class="weui_tab_bd section">
		<div class="bg-fund">
			<table class="table table-flex">
				<tbody>
				<tr>
					<td class="fund-title">七日年化</td>
					<td class="fund-title">万份收益</td>
				</tr>
				<tr>
					<td class="fund-num">3.712%</td>
					<td class="fund-num">2.1251</td>
				</tr>
				</tbody>
			</table>
			<div class="sub-cell font-white padding-spacing-lr">
				<div class="flex-cell text-r">数据日期：2016-12-26</div>
			</div>
		</div>
		<div class="tab-fund">
			<div class="active"><a href="javascript:;">七日年化<i class="icon-percent"></i></a></div>
			<div class=""><a href="javascript:;">万份收益</a></div>
			<div class=""><a href="javascript:;">每日收益</a></div>
		</div>
		<div class="tab-fund-pannel">
			<div class="sub-content">折线图</div>
			<ul class="tab-chart">
				<li class="active">
					<a href="javascript:;">一个月</a>
				</li>
				<li>
					<a href="javascript:;">三个月</a>
				</li>
				<li>
					<a href="javascript:;">一年</a>
				</li>
			</ul>
			<div class="weui_cells sub-form">
				<a class="weui_cell" href="${base}/ui/skyblue.action?type=fundDetail">
					<div class="weui_cell_primary">
						<p>基金详情</p>
					</div>
					<div class="weui_cell_ft"></div>
				</a>
			</div>
			<div class="sub-cell padding-b20 sub-placeholder-lg">
				<div class="flex-cell btn"><a href="${base}/ui/skyblue.action?type=cash" class="weui_btn bg-yellow">取现</a></div>
				<div class="flex-cell btn"><a href="${base}/ui/skyblue.action?type=recharge" class="weui_btn bg-blue">充值</a></div>
			</div>
		</div>
		<div class="tab-fund-pannel" style="display: none;"></div>
		<div class="tab-fund-pannel" style="display: none;">
			<div class="padding-spacing-lr">
				<table class="table table-flex border-bottom">
					<thead>
					<tr>
						<th>日期</th>
						<th>七日年化</th>
						<th>万份收益</th>
					</tr>
					</thead>
				</table>
				<table class="table table-flex table-daily">
					<tbody>
					<tr class="border-bottom">
						<td>2016-09-26</td>
						<td>3.578%</td>
						<td>2.1456</td>
					</tr>
					<tr class="border-bottom">
						<td>2016-09-26</td>
						<td>3.578%</td>
						<td>2.1456</td>
					</tr>
					<tr class="border-bottom">
						<td>2016-09-26</td>
						<td>3.578%</td>
						<td>2.1456</td>
					</tr>
					<tr class="border-bottom">
						<td>2016-09-26</td>
						<td>3.578%</td>
						<td>2.1456</td>
					</tr>
					<tr class="border-bottom">
						<td>2016-09-26</td>
						<td>3.578%</td>
						<td>2.1456</td>
					</tr>
					<tr class="border-bottom">
						<td>2016-09-26</td>
						<td>3.578%</td>
						<td>2.1456</td>
					</tr>
					<tr class="border-bottom">
						<td>2016-09-26</td>
						<td>3.578%</td>
						<td>2.1456</td>
					</tr>
					<tr class="border-bottom">
						<td>2016-09-26</td>
						<td>3.578%</td>
						<td>2.1456</td>
					</tr>
					<tr class="border-bottom">
						<td>2016-09-26</td>
						<td>3.578%</td>
						<td>2.1456</td>
					</tr>
					<tr class="border-bottom">
						<td>2016-09-26</td>
						<td>3.578%</td>
						<td>2.1456</td>
					</tr>
					</tbody>
				</table>
			</div>
			<div class="foot-fund">
				<div class="arrow-down"><a href="${base}/ui/skyblue.action?type=fundValue"><img src="${base}/static/skin/${res.skin}/images/arrow_down.png" alt="下箭头"/></a></div>
				<div class="sub-cell">
					<div class="flex-cell btn"><a href="${base}/ui/skyblue.action?type=cash" class="weui_btn bg-yellow">取现</a></div>
					<div class="flex-cell btn"><a href="${base}/ui/skyblue.action?type=recharge" class="weui_btn bg-blue">充值</a></div>
				</div>
			</div>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">