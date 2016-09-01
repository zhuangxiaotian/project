<#macro htmlbody>
<!-- /.row -->
<div class="row">
    <div class="location">
        您所在的位置：基金定投><span>我的定投</span>
    </div>
<!--风险评测-->
<div class="panel panel-default sub-content radiusClear">
    <div class="panel-body">
        <div class="sub-title">
            <span>我的定投</span>
            <button type="button" class="ibtn ibtn-blue blue-cover">
                <i class="icon-add"></i>添加定投计划
            </button>
        </div>
    </div>
    <div class="panel-body sub-body">
        <div class="fund-spot">
            <dl>
                <dt>
                    <img src="${base}/static/skin/${res.skin}/images/fund_sure.png" alt="基金定投">
                </dt>
                <dd>
                    什么都没有，点击添加定投计划
                </dd>
            </dl>
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