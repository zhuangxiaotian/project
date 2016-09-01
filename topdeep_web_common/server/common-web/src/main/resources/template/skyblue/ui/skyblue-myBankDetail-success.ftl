<#macro jsimport>
<script>
$("#test").click(function(){
    pwdConfirm("password","请输入交易密码","取消","确认");
})
</script>
</#macro>
<#macro htmlbody>
<div class="container">
	<div class="header">
                <div class="header-container">
                    <div class="hl">
                        <a href="javascript:history.go(-1);" class="back">
                            <i class="icon-back"></i>
                        </a>
                    </div>
                    <div class="title">银行卡详情</div>
                    <div class="hr">&nbsp;</div>
                </div>
    </div>
    <div class="weui_tab_bd">
                <div class="weui_cells sub-form">
                    <div class="weui_cell">
                        <div class=""><label class="weui_label">银行名称</label></div>
                        <div class="weui_cell_primary">
                            <div class="text-r">
                                <i class="bank-b005"></i><span>建设银行</span>
                            </div>
                        </div>
                    </div>
                    <div class="weui_cell">
                        <div class=""><label class="weui_label">银行卡号</label></div>
                        <div class="weui_cell_primary">
                            <div class="text-r"></div>
                        </div>
                    </div>
                    <div class="weui_cell">
                        <div class=""><label class="weui_label">收付款功能</label></div>
                        <div class="weui_cell_primary">
                            <div class="text-r black">未开通</div>
                        </div>
                    </div>

                </div>
                <div class="weui_cells sub-form">
                    <a class="weui_cell" href="javascript:;">
                        <div class="weui_cell_primary">
                            <p>修改付款密码</p>
                        </div>
                        <div class="weui_cell_ft"></div>
                    </a>
                    <a class="weui_cell" href="javascript:;">
                        <div class="weui_cell_primary">
                            <p>设置转让支付额度上限</p>
                        </div>
                        <div class="weui_cell_ft"></div>
                    </a>
                    <div class="weui_cell">
                        <div class=""><label class="weui_label">修改短信验证码额度</label></div>
                        <div class="weui_cell_primary">
                            <div class="text-r">10000.00</div>
                        </div>
                    </div>
                </div>
                <div class="btn padding-spacing sub-placeholder-lg">
                    <a href="javascript:;" class="weui_btn bg-yellow" id="test">确认</a>
                    <a href="${base}/ui/skyblue.action?type=registerSet" class="weui_btn bg-blue">开通收付款功能</a>
                </div>
     </div>
</div>
</#macro>
<#include "../common/main.ftl">