<#macro htmlhead>
</#macro>
<#macro jsimport>
<script type="text/javascript" src="${base}/static/common/js/system/refreshCacheManage.js"></script>
<script type="text/javascript">
	$(function(){
		RefreshCacheManage.initPage();
	})
</script>
<style>
</style>
</#macro>
<#macro htmlbody>
<div id="wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">刷新缓存</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                        基金缓存
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
	                            <table
									class="table table-striped table-bordered table-hover"
									id="hy_cache_table">
									<thead>
										<tr>
											<th>服务器地址</th>
											<th>重新加载参数</th>
											<th>重新加载缓存</th>
											<!-- <th>解除绑定关系</th> -->
											<th>重新加载数据字典</th>
											<th>重新加载字典，缓存和参数</th>
										</tr>
									</thead>
									<tbody id="refreshList_tbody_table">
									</tbody>
								</table>
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
</#macro>
<#include "${res.template.main}">