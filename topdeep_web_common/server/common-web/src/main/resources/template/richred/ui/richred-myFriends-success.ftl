<#macro jsimport>
</#macro>
<#macro htmlbody>
    <header class="header">
        <div class="hl">
            <a href="javascript:history.go(-1);">
                <i class="icon-left"></i>
            </a>
        </div>
        <div class="title">
            邀请好友
        </div>
        <div class="hr">
            &nbsp;
        </div>
    </header>
    <div class="sub-tip center sub-placeholder1">
        <img  class="erweima" src="${base}/static/skin/${res.skin}/images/lionerweima.png" alt="二维码"/>
        <div class="center font-color sub-padding">邀请好友扫一扫</div>
    </div>
    <div class="sub-btn sub-placeholder sub-padding">
        <a href="${base}/ui/richred.action?type=my" class="sub-btn1">分享给好友</a>
    </div>
    
</#macro>
<#include "../common/main.ftl">