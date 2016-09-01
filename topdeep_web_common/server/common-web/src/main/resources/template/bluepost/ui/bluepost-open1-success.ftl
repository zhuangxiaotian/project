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
                        <img src="${base}/static/skin/${res.skin}/images/fund_open1.png" alt="第一步">
                    </li>
                    <li>
                        <span class="step1 step-on">身份验证</span>
                        <span class="step2">设置密码</span>
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
                        <label  class="col-xs-3 control-label">选择银行：</label>
                        <div class="col-xs-6">
                            <select class="form-control">
                                <option value="0">中国银行</option>
                                <option value="1">工商银行</option>
                                <option value="2">交通银行</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-xs-3 control-label">输入卡号：</label>
                        <div class="col-xs-6">
                            <input type="text" class="form-control"  placeholder="请输入银行卡号">
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-xs-3 control-label">真实姓名：</label>
                        <div class="col-xs-6">
                            <input type="text" class="form-control"  placeholder="请输入真实姓名">
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-xs-3 control-label">证件类型：</label>
                        <div class="col-xs-6">
                            <select class="form-control">
                                <option value="0">身份证</option>
                                <option value="1">驾驶证</option>
                                <option value="2">各种证</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-xs-3 control-label">证件号码：</label>
                        <div class="col-xs-6">
                            <input type="text" class="form-control"  placeholder="请输入证件号码">
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-xs-3 control-label">证件有效期：</label>
                        <div class="col-xs-6">
                            <input type="text" class="form-control"  placeholder="请输入真实姓名">
                        </div>
                        <div class="col-xs-3">
                            <div class="date-effect">
                                <input class="post-checkbox"  type="checkbox"/><span>长期有效</span>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-xs-3 control-label">预留号码：</label>
                        <div class="col-xs-6">
                            <input type="text" class="form-control"  placeholder="请输入电话号码">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-9 col-xs-offset-1 open-tip">
                            <input class="post-checkbox"  type="checkbox"/>我已阅读并同意
                            <a class="" href="javascript:void(0)">
                                《中邮开放式基金电子交易协议》
                            </a>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-9 col-xs-offset-1 open-tip">
                            填写所有信息与银行预留信息一致。
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-4 col-xs-offset-1" >
                            <a href="javascript:void(0)" class="btn ibtn-red btn-block red-cover">直接登录</a>
                        </div>
                        <div class="col-xs-4" >
                            <a href="${base}/ui/bluepost.action?type=open2" class="btn ibtn-yellow btn-block yellow-cover">下一步</a>
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