<#macro jsimport>
<script>
$('.title-tab li').on('click', function(event) {
    $('.title-tab li').removeClass('cur');
    $(this).addClass('cur');
    $('.title-tab-cont').hide();
    $('.title-tab-cont').eq($(this).index()).show();
});
</script>
</#macro>
<#macro htmlbody>
<header class="header">
  <div class="hl">
    <a href="javascript:history.go(-1);">
      <i class="icon-left"></i>
    </a>
  </div>
  <div class="title investment-manage">
    <ul class="title-tab">
      <li class="cur"><a href="javascript:void(0)">有效定投</a></li>
      <li><a href="javascript:void(0)">已暂停定投</a></li>
    </ul>
  </div>
  <div class="hr">
    &nbsp;
  </div>
</header>
<div class="title-tab-cont" style="display: block">
      <div class="fund-list1">
        <div class="fund-style sub-l">
          <span class="fund-type">混合</span>
          <span>诺安成长<i class="fund-code">320007</i></span>
        </div>
        <div class="sub-r">
          <span class="">已成功扣款<em class="red">3</em>次</span>
        </div>
        <div class="clearfix"></div>
      </div>
      <table class="fund-table sub-placeholder">
        <tbody>
        <tr>
          <td class="trend fontsize-16" rowspan="2">每月5日</td>
          <td class="fontsize-16" rowspan="2">1,390.00</td>
          <td class="fontsize-16">招商银行</td>
          <td rowspan="2">
            <a href="定投明细（有效）.html">
              <i class="icon-right-red"></i>
            </a>
          </td>
        </tr>
        <tr>
          <td class="trend td-height-s">
            <div class="fund-tips-s">
              [7337]
            </div>
          </td>
        </tr>
        <tr>
          <td><i class="fund-code">扣款日期</i></td>
          <td><i class="fund-code">定投金额（元）</i></td>
          <td><i class="fund-code">资金来源</i></td>
          <td></td>
        </tr>
        </tbody>
      </table>
      <div class="fund-list1">
        <div class="fund-style sub-l">
          <span class="fund-type">混合</span>
          <span>诺安成长<i class="fund-code">320007</i></span>
        </div>
        <div class="sub-r">
          <span class="">已成功扣款<em class="red">3</em>次</span>
        </div>
        <div class="clearfix"></div>
      </div>
      <table class="fund-table sub-placeholder">
        <tbody>
        <tr>
          <td class="trend fontsize-16" rowspan="2">每月5日</td>
          <td class="fontsize-16" rowspan="2">1,390.00</td>
          <td class="fontsize-16">招商银行</td>
          <td rowspan="2">
            <a href="定投明细（有效）.html">
              <i class="icon-right-red"></i>
            </a>
          </td>
        </tr>
        <tr>
          <td class="trend td-height-s">
            <div class="fund-tips-s">
              [7337]
            </div>
          </td>
        </tr>
        <tr>
          <td><i class="fund-code">扣款日期</i></td>
          <td><i class="fund-code">定投金额（元）</i></td>
          <td><i class="fund-code">资金来源</i></td>
          <td></td>
        </tr>
        </tbody>
      </table>
   </div>
    <div class="title-tab-cont">
        <div class="fund-list1">
          <div class="fund-style sub-l">
            <span class="fund-type">混合</span>
            <span>诺安成长<i class="fund-code">320007</i></span>
          </div>
          <div style="float:right">
            <span class="fund-type-yellow1">已暂停</span>
          </div>

          <div class="clearfix"></div>
        </div>
        <table class="fund-table sub-placeholder">
          <tbody>
          <tr>
            <td class="trend fontsize-16" rowspan="2">每周一</td>
            <td class="fontsize-16" rowspan="2">1,390.00</td>
            <td class="fontsize-16">招商银行</td>
            <td rowspan="2">
              <div class="sub-check">
                <i class="icon-checkbox"></i>
              </div>
            </td>
          </tr>
          <tr>
            <td class="trend td-height-s">
              <div class="fund-tips-s">
                [7337]
              </div>
            </td>
          </tr>
          <tr>
            <td><i class="fund-code">扣款日期</i></td>
            <td><i class="fund-code">定投金额（元）</i></td>
            <td><i class="fund-code">资金来源</i></td>
            <td></td>
          </tr>
          </tbody>
        </table>
      <div class="fund-list1">
        <div class="fund-style sub-l">
          <span class="fund-type">混合</span>
          <span>诺安成长<i class="fund-code">320007</i></span>
        </div>
        <div style="float:right">
          <span class="fund-type-yellow1">已暂停</span>
        </div>

        <div class="clearfix"></div>
      </div>
      <table class="fund-table sub-placeholder">
        <tbody>
        <tr>
          <td class="trend fontsize-16" rowspan="2">每月5日</td>
          <td class="fontsize-16" rowspan="2">1,390.00</td>
          <td class="fontsize-16">招商银行</td>
          <td rowspan="2">
            <div class="sub-check">
              <i class="icon-checkbox"></i>
            </div>
          </td>
        </tr>
        <tr>
          <td class="trend td-height-s">
            <div class="fund-tips-s">
              [7337]
            </div>
          </td>
        </tr>
        <tr>
          <td><i class="fund-code">扣款日期</i></td>
          <td><i class="fund-code">定投金额（元）</i></td>
          <td><i class="fund-code">资金来源</i></td>
          <td></td>
        </tr>
        </tbody>
      </table>
        <div class="sub-btn sub-placeholder1">
          <a href="#" class="sub-btn-l bg-yellow">删除</a>
          <a href="#" class="sub-btn-r">重新启用</a>
        </div>
    </div>
</#macro>
<#include "../common/main.ftl">