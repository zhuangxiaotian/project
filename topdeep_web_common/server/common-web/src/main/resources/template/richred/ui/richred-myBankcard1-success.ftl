<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        我的银行卡
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<ul class="sub-list1">
    <li>
        <span class>
                <i class="bank-b004"></i>
                中国银行<em class="tip-sm">(尾号0335)</em>
        </span>
        <a class="sub-r" href="${base}/ui/richred.action?type=myBankcard2">
            <span class="red">解绑</span>
        </a>
    </li>
    <li>
         <span class>
                <i class="bank-b004"></i>
                中国银行<em class="tip-sm">(尾号0335)</em>
        </span>
        <a class="sub-r" href="${base}/ui/richred.action?type=myBankcard2">
        <span class="red">解绑</span>
    </a>
    </li>
    <li>
    <div class="bank-add red">
        <a href="${base}/ui/richred.action?type=myBankcard3">
            <i class="icon-add"></i>
            新增银行卡
        </a>
    </div>
    </li>
</ul>
</#macro>
<#include "../common/main.ftl">