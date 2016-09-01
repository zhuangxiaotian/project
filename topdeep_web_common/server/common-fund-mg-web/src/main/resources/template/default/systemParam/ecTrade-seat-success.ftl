<#macro htmlhead>
</#macro>
<#macro jsimport>
<script src="${base}/static/common/js/systemParam/ecTradeSeatManage.js?v=${res.version!''}"></script>
<script>
	$(function(){
		EcTradeSeatManage.initPage();		
	})
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
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            直销交易渠道管理
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                            <div style="margin-bottom:10px;">
	                            <div class="input-group custom-search-form col-xs-2">
	                                <input id="siteInfo_search_keyword" type="text" class="form-control" style="width:200px" placeholder="支付渠道名称/银行名称">
	                                <span class="input-group-btn ">
	                                <button id="siteInfo_search_keyword_button" class="btn btn-default " type="button">
	                                    <i class="fa fa-search"></i>
	                                </button>
	                              </span>
	                               </div>
	                            </div>
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
            </div>
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    <!-- /#wrapper -->

	<ul id="contextMenu" style="display:none;position:absolute">
	  <b>设置状态:</b>
	  <li data="0">禁止</li>
	  <li data="1">激活</li>
	</ul>
   <ul id="contextMenu1" style="display:none;position:absolute">
	  <b>设置状态:</b>
	  <li data="1">代扣</li>
	</ul>
	<ul id="contextMenu2" style="display:none;position:absolute">
	  <b>是否支持定投:</b>
	  <li data="0">否</li>
	  <li data="1">是</li>
	</ul>
	<ul id="contextMenu3" style="display:none;position:absolute">
	  <b>是否支持快捷支付:</b>
	  <li data="0">否</li>
	  <li data="1">是</li>
	</ul>
</#macro>
<#include "${res.template.main}">