<#macro jsimport>
<script type="text/javascript">
	$(function(){
        $(document).on("click",".sub-tab>li",function(){
            $(this).addClass("active").siblings().removeClass("active");
            $(".tab-panel").hide();
            $(".tab-panel").eq($(this).index()).show();
        })
	});
</script>
</#macro>
<#macro htmlbody>
	<header class="header-container">
        <a class="back" href="javascript:history.go(-1);"><i></i></a>
        <h1 class="title">增值宝(建信货币基金)</h1>
        <a href="javascript:;" class="header-right">产品详情</a>
    </header>
    <div class="fund-zzb">
        <img src="${base}/static/skin/${res.skin}/images/bg_zzb.png" alt="bg_pic"/>
        <div class="date">数据日期：<span>2016-12-31</span></div>
        <div class="assets-number">8,666,999.00</div>
        <div class="assets-total">总资产 (元)</div>
    </div>
    <ul class="sub-tab">
        <li class="active"><a href="javascript:;">持有基金</a></li>
        <li><a href="javascript:;">交易明细</a></li>
    </ul>
    <div class="tab-panel" style="display: block;">
        <table class="table table-flex table-assets">
            <thead>
            <tr>
                <th>基金名称</th>
                <th>总资产&nbsp;(元)</th>
                <th>总份额&nbsp;(份)</th>
            </tr>
            </thead>
        </table>
        <table class="table table-flex table-assets">
                    <tbody>
                    <tr class="border-top">
                        <td>建信环保产业</td>
                        <td>1.1456</td>
                        <td>2.1456</td>
                    </tr>
                    <tr class="border-top">
                        <td>建信中证520</td>
                        <td>1.1456</td>
                        <td>2.1456</td>
                    </tr>
                    <tr class="border-top">
                        <td>建信环保产业产业</td>
                        <td>1.1456</td>
                        <td>2.1456</td>
                    </tr>
                    <tr class="border-top">
                        <td>建信中证中证520</td>
                        <td>23,666,666.88</td>
                        <td>999.00</td>
                    </tr>
                    </tbody>
		</table>
    </div>
    <div class="tab-panel" style="display: none;">
	            <div class="sub-cells">
	                <a class="sub-cell">
	                    <div class="flex-cell">
	                        <div>申购　建信中证500</div>
	                        <div class="gray">2014-10-10 12:21:24</div>
	                    </div>
	                    <div class="cell-fr">
	                        <div class="red">1.00元</div>
	                        <div>成功</div>
	                    </div>
	                    <div class="arrow-right">
	                        <i class="icon-right"></i>
	                    </div>
	                </a>
	                <a class="sub-cell">
	                    <div class="flex-cell">
	                        <div>申购　建信环保产业</div>
	                        <div class="gray">2014-10-10 12:21:24</div>
	                    </div>
	                    <div class="cell-fr">
	                        <div class="red">1.00元</div>
	                        <div>成功</div>
	                    </div>
	                    <div class="arrow-right">
	                        <i class="icon-right"></i>
	                    </div>
	                </a>
	                <a class="sub-cell">
	                    <div class="flex-cell">
	                        <div>申购　建信环保产业</div>
	                        <div class="gray">2014-10-10 12:21:24</div>
	                    </div>
	                    <div class="cell-fr">
	                        <div class="red">1.00元</div>
	                        <div>成功</div>
	                    </div>
	                    <div class="arrow-right">
	                        <i class="icon-right"></i>
	                    </div>
	                </a>
	                <a class="sub-cell">
	                    <div class="flex-cell">
	                        <div>申购　建信环保产业</div>
	                        <div class="gray">2014-10-10 12:21:24</div>
	                    </div>
	                    <div class="cell-fr">
	                        <div class="red">1.00元</div>
	                        <div>成功</div>
	                    </div>
	                    <div class="arrow-right">
	                        <i class="icon-right"></i>
	                    </div>
	                </a>
	                <div class="pullup">
	                    <span class="icon-pull"></span><span class="label">上拉加载更多</span>
	                </div>
    			</div>
    </div>
</#macro>
<#include "../common/main.ftl">