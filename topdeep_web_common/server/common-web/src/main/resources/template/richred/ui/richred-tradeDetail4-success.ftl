<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:;"><i class="icon-left"></i></a>
    </div>
    <div class="title">交易明细</div>
    <div class="hr">&nbsp;</div>
</header>
<div class="header trade-detail">
    <div class="hl">&nbsp;</div>
    <div class="title">
        <div>
            <div class="trade-detail-content">
                <img src="${base}/static/skin/${res.skin}/images/icon_sure1.png" alt="成功">
            </div>
            <div class="trade-detail-content">
                 <div class="trade-name">转出：诺安成长混合</div>
            	 <div class="trade-name">转入：诺安中小盘混合</div>
            </div>
        </div>
        <div class="trade-sure orange">确认成功！</div>
    </div>
    <div class="hr">&nbsp;</div>
</div>
<ul class="sub-form form-trade">
      <li class="login-list">
        <label class="investment-title">下单时间：</label>
        <div class="sub-input">
          <span>2016-11-11 11:11</span>
        </div>
      </li>
      <li class="login-list">
        <label class="investment-title">申请日期：</label>
        <div class="sub-input">
          <span>
            2016-11-11
          </span>
        </div>
      </li>
      <li class="login-list">
        <label class="investment-title">确认日期：</label>
        <div class="sub-input">
          <span>
            2016-11-11
          </span>
        </div>
      </li>
      <li class="login-list">
        <label class="investment-title">转出份额：</label>
        <div class="sub-input">
          <span>10000份</span>
        </div>
      </li>
      <li class="login-list">
        <label class="investment-title">转出净值：</label>
        <div class="sub-input">
          <span>1.1314元</span>
        </div>
      </li>
      <li class="login-list">
        <label class="investment-title">转入份额：</label>
        <div class="sub-input">
          <span>10000份</span>
        </div>
      </li>
      <li class="login-list">
        <label class="investment-title">转入净值：</label>
        <div class="sub-input">
          <span>1.1314元</span>
        </div>
      </li>
      <li class="login-list">
        <label class="investment-title">销售机构：</label>
        <div class="sub-input">
          <span>诺安直销</span>
        </div>
      </li>
    </ul>
</#macro>
<#include "../common/main.ftl">