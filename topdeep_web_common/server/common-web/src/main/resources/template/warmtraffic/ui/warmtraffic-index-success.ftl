<#macro jsimport>
<script type="text/javascript">
    function boxHeight(){
    	var bodyHeight = $("body").outerHeight();
        var wHeight = $(".box-index").outerHeight();
        $(".box-index").css("height", wHeight);
        if(bodyHeight>wHeight){
            $(".box-index").css("height",bodyHeight);
        }else {
            $(".box-index").css("height",wHeight);
        }
    }
    boxHeight();
    $(window).resize(function(){
    	boxHeight();
    })
    $(document).ready(function(){
        
    })
    $("input").bind("focus",function(){
            $('html,body').animate({scrollTop:200});
    });
    $("＃telePhone1").bind("blur",function(){
            $('html,body').animate({scrollTop:0});
    });
    //dialog
    $("#test").click(function(){
        $("#alert").show();
    })
    $(".dialog-close").click(function(){
        $("#alert").hide();
    })
    $("#share").click(function(){
        $(".share").show();
    })

</script>
</#macro>
<#macro htmlbody>
<div class="box box-index">
	<div class="section section-index">
	    <div class="place-border"></div>
		<div class="adv">
			<img src="${base}/static/skin/${res.skin}/images/bg_get.png" alt="">
			<div class="adv1">
				<span>500</span>M
			</div>
			<div class="adv2">
				<span>500</span>M流量大礼包
			</div>
		</div>
	    <div class="input1">
	        <input type="text" placeholder="输入手机号"/>
	    </div>
	    <div class="input2">
	        <input type="text" placeholder="确认手机号"/>
	    </div>
	    <div class="charge" id="test">
	        <a href="javascript:;">马上来充值</a>
	    </div>
	    <div class="tell_index">
	        <a href="javascript:;" id="share">告诉好友</a>
	    </div>
	</div>
</div>
<!--提示分享-->
<div class="share">
    <img src="${base}/static/skin/${res.skin}/images/share_02.png" alt="引导分享">
</div>
<!--alert-->
<div class="dialog" id="alert" style="display: none;">
    <div class="cover"></div>
    <div class="dialog-content">
        <div class="dialog-style">
            <a href="javascript:;" class="dialog-close"><i></i></a>
        </div>
        <p class="dialog-detail-m">您已经领取过了哟</p>
        <div class="dialog-btn">
            <a href="javascript:;" class="sub-btn1 btn-only">确定</a>
        </div>
    </div>
</div>
</#macro>
<#include "../common/main.ftl">