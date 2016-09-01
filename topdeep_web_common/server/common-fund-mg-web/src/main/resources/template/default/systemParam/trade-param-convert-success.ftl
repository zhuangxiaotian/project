<#macro htmlhead>
</#macro>
<#macro jsimport>
<script src="${base}/static/common/js/systemParam/tradeParamConvertManage.js?v=${res.version!''}"></script>
<script>
	$(function(){
	var ParamType = [];
	   <#list res.typeList as item>	
       var obj = {};	
       obj.name = "${item.name}";	
       obj.value = "${item.value}";
       ParamType[ParamType.length] = obj;	
      </#list>
		TradeParamConvertManage.initPage(ParamType);		
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
                            交易参数转换
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                            <div style="margin-bottom:10px;">
	                            <div class="input-group custom-search-form col-xs-2">
	                                <input id="siteInfo_search_keyword" type="text" class="form-control" style="width:200px" placeholder="银行代码">
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


	<ul id="contextMenu" style="display:none;position:absolute">
	</ul>


</#macro>
<#include "${res.template.main}">