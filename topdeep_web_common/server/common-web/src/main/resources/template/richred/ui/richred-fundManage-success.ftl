<#macro jsimport>
<script>
$(document).ready(function(){
    $('.title-tab li').on('click', function(event) {
        $('.title-tab li').removeClass('cur');
        $(this).addClass('cur');
        $('.title-tab-cont').hide();
        $('.title-tab-cont').eq($(this).index()).show();
        $(".arrow-toggle").click(function(){
            $(this).find(".icon-top").toggleClass("icon-bottom");
        })
        xScroll();
    });
    var myScroll,selectBox;
    function xScroll(){
        myScroll = new IScroll('#wrapper', { eventPassthrough: true, scrollX: true, scrollY: false, preventDefault: false });
    }
    xScroll();
    
	//选择框
	function selectBox(){
		$(".sub-select").click(function() {
			$(this).find(".select-list").slideToggle(100);
			$(this).find(".icon-down").toggleClass("icon-up");
		})
		$(".sub-select3").click(function() {
			$(this).find(".select-list").slideToggle(100);
			$(this).find(".icon-down").toggleClass("icon-up");
		})
	}
	selectBox();
	$('.select-list li').bind('click', function(){
		selectValue=$(this).find("a").html();
		$(this).parent().parent().find('.select-detail').html(selectValue);
	});

})
</script>
</#macro>
<#macro htmlbody>
<div class="section">
    <header class="header sub-padding">
	    <ul class="title-tab">
	        <li class="cur"><a href="javascript:void(0)">优选基金</a></li>
	        <li><a href="javascript:void(0)">全部基金</a></li>
	    </ul>
	</header>
    <div class="title-tab-cont" style="display: block">
        <div class="fund-list">
            <div class="fund-style">
                <i class="fund-type">保本</i><span>诺安增利债券</span><em class="fund-code">320023</em>
                <span class="fund-type1 fund-r distance-r">保本金</span>
                <span class="fund-type1 fund-r distance-r">20%目标</span>
            </div>
            <i class="icon-zhekous fund-new">
                <em>新</em>
            </i>
            <table class="fund-table">
                <tbody>
                <tr onclick="location.href='${base}/ui/richred.action?type=fundDetail1';">
                    <td class="red">
                        <div class="trend">15.85%</div>
                    </td>
                    <td>
                        <div class="trend">1.0000</div>
                    </td>
                    <td>
                        <a href="javascript:;" class="sub-btn2 btn-buy">买入</a>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="table-title-s fontsize-14">今年来涨跌</div>
                    </td>
                    <td>
                        <div class="table-title-s fontsize-14">最新净值(<em>12-09</em>)</div>
                    </td>
                    <td>
                        <div class="red">1折优惠</div>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
        <div class="fund-list">
            <div class="fund-style">
                <i class="fund-type">保本</i><span>诺安增利债券</span><em class="fund-code">320023</em>
                <span class="fund-type1 fund-r distance-r">保本金</span>
                <span class="fund-type1 fund-r distance-r">20%目标</span>
            </div>
            <i class="icon-zhekous fund-new">
                <em>新</em>
            </i>
            <table class="fund-table">
                <tbody>
                <tr onclick="location.href='${base}/ui/richred.action?type=fundDetail1';">
                    <td class="red">
                        <div class="trend">15.85%</div>
                    </td>
                    <td>
                        <div class="trend">1.0000</div>
                    </td>
                    <td>
                        <a href="javascript:;" class="sub-btn2 btn-buy">买入</a>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="table-title-s fontsize-14">今年来涨跌</div>
                    </td>
                    <td>
                        <div class="table-title-s fontsize-14">最新净值(<em>12-09</em>)</div>
                    </td>
                    <td>
                        <div class="red">1折优惠</div>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
        <div class="fund-list">
            <div class="fund-style">
                <i class="fund-type">保本</i><span>诺安增利债券</span><em class="fund-code">320023</em>
                <span class="fund-type1 fund-r distance-r">保本金</span>
                <span class="fund-type1 fund-r distance-r">20%目标</span>
            </div>
            <i class="icon-zhekous fund-new">
                <em>新</em>
            </i>
            <table class="fund-table">
                <tbody>
                <tr onclick="location.href='${base}/ui/richred.action?type=fundDetail1';">
                    <td class="red">
                        <div class="trend">15.85%</div>
                    </td>
                    <td>
                        <div class="trend">1.0000</div>
                    </td>
                    <td>
                        <a href="javascript:;" class="sub-btn2 btn-buy">买入</a>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="table-title-s fontsize-14">今年来涨跌</div>
                    </td>
                    <td>
                        <div class="table-title-s fontsize-14">最新净值(<em>12-09</em>)</div>
                    </td>
                    <td>
                        <div class="red">1折优惠</div>
                    </td>
                </tr>
                </tbody>
            </table>
            <div class="fund-description">
             <div class="font-color">诺安增利债券诺安增利债券诺安增利债券诺安增利债券诺安增利债券诺安增利债券诺安增利债券诺安增利债券</div>
        </div>
        </div>
        <div class="fund-list">
            <div class="fund-style">
                <i class="fund-type">混合</i><span>诺安增利债券</span><em class="fund-code">320023</em>
                <span class="fund-type1 fund-r distance-r">互联网＋</span>
            </div>
            <i class="icon-zhekous fund-new">
                <em>新</em>
            </i>
            <table class="fund-table">
                <tbody>
                <tr>
                    <td class="red">
                        <div class="trend">15.85%</div>
                    </td>
                    <td>
                        <div class="trend">1.0000</div>
                    </td>
                    <td>
                        <a href="javascript:;" class="sub-btn2 btn-buy">买入</a>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="table-title-s fontsize-14">今年来涨跌</div>
                    </td>
                    <td>
                        <div class="table-title-s fontsize-14">最新净值(<em>12-09</em>)</div>
                    </td>
                    <td>
                        <div class="red">1折优惠</div>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
    <div class="title-tab-cont">
        <div class="type-box" id="wrapper">
            <div  class="tab-fundtype" id="scroller">
                <ul >
                    <li class="cur">
                        <a href="javascript:;">全部</a>
                    </li>
                    <li>
                        <a href="javascript:;">股票型</a>
                    </li>
                    <!-- <li>
                        <a href="javascript:;">混合型</a>
                    </li>
                    <li>
                        <a href="javascript:;">债券型</a>
                    </li>
                    <li>
                        <a href="javascript:;">指数型</a>
                    </li> -->
                </ul>
            </div>
        </div>
        <table class="fund-table table-fundall">
            <thead>
            <tr class="table-border">
                <th class="w1">
                    <div class="text-l-20">基金名称</div>
                </th>
                <th>
                    <div class="arrow-toggle">最新净值<i class="icon-top"></i></div>
                </th>
                <th class="data-select">
                	<div class="sub-select3 red">
	                	 <a href="javascript:;" class="content-toggle">
	                        <span class="select-detail">今年来</span>涨跌
	                        <i class="icon-down"></i>
	                     </a>
	                     <ul class="select-list" style="display: none;">
	                        <li>
	                            <a href="javascript:;">今年来</a>
	                        </li>
	                        <li>
	                            <a href="javascript:;">日</a>
	                        </li>
	                        <li>
	                            <a href="javascript:;">近１月</a>
	                        </li>
	                        <li>
	                            <a href="javascript:;">近３月</a>
	                        </li>
	                        <li>
	                            <a href="javascript:;">近６月</a>
	                        </li>
	                        <li>
	                            <a href="javascript:;">近１年</a>
	                        </li>
	                    </ul>
                	</div>
                	<a href="javascript:;" class="arrow-toggle data-range"><i class="icon-top"></i></a>
                </th>
            </tr>
            </thead>
            <tbody>
            <tr class="border-top">
                <td class="text-l">
                    <div>诺安天天宝货币E</div>
                    <div class="table-title-s">
                        <span class="fund-type">保本</span>
                        <span>320023</span>
                    </div>
                </td>
                <td>
                    <div>1.4280</div>
                    <div>
                        <i class="table-title-s">16-11-11</i>
                    </div>

                </td>
                <td class="red">
                    <div class="trend">15.85%</div>
                    <div class="table-title-s">今年来涨跌</div>
                </td>
            </tr>
            <tr class="border-top">
                <td class="text-l">
                    <div>诺安平衡混合创新</div>
                    <div class="table-title-s">
                        <span class="fund-type">混合</span>
                        <span>320023</span>
                    </div>
                </td>
                <td>
                    <div>1.4280</div>
                    <div>
                        <i class="table-title-s">16-11-11</i>
                    </div>

                </td>
                <td class="red">
                    <div class="trend">--</div>
                    <div class="table-title-s">今年来涨跌</div>
                </td>
            </tr>
            </tbody>
        </table>
        <table class="fund-table table-fundall">
            <thead>
            <tr class="table-border">
                <th class="w1">
                    <div class="text-l-20">基金名称</div>
                </th>
                <th>
                    <div class="arrow-toggle">最新净值<i class="icon-top"></i></div>
                </th>
                <th class="data-select">
                	<div class="sub-select3 red">
	                	 <a href="javascript:;" class="content-toggle">
	                        <span class="select-detail">今年来</span>涨跌
	                        <i class="icon-down"></i>
	                     </a>
	                     <ul class="select-list" style="display: none;">
	                        <li>
	                            <a href="javascript:;">今年来</a>
	                        </li>
	                        <li>
	                            <a href="javascript:;">日</a>
	                        </li>
	                        <li>
	                            <a href="javascript:;">近１月</a>
	                        </li>
	                        <li>
	                            <a href="javascript:;">近３月</a>
	                        </li>
	                        <li>
	                            <a href="javascript:;">近６月</a>
	                        </li>
	                        <li>
	                            <a href="javascript:;">近１年</a>
	                        </li>
	                    </ul>
                	</div>
                </th>
            </tr>
            </thead>
            <tbody>
            <tr class="border-top">
                <td class="text-l">
                    <div>诺安天天宝货币E</div>
                    <div class="table-title-s">
                        <span class="fund-type">保本</span>
                        <span>320023</span>
                    </div>
                </td>
                <td>
                    <div>1.4280</div>
                    <div>
                        <i class="table-title-s">16-11-11</i>
                    </div>

                </td>
                <td class="red">
                    <div class="trend">15.85%</div>
                    <div class="table-title-s">今年来涨跌</div>
                </td>
            </tr>
            <tr class="border-top">
                <td class="text-l">
                    <div>诺安增利债券</div>
                    <div class="table-title-s">
                        <span class="fund-type">混合</span>
                        <span>320023</span>
                    </div>
                </td>
                <td>
                    <div>1.4280</div>
                    <div>
                        <i class="table-title-s">16-11-11</i>
                    </div>

                </td>
                <td class="red">
                    <div class="trend">--</div>
                    <div class="table-title-s">今年来涨跌</div>
                </td>
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
        <li class="active">
            <a href="javascript:void(0)">
                <i class="icon-finance"></i>
                <p>基金理财</p>
            </a>
        </li>
        <li>
            <a href="${base}/ui/richred.action?type=myAssets">
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