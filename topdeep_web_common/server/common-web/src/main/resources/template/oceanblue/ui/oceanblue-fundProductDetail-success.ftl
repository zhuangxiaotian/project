<#macro jsimport>
<!-- iSroll -->
<script src="${base}/static/js/vendors/iscroll/iscroll.js" type="text/javascript"></script>
<script>
$(function(){
    $(document).on("click",".sub-tab>li",function(){
        $(this).addClass("active").siblings().removeClass("active");
        $(".tab-panel").hide();
        $(".tab-panel").eq($(this).index()).show();
    })
     $(document).on("click",".data-time",function(){
            $(".data-time").removeClass("active");
            $(this).addClass("active");
     })
});
</script>
</#macro>
<#macro htmlbody>
	<header class="header-container">
        <a class="searchIcon" href="javascript:void(0);"><i></i></a>
        <h1 class="title">基金产品详情</h1>
        <dl class="collectIcon">
        	<dt class="wjx1"></dt>
            <dd>收藏基金</dd>
        </dl>
    </header>
    <div class="container-fund">
        <div class="fund-product">
            <ul class="sub-list">
                <li class="flex">
                    <div class="blue_vline"></div>
                    <div class="fund_name">
                        <span>建信恒久价值股票 53001</span>
                        <em class="fr brownColor1">正常</em>
                    </div>
                </li>
                <li class="product-detail">
                    <table class="table-fund">
                        <tr>
                            <td>最新净值：</td>
                            <td><span>1.2433</span></td>
                            <td>累计净值：</td>
                            <td><span>1.1562</span></td>
                        </tr>
                        <tr>
                            <td>日涨幅：</td>
                            <td><span class="red">0.2433%</span></td>
                            <td>累计三月：</td>
                            <td><span class="red">10.15%</span></td>
                        </tr>
                        <tr>
                            <td>累计一年：</td>
                            <td><span class="red">20.23%</span></td>
                            <td>成立以来：</td>
                            <td>
                                <span class="red">10.15%</span>
                            </td>
                        </tr>
                        <tr>
                            <td>成立日期：</td>
                            <td><span class="">2005-12-01</span></td>
                            <td>基金经理：</td>
                            <td><span class="name">顾中汉</span></td>
                        </tr>
                    </table>

                </li>
            </ul>
        </div>
        <ul class="sub-tab">
            <li><a href="javascript:;">单位净值</a></li>
            <li><a href="javascript:;">累计净值</a></li>
            <li class="active"><a href="javascript:;">每日净值</a></li>
        </ul>
        <div class="tab-panel" style="display: none;">
        	<div class="product-data">
                <div class="data-chart">图表</div>
                <div class="sub-cells">
                    <div class="sub-cell">
                        <div class="flex-cell"><a class="data-time active" href="javascript:;">一个月</a></div>
                        <div class="flex-cell"><a class="data-time" href="javascript:;">三个月</a></div>
                        <div class="flex-cell"><a class="data-time" href="javascript:;">六个月</a></div>
                        <div class="flex-cell"><a class="data-time" href="javascript:;">一年</a></div>
                        <div class="flex-cell"><a class="data-time" href="javascript:;">成立以来</a></div>
                    </div>
                </div>
            </div>
        </div>
        <div class="tab-panel" style="display: none;"></div>
        <div class="tab-panel">
            <table class="table table-flex">
                <thead>
                <tr>
                    <th>日期</th>
                    <th>单位净值</th>
                    <th>累计净值</th>
                    <th>日涨跌</th>
                </tr>
                </thead>
            </table>
                    <table class="table table-flex">
                        <tbody>
                        <tr class="border-top">
                            <td>2016-06-28</td>
                            <td>1.1456</td>
                            <td>2.1456</td>
                            <td class="green">-0.70%</td>
                        </tr>
                        <tr class="border-top">
                            <td>2016-06-28</td>
                            <td>1.1456</td>
                            <td>2.1456</td>
                            <td class="red">1.76%</td>
                        </tr>
                        <tr class="border-top">
                            <td>2016-06-28</td>
                            <td>1.1456</td>
                            <td>2.1456</td>
                            <td class="red">1.76%</td>
                        </tr>
                        <tr class="border-top">
                            <td>2016-06-28</td>
                            <td>1.1456</td>
                            <td>2.1456</td>
                            <td class="red">1.76%</td>
                        </tr>
                        </tbody>
                    </table>
                    <div class="pullup">
	                    <div class="icon-pull"></div>
	                    <div class="label">上拉加载更多</div>
                	</div>
        </div>
    </div>
    <div class="place-index"></div>
    <div class="footer-container bg-white">
        <div class="btn-double sub-padding">
            <div class="btn-l">
                <a href="javascript:;" class="btn bg-yellow">赎回</a>
            </div>
            <div class="btn-r">
                <a href="javascript:;" class="btn">申购</a>
            </div>
        </div>
    </div>
</#macro>
<#include "../common/main.ftl">