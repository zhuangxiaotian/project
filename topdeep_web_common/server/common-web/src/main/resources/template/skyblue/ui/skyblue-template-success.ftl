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
	<div class="tabbar-panel" style="display: block;">
		<div class="header">
			<div class="header-container">
				<div class="hl">
					<a href="javascript:history.go(-1);">
						<i class="icon-left"></i>
					</a>
				</div>
				<div class="title">
					模板页
				</div>
				<div class="hr">&nbsp;</div>
			</div>
		</div>
		<div class="weui_tab_bd">

			<!--带输入框的列表项-->
			<div class="weui_cells_title">带输入框的列表项</div>
			<div class="weui_cells sub-form">
				<div class="weui_cell">
					<div class=""><label class="weui_label">昵称</label></div>
					<div class="weui_cell_primary">
						<input class="weui_input" type="text"　 placeholder=""/>
					</div>
				</div>
				<div class="weui_cell">
					<div class=""><label class="weui_label">邮箱</label></div>
					<div class="weui_cell_primary">
						<input class="weui_input" type="email"　 placeholder=""/>
					</div>
				</div>
			</div>

			<!--带select的列表项-->
			<div class="weui_cells_title">带select的列表项</div>
			<div class="weui_cells sub-form">
				<div class="weui_cell sub-select">
					<div>
						<label class="weui_label">银行名称</label>
					</div>
					<div class="weui_cell_primary">
						<div class="select" id="bankSelect"></div>
					</div>
				</div>
				<div class="weui_cell sub-select">
					<div>
						<label class="weui_label">证件类型</label>
					</div>
					<div class="weui_cell_primary">
						<div class="select" id="msgSelect"></div>
					</div>
				</div>
			</div>

			<!--带说明的列表项-->
			<div class="weui_cells_title">带说明的列表项</div>
			<div class="weui_cells sub-form">
				<div class="weui_cell">
					<div class=""><label class="weui_label">到账银行卡</label></div>
					<div class="weui_cell_primary">
						<div class="text-r">
							<i class="bank-b005"></i><span>建设银行[尾号5102]</span>
						</div>
					</div>
				</div>
				<div class="weui_cell">
					<div class=""><label class="weui_label">收款金额</label></div>
					<div class="weui_cell_primary">
						<div class="text-r">
							1000,000.00元
						</div>
					</div>
				</div>
			</div>
			<!--带验证码的列表项-->
			<div class="weui_cells_title">带验证码的列表项</div>
			<div class="weui_cells sub-form">
				<div class="weui_cell">
					<div class=""><label class="weui_label">验证码</label></div>
					<div class="weui_cell_primary">
						<input class="weui_input text-l" type="text" placeholder=""/>
						<input type="text" value="获取验证码" readonly="readonly" class="sub-yzm" onclick="settime(this)"/>
					</div>
				</div>
			</div>

			<!--带跳转的列表项-->
			<div class="weui_cells_title">带跳转的列表项</div>
			<div class="weui_cells sub-form">
				<a class="weui_cell" href="javascript:;">
					<div class="weui_cell_primary">
						<p>设置转让支付额度上限</p>
					</div>
					<div class="weui_cell_ft"></div>
				</a>
			</div>

			<!--文本-->
			<div class="weui_cells_title">文本</div>
			<div class="weui_cells sub-form">
				<a class="weui_cell msg">
					<div class="weui_cell_primary">
						<div class="fontsize-18">什么是结算易？</div>
					</div>
				</a>
				<div class="weui_cell msg-detail">
					<div class="weui_cell_primary">
						结算易APP是一款为特定平台提供交易结算功能的APP,基本功能是为参与交易的收款方和付款方提供一种新的资金交收方式，并附加资金增值功能……
					</div>
				</div>
			</div>

			<!--按钮-->
			<div class="weui_cells_title">按钮</div>
			<div class="btn padding-spacing">
				<a href="javascript:;" class="weui_btn bg-yellow">确认收款</a>
				<a href="javascript:;" class="weui_btn bg-blue">放弃收款</a>
			</div>

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