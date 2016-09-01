var AdminManage = {};

AdminManage.grid = null;
AdminManage.gridData = [];
AdminManage.pageUtil;
// 页面初始化方法
AdminManage.initPage = function() {
	AdminManage.initSlickGrid();
	AdminManage.pageUtil = new TopdeepUtil.pageUtil(null,AdminManage.ajaxQuery,"");
	AdminManage.pageUtil.initPage();
	AdminManage.ajaxQuery("0");
	
	$("#contextMenu").click(function(e) {
		if (!$(e.target).is("li")) {
			return;
		}
		if (!AdminManage.grid.getEditorLock().commitCurrentEdit()) {
			return;
		}
		var row = $(this).data("row");
		if (row == AdminManage.gridData.length) {
			AdminManage.gridData[row] = {};
		}
		AdminManage.gridData[row].state = $(e.target).attr("data");
		AdminManage.gridData[row].changed = true;
		AdminManage.grid.updateRow(row);

		$("#contextMenu").hide();
	});

	$(document).on("click", "#commitRow", function() {
		var row = $(this).attr("row");
		var item = AdminManage.gridData[row];
		if (AdminManage.check(item)) {
			AdminManage.ajaxSave(AdminManage.gridData[row], row);
		}
		return false;
	});

	$(document).on("click", ".deleteRow", function() {
		var row = $(this).attr("row");
		AdminManage.ajaxDelete(row);
		return false;
	});

	$("#operator_search_keyword_button").click(function() {
		AdminManage.ajaxQuery(0);
	});

	$(document).on("click", "#setRoles", function() {
		var row = $(this).attr("row");
		var item = AdminManage.gridData[row];
		$("#currentSelectedAdmin").val(item.id);
		AdminManage.ajaxQueryAdminRoles(item.id);
	})
	
	$(document).on("click","input:checkbox[name='selectAll']",function(){
		$("input:checkbox[name='rolecheckbox']").prop("checked",$(this).prop("checked"));
	})
	
	$("#confirmRoles").click(function(){
		var roleIds = "";
		$("input:checkbox[name='rolecheckbox']").each(function(){
			if($(this).prop("checked")){
				roleIds+=$(this).val()+",";
			}
		})
		AdminManage.ajaxAdminRolesSave(roleIds);
	})
	
}

AdminManage.check = function(item) {
	if (item.name == undefined || item.name == "") {
		alert("操作员名称不能为空");
		return false;
	}
	if (item.loginName == undefined || item.loginName == "") {
		alert("登录名不能为空");
		return false;
		}else{
			if(item.loginName.length<5){
				alert("登录名过短");
				return false;
			}
		}
	
	if (item.state == "" || item.state == undefined) {
		alert("状态没有选择");
		return false
	}
	;
	if (item.mobileTelephone == 0) {
		alert('移动电话号码不能为空');
		return false;
	}
	var myreg = /^1\d{10}$/;
	if (!myreg.test(item.mobileTelephone)) {
		alert('移动电话号码格式不对');
		item.mobileTelephone = "";
		return false;
	}
	if (item.loginEmail == "") {
		alert('邮箱不能为空');
		return false;
	}
	var reg = /^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/;
	if (!reg.test(item.loginEmail)) {
		alert("邮箱格式错误");
		item.loginEmail = "";
		return false;
	}

	return true;
}

// ajax提交角色修改
AdminManage.ajaxSave = function(obj, row) {
	var admin = AdminManage.gridData[row];
	if(admin.loginPass!=""&&admin.loginPass!=undefined){
		admin.loginPass = $.md5(admin.loginPass);
	}
	$.ajax({
		type : "POST",
		url : contextPath + "/system/adminManage!ajaxSave.action",
		data : JSON.stringify({
			"admin" : admin
		}),
		datatype : "json",
		contentType : 'application/json;charset=UTF-8',
		success : function(result) {
			try {
				if (result.success) {
					if (row) {
						obj.changed = false;
						obj.isNew = false;
						AdminManage.grid.updateRow(row);
					}
					alert("保存成功!");
					AdminManage.ajaxQuery("0");
				} else {
					alert(result.tipMessage);
				}
			} catch (e) {
				alert("保存失败: " + e.message);
			}
		},
		error : function() {
			alert("保存失败");
		}
	});
}


