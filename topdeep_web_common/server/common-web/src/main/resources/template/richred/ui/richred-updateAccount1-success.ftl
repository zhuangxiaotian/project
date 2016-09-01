<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        账户升级
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<div class="update service-help">
    <div class="update-users">
        <img src="${base}/static/skin/${res.skin}/images/icon-user.png" alt="用户"/>
    </div>
    <div class="update-tip">
        <div class="fail-tip">您是诺安基金代销客户，免费升级诺安直销账户后即可在本平台进行便捷交易。</div>
    </div>
</div>
<ul class="sub-form sub-form-s">
    <li>
        <label>姓<i class="text-placeholder">姓名</i>名</label>
        <div class="sub-input">
            夏沫
        </div>
    </li>
    <li>
        <label>证件类型</label>
        <div class="sub-input">
            身份证
        </div>
    </li>
    <li>
        <label>证件号码</label>
        <div class="sub-input">
            3404******0526
        </div>
    </li>
</ul>
<div class="sub-btn">
    <a href="${base}/ui/richred.action?type=updateAccount2" class="sub-btn1">免费升级</a>
</div>
<div class="sub-tip sub-placeholder sub-padding red center">立即免费升级，领取<em>5-100</em>元新手红包！</div>
</#macro>
<#include "../common/main.ftl">