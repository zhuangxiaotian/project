<#macro htmlbody>
<div class="container">
        <div class="header">
            <div class="header-container">
                <div class="hl">
                    <a href="javascript:history.go(-1);" class="back">
                        <i class="icon-back"></i>
                    </a>
                </div>
                <div class="title">付款成功</div>
                <div class="hr">&nbsp;</div>
            </div>
        </div>
        <div class="weui_tab_bd">
            <div class="sub-content bg-white">
                <div class="state"><span class="icon-success"></span></div>
                <div class="state-detail">您已向对方付款，请等待对方收款！</div>
                <div class="state-content">
                    <div>支付金额：<em>100.00</em>元</div>
                    <div>协议号：<em>100.00</em>元</div>
                    <div>收款方：<span>*希</span></div>
                    <div>备注：<span>玉石交易</span></div>
                </div>
            </div>
            <div class="btn padding-spacing sub-placeholder-lg">
                <a href="${base}/ui/skyblue.action?type=indexAlready" class="weui_btn bg-blue">返回主页</a>
            </div>
        </div>
</div>
</#macro>
<#include "../common/main.ftl">