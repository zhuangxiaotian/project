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
    <h1 class="title">交易详情</h1>
</header>
<div class="section">
    <form name="" action="">
        <div style="padding-bottom: 10px">
            <ul class="sub-list">
                <li>
                    <i class="d"></i>
                    <div class="list-detail">
                        <span class="fl">基金名称</span>
                        <span class="fr">建信基金</span>
                    </div>
                </li>
                <li>
                    <i class="d"></i>
                    <div class="list-detail">
                        <span class="fl">基金代码</span>
                        <span class="fr">银行卡</span>
                    </div>
                </li>
                <li>
                    <i class="d"></i>
                    <div class="list-detail">
                        <span class="fl">业务名称</span>
                        <span class="fr"></span>
                    </div>
                </li>
                <li>
                    <i class="d"></i>
                    <div class="list-detail">
                        <span class="fl">下单时间</span>
                        <span class="fr"></span>
                    </div>
                </li>
                <li>
                    <i class="d"></i>
                    <div class="list-detail">
                        <span class="fl">申请日期</span>
                        <span class="fr"></span>
                    </div>
                </li>
                <li>
                    <i class="d"></i>
                    <div class="list-detail">
                        <span class="fl">确认日期</span>
                        <span class="fr"></span>
                    </div>
                </li>
                <li>
                    <i class="d"></i>
                    <div class="list-detail">
                        <span class="fl">资金来源</span>
                        <span class="fr"><i class="bank-b005"></i>建设银行</span>
                    </div>
                </li>
                <li>
                    <i class="d"></i>
                    <div class="list-detail">
                        <span class="fl">交易状态</span>
                        <span class="fr"></span>
                    </div>
                </li>
                <li>
                    <i class="d"></i>
                    <div class="list-detail">
                        <span class="fl">手续费</span>
                        <span class="fr"></span>
                    </div>
                </li>
                <li>
                    <i class="d"></i>
                    <div class="list-detail">
                        <span class="fl">申请编号</span>
                        <span class="fr"></span>
                    </div>
                </li>
            </ul>
        </div>
    </form>
</div>
</#macro>
<#include "../common/main.ftl">