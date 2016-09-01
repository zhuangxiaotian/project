<#macro htmlbody>
<!-- /.row -->
<div class="row">
    <div class="location">
        您所在的位置：基金交易><span>交易撤单</span>
    </div>
<!--step3-->
<div class="third-step">
        <div class="sub-step">
            <ul>
                <li>
                    <img src="${base}/static/skin/${res.skin}/images/fund_step3.png" alt="第三步">
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
                        <img src="${base}/static/skin/${res.skin}/images/icon_success.png" alt="评测结果">
                    </dt>
                    <dd>
                        <ul>
                            <li>
                                您成功撤单！
                            </li>
                            <li>
                                <a href="javascript:void(0)" class="revoke-success">点击这里，查看撤单详细信息。</a>
                            </li>
                        </ul>
                    </dd>
                    <dd>

                    </dd>
                </dl>
            </div>
        </div>
        <div class="panel-body">
            <div class="sub-next-step">
                <a href="javascript:void (0)" class="ibtn ibtn-yellow yellow-cover">确定</a>
                <a href="${base}/ui/bluepost.action?type=buy1" class="ibtn ibtn-blue blue-cover btn-seperate-left">我要买基金</a>
            </div>
        </div>
    </div> <!--panel-->
</div>
</div> <!--row-->
</#macro>
<#include "../common/main.ftl">