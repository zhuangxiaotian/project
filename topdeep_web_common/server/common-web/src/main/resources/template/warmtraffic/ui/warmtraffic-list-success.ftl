<#macro htmlhead>
<style>
#box>a{
    display: block;
    text-align: center;
    margin: 10px 0;
}
</style>
</#macro>
<#macro htmlbody>
<div id="box">
	<h2>送流量</h2>
	<a href="${base}/ui/warmtraffic.action?type=index"  target="_blank">活动首页</a><br/>
	<a href="${base}/ui/warmtraffic.action?type=share"  target="_blank">红包兑换分享</a><br/>
	<a href="${base}/ui/warmtraffic.action?type=traffic1"  target="_blank">流量1</a><br/>
	<a href="${base}/ui/warmtraffic.action?type=traffic2"  target="_blank">流量2</a><br/>
	<a href="${base}/ui/warmtraffic.action?type=traffic3"  target="_blank">流量3</a><br/>
</#macro>
<#include "../common/main.ftl">