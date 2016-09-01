<#macro htmlhead>
</#macro>

<#macro jsimport>
</#macro>
<#macro htmlbody>
<#if res.success ==true>
<h>激活成功,请<a href="${base}/h/login.action">点击登录</a></h>
<#else>
<h>${res.tipMessage}</h>
</#if>
</#macro>
<#include "${res.template.main}">