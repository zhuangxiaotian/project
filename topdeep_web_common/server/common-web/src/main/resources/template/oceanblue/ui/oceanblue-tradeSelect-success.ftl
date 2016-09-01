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
    <a class="back" href="javascript:void(0);"><i></i></a>
    <h1 class="title">交易筛选</h1>
</header>
<div class="section">
    <div class="box-input">
        <input type="text" placeholder="输入业务名称/基金名称/基金代码">
    </div>
    <ul class="sub-tab">
        <li class="active"><a href="javascript:;">按业务名称</a></li>
        <li><a href="javascript:;">按基金名称</a></li>
    </ul>
    <div class="tab-panel">
        <ul class="sub-list">
            <li>
                <i class="d"></i>
                <div class="list-detail">
                    <span class="fl">申购</span>
                </div>
            </li>
            <li>
                <i class="d"></i>
                <div class="list-detail">
                    <span class="fl">赎回</span>
                </div>
            </li>
            <li>
                <i class="d"></i>
                <div class="list-detail"><span class="fl">快速赎回</span></div>
            </li>
            <li>
                <i class="d"></i>
                <div class="list-detail">
                    <span class="fl">定投协议签订</span>
                </div>
            </li>
            <li>
                <i class="d"></i>
                <div class="list-detail">
                    <span class="fl">分红</span>
                </div>
            </li>
        </ul>
    </div>
    <div class="tab-panel" style="display: none;">
        <ul class="sub-list">
            <li>
                <i class="d"></i>
                <div class="list-detail">
                    <span class="fl">建信中证500</span>
                </div>
            </li>
            <li>
                <i class="d"></i>
                <div class="list-detail">
                    <span class="fl">建信环保产业</span>
                </div>
            </li>
        </ul>
    </div>
</div>
</#macro>
<#include "../common/main.ftl">