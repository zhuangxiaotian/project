<#macro jsimport>
<script>
    $(document).ready(function(){
    	//type-box
    	$('.tab-fundtype ul li').on('click', function(event) {
    		$('.tab-fundtype ul li').removeClass('cur');
    		$(this).addClass('cur');
    		$('.tab-fundtype-cont').hide();
    		$('.tab-fundtype-cont').eq($(this).index()).show();
    	});
    	function selectBox(){
    		$(".sub-select").click(function() {
    			$(this).find(".select-list").slideToggle(100);
    			$(this).find(".icon-down").toggleClass("icon-up");
    		})
    		$(".sub-select2").click(function() {
    			$(this).find(".select-list").slideToggle(100);
    			$(this).find(".icon-down").toggleClass("icon-up");
    		})
    	}
    	selectBox();
    	$('.select-list li').bind('click', function(){
    		selectValue=$(this).find("a").html();
    		$(this).parent().parent().find('.select-detail').html(selectValue);
    	});
        var myScroll;
        function xScroll(){
            myScroll = new IScroll('#wrapper', { eventPassthrough: true, scrollX: true, scrollY: false, preventDefault: false });
        }
        xScroll();
        $(".arrow-toggle").click(function(){
    		$(this).find(".icon-top").toggleClass("icon-bottom");
    	})
    })
</script>
</#macro>
<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        添加对比基金
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
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
            <th><div class="arrow-toggle">最新净值<i class="icon-top"></i></div></th>
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
              <td class="text-l">
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
            <td class="text-l">
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
            <td class="text-l">
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
</#macro>
<#include "../common/main.ftl">