<#macro jsimport>
 <script>
 function showSelect(nameId,selectId){
		function init(){
			var $nameId=$(nameId);
			$nameId.on("click",function(){
				var $mask = $('#mask');
				var $selectList=$(selectId);
				$selectList.addClass('select_fade');
				$selectList.find(".select_cell").on("click",function(){
					$nameId.html($(this).html());
					hideSelectList($selectList, $mask);
				})
				$mask.show().focus().addClass('mask_fade').one('click',function(){
					hideSelectList($selectList, $mask);
				});
				$mask.unbind('transitionend').unbind('webkitTransitionEnd');
			});

		};
		function hideSelectList(selectList, mask) {
			selectList.removeClass('select_fade');
			mask.removeClass('mask_fade');
			mask.on('transitionend', function () {
				mask.hide();
			}).on('webkitTransitionEnd', function () {
				mask.hide();
			})
		}
		init();
	}
        $(document).ready(function(){
            $(".sub-radio").click(function(){
                $(this).parent().parent().find("i").removeClass("icon-radios");
                $(this).find(".icon-radio").addClass('icon-radios');
            })
        })
    new showSelect("#dateSelect","#dateList");
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
        选择扣款周期
    </div>
    <div class="hr">
    </div>
</header>
<ul class="sub-list investment-date">
    <li>
        <span class="sub-radio">
            <i class="icon-radio"></i>
            每月
        </span>
        <a href="javascript:;" class="sub-r date-select">
            <span>1号</span>
            <i class="icon-down"></i>
        </a>
    </li>
    <li>
        <span class="sub-radio">
            <i class="icon-radio"></i>
            每周
        </span>
        <a href="javascript:;" class="sub-r date-select">
            <span>周一</span>
            <i class="icon-down"></i>
        </a>
    </li>
    <li>
        <span class="sub-radio">
            <i class="icon-radio"></i>
            每双周
        </span>
        <div  class="sub-r select_box">
            <a href="javascript:;" class="select" id="dateSelect">周一</a>
            <i class="icon-down"></i>
        </div>
    </li>
</ul>
<div class="select_content">
    <div class="mask" id="mask"></div>
    <div class="select_list" id="dateList">
        <div class="select_menu">
            <div class="select_cell">周一</div>
            <div class="select_cell">周二</div>
            <div class="select_cell">周三</div>
            <div class="select_cell">周四</div>
            <div class="select_cell">周五</div>
            <div class="select_cell">周六</div>
            <div class="select_cell">周日</div>
        </div>
    </div>
</div>
</#macro>
<#include "../common/main.ftl">