<#macro htmlhead>
<style>
#grid {
    height:351px;
}
</style>
</#macro>
<#macro jsimport>
	<script src="${base}/static/common/js/system/systemConfigManage.js"></script>
	<script>
		SystemConfigManage.initPage();
	</script>
</#macro>
<#macro htmlbody>
<div id="wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header"> 参数设置</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            参数设置
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                          <div class="dataTable_wrapper">
      							<div class="row">
        							<div class="col-md-3" >
          								<div class="input-group">
            								<input id = "param_keyword_search" type="text" class="form-control" placeholder="参数名称/参数说明">
                    						<span class="input-group-btn">
                      							<button id = "param_keyword_search_button" class="btn btn-default form-control" type="button">
	                                    <i class="fa fa-search"></i>
	                                </button>
                    						</span>
          								</div>
        							</div>
      							</div>
      							 <div id="grid"></div>
        					<#include "${res.template.page}">
						<#if pageutil??>
							<@pageutil id=""></@pageutil>
						</#if>
    					   </div>
    				   </div>
    			   </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            </div>
</#macro>

<#include "${res.template.main}">
