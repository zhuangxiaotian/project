<#macro htmlhead>
<style>
#box>a{
    display: block;
    text-align: center;
    margin: 10px 0;
}
</style>
</#macro>
<#macro htmlbody>
<div id="box">
	<h2>提示绑定confirm框</h2>
	<a href="${base}/ui/richred.action?type=confirms"  target="_blank">confirm</a>
	<a href="${base}/ui/richred.action?type=addBankcard"  target="_blank">增卡提示</a>
	<h2>协议规则</h2>
	<a href="${base}/ui/richred.action?type=agreement1"  target="_blank">诺安基金定投业务规则</a>
	<a href="${base}/ui/richred.action?type=agreement2"  target="_blank">诺安基金网上直销交易协议</a>

	<h2>基金理财</h2>
	<a href="${base}/ui/richred.action?type=riskTest1"  target="_blank">风险测评1</a>
	<a href="${base}/ui/richred.action?type=riskTest2"  target="_blank">风险测评2</a>
	<a href="${base}/ui/richred.action?type=riskTest3"  target="_blank">风险测评3</a>
	<a href="${base}/ui/richred.action?type=fundResources"  target="_blank">选择资金来源</a>
	<a href="${base}/ui/richred.action?type=fundPurchase1"  target="_blank">基金申购</a>
	<a href="${base}/ui/richred.action?type=fundPurchase2"  target="_blank">基金申购</a>
	<a href="${base}/ui/richred.action?type=fundPurchase3"  target="_blank">基金申购</a>
	<a href="${base}/ui/richred.action?type=fundRedeem1"  target="_blank">基金赎回</a>
	<a href="${base}/ui/richred.action?type=fundRedeem2"  target="_blank">基金赎回</a>
	<a href="${base}/ui/richred.action?type=fundRedeemTo"  target="_blank">基金赎回到</a>
	<a href="${base}/ui/richred.action?type=fundDetail1"  target="_blank">基金详情(非货币)</a>
	<a href="${base}/ui/richred.action?type=fundDetail2"  target="_blank">基金详情(货币)</a>
	<!--  
	<a href="${base}/ui/richred.action?type=fundDetailRate"  target="_blank">费率结构</a>
	<a href="${base}/ui/richred.action?type=fundDetailDividend"  target="_blank">历史分红</a>
	<a href="${base}/ui/richred.action?type=fundDetailViewpoint"  target="_blank">管理人观点</a>
	-->
	<a href="${base}/ui/richred.action?type=fundDetailNotice1"  target="_blank">基金公告</a>
	<a href="${base}/ui/richred.action?type=fundDetailNotice2"  target="_blank">公告正文</a>
	<a href="${base}/ui/richred.action?type=cashBao"  target="_blank">现金宝</a>
	<a href="${base}/ui/richred.action?type=cashBaoCash1"  target="_blank">现金宝取现</a>
	<a href="${base}/ui/richred.action?type=cashBaoCash2"  target="_blank">现金宝取现</a>
	<a href="${base}/ui/richred.action?type=cashBaoCash3"  target="_blank">现金宝取现</a>
	<a href="${base}/ui/richred.action?type=cashBaoRecharge1"  target="_blank">现金宝充值</a>
	<a href="${base}/ui/richred.action?type=cashBaoRecharge2"  target="_blank">现金宝充值</a>
	<a href="${base}/ui/richred.action?type=getRedpackets2"  target="_blank">评价领红包</a>
	<a href="${base}/ui/richred.action?type=fundDetailContrast"  target="_blank">添加对比基金</a>
	<a href="${base}/ui/richred.action?type=fundList"  target="_blank">选择转入基金</a>
	<a href="${base}/ui/richred.action?type=fundManage"  target="_blank">基金理财</a>
	<a href="${base}/ui/richred.action?type=fundTransfer1"  target="_blank">基金转换</a>
	<br/>
	<a href="${base}/ui/richred.action?type=index"  target="_blank">主页</a>
	<a href="${base}/ui/richred.action?type=productDetail"  target="_blank">其他基金产品详情</a>
	
	<h2>登录注册部分</h2>
	<a href="${base}/ui/richred.action?type=login"  target="_blank">登录</a>
	<a href="${base}/ui/richred.action?type=bindResetPwd1"  target="_blank">找回密码</a>
	<a href="${base}/ui/richred.action?type=oneStepResetPwd2"  target="_blank">找回密码1</a>
	<a href="${base}/ui/richred.action?type=oneStepResetPwd3"  target="_blank">重置密码</a>
	<a href="${base}/ui/richred.action?type=resetPwdSuccess"  target="_blank">密码重置结果</a>
	<a href="${base}/ui/richred.action?type=bindResetPwd2"  target="_blank">银行卡验证身份</a>
	<a href="${base}/ui/richred.action?type=resetPwdFail"  target="_blank">身份验证失败</a>
	<a href="${base}/ui/richred.action?type=setPwd"  target="_blank">设置直销密码</a>
	<a href="${base}/ui/richred.action?type=updateAccount1"  target="_blank">升级直销账户</a>
	<a href="${base}/ui/richred.action?type=updateAccount2"  target="_blank">升级直销账户成功</a>
	<a href="${base}/ui/richred.action?type=bankVerify3"  target="_blank">银行卡验证身份1</a>
	<a href="${base}/ui/richred.action?type=simpleRegister1"  target="_blank">简单注册</a>
	<a href="${base}/ui/richred.action?type=simpleRegister2"  target="_blank">简单注册</a>
		<a href="${base}/ui/richred.action?type=simpleRegister3"  target="_blank">简单注册</a>
	<a href="${base}/ui/richred.action?type=bindUser1"  target="_blank">绑定基金账户</a>
	<a href="${base}/ui/richred.action?type=bindUser2"  target="_blank">绑定基金账户成功</a>
	<a href="${base}/ui/richred.action?type=realName1"  target="_blank">实名认证</a>
	<a href="${base}/ui/richred.action?type=realName2"  target="_blank">实名认证成功</a>
	<a href="${base}/ui/richred.action?type=realNameFail"  target="_blank">实名认证失败</a>
	<a href="${base}/ui/richred.action?type=realNameReset"  target="_blank">实名认证</a>
	
	
	<h2>我的部分</h2>
	<a href="${base}/ui/richred.action?type=myBill"  target="_blank">电子对账单</a>
	<a href="${base}/ui/richred.action?type=myInvestment1"  target="_blank">定投管理</a>
	<a href="${base}/ui/richred.action?type=myInvestment2"  target="_blank">定投添加</a>
	<a href="${base}/ui/richred.action?type=myInvestment3"  target="_blank">定投明细有效</a>
	<a href="${base}/ui/richred.action?type=myInvestment4"  target="_blank">定投明细修改</a>
	<a href="${base}/ui/richred.action?type=myInvestment5"  target="_blank">定投明细暂停</a>
	<a href="${base}/ui/richred.action?type=fundRedeemConfirm"  target="_blank">定投confirm</a>
	<a href="${base}/ui/richred.action?type=myAbout"  target="_blank">关于诺安基金</a>
	<a href="${base}/ui/richred.action?type=myAboutWechat"  target="_blank">关注诺安微信</a>
	<a href="${base}/ui/richred.action?type=myFriends"  target="_blank">邀请好友</a>
	<a href="${base}/ui/richred.action?type=myService1"  target="_blank">客服与帮助</a>
	<a href="${base}/ui/richred.action?type=myService2"  target="_blank">问题列表</a>
	<a href="${base}/ui/richred.action?type=myService3"  target="_blank">问题解答</a>
	<a href="${base}/ui/richred.action?type=myMsg1"  target="_blank">我的消息</a>
	<a href="${base}/ui/richred.action?type=myMsg2"  target="_blank">我的消息编辑</a>
	<a href="${base}/ui/richred.action?type=myMsg3"  target="_blank">消息详情</a>
	<a href="${base}/ui/richred.action?type=myBankcard1"  target="_blank">我的银行卡</a>
	<a href="${base}/ui/richred.action?type=myBankcard2"  target="_blank">解绑银行卡</a>
	<a href="${base}/ui/richred.action?type=myBankcard3"  target="_blank">新增银行卡</a>
	<a href="${base}/ui/richred.action?type=my"  target="_blank">我的未登录</a>
	<a href="${base}/ui/richred.action?type=myAlready"  target="_blank">我的已登录</a>
	<a href="${base}/ui/richred.action?type=bankVerify1"  target="_blank">银行卡验证身份</a>
	<a href="${base}/ui/richred.action?type=bankVerify2"  target="_blank">不能接收短信</a>
	<a href="${base}/ui/richred.action?type=bindPhone1"  target="_blank">绑定新手机号</a>
	<a href="${base}/ui/richred.action?type=bindPhone2"  target="_blank">绑定新手机号</a>
	<a href="${base}/ui/richred.action?type=bindPhone3"  target="_blank">绑定手机</a>
	<a href="${base}/ui/richred.action?type=bindPhoneSuccess1"  target="_blank">绑定成功</a>
	<a href="${base}/ui/richred.action?type=bindPhoneSuccess2"  target="_blank">绑定成功</a>
	<a href="${base}/ui/richred.action?type=changeBindPhone"  target="_blank">修改绑定的手机号</a>
	<a href="${base}/ui/richred.action?type=changeBindPhone2"  target="_blank">修改绑定的手机号</a>
	<a href="${base}/ui/richred.action?type=changePwd1"  target="_blank">修改密码</a>
	<a href="${base}/ui/richred.action?type=changePwd2"  target="_blank">修改密码成功</a>
	<a href="${base}/ui/richred.action?type=myInvestmentSelect"  target="_blank">定投资金选择</a>
	<a href="${base}/ui/richred.action?type=myBankcard4"  target="_blank">选择开户银行</a>
	<a href="${base}/ui/richred.action?type=mySet"  target="_blank">我的设置</a>
	<a href="${base}/ui/richred.action?type=setTime"  target="_blank">选择扣款日期</a>
	
	<h2>我的资产</h2>
	<a href="${base}/ui/richred.action?type=tradeQuery"  target="_blank">交易查询</a>
	<a href="${base}/ui/richred.action?type=tradeRoad"  target="_blank">在途购买</a>
	<a href="${base}/ui/richred.action?type=tradeDetail1"  target="_blank">交易明细（未确认）</a>
	<a href="${base}/ui/richred.action?type=tradeDetail2"  target="_blank">交易明细（确认）</a>
	<a href="${base}/ui/richred.action?type=tradeDetail3"  target="_blank">交易明细（确认赎回）</a>
	<a href="${base}/ui/richred.action?type=tradeDetail4"  target="_blank">交易明细（确认转换）</a>
	<a href="${base}/ui/richred.action?type=trendAssets"  target="_blank">总资产走势</a>
	<a href="${base}/ui/richred.action?type=breakevenDetail"  target="_blank">盈亏明细</a>
	<a href="${base}/ui/richred.action?type=breakevenDetail1"  target="_blank">盈亏明细2</a>
	<a href="${base}/ui/richred.action?type=breakevenQuery"  target="_blank">盈亏查询</a>
	<a href="${base}/ui/richred.action?type=dividend"  target="_blank">分红方式修改</a>
	<a href="${base}/ui/richred.action?type=productDetailCash"  target="_blank">现金宝产品详情</a>
	<a href="${base}/ui/richred.action?type=myAssets"  target="_blank">我的资产</a>
	<a href="${base}/ui/richred.action?type=myAssetsNone"  target="_blank">我的资产(未持有基金)</a>
</div>
</#macro>
<#include "../common/main.ftl">