<#macro jsimport>
<script>
$(document).ready(function(){
	$('.tab li').on('click', function(event) {
		$('.tab li').removeClass('cur');
		$(this).addClass('cur');
		$('.tab-cont').hide();
		$('.tab-cont').eq($(this).index()).show();
	});
	$('.tab2 li').on('click', function(event) {
		$('.tab2 li').removeClass('cur');
		$(this).addClass('cur');
		$('.tab2-cont').hide();
		$('.tab2-cont').eq($(this).index()).show();
	});
	$(".content-toggle").click(function(){
    	$(this).find(".icon-down").toggleClass("icon-up");
    	$(this).parent().parent().find(".fundlist-content").toggle();
    })
})
</script>
</#macro>
<#macro htmlbody>
<header class="header">
    <div class="hr-lg">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
            诺安成长混合(000818)
        </a>
    </div>
    <div class="hr">
    </div>
</header>
<div class="container">
	<table class="fund-table trend-table">
    <tbody>
    <tr>
        <td class="center">最新净值(元)</td>
        <td class="center">日涨跌幅<span class="equity-tip">(16-11-11)</span></td>
    </tr>
    <tr>
        <td class="fund-trend">
            1.3123
            <div class="line"></div>
        </td>
        <td class="fund-equity">
            1.34%
        </td>
    </tr>
    </tbody>
</table>
<div class="fund_adv sub-placeholder">
    <span class="fund-type-red">每日计息</span>
    <span class="fund-type-red">随存随取</span>
    <span class="fund-type-red">1折买基金</span>
    <span class="fund-type-red">实时到账</span>
</div>
<ul class="tab tab-trend">
    <li class="cur">
        <a href="javascript:;">基金详情</a>
    </li>
    <li>
        <a href="javascript:;">每日净值</a>
    </li>
    <li>
        <a href="javascript:;">基金对比</a>
    </li>
