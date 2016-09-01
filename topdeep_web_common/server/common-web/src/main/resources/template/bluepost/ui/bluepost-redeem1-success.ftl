<#macro htmlbody>
<!-- /.row -->
<div class="location">
        您所在的位置：基金交易><span>基金赎回</span>
    </div>
<!--step1-->
<div class="first-step">
    <div class="sub-step">
            <ul>
                <li>
                    <img src="${base}/static/skin/${res.skin}/images/fund_step1.png" alt="第一步">
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
                            <span>交易账号：</span>
                            <div class="form-control post-select">
                                <em class="bank-select">
                                    <i class="icon-001-002"></i>中国银行
                                </em>
                                            <span>
                                                <i></i>
                                            </span>
                                <input type="hidden" class="form-control" value="身份证" />
                                <ul class="bank-list" style="display: none">
                                    <li>
                                        <a href="javascript:;">
                                            <i class="icon-001-002"></i>中国银行
                                        </a>
                                    </li>
                                    <li>
                                        <a href="javascript:;" >
                                            <i class="icon-002-99"></i>南京银行
                                        </a>
                                    </li>
                                    <li>
                                        <a href="javascript:;">
                                            <i class="icon-001-001"></i>华夏银行
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </form>
                </dd>
                <dd>
                    <span>可用份额：</span>
                    <em>1000</em>
                </dd>
                <dd>
                    <form class="form-inline">
                        <div class="form-group">
                            <span>赎回份额：</span>
                            <input type="text" class="form-control"  placeholder="请输入赎回份额">
                        </div>
                        <button type="submit" class="ibtn ibtn-red red-cover">全部赎回</button>
                    </form>
                </dd>
                <dd>
                    <form class="form-inline">
                        <div class="form-group">
                            <span>巨额赎回：</span>
                            <div class="form-control post-select">
                                <em class="bank-select">
                                    巨额赎回
                                </em>
                                <span>
                                   <i></i>
                                </span>
                                <ul class="bank-list" style="display: none">
                                    <li>
                                        <a href="javascript:;">
                                            巨额赎回
                                        </a>
                                    </li>
                                    <li>
                                        <a href="javascript:;">
                                            顺延赎回
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </form>
                </dd>
            </dl>
            <div class="sub-next-step">
                <a href="${base}/ui/bluepost.action?type=redeem2" class="ibtn ibtn-blue blue-cover">下一步</a>
            </div>
        </div>
    </div> <!--panel-->
</div>
</div> <!--row-->
</#macro>
<#include "../common/main.ftl">