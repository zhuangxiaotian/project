<#macro htmlhead>
</#macro>
<#macro jsimport>
<script type="text/javascript" src="${base}/static/common/js/system/baseInfoManage.js?v=${res.version!''}"></script>
<script type="text/javascript">
	$(function(){
		var baseInfoEditInfo = {};
		baseInfoEditInfo.codeTypeId = "${res.editInfo.codeTypeId}";
		baseInfoEditInfo.codeTypeName = "${res.editInfo.codeTypeName}";
		baseInfoEditInfo.codeIdParamType = "${res.editInfo.codeIdParamType}";
		baseInfoEditInfo.codeNameParamType = "${res.editInfo.codeNameParamType}";
		baseInfoEditInfo.codeDescParamType = "${res.editInfo.codeDescParamType}";
		baseInfoEditInfo.editType = "${res.editInfo.editType}";
		baseInfoEditInfo.codeTypeDescName = "${res.editInfo.codeTypeDescName}";
		
		var baseInfoTypeList = [];
		var obj;
		<#list res.baseInfoTypeList as item>
			obj = {};
			obj.codeId = "${item.codeId}";
			obj.codeName = "${item.codeName}";
			obj.codeDesc = "${item.codeDesc!''}";
			baseInfoTypeList[baseInfoTypeList.length] = obj;
		</#list>
		
		var customPriList = [];
		var priObj;	
		<#list res.customPrivilegeList as item>
			priObj = {};
			priObj.txt = "${item.name}";
			priObj.ID = "${item.value}";
			customPriList[customPriList.length] = priObj;
		</#list>
		
		BaseInfoManage.initPage(baseInfoEditInfo, baseInfoTypeList, customPriList);
	})
</script>
</#macro>

<#macro htmlbody>
    <div id="wrapper">
            <div class="row">
                <div class="col-lg-12"> 
                 <h1 class="page-header">${res.editInfo.codeTypeName!''}管理</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row"> 
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            ${res.editInfo.codeTypeName!''}管理
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div>
                            <div style="margin-bottom:10px;">
	                            <div class="input-group custom-search-form col-xs-2">
	                                <input id="baseInfo_search_keyword" type="text" class="form-control" style="width:300px" placeholder="${res.editInfo.codeTypeName!''}编号/${res.editInfo.codeTypeName!''}名称">
	                                <span class="input-group-btn ">
	                                <button id="baseInfo_search_keyword_button" class="btn btn-default " type="button">
	                                    <i class="fa fa-search"></i>
	                                </button>
	                              </span>
	                              <span class="input-group-btn ">	
                                  <select name="wpType_cre" id="baseType_selected" class="btn btn-default" style="margin-right:10px;display:none"></select>
                                    </span>
	                               </div>
	                            </div>
								<div id="grid"  style = "height:461px"></div>
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
</#macro>
<#include "${res.template.main}">