<#macro htmlbody>
<!-- /.row -->
<div class="row">
<!--用户开户step-->
<div class="fund-select1 ">
    <ul>
        <li class=" select-l">
            <p class="select-title">我已有中邮账户</p>
            <p>如果已经有账户请<a href="javascript:void(0)">直接登录</a>，无需重复填写注册信息</p>
        </li>
        <li class="select-r active">
            <p class="select-title">我是新用户</p>
            <p>如果是新用户请填写下列表格免费注册</p>
        </li>
    </ul>
</div>

<div class="panel panel-default sub-content radiusClear">
    <div class="panel-body">
        <div class="col-xs-12">
            <div class="open-step">
                <ul>
                    <li>
                        <img src="${base}/static/skin/${res.skin}/images/fund_open3.png" alt="第三步">
                    </li>
                    <li>
                        <span class="step1 step-on">身份验证</span>
                        <span class="step2 step-on">设置密码</span>
                        <span class="step3 step-on">开户结果</span>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
<!--step3-->
<div class="panel panel-default sub-content radiusClear">
    <div class="panel-body">
        <div class="sub-success">
            <dl>
                <dt>
                    <img src="${base}/static/skin/${res.skin}/images/icon_success.png" alt="成功">
                </dt>
                <dd>
                    恭喜您，您已成功开户！
                </dd>
                <dd>
                    您可以使用开户证件+交易密码登陆，开启财富之旅！
                </dd>
            </dl>
        </div>
    </div>
    <div class="panel-body">
        <div class="sub-next-step">
            <a href="${base}/ui/bluepost.action?type=buy1" class="ibtn ibtn-red red-cover">我要买基金</a>
        </div>
    </div>
</div> <!--panel-->
</div> <!--row-->
</#macro>
<#include "../common/main.ftl">