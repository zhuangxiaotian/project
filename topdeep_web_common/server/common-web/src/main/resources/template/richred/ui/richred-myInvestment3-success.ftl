<#macro htmlbody>
<div id="box">
    <header class="header">
        <div class="hl">
            <a href="javascript:history.go(-1);">
                <i class="icon-left"></i>
            </a>
        </div>
        <div class="title">
            定投明细
        </div>
        <div class="hr">
            &nbsp;
        </div>
    </header>
    <div class="fund-list1">
        <div class="fund-style sub-l">
            <span class="fund-type">混合</span>
            <span>诺安成长<i class="fund-code">320007</i></span>
        </div>
        <div class="sub-r">
            <span>最新净值(元)：<em class="red">1.5235</em></span>
        </div>

        <div class="clearfix"></div>
    </div>
    <table class="fund-table sub-placeholder border-yellow">
        <tbody>
        <tr>
            <td class="trend fontsize-16">每月5日</td>
            <td class="fontsize-16">1,390.00</td>
            <td class="fontsize-16">招商银行<em class="font-color fontsize-14">[7337]</em></td>
        </tr>
        <tr>
            <td><i class="fund-code">扣款日期</i></td>
            <td><i class="fund-code">定投金额(元)</i></td>
            <td><i class="fund-code">资金来源</i></td>
        </tr>
        </tbody>
    </table>
    <div class="investment">
        <div class="fund-list1 investment-detail">
            <div class="sub-l">
                <span class="fontsize-16">扣款明细</span>
            </div>
            <div class="sub-r">
                <span class="">已成功扣款<em class="red">3</em>次</span>
            </div>
            <div class="clearfix"></div>
        </div>
        <table class="fund-table investment-table">
            <thead>
            <tr>
                <th>扣款时间</th>
                <th>定投金额</th>
                <th>成交净值</th>
                <th>确认份额</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>2016-11-11</td>
                <td>1500</td>
                <td>1.1314</td>
                <td>8,234.11</td>
            </tr>
            <tr>
                <td>2016-11-11</td>
                <td>1500</td>
                <td>1.1314</td>
                <td>8,234.11</td>
            </tr>
            <tr>
                <td>2016-11-11</td>
                <td>1500</td>
                <td>1.1314</td>
                <td>8,234.11</td>
            </tr>
            <tr>
                <td>2016-11-11</td>
                <td>1500</td>
                <td>1.1314</td>
                <td>8,234.11</td>
            </tr>
            <tr>
                <td>2016-11-11</td>
                <td>1500</td>
                <td>1.1314</td>
                <td>8,234.11</td>
            </tr>
            <tr>
                <td>2016-11-11</td>
                <td>1500</td>
                <td>1.1314</td>
                <td>8,234.11</td>
            </tr>
            <tr>
                <td>2016-11-11</td>
                <td>1500</td>
                <td>1.1314</td>
                <td>8,234.11</td>
            </tr>
            <tr>
                <td>2016-11-11</td>
                <td>1500</td>
                <td>1.1314</td>
                <td>8,234.11</td>
            </tr>
            </tbody>
        </table>
    </div>
    <div class="sub-content">
        <div class="tip-left">
            <i class="icon-dollarstotal"></i>累积定投金额：<em class="red">4,500.00</em>
        </div>
        <div class="tip-left">
            <i class="icon-calculator"></i>累积确认份额：<em class="red">3,600.00</em>
        </div>
        <div class="tip-left">
            <i class="icon-abacus"></i>平均定投成本：<em class="red">1.5645</em>
        </div>


    </div>
</div>
<div class="sub-btn sub-padding">
    <a href="javascript:;" class="sub-btn-l bg-yellow">暂停</a>
    <a href="#" class="sub-btn-r">修改</a>
</div>
</#macro>
<#include "../common/main.ftl">