</ul>
<!--基金详情开始-->
<div class="tab-cont fundlist-cont" style="display: block">
    <div class="chart clearfix">
        <div class="tip-left clearfix">
            最近一月涨跌幅  <em class="red">4.09%</em>
        </div>
        <div class="chart-detail">折线图</div>
    </div>
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
    <div class="fundlist-panel">
        <ul class="sub-list1">
            <a href="javascript:;" class="content-toggle">
                <li class="funflist">
                    <span class="fundlist-title">简介</span>
                <span class="sub-r">
                    <i class="icon-down"></i>
                </span>
                </li>
            </a>
        </ul>
        <table class="fund-table-l fundlist-content border-top">
            <tbody>
            <tr>
                <td class="fund-manage">基金经理</td>
                <td>
                    夏沫，复旦大学经济学博士，伦敦商学院金融学硕士
                </td>
            </tr>
            <tr>
                <td class="fund-manage">资产净值</td>
                <td class="border-top">
                    2.71亿元(270,635,241.33元)<em>2016-11-11</em>
                </td>
            </tr>
            <tr>
                <td class="fund-manage">成立时间</td>
                <td class="border-top">
                    2016-11-11
                </td>
            </tr>
            <tr>
                <td class="fund-manage">业绩基准</td>
                <td class="border-top">
                    100%X活期存款利率(税后)
                </td>
            </tr>
            </tbody>
        </table>
    </div>
    <div class="fundlist-panel">
        <ul class="sub-list1">
            <a href="javascript:;" class="content-toggle">
                <li class="funflist">
                    <span class="fundlist-title">管理人观点</span>
                <span class="sub-r">
                    <i class="icon-down"></i>
                </span>
                </li>
            </a>
        </ul>
        <div class="fundlist-content">
            <div class="content-detail">
                <div class="notice-content">
                    <div class="viewpoint-msg"><span class="font-color">发布日期：</span><span>2016-11-11</span></div>
                    <div class="viewpoint-msg"><span class="font-color">基金管理人：</span><span>诺安基金管理有限公司</span></div>
                    <div class="viewpoint-msg"><span class="font-color">基金管理人：</span><span>诺安基金管理有限公司</span></div>
                    <div class="viewpoint">
                        <div class="viewpoint-title">1、重要提示</div>
                        <div class="viewpoint-detail">基金托管人复核了本报告，认为本报告真实。基金管理人承诺认真管理资产，但不保证一定盈利</div>
                    </div>
                    <div class="viewpoint">
                        <div class="viewpoint-title">2、基金产品概况</div>
                        <div class="viewpoint-detail">基金托管人复核了本报告，认为本报告真实。基金管理人承诺认真管理资产，但不保证一定盈利</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="fundlist-panel">
        <ul class="sub-list1">
            <a href="javascript:;" class="content-toggle">
                <li class="funflist">
                    <span class="fundlist-title">投资组合</span>
                <span class="sub-r">
                    <i class="icon-down"></i>
                </span>
                </li>
            </a>
        </ul>
        <div class="fundlist-content">
            <div class="content-title">上一季度十大股票持仓：</div>
            <div class="content-detail"></div>
            <div class="content-title">行业分布：</div>
            <div class="content-detail"></div>
            <table class="fund-table equity-table">
                <thead>
                <tr class="thead-border">
                    <th>
                        <div>行业类别</div>
                    </th>
                    <th class="equity-detail">
                        <div>金额(万元)</div>
                    </th>
                    <th class="equity-detail">
                        <div>占基金总资产比例</div>
                    </th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td class="fund-group">
                        <div class="group-icon"><i class="icon-fang1"></i></div>
                        <div class="group-name">横瑞医药</div>
                    </td>
                    <td>10692.44</td>
                    <td>4.59%</td>
                </tr>
                <tr>
                    <td class="fund-group">
                        <div class="group-icon"><i class="icon-fang2"></i></div>
                        <div class="group-name">电力，煤气及水的生产和供应业</div>
                    </td>
                    <td>10692.44</td>
                    <td>4.59%</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
    <div class="fundlist-panel">
        <ul class="sub-list1">
            <a href="javascript:;" class="content-toggle">
                <li class="funflist">
                    <span class="fundlist-title">费率结构</span>
                <span class="sub-r">
                    <i class="icon-down"></i>
                </span>
                </li>
            </a>
        </ul>
        <div class="fundlist-content">
            <div class="content-detail">
                <div class="notice-content">
                    <div class="viewpoint-msg">诺安基金管理有限公司对通过网上交易直销系统进行交易的客户实行优惠费率，基金费率优惠最低至4折。</div>
                    <div class="viewpoint-msg">本说明仅供参考，请以相关公告为准。</div>
                    <div class="viewpoint">
                        <div class="viewpoint-title">1、基金转换费率</div>
                        <table class="fund-table table-bordered">
                            <thead>
                            <tr class="border-none">
                                <th>
                                    <div>申请份额持有时间(N)</div>
                                </th>
                                <th>
                                    <div>转换费率</div>
                                </th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>N＜1年</td>
                                <td>0.8%</td>
                            </tr>
                            <tr>
                                <td>N＜1年</td>
                                <td>0.8%</td>
                            </tr>
                            </tbody>
                        </table>
                        <div><i class="icon-yellow"></i>注意：诺安纯债定期开放债券型证券投资基金（以下简称“本基金”）仅开放C类基金份额。</div>
                    </div>
                </div>
                <div class="notice-content">
                    <div class="viewpoint">
                        <div class="viewpoint-title">2、申购 \ 定投申购费率</div>
                        <div class="fontsize-12">(1)快捷支付：</div>
                        <table class="fund-table table-bordered">
                            <thead>
                            <tr class="border-none">
                                <th>
                                    <div>业务类型</div>
                                </th>

                                <th>
                                    <div class="sub-select2">
                                        <div href="javascript:;" class="content-toggle">
                                            <span class="select-detail">建行快捷</span>
                                            <i class="icon-arrow-down"></i>
                                        </div>
                                        <ul class="select-list" style="display: none;">
                                            <li>
                                                <a href="javascript:;">建行快捷</a>
                                            </li>
                                            <li>
                                                <a href="javascript:;">中行快捷</a>
                                            </li>
                                            <li>
                                                <a href="javascript:;">建行快捷</a>
                                            </li>
                                        </ul>
                                    </div>
                                </th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>N＜1年</td>
                                <td>4折</td>
                            </tr>
                            <tr>
                                <td>N＜1年</td>
                                <td>4折</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="fundlist-panel">
        <ul class="sub-list1">
            <a href="javascript:;" class="content-toggle">
                <li class="funflist">
                    <span class="fundlist-title">历史分红</span>
                <span class="sub-r">
                    <i class="icon-down"></i>
                </span>
                </li>
            </a>
        </ul>
        <div class="fundlist-content">
            <div class="sub-content1">
                <table class="fund-table table-bordered">
                    <thead>
                    <tr class="border-none">
                        <th>
                            <div>红利发放日</div>
                        </th>
                        <th>
                            <div>金额</div>
                        </th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>2016-11-11</td>
                        <td>4.592</td>
                    </tr>
                    <tr>
                        <td>2016-10-11</td>
                        <td>4.597</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <div class="fundlist-panel">
        <ul class="sub-list1">
            <a href="#">
                <li class="funflist">
                    <span class="fundlist-title">最新公告</span>
                <span class="sub-r">
                    <i class="icon-right-red"></i>
                </span>
                </li>
            </a>
        </ul>
    </div>
