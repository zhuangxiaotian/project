var PrivilegeManage = {};

PrivilegeManage.grid = null;
PrivilegeManage.maxId = 100000000;
PrivilegeManage.gridView = null;
PrivilegeManage.gridData = [];
PrivilegeManage.contextPath = contextPath;
PrivilegeManage.privilegeParentData = [];

PrivilegeManage.initPage = function() {
	PrivilegeManage.initGrid();
	PrivilegeManage.ajaxQuery();

	$(document).on("click", ".commitRow", function() {
		var id = $(this).attr("data_id");
		var item = PrivilegeManage.gridView.getItemById(id);
		if (PrivilegeManage.checkEditInput(item)) {
			PrivilegeManage.ajaxSave(item);
		}
		return false;
	});

	$(document).on("click", ".deleteRow", function() {
		var id = $(this).attr("data_id");
		var item = PrivilegeManage.gridView.getItemById(id);
		if (window.confirm("是否确认删除?")) {
			PrivilegeManage.ajaxDelete(item);
		}
		return false;
	});

	$(document).on("click", ".moveUp", function() {
		var id = $(this).attr("data_id");
		var item = PrivilegeManage.gridView.getItemById(id);
		PrivilegeManage.ajaxMove(item, true);

		return false;
	});

	$(document).on("click", ".moveDown", function() {
		var id = $(this).attr("data_id");
		var item = PrivilegeManage.gridView.getItemById(id);
		PrivilegeManage.ajaxMove(item, false);

		return false;
	});

	$(document).on("click", ".addPrivilegeRow", function() {
		var target = $(this).parent().parent().find(".toggle");
		if($(target).hasClass("expand")){
			$(target).click();
		}
		var id = $(this).attr("data_id");
		var item = PrivilegeManage.gridView.getItemById(id);
		var idx = PrivilegeManage.gridView.getIdxById(id);
		var newIdx = idx + 1;
		var nextItem = PrivilegeManage.gridView.getItemByIdx(newIdx);
		while (nextItem && nextItem.funcParent == item.funcPrivilege) {
			newIdx++;
			nextItem = PrivilegeManage.gridView.getItemByIdx(newIdx);
		}
		PrivilegeManage.maxId = PrivilegeManage.maxId + 1;
		var item = {
			"funcPrivilege" : PrivilegeManage.maxId,
			"funcName" : "新权限名",
			"funcParent" : item.funcPrivilege,
			"funcOperate" : 8,
			"changed" : true,
			"isNew" : true
		};
		PrivilegeManage.gridView.insertItem(newIdx, item);

		return false;
	});

	$(document).on("click", "#init_group_button", function() {
		if (window.confirm("是否确认进行初始化工作？必须要非常清楚后果才能进行此操作！")) {
			PrivilegeManage.ajaxInitGroup();
		}
		return false;
	});

}

PrivilegeManage.checkEditInput = function(data) {
	if (!data.funcName) {
		alert("权限名称不能为空");
		return false;
	}
	return true;
}

PrivilegeManage.getGridColumns = function() {
	var columns = [];
	columns.push({
		id : "funcName",
		name : "名称",
		field : "funcName",
		editor : Slick.Editors.Text,
		formatter : PrivilegeManage.formatFuncName
	});
	columns.push({
		id : "funcOperate",
		name : "权限操作",
		field : "funcOperate",
		formatter : PrivilegeManage.formatFuncOperate
	});
	columns.push({
		id : "operaBtn",
		name : "操作",
		field : "operaBtn",
		width : 100,
		formatter : PrivilegeManage.operaBtnFormatter
	});
	return columns;
}