// ajax查询管理员信息
AdminManage.ajaxQuery = function(pageIndex) {
	var searchKeyword = $("#operator_search_keyword").val();
	$.ajax({
		type : "POST",
		url : contextPath
				+ "/system/adminManage!ajaxQuery.action",
		data : {
			"searchKeyword" : searchKeyword,
			"pageIndex" : pageIndex
		},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (result.success) {
					AdminManage.gridData = result.adminList;
					AdminManage.grid.setData(AdminManage.gridData);
					AdminManage.grid.render();
					AdminManage.pageUtil.pageData = result.pageData;
					AdminManage.pageUtil.refreshPage();
				} else {
					alert(result.tipMessage);
				}
			} catch (e) {
				alert("获取人员列表失败!e: " + e);
			}

		},
		error : function() {
			alert("获取人员列表失败!");
		}
	});
}

AdminManage.ajaxQueryAdminRoles = function(id) {
	$("#rolesList").html("");
	$.ajax({type : "POST",
		url : contextPath
				+ "/system/adminManage!ajaxQueryAdminRoles.action",
		data : {"admin.id":id},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (result.success) {
					if(result.rolesList !=null && result.rolesList.length > 0){
						var rolesHtml = "<div class='form-group input-group'>"
											+"<span class='input-group-addon'>选择角色</span>"
										+"</div>"
										+"<div class='form-group input-group'>"
											+"<input type='text' class='form-control' readonly style='background:white'value='全选'>"
											+"<span class='input-group-addon'><input name='selectAll' type='checkbox' value='************************'/></span>"
										+"</div>";
						
						for(var i=0;i<result.rolesList.length;i++){
							rolesHtml += "<div class='form-group input-group'>"
	                            			+"<input type='text' class='form-control' readonly style='background:white'value='"+result.rolesList[i].name+"'>"
	                            			+"<span class='input-group-addon'><input name='rolecheckbox' type='checkbox' value='"+result.rolesList[i].id+"'/></span>"
	                            		+"</div>"
						}
						$("#rolesList").html(rolesHtml);
						$("input:checkbox[name='rolecheckbox']").prop("checked",false);
						$("input:checkbox[name='rolecheckbox']").each(function(){
							for(var i=0;i<result.adminRoles.length;i++){
								if($(this).val()==result.adminRoles[i].rolesId){
									$(this).prop("checked",true);
								}
							}
						})
					}else{
						
					}
				} else {
					alert(result.tipMessage);
				}
			} catch (e) {
				alert("查询失败"+e);
			}
		},
		error : function() {
			alert("查询失败");
		}
	});
}

AdminManage.ajaxAdminRolesSave = function(ids) {
	$.ajax({type : "POST",
		url : contextPath
				+ "/system/adminManage!ajaxAdminRolesSave.action",
		data :  {"roleIds":ids,"admin.id":$("#currentSelectedAdmin").val()},
		datatype :"json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (result.success) {
					alert("角色设置成功");
				} else {
					alert(result.tipMessage);
				}
			} catch (e) {
				alert("角色设置失败");
			}
		},
		error : function() {
			alert("角色设置失败");
		}
	});
}
AdminManage.ajaxDelete = function(rowIndex) {
	if (window.confirm("是否确认删除")) {
		var operatorId = AdminManage.gridData[rowIndex].operatorId;
		$.ajax({
			type : "POST",
			url : contextPath
					+ "/system/adminManage!ajaxDelete.action",
			data : {
				"operatorId" : operatorId
			},
			datatype : "json",
			contentType : "application/x-www-form-urlencoded; charset=utf-8",
			success : function(result) {
				try {
					if (result.success) {
						alert("删除成功");
						AdminManage.ajaxQuery("0");
					} else {
						alert(result.tipMessage);
					}
				} catch (e) {
					alert("删除失败: " + e.message);
				}
			},
			error : function() {
				alert("删除失败!");
			}
		});
	}
}

