<#macro htmlbody>
<div class="navbar-fixed-top">
    <header class="header">
        <div class="hl">
            <a href="javascript:history.go(-1);">
                <i class="icon-left"></i>
            </a>
        </div>
        <div class="title">
            客服与帮助
        </div>
        <div class="hr">
            &nbsp;
        </div>
    </header>
</div>
<div class="container-section">
    <div class="update service-help" style="justify-content: center">
        <div class="update-user">
            <img src="${base}/static/skin/${res.skin}/images/icon-service.png" alt="客服"/>
        </div>
        <div class="update-tip" >
            您好，<span>夏沫</span>，您遇到了哪类问题？
        </div>
    </div>
    <ul class="sub-list1 service-list">
        <a href="javascript:;">
            <li>
                    <span class="fontsize-15">
                        <!--<i class="icon-money"></i>-->
                        <img src="${base}/static/skin/${res.skin}/images/icon_money.png" alt=""/>
                        现金宝
                    </span>
                    <span class="sub-r">
                       <i class="icon-right-red"></i>
                    </span>
            </li>
        </a>
        <a href="javascript:;">
            <li>
                    <span class="fontsize-15">
                        <!--<i class="icon-bankcard"></i>-->
                        <img src="${base}/static/skin/${res.skin}/images/icon_bankcard.png" alt=""/>
                        实名认证、银行卡类
                    </span>
                    <span class="sub-r">
                        <i class="icon-right-red"></i>
                    </span>
            </li>
        </a>
        <a href="javascript:;">
            <li>
                    <span class="fontsize-15">
                        <!--<i class="icon-trade"></i>-->
                        <img src="${base}/static/skin/${res.skin}/images/icon_trade.png" alt=""/>
                        基金交易类
                    </span>
                    <span class="sub-r">
                        <i class="icon-right-red"></i>
                    </span>
            </li>
        </a>
        <a href="javascript:;">
            <li>
                    <span class="fontsize-15">
                        <!--<i class="icon-cost"></i>-->
                        <img src="${base}/static/skin/${res.skin}/images/icon_cost.png" alt=""/>
                        基金费用类
                    </span>
                    <span class="sub-r">
                        <i class="icon-right-red"></i>
                    </span>
            </li>
        </a>
        <a href="javascript:;">
            <li>
                    <span class="fontsize-15">
                        <!--<i class="icon-dollars"></i>-->
                        <img src="${base}/static/skin/${res.skin}/images/icon_dollars.png" alt=""/>
                        基金产品类
                    </span>
                    <span class="sub-r">
                        <i class="icon-right-red"></i>
                    </span>
            </li>
        </a>

        <a href="javascript:;">
            <li>
                    <span class="fontsize-15">
                        <!--<i class="icon-others"></i>-->
                        <img src="${base}/static/skin/${res.skin}/images/icon_others.png" alt=""/>
                        其他问题
                    </span>
                    <span class="sub-r">
                        <i class="icon-right-red"></i>
                    </span>
            </li>
        </a>
    </ul>
</div>
<div class="navbar-fixed-bottom">
	<div class="sub-btn">
		<a href="javascript:;" class="sub-btn-l bg-orange">
					<span class="online">
						<i class="icon-handset"></i>
						在线客服
					</span>
		</a>
		<a href="javascript:;" class="sub-btn-r">
			<i class="icon-call"></i>
			电话客服
		</a>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">