PrivilegeManage.initGrid = function() {

	var options = {
		editable : true,
		enableAddRow : true,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 45
	};
	PrivilegeManage.initGridDataItemMetaData();
	PrivilegeManage.gridView = new Slick.Data.DataView({
		inlineFilters : true
	});

	PrivilegeManage.gridView.beginUpdate();
	PrivilegeManage.gridView.setItems(PrivilegeManage.gridData);
	PrivilegeManage.gridView.setFilter(PrivilegeManage.gridViewFilter);
	PrivilegeManage.gridView.endUpdate();

	PrivilegeManage.grid = new Slick.Grid("#myGrid", PrivilegeManage.gridView, PrivilegeManage.getGridColumns(), options);
	PrivilegeManage.grid.autosizeColumns();

	PrivilegeManage.grid.registerPlugin(new Slick.AutoTooltips());

	// PrivilegeManage.grid.onValidationError.subscribe(function(e, args) {
	// alert(args.validationResults.msg);
	// });

	PrivilegeManage.grid.onCellChange.subscribe(function(e, args) {
		var item = args.item;
		item.changed = true;
		// PrivilegeManage.grid.updateRow(args.row);
		PrivilegeManage.gridView.updateItem(args.item.funcPrivilege, args.item);
	});

	PrivilegeManage.grid.onAddNewRow.subscribe(function(e, args) {
		PrivilegeManage.maxId = PrivilegeManage.maxId + 1;
		var item = {
			"funcPrivilege" : PrivilegeManage.maxId,
			"funcName" : "新权限名",
			"funcParent" : 0,
			"funcOperate" : 0,
			"changed" : true,
			"isNew" : true
		};
		$.extend(item, args.item);
		// PrivilegeManage.grid.invalidateRow(PrivilegeManage.gridData.length);
		// PrivilegeManage.gridData.push(item);
		// item.changed = true;
		// item.isNew = true;
		// PrivilegeManage.grid.updateRowCount();
		// PrivilegeManage.grid.render();
		PrivilegeManage.gridView.addItem(item);
	});

	PrivilegeManage.grid.onClick.subscribe(function(e, args) {
		if ($(e.target).hasClass("toggle")) {
			var item = PrivilegeManage.gridView.getItem(args.row);
			if (item) {
				if (!item._collapsed) {
					item._collapsed = true;
				} else {
					item._collapsed = false;
				}
				PrivilegeManage.gridView.updateItem(item.funcPrivilege, item);
			}
			e.stopImmediatePropagation();
		}
	});

	// wire up model events to drive the grid
	PrivilegeManage.gridView.onRowCountChanged.subscribe(function(e, args) {
		PrivilegeManage.grid.updateRowCount();
		PrivilegeManage.grid.render();
	});
	PrivilegeManage.gridView.onRowsChanged.subscribe(function(e, args) {
		PrivilegeManage.grid.invalidateRows(args.rows);
		PrivilegeManage.grid.render();
	});
}

PrivilegeManage.formatFuncOperate = function(row, cell, value, columnDef, dataContext) {
	if (value) {
		if (value == 7) {
			return "读、写、删除";
		} else if (value == 8) {
			return "执行";
		} else if (value == 3) {
			return "读、写";
		} else if (value == 1) {
			return "读";
		} else if (value == 9) {
			return "读、执行";
		} else if (value == 23) {
			return "读、写、删除、导出";
		} else if (value == 39) {
			return "读、写、删除、审核";
		} else if (value == 9) {
			return "读、写、删除、审核、导出";
		} else if (value == 33) {
			return "读、审核";
		} else if (value == 33) {
			return "读、导出";
		} else {
			return value;
		}
	}
	return "";
}

PrivilegeManage.formatFuncName = function(row, cell, value, columnDef, dataContext) {
	var item = PrivilegeManage.gridView.getItemById(dataContext.funcPrivilege);
	var indent = 0;
	if (item.funcParent != 0) {
		indent = 2;
	}
	var spacer = "<span style='display:inline-block;height:1px;width:" + (15 * indent) + "px'></span>";
	if (item.funcParent == 0) {
		if (dataContext._collapsed) {
			return spacer + " <span class='toggle expand'></span>&nbsp;" + value;
		} else {
			return spacer + " <span class='toggle collapse'></span>&nbsp;" + value;
		}
	} else {
		return spacer + value;
	}
}

PrivilegeManage.getFuncMaxOrderInGroup = function(obj) {
	var max = 0;
	for (var i = 0; i < PrivilegeManage.gridData.length; i++) {
		var item = PrivilegeManage.gridData[i];
		if (item.funcParent == obj.funcParent) {
			if (item.funcOrder > max) {
				max = item.funcOrder;
			}
		}
	}
	return max;
}

