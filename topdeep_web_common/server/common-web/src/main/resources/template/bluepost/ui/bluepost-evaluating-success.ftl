<#macro htmlbody>
<!-- /.row -->
<div class="row">
    <div class="location">
        您所在的位置：我的账户><span> 风险评测</span>
    </div>
<!--风险评测-->
<div class="panel panel-default sub-content clearfix">
    <div class="panel-body">
        <div class="col-xs-12">
            <div class="sub-title">
                <span>更多精彩尽在基金超市</span>
            </div>
        </div>
        <div class="col-xs-12">
            <div class="risk-test">
                根据中国证监会发布的《证券投资基金销售适用性指导意见》的相关要求，请您进行投资人风险承受能力测评，以下为《基金投资人风险测评问卷》，
                <span>请您提供准确、完整的信息，谢谢！</span>
            </div>
        </div>
    </div>
</div>
<div class="panel panel-default sub-content radiusClear">
    <div class="panel-body">
        <div class="col-xs-12">
            <dl class="risk-title">
                <dt>风险调查问卷</dt>
                <dd>您当前的风险承受等级为:<span>保守型</span></dd>
            </dl>
        </div>
        <div class="col-xs-12">
            <div class="row">
                <div class="col-xs-6">
                    <div class="radio">
                        <label>
                            <i class="sub-radio sub-radio-s"></i>我是保守型
                        </label>
                    </div>
                </div>
                <div class="col-xs-6">
                    <div class="radio">
                        <label>
                            <i class="sub-radio"></i>我是激进型
                        </label>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="panel-body sub-body">
        <dl>
            <dt>1、您觉得下面哪个选项可以最好的描述您的投资目标？</dt>
            <dd>
                <div class="radio">
                    <label>
                        <i class="sub-radio"></i>激进成长
                    </label>
                </div>
            </dd>
            <dd>
                <div class="radio">
                    <label>
                        <i class="sub-radio"></i>显著增长
                    </label>
                </div>
            </dd>
            <dd>
                <div class="radio">
                    <label>
                        <i class="sub-radio"></i>稳健增值
                    </label>
                </div>
            </dd>
            <dd>
                <div class="radio">
                    <label>
                        <i class="sub-radio"></i>谨慎增值
                    </label>
                </div>
            </dd>
            <!--<dd><i></i>避免亏损</dd>-->
        </dl>
    </div>
    <div class="panel-body">
        <dl>
            <dt>2、您觉得下面哪个选项可以最好的描述您的投资目标？</dt>
            <dd>
                <div class="radio">
                    <label>
                        <i class="sub-radio"></i>激进成长
                    </label>
                </div>
            </dd>
            <dd>
                <div class="radio">
                    <label>
                        <i class="sub-radio"></i>显著增长
                    </label>
                </div>
            </dd>
            <dd>
                <div class="radio">
                    <label>
                        <i class="sub-radio"></i>稳健增值
                    </label>
                </div>
            </dd>
            <dd>
                <div class="radio">
                    <label>
                        <i class="sub-radio"></i>谨慎增值
                    </label>
                </div>
            </dd>
            <!--<dd><i></i>避免亏损</dd>-->
        </dl>
    </div>
    <div class="panel-body">
        <div class="risk-over">
            <dl>
                <dt>
                    <img src="${base}/static/skin/${res.skin}/images/icon_success.png" alt="评测结果">
                </dt>
                <dd>
                    您的风险等级为：<span>激进型</span>
                </dd>
                <dd>
                    <a href="javascript:void(0)">点击这里，重新评测</a>
                </dd>
            </dl>
        </div>
        <div class="fund-buy">
            <a href="javascript:void(0)" class="button button-3d button-orange button-rounded">我要买基金</a>
        </div>
    </div>
    <!--评测结果-->
    <div class="panel-body">
        <div></div>
    </div>
</div> <!--panel-->
</div> <!--row-->
</#macro>
<#include "../common/main.ftl">