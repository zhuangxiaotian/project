<#macro jsimport>
<script>
$(document).ready(function(){
	$('.tab2 li').on('click', function(event) {
		$('.tab2 li').removeClass('cur');
		$(this).addClass('cur');
		$('.tab2-cont').hide();
		$('.tab2-cont').eq($(this).index()).show();
	});
})
</script>
</#macro>
<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:;">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">总资产走势</div>
    <div class="hr">&nbsp;</div>
</header>
<ul class="tab2">
    <li class="cur">
        <a href="javascript:;">近1月</a>
    </li>
    <li>
        <a href="javascript:;">近3月</a>
    </li>
    <li>
        <a href="javascript:;">近6月</a>
    </li>
    <li>
        <a href="javascript:;">近1年</a>
    </li>
</ul>
<div class="clearfix">chart</div>
<table class="fund-table">
    <thead>
    <tr>
        <th>持有基金</th>
        <th>盈亏(元)</th>
        <th>购买渠道</th>
    </tr>
    </thead>
    <tbody>
    <tr class="border-top">
        <td>基金1</td>
        <td class="trend red">+1.1314</td>
        <td><span class="fund-type-orange1">诺安直销</span></td>
    </tr>
    <tr class="border-top">
        <td>基金2</td>
        <td class="blue">-1.1314</td>
        <td><span class="fund-type-orange1 bg-gray">上海好买</span></td>
    </tr>
    </tbody>
</table>
</#macro>
<#include "../common/main.ftl">