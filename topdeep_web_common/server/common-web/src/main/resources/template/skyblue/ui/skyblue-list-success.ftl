<#macro htmlhead>
<style>
#box>.weui_cells_title{font-size: 18px;font-weight: 600;color: #000000;}
</style>
</#macro>
<#macro htmlbody>
<div class="container" id="box">
        <div class="weui_cells_title">模板页</div>
        <div class="weui_cells sub-form">
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=template"  target="_blank">
                        <div class="weui_cell_primary"><p>template</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
        </div>
        <div class="weui_cells_title">首页</div>
        <div class="weui_cells sub-form">
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=index"  target="_blank">
                        <div class="weui_cell_primary"><p>首页</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=indexAlready"  target="_blank">
                        <div class="weui_cell_primary"><p>首页(已登录)</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
        </div>
        <div class="weui_cells_title">登录/注册</div>
        <div class="weui_cells sub-form">
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=login"  target="_blank">
                        <div class="weui_cell_primary"><p>登录</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=registerMsg"  target="_blank">
                        <div class="weui_cell_primary"><p>注册-身份信息</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=registerPwd"  target="_blank">
                        <div class="weui_cell_primary"><p>注册-输入密码</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=registerSet"  target="_blank">
                        <div class="weui_cell_primary"><p>注册-设置收付款</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=registerSetLimit"  target="_blank">
                        <div class="weui_cell_primary"><p>注册-设置转让支付额度上限</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
        </div>
        <div class="weui_cells_title">结算易</div>
        <div class="weui_cells sub-form">
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=recharge"  target="_blank">
                        <div class="weui_cell_primary"><p>充值</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=rechargeSuccess"  target="_blank">
                        <div class="weui_cell_primary"><p>充值成功</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=rechargeFail"  target="_blank">
                        <div class="weui_cell_primary"><p>充值失败</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=cash"  target="_blank">
                        <div class="weui_cell_primary"><p>取现</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=cashPwd"  target="_blank">
                        <div class="weui_cell_primary"><p>取现-交易密码</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=cashMoney"  target="_blank">
                        <div class="weui_cell_primary"><p>取现-现金金额</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=cashSuccess"  target="_blank">
                        <div class="weui_cell_primary"><p>取现成功</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=fundCCB"  target="_blank">
                        <div class="weui_cell_primary"><p>建信货币基金</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=fundDetail"  target="_blank">
                        <div class="weui_cell_primary"><p>基金详情</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=fundValue"  target="_blank">
                        <div class="weui_cell_primary"><p>每日收益</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=accountSuccess"  target="_blank">
                        <div class="weui_cell_primary"><p>开户成功</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
        </div>
        <div class="weui_cells_title">收付款</div>
        <div class="weui_cells sub-form">
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=cashier"  target="_blank">
                        <div class="weui_cell_primary"><p>收款</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=cashierNo"  target="_blank">
                        <div class="weui_cell_primary"><p>放弃收款</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=cashierQrcode"  target="_blank">
                        <div class="weui_cell_primary"><p>收款生成二维码</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=pay"  target="_blank">
                        <div class="weui_cell_primary"><p>付款</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=payFei"  target="_blank">
                        <div class="weui_cell_primary"><p>付款(非面对面)</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=paySuccess"  target="_blank">
                        <div class="weui_cell_primary"><p>付款成功</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
        </div>
        <div class="weui_cells_title">账单</div>
        <div class="weui_cells sub-form">
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=tradeDetail"  target="_blank">
                        <div class="weui_cell_primary"><p>交易详情</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=tradeToday"  target="_blank">
                        <div class="weui_cell_primary"><p>今日收付款</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=tradeQuery"  target="_blank">
                        <div class="weui_cell_primary"><p>分类查询</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=tradeHistory"  target="_blank">
                        <div class="weui_cell_primary"><p>历史交易明细</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=tradeWill"  target="_blank">
                        <div class="weui_cell_primary"><p>待收明细</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
        </div>
        <div class="weui_cells_title">更多</div>
        <div class="weui_cells sub-form">
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=myContacts"  target="_blank">
                        <div class="weui_cell_primary"><p>常用联系人</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=myContactsDetail"  target="_blank">
                        <div class="weui_cell_primary"><p>常用联系人-详情</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=myContactsSearch"  target="_blank">
                        <div class="weui_cell_primary"><p>常用联系人-搜索</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=myMsg"  target="_blank">
                        <div class="weui_cell_primary"><p>消息</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=myBank"  target="_blank">
                        <div class="weui_cell_primary"><p>我的银行卡</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=myBankDetail"  target="_blank">
                        <div class="weui_cell_primary"><p>银行卡详情</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=myPwd"  target="_blank">
                        <div class="weui_cell_primary"><p>我的密码</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=myPwdReset"  target="_blank">
                        <div class="weui_cell_primary"><p>修改密码</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=myPwdSuccess"  target="_blank">
                        <div class="weui_cell_primary"><p>修改密码成功</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=myRedpacket"  target="_blank">
                        <div class="weui_cell_primary"><p>我的红包</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=myActivity"  target="_blank">
                        <div class="weui_cell_primary"><p>活动中心</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=myTest"  target="_blank">
                        <div class="weui_cell_primary"><p>风险测评</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=myAbout"  target="_blank">
                        <div class="weui_cell_primary"><p>关于我们</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=myQuestion"  target="_blank">
                        <div class="weui_cell_primary"><p>常见问题</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
                <a class="weui_cell" href="${base}/ui/skyblue.action?type=myQuestionDetail"  target="_blank">
                        <div class="weui_cell_primary"><p>问题详情</p></div>
                        <div class="weui_cell_ft"></div>
                </a>
        </div>
</div>
        </#macro>
<#include "../common/main.ftl">