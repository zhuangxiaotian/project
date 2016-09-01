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

    var myScroll;
    function xScroll(){
        myScroll = new IScroll('#wrapper', { eventPassthrough: true, scrollX: true, scrollY: false, preventDefault: false });
    }
    xScroll();
})
</script>
</#macro>
<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:;">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        盈亏查询
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<table class="fund-table trend-table">
    <tbody>
    <tr>
      <td class="text-l">本期盈亏总额(元)：</td>
    </tr>
    <tr>
      <td class="fund-trend">
        +345.16
      </td>
    </tr>
    </tbody>
  </table>
<div class="type-box" id="wrapper">
    <div  class="tab-fundtype" id="scroller">
        <ul>
            <li class="cur">
                <a href="javascript:;">昨日盈亏</a>
            </li>
            <li>
                <a href="javascript:;">近１月</a>
            </li>
            <li>
                <a href="javascript:;">近3月</a>
            </li>
            <li>
                <a href="javascript:;">近６月</a>
            </li>
            <li>
                <a href="javascript:;">近１年</a>
            </li>
            <li>
                <a href="javascript:;">自选日期</a>
            </li>
        </ul>
    </div>
</div>
<div class="tab-fundtype-cont" style="display: block">
    
  <table class="fund-table">
    <thead>
    <tr class="gain-loss">
      <th>持有基金</th>
      <th>盈亏</th>
      <th>购买渠道</th>
    </tr>
    </thead>
    <tbody>
    <tr class="border-top">
      <td>1</td>
      <td class="trend red">+1.1314</td>
      <td><span class="fund-type-orange1">诺安直销</span></td>
    </tr>
    <tr class="border-top">
      <td>2</td>
      <td class="blue">-1.1314</td>
      <td><span class="fund-type-orange1 bg-gray">上海好买</span></td>
    </tr>
    </tbody>
  </table>
</div>
<div class="tab-fundtype-cont">１月</div>
<div class="tab-fundtype-cont">３月</div>
<div class="tab-fundtype-cont">６月</div>
    <div class="tab-fundtype-cont">１年</div>
    <div class="tab-fundtype-cont">
    <ul class="sub-form">
        <li class="login-list">
            <label>开始日期：</label>
            <div class="sub-input">
                <input type="text" placeholder="请输入开始日期">
            </div>
        </li>
        <li class="login-list">
            <label>结束日期：</label>
            <div class="sub-input">
                <input type="text" placeholder="请输入结束日期">
            </div>
        </li>
    </ul>
    <div class="sub-btn sub-padding">
        <a href="javascript:;" class="sub-btn1">查询</a>
    </div>
</div>
</#macro>
<#include "../common/main.ftl">