// 填充数据
AdminManage.initSlickGrid = function() {
	var columns = [ {
		id : "name",
		name : "操作员名称",
		field : "name",
		maxlength:50,
		editor : Slick.Editors.Text
	}, {
		id : "loginName",
		name : "登录名",
		field : "loginName",
		maxlength:50,
		editor : Slick.Editors.Text
	}, {
		id : "loginPass",
		name : "密码",
		field : "loginPass",
		type:"password",
		maxlength:50,
		editor : Slick.Editors.TopDeepEditor,
		formatter: AdminManage.formatPwd
	}, {
		id : "state",
		name : "状态",
		field : "state",
		formatter : AdminManage.formatState
	}, {
		id : "mobileTelephone",
		name : "手机",
		field : "mobileTelephone",
		editor : Slick.Editors.Text
	}, {
		id : "loginEmail",
		name : "邮箱",
		field : "loginEmail",
		editor : Slick.Editors.Text
	}, {
		id : "lastLogintime",
		name : "最后登录时间",
		field : "lastLogintime",
		formatter : AdminManage.formatDate
	}, {
		id : "operate",
		name : "权限操作",
		field : "",
		formatter : AdminManage.addOperateButton,
		width : 100
	} ];

	var options = {
		editable : true,
		enableAddRow : true,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 36
	};

	AdminManage.grid = new Slick.Grid("#grid", AdminManage.gridData, columns, options);
	AdminManage.grid.autosizeColumns();
	var columnpicker = new Slick.Controls.ColumnPicker(columns, AdminManage.grid, options);
	AdminManage.grid.onClick.subscribe(function(e) {
		e.preventDefault();
		var cell = AdminManage.grid.getCellFromEvent(e);
		if (cell.cell == 3) {
			$("#contextMenu").data("row", cell.row).css("top", e.pageY).css(
					"left", e.pageX).show();
		} else {
			$("#contextMenu").data("row", cell.row).css("top", e.pageY).css(
					"left", e.pageX).hide();
		}

	});

	AdminManage.grid.onAddNewRow.subscribe(function(e, args) {
		var item = args.item;
		AdminManage.grid.invalidateRow(AdminManage.gridData.length);
		AdminManage.gridData.push(item);
		item.changed = true;
		item.isNew = true;
		AdminManage.grid.updateRowCount();
		AdminManage.grid.render();
	});

	AdminManage.grid.onCellChange.subscribe(function(e, args) {
		var item = args.item;
		item.changed = true;
		item.isNew=false;
		AdminManage.grid.updateRow(args.row);
	});

};

AdminManage.formatDate = function(row, cell, value, columnDef, dataContext) {
	if(value!=null){var value = TopdeepCommon.formatDate(new Date(value), "yyyy-MM-dd hh:MM:ss");
		return value;
	}else{
		return"";
	}
}

AdminManage.formatPwd = function(row, cell, value, columnDef, dataContext){
	var item =AdminManage.gridData[row];
	item.loginPass = value;
	return "******";
}


AdminManage.addOperateButton = function(row, cell, value, columnDef,
		dataContext) {
	var item = AdminManage.gridData[row];
	var ret = "";
	if (!item.isNew||item.rowVersion!=undefined) {

		ret += "<input type='button' id='setRoles' class='btn btn-sm btn-default' data-target='#selectRoles' data-toggle='modal' row='"
				+ row + "' value='角色'/>";
	}
	if (item.changed) {
		ret += "<input type='button' class='btn btn-sm btn-default' id='commitRow' row='"
				+ row + "' value='保存'/>";
	}
	return ret;
}

AdminManage.formatState = function(row, cell, value, columnDef, dataContext) {
	if ("0" == value) {
		return "禁止";
	} else if ("1" == value) {
		return "正常";
	} else if ("2" == value) {
		return "删除";
	}else{
		return "";
	}
}
