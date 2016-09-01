<#macro jsimport>
<script type="text/javascript">
$(function(){
    $(document).on("click",".sub-tab>li",function(){
        $(this).addClass("active").siblings().removeClass("active");
        $(".tab-panel").hide();
        $(".tab-panel").eq($(this).index()).show();
    })
});
</script>
</#macro>
<#macro htmlbody>
<header class="header-container">
    <a class="back" href="javascript:history.go(-1);"><i></i></a>
    <h1 class="title">区间盈亏</h1>
    <a href="javascript:;" class="header-right">产品详情</a>
</header>
<div class="fund-zzb">
    <img src="${base}/static/skin/${res.skin}/images/bg_zzb.png" alt="bg_pic"/>
    <div class="assets-number">8,666,999.00</div>
    <div class="breakeven">阶段盈亏</div>
</div>
<ul class="sub-tab">
    <li><a href="javascript:;">最近一月</a></li>
    <li><a href="javascript:;">最近三月</a></li>
    <li><a href="javascript:;">最近一年</a></li>
    <li class="active"><a href="javascript:;">自选周期</a></li>
</ul>
<div class="tab-panel" style="display: none;">1</div>
<div class="tab-panel" style="display: none;">2</div>
<div class="tab-panel" style="display: none;">3</div>
<div class="tab-panel">
    <div class="sub-cells box-breakeven">
        <div class="sub-cell">
                <div class="date-name">
                    <div class="date-select">开始日期</div>
                    <div class="date-select">结束日期</div>
                </div>
                <div class="flex-cell">
                    <div class="date-select">
                        <input type="date" placeholder=""/>
                        <i class="icon-right"></i>
                    </div>
                    <div class="date-select">
                        <input type="date" placeholder=""/>
                        <i class="icon-right"></i>
                    </div>
                </div>
                <div class="btn-search flex-cell ">
                    <a href="javascript:;" class="">查询</a>
                </div>
        </div>
    </div>
    <table class="table table-flex">
        <thead>
        <tr>
            <th>基金名称</th>
            <th>阶段盈亏(元)</th>
            <th>阶段盈亏(%)</th>
        </tr>
        </thead>
    </table>
    <table class="table table-flex">
        <tbody>
        <tr class="border-top">
            <td>建信中证500</td>
            <td>299.74</td>
            <td>100.00</td>
        </tr>
        <tr class="border-top">
            <td>建信中证500</td>
            <td>299.74</td>
            <td>100.00</td>
        </tr>
        </tbody>
    </table>
</div>
</#macro>
<#include "../common/main.ftl">