<#macro jsimport>
<script>
    //loading
    function showLoading(){
        $("#loadings").show();
    }
    //移除loading
    function hideLoading(){
        if($("#loadings")){
            $("#loadings").remove();
        }
    }
    $("#loading").click(function(){
        showLoading();
    })
</script>
</#macro>
<#macro htmlbody>
<div class="box">
    <div class="section">
        <img src="${base}/static/skin/${res.skin}/images/traffic3.jpg" alt="手慢喽"/>
        <div class="none">
            <span>3000</span>份流量已经抢光啦！
        </div>
        <div class="tell1" id="loading">
            <a href="javascript:;"></a>
        </div>
    </div>
</div>

<div class="dialog" id="loadings" style="display: none;">
    <div class="loading-content"></div>
</div>
</#macro>
<#include "../common/main.ftl">