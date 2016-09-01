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
			<div class="title">设置转让支付额度上限</div>
			<div class="hr">&nbsp;</div>
		</div>
	</div>
	<div class="weui_tab_bd">
		<div class="table-box">
			<table class="table table-set">
				<thead>
				<tr>
					<th>&nbsp;</th>
					<th>类别</th>
					<th>单笔上限</th>
					<th>每日累计上限</th>
					<th>每月累计上限</th>
				</tr>
				</thead>
				<tbody>
				<tr class="sub-radio">
					<td>
                        <a href="javascript:;">
                            <i class="icon-radio icon-radio-s"></i>
                        </a>
                    </td>
					<td>A</td>
					<td>1千</td>
					<td>5千</td>
					<td>5万</td>
				</tr>
				<tr class="sub-radio">
					<td>
                        <a href="javascript:;">
                            <i class="icon-radio"></i>
                        </a>
                    </td>
					<td>A</td>
					<td>1千</td>
					<td>5千</td>
					<td>5万</td>
				</tr>
				<tr class="sub-radio">
					<td>
                        <a href="javascript:;">
                            <i class="icon-radio"></i>
                        </a>
                    </td>
					<td>A</td>
					<td>1千</td>
					<td>5千</td>
					<td>5万</td>
				</tr>
				</tbody>
			</table>
		</div>
		<div class="btn sub-placeholder-lg padding-spacing">
			<a href="${base}/ui/skyblue.action?type=registerSet" class="weui_btn bg-blue">确认</a>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">