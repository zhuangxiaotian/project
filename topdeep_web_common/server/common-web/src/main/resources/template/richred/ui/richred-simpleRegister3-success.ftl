<#macro htmlbody>
<div id="box">
    <header class="header">
        <div class="hl">
            <a href="javascript:history.go(-1);">
                <i class="icon-left"></i>
            </a>
        </div>
        <div class="title">
            注册成功
        </div>
        <div class="hr">
            &nbsp;
        </div>
    </header>
    <div class="sub-step">
        <img  src="${base}/static/skin/${res.skin}/images/icon_step3.png" alt="第3步"/>
    </div>
    <div class="sub-content">
        <p class="sub-title">您已注册成功！</p>
        <p class="sub-content-detail">新手红包已发送，可在<a href="javascript:;">我的-红包</a>中查询！</p>
    </div>
    <div class="sub-btn">
        <a href="javascript:;" class="sub-btn-l bg-orange">随便逛逛</a>
        <a href="${base}/ui/richred.action?type=realName1" class="sub-btn-r">完成实名认证</a>
    </div>
    <div class="sub-tip text-right red">
    	基金交易需先实名认证哦！
	</div>
</div>
</#macro>
<#include "../common/main.ftl">