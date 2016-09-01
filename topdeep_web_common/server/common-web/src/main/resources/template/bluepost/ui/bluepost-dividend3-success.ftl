<#macro htmlbody>
<!-- /.row -->
<div class="row">
    <div class="location">
        您所在的位置：基金交易 > <span>分红设置</span>
    </div>
<!--step3-->
<div class="third-step">
        <div class="sub-step">
            <ul>
                <li>
                    <img src="${base}/static/skin/${res.skin}/images/fund_step3.png" alt="第三步"/>
                </li>
                <li>
                    <span class="step1">输入赎回金额</span>
                    <span class="step2">输入交易密码</span>
                    <span class="step3">修改结果</span>
                </li>
            </ul>
        </div>
    <div class="panel panel-default sub-content radiusClear">
        <div class="panel-body">
            <div class="step-over">
                <dl>
                    <dt>
                        <img src="${base}/static/skin/${res.skin}/images/icon_success.png" alt="评测结果"/>
                    </dt>
                    <dd>
                        <ul>
                            <li>
                                您申请的分红方式已提交，结果如下
                            </li>
                            <li class="dividend">
                                <span>00545</span><span>现金分红→红利再投</span><span class="dividend-success">成功</span>
                            </li>
                            <li class="dividend">
                                <span>00545</span><span>现金分红→红利再投</span><span class="dividend-fail">失败</span><span>，失败原因：xxxxxxx</span>
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
                <a href="javascript:void (0)" class="ibtn ibtn-yellow yellow-cover">我要买基金</a>
                <a href="javascript:void (0)" class="ibtn ibtn-blue blue-cover btn-seperate-left">确定</a>
            </div>
        </div>
    </div> <!--panel-->
</div>
</div> <!--row-->
</#macro>
<#include "../common/main.ftl">