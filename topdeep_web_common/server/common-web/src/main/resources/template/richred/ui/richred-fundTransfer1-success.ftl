<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        转换
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<div class="fund-name">诺安成长混合(000818)</div>
<ul class="sub-form">
    <li class="login-list">
        <label>转换账户</label>
        <div class="sub-input">
            <a href="${base}/ui/richred.action?type=bankResources">
                 <i class="bank-b002"></i>
              	 <span>工商银行<em>0335</em></span>
                 <i class="icon-right-red sub-float"></i>
            </a>
        </div>
    </li>
    <li class="login-list">
        <label>转出份额</label>
        <div class="sub-input">
           <input type="text" placeholder="请输入转出份额≤400.00">
          <input type="text" readonly="readonly" value="全部转出"  class="sub-redeem"/>
        </div>
    </li>
    <li class="login-list">
        <label>转入基金</label>
        <div class="sub-input">
            <a href="${base}/ui/richred.action?type=fundList">
                <div class="tip-md">请选择转入基金</div>
                <i class="icon-right-red sub-float"></i>
            </a>
        </div>
    </li>
</ul>
<div class="sub-btn">
    <a href="javascript:;" class="sub-btn1 sub-placeholder">下一步</a>
</div>
<div class="warm-tips">
    <div class="font-light"><i class="icon-yellow"></i><strong>温馨提示：</strong>为了保障您的资金安全，资金遵循同卡进出原则，从哪张银行卡存入的资金，取现也将回到该卡中。</div>
</div>
</#macro>
<#include "../common/main.ftl">