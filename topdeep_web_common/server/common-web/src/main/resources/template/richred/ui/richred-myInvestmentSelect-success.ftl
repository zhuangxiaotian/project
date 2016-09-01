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
  //type-box
	$('.tab-fundtype ul li').on('click', function(event) {
		$('.tab-fundtype ul li').removeClass('cur');
		$(this).addClass('cur');
		$('.tab-fundtype-cont').hide();
		$('.tab-fundtype-cont').eq($(this).index()).show();
	});
    var myScroll,selectBox;
    function xScroll(){
        myScroll = new IScroll('#wrapper', { eventPassthrough: true, scrollX: true, scrollY: false, preventDefault: false });
    }
    xScroll();
})
</script>
</#macro>
<#macro htmlbody>
<header class="header sub-padding">
    <ul class="title-tab">
        <li><a href="javascript:void(0)">优选基金</a></li>
        <li class="cur"><a href="javascript:void(0)">全部基金</a></li>
    </ul>
</header>
    <div class="title-tab-cont" >
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
                <tr>
                    <td class="red">
                        <div class="trend">15.85%</div>
                    </td>
                    <td>
                        <div class="trend">1.0000</div>
                    </td>
                    <td>
                        <a href="javascript:;" class="sub-btn2">买入</a>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="table-title-s">今年来涨跌</div>
                    </td>
                    <td>
                        <div class="table-title-s">最新净值(<em>12-09</em>)</div>
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
                        <a href="javascript:;" class="sub-btn2">买入</a>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="table-title-s">今年来涨跌</div>
                    </td>
                    <td>
                        <div class="table-title-s">最新净值(<em>12-09</em>)</div>
                    </td>
                    <td>
                        <div class="red">1折优惠</div>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
    <div class="title-tab-cont" style="display: block">
        <div class="type-box" id="wrapper">
            <div  class="tab-fundtype" id="scroller">
                <ul >
                    <li class="cur">
                        <a href="javascript:;">全部</a>
                    </li>
                    <li>
                        <a href="javascript:;">股票型</a>
                    </li>
                    <li>
                        <a href="javascript:;">混合型</a>
                    </li>
                    <li>
                        <a href="javascript:;">债券型</a>
                    </li>
                    <li>
                        <a href="javascript:;">指数型</a>
                    </li>
                </ul>
            </div>
        </div>
        <table class="fund-table">
          <thead>
          <tr class="table-border">
            <th><div>基金名称</div></th>
            <th><div>最新净值<i class="icon-top"></i></div></th>
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
          <tr class="table-border table-select">
              <td>
                <div>诺安增利债券</div>
                <div class="table-title-s">
                  <span class="fund-type">股票</span>
                  <i class="table-title-s">320023</i>
                </div>
              </td>
              <td>
                <div>1.4280</div>
                <div class="table-title-s">2016-1-12</div>
              </td>
              <td class="red">
                <div class="trend">15.85%</div>
                <div class="table-title-s">近年来涨跌</div>
              </td>
          </tr>
          <tr class="table-border">
            <td>
              <div>诺安益鑫保本</div>
              <div class="table-title-s">
                <span class="fund-type">保本</span>
                <i class="table-title-s">320023</i>
              </div>
            </td>
            <td>
              <div>1.4280</div>
              <div class="table-title-s">2016-1-12</div>
            </td>
            <td class="blue">
              <div class="trend">-5.85%</div>
              <div class="table-title-s">近年来涨跌</div>
            </td>
          </tr>
          <tr class="table-border">
            <td>
              <div>诺安益鑫保本</div>
              <div class="table-title-s">
                <span class="fund-type">混合</span>
                <i class="table-title-s">320023</i>
              </div>
            </td>
            <td>
              <div>1.4280</div>
              <div class="table-title-s">2016-1-12</div>
            </td>
            <td class="red">
              <div class="trend">--</div>
              <div class="table-title-s">近年来涨跌</div>
            </td>
          </tr>
          </tbody>
        </table>
    </div>
</div>
</#macro>
<#include "../common/main.ftl">