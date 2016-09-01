<#macro htmlbody>
<!-- /.row -->
<div class="row">
    <div class="location">
        您所在的位置：基金交易><span>基金赎回</span>
    </div>
<!--step3-->
<div class="second-step">
        <div class="sub-step">
            <ul>
                <li>
                    <img src="${base}/static/skin/${res.skin}/images/fund_step2.png" alt="第二步">
                </li>
                <li>
                    <span class="step1">输入赎回金额</span>
                    <span class="step2">输入交易密码</span>
                    <span class="step3">赎回结果信息</span>
                </li>
            </ul>
        </div>
    <!--基金赎回-->
    <div class="panel panel-default sub-content radiusClear">
        <div class="panel-body">
            <div class="step-over">
                <dl>
                    <dt>
                        <img src="${base}/static/skin/${res.skin}/images/icon_error.png" alt="fail">
                    </dt>
                    <dd>
                        <ul class="redeem-fail">
                            <li>
                                您申请赎回的<em>10000</em>元的<span>中邮增力债券</span>受理失败！
                            </li>
                            <li>
                                <span class="fail-reason">失败原因：</span><br>
                            </li>
                            <li>
                                <span class="fail-reason">XXXXXXXXXXXXX</span>
                            </li>
                        </ul>
                    </dd>
                </dl>
            </div>
        </div>
        <div class="panel-body">
            <div class="sub-next-step">
                <a href="${base}/ui/bluepost.action?type=redeem1" class="ibtn ibtn-yellow yellow-cover">换个基金</a>
                <a href="${base}/ui/bluepost.action?type=redeem1" class="ibtn ibtn-blue blue-cover btn-seperate-left">再试一次</a>
            </div>
        </div>
    </div> <!--panel-->
</div>
</div> <!--row-->
</#macro>
<#include "../common/main.ftl">