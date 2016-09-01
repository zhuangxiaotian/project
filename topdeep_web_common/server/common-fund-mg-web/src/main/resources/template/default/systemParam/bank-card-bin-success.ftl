<#macro htmlhead>
</#macro>
<#macro jsimport>
<script type="text/javascript" src="${base}/static/common/js/systemParam/bankCardBinManage.js"></script>
<script src="${base}/static/common/js/common/ajaxfileupload.js"></script>	
<script type="text/javascript">
	$(function(){
		BankCardBinManage.initPage();
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
                    <h1 class="page-header">银行卡Bin管理</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                        银行卡Bin管理
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                        <div style="clear:both; margin-bottom:10px;overflow:hidden;">
                            <div class="input-group custom-search-form col-xs-4"  style="float:left; margin-right:10px;">
	                                <input id="searchKeyword"  type="text" class="form-control" placeholder="卡Bin/银行代码">
	                                <span class="input-group-btn">
	                                <button id="bin_search_button" class="btn btn-default form-control" type="button">
	                                    <i class="fa fa-search"></i>
	                                </button>
	                            	</span>
	                            </div>
	                             <span style="float:right;" id = "chooseType">
          导入如重复:<input id = "pass" type="checkBox" value="" />跳过<input id = "overWrite" type="checkBox" value=""/>覆盖
          </span>
           <div id = "uploadImage" style="float:right;margin-right:10px;width:60px">
	                                <form id="form" method="post" action="${base}/system/bankCardBinManage!ajaxUpload.action" enctype="multipart/form-data" httpMethod="post">
				<button id="fileBrother" class="btn btn-default" type="button"  onclick="fileToUpload.click();" >
					<span class="msg-title1">导入</span>
					<input  type="file" id="fileToUpload" name="file" onchange = "BankCardBinManage.ajaxResourceAdd();" style="position:absolute; filter:alpha(opacity=0); opacity:0; width:30px; " size="1" multiple/></button>
				</button>
          </form>
	                            </div>
	                             <span  style="float:right;margin-right:10px;width:80px"><button id="down_load_button1" class="btn btn-default" type="button">下载模板</button></span>
	                            </div>
								<div id="grid"></div>
								 <#include "${res.template.page}">
								<#if pageutil??>
									<@pageutil id=""></@pageutil>
								</#if>
                            </div>
                        </div>
                    </div>
                </div>
        </div>
</#macro>
<#include "${res.template.main}">