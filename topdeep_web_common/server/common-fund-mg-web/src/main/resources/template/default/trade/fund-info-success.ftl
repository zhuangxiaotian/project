<#macro htmlhead>
</#macro>
<#macro jsimport>
<script src="${base}/static/common/js/trade/fundInfoManage.js?v=${res.version!''}"></script>
<script>
	$(function(){
		FundInfoManage.initPage();		
	})
	</script>
</#macro>

<#macro htmlbody>
       <div id="wrapper">
            <div class="row">
                <div class="col-lg-12">
                 <h1 class="page-header">基金信息管理</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           基金信息管理
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div>
                            <div style="margin-bottom:10px;">
	                            <div class="input-group custom-search-form col-xs-2">
	                                <input id="fundInfo_search_keyword" type="text" class="form-control" style="width:210px" placeholder="基金代码/基金简称/基金全称">
	                                <span class="input-group-btn ">
	                                <button id="fundInfo_search_keyword_button" class="btn btn-default " type="button">
	                                    <i class="fa fa-search"></i>
	                                </button>
	                                <input id = "creatFundInfo" type = "button" class="btn btn-default" target="_blank" data-target="#poptext" data-toggle="modal" value="新增" />
	                              </span>
	                               </div>
	                            </div>
								<div id="grid"  style = "height:461px"></div>
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
    <!-- /#wrapper -->

	<ul id="contextMenu" style="display:none;position:absolute">
	</ul>
<div class="modal fade" id="poptext" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" aria-hidden="false">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close"
                        data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    基金新增
                </h4>
            </div>
            <div class="modal-body">
<!---------------------主体区域------------------------------------>
<div data-role="page">
    
    <div data-role="content" class="container" role="main" >
        <ul class="content-reply-box mg10">
             <div class="input-group custom-search-form col-xs-5"  style="float:left; margin-right:5px;" id="fundInfoDetail">
                  <tr>
					    <td>基金代码:</td>
					    <td><input id ="fundCode_create" type="text" value="" class="form-control" placeholder="请输入基金代码"></td><br>
				   </tr>
				   <tr>
					    <td>基金简称:</td>
					    <td><input id ="fundName_create" type="text" value="" class="form-control" placeholder="请输入基金简称"></td><br>
				   </tr>
				   <tr>
					    <td>基金全称:</td>
					    <td><input id ="fundFullName_create" type="text" value="" class="form-control" placeholder="请输入基金全称"></td><br>
				   </tr>
				   <#if res.fundPropertyList??>
				   		<#list res.fundPropertyList as item>
				   		<tr>
						    <td>${item.propertyName}:</td>
						    <#if item.propertyType=="showincomerate">
						    </br><td>
						    	<select name="${item.propertyType}" class="fundPropertyListClass" id ="fund_${item.propertyType}"  value="" style="width:100%;height:34px;">
  									<option value="">请选择</option>
  									<option value="1">日涨跌</option>
 									<option value="2">近一个月涨跌</option>
  									<option value="3">近三个月涨跌</option>
  									<option value="4">近六个月涨跌</option>
  									<option value="5">近一年涨跌</option>
  									<option value="6">今年来涨跌</option>
  									<option value="7">成立以来涨跌</option>
								</select>
						    </td><br>
						    <#else>
						     <td><input id ="fund_${item.propertyType}" type="text" value="" name="${item.propertyType}" class="form-control fundPropertyListClass" placeholder="请输入${item.propertyName}"></td><br>
						    </#if>
				  		</tr>
				  		</#list>
				   </#if>
                </div>
                <input id ="fund_rowVersion" type="hidden" value="">
      </ul>
<!-----------------------/.主体区域-------------------------------------->
            </div><!--/.modal-->
            
            <div class="modal-footer">
                <button type="button" class="btn btn-default"
                        data-dismiss="modal">关闭
                </button>
                <button type="button" class="btn btn-default"
                     id = "commit"   data-dismiss="modal">保存
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!--/.modal fade-->
</#macro>
<#include "${res.template.main}">