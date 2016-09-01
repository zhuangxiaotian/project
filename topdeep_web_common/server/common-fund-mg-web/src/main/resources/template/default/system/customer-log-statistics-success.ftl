<#macro htmlhead>
</#macro>
<#macro jsimport>
<script src="${base}/static/common/js/systemParam/customerLogStatistics.js"></script>
<script>
	$(function(){
		CustomerLogStatistics.initPage();		
	})
	</script>
	<style>
    table.gridtable {
	  font-family: verdana,arial,sans-serif;
	  font-size: 14px;
	  color: #333333;
	  border-width: 1px;
	  border-color: #666666;
	  border-collapse: collapse;
}
 table.gridtable th {
		border-width: 1px;
		padding: 8px;
		border-style: solid;
		border-color: #666666;
		width:280px;
		background-color: #dedede;
       }	
      table.gridtable td {	
	      border-width: 1px;	
	       padding: 8px;	
	      border-style: solid;	
	      border-color: #666666;	
	     width:280px;	
	     background-color: #ffffff;	
      }
  </style>
</#macro>

<#macro htmlbody>
       <div id="wrapper">
            <div class="row">
                <div class="col-lg-12">
                 <h1 class="page-header">数据统计分析</h1>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           数据统计分析
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="dataTable_wrapper" style="overflow-x:auto;overflow-y:hidden;">
                            <div style="margin-bottom:10px;">
	                            </div>
								<table style="width:100%" id="customerLogs" class="gridtable">
								</table>
                            </div>
	                        <div>
	                            <button type="button" id="export" class="btn btn-default" style="padding:6px 35px" >导出</button>
	                        </div>
                        </div>
                    </div>
                </div>
            </div>
    </div>
</#macro>
<#include "${res.template.main}">