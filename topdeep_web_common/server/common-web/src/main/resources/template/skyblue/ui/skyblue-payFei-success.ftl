<#macro jsimport>
<script>
new showSelect("#bankSelect","#bankList");
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
                <div class="title">收款</div>
                <div class="hr">&nbsp;</div>
            </div>
        </div>
        <div class="weui_tab_bd">
            <div class="weui_cells sub-form">
                <div class="weui_cell sub-select">
                    <div class=""><label class="weui_label">付款银行卡</label></div>
                    <div class="weui_cell_primary">
                        <div class="select" id="bankSelect"></div>
                    </div>
                </div>
                <div class="weui_cell">
                    <div class=""><label class="weui_label">支付金额</label></div>
                    <div class="weui_cell_primary">
                        <input class="weui_input" type="text"　 placeholder=""/>
                    </div>
                </div>
                <div class="weui_cell">
                    <div class=""><label class="weui_label">协议号</label></div>
                    <div class="weui_cell_primary">
                        <input class="weui_input" type="email"　 placeholder=""/>
                    </div>
                </div>

            </div>
            <div class="weui_cells sub-form">
                <div class="weui_cell">
                    <div class=""><label class="weui_label">收款人昵称</label></div>
                    <div class="weui_cell_primary">
                        <input class="weui_input" type="text"　 placeholder=""/>
                    </div>
                </div>
                <div class="weui_cell">
                    <div class=""><label class="weui_label">收款人姓名</label></div>
                    <div class="weui_cell_primary">
                        <div class="text-r">夏沫</div>
                    </div>
                </div>
                <div class="weui_cell">
                    <div class=""><label class="weui_label">收款人手机号</label></div>
                    <div class="weui_cell_primary">
                        <div class="text-r">138 6666 8888</div>
                    </div>
                </div>
                <div class="weui_cell">
                    <div class=""><label class="weui_label">备注</label></div>
                    <div class="weui_cell_primary">
                        <input class="weui_input" type="text"　 placeholder=""/>
                    </div>
                </div>
            </div>
            <div class="weui_cells sub-form">
                <div class="weui_cell">
                    <div class=""><label class="weui_label">付款密码</label></div>
                    <div class="weui_cell_primary">
                        <input class="weui_input" type="password"　 placeholder=""/>
                    </div>
                </div>
            </div>
            <div class="sub-cell login">
                <div class="text-l sub-check sub-check-s">
                    <i class="icon-checkbox"></i><span>我已阅读并同意</span>
                </div>
                <div class="flex-cell"><a href="javascript:;" class="blue">《建信基金XX协议》</a></div>
            </div>
            <div class="btn padding-spacing sub-placeholder-lg">
                <a href="javascript:;" class="weui_btn bg-blue">确认付款</a>
            </div>
        </div>
    </div>
    <div class="select-content">
        <div class="weui_mask_transition" id="mask"></div>
        <div class="weui_actionsheet select-list" id="bankList">
            <div class="weui_actionsheet_menu select-menu">
                <div class="weui_actionsheet_cell"><i class="bank-b005"></i>建设银行</div>
                <div class="weui_actionsheet_cell"><i class="bank-b004"></i>中国银行</div>
                <div class="weui_actionsheet_cell"><i class="bank-b002"></i>工商银行</div>
            </div>
        </div>
    </div>
</#macro>
<#include "../common/main.ftl">