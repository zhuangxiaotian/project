<#macro jsimport>
<script>
	var countdown=60;
	function settime(val) {
		if (countdown == 0) {
			val.value="获取";
			countdown = 60;
		} else {
			val.setAttribute("disabled", true);
			val.style.backgroundColor="#a9a9a9";
			val.value= countdown+"s后重新获取";
			countdown--;
		}
		setTimeout(function() {
			settime(val)
		},1000)
	}
	new showSelect("#bankSelect","#bankList");
    new showSelect("#msgSelect","#msgList");
</script>
</#macro>
<#macro htmlbody>
<div class="container">
        <!--注册-->
        <div class="header">
            <div class="header-container">
                <div class="hl">
                    <a href="javascript:history.go(-1);" class="back">
                        <i class="icon-back"></i>
                    </a>
                </div>
                <div class="title">注册-身份信息</div>
                <div class="hr">&nbsp;</div>
            </div>
        </div>
        <div class="weui_tab_bd">
            <div class="weui_cells sub-form">
                <div class="weui_cell sub-select">
                    <div>
                        <label class="weui_label">银行名称</label>
                    </div>
                    <div class="weui_cell_primary">
                        <div class="select" id="bankSelect"></div>
                    </div>
                </div>
                <div class="weui_cell">
                    <div class=""><label class="weui_label">银行卡号</label></div>
                    <div class="weui_cell_primary">
                        <input class="weui_input" type="text"　 placeholder=""/>
                    </div>
                </div>
                <div class="weui_cell">
                    <div class=""><label class="weui_label">真实姓名</label></div>
                    <div class="weui_cell_primary">
                        <input class="weui_input" type="text"　 placeholder=""/>
                    </div>
                </div>

            </div>
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
                        <input class="weui_input" type="text"　 placeholder=""/>
                    </div>
                </div>
            </div>
            <div class="weui_cells sub-form">
                <div class="weui_cell">
                    <div class=""><label class="weui_label">预留手机</label></div>
                    <div class="weui_cell_primary">
                        <input class="weui_input" type="text"　 placeholder=""/>
                    </div>
                </div>
                <div class="weui_cell">
                    <div class=""><label class="weui_label">验证码</label></div>
                    <div class="weui_cell_primary">
                        <input class="weui_input text-l" type="text"　 placeholder=""/>
                        <input type="text" value="获取验证码" readonly="readonly" class="sub-yzm" onclick="settime(this)"/>
                    </div>
                </div>
            </div>
            <div class="sub-cell login">
                <div class="text-l sub-check sub-check-s">
                    <i class="icon-checkbox"></i><span>我已阅读并同意</span>
                </div>
                <div class="flex-cell"><a href="javascript:;" class="blue">《建信基金网上交易协议》</a></div>
            </div>
            <div class="btn padding-spacing sub-placeholder-lg">
                <a href="${base}/ui/skyblue.action?type=registerPwd" class="weui_btn bg-blue">下一步</a>
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