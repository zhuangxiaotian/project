<#macro jsimport>
<script>
$(document).ready(function(){
    //screenHeight
    function resizeBoxHeight(){
        var bodyHeight = $("body").innerHeight();
        var docHeight=$(".box").innerHeight();
        if(bodyHeight>docHeight){
            $(".box").css("height",bodyHeight);
        }else {
            $(".box").css("height",docHeight);
        }
    }
    resizeBoxHeight();
    $(window).resize(function(){
        resizeBoxHeight();
    })
})
</script>
</#macro>
<#macro htmlbody>
<div class="box container-l">
    <div class="section bg-jjr">
        <div class="place-border"></div>
        <div class="rule rule-jjr">
            <div class="rule-box">
                <div class="border-left"><img src="${base}/static/skin/${res.skin}/images/border-left.png" alt=""/></div>
                <div class="border-right"><img src="${base}/static/skin/${res.skin}/images/border-right.png" alt=""/></div>
                <div class="border-middle"><img src="${base}/static/skin/${res.skin}/images/rules.png" alt=""/></div>
                <div class="rule-detail">
                    <div>
                        <div class="title"><i class="number1"></i></div>
                        <div class="content">活动时间：2016.4.1-2016.5.1</div>
                    </div>
                    <div>
                        <div class="title"><i class="number2"></i></div>
                        <div class="content">本次活动积分可兑换的现金红包为可变现的建信增值宝份额。<span class="rule-tip">(选择积分兑换现金红包的客户，我公司将在您成功提取红包后的十个工作日内，将红包金额存入您的直销账户，届时请您通过我公司官方微信或官网查询份额到账情况)</span></div>
                    </div>
                    <div>
                        <div class="title"><i class="number3"></i></div>
                        <div class="content">用户参与此次活动即视为同意此次活动的规则，本次活动的最终解释权归建信基金管理有限责任公司所有。</div>
                    </div>
                </div>
            </div>
        </div>
        <div class="btn1 padding-b" id="test">
            <a href="javascript:;">邀请好友</a>
        </div>
    </div>
</div> 
</#macro>
<#include "../common/main.ftl">