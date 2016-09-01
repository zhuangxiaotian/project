<#macro jsimport>
<script>
    new showSelect("#msgSelect","#msgList");
</script>
</#macro>
<#macro htmlbody>
<div class="container">
	<!--登录-->
        <div class="header">
            <div class="header-container">
                <div class="hl">
                    <a href="javascript:history.go(-1);" class="back">
                        <i class="icon-back"></i>
                    </a>
                </div>
                <div class="title">登录</div>
                <div class="hr">&nbsp;</div>
            </div>
        </div>
        <div class="weui_tab_bd">
            <div class="weui_cells sub-form">
                <div class="weui_cell sub-select">
                    <div>
                        <label class="weui_label">证件类型</label>
                    </div>
                    <div class="weui_cell_primary">
                        <div class="select" id="msgSelect"></div>
                    </div>
                </div>
                <div class="weui_cell">
                    <div class=""><label class="weui_label">证件号码</label></div>
                    <div class="weui_cell_primary">
                        <input class="weui_input" type="number"　 placeholder="请输入您的证件号码"/>
                    </div>
                </div>
            </div>
            <div class="weui_cells sub-form">
                <div class="weui_cell">
                    <div class="weui_cell_hd"><label class="weui_label">交易密码</label></div>
                    <div class="weui_cell_bd weui_cell_primary">
                        <input class="weui_input" type="password" pattern="[0-9]*" placeholder="请输入交易密码">
                    </div>
                </div>
            </div>
            <div class="sub-cell login">
                <div class="flex-cell text-l sub-check sub-check-s">
                    <i class="icon-checkbox"></i><span>记住用户名</span>
                </div>
                <div class="flex-cell text-r">
                    <a href="javascript:;" class="lost-pwd">忘记密码？</a>
                </div>
            </div>
            <div class="btn padding-spacing sub-placeholder-lg">
                <a href="${base}/ui/skyblue.action?type=indexAlready" class="weui_btn bg-yellow">登录</a>
                <a href="${base}/ui/skyblue.action?type=registerMsg" class="weui_btn bg-blue">注册</a>
            </div>
            <div class="login-tip">
                <a href="javascript:;">免费条款</a><a href="javascript:;">安全指引</a>
            </div>
        </div>
</div>
<div class="select-content">
        <div class="weui_mask_transition" id="mask"></div>
        <div class="weui_actionsheet select-list" id="msgList">
            <div class="weui_actionsheet_menu select-menu">
                <div class="weui_actionsheet_cell">身份证</div>
                <div class="weui_actionsheet_cell">军官证</div>
                <div class="weui_actionsheet_cell">结婚证</div>
            </div>
        </div>
</div>

</#macro>
<#include "../common/main.ftl">