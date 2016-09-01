<#macro jsimport>
<script type="text/javascript">
$("#test").click(function(){
    $("#alert").show();
})
</script>
</#macro>
<#macro htmlbody>
<div class="container bg-red">
    <div class="main">
        <img src="${base}/static/skin/${res.skin}/images/img3_01.jpg" alt=""/>
        <img src="${base}/static/skin/${res.skin}/images/img3_02.jpg" alt=""/>
        <a href="javascript:;" id="test" class="a5" ></a>
    </div>
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