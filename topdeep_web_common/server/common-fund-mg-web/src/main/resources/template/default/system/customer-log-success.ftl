<#macro htmlhead>
</#macro>
<#macro jsimport>
<script type="text/javascript" src="${base}/static/common/js/systemParam/customerLogManage.js"></script>
<script type="text/javascript">
	$(function(){
	var typeList = [];
		<#list idTypes as item>
			var obj = {};
			obj.name = "${item.codeId}";
			obj.value = "${item.codeName}";
			typeList[typeList.length] = obj;
		</#list>
		CustomerLogManage.initPage(typeList);
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
                    <h1 class="page-header">用户操作日志查询</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                       查询用户关键操作日志
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
	                            <div class="input-group custom-search-form">
	                            <form onSubmit="return false;" class="form-inline">
								  <div class="form-group">
								    <input type="text" class="form-control" id="searchKeyword" placeholder="客户编号/证件号/参数...">
								  </div>
								  <button  id="customer_log_search_button" style="height:34px;" class="btn btn-default"><i class="fa fa-search"></i></button>
								</form>
								</div>
	                            </div>
								<div style="margin-top:10px" id="grid"></div>
								<button type="button" id="exportCurrentPage" class="btn btn-default">导出该页</button><button type="button" id="exportAll" class="btn btn-default">导出全部</button>
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
        <!-- /#page-wrapper -->

    </div>
</#macro>
<#include "${res.template.main}">