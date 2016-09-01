<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:;">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        盈亏明细
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<table class="fund-table">
    <thead>
    <tr>
      <th><div class="border-r">单位净值</div></th>
      <th><div class="border-r">份额</div></th>
      <th><div class="border-r">市值</div></th>
      <th><div class="border-r">当日盈亏</div></th>
    </tr>
    </thead>
    <tbody>
    <tr class="border-top">
      <td>
        <div>3.234%</div>
        <div>
          <i class="table-title-s">(16-02-26)</i>
        </div>
      </td>
      <td>2000</td>
      <td>1.2093</td>
      <td class="red">
          <div>+1.13</div>
          <div>(+1.13%)</div>
      </td>
    </tr>
    <tr class="border-top">
        <td>
            <div>3.234%</div>
            <div>
                <i class="table-title-s">(16-02-26)</i>
            </div>
        </td>
        <td>2000</td>
        <td>1.2093</td>
        <td class="blue">
            <div>-1.13</div>
            <div>(-1.13%)</div>
        </td>
    </tr>
    </tbody>
</table>
</#macro>
<#include "../common/main.ftl">