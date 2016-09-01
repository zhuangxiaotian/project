<#macro htmlhead>
<style>
h2{
    text-align: center;
}
#box>a{
    display: block;
    text-align: center;
    margin: 10px 0;
}
</style>
        </#macro>
<#macro htmlbody>
<div id="box">
                                        <h2>经纪人活动页面</h2>
        <a href="${base}/ui/navyblue.action?type=accountGet"  target="_blank">开户提取积分</a>
        <a href="${base}/ui/navyblue.action?type=successGet"  target="_blank">成功提取</a>
        <a href="${base}/ui/navyblue.action?type=erWei"  target="_blank">长按二维码</a>
        <a href="${base}/ui/navyblue.action?type=jingji"  target="_blank">经纪人活动2</a>
        <a href="${base}/ui/navyblue.action?type=ranking"  target="_blank">经纪人排行</a>
        <a href="${base}/ui/navyblue.action?type=redExchange"  target="_blank">红包兑换</a>
        <a href="${base}/ui/navyblue.action?type=myScore"  target="_blank">我的积分</a>
        <a href="${base}/ui/navyblue.action?type=scoreExchange"  target="_blank">积分兑换</a>
        <a href="${base}/ui/navyblue.action?type=trafficExchange"  target="_blank">流量兑换</a>
        <a href="${base}/ui/navyblue.action?type=scoreDetail"  target="_blank">积分明细</a>
        <a href="${base}/ui/navyblue.action?type=signedScoreDetail"  target="_blank">签到积分明细</a>
        <a href="${base}/ui/navyblue.action?type=unBind"  target="_blank">未绑定</a>

</div>
        </#macro>
<#include "../common/main.ftl">