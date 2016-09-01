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
<!--用户注册-->
<div class="panel panel-default sub-content radiusClear">
    <div class="panel-body">
        <div class="row">
            <div class="col-xs-3"></div>
            <div class="col-xs-6">
                <form class="form-horizontal post-open">
                    <div class="form-group">
                        <label  class="col-xs-3 control-label">输入卡号：</label>
                        <div class="col-xs-6">
                            <input type="text" class="form-control"  placeholder="请输入验证码">
                        </div>
                        <div class="col-xs-3">
                            <a href="javascript:void(0)" class="btn ibtn-red btn-block red-cover">获取验证码</a>
                            <a href="javascript:void(0)" class="btn ibtn-gray btn-block gray-cover">重发</a>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-xs-3 control-label">真实姓名：</label>
                        <div class="col-xs-6">
                            <input type="password" class="form-control"  placeholder="请输入交易密码">
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-xs-3 control-label">真实姓名：</label>
                        <div class="col-xs-6">
                            <input type="password" class="form-control"  placeholder="请确认交易密码">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-4 col-xs-offset-1" >
                            <a href="${base}/ui/bluepost.action?type=open1" class="btn ibtn-red btn-block red-cover">上一步</a>
                        </div>
                        <div class="col-xs-4" >
                            <a href="${base}/ui/bluepost.action?type=open3" class="btn ibtn-yellow btn-block yellow-cover">下一步</a>
                        </div>
                    </div>
                </form>
            </div>
            <div class="col-xs-3"></div>
        </div>
    </div>
</div> <!--panel-->
</div> <!--row-->
</#macro>
<#include "../common/main.ftl">