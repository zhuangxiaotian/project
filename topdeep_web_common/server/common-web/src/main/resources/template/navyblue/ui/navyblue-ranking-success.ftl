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
    function nameWidth(){
        var screenWidth=$(window).width();
        if(screenWidth<375){
            $(".msg-name").css("width","140px");
        }else if(screenWidth<400){
            $(".msg-name").css("width","220px");
        }else{
        	$(".msg-name").css("width","auto");
        }
    }
    nameWidth();
    $(window).resize(function(){
        nameWidth();
    })

</script>
</#macro>
<#macro htmlbody>
<div class="box">
    <div class="section bg-rank">
        <div class="place-border"></div>
        <div class="ranking">
            <ul class="sub-list ranking-list">
            	<li>
					<div class="number">
						昵称
					</div>
					<div class="msg center">
						排行
					</div>
				</li>
                <li>
                    <div class="number">
                        <i class="first"></i>
                    </div>
                    <div class="msg">
                        <div class="avatar">
                            <img src="${base}/static/skin/${res.skin}/images/bg1.png" alt="">
                        </div>
                        <div class="msg-detail">
                            <div class="msg-name">一个名字憋一上午一个名字憋一上午</div>
                            <div class="msg-number">已推荐：<span>5</span>人</div>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="number">
                        <i class="second"></i>
                    </div>
                    <div class="msg">
                        <div class="avatar">
                            <img src="${base}/static/skin/${res.skin}/images/bg1.png" alt="">
                        </div>
                        <div class="msg-detail">
                            <div class="msg-name">一个名字憋一上午</div>
                            <div class="msg-number">已推荐：<span>5</span>人</div>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="number">
                        <i class="third"></i>
                    </div>
                    <div class="msg">
                        <div class="avatar">
                            <img src="${base}/static/skin/${res.skin}/images/bg1.png" alt="">
                        </div>
                        <div class="msg-detail">
                            <div class="msg-name">一个名字憋一上午</div>
                            <div class="msg-number">已推荐：<span>5</span>人</div>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="number">4</div>
                    <div class="msg">
                        <div class="avatar">
                            <img src="${base}/static/skin/${res.skin}/images/bg1.png" alt="">
                        </div>
                        <div class="msg-detail">
                            <div class="msg-name">一个名字憋一上午</div>
                            <div class="msg-number">已推荐：<span>5</span>人</div>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="number">5</div>
                    <div class="msg">
                        <div class="avatar">
                            <img src="${base}/static/skin/${res.skin}/images/bg1.png" alt="">
                        </div>
                        <div class="msg-detail">
                            <div class="msg-name">一个名字憋一上午</div>
                            <div class="msg-number">已推荐：<span>5</span>人</div>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="number">6</div>
                    <div class="msg">
                        <div class="avatar">
                            <img src="${base}/static/skin/${res.skin}/images/bg1.png" alt="">
                        </div>
                        <div class="msg-detail">
                            <div class="msg-name">一个名字憋一上午</div>
                            <div class="msg-number">已推荐：<span>5</span>人</div>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="number">7</div>
                    <div class="msg">
                        <div class="avatar">
                            <img src="${base}/static/skin/${res.skin}/images/bg1.png" alt="">
                        </div>
                        <div class="msg-detail">
                            <div class="msg-name">一个名字憋一上午</div>
                            <div class="msg-number">已推荐：<span>5</span>人</div>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="number">8</div>
                    <div class="msg">
                        <div class="avatar">
                            <img src="${base}/static/skin/${res.skin}/images/bg1.png" alt="">
                        </div>
                        <div class="msg-detail">
                            <div class="msg-name">一个名字憋一上午</div>
                            <div class="msg-number">已推荐：<span>5</span>人</div>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="number">9</div>
                    <div class="msg">
                        <div class="avatar">
                            <img src="${base}/static/skin/${res.skin}/images/bg1.png" alt="">
                        </div>
                        <div class="msg-detail">
                            <div class="msg-name">一个名字憋一上午</div>
                            <div class="msg-number">已推荐：<span>5</span>人</div>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</div>
</#macro>
<#include "../common/main.ftl">