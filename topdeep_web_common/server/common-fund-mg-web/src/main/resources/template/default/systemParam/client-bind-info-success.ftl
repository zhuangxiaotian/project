<#macro htmlhead>
</#macro>
<#macro jsimport>
<script type="text/javascript" src="${base}/static/common/js/systemParam/clientBindInfoManage.js"></script>
<script type="text/javascript">
	$(function(){
		ClientBindInfoManage.initPage();
	})
</script>
<style>

#grid {
    height:400px;
}

</style>
</#macro>
<#macro htmlbody>
<div id="wrapper">

            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">绑定信息管理</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                        提供绑定信息管理功能
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
	                            <div class="input-group custom-search-form">
	                            <form class="form-inline" onSubmit="return false;">
								  <div class="form-group">
								    <input type="text" style = "width:250px"  class="form-control" id="searchKeyword" placeholder="客户名/OPENID/证件号码/手机号">
								  </div>
								  <button id="bind_info_search_button" style="height:34px" class="btn btn-default" type="button"><i class="fa fa-search"></i></button>
								  <div class="form-group">
								   <select  style = "width:150px"  id="bindFlag" class="form-control">
	                            				<option value="">绑定状态</option>
                                                <option value="0">未绑定</option>
                                                <option value="1">已绑定</option>
                                  </select>
								  </div>
								</form>
								</div>
	                            </div>
								<div id="grid"></div>
								 <button type="button" id="lookSimple" class="btn btn-default">精简</button><button type="button" id="lookDetail" class="btn btn-default">详细</button>
								 <#include "${res.template.page}">
								<#if pageutil??>
									<@pageutil id=""></@pageutil>
								</#if>
                            </div>
                        </div>
                    </div>
                </div>
        </div>
</#macro>
<#include "${res.template.main}">