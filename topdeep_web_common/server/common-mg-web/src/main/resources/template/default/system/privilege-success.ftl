<#macro htmlhead>
<style>
    .toggle {
      height: 9px;
      width: 9px;
      display: inline-block;
    }
    .toggle.expand {
      background: url(${base}/static/skin/default/images/expand.gif) no-repeat center center;
    }
    .toggle.collapse {
      background: url(${base}/static/skin/default/images/collapse.gif) no-repeat center center;
    }
  </style>
</#macro>
<#macro jsimport>
	<script language="Javascript" src="${base}/static/js/system/privilegeManage.js?v=${res.version!''}"></script>
  	<script type="text/javascript">
  	  	$(function(){
		  	PrivilegeManage.initPage();
		})
  	
  	</script>
</#macro>
<#macro htmlbody>
<body>
	<div id="wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">${res.title!''}</h1>
			</div> <!-- /.col-lg-12 -->
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="form-group"><input type="button" value="初始化权限分组" id="init_group_button" class="btn btn-default" /></div>
			</div> <!-- /.col-lg-12 -->
		</div>
						
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-body">
					<div id="myGrid" class="myGrid"></div>
				</div>
			</div>
		</div>
	</div>
</body>
</#macro>
<#include "${res.template.main}">