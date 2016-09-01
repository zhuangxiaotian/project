var RolesManage = {};
RolesManage.val = "0";// 用户状态值
RolesManage.privileges = "";
RolesManage.deleteFlag = "";
// 路径
RolesManage.PageUtil;
RolesManage.contextPath = contextPath;

RolesManage.ajaxQueryRoles = function(pageIndex) {
	$("#roles_list_table").show();
	$.ajax({
				type : "POST",
				url : RolesManage.contextPath
						+ "/system/rolesManage!ajaxQuery.action",
				data : {
					"pageIndex" : pageIndex
				},
				datatype : "json",
				contentType : "application/x-www-form-urlencoded; charset=utf-8",
				success : function(result) {
					try {
						if (!result.success) {
							alert(result.tipMessage);
						} else {
							if (!result.roles) {
								$("#roles_tbody_table").html("");
								var trHtml = "<tr >"
										+ "<td colspan='13'>角色列表为空</td>	"
										+ "</tr>";
								$("#roles_tbody_table").append(trHtml);
							} else if (0 == result.roles.length) {
								$("#roles_tbody_table").html("");
								var trHtml = "<tr >"
										+ "<td colspan='7'>角色列表为空</td>	"
										+ "</tr>";
								$("#roles_tbody_table").append(trHtml);
							} else {
								var rolesId = 1
								$("#roles_tbody_table").html("");
								for ( var i = 0; i < result.roles.length; i++) {
									var item = result.roles[i];

									var trHtml = "<tr >"
											+ "<td><input type='checkbox' name='roles_delete' value="
											+ item.id + "></input></td>"
											+ "<td>" + item.name + "</td>";
									if (item.state == "1") {
										trHtml += "<td>激活</td>";
									} else {
										trHtml += "<td>禁止</td>";
									}
									trHtml += "<td>" + item.memo + "</td>";
									trHtml = trHtml
											+ "<td><input  class='btn btn-sm btn-default' data-toggle='modal' data-target='#myModal' id= 'roles_update_"
											+ rolesId
											+ "' type='button' value = '修改'/></td>"
											+ "</tr>";

									trHtml = trHtml.replace(/null/g, "");
									$("#roles_tbody_table").append(trHtml);

									RolesManage
											.rolesItemClick(rolesId, item);
									rolesId = rolesId + 1;
								}

							}
							RolesManage.PageUtil.pageData = result.pageData;
							RolesManage.PageUtil.refreshPage();
							RolesManage.rolesDeleteClick(result);
						}
					} catch (e) {
						alert("获取用户列表失败");
					}
				},
				error : function() {
				}
			});
};

RolesManage.rolesDeleteClick = function(result) {
	$("#delete").bind("click", function() {
		RolesManage.chooseDelete(result)
	});
};

RolesManage.ajaxQueryOperators = function(roleNames, roleids, roleidArr) {
	$.ajax({
		type : "POST",
		async : false,
		url : RolesManage.contextPath
				+ "/system/rolesManage!ajaxOperatorsQuery.action",
		data : {
			"roleId" : roleidArr
		},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (!result.success) {
					alert(result.tipMessage);
					RolesManage.deleteFlag = false;
				} else {
					if (result.couldBeDeleted) {
						RolesManage.deleteFlag = true;
						if (!RolesManage.deleteFlag) {
							return;
						}
						var result = confirm('是否删除！');
						if (result) {
							var id = ""
							$('input[name="roles_delete"]:checked').each(function() {
								id = id + $(this).val() + " ";

							});
							RolesManage.beginDelete(id);
						}
					} else {
						for (i = 0; i < roleids.length; i++) {
							if (roleids[i] == result.roleId) {
								alert("角色“" + roleNames[i] + "“有用户正在使用");
								RolesManage.deleteFlag = false;
								return;
							}
						}
					}

				}
			} catch (e) {
				alert(e);
			}
		},
		error : function() {
			RolesManage.deleteFlag = false;
		}
	});
};

