<#macro htmlhead>
<style>
#grid {
    height:351px;
}
</style>
</#macro>
<#macro jsimport>
	<script src="${base}/static/common/js/system/customerMessageManage.js"></script>
	<script>
		CustomerMessageManage.initPage();
	</script>
</#macro>
<#macro htmlbody>
<div id="wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">客户留言管理</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            客户留言管理
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                          <div class="dataTable_wrapper">
                          <div class="row">
					<div class="col-lg-12">
						<form role="form" class="form-inline">
						<input type="hidden" id="funcType"/>
						<div class="form-group">
									<input id = "param_keyword_search" type="text" class="form-control" style="width:330px" placeholder="标题/留言内容/姓名/客户号/手机/回复人姓名">
							</div>
							<div class="form-group">
								<select id="replyState" name = "replyState" class="form-control selector">
									<option value="" selected="selected">全部</option>
                               <option value="0">未回复</option>
									<option value="1">已回复</option>
								</select>
							</div>
							<div class="form-group">
								<select id="aduitState" name = "aduitState" class="form-control selector">
									<option value="" selected="selected">全部</option>
									<option value="0">未审核</option>
									<option value="1">已审核</option>
							    </select>
							</div>
							<div class="form-group" style="text-align: left;">
								<button id = "message_keyword_search_button" class="btn btn-default form-control" type="button">
	                                    <i class="fa fa-search"></i>
	                                </button>
							</div>
						</form>
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
