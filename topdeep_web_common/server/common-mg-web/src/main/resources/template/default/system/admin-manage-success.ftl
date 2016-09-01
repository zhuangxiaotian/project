<#macro htmlhead>
</#macro>
<#macro jsimport>
	<script src="${base}/static/js/system/adminManage.js?v=${res.version!''}"></script>
	<script>
	$(function(){
		AdminManage.initPage();		
	})
	</script>
</#macro>

<#macro htmlbody>
<input id='currentSelectedAdmin' type='hidden' value=''/>

<div class="modal fade" id="selectRoles" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static" data-keyboard="false">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
               		 <h4 class="modal-title" id="">
 				设置用户角色
                </h4>
            </div>
             <div id="wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <div class="dataTable_wrapper" style="max-height:300px;overflow-y:scroll">
                             <form id="rolesList" role="Acc" style="width:100%;">
                             
                             </form>
                            </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
            <div class="modal-footer" id="removeButton">
            <input type='button'   id='closeRoles'  class='btn btn-default' data-dismiss="modal" value="关闭"></input>
               <input type='button' id='confirmRoles'    data-dismiss="modal" class='btn btn-default' value="确认"></input>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div><!--/.div-->


    <div id="wrapper">
            <div class="row">
                <div class="col-lg-12">
                 <h1 class="page-header">用户管理</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            超级管理员添加和管理系统用户以及相关权限
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                            <div style="margin-bottom:10px;">
	                            <div class="input-group custom-search-form col-xs-2">
	                                <input id="operator_search_keyword" type="text" class="form-control" style="width:220px" placeholder="登录名/用户名/手机号/邮箱">
	                                <span class="input-group-btn">
	                                <button id="operator_search_keyword_button" class="btn btn-default" type="button">
	                                    <i class="fa fa-search"></i>
	                                </button>
	                            </span>
	                            </div>
	                            </div>
								<div id="grid" class="myGrid"></div>
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
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->
<form id="newAdminRolesForm"></form>
<ul id="contextMenu" style="display:none;position:absolute">
  <b>设置状态:</b>
  <li data="0">禁止</li>
  <li data="1">正常</li>
</ul>

</#macro>
<#include "${res.template.main}">
