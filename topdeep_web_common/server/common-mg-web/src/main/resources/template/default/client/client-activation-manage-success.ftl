<#macro htmlhead>
</#macro>
<#macro jsimport>
<script src="${base}/static/common/js/client/clientActivationManage.js"></script>
<script>
	$(function(){
		var groupMethod=$("#groupMethod1").val();
		ClientActivationManage.initPage(groupMethod);		
	})
	</script>
</#macro>

<#macro htmlbody>
       <div id="wrapper">
            <div class="row">
                <div class="col-lg-12">
                 <h1 class="page-header">客户端激活量数据分析</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           客户端激活量数据
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div>
                            <div style="margin-bottom:10px;">
	                            	<table>
	                            		<tr>
	                            			<td style="width: 10%">查询开始日期</td>
	                            			<td style="width: 20%">
	                            				<input id="startDate" type="text" class="form-control" style="width:200px" placeholder="格式yyyy-MM-dd">
	                            			</td>
	                            			<td style="width: 10%">查询结束日期</td>
	                            			<td style="width: 20%">
	                            				<input id="endDate" type="text" class="form-control" style="width:200px" placeholder="格式yyyy-MM-dd">
	                            			</td>
	                            		</tr>
	                            		<tr>
	                            			<td style="width: 10%">设备是否激活app</td>
	                            			<td style="width: 20%">
	                            				<select id="state">
				                            		<option value="">所有状态</option>
				                            		<option value="1">激活状态</option>
				                            		<option value="0">失效状态</option>
				                            	</select>
	                            			</td>
	                            			<td style="width: 10%">设备标志</td>
	                            			<td style="width: 20%">
	                            				<input id="deviceId" type="text" class="form-control" style="width:200px">
	                            			</td>
	                            			<td style="width: 10%">客户端屏幕宽度</td>
	                            			<td style="width: 20%">
	                            				<input id="clientScreenWidth" type="text" class="form-control" style="width:200px">
	                           				</td>
	                            		</tr>
	                            		<tr>
	                            			<td style="width: 10%">下载渠道</td>
	                            			<td style="width: 20%">
	                            				<input id="channel" type="text" class="form-control" style="width:200px">
	                            			</td>
	                            			<td style="width: 10%">设备型号</td>
	                            			<td style="width: 20%">
	                            				<input id="clientModel" type="text" class="form-control" style="width:200px">
	                            			</td>
	                            			<td style="width: 10%">客户端屏幕高度</td>
	                            			<td style="width: 20%">
	                            				<input id="clientScreenHeight" type="text" class="form-control" style="width:200px">
	                           				</td>
	                            		</tr>
	                            		<tr>
	                            			<td style="width: 10%">客户端类型</td>
	                            			<td style="width: 20%">
	                            				<input id="clientType" type="text" class="form-control" style="width:200px">
	                            			</td>
	                            			<td style="width: 10%">客户端操作系统版本</td>
	                            			<td style="width: 20%">
	                            				<input id="clientOsVersion" type="text" class="form-control" style="width:200px">
	                            			</td>
	                            			<td style="width: 10%">客户端屏幕密度</td>
	                            			<td style="width: 20%">
	                            				<input id="clientScreenDensity" type="text" class="form-control" style="width:200px">
	                           				</td>
	                            		</tr>
	                            		<tr>
	                            			<td style="width: 20%">分组方式</td>
	                            			<td colspan="4" style="width: 60%">
	                            				<input id="groupMethod" type="text" class="form-control" readonly="readonly">
	                            				<input id="groupMethod1" type="text" class="form-control" style="display: none">
	                            			</td>
	                            			<td style="width: 10%">
	                            				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	                            				<button id="create_roles_button" data-toggle='modal' data-target='#myModal' type="button" class="btn btn-primary">添加/修改</button>
	                            			</td>
	                            		</tr>
	                            	</table>
	                            	<br>
	                            	<table>
	                            		
	                            	</table>
	                                <span class="input-group-btn ">
	                                <button id="clientActivation_search_keyword_button" class="btn btn-default " type="button" style="margin-left: 1%">
	                                    查询
	                                </button>
	                                <button id="reset" class="btn btn-default " type="button" style="margin-left: 3%">
	                                    重置
	                                </button>
	                                <button id="exportAll" class="btn btn-default " type="button" style="margin-left: 4%">
	                                    导出excel
	                                </button>
	                              </span>
	                            </div>
								<div id="grid"  style = "height:430px">
								</div>
								<#include "${res.template.page}">
								<#if pageutil??>
									<@pageutil id=""></@pageutil>
								</#if>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
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
								id="myModalLabel">客户端激活量数据分析分组显示</h4>
					</div>
						<div class="modal-body">
							<div class="panel-body">
								<div class="row">
									<div class="col-lg-12">
									 	<input type="checkbox" name="checkbox" value="channel">下载渠道<br>
									    <input type="checkbox" name="checkbox" value="clientType">客户端类型<br>
									    <input type="checkbox" name="checkbox" value="clientVersion">客户端版本<br>
									    <input type="checkbox" name="checkbox" value="deviceId">设备标识<br>
									    <input type="checkbox" name="checkbox" value="clientModel">设备型号<br>
									    <input type="checkbox" name="checkbox" value="clientOs">客户端操作系统<br>
									    <input type="checkbox" name="checkbox" value="clientOsVersion">客户端操作系统版本<br>
									    <input type="checkbox" name="checkbox" value="clientScreenWidth">客户端屏幕宽度<br>
									 	<input type="checkbox" name="checkbox" value="clientScreenHeight">客户端屏幕高度<br>
									 	<input type="checkbox" name="checkbox" value="clientScreenDensity">客户端屏幕密度<br>
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
								id="create_roles_button"
								type="button"
								onClick="ClientActivationManage.clientGroupCondition()"
								class="btn btn-primary" data-dismiss="modal" >确定</button>
					</div>
				</div> <!-- /.modal-content -->
			</div> <!-- /.modal -->
		</div>

    </div>
    <!-- /#wrapper -->

</#macro>
<#include "${res.template.main}">