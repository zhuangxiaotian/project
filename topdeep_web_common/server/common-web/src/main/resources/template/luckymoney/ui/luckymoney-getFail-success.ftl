<#macro jsimport>
<script type="text/javascript">
function showAgain(){
	document.getElementById('mask').style.display = 'block';
	document.getElementById('again').style.display = 'block';
}
function hideAgain(){
	document.getElementById('mask').style.display = 'none';
	document.getElementById('again').style.display = 'none';
};
</script>
</#macro>
<#macro htmlbody>
<div class="container">
	<img id="pic" src="${base}/static/skin/${res.skin}/images/bg1.jpg" alt="一起来抢红包雨"/>
	<div class="pic"><img src="${base}/static/skin/${res.skin}/images/come.png" alt="一起来抢"/></div>
	<a class="btn-start" href="javascript:showAgain();"></a>
	<div class="footer">*本活动最终解释权归建信基金所有</div>
</div>
<div class="mask" id="mask"></div>
<div class="again" id="again">
	<div>
		<img src="${base}/static/skin/${res.skin}/images/alert_fail.png" alt="再抽一次"/>
		<div class="again-tip">
			<div>很遗憾，红包与你擦肩而过！</div>
			<div>再来一次哦！</div>
		</div>
		<a href="javascript:hideAgain();" class="close"></a>
		<a href="${base}/ui/luckymoney.action?type=index" class="btn-again"></a>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">