<#macro htmlbody>
<div class="message">
    <div class="photo"><img src="${base}/static/skin/${res.skin}/images/photo.png" alt="头像"></div>
    <div class="name">伊雪</div>
    <div class="score">我的积分：120000分</div>
</div>
<div class="jifen">
    <div class="jifen-box">
        <div>
            <div class="jifen-pic">
                <img src="${base}/static/skin/${res.skin}/images/jifen_l.png" alt="签到"/>
            </div>
            <div class="jifen-detail">签到积分</div>
        </div>
    </div>
    <div class="jifen-box">
        <div>
            <div class="jifen-pic">
                <img src="${base}/static/skin/${res.skin}/images/jifen_r.png" alt="经纪人"/>
            </div>
            <div class="jifen-detail">经纪人积分</div>
        </div>
    </div>
</div>
<div class="padding-box">
    <div class="tip">
        <a href="javascript:;">
            <div class="tip-pic">
                <img src="${base}/static/skin/${res.skin}/images/tip1.png" alt=""/>
                <div class="hot"></div>
            </div>
        </a>
        <div class="tip-box">
            <div>可兑换<span class="red">10元</span>红包</div>
            <div class="text-r">
                <a href="#" class="btn">马上兑换</a>
            </div>
        </div>
    </div>
    <div class="tip">
        <a href="javascript:;">
            <div class="tip-pic">
                <img src="${base}/static/skin/${res.skin}/images/tip2.png" alt=""/>
                <div class="hot"></div>
            </div>
        </a>
        <div class="tip-box">
            <div>可兑换<span class="red">10M</span>流量</div>
            <div class="text-r">
                <a href="#" class="btn">马上兑换</a>
            </div>
        </div>
    </div>
</div>
</#macro>
<#include "../common/main.ftl">