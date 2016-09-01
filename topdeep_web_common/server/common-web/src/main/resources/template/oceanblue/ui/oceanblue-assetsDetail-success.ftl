<#macro jsimport>
<!-- iSroll -->
<script src="${base}/static/js/vendors/iscroll/iscroll.js" type="text/javascript"></script>
<script>
$(function(){
    setPullLoad(235,function(setScroll){
        alert("调用Ajax");
        setScroll();
    });
});
</script>
</#macro>
<#macro htmlbody>
<header class="header-container">
    <a class="back" href="javascript:history.go(-1);"><i></i></a>
    <h1 class="title">查看资产详情</h1>
</header>
<div class="assets-detail">
    <img src="${base}/static/skin/${res.skin}/images/bg_zzb.png" alt="bg_pic"/>
    <div class="date"><a href="javascript:;">交易明细查询</a></div>
    <div class="assets-number">8,666,999.00</div>
    <div class="assets-total">总资产 (元)</div>
    <div class="assets-shares">
        <div class="center">
            <div class="data">125.84</div>
            <div class="data-title">最近盈亏 (元)</div>
        </div>
        <div class="flex-cell">
            <div class="data">30,125.84</div>
            <div class="data-title">近一年累计盈亏 (元)</div>
        </div>
    </div>
</div>
<div class="iscroll_wrapper">
    <div>
        <div class="sub-cells assets-fund">
            <div class="sub-cell">
                <div class="d"></div>
                <div class="fund-name">增值宝</div>
            </div>
            <a class="sub-cell fund-shares">
                <div class="flex-cell">
                    <div class="shares-number">1,000.26</div>
                    <div class="gray">资产&nbsp;(元)</div>
                </div>
                <div class="flex-cell">
                    <div class="shares-number red">3.14</div>
                    <div class="gray">最近收益&nbsp;(元)</div>
                </div>
                <i class="icon-right"></i>
                <div class="divider"></div>
            </a>
        </div>
        <div class="sub-cells assets-fund">
            <div class="sub-cell">
                <div class="d"></div>
                <div class="fund-name">增值宝</div>
            </div>
            <a class="sub-cell fund-shares">
                <div class="flex-cell">
                    <div class="shares-number">1,000.26</div>
                    <div class="gray">资产&nbsp;(元)</div>
                </div>
                <div class="flex-cell">
                    <div class="shares-number green">-5.46</div>
                    <div class="gray">最近收益&nbsp;(元)</div>
                </div>
                <i class="icon-right"></i>
                <div class="divider"></div>
            </a>
        </div>
        <div class="sub-cells assets-fund">
            <a class="sub-cell">
                <div class="d"></div>
                <div class="fund-name">可撤单交易</div>
                <div class="flex-cell text-r"><span>4,000.00</span></div>
                <i class="icon-right fr"></i>
            </a>
        </div>
        <div class="sub-cells assets-fund">
            <a class="sub-cell">
                <div class="d"></div>
                <div class="fund-name">区间盈亏</div>
                <div class="flex-cell"></div>
                <i class="icon-right fr"></i>
            </a>
        </div>
    </div>
</div>
<div class="navbar">
    <ul class="navbar-nav">
		<li>
			<a href="${base}/ui/oceanblue.action?type=indexAlready">
				<span class="icon-home"></span>
				<span class="navbar-label">增值宝</span>
			</a>
		</li>
		<li class="">
			<a href="${base}/ui/oceanblue.action?type=fundDetail">
				<span class="icon-fund"></span>
				<span class="navbar-label">基金</span>
			</a>
		</li>
		<li class="active">
			<a href="${base}/ui/oceanblue.action?type=assetsDetail">
				<span class="icon-high"></span>
				<span class="navbar-label">资产详情</span>
			</a>
		</li>
		<li class="">
			<a href="javascript:;">
				<span class="icon-more"></span>
				<span class="navbar-label">更多</span>
			</a>
		</li>
	</ul>
</div>
</#macro>
<#include "../common/main.ftl">