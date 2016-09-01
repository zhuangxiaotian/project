<#macro jsimport>
<script>
        $(document).ready(function() {
            var myar = setInterval('AutoScroll("#scrollDiv")', 3000);
//            $("#scrollDiv").hover(
//                    function() { clearInterval(myar); },
//                    function() { myar = setInterval('AutoScroll("#scrollDiv")', 3000) }
//            ); //当鼠标放上去的时候，滚动停止，鼠标离开的时候滚动开始
        });
        function AutoScroll(obj){
            $(obj).find("ul:first").animate({
                        marginTop: "-25px"
                    },
                    500,
                    function() {
                        $(this).css({ marginTop: "0px" }).find("li:first").appendTo(this);
                    });
        }
</script>
</#macro>
<#macro htmlbody>
<div class="section">
<header class="header">
    <div class="hl">&nbsp;</div>
    <div class="title">
        <i class="icon-logo"></i>
        诺安基金
    </div>
    <div class="hr">&nbsp;</div>
</header>
<div class="banner">  <!-----banner---->
    <div id="slideBox" class="slideBox">
        <div class="bd">
            <ul>
                <li>
                    <a class="pic" href="#"><img src="${base}/static/skin/${res.skin}/images/banner1.png" /></a>
                </li>
                <li>
                    <a class="pic" href="#"><img src="${base}/static/skin/${res.skin}/images/banner1.png" /></a>
                </li>
                <li>
                    <a class="pic" href="#"><img src="${base}/static/skin/${res.skin}/images/banner1.png" /></a>
                </li>
            </ul>
        </div>
        <div class="hd">
            <ul></ul>
        </div>
    </div>
</div><!--banner-->
<div id="scrollDiv">
                <ul class="na_fund_tip">
                    <li><a href="javascript:;">诺安基金微理财上线，推荐好友奖励10元！</a></li>
                    <li><a href="javascript:;">诺安基金微理财诺安基金微理财诺安基金微理财诺安基金微理财诺安基金微理财诺安基金微理财</a></li>
                    <li><a href="javascript:;">诺安基金微理财上线，推荐好友奖励10元！</a></li>
                </ul>
                <i class="icon-sound notice"></i>
        </div>
<div class="na_fund bg-white">
    <div class="na_fund_receipt">
        <div class="gift-box">
            <div>
                <div class="icon-gift"></div>
                <div class="gift-tip-l">
                    <div>新手礼</div>
                    <div class="redpacket-numb">5-100元红包</div>
                </div>
            </div>
        </div>
        <div class="gift-box">
            <div class="gift-tip-r">邀请好友</div>
            <div class="gift-tip-r">给好友发红包</div>
        </div>
    </div>
</div>
<div class="na_fund bg-white margin0">
    <div class="na_fund_pro">
        <div class="na_fund_name">
            <span class="fontsize-l red">诺安现金宝</span>
            <em class="na_fund_date">2016-11-11</em>
        </div>
    </div>
    <div class="na_fund_receipt">
        <div class="fund_t">七日年化收益率</div>
        <div class="fund_t">
            万份收益(元)
        </div>
    </div>
    <div class="na_fund_receipt">
        <div class="fund_recl">3.666%</div>
        <div class="fund_recr">0.8871</div>
    </div>
    <div class="fund_adv">
        <span class="fund-type-red">每日计息</span>
        <span class="fund-type-red">随存随取</span>
        <span class="fund-type-red">1折买基金</span>
        <span class="fund-type-red">实时到账</span>
    </div>
    <div class="sub-btn sub-padding">
        <a class="sub-btn1" href="javascript:void(0);">立即充值</a>
    </div>
</div>
<div class="na_fund">
    <ul class="na_fund_detail margin">
        <li>
            <a href="javascript:void(0)" class="na_fund_title">
                热销基金
            </a>
        </li>
        <li></li>
    </ul>
    <div class="fund-list">
        <div class="fund-style">
            <span class="fund-type">保本</span>
            诺安益鑫保本
            <i class="fund-code">320023</i>
            <span class="fund-type1 distance-r">保本金</span>
            <span class="fund-type1">20%目标</span>
        </div>
        <i class="icon-zhekous fund-new">
            <em>新</em>
        </i>
        <table class="fund-table">
            <thead></thead>
            <tbody>
            <tr class="fund-detail">
                <td class="red">4.78%</td>
                <td>1.0000</td>
                <td>
                    <div class="sub-btn btn-buy">
                        <a href="javascript:;" class="sub-btn2">买 入</a>
                    </div>
                </td>
            </tr>
            <tr class="fund-title">
                <td class="w1">今年来涨跌</td>
                <td class="w1">认购净值(12-30)</td>
                <td class="w2 red">1折起</td>
            </tr>
            </tbody>
        </table>
        <i class="fund-new"></i>
        <div class="fund-description">
             <div class="font-color">诺安益鑫保本诺安益鑫保本诺安益鑫保本诺安益鑫保本诺安益鑫保本诺安益鑫保本诺安益鑫保本</div>
        </div>
    </div>
    <div class="fund-list">
        <div class="fund-style">
            <span class="fund-type">保本</span>
            诺安益鑫保本
            <i class="fund-code">320023</i>
            <span class="fund-type1 distance-r">保本金</span>
            <span class="fund-type1">20%目标</span>
        </div>
        <i class="icon-zhekous fund-new">
            <em>新</em>
        </i>
        <table class="fund-table">
            <thead></thead>
            <tbody>
            <tr class="fund-detail">
                <td class="red">4.78%</td>
                <td>1.0000</td>
                <td>
                    <div class="sub-btn btn-buy">
                        <a href="javascript:;" class="sub-btn2">买 入</a>
                    </div>
                </td>
            </tr>
            <tr class="fund-title">
                <td class="w1">今年来涨跌</td>
                <td class="w1">认购净值(12-30)</td>
                <td class="w2 red">1折起</td>
            </tr>
            </tbody>
        </table>
        <i class="fund-new"></i>
    </div>
</div>
</div>
<div class="tab-placeholder"></div>
<footer class="footer">
<ul class="index-tab">
    <li class="active">
        <a href="javascript:void(0)">
            <i class="icon-home"></i>
            <p>首页精选</p>
        </a>
    </li>
    <li>
        <a href="${base}/ui/richred.action?type=fundManage">
            <i class="icon-finance"></i>
            <p>基金理财</p>
        </a>
    </li>
    <li>
        <a href="${base}/ui/richred.action?type=myAssets">
            <i class="icon-assets"></i>
            <p>我的资产</p>
        </a>
    </li>
    <li>
        <a href="${base}/ui/richred.action?type=my">
            <i class="icon-account"></i>
            <p>我的</p>
        </a>
    </li>
</ul>
</footer>
</#macro>
<#include "../common/main.ftl">