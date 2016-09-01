<#macro jsimport>
<script>
	//loading
	function showLoading(){
		var loadBox = $('<div class="dialog"></div>');
		var loadContent;
		var loadBody = '';
		loadBody+= '<div class="loading-content"></div>';
		loadContent=$(loadBody);
		loadBox.append(loadContent);
		$("body").append(loadBox);
	}
	//移除loading
	function hideLoading(){
		if($(".dialog")){
			$(".dialog").remove();
		}
	}
	$("#loading").click(function(){
		showLoading();
	})
</script>
</#macro>
<#macro htmlbody>
<div class="container bg-red">
	<div class="main">
		<img src="${base}/static/skin/${res.skin}/images/img2_01.jpg" alt=""/>
		<img src="${base}/static/skin/${res.skin}/images/img2_02.jpg" alt=""/>
		<a href="javascript:;" class="a5" id="loading" ></a>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">