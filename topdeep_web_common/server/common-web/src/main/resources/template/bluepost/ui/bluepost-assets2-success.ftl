<#macro htmlbody>
<!-- /.row -->
<div class="row">
    <div class="location">
        您所在的位置：<span>我的资产</span>
    </div>
    <div class="welcome">
        尊敬的Yzhu 先生，上午/下午/晚上好，欢迎回到中邮！
    </div>
<!--我的资产-->
<div class="panel panel-default sub-content clearfix">
    <div class="panel-body">
        <div class="col-xs-12 col-xs-12">
            <div class="sub-title">
                <span>我的资产</span>
                <i class="post-date">(2016-11-11)</i>
            </div>
        </div>
        <div class="col-xs-12">
            <div class="my-assets">
                <span>我的资产</span>
                <i>2000000.000元</i>
            </div>
        </div>
    </div>
    <table class="table table-post2 post-position">
        <tbody>
        <tr class="table-post-title">
            <td>基金代码</td>
            <td>基金名称</td>
            <td>基金净值</td>
            <td>持有份额</td>
        </tr>
        <tr>
            <td>000545</td>
            <td>中邮</td>
            <td>1.773</td>
            <td>11144.06</td>
        </tr>
        <tr>
            <td>000545</td>
            <td>中邮</td>
            <td>1.773</td>
            <td>11144.06</td>
        </tr>
        <tr>
            <td>000545</td>
            <td>中邮</td>
            <td>1.773</td>
            <td>11144.06</td>
        </tr>
        </tbody>
    </table>

</div>
<!--直销资产-->
<div class="panel panel-default sub-content clearfix">
    <div class="panel-body">
        <div class="col-xs-12">
            <div class="sub-title">
                <span>直销资产</span>
            </div>
        </div>
    </div>
    <table class="table table-post2 post-position">
        <tbody>
        <tr class="table-post-title">
            <td>交易账号</td>
            <td>持有份额</td>
            <td>操作</td>
        </tr>
        <tr>
            <td>中国银行</td>
            <td>1.773</td>
            <td>
                <a href="${base}/ui/bluepost.action?type=redeem1" class="ibtn ibtn-red">赎回</a>
            </td>
        </tr>
        <tr>
            <td>中国银行</td>
            <td>1.773</td>
            <td>
                <a href="javascript:void(0)" class="ibtn ibtn-gray ibtn-padding">已赎回</a>
            </td>
        </tr>
        </tbody>
    </table>
</div>   <!--panel-->
</div>    <!--row-->
</#macro>
<#include "../common/main.ftl">