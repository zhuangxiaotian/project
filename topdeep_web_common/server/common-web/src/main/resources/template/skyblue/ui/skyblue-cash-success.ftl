<#macro jsimport>
<script>
	$(document).on("click",".sub-radio",function(){
		$(this).siblings().find(".icon-radio").removeClass("icon-radio-s");
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
		<div class="table-cash-box">
			<table class="table table-cash">
				<thead>
				<tr>
					<th>&nbsp;</th>
					<th>我的银行卡</th>
					<th>总份额</th>
					<th>可用份额</th>
				</tr>
				</thead>
				<tbody>
				<tr class="sub-radio">
					<td>
                        <a href="javascript:;">
                            <i class="icon-radio icon-radio-s"></i>
                        </a>
                    </td>
					<td>
						<div class="cash-bank">
							<i class="bank-b005"></i>
							<div class="flex-cell text-l">
								<div>建设银行</div>
								<div>[尾号0335]</div>
							</div>
						</div>
					</td>
					<td>1,666,888.00</td>
					<td>951.99</td>
				</tr>
				<tr class="sub-radio">
					<td>
                        <a href="javascript:;">
                            <i class="icon-radio"></i>
                        </a>
                    </td>
					<td>
						<div class="cash-bank">
							<i class="bank-b005"></i>
							<div class="flex-cell text-l">
								<div>建设银行</div>
								<div>[尾号0335]</div>
							</div>
						</div>
					</td>
					<td>1,666,888.00</td>
					<td>951.99</td>
				</tr>
				<tr class="sub-radio">
					<td>
                        <a href="javascript:;">
                            <i class="icon-radio"></i>
                        </a>
                    </td>
					<td>
						<div class="cash-bank">
							<i class="bank-b005"></i>
							<div class="flex-cell text-l">
								<div>建设银行</div>
								<div>[尾号0335]</div>
							</div>
						</div>
					</td>
					<td>1,666,888.00</td>
					<td>951.99</td>
				</tr>
				</tbody>
			</table>
		</div>
		<div class="btn sub-placeholder-lg padding-spacing">
			<a href="javascript:;" class="weui_btn bg-blue">确认</a>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">