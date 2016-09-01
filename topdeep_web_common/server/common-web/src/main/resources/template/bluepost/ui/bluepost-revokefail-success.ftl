<#macro htmlbody>
<!-- /.row -->
<div class="row">
    <div class="location">
        您所在的位置：基金交易><span>交易撤单</span>
    </div>
<!--step2-->
<div class="second-step">
        <div class="sub-step">
            <ul>
                <li>
                    <img src="${base}/static/skin/${res.skin}/images/fund_step2.png" alt="第二步">
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
            <div class="step-over">
                <dl>
                    <dt>
                        <img src="${base}/static/skin/${res.skin}/images/icon_error.png" alt="评测结果">
                    </dt>
                    <dd>
                        <ul class="revoke-fail">
                            <li>
                                您的交易撤单失败！
                            </li>
                            <li>
                                <span class="fail-reason">失败原因：</span>
                            </li>
                            <li>
                                <a class="fail-reason">点击这里，查看撤单详细信息。</a>
                            </li>
                        </ul>
                    </dd>
                </dl>
            </div>
        </div>
        <div class="panel-body">
            <div class="sub-next-step">
                <a href="${base}/ui/bluepost.action?type=buy1" class="ibtn ibtn-yellow yellow-cover">我要买基金</a>
                <a href="${base}/ui/bluepost.action?type=revoke1" class="ibtn ibtn-blue blue-cover btn-seperate-left">再试一次</a>
            </div>
        </div>
    </div> <!--panel-->
</div>
</div> <!--row-->
</#macro>
<#include "../common/main.ftl">