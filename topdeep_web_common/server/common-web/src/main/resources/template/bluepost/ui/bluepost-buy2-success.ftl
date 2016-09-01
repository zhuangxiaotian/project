<#macro htmlbody>
<!-- /.row -->
<div class="row">
<div class="col-xs-12">
    <div class="location">
        您所在的位置：基金交易><span>基金购买</span>
    </div>
</div>
<!--step1-->
<div class="second-step">
        <div class="sub-step">
            <ul>
                <li>
                    <img src="${base}/static/skin/${res.skin}/images/fund_step2.png" alt="第二步">
                </li>
                <li>
                    <span class="step1">输入购买金额</span>
                    <span class="step2">输入交易密码</span>
                    <span class="step3">购买结果信息</span>
                </li>
            </ul>
        </div>
    <!--基金购买-->
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
                    <form class="form-inline">
                        <div class="form-group">
                            <span>交易账户：</span>
                                    <span>
                                        <i class="icon-001-002"></i>
                                        中国银行
                                    </span>
                        </div>
                    </form>
                </dd>
                <dd>
                    <span>交易金额：</span>
                    <em class="fund-cost">100,000,000</em>
                </dd>
                <dd>
                    <form class="form-inline">
                        <div class="form-group">
                            <span>交易密码：</span>
                            <input type="password" textmode="password" class="form-control"  placeholder="请输入交易密码"/>
                            <a href="javascript:;">
                                <img src="${base}/static/skin/${res.skin}/images/keyboard.gif" alt="键盘"/>
                            </a>
                        </div>
                    </form>
                </dd>
            </dl>
            <div class="sub-next-step">
                        <a href="${base}/ui/bluepost.action?type=buy1" class="ibtn ibtn-yellow yellow-cover">返回</a>
                        <a href="${base}/ui/bluepost.action?type=buy3" class="ibtn ibtn-blue blue-cover btn-seperate-left">下一步</a>
            </div>
        </div>
    </div> <!--panel-->
</div>
</div> <!--row-->
</#macro>
<#include "../common/main.ftl">