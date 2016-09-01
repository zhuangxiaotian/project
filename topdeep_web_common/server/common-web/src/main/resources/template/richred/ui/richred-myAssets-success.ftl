<#macro htmlbody>
<div class="section">
	<header class="header">
        <div class="hl">&nbsp;</div>
        <div class="title">
            我的资产
        </div>
        <div class="hr">&nbsp;</div>
    </header>
    <div class="padd-m">
        <table class="fund-table fundlist-table ">
        <tbody>
        <tr>
            <td class="text-left">总资产(元)：</td>
            <td class="text-right">交易查询</td>
        </tr>
        <tr>
            <td class="fund-equity" colspan="2">1000.12</td>
        </tr>
        <!--<tr class="dashline">-->
            <!--<td class="assets-tip1">-->
                <!--<div>-->
                    <!--<a href="javascript:;">在途资金：<em>99,999,999.99</em>元</a>-->
                <!--</div>-->
            <!--</td>-->
            <!--<td class="assets-tip2">更新时间：<span>16-11-11</span></td>-->
        <!--</tr>-->
        <tr class="dashline">
            <td class="assets-tip1" colspan="2">
                <div class="sub-l">
                    <a href="javascript:;">在途资金：<em>99,999,999.99</em>元</a>
                </div>
                <div class="assets-tip2 sub-r">更新时间：<span>2016-11-11</span></div>
            </td>
        </tr>
        <tr>
            <td>
                <div class="border-right">
                    <div>昨日盈亏(元)：</div>
                    <div class="fund-equity1">1.34</div>
                </div>
            </td>
            <td>
                <div class="">
                    <div>累计盈亏(元)：</div>
                    <div class="fund-equity1">134.34</div>
                </div>
            </td>
        </tr>
        </tbody>
    </table>
    </div>
    <div class="na_fund bg-white margin0">
        <ul class="na_fund_detail margin">
            <li>
                <a href="javascript:void(0)" class="na_fund_title">
                    <i class="icon-cashlight"></i>
                    现金宝账户
                </a>
            </li>
            <li>
                <span class="fund-type-orange">随用随取</span>
            </li>
        </ul>
        <table class="fund-table">
            <thead>
            <tr class="flex">
                <th class="flex-cell">余额(元)</th>

                <th class="flex-cell">昨日收益(元)</th>
            </tr>
            </thead>
            <tbody>
            <tr class="flex">
                <td class="red fontsize-l flex-cell">99,999,999.99</td>

                <td class="red fontsize-l flex-cell">3.36</td>
            </tr>
            </tbody>
        </table>
        <div class="sub-btn sub-padding">
            <div class="sub-btn-l bg-orange">取现</div>
            <div class="sub-btn-r">立即充值</div>
        </div>
    </div>
    <div class="na_fund margin0">
        <ul class="na_fund_detail margin">
            <li>
                <a href="javascript:void(0)" class="na_fund_title">
                    <i class="icon-dollarscoins"></i>
                    基金账户<span class="tip-md red">(市值60000.00元)</span>
                </a>
            </li>
            <li>
            </li>
        </ul>
    </div>
    <div class="fund-list1 sub-margin-d">
             <div class="sub-l">
                <span class="fund-type">混合</span>
                <span>诺安益鑫保本 <i class="fund-code">320007</i></span>
                <!--<a class="fund-r">-->
                    <!--<i class="icon-right-red"></i>-->
                <!--</a>-->
             </div>

             <div class="sub-r">
                    <span class="fund-type-orange1">诺安直销</span>
             </div>

           <div class="clearfix"></div>
           <table class="fund-table">
            <tbody>
                <tr>
                    <td class="w1 fontsize-16" rowspan="2">20,000,000.00</td>
                    <td class="w1 fontsize-16">1.3901</td>
                    <td class="w2 blue fontsize-16" rowspan="2">-3.36</td>
                </tr>
                <tr>
                    <td class="trend blue td-height-s">
                        <div class="fund-tips-s">
                            (-1.39%)
                        </div>
                    </td>
                </tr>
                <tr>
                    <td ><i class="w1 fund-code">市值(元)</i></td>
                    <td ><i class="w1 fund-code">净值(元)/日涨跌</i></td>
                    <td ><i class="w2 fund-code">昨日盈亏(元)</i></td>
                </tr>
            </tbody>
        </table>
    </div>
    
    <div class="fund-list1 sub-margin-d">
                <div class="sub-l">
                    <span class="fund-type">混合</span>
                    <span>诺安益鑫保本 <i class="fund-code">320007</i></span>
                    <!--<a class="fund-r">-->
                    <!--<i class="icon-right-red"></i>-->
                    <!--</a>-->
                </div>

                <div class="sub-r">
                    <span class="fund-type-orange1 bg-gray">工行代销</span>
                </div>

                <div class="clearfix"></div>

            <table class="fund-table" >
                <tbody>

                <tr>
                    <td class="w1 fontsize-16" rowspan="2">2000</td>
                    <td class="w1 fontsize-16">1.3901</td>
                    <td class="w2 red fontsize-16" rowspan="2">3.36</td>
                </tr>
                <tr>
                    <td class="trend red td-height-s">
                        <div class="fund-tips-s">
                            (1.39%)
                        </div>
                    </td>
                </tr>
                <tr>
                    <td ><i class="w1 fund-code">市值(元)</i></td>
                    <td ><i class="w1 fund-code">净值(元)/日涨跌</i></td>
                    <td ><i class="w2 fund-code">昨日盈亏(元)</i></td>
                </tr>
                </tbody>
            </table>
        </div>
</div>
<div class="tab-placeholder"></div>
<footer class="footer">
    <ul class="index-tab">
        <li>
            <a href="${base}/ui/richred.action?type=index">
                <i class="icon-home"></i>
                <p>首页精选</p>
            </a>
        </li>
        <li>
            <a href="${base}/ui/richred.action?type=fundManage">
                <i class="icon-finance"></i>
                <p>基金理财</p>
            </a>
        </li>
        <li class="active">
            <a href="javascript:void(0)">
                <i class="icon-assets"></i>
                <p>我的资产</p>
            </a>
        </li>
        <li>
            <a href="${base}/ui/richred.action?type=my">
                <i class="icon-account"></i>
                <p>我的</p>
            </a>
        </li>
    </ul>
</footer>
</#macro>
<#include "../common/main.ftl">