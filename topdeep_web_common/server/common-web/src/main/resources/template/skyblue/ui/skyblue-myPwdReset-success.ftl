<#macro htmlbody>
<div class="container">
	<div class="header">
                    <div class="header-container">
                        <div class="hl">
                            <a href="javascript:history.go(-1);" class="back">
                                <i class="icon-back"></i>
                            </a>
                        </div>
                        <div class="title">修改交易密码</div>
                        <div class="hr">&nbsp;</div>
                    </div>
     </div>
     <div class="weui_tab_bd">
                    <div class="weui_cells sub-form">
                        <div class="weui_cell">
                            <div class=""><label class="weui_label">原密码</label></div>
                            <div class="weui_cell_primary">
                                <input class="weui_input" type="password"  placeholder=""/>
                            </div>
                        </div>
                    </div>
                    <div class="weui_cells sub-form">
                        <div class="weui_cell">
                            <div class=""><label class="weui_label">新密码</label></div>
                            <div class="weui_cell_primary">
                                <input class="weui_input" type="password" placeholder=""/>
                            </div>
                        </div>
                        <div class="weui_cell">
                            <div class=""><label class="weui_label">确认新密码</label></div>
                            <div class="weui_cell_primary">
                                <input class="weui_input" type="password"  placeholder=""/>
                            </div>
                        </div>
                    </div>
                    <div class="btn padding-spacing sub-placeholder-lg">
                        <a href="${base}/ui/skyblue.action?type=myPwdSuccess" class="weui_btn bg-blue">确认</a>
                    </div>
     </div>
</div>
</#macro>
<#include "../common/main.ftl">