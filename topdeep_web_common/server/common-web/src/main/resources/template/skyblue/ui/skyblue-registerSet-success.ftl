<#macro jsimport>
<script>
	new showSelect("#marketSelect","#marketList");
    new showSelect("#networkSelect","#networkList");
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
			<div class="title">注册-设置收付款</div>
			<div class="hr">&nbsp;</div>
		</div>
	</div>
	<div class="weui_tab_bd">
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
		<div class="weui_cells sub-form">
			<div class="weui_cell sub-select">
				<div>
					<label class="weui_label">所属市场</label>
				</div>
				<div class="weui_cell_primary">
					<div class="select" id="marketSelect"></div>
				</div>
			</div>
			<div class="weui_cell sub-select">
				<div>
					<label class="weui_label">网点</label>
				</div>
				<div class="weui_cell_primary">
					<div class="select" id="networkSelect"></div>
				</div>
			</div>
			<div class="weui_cell">
				<div>
					<label class="weui_label">客户经理</label>
				</div>
				<div class="weui_cell_primary">
					<input class="weui_input" type="text"　 placeholder=""/>
				</div>
			</div>
		</div>
		<div class="weui_cells sub-form">
			<a class="weui_cell" href="${base}/ui/skyblue.action?type=registerSetLimit">
				<div class="weui_cell_primary">
					<p>设置转让支付额度上限</p>
				</div>
				<div class="weui_cell_ft"></div>
			</a>
			<div class="weui_cell">
				<div class=""><label class="weui_label">设置短信验证码额度</label></div>
				<div class="weui_cell_primary">
					<input class="weui_input" type="text"　 placeholder=""/>
				</div>
			</div>
			<div class="weui_cell">
				<div class=""><label class="weui_label">设置转让支付密码</label></div>
				<div class="weui_cell_primary">
					<input class="weui_input" type="password"　 placeholder=""/>
				</div>

			</div>
			<div class="weui_cells_tips">密码必须由字母和数字组成</div>
			<div class="weui_cell">
				<div class=""><label class="weui_label">确认转让支付密码</label></div>
				<div class="weui_cell_primary">
					<input class="weui_input" type="password"　 placeholder="***"/>
				</div>
			</div>
		</div>
		<div class="btn padding-spacing sub-placeholder-lg">
			<a href="javascript:;" class="weui_btn bg-blue">下一步</a>
		</div>
	</div>
</div>
<div class="select-content">
        <div class="weui_mask_transition" id="mask"></div>
        <div class="weui_actionsheet select-list" id="marketList">
            <div class="weui_actionsheet_menu select-menu">
                <div class="weui_actionsheet_cell">市场一</div>
                <div class="weui_actionsheet_cell">市场二</div>
                <div class="weui_actionsheet_cell">市场三</div>
            </div>
        </div>
        <div class="weui_actionsheet select-list" id="networkList">
            <div class="weui_actionsheet_menu select-menu">
                <div class="weui_actionsheet_cell">网点一</div>
                <div class="weui_actionsheet_cell">网点二</div>
                <div class="weui_actionsheet_cell">网点三</div>
            </div>
        </div>
    </div>
</#macro>
<#include "../common/main.ftl">