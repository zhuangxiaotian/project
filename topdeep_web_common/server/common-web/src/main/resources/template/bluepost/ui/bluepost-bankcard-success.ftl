<#macro htmlbody>
<!-- /.row -->
<div class="row">
    <div class="location">
        您所在的位置：<span>我的银行卡</span>
    </div>
    <div class="welcome">
        尊敬的Yzhu 先生，上午/下午/晚上好，欢迎回到中邮！
    </div>
<!--我的银行卡-->
<div class="panel panel-default sub-content radiusClear">
    <div class="panel-body">
        <div class="col-xs-6">
            <div class="bank-box">
                <div class="bank-card">
                    <div class="bankCard">
                        <img src="${base}/static/skin/${res.skin}/images/bank_001_002.png" alt="中国银行">
                        <dl class="bankAdd">
                            <dd>
                                <span><em>123</em><em>4567</em><em>9876</em><em>8647</em></span>
                            </dd>
                        </dl>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-xs-6">
            <div class="bank-box">
                <div class="bank-card">
                    <div class="bankCard">
                        <img src="${base}/static/skin/${res.skin}/images/bank_002_99.png" alt="南京银行">
                        <dl class="bankAdd">
                            <dd>
                                <span><em>123</em><em>4567</em><em>9876</em><em>8647</em></span>
                            </dd>
                        </dl>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-xs-6">
            <div class="bank-box">
                <div class="bank-card">
                    <div class="bankCard">
                        <img src="${base}/static/skin/${res.skin}/images/card_space.png" alt="添加银行卡">
                        <dl class="bankAdd">
                            <dt>
                                <a href="javascript:void(0)">
                                    <img src="${base}/static/skin/${res.skin}/images/card_add.png" alt="添加">
                                    添加一张银行卡
                                </a>
                            </dt>
                            <dd>
                                <a href="javascript:">
                                    （查看限额及开通条件）
                                </a>
                            </dd>
                        </dl>
                    </div>
                </div>
            </div>
        </div>
    </div>


</div>
</div>    <!--row-->
</#macro>
<#include "../common/main.ftl">