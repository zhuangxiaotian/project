<#macro jsimport>
<script>
    $(document).ready(function(){
    	//选择框
    	function selectBox(){
    		$(".sub-select2").click(function() {
    			$(this).find(".select-list").slideToggle(100);
    			$(this).find(".icon-down").toggleClass("icon-up");
    		})
    	}
    	selectBox();
    	$('.select-list li').bind('click', function(){
    		selectValue=$(this).find("a").html();
    		$(this).parent().parent().find('.select-detail').html(selectValue);
    	});
    })
</script>
</#macro>
<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        我的消息
    </div>
    <div class="hr">
        <a href="#">编辑</a>
    </div>
</header>
<ul class="sub-list1 shadow-bottom sub-margin-d">
    <li class="sub-select2">
        <span class="select-detail">全部消息</span>
        <span class="sub-r">
            <i class="icon-down"></i>
        </span>
        <ul class="select-list" style="display: none;">
            <li>
                <a href="javascript:;">全部消息</a>
            </li>
            <li>
                <a href="javascript:;">交易消息</a>
            </li>
            <li>
                <a href="javascript:;">系统消息</a>
            </li>
            <li>
                <a href="javascript:;">活动消息</a>
            </li>
        </ul>

    </li>
</ul>
<ul class="sub-list2 shadow-bottom">
    <a href="javascript:;">
        <li>
            <div class="fund-type">交易</div>
            <div class="msg">
                <div class="msg-detail">您已成功购入诺安天天宝，确认份额</div>
                <div class="sub-date">2016-11-11 11:11</div>
            </div>
        </li>
    </a>
    <a href="javascript:;">
        <li>
            <div class="fund-type bg-yellow">系统</div>
            <div class="msg">
                <div class="msg-detail">您已成功购入诺安天天宝，确认份额确认份额确认份额确认份额</div>
                <div class="sub-date">2016-11-11 11:11</div>
            </div>
        </li>
    </a>
    <a href="javascript:;">
        <li>
            <div class="fund-type bg-yellow">活动</div>
            <div class="msg">
                <div class="msg-detail">您已成功购入诺安天天宝，确认份额确认份额确认份额确认份额</div>
                <div class="sub-date">2016-11-11 11:11</div>
            </div>
        </li>
    </a>
</ul>
</#macro>
<#include "../common/main.ftl">