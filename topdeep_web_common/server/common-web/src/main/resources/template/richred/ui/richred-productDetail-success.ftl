<#macro htmlbody>
<div>
	<header class="header">
	    <div class="hl">
	        <a href="javascript:history.go(-1);">
	            <i class="icon-left"></i>
	            诺安成长混合
	        </a>
	    </div>
	    <div class="hr">
	        <a href="javascript:;">
	            <!--<i class="icon-detail"></i>-->
	            产品详情
	        </a>
	    </div>
	</header>
	<div class="">
	    <table class="fund-table fundlist-table">
	        <tbody>
	        <tr>
	            <td>基金市值<span class="equity-tip">(元)</span></td>
	            <td>最新净值<span class="equity-tip">(16-11-11)</span></td>
	        </tr>
	        <tr>
	            <td class="fund-equity">1000.12</td>
	            <td class="fund-equity">
	                1.3123
	                <div class="equity-tip">(+0.12%)</div>
	            </td>
	        </tr>
	        <tr>
	            <td class="text-l">累积盈亏（元）：</td>
	            <td class="equity-detail text-r">
	                234.56
	                <i class="icon-right-white"></i>
	            </td>
	        </tr>
	        </tbody>
	    </table>
	</div>
	<div class="dividend">
	    <div class="dividend-title">
	        <span>持有明细</span>
	    </div>
	    <div class="dividend-detail">
	        诺安直销
	    </div>
	    <div class="shadow-bottom">
	        <table class="fund-table">
	            <thead>
	            <tr class="border-bottom">
	                <th>持有份额</th>
	                <th>可用份额</th>
	                <th>市值</th>
	                <th>支付渠道</th>
	            </tr>
	            </thead>
	            <tbody>
	            <tr class="border-top">
	                <td>1</td>
	                <td>2016-11-11</td>
	                <td>1.1314</td>
	                <td>
	                    <div>中国银行</div>
	                    <div>(5700)</div>
	                </td>
	            </tr>
	            <tr class="border-top">
	                <td>2</td>
	                <td>2016-11-11</td>
	                <td>1.1314</td>
	                <td>
	                    <div>中国银行</div>
	                    <div>(5700)</div>
	                </td>
	            </tr>
	            </tbody>
	        </table>
	    </div>
	</div>
	<ul class="sub-list1 shadow-bottom">
	    <a href="javascript:;">
	        <li>
	                    <span class>
	                        交易查询
	                    </span>
	                    <span class="sub-r">
	                        <i class="icon-right-red"></i>
	                    </span>
	        </li>
	    </a>
	    <a href="javascript:;">
	        <li>
	                    <span class>
	                        分红方式变更
	                    </span>
	                    <span class="sub-r">
	                        <span class="red">红利再投</span>
	                    </span>
	        </li>
	    </a>
	</ul>
</div>
<div class="fixed-place"></div>
<div class="warm-tips fixed-bottom">
	<div class="group-btn sub-padding">
	    <div class="sub-btn">
	        <a href="${base}/ui/richred.action?type=fundRedeem1" class="sub-btn2 bg-orange">赎回</a>
	    </div>
	    <div class="sub-btn">
	        <a href="${base}/ui/richred.action?type=fundTransfer2" class="sub-btn2 bg-yellow">转换</a>
	    </div>
	    <div class="sub-btn">
	        <a href="${base}/ui/richred.action?type=fundPurchase1" class="sub-btn2">购买</a>
	    </div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">