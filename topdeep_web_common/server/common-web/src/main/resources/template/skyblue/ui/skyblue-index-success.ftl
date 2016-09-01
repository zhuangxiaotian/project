<#macro jsimport>
<script>
$(document).ready(function(){
	var tabbar = {
			//菜单切换
			"tabExchange" : function() {
				$(".weui_tabbar>a").bind("click" , function(){
					$(this).addClass("active").siblings().removeClass("active");
					$(".tabbar-panel").hide();
					$(".tabbar-panel").eq($(this).index()).show();
				});
			}
		}
	tabbar.tabExchange();
})
</script>
</#macro>
<#macro htmlbody>
<div class="container">
    <!--首页结算易-->
    <div class="tabbar-panel" style="display: block;">
        <div class="header">
            <div class="header-container">
                <div class="hl">
                </div>
                <div class="title">结算易</div>
                <div class="hr">
                    <a href="${base}/ui/skyblue.action?type=registerMsg">注册 </a>/<a href="${base}/ui/skyblue.action?type=indexAlready"> 登录</a>
                </div>
            </div>
        </div>
        <div class="weui_tab_bd section bg-white">
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
                        <ul>
                        </ul>
                    </div>
                </div>
            </div><!--banner-->
            <div id="scrollDiv" class="bg-gray">
                <ul class="na_fund_tip">
                    <li><a href="javascript:;">建信基金微理财上线，推荐好友奖励10元！</a></li>
                    <li><a href="javascript:;">建信基金微理财诺安基金微理财诺安基金微理财</a></li>
                </ul>
                <i class="icon-notice notice"></i>
            </div>
            <div class="fund">
                <div class="sub-cell">
                    <div class="flex-cell blue text-center fontsize-16">建信货币基金(530002)</div>
                </div>
                <div class="sub-cell">
                    <div class="flex-cell text-center fund-detail">
                        <img src="${base}/static/skin/${res.skin}/images/icon_round.png" alt="半圆">
                        <div class="fund-data">
                            <div class="seven">3.712%</div>
                            <div class="seven-date">7日年化 (4-26)</div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="sub-cell padding-b20">
                <div class="flex-cell btn"><a class="weui_btn bg-yellow">取出</a></div>
                <div class="flex-cell btn"><a class="weui_btn bg-blue">存入</a></div>
            </div>
        </div>
    </div>
    <!--首页收付款-->
    <div class="tabbar-panel" style="display: none;">
		<div class="header">
			<div class="header-container">
				<div class="hl">
					<a href="javascript:history.go(-1);" class="back">
						<i class="icon-back"></i>
					</a>
				</div>
				<div class="title">收付款</div>
				<div class="hr">&nbsp;</div>
			</div>
		</div>
        <div class="weui_tab_bd bg-gray section">
        	<div class="scan">
                    <img src="${base}/static/skin/${res.skin}/images/bg_sacrifice.png" alt=""/>
                    <div class="scan-content">
                        <a href="javascript:;">
                            <img src="${base}/static/skin/${res.skin}/images/icon_scan.png" alt="扫一扫"/>
                            <div class="padding-spacing">扫一扫</div>
                        </a>
                    </div>
            </div>
            <div class="sub-cell sacrifice">
                    <a class="get flex-cell" href="${base}/ui/skyblue.action?type=cashier">
                        <div><img src="${base}/static/skin/${res.skin}/images/icon_get.png" alt="我要收款"></div>
                        <div>我要收款</div>
                    </a>
                    <a class="pay flex-cell" href="${base}/ui/skyblue.action?type=pay">
                        <div><img src="${base}/static/skin/${res.skin}/images/icon_pay.png" alt="我要付款"></div>
                        <div>我要付款</div>
                    </a>
            </div>
        </div>
    </div>
    <!--首页资产-->
    <div class="tabbar-panel" style="display: none;">
    	<div class="weui_tab_bd ">
    		<div class="bg-index">
		            <div class="sub-cell font-white padding-spacing-lr">
		                <div class="flex-cell">
		                    总资产(元)：
		                </div>
		                <div class="flex-cell text-r">数据日期：2016-12-26</div>
		            </div>
		            <div class="sub-cell">
		                <div class="weui_cell_bd weui_cell_primary ccb-assets">
		                    10000.00
		                </div>
		            </div>
		            <div class="sub-cell bg-light padding-spacing-lr">
		                <div class="flex-cell">累计收益：<span>24,729.73</span>元</div>
		            </div>
		            <div class="bg-assets">
		                <table class="table table-flex">
		                    <tbody>
		                    <tr>
		                        <td>
		                            <div class="assets-number">200.00</div>
		                            <div>今日收款(元)</div>
		                        </td>
		                        <td>
		                            <div class="assets-number">4,000.36</div>
		                            <div>今日付款(元)</div>
		                        </td>
		                    </tr>
		                    <tr>
		                        <td>
		                            <div class="assets-number">4.445</div>
		                            <div>待收(元)</div>
		                        </td>
		                        <td>
		                            <div class="assets-number">1.6891</div>
		                            <div>已付待收(元)</div>
		                        </td>
		                    </tr>
		                    </tbody>
		                </table>
		            </div>
	            </div>
	            <div class="weui_cells weui_cells_access margin-spacing0">
	                    <a class="weui_cell" href="javascript:;">
	                        <div class="weui_cell_bd weui_cell_primary">
	                            <p>最近交易</p>
	                        </div>
	                        <div class="weui_cell_ft"><i class="icon-alert"></i> 历史明细</div>
	                    </a>
	            </div>
	            <div class="weui_cells sub-form trade-history">
                    <a class="weui_cell" href="javascript:;">
                        <div class="trade-type">
                            <span class="type-blue">收款</span>
                        </div>
                        <div class="weui_cell_primary">
                            <div class="fund-name fontsize-16">建行[尾号1501]</div>
                            <div>2016-12-26 13:45:59</div>
                        </div>
                        <div class="trade-value">
                            <div class="fund-name">2,000.00元</div>
                            <div class="fontsize-16 green">成功</div>
                        </div>
                    </a>
                    <a class="weui_cell" href="javascript:;">
                        <div class="trade-type">
                            <span class="type-orange">付款</span>
                        </div>
                        <div class="weui_cell_primary">
                            <div class="fund-name fontsize-16">建行[尾号1501]</div>
                            <div>2016-12-26 13:45:59</div>
                        </div>
                        <div class="trade-value">
                            <div class="fund-name">2,000.00元</div>
                            <div class="fontsize-16 red">失败</div>
                        </div>
                    </a>
                </div>
	        
    	</div>
    </div>
	<!--首页更多-->
	<div class="tabbar-panel" style="display: none;">
		<div class="weui_tab_bd box-more">
			<div class="bg-more">
				<div class="user"><span>姓名</span><i class="circle"></i><span>昵称</span></div>
				<div class="user-number">基金账号</div>
			</div>
			<div class="weui_cells sub-form margin-spacing0">
				<a class="weui_cell" href="javascript:;">
					<div class="weui_cell_hd">
						<img src="${base}/static/skin/${res.skin}/images/icon_user.png" alt="联系人" style="width:20px;margin-right:5px;display:block"/>
					</div>
					<div class="weui_cell_bd weui_cell_primary">
						<p>常用联系人</p>
					</div>
					<div class="weui_cell_ft"></div>
				</a>
				<a class="weui_cell" href="javascript:;">
					<div class="weui_cell_hd">
						<img src="${base}/static/skin/${res.skin}/images/icon_msg.png" alt="消息" style="width:20px;margin-right:5px;display:block"/>
					</div>
					<div class="weui_cell_bd weui_cell_primary">
						<p>消息</p>
					</div>
					<div class="weui_cell_ft"></div>
				</a>
			</div>
			<div class="weui_cells sub-form">
				<a class="weui_cell" href="javascript:;">
					<div class="weui_cell_hd">
						<img src="${base}/static/skin/${res.skin}/images/icon_bankcard.png" alt="银行卡" style="width:20px;margin-right:5px;display:block"/>
					</div>
					<div class="weui_cell_bd weui_cell_primary">
						<p>我的银行卡</p>
					</div>
					<div class="weui_cell_ft"></div>
				</a>
				<a class="weui_cell" href="javascript:;">
					<div class="weui_cell_hd">
						<img src="${base}/static/skin/${res.skin}/images/icon_pwd.png" alt="密码" style="width:20px;margin-right:5px;display:block"/>
					</div>
					<div class="weui_cell_bd weui_cell_primary">
						<p>我的密码</p>
					</div>
					<div class="weui_cell_ft"></div>
				</a>
			</div>
			<div class="weui_cells sub-form">
				<a class="weui_cell" href="javascript:;">
					<div class="weui_cell_hd">
						<img src="${base}/static/skin/${res.skin}/images/icon_redpackets.png" alt="红包" style="width:20px;margin-right:5px;display:block"/>
					</div>
					<div class="weui_cell_bd weui_cell_primary">
						<p>我的红包</p>
					</div>
					<div class="weui_cell_ft"></div>
				</a>
				<a class="weui_cell" href="javascript:;">
					<div class="weui_cell_hd">
						<img src="${base}/static/skin/${res.skin}/images/icon_center.png" alt="活动" style="width:20px;margin-right:5px;display:block"/>
					</div>
					<div class="weui_cell_bd weui_cell_primary">
						<p>活动中心</p>
					</div>
					<div class="weui_cell_ft"></div>
				</a>
			</div>
			<div class="weui_cells sub-form">
				<a class="weui_cell" href="javascript:;">
					<div class="weui_cell_hd">
						<img src="${base}/static/skin/${res.skin}/images/icon_risktest.png" alt="风险测评" style="width:20px;margin-right:5px;display:block"/>
					</div>
					<div class="weui_cell_bd weui_cell_primary">
						<p>风险测评</p>
					</div>
					<div class="weui_cell_ft"></div>
				</a>
				<a class="weui_cell" href="javascript:;">
					<div class="weui_cell_hd">
						<img src="${base}/static/skin/${res.skin}/images/icon_about.png" alt="关于" style="width:20px;margin-right:5px;display:block"/>
					</div>
					<div class="weui_cell_bd weui_cell_primary">
						<p>关于我们</p>
					</div>
					<div class="weui_cell_ft"></div>
				</a>
				<a class="weui_cell" href="javascript:;">
					<div class="weui_cell_hd">
						<img src="${base}/static/skin/${res.skin}/images/icon_questions.png" alt="问题" style="width:20px;margin-right:5px;display:block"/>
					</div>
					<div class="weui_cell_bd weui_cell_primary">
						<p>常见问题</p>
					</div>
					<div class="weui_cell_ft"></div>
				</a>
			</div>
		</div>
	</div>
    <div class="weui_tabbar">
        <a href="javascript:;" class="weui_tabbar_item active">
            <div class="weui_tabbar_icon icon-jsy"></div>
            <p class="weui_tabbar_label">结算易</p>
        </a>
        <a href="javascript:;" class="weui_tabbar_item">
            <div class="weui_tabbar_icon icon-sacrifice"></div>
            <p class="weui_tabbar_label">收付款</p>
        </a>
        <a href="javascript:;" class="weui_tabbar_item">
            <div class="weui_tabbar_icon icon-bill"></div>
            <p class="weui_tabbar_label">账单</p>
        </a>
        <a href="javascript:;" class="weui_tabbar_item">
            <div class="weui_tabbar_icon icon-more"></div>
            <p class="weui_tabbar_label">更多</p>
        </a>
    </div>
</div>

</#macro>
<#include "../common/main.ftl">