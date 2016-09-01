<#macro htmlbody>
<!-- /.row -->
<div class="row">
    <div class="location">
        您所在的位置：业务查询 ><span> 历史成交</span>
    </div>
<!--风险评测-->
<div class="panel panel-default sub-content radiusClear">
    <div class="panel-body">
        <div class="sub-title">
            <span>历史成交</span>
        </div>
    </div>
    <div class="panel-body">
        <div class="col-xs-4"></div>
        <div class="col-xs-6">
            <form class="form-inline">
                <div class="form-group history-date">
                    <span>开始日期：</span>
                    <input type="text" class="form-control"  placeholder=" "/>
                </div>
                <div class="form-group history-date">
                    <span>截止日期：</span>
                    <input type="text" class="form-control"  placeholder=" "/>
                </div>
            </form>
            <div class="history-search">
                <a href="${base}/ui/bluepost.action?type=history2" class="ibtn ibtn-blue ibtn-lg blue-cover">查询</a>
            </div>
        </div>
        <div class="col-xs-2"></div>
    </div>
    <table class="table table-post3">
        <tbody>
        <tr class="table-post-title">
            <td>确认日期</td>
            <td>基金名称</td>
            <td>交易类型</td>
            <td>确认金额</td>
            <td>确认份额</td>
        </tr>
        <tr>
            <td>2016-04-01</td>
            <td>现金驿站</td>
            <td>申购</td>
            <td>100000</td>
            <td>1000,00</td>
        </tr>
        <tr>
            <td>2016-04-01</td>
            <td>现金驿站</td>
            <td>申购</td>
            <td>100000</td>
            <td>1000,00</td>
        </tr>
        </tbody>
    </table>
    <!--评测结果-->
    <div class="panel-body">
        <div></div>
    </div>
</div> <!--panel-->
</div> <!--row-->
</#macro>
<#include "../common/main.ftl">