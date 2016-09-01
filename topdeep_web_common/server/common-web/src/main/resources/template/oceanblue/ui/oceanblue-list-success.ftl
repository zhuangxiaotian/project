<#macro htmlhead>
<style>
	#box>.weui_cells_title{font-size: 18px;font-weight: 600;color: #000000;}
</style>
</#macro>
<#macro htmlbody>
<div class="section">
        <div class="sub-cells">
                <a class="sub-cell" href="${base}/ui/oceanblue.action?type=index" target="_blank">
                    <div class="flex-cell">
                        <div>主页</div>
                    </div>
                    <div><i class="icon-right"></i></div>
                </a>
                <a class="sub-cell" href="${base}/ui/oceanblue.action?type=indexAlready" target="_blank">
                    <div class="flex-cell">
                        <div>主页(已登录)</div>
                    </div>
                    <div><i class="icon-right"></i></div>
                </a>
                <a class="sub-cell" href="${base}/ui/oceanblue.action?type=fundDetail" target="_blank">
                    <div class="flex-cell">
                        <div>主页_基金</div>
                    </div>
                    <div><i class="icon-right"></i></div>
                </a>
                <a class="sub-cell" href="${base}/ui/oceanblue.action?type=assetsDetail" target="_blank">
                    <div class="flex-cell">
                        <div>主页_资产详情</div>
                    </div>
                    <div><i class="icon-right"></i></div>
                </a>
                <a class="sub-cell" href="${base}/ui/oceanblue.action?type=fundProductDetail" target="_blank">
                    <div class="flex-cell">
                        <div>基金产品详情</div>
                    </div>
                    <div><i class="icon-right"></i></div>
                </a>
                <a class="sub-cell" href="${base}/ui/oceanblue.action?type=zzb" target="_blank">
                    <div class="flex-cell">
                        <div>增值宝</div>
                    </div>
                    <div><i class="icon-right"></i></div>
                </a>
                <a class="sub-cell" href="${base}/ui/oceanblue.action?type=zzbSave" target="_blank">
                    <div class="flex-cell">
                        <div>增值宝存入</div>
                    </div>
                    <div><i class="icon-right"></i></div>
                </a>
                <a class="sub-cell" href="${base}/ui/oceanblue.action?type=zzbDetail" target="_blank">
                    <div class="flex-cell">
                        <div>增值宝产品详情</div>
                    </div>
                    <div><i class="icon-right"></i></div>
                </a>
               
                <a class="sub-cell" href="${base}/ui/oceanblue.action?type=tradeDetail" target="_blank">
                    <div class="flex-cell">
                        <div>交易明细</div>
                    </div>
                    <div><i class="icon-right"></i></div>
                </a>
                <a class="sub-cell" href="${base}/ui/oceanblue.action?type=tradeSelect" target="_blank">
                    <div class="flex-cell">
                        <div>交易筛选</div>
                    </div>
                    <div><i class="icon-right"></i></div>
                </a>
                <a class="sub-cell" href="${base}/ui/oceanblue.action?type=tradeDetails" target="_blank">
                    <div class="flex-cell">
                        <div>交易详情</div>
                    </div>
                    <div><i class="icon-right"></i></div>
                </a>
                <a class="sub-cell" href="${base}/ui/oceanblue.action?type=breakeven" target="_blank">
                    <div class="flex-cell">
                        <div>区间盈亏</div>
                    </div>
                    <div><i class="icon-right"></i></div>
                </a>
                <a class="sub-cell" href="${base}/ui/oceanblue.action?type=viewport" target="_blank">
                    <div class="flex-cell">
                        <div>资讯视点</div>
                    </div>
                    <div><i class="icon-right"></i></div>
                </a>
                <a class="sub-cell" href="${base}/ui/oceanblue.action?type=viewportDetail" target="_blank">
                    <div class="flex-cell">
                        <div>热点资讯</div>
                    </div>
                    <div><i class="icon-right"></i></div>
                </a>
                <a class="sub-cell" href="${base}/ui/oceanblue.action?type=bigCash" target="_blank">
                    <div class="flex-cell">
                        <div>高端理财取现</div>
                    </div>
                    <div><i class="icon-right"></i></div>
                </a>
        </div>
</div>
</#macro>
<#include "../common/main.ftl">