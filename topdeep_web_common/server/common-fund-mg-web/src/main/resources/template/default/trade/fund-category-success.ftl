<#macro htmlhead>
</#macro>
<#macro jsimport>
<script src="${base}/static/common/js/trade/fundCategoryManage.js"></script>
<script>
	$(function(){
		FundCategoryManage.initPage();		
	})
	</script>
</#macro>

<#macro htmlbody>
       <div id="wrapper">
		<div id="step1">
            <div class="row">
                <div class="col-lg-12">
                 <h1 class="page-header">基金分类管理</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           基金分类管理
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div>
                            <div style="margin-bottom:10px;">
	                            <div class="input-group custom-search-form col-xs-2">
	                                <input id="fundCategory_search_keyword" type="text" class="form-control" style="width:200px" placeholder="基金分类名称">
	                                <span class="input-group-btn ">
	                                <button id="fundCategory_search_keyword_button" class="btn btn-default " type="button">
	                                    <i class="fa fa-search"></i>
	                                </button>
	                                <input id = "creatFundCategory" type = "button" class="btn btn-default" target="_blank" data-target="#poptext" data-toggle="modal" value="新增" />
	                              </span>
	                               </div>
	                            </div>
								<div id="grid"  class="myGrid"></div>
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
        
        <div id="step2">
            <div class="row">
                <div class="col-lg-12">
                 <h1 class="page-header">基金分类下基金列表</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           基金分类下基金列表
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="dataTable_wrapper" style="overflow-x:auto;overflow-y:hidden;">
                            	<div style="margin-bottom:10px;">
	                            	<div class="input-group custom-search-form col-xs-2">
	                                	<span class="input-group-btn ">
		                                	<input id = "addFund" type = "button" style="margin-left:0px;border-radius:5px;" class="btn btn-default" target="_blank" data-target="#fundlistadd" data-toggle="modal" value="添加基金" />
	                              		</span>
	                              		<span class="input-group-btn ">
		                                	<input id = "gobackfundCategory" type = "button" style="margin-left:0px;border-radius:5px;" class="btn btn-default"  value="返回基金分类" />
	                              		</span>
	                           	 	</div>
	                            </div>
	                            <input id="currFundCategoryId" value="" type="hidden"/>
								<div id="grid1"  class="myGrid"></div>
								<#if pageutil??>
									<@pageutil id="1"></@pageutil>
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

    </div>
    <!-- /#wrapper -->
    
	<div class="modal fade" id="poptext" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="false">
    	<div class="modal-dialog">
        	<div class="modal-content">
            	<div class="modal-header">
                	<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    	&times;
                	</button>
                	<h4 class="modal-title" id="myModalLabel">
                    	基金分类新增
                	</h4>
            	</div>
            	<div class="modal-body">
					<div data-role="page">
    					<div data-role="content" class="container" role="main" style = "height:300px">
        					<ul class="content-reply-box mg10">
             					<div class="input-group custom-search-form col-xs-5"  style="float:left; margin-right:5px;">
                  					<tr>
					    				<td>基金分类名称:</td>
					    				<td><input id ="fundCategoryName_create" type="text" value="" class="form-control" placeholder="分类名称不能超过20个字符"><input id="categoryId" type="hidden" value=""/></td><br>
				    				</tr>
                				</div>
      						</ul>
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
		</div>
	</div>
<!--add-->
<div class="modal fade" id="fundlistadd" tabindex="-1" role="dialog"
    aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static" data-keyboard="false">
	<div class="modal-dialog">
		<div class="modal-content">
        	<div class="modal-header">
            	<h4 class="modal-title" id="">添加</h4>
            </div>
            <div id="wrapper">
            	<div class="row">
                	<div class="col-lg-12">
                    	<div class="panel panel-default">
                        	<div class="panel-body">
                            	<div class="dataTable_wrapper">
                             		<div id="grid2" style="width:565px;" class="myGrid"></div>
									<div id="page" >
									<#if pageutil??>
										<@pageutil id="2"></@pageutil>
									</#if>
                            	</div>
                            	<div class="modal-footer" id="removeButton">
                            		<input type='button'  class='btn btn-default' value="添加" id="addSelectedFund"></input>
                             		<input type='button'  class='btn btn-default' data-dismiss="modal" value="关闭"></input>
                        		</div>
                    		</div>
                		</div>
		            </div>
		        </div>
		    </div>
            
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div><!--/.div-->
</#macro>
<#include "${res.template.main}">