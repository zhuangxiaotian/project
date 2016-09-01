<#macro htmlbody>
<!-- /.row -->
<div class="row">
<div class="col-xs-12">
    <div class="location">
        您所在的位置：基金交易><span>交易撤单</span>
    </div>
</div>
<!--step1-->
<div class="first-step">
    <div class="sub-step">
            <ul>
                <li>
                    <img src="${base}/static/skin/${res.skin}/images/fund_step1.png" alt="第一步">
                </li>
                <li>
                    <span class="step1">查看委托详情</span>
                    <span class="step2">输入交易密码</span>
                    <span class="step3">撤单结果信息</span>
                </li>
            </ul>
        </div>
    <!--交易撤单-->
    <div class="panel panel-default sub-content radiusClear">
        <div class="panel-body">
            <dl class="sub-step-content">
                <dt>
                    <span>基金代码：</span>
                    <em>000363</em>
                </dt>
                <dd>
                    <span>基金名称：</span>
                    <em>中邮增力基金</em>
                </dd>
                <dd>
                    <span>交易类型：</span>
                    <em>申购</em>
                </dd>
                <dd>
                    <span>申请时间：</span>
                    <em>2016-11-11 11:11</em>
                </dd>
                <dd>
                    <span>业务时间：</span>
                    <em>2016-11-11 11:11</em>
                </dd>
                <dd>
                    <span>申请金额：</span>
                    <em>1000</em>
                </dd>
                <dd>
                    <span>申请份额：</span>
                    <em>1000</em>
                </dd>
                <dd>
                    <span>支付状态：</span>
                    <em>已支付</em>
                </dd>
            </dl>
            <div class="sub-next-step">
                        <a href="${base}/ui/bluepost.action?type=revoke2" class="ibtn ibtn-blue blue-cover">下一步</a>
            </div>
        </div>
    </div> <!--panel-->
</div>
</div> <!--row-->
</#macro>
<#include "../common/main.ftl">