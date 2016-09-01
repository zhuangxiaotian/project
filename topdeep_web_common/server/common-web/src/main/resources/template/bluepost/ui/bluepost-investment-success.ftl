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
    <table class="table table-post3">
        <tbody>
        <tr class="table-post-title">
            <td>协议号</td>
            <td>基金名称</td>
            <td>结算渠道</td>
            <td>交易周期及时间</td>
            <td>每期申购</td>
            <td>操作</td>
        </tr>
        <tr>
            <td>001916000060(正常)</td>
            <td>现金驿站</td>
            <td>申购</td>
            <td>每月01日</td>
            <td>1000,00</td>
            <td>
                <a href="javascript:void(0)" class="ibtn ibtn-yellow ibtn-sm">修改</a>
                <a href="javascript:void(0)" class="ibtn ibtn-default ibtn-sm">暂停</a>
                <a href="javascript:void(0)" class="ibtn ibtn-red ibtn-sm">终止</a>
            </td>
        </tr>
        <tr>
            <td>001916000060(正常)</td>
            <td>现金驿站</td>
            <td>申购</td>
            <td>每月01日</td>
            <td>1000,00</td>
            <td>
                <a href="javascript:void(0)" class="ibtn ibtn-yellow ibtn-sm">修改</a>
                <a href="javascript:void(0)" class="ibtn ibtn-blue ibtn-sm">恢复</a>
                <a href="javascript:void(0)" class="ibtn ibtn-red ibtn-sm">终止</a>
            </td>
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