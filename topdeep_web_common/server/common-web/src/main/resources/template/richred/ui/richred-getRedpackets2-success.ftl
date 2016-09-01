<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        评价领红包
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<div class="sub-step">
    <img class="redpacket" src="${base}/static/skin/${res.skin}/images/icon_redpacket.png" alt="红包"/>
</div>
<div class="sub-content">
    <p class="sub-title">感谢您的评价，送您一个<span class="red">红包</span>！</p>
    <p class="sub-content-detail">新手红包已发送，可在<a href="javascript:;">我的-红包</a>中查询！</p>
</div>
<div class="sub-btn">
    <a href="javascript:;" class="sub-btn1">完成</a>
</div>
</#macro>
<#include "../common/main.ftl">