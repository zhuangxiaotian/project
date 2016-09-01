<#macro htmlhead>
</#macro>
<#macro jsimport>
	<script>
	var idTypes =[];
	var urls = [];
	
// 	idTypes.push({ 
// 		ID:"OPENID",
// 		txt:"OPENID"
// 	});
	<#if res.idTypeList ??>
		<#list res.idTypeList as item>
			idTypes.push({
				ID:"${item.codeId}",
				txt:"${item.codeName}"
			});								
		</#list>	
	</#if>
	<#if res.whiteListsURL ??>
		<#list res.whiteListsURL as item>
		urls.push({
				ID:"${item.codeDesc}",
				txt:"${item.codeName}"
			});								
		</#list>	
	</#if>
</script>
<script  src="${base}/static/common/js/system/whiteLists.js?v=${res.version!''}"></script>	
<script type="text/javascript">

	$(function() {
	//	PageUtils.initPage(WhiteLists.ajaxQuerywhiteList);
		WhiteLists.initPage();
		
	});
</script>
</#macro>

<#macro htmlbody>
    <div id="wrapper">
            <div class="row">
                <div class="col-lg-12">
                 <h1 class="page-header">${res.title!''}</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            
            <!--row-->
            <div class="row">
					<div class="col-lg-12">
						<form role="form" class="form-inline">
						<input type="hidden" id="funcType" value="${res.type}"/>
							<div class="form-group">
								<label for="listType_query" class="control-label"> 类型:</label>
								<select id="listType_query" name="listType_query" class="form-control selector">
									<option value="" selected="selected">请选择</option>
<!-- 									<option value="OPENID">OPENID</option> -->
									<#list res.idTypeList as item>
									<option value="${item.codeId}">${item.codeName}</option>
									</#list>
								</select>
							</div>
							<div class="form-group">
								<label for="sel" class="control-label"> 功能号:</label>
								<select id="sel" name="sel" class="form-control selector">
									<option value="" selected="selected">请选择</option>
									<#list res.whiteListsURL as item>
									<option value="${item.codeDesc}">${item.codeName}</option>
									</#list>
							    </select>
							</div>
							<div class="form-group">
									<label for="idNo_query" class="control-label">证件号:</label>
									<input id="idNo_query" name="idNo_query" class="form-control" type="text" value="">
							</div>
							<div class="form-group" style="text-align: left;">
								<input type="button" value="查询" id="search_button" class="btn btn-default"	onclick="WhiteLists.ajaxSearchWhiteLists()" />
								<input type="button" value="重置" id="resetQuery_button" class="btn btn-default" onclick="WhiteLists.resetQuery()" />
							<!--	<input type="button" class="btn btn-outline btn-default" value="刷新系统缓存" id="refresh_cache_button" style="width: 160px;" /> -->
							</div>
						</form>
					</div>
				</div> <!--row-->
            
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                            <div style="margin-bottom:10px;">
	                            <div class="input-group custom-search-form col-xs-2">
	                            </div>
	                            </div>

				<div id="btnArea">
				<input style = "width:80px;margin-left:0px;border: 1px  #cccccc solid;" type='button' class='btn btn-sm btn-default' value = '新增' onclick='WhiteLists.createWhiteLists()' data-toggle='modal' data-target='#myModal'/>
				<input style = "width:80px;margin-left:20px;border: 1px  #cccccc solid;" class='btn btn-sm btn-default' type='button' value = '删除' onclick='WhiteLists.chooseDelete()'/>
				</div>
				<br/> 
								<div id="myGrid" class="myGrid"></div>
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
                
                <div id="mask_div"></div>
                <div id="dialog_div"></div>
                
            </div>
            <!-- /.row -->
        <!-- /#page-wrapper -->

      <!-- 模态框（Modal） -->
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
								id="myModalLabel">修改白名单</h4>
					</div>
						<div class="modal-body">
							<div class="panel-body">
								<div class="row">
									<div class="col-lg-12">
										<form
											id="contact-form"
											role="form"
											class="form-horizontal">
											<div class="row">
												<div class="col-lg-12">
													<div class="form-inline form-group"><label for="listType_u">${'　　'}类型:&nbsp;</label><select
														id="listType_u"
														name="listType_u"
														class="required form-control">
														<option
															value=""
															selected="selected">请选择</option>
<!-- 														<option value="OPENID">OPENID</option> -->
														<#list res.idTypeList
															as item>
															<option value="${item.codeId}">${item.codeName}</option>
															</#list>
													</select></div>
												
													
													<div
													class="form-inline form-group"
													id="idNo_tr"><label for="idNo_u">${'　'}证件号:</label> <input
														id="idNo_u"
														name="idNo_u"
														class="required"
														type="text"
														value="" /></div>
													<div class="form-inline form-group"><label for="sel_u">${'　'}功能号:</label> <select
														id="sel_u"
														class="required form-control"
														name="sel_u"> <#list res.whiteListsURL as item>
															<option value="${item.codeDesc}">${item.codeName}</option>
															</#list>
													</select></div>
													<div
													id="status_tr"
													class="form-inline form-group"
													style="display: none"><label for="status_u">启动状态:</label>
														<select
														id="status_u"
														name="status_u"
														class="required form-control"><option value="1">开启</option>
															<option value="0">关闭</option></select></div>
											</div>
											</div>
										</form>
								</div>
							</div>
						</div>
					</div>
						<div class="modal-footer">
						<h4 id="errorMsg" style="text-align: left; color: red;"></h4>
							<button
								id="closeBtn"
								type="button"
								class="btn btn-default"
								data-dismiss="modal">关闭</button>
							 
							<button
								id="create_white_button"
								type="button"
								style="display: none"
								class="btn btn-default">保存</button>
					</div>
				</div> <!-- /.modal-content --> <input
					id="listType"
					type="hidden"
					value="" /> <input
					id="openId"
					type="hidden"
					value="" /> <input
					id="idType"
					type="hidden"
					value="" /> <input
					id="listNo"
					type="hidden"
					value="" /> <input
					id="url"
					type="hidden"
					value="" />
			</div> <!-- /.modal -->
         
    </div>
    <!-- /#wrapper -->
    
</#macro>
<#include "${res.template.main}">
