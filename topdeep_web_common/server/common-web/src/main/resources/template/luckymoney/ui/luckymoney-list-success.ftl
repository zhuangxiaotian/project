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
	<h2>抢红包</h2>
	<a href="${base}/ui/luckymoney.action?type=index"  target="_blank">活动首页</a><br/>
	<a href="${base}/ui/luckymoney.action?type=myGet"  target="_blank">红包总额</a><br/>
	<a href="${base}/ui/luckymoney.action?type=getFail"  target="_blank">抢红包失败</a><br/>
</#macro>
<#include "../common/main.ftl">