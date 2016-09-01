<#macro jsimport>
<script>
window.onload=function(){
	//screenHeight
    function resizeBoxHeight(){
        var bodyHeight = $("body").outerHeight(true);
        var docHeight=$(".box").outerHeight(true);
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
}
</script>
</#macro>
<#macro htmlbody>
<div class="box">
    <div class="section bg-score">
        <div class="place-border"></div>
        <div class="myscore">
            <div class="score-box">
                <div class="photo">
                    <img src="${base}/static/skin/${res.skin}/images/photo.png" alt=""/>
                </div>
                <div class="total">总积分</div>
                <div class="score">1000</div>
                <table class="table">
                    <thead>
                    <tr class="border-none">
                        <th>
                            <div>签到积分</div>
                        </th>
                        <th>
                            <div>经纪人积分</div>
                        </th>
                        <th>
                            <div>交易积分</div>
                        </th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr class="score-detail">
                        <td>6666666</td>
                        <td>8888888</td>
                        <td>7777777</td>
                    </tr>
                    </tbody>
                </table>
                <div class="btn-group">
                    <div class="btn-yellow">
                        <a href="javascript:;">签到</a>
                    </div>
                    <div class="btn-red">
                        <a href="javascript:;">积分兑换</a>
                    </div>
                </div>
            </div>
        </div>
        <div class="btn1 btn-score">
            <a href="javascript:;">经纪人排行榜</a>
        </div>
        <div class="text-placeholder"></div>
    </div>
    <div class="warm">
            <span class="icon-tip"></span><span>温馨提示：点击积分数值您可查看最近一个月的记录明细。</span>
    </div>
</div>
</#macro>
<#include "../common/main.ftl">