RolesManage.chooseDelete = function(result) {
	var flag = "";
	var name = [];
	var roleids = [];
	var roleidArr = "";
	$('input[name="roles_delete"]:checked').each(function() {
		flag = flag + $(this).val() + " ";
		for ( var i = 0; i < result.roles.length; i++) {
			var item = result.roles[i];
			if (item.id == $(this).val()) {
				roleidArr = roleidArr + item.id + ",";
				name.push(item.name);
				roleids.push(item.id);
			}
		}
	});

	if (flag == "") {
		alert("请选择删除项");
		return false;
	}

	RolesManage.ajaxQueryOperators(name, roleids, roleidArr);
};

RolesManage.beginDelete = function(object) {

	RolesManage.ajaxDeleteRoles(object);
}

RolesManage.chooseDisableState = function() {
	RolesManage.chooseUpdateState("0");
}

RolesManage.chooseRestoreState = function() {
	RolesManage.chooseUpdateState("1");
}

RolesManage.chooseUpdateState = function(newState) {

	var id = ""
	$('input[name="roles_delete"]:checked').each(function() {
		id = id + $(this).val() + ",";

	});
	if ("" == id) {
		alert("请选择更新项");
		return;
	}
	RolesManage.ajaxUpdateStateRoles(id, newState);
};

RolesManage.createRoles = function() {

	$("#myModalLabel").html("角色新增");
	$("#update_roles_button").hide();
	$("#create_roles_button").show();
	Privilege.ajaxQueryPrivilegeList(0, 0);
	$('#editForm')[0].reset();
	$('label.error').hide();

	if ($("#privilegeFieldset").is(":visible")) {
		$("#privilegeFieldsetToggle").val('收缩');
	} else {
		$('#privilegeFieldset').slideDown();
		$("#privilegeFieldsetToggle").val('收缩');
	}
}

RolesManage.rolesItemClick = function(rolesId, item) {
	$("#" + "roles_delete_" + rolesId).bind("click", function() {
		RolesManage.ajaxDeleteRoles(item);
	});

	$("#" + "roles_update_" + rolesId).bind("click", function() {
		$("#myModalLabel").html("角色修改");
		$("#update_roles_button").show();
		$("#create_roles_button").hide();
		$('#editForm')[0].reset();
		$('label.error').hide();
		RolesManage.updateRoles(item);

		if ($("#privilegeFieldset").is(":visible")) {
			$("#privilegeFieldsetToggle").val('收缩');
		} else {
			$('#privilegeFieldset').slideDown();
			$("#privilegeFieldsetToggle").val('收缩');
		}
	});
	$("#" + "roles_" + item.rolesId).bind(
			"click",
			function() {
				var _this = $("#" + "roles_" + item.rolesId);
				_this.attr("disable", false);
				var roleState = "";
				if ("1" == item.RoleState) {
					roleState = "0"
				} else {
					roleState = "1"
				}
				RolesManage.updateRoles(item.roleId, item.roleMemo,
						item.roleName, item.rolePrivileges, roleState);
			});
};

RolesManage.ajaxUpdateStateRoles = function(ids, newState) {

	$.ajax({
		type : "POST",
		url : RolesManage.contextPath
				+ "/system/rolesManage!ajaxUpdateState.action",
		data : {
			"ids" : ids,
			"newState" : newState
		},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (!result.success) {
					alert(result.tipMessage);
				} else {
					RolesManage.ajaxQueryRoles();
					alert("操作成功");
				}
			} catch (e) {
				alert(e);
			}
		},
		error : function() {
			alert("请求失败，请检查服务是否启动！");
		}
	});
};

RolesManage.ajaxUpdateRoles = function() {
	$.ajax({
		type : "POST",
		url : RolesManage.contextPath
				+ "/system/rolesManage!ajaxUpdate.action",
		data : $("#editForm").serialize(),
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			$("#closeBtn").click();
			try {
				if (!result.success) {
					alert(result.tipMessage);
				} else {
					RolesManage.ajaxQueryRoles();
				}
			} catch (e) {
				alert(e.message);
			}
		},
		error : function() {
			alert("修改失败");
		}
	});
};

