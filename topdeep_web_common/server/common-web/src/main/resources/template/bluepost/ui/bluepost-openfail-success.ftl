<#macro htmlbody>
<!-- /.row -->
<div class="row">
<!--step3-->
<div class="second-step">
    <div class="panel panel-default sub-content radiusClear">
        <div class="panel-body">
            <div class="col-xs-12">
                <div class="open-step">
                    <ul>
                        <li>
                            <img src="${base}/static/skin/${res.skin}/images/fund_open2.png" alt="第二步">
                        </li>
                        <li>
                            <span class="step1 step-on">身份验证</span>
                            <span class="step2 step-on">设置密码</span>
                            <span class="step3">开户结果</span>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="panel panel-default sub-content radiusClear">
        <div class="panel-body">
            <div class="revoke-fail">
                <dl>
                    <dt>
                        <img src="${base}/static/skin/${res.skin}/images/icon_error.png" alt="失败">
                    </dt>
                    <dd>
                        <ul>
                            <li>
                                很遗憾，您的开户请求失败！
                            </li>
                            <li>
                                <span class="revoke-fail">失败原因：</span>
                            </li>
                            <li>
                                XXXXXXXXX
                            </li>
                        </ul>
                    </dd>
                </dl>
            </div>
        </div>
        <div class="panel-body">
            <div class="sub-next-step">
                <a href="javascript:void (0)" class="ibtn ibtn-red red-cover">确定</a>
                <a href="${base}/ui/bluepost.action?type=open1" class="ibtn ibtn-yellow yellow-cover btn-seperate-left">再试一次</a>
            </div>
        </div>
    </div> <!--panel-->
</div>
</div> <!--row-->
</#macro>
<#include "../common/main.ftl">