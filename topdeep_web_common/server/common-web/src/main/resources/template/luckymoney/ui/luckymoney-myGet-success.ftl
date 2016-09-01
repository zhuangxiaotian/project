<#macro jsimport>
<script type="text/javascript">
function showTip(){
	document.getElementById('mask').style.display = 'block';
	document.getElementById('tip').style.display = 'block';
}
function hideTip(){
	document.getElementById('mask').style.display = 'none';
	document.getElementById('tip').style.display = 'none';
};
</script>
</#macro>
<#macro htmlbody>
<div class="container">
	<img src="${base}/static/skin/${res.skin}/images/bg2.jpg" alt="红包总金额"/>
	<div class="total"><em>12.58</em>元</div>
	<a class="btn-get" href="javascript:showTip();"></a>
	<div class="detail">
		<div class="list">
			<img src="${base}/static/skin/${res.skin}/images/icon_logo1.png" alt="logo"/>
			<dl>
				<dt>建信增值宝APP送你的红包</dt>
				<dd>19:30　2016-12-28</dd>
			</dl>
			<span class="money"><em>0.97</em>元</span>
		</div>
		<div class="list">
			<img src="${base}/static/skin/${res.skin}/images/icon_logo1.png" alt="logo"/>
			<dl>
				<dt>建信增值宝送你的红包</dt>
				<dd>19:30　2016-12-28</dd>
			</dl>
			<span class="money"><em>0.97</em>元</span>
		</div>
		<div class="list">
			<img src="${base}/static/skin/${res.skin}/images/icon_logo1.png" alt="logo"/>
			<dl>
				<dt>建信增值宝送你的红包</dt>
				<dd>19:30　2016-12-28</dd>
			</dl>
			<span class="money"><em>0.97</em>元</span>
		</div>
		<div class="list">
			<img src="${base}/static/skin/${res.skin}/images/icon_logo1.png" alt="logo"/>
			<dl>
				<dt>建信增值宝送你的红包</dt>
				<dd>19:30　2016-12-28</dd>
			</dl>
			<span class="money"><em>0.97</em>元</span>
		</div>
		<div class="list">
			<img src="${base}/static/skin/${res.skin}/images/icon_logo1.png" alt="logo"/>
			<dl>
				<dt>建信增值宝送你的红包</dt>
				<dd>19:30　2016-12-28</dd>
			</dl>
			<span class="money"><em>0.97</em>元</span>
		</div>
	</div>
</div>
<div class="mask" id="mask"></div>
<div class="tip-account" id="tip">
	<div>
		<img src="${base}/static/skin/${res.skin}/images/alert_tip.png" alt="请先开户哟～"/>
		<div class="tip">
			<div>为了能将红包金额火速送达到您的账户</div>
			<div>请先开户或者绑定您的网上直销账户吧！</div>
		</div>
		<a href="javascript:hideTip();" class="close"></a>
		<a href="javascript:;" class="bind"></a>
		<a href="javascript:;" class="open"></a>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">