RolesManage.updateRoles = function(item) {

	Privilege.ajaxQueryPrivilegeList(0, item.id);

	// $("#roles_list_table").hide();
	$("#privileges").val(item.privileges);
	$("#privileges_c").val(item.privileges);

	RolesManage.privileges = "";
	RolesManage.privileges = item.privileges;
	$("#roleId_update").val(item.id);
	$("#roleMemo_update").val(item.memo);
	$("#roleName_update").val(item.name);
	$("#roleState_update").val(item.state);
	$("#roleVersion_update").val(item.rowVersion);
	// $("#roles_update_table").show();
};

RolesManage.ajaxDeleteRoles = function(id) {

	$.ajax({
		type : "POST",
		url : RolesManage.contextPath
				+ "/system/rolesManage!ajaxsDelete.action",
		data : {
			"id" : id
		},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (!result.success) {
					alert(result.tipMessage);
				} else {
					RolesManage.ajaxQueryRoles();
					alert("删除成功");
				}
			} catch (e) {
				alert(e.message);
			}
		},
		error : function() {
			alert("删除失败");
		}
	});
};

RolesManage.ajaxCreateRoles = function() {// 创建用户

	if ($('#roleName_update').val().trim() == "") {
		alert("角色名称必须输入！");
		return;
	} else {
		var operateSelectValue = "";
		$("input[name='operateSelectValue']:checked").each(function() {
			if ("" != operateSelectValue) {
				operateSelectValue += ",";
			}
			operateSelectValue += $(this).val();
		});
		$.ajax({
			type : "POST",
			url : RolesManage.contextPath
					+ "/system/rolesManage!ajaxCreate.action",
			// data:$("#editForm").serialize(),
			data : {
				"role.memo" : $("#roleMemo_update").val(),
				"role.name" : $("#roleName_update").val(),
				"operateSelectValue" : operateSelectValue
			},
			datatype : "json",
			contentType : "application/x-www-form-urlencoded; charset=utf-8",
			success : function(result) {
				$("#closeBtn").click();
				try {
					if (!result.success) {
						alert(result.tipMessage);
					} else {
						window.location.reload();
					}
				} catch (e) {
					alert(e.message);
				}
			},
			error : function() {
				alert("创建失败");
			}
		});
	}
};

RolesManage.groupItemClick = function(groupId, item) {
	$("#group" + groupId).click(function() {
		if (this.checked) {
			$("input[name='" + item.codeId + "']").each(function() {
				this.checked = true;
			});
		} else {
			$("input[name='" + item.codeId + "']").attr("checked", false);
		}
	});
}

RolesManage.show = function(parm, show) {// 权限自动勾选
	if (parm != "") {
		var array = parm.replace(/^\s+|\s+$/g, "").split(",");
		for ( var i = 0; i < array.length; i++) {
			var val = array[i];
			$("input:checkbox[value=" + val + "]").attr('checked', 'true');
		}
	} else if (show != "") {
		var array = show.replace(/^\s+|\s+$/g, "").split(",");
		for ( var i = 0; i < array.length; i++) {
			var val = array[i];
			$("input:checkbox[value=" + val + "]").attr('checked', 'true');
		}

	}
};

// 初始化
RolesManage.initPage = function() {
	RolesManage.PageUtil = new TopdeepUtil.pageUtil(null,RolesManage.ajaxQueryRoles,"");
	RolesManage.PageUtil.initPage();
	RolesManage.ajaxQueryRoles(0);
	$("#all_list_check").click(function() {
		if (this.checked) {
			$("input[name='roles_delete']").each(function() {
				this.checked = true;
			});
		} else {
			$("input[name='roles_delete']").attr("checked", false);
		}
	});

	$("#update_roles_button").bind("click", function() {

		if ($('#roleName_update').val().trim() == "") {
			alert("角色名称必须输入！");
			return;
		}
		RolesManage.ajaxUpdateRoles();

	});

};