</div>
<!--基金详情结束-->

<!--每日净值开始-->
<div class="tab-cont fundlist-cont" style="display: none">
    <table class="fund-table equity-table">
        <thead>
        <tr class="thead-border">
            <th>
                <div>日期</div>
            </th>
            <th class="equity-detail">
                <div>单位净值（元）</div>
            </th>
            <th class="equity-detail">
                <div>累计净值（元）</div>
            </th>
            <th>日涨跌</th>
        </tr>
        </thead>
    </table>
    <div style="height: 160px;overflow: auto">
        <table class="fund-table equity-table">
            <tbody>
            <tr>
                <td>16-11-11</td>
                <td>1.0394</td>
                <td>1,5343</td>
                <td class="red">+3.14%</td>
            </tr>
            <tr>
                <td>16-11-11</td>
                <td>1.0394</td>
                <td>1,5343</td>
                <td class="blue">-3.14%</td>
            </tr>
            <tr>
                <td>16-11-11</td>
                <td>1.0394</td>
                <td>1,5343</td>
                <td class="blue">-3.14%</td>
            </tr>
            <tr>
                <td>16-11-11</td>
                <td>1.0394</td>
                <td>1,5343</td>
                <td class="blue">-3.14%</td>
            </tr><tr>
                <td>16-11-11</td>
                <td>1.0394</td>
                <td>1,5343</td>
                <td class="blue">-3.14%</td>
            </tr>

            </tbody>
        </table>
    </div>
</div>
<!--每日净值结束-->

<!--基金对比开始-->
<div class="tab-cont fundlist-cont" style="display: none">
    <div class="chart clearfix">
        <div class="tip-left clearfix">
            <em class="red">16-06-18</em>到<em class="red">16-06-28</em>
        </div>
        <div class="chart-detail">折线图</div>
    </div>
    <div class="float-btn">
        <a href="javascript:;" class="sub-btn2 contrast">+添加对比基金</a>
    </div>
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
    <table class="fund-table equity-table">
        <thead>
        <tr class="thead-border">
            <th><div>&nbsp;</div></th>
            <th>
                <div>诺安成长</div>
            </th>
            <th class="equity-detail">
                <div>诺安景鑫</div>
            </th>
            <th class="equity-detail">
                <div>诺安安鑫</div>
            </th>

        </tr>
        </thead>
        <tbody>
        <tr>
            <td>产品类型</td>
            <td>混合型</td>
            <td>混合型</td>
            <td>混合型</td>
        </tr>
        <tr>
            <td>基金经理</td>
            <td>谢志华</td>
            <td>谢志华</td>
            <td>谢志华</td>
        </tr>
        <tr>
            <td>规模(元)</td>
            <td>23.50亿</td>
            <td>23.50亿</td>
            <td>23.50亿</td>
        </tr>
        <tr>
            <td>单位净值</td>
            <td>1.67</td>
            <td>1.67</td>
            <td>1.67</td>
        </tr>
        <tr>
            <td>近一月(%)</td>
            <td class="red">+5.16</td>
            <td class="red">+5.16</td>
            <td class="red">+3.16</td>
        </tr>
        <tr>
            <td>近三月(%)</td>
            <td class="red">+5.16</td>
            <td class="red">+5.16</td>
            <td class="red">+3.16</td>
        </tr>
        <tr>
            <td>近六月(%)</td>
            <td>--</td>
            <td class="red">+5.16</td>
            <td class="red">+3.16</td>
        </tr>
        <tr>
            <td>近一年(%)</td>
            <td>--</td>
            <td class="red">+5.16</td>
            <td class="red">+3.16</td>
        </tr>
        <tr>
            <td>近二年(%)</td>
            <td>--</td>
            <td class="red">+5.16</td>
            <td class="red">+3.16</td>
        </tr>
        </tbody>
    </table>
    <div class="sub-btn sub-placeholder">
        <a href="javascript:;" class="sub-btn1">重新选择对比</a>
    </div>
</div>
<!--基金对比结束-->
</div>
<div class="fundlist-place"></div>
<div class="fundlist-box">
    <div class="fund-detail">
        <div class="fund-detail-box">
            <div>
                申购费率：<em class="trend-tip">1.5%</em>
            </div>
            <div>
                现金宝申购<em class="tip-discount">1折：</em><em class="tip-discount">0.15%</em>
            </div>
        </div>
        <div class="gift-box">
            <div>
               <div class="fund-detail-l"><a href="javascript:;" class="bg-yellow">定投</a></div>
               <div class="fund-detail-r"><a href="javascript:;" class="">购买</a></div>
            </div>
        </div>
    </div>
</div>
</#macro>
<#include "../common/main.ftl">
