<#macro htmlbody>
<!-- /.row -->
<div class="row">
    <div class="location">
        您所在的位置：业务查询><span> 基金超市</span>
    </div>
<!--基金超市-->
<div class="panel panel-default sub-content radiusClear">
    <div class="panel-body">

        <div class="col-xs-9 fund-select pull-left clearfix">
            <ul>
            	<li>
                    <a href="javascript:void(0)">
                        热销型<i class="icon-hot"></i>
                    </a>
                </li>
                <li class="current" >
                    <a href="javascript:void(0)">
                        全部
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0)">
                        股票型
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0)">
                        货币型
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0)">
                        混合型
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0)">
                        指数型
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0)">
                        债券型
                    </a>
                </li>
            </ul>
        </div>
        <div class="col-xs-3 pull-right clearfix">
            <div class="input-group post-search pull-right">
                <input type="text" class="form-control post-search-input" placeholder="输入基金编号或基金名称" style="">
                        <span class="input-group-btn">
                            <button class="btn btn-default search-btn" type="button" style="">
                                <i class="icon-search"></i>
                            </button>
                        </span>
            </div>
        </div>
        
    </div>
    <table class="table table-post3 table-fixed">
        <tbody>
        <tr class="table-post-title">
            <td>基金代码</td>
            <td>基金名称</td>
            <td>万份收益</td>
            <td>七日年化</td>
            <td>净值日期</td>
            <td>费率</td>
            <td>操作</td>
        </tr>
        <tr>
            <td>000545</td>
            <td>中邮</td>
            <td>1.773</td>
            <td>
                1.91%
            </td>
            <td>2016-11-11</td>
            <td><span class="through">1.6%</span>／<span class="red">1.8%</span></td>
            <td>
                <a href="${base}/ui/bluepost.action?type=buy1" class="ibtn ibtn-red ibtn-sm">认购</a>
            </td>
        </tr>
        <tr>
            <td>000545</td>
            <td>中邮</td>
            <td>1.773</td>
            <td>
                1.91%
            </td>
            <td>2016-11-11</td>
            <td><span class="through">1.6%</span>／<span class="red">1.8%</span></td>
            <td>
                <a href="${base}/ui/bluepost.action?type=buy1" class="ibtn ibtn-blue ibtn-sm">申购</a>
            </td>
        </tr>
        <tr>
            <td>000545</td>
            <td>中邮</td>
            <td>1.773</td>
            <td>
                0.00%
            </td>
            <td>2016-11-11</td>
            <td><span class="through">1.6%</span>／<span class="red">1.8%</span></td>
            <td>
                <a href="${base}/ui/bluepost.action?type=buy1" class="ibtn ibtn-default ibtn-sm">暂停</a>
            </td>
        </tr>
        </tbody>
    </table>
    <div class="panel-body">
        <div class="post-page">
            <ul class="pagination post-pagination">
                <li>
                    <a href="#" aria-label="Previous">
                        <span aria-hidden="true">第一页</span>
                    </a>
                </li>
                <li><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li>
                    <a href="#" aria-label="Next">
                        <span aria-hidden="true">next</span>
                    </a>
                </li>
            </ul>
        </div>
    </div>
</div> <!--panel-->
</div> <!--row-->
</#macro>
<#include "../common/main.ftl">