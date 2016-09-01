<#macro htmlhead>
</#macro>
<#macro jsimport>
<script type="text/javascript" src="${base}/static/common/js/client/clientVersionManage.js"></script>
<script type="text/javascript">
	$(function(){
		ClientVersionManage.initPage();
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
                    <h1 class="page-header">客户端版本管理</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                        管理客户端版本
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                            <div style="margin-bottom:10px;">
	                            <div class="input-group custom-search-form col-xs-2">
	                                <input id="searchKeyword" type="text" style="width:200px" class="form-control" placeholder="客户端版本/客户端类型">
	                                <span class="input-group-btn">
	                                <button id="client_version_search_button" style="height:34px" class="btn btn-default" type="button">
	                                    <i class="fa fa-search"></i>
	                                </button>
	                            </span>
	                            </div>
	                            </div>
								<div id="grid"></div>
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
    </div>
     <ul class="clientType" id="contextMenu" style="display:none;position:absolute">
	  <b>客户端类型:</b>
	  <li data="iphone">iphone</li>
	 <li data="android">android</li>
	</ul>
	 <ul class="clientState" id="contextMenu" style="display:none;position:absolute">
	  <b>客户端状态:</b>
	  <li data="0">版本最新,允许运行</li>
	 <li data="1">版本已旧,允许运行</li>
	 <li data="2">版本已旧,禁止运行</li>
	</ul>
</#macro>
<#include "${res.template.main}">