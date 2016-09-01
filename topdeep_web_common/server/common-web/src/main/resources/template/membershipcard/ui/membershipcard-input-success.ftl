<#macro jsimport>
<script type="text/javascript">
 $("#share").click(function(){
        $(".share").show();
    })
</script>
</#macro>
<#macro htmlbody>
<div class="container bg-yellow">
	<div class="main">
		<img src="${base}/static/skin/${res.skin}/images/img1_01.jpg" alt=""/>
		<img src="${base}/static/skin/${res.skin}/images/img1_02.jpg" alt=""/>
		<!--<img src="${base}/static/skin/${res.skin}/images/img1.jpg" alt=""/>-->
		<input type="text" placeholder="输入手机号"  class="a2"/>
		<input type="text" placeholder="确认手机号"  class="a3"/>
		<a href="javascript:;" class="a4" ></a>
		<a href="javascript:;" class="a5" id="share" ></a>
	</div>
</div>
<!--提示分享-->
<div class="share">
	<img src="${base}/static/skin/${res.skin}/images/share_02.png" alt="引导分享">
</div>
</#macro>
<#include "../common/main.ftl">