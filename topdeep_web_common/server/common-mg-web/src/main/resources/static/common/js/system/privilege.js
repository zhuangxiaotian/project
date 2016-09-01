var Privilege = {};

Privilege.contextPath = contextPath;

//初始化
Privilege.initPage = function(){
	 $("#privilegeFieldsetToggle").click(function(){
			$('#privilegeFieldset').toggle();
		    if ($("#privilegeFieldset").is(":visible")) {
		        $(this).val('收缩');
		    } else {
		        $(this).val('展开');
		    }
		    return false;
	 });
};

Privilege.ajaxQueryPrivilegeList = function(operatorId, roleId){
	///优先操作员ID，否则使用RoleId
	
	$.ajax({
		type:"POST",
		url:Privilege.contextPath + "/system/ajaxQueryPrivilegeList.action",
		data:{"operatorId": operatorId, "roleId": roleId},
		datatype:"json",
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		success:function(result){
			try{
				if(result.success){
					Privilege.generatePrivilegeGroup(result.privilegeGroupList);
					if(!$("#privilegeFieldset").is(":visible")){
						$("#privilegeFieldsetToggle").click();
					}
				}else{
					alert(result.tipMessage);
				}
			}catch(e){
					alert("获取用户列表失败: "+e.message);
			}
		},
		error:function(e){
			console.log(e);
		}
	});
};

Privilege.generatePrivilegeGroup = function(privilegeGroupList){
	var $privilegeTable = $("#privilegeTable");
	$privilegeTable.empty();
	var html = "";
	for(var i=0;i<privilegeGroupList.length;i++){
		var group = privilegeGroupList[i];
		$privilegeTable.append('<tr><td style="text-align:center;" colspan="6">'+group.groupName+'</td></tr>');
		html = '<tr  bgcolor="#D8DCDF"><td><input type="checkbox" class="selectGroup privilegeCheckBox" group="'+i+'"/>全部选择</td>';
		for(var k=0;k<5;k++){
			html += '<td><input type="checkbox" class="selectOneOperate privilegeCheckBox" group="'+i+'" oper="'+k+'"/></td>';
		}
		html += '</tr>';
		$privilegeTable.append(html);
		for(var j=0;j<group.privilegeList.length;j++){
			var privilege = group.privilegeList[j];
			html = '<tr><td>'+privilege.privilegeName+'</td>';
			for(var k=0;k<privilege.operateList.length;k++){
				html += '<td><input type="checkbox" class="privilegeCheckBox" value="'+privilege.operateList[k].operateValue+'" name="operateSelectValue" ';
				if(privilege.operateList[k].operateEnabled){
					html += ' group="'+i+'" oper="'+k+'"  ';
					if(privilege.operateList[k].hasPrivilege){
						html += ' checked="checked" ';
					}
				}else{
					html += ' disabled="disabled" ';
				}
				html += '/></td>';
			}
			html += '</tr>';
			$privilegeTable.append(html);
		}
	}
	
	//deal event
	$(document).on("click", ".selectGroup", function() {
		$("input[group="+$(this).attr("group")+"]").prop("checked",$(this).is(":checked"));	
	});
	
	$(document).on("click", ".selectOneOperate", function() {
		$("input[group="+$(this).attr("group")+"][oper="+$(this).attr("oper")+"]").prop("checked",$(this).is(":checked"));
	});

}

