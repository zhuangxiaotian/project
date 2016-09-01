<#macro htmlhead>
</#macro>
<#macro jsimport>
<script src="${base}/static/common/js/notice/noticeManage.js?v=${res.version!''}"></script>
<script src="${base}/static/common/skin/js/jquery/jquery.datetimepicker.js?v=${res.version!''}"></script>
<link rel="stylesheet" type="text/css" href="${base}/static/common/skin/css/jquery/jquery.datetimepicker.css"/ >

<script>
	$(function(){
		NoticeManage.initPage();
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
                            公告通知管理
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                            <div style="margin-bottom:10px;">
	                            <div class="input-group custom-search-form col-xs-2">
	                                <input id="siteInfo_search_keyword" type="text" class="form-control" style="width:200px" placeholder="标题">
	                                <span class="input-group-btn ">
	                                <button id="siteInfo_search_keyword_button" class="btn btn-default " type="button">
	                                    <i class="fa fa-search"></i>
	                                </button>
	                              </span>
	                               </div>
	                            </div>
								<div id="myGrid" class="myGrid"></div>
								<button class="btn btn-default" id="changeAuditState">批量审核</button>
								<button class="btn btn-default" id="removeAuditState">反审核</button>
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
	  <b>设置消息类型:</b>
	  <li data="1">交易消息</li>
	  <li data="2">系统消息</li>
	</ul>
</#macro>
<#include "${res.template.main}">