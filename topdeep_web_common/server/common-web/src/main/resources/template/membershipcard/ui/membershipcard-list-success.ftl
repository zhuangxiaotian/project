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
                                        <h2>会员卡活动页面导航</h2>
        <a href="${base}/ui/membershipcard.action?type=input"  target="_blank">input</a>
        <a href="${base}/ui/membershipcard.action?type=get"  target="_blank">get</a>
        <a href="${base}/ui/membershipcard.action?type=received"  target="_blank">received</a>
        <a href="${base}/ui/membershipcard.action?type=end"  target="_blank">end</a>
        <a href="${base}/ui/membershipcard.action?type=alert"  target="_blank">alert</a>
        <a href="${base}/ui/membershipcard.action?type=slow"  target="_blank">slow</a>

</div>
        </#macro>
<#include "../common/main.ftl">