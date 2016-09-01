<#macro jsimport>
<script>
$(document).ready(function(){
	$("#test").click(function(){
		showConfirm("对方没有开通收付款功能，不能收款。","取消","确认","warning");
	})
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
			<div class="title">付款</div>
			<div class="hr"><a href="javascript:;">添加备注</a></div>
		</div>
	</div>
	<div class="weui_tab_bd">
		<div class="weui_cells sub-form">
			<div class="weui_cell">
				<div class=""><label class="weui_label">支付金额</label></div>
				<div class="weui_cell_primary">
					<input class="weui_input" type="text"　 placeholder=""/>
				</div>
			</div>
			<div class="weui_cell">
				<div class=""><label class="weui_label">交易方式</label></div>
				<div class="weui_cell_primary">
					<div class="text-r">
                            <ul class="radio-list clearfix">
                                <li data-number="1" data-name="draw" class="active"><i class="icon-radio"></i>面对面</li>
                                <li data-number="2" data-name="draw"><i class="icon-radio"></i>非面对面</li>
                            </ul>
                        </div>
				</div>
			</div>
			<div class="target2">
				<div class="weui_cell">
					<div class=""><label class="weui_label">收款人姓名</label></div>
					<div class="weui_cell_primary">
						<div class="sub-l">
							<a href="${base}/ui/skyblue.action?type=myContacts" class="weui_btn bg-yellow-l">常用联系人</a>
						</div>
					</div>
				</div>
				<div class="weui_cell">
					<div class=""><label class="weui_label">收款人手机号</label></div>
					<div class="weui_cell_primary">
						<input class="weui_input" type="text" placeholder=""/>
					</div>
				</div>
			</div>
		</div>
		<div class="weui_cells sub-form target1">
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
			<a href="javascript:;" class="weui_btn bg-blue" id="test">下一步</a>
		</div>
	</div>
</div>
</#macro>
<#include "../common/main.ftl">