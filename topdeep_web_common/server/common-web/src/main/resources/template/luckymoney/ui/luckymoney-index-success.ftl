<#macro jsimport>
<script type="text/javascript">
function showGet(){
	document.getElementById('mask').style.display = 'block';
	document.getElementById('get').style.display = 'block';
}
function hideGet(){
	document.getElementById('mask').style.display = 'none';
	document.getElementById('get').style.display = 'none';
};
</script>
</#macro>
<#macro htmlbody>
<div class="container">
	<img src="${base}/static/skin/${res.skin}/images/bg1.jpg" alt="一起来抢红包雨"/>
	<div class="pic"><img src="${base}/static/skin/${res.skin}/images/come.png" alt="一起来抢"/></div>
	<a class="btn-start" href="javascript:showGet();"></a>
	<div class="footer">*本活动最终解释权归建信基金所有</div>
</div>
<div class="mask" id="mask"></div>
<div class="get" id="get">
<div>
		<img src="${base}/static/skin/${res.skin}/images/alert.png" alt="恭喜中奖"/>
		<div class="get-money"><em>9.68</em>元</div>
		<div class="get-tip">
			<div>恭喜你获得</div>
			<div>建信小V送出的理财红包</div>
		</div>
		<a href="${base}/ui/luckymoney.action?type=myGet" class="get-start"></a>
</div>
</div>
</#macro>
<#include "../common/main.ftl">