PrivilegeManage.getFuncMinOrderInGroup = function(obj) {
	var min = 99999;
	for (var i = 0; i < PrivilegeManage.gridData.length; i++) {
		var item = PrivilegeManage.gridData[i];
		if (item.funcParent == obj.funcParent) {
			if (item.funcOrder < min) {
				min = item.funcOrder;
			}
		}
	}
	return min;
}

PrivilegeManage.operaBtnFormatter = function(row, cell, value, columnDef, dataContext) {
	var item = PrivilegeManage.gridView.getItemById(dataContext.funcPrivilege);
	var html = "";

	if (item.funcOrder > PrivilegeManage.getFuncMinOrderInGroup(item)) {
		html += "<input data_id='" + item.funcPrivilege + "'  type='button' value = '上移' class='btn btn-default btn-xs moveUp' /> ";
	}
	if (item.funcOrder < PrivilegeManage.getFuncMaxOrderInGroup(item)) {
		html += "<input data_id='" + item.funcPrivilege + "'  type='button' value = '下移' class='btn btn-default btn-xs moveDown' /> ";
	}

	if (item.changed) {
		html += "<input data_id='" + item.funcPrivilege + "'  type='button' value = '保存' class='btn btn-default btn-xs commitRow' /> ";
	}
	if (item.funcPrivilege >= 50000) {
		html += "<input data_id='" + item.funcPrivilege + "'  type='button' value = '删除' class='btn btn-default btn-xs deleteRow' /> ";
	}

	if (!item.isNew && item.funcParent == 0) {
		html += "<input data_id='" + item.funcPrivilege + "'  type='button' value = '添加权限' class='btn btn-default btn-xs addPrivilegeRow' /> ";
	}

	return html;
}

PrivilegeManage.ajaxQuery = function() {

	$.ajax({
		type : "POST",
		url : PrivilegeManage.contextPath + "/system/privilegeManage!ajaxQuery.action",
		data : {},
		datatype : "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (!result.success) {
					alert(result.tipMessage);
				} else {
					if (result.privilege) {
						PrivilegeManage.gridData = result.privilege;
						PrivilegeManage.initGridDataItemMetaData();
						PrivilegeManage.privilegeParentData = [];
						PrivilegeManage.privilegeParentData.push({
							txt : "无",
							ID : 0
						});
						for (var i = 0; i < PrivilegeManage.gridData.length; i++) {
							var item = PrivilegeManage.gridData[i];
							if (item.funcParent == 0) {
								PrivilegeManage.privilegeParentData.push({
									txt : item.funcName,
									ID : item.funcPrivilege
								});
							}
						}
						PrivilegeManage.grid.setColumns(PrivilegeManage.getGridColumns());
						PrivilegeManage.grid.autosizeColumns();

						PrivilegeManage.gridView.beginUpdate();
						PrivilegeManage.gridView.setItems(PrivilegeManage.gridData, "funcPrivilege");
						PrivilegeManage.gridView.setFilter(PrivilegeManage.gridViewFilter);
						PrivilegeManage.gridView.endUpdate();

						// PrivilegeManage.grid.setData(PrivilegeManage.gridData);
						// PrivilegeManage.grid.render();
					}
				}
			} catch (e) {
				alert(e.message);
			}
		},
		error : function(e) {
			alert("请求失败，请检查服务是否启动！" + e.message);
		}
	});
};

PrivilegeManage.ajaxSave = function(obj) {
	$.ajax({
		type : "POST",
		url : PrivilegeManage.contextPath + "/system/privilegeManage!ajaxSave.action",
		data : JSON.stringify({
			"input" : obj
		}),
		datatype : "json",
		contentType : 'application/json;charset=UTF-8',
		// contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (result.success) {
					var item = obj;
					if (item.funcPrivilege != result.output.funcPrivilege) {
						// new obj
						var idx = PrivilegeManage.gridView.getIdxById(item.funcPrivilege);
						PrivilegeManage.gridView.deleteItem(item.funcPrivilege);
						PrivilegeManage.gridView.insertItem(idx, result.output);
					} else {
						item.funcPrivilege = result.output.funcPrivilege;
						item.changed = false;
						item.isNew = false;
						PrivilegeManage.gridView.updateItem(item.funcPrivilege, item);
					}
					alert("操作成功!");
				} else {
					alert(result.tipMessage);
				}
			} catch (e) {
				alert("修改失败: " + e.message);
			}
		},
		error : function() {
			alert("修改失败");
		}
	});
}

PrivilegeManage.ajaxDelete = function(obj) {
	$.ajax({
		type : "POST",
		url : PrivilegeManage.contextPath + "/system/privilegeManage!ajaxDelete.action",
		data : {
			"input.funcPrivilege" : obj.funcPrivilege
		},
		datatype : "json",
		// contentType : 'application/json;charset=UTF-8',
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (result.success) {
					PrivilegeManage.gridView.deleteItem(obj.funcPrivilege);
					alert("操作成功!");
				} else {
					alert(result.tipMessage);
				}
			} catch (e) {
				alert("修改失败: " + e.message);
			}
		},
		error : function() {
			alert("修改失败");
		}
	});
}

PrivilegeManage.ajaxMove = function(obj, isUpOrDown) {
	$.ajax({
		type : "POST",
		url : PrivilegeManage.contextPath + "/system/privilegeManage!ajaxMove.action",
		data : {
			"input.funcPrivilege" : obj.funcPrivilege,
			"moveUp" : isUpOrDown
		},
		datatype : "json",
		// contentType : 'application/json;charset=UTF-8',
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (result.success) {
					//if (row >= 0) {
//						if (isUpOrDown) {
//							var item = obj;
//							var idx = PrivilegeManage.gridView.getIdxById(item.funcPrivilege);
//							var newIdx = idx - 1;
//							var item1 = PrivilegeManage.gridView.getItemByIdx(newIdx);
//							var temp = item1.funcOrder;
//							item1.funcOrder = item.funcOrder
//							item.funcOrder = temp;
//							PrivilegeManage.gridView.deleteItem(item.funcPrivilege);
//							PrivilegeManage.gridView.insertItem(newIdx, item);
//						} else {
//							var item = obj;
//							var idx = PrivilegeManage.gridView.getIdxById(item.funcPrivilege);
//							var newIdx = idx + 1;
//							var item1 = PrivilegeManage.gridView.getItemByIdx(newIdx);
//							var temp = item1.funcOrder;
//							item1.funcOrder = item.funcOrder
//							item.funcOrder = temp;
//							PrivilegeManage.gridView.deleteItem(item.funcPrivilege);
//							PrivilegeManage.gridView.insertItem(newIdx, item);
//						}
						// PrivilegeManage.initGridDataItemMetaData();
						// PrivilegeManage.grid.setData(PrivilegeManage.gridData);
						// PrivilegeManage.grid.render();
					//}
					PrivilegeManage.ajaxQuery(0);
					alert("操作成功!");
				} else {
					alert(result.tipMessage);
				}
			} catch (e) {
				alert("修改失败: " + e.message);
			}
		},
		error : function() {
			alert("修改失败");
		}
	});
}

PrivilegeManage.ajaxInitGroup = function(obj, isUpOrDown) {
	$.ajax({
		type : "POST",
		url : PrivilegeManage.contextPath + "/system/privilegeManage!ajaxInitGroup.action",
		data : {},
		datatype : "json",
		// contentType : 'application/json;charset=UTF-8',
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success : function(result) {
			try {
				if (result.success) {
					PrivilegeManage.ajaxQuery();
					alert("初始化成功");
				} else {
					alert(result.tipMessage);
				}
			} catch (e) {
				alert("操作失败: " + e.message);
			}
		},
		error : function() {
			alert("操作失败");
		}
	});
}

PrivilegeManage.initGridDataItemMetaData = function() {
	PrivilegeManage.gridData.getItemMetadata = function(row) {
		var item = PrivilegeManage.gridData[row];
		if (item && (item.funcPrivilege > 0 && item.funcPrivilege < 50000)) {
			return {
				"columns" : {
					"funcOperate" : {
						editor : null
					}
				}
			}
		}
	};
}

PrivilegeManage.gridViewFilter = function(obj) {
	if (obj.funcParent != 0) {
		var parent = PrivilegeManage.gridView.getItemById(obj.funcParent);
		if (parent) {
			if (parent._collapsed) {
				return false;
			}
		}
	}
	return true;
}