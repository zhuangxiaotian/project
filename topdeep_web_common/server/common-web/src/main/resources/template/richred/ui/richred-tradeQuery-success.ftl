<#macro jsimport>
<script>
    $(document).ready(function(){
    	$('.tab li').on('click', function(event) {
    		$('.tab li').removeClass('cur');
    		$(this).addClass('cur');
    		$('.tab-cont').hide();
    		$('.tab-cont').eq($(this).index()).show();
    	});
    	//选择框
    	function selectBox(){
    		$(".select-trade").click(function() {
    			$(".select-state").slideToggle(100);
    			$(this).find(".icon-down").toggleClass("icon-up");
    		})
    	}
    	selectBox();
    	$('.select-state li').bind('click', function(){
    		selectValue=$(this).find("a").html();
    		$('.select-trade .select-detail').html(selectValue);
    		$(".select-state").hide(100);
    		$('.select-trade .icon-down').removeClass("icon-up");
    	});
    })
    $(document).bind("click",function(e){
		var target = $(e.target);
		if(target.closest(".select-trade").length == 0 && target.closest(".select-state").length == 0){
			$(".select-state").hide(100);
    		$('.select-trade .icon-down').removeClass("icon-up");
		}
	})
</script>
</#macro>
<#macro htmlbody>
<header class="header">
    <div class="hl">
        <i class="icon-left"></i>
    </div>
    <div class="title">交易查询</div>
    <div class="hr select-trade">
    	<span class="select-detail">确认成功</span>
    	<span class="sub-r">
            <i class="icon-down"></i>
        </span>
    </div>
</header>
<ul class="select-state" style="display: none;">
            <li>
                <a href="javascript:;">确认成功</a>
            </li>
            <li>
                <a href="javascript:;">确认失败</a>
            </li>
            <li>
                <a href="javascript:;">处理中</a>
            </li>
</ul>
<ul class="tab tab-assets">
    <li class="cur">
        <a href="javascript:;">全部</a>
    </li>
    <li>
        <a href="javascript:;">买入</a>
    </li>
    <li>
        <a href="javascript:;">卖出</a>
    </li>
    <li>
        <a href="javascript:;">其他</a>
    </li>
</ul>
<table class="fund-table">
      <tbody>
      <tr class="border-top">
        <td class="text-l">
          <div><i class="fund-type-red">申购</i>诺安成长</div>
          <div class="table-title-s">
            <i class="table-title-s">2016-11-11 11:11</i>
          </div>
        </td>
        <td class="red text-r">
          <div class="trend">2000.00元</div>
          <div class="fund-type bg-orange">未确认</div>
        </td>
      </tr>
      <tr class="border-top">
          <td class="text-l">
            <div><i class="fund-type-orange">赎回</i>诺安成长</div>
            <div class="table-title-s">
              <i class="table-title-s">2016-11-11 11:11</i>
            </div>
          </td>
          <td class="red text-r">
            <div class="trend">2000.00份</div>
            <div class="fund-type bg-red">成功</div>
          </td>
      </tr>
      <tr class="border-top">
        <td class="text-l">
          <div><i class="fund-type-orange">赎回</i>诺安成长</div>
          <div class="table-title-s">
            <i class="table-title-s">2016-11-11 11:11</i>
          </div>
        </td>
        <td class="red text-r">
          <div class="trend">2000.00份</div>
          <div class="fund-type bg-gray">失败</div>
        </td>
      </tr>
      </tbody>
    </table>
</#macro>
<#include "../common/main.ftl">