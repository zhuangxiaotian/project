<#macro htmlbody>
<div class="detail">
    <div class="photo">
        <img src="${base}/static/skin/${res.skin}/images/data.png" alt="明细">
    </div>
    <div class="name">我的积分明细</div>
</div>
<div class="tip">
    <div class="tip-box">
        <div><span class="no1"></span><span>签到：100分</span></div>
        <div class="text-r">
            <a href="#" class="btn-border">查看明细</a>
        </div>
    </div>
</div>
<div class="tip">
    <div class="tip-box">
        <div><i class="no2"></i>经纪人：100分</div>
        <div class="text-r">
            <a href="#" class="btn-border">查看明细</a>
        </div>
    </div>
</div>
<div class="tip">
    <div class="tip-box">
        <div><i class="no3"></i>交易：100分</div>
        <div class="text-r">
            <a href="#" class="btn-border">查看明细</a>
        </div>
    </div>
</div>
<div class="warm">
	<span class="red">温馨提示</span><span class="font-normal">：客户可查看明细为最近一个月的记录。</span>
</div>
</#macro>
<#include "../common/main.ftl">