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
        <div class="trade-detail-title">申购：诺安成长混合（320007）</div>
        <div class="trade-none">
            <div class="trade-detail-content">
                <img src="${base}/static/skin/${res.skin}/images/icon_doubt.png" alt="疑问">
            </div>
            <div class="trade-detail-content">
                <div>10000元</div>
                <div class="trade-sure gray">交易处理中</div>
            </div>
        </div>
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
        <label class="investment-title">申购金额：</label>
        <div class="sub-input">
          <span>10000元</span>
        </div>
      </li>
      <li class="login-list">
        <label class="investment-title">申购费率：</label>
        <div class="sub-input">
          <span>4折</span>
        </div>
      </li>
      <li class="login-list">
        <label class="investment-title">资金来源：</label>
        <div class="sub-input">
          <a href="javascript:;">
            <i class="bank-b002"></i>
            <span>工商银行7337<em class="red">99999.00元</em></span>
          </a>
          <div class="bank-tip">红包抵用券支付50元</div>
        </div>
      </li>
      <li class="login-list">
        <label class="investment-title">扣款状态：</label>
        <div class="sub-input">
          <span>
            未确认<span class="red">(待对账后确认)</span>
          </span>
        </div>
      </li>
      <li class="login-list">
        <label class="investment-title">交易渠道：</label>
        <div class="sub-input">
          <span>诺安直销</span>
        </div>
      </li>
    </ul>
<div class="sub-btn sub-padding">
    <div class="sub-btn1">撤单</div>
</div>
</#macro>
<#include "../common/main.ftl">