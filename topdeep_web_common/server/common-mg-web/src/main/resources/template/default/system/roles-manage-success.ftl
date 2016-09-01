<#macro htmlhead>
</#macro>
<#macro jsimport>
	<script src="${base}/static/common/js/system/rolesManage.js?v=${res.version!''}"></script>
	<script src="${base}/static/common/js/system/privilege.js?v=${res.version!''}"></script>
	<script>
	 $(function(){
	  		RolesManage.initPage();
	  		Privilege.initPage();
	 });
	</script>
</#macro>

<#macro htmlbody>
    <div id="wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">角色管理</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            
            <div id="roles_list_table" class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
					<div class="panel-heading">
                            提供超级管理员管理用户角色权限的功能。
                        </div>
						<div class="panel-body">
							<div class="dataTable_wrapper" style="overflow-x:auto;overflow-y:hidden;">
								<table
									class="table table-striped table-bordered table-hover">
									<thead style="white-space:nowrap;word-break:keep-all">
										<tr>
										<th width="50px" ><input type='checkbox' id= "all_list_check" name='delete_all' value="" ></input></th>
										<th >角色名称</th>
										<th >角色状态</th>
										<th >角色备注</th>
										<th >操作</th>
										</tr>
									</thead>
									<tbody id="roles_tbody_table">
									</tbody>
									<tfoot>
									<tr>
										<td colspan='5'><div>
										<input class='btn btn-default' type='button' value = '禁止' onclick='RolesManage.chooseDisableState()'/>
										<input class='btn btn-default' type='button' value = '激活' onclick='RolesManage.chooseRestoreState()'/>
										<input class='btn btn-default' id='delete'  type='button' value = '删除'/>
										<input class='btn btn-default' data-toggle='modal' data-target='#myModal'  type='button' value = '新增' onclick='RolesManage.createRoles()'/>
										</div></td>
										</tr>
									</tfoot>
								</table> 
						</div>
						<#include "${res.template.page}">
						<#if pageutil??>
							<@pageutil id=""></@pageutil>
						</#if>
					</div>
				</div>
			</div>
		</div><!-- ’修改‘模态框（Modal） -->
		<div
			class="modal fade"
			id="myModal"
			tabindex="-1"
			role="dialog"
			aria-labelledby="myModalLabel"
			aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button
								type="button"
								class="close"
								data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h4
								class="modal-title"
								id="myModalLabel">角色修改</h4>
					</div>
						<div class="modal-body">
							<div class="panel-body">
								<div class="row">
									<div class="col-lg-12">
										<form
											id="editForm"
											role="form"
											class="form-horizontal form-inline">
											<div class="row">
												<div class="col-lg-12">
													
													<div class="control-group"><label
																for="roleName_update">角色名称:</label> <input
																id="roleName_update"
																name="role.name"
																class="form-control required"
																type="text"
																maxlength="50"
																value=""></div>
													<div class="control-group"><label
																for="roleMemo_update">角色备注:</label> <input
																id="roleMemo_update"
																name="role.memo"
																class="form-control"
																type="text"
																maxlength="1000"
																value=""></div>
													<div class="control-group"><label
																for="privilegeFieldsetToggle">${'　　'}权限:</label> <input
																id="privilegeFieldsetToggle"
																name="privilegeFieldsetToggle"
																class="btn"
																type="button"
						 										value="展开"></div>
												
													<input id="roleId_update" type="hidden" name="role.id" value="" ></input>
													<input id="roleVersion_update" type="hidden" name="role.rowVersion" value="" ></input>
													<input id="roleState_update" type="hidden" name="role.state" value="" ></input>
													<input id="func" type="hidden" value="" ></input>
													<input id="oper" type="hidden" value="" ></input>
											
										<div class="control-group">
										<fieldset id="privilegeFieldset" style="display:none;">
											<legend>
												<span class="privilege"></span>
											</legend>
											<table  class="privilege" align="center" border="0" cellpadding="0"
												cellspacing="0" width="100%">
												<thead>
												<tr>
													<th  width="35%">功能</th>
													<th >读</th>
													<th >写</th>
													<th >删除</th>
													<th >执行</th>
													<th >审核</th>
												</tr>
												</thead>
												<tbody id="privilegeTable">
												</tbody>
											</table>
										</fieldset>
										</div>
										</div>
										</div>
										</form>
								</div>
							</div>
						</div>
					</div>
						<div class="modal-footer">
							<button
								id="closeBtn"
								type="button"
								class="btn btn-default"
								data-dismiss="modal">关闭</button>
							<button
								id="update_roles_button"
								type="button"
								class="btn btn-default">提交更改</button>
							<button
								id="create_roles_button"
								style="display:none;"
								type="button"
								onClick="RolesManage.ajaxCreateRoles()"
								class="btn btn-default">确定</button>
					</div>
				</div> <!-- /.modal-content -->
			</div> <!-- /.modal -->
		</div>
		
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

</#macro>

<#include "${res.template.main}">
