(function($) {
	// register namespace
	$.extend(true, window, {
		"Slick" : {
			"Editors" : {
				"Text" : TextEditor,
				"Integer" : IntegerEditor,
				"Date" : DateEditor,
				"YesNoSelect" : YesNoSelectEditor,
				"Checkbox" : CheckboxEditor,
				"PercentComplete" : PercentCompleteEditor,
				"LongText" : LongTextEditor,
				"TopDeepDropDownList" : TopDeepDropDownList,
				"TopDeepMultiSelects" : TopDeepMultiSelects,
				"TopDeepEditor" : TopDeepEditor
			}
		}
	});

	function TopDeepEditor(args) {

		var $input;
		var defaultValue;
		var scope = this;

		this.init = function() {

			$input = $("<INPUT  type=text class='editor-text form-control' />")
					.appendTo(args.container).bind(
							"keydown.nav",
							function(e) {
								if (e.keyCode === $.ui.keyCode.LEFT
										|| e.keyCode === $.ui.keyCode.RIGHT) {
									e.stopImmediatePropagation();
								}
							}).focus().select();
			if (args.column.maxlength) {
				$input.attr('maxlength', args.column.maxlength);
			}
			if (args.column.type) {
				$input.attr('type', args.column.type);
			}
		};

		this.destroy = function() {
			$input.remove();
		};

		this.focus = function() {
			$input.focus();
		};

		this.getValue = function() {
			return $input.val();
		};

		this.setValue = function(val) {
			$input.val(val);
		};

		this.loadValue = function(item) {
			defaultValue = item[args.column.field] || "";
			$input.val(defaultValue);
			$input[0].defaultValue = defaultValue;
			$input.select();
		};

		this.serializeValue = function() {
			return $input.val();
		};

		this.applyValue = function(item, state) {
			item[args.column.field] = state;
		};

		this.isValueChanged = function() {
			return (!($input.val() == "" && defaultValue == null))
					&& ($input.val() != defaultValue);
		};

		this.validate = function() {
			if (args.column.validator) {
				var validationResults = args.column.validator($input.val());
				if (!validationResults.valid) {
					return validationResults;
				}
			}

			if (args.column.digital)
				if (!(/^\d+$/.test($input.val()))) {
					return {
						valid : false,
						msg : "请输入数字."
					};
				}

			if (args.column.email)
				if (!(/^((([a-z]|\d|[!#\$%&'\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+(\.([a-z]|\d|[!#\$%&'\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+)*)|((\x22)((((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(([\x01-\x08\x0b\x0c\x0e-\x1f\x7f]|\x21|[\x23-\x5b]|[\x5d-\x7e]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(\\([\x01-\x09\x0b\x0c\x0d-\x7f]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]))))*(((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(\x22)))@((([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.)+(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))$/i
						.test($input.val()))) {
					return {
						valid : false,
						msg : "邮箱格式错误."
					};
				}

			return {
				valid : true,
				msg : null
			};
		};

		this.init();

	}
	function TextEditor(args) {
		var $input;
		var defaultValue;
		var scope = this;

		this.init = function() {
			$input = $("<INPUT type=text class='editor-text form-control' />")
					.appendTo(args.container).bind(
							"keydown.nav",
							function(e) {
								if (e.keyCode === $.ui.keyCode.LEFT
										|| e.keyCode === $.ui.keyCode.RIGHT) {
									e.stopImmediatePropagation();
								}
							}).focus().select();
		};

		this.destroy = function() {
			$input.remove();
		};

		this.focus = function() {
			$input.focus();
		};

		this.getValue = function() {
			return $input.val();
		};

		this.setValue = function(val) {
			$input.val(val);
		};

		this.loadValue = function(item) {
			defaultValue = item[args.column.field] || "";
			$input.val(defaultValue);
			$input[0].defaultValue = defaultValue;
			$input.select();
		};

		this.serializeValue = function() {
			return $input.val();
		};

		this.applyValue = function(item, state) {
			item[args.column.field] = state;
		};

		this.isValueChanged = function() {
			return (!($input.val() == "" && defaultValue == null))
					&& ($input.val() != defaultValue);
		};

		this.validate = function() {
			if (args.column.validator) {
				var validationResults = args.column.validator($input.val());
				if (!validationResults.valid) {
					return validationResults;
				}
			}

			return {
				valid : true,
				msg : null
			};
		};

		this.init();
	}

	function IntegerEditor(args) {
		var $input;
		var defaultValue;
		var scope = this;

		this.init = function() {
			$input = $("<INPUT type=text class='editor-text' />");

			$input.bind("keydown.nav", function(e) {
				if (e.keyCode === $.ui.keyCode.LEFT
						|| e.keyCode === $.ui.keyCode.RIGHT) {
					e.stopImmediatePropagation();
				}
			});

			$input.appendTo(args.container);
			$input.focus().select();
		};

		this.destroy = function() {
			$input.remove();
		};

		this.focus = function() {
			$input.focus();
		};

		this.loadValue = function(item) {
			defaultValue = item[args.column.field];
			$input.val(defaultValue);
			$input[0].defaultValue = defaultValue;
			$input.select();
		};

		this.serializeValue = function() {
			return parseInt($input.val(), 10) || 0;
		};

		this.applyValue = function(item, state) {
			item[args.column.field] = state;
		};

		this.isValueChanged = function() {
			return (!($input.val() == "" && defaultValue == null))
					&& ($input.val() != defaultValue);
		};

		this.validate = function() {
			if (isNaN($input.val())) {
				return {
					valid : false,
					msg : "Please enter a valid integer"
				};
			}

			return {
				valid : true,
				msg : null
			};
		};

		this.init();
	}

	function DateEditor(args) {
		var $input;
		var defaultValue;
		var scope = this;
		var calendarOpen = false;
		this.init = function() {
			$input = $("<INPUT type=text readonly='readonly' class='editor-text' />");
			$input.appendTo(args.container);
			$input.focus().select();
			$input.datepicker({
				showOn : "button",
				buttonImageOnly : true,
				timepicker : false,
				format : 'Y-m-d',
				buttonImage : contextPath
						+ "/js/common/slickgrid/images/calendar.gif",
				beforeShow : function() {
					calendarOpen = true
				},
				onClose : function() {
					calendarOpen = false
				}
			});
			$input.width($input.width() - 18);
		};

		this.destroy = function() {
			$.datepicker.dpDiv.stop(true, true);
			$input.datepicker("hide");
			$input.datepicker("destroy");
			$input.remove();
		};

		this.show = function() {
			if (calendarOpen) {
				$.datepicker.dpDiv.stop(true, true).show();
			}
		};

		this.hide = function() {
			if (calendarOpen) {
				$.datepicker.dpDiv.stop(true, true).hide();
			}
		};

		this.position = function(position) {
			if (!calendarOpen) {
				return;
			}
			$.datepicker.dpDiv.css("top", position.top + 30).css("left",
					position.left);
		};

		this.focus = function() {
			$input.focus();
		};

		this.loadValue = function(item) {
			defaultValue = item[args.column.field];
			$input.val(defaultValue);
			$input[0].defaultValue = defaultValue;
			$input.select();
		};

		this.serializeValue = function() {
			return $input.val();
		};

		this.applyValue = function(item, state) {
			item[args.column.field] = state;
		};

		this.isValueChanged = function() {
			return (!($input.val() == "" && defaultValue == null))
					&& ($input.val() != defaultValue);
		};

		this.validate = function() {
			return {
				valid : true,
				msg : null
			};
		};

		this.init();
	}

	function YesNoSelectEditor(args) {
		var $select;
		var defaultValue;
		var scope = this;

		this.init = function() {
			$select = $("<SELECT tabIndex='0' class='editor-yesno'><OPTION value='yes'>Yes</OPTION><OPTION value='no'>No</OPTION></SELECT>");
			$select.appendTo(args.container);
			$select.focus();
		};

		this.destroy = function() {
			$select.remove();
		};

		this.focus = function() {
			$select.focus();
		};

		this.loadValue = function(item) {
			$select
					.val((defaultValue = item[args.column.field]) ? "yes"
							: "no");
			$select.select();
		};

		this.serializeValue = function() {
			return ($select.val() == "yes");
		};

		this.applyValue = function(item, state) {
			item[args.column.field] = state;
		};

		this.isValueChanged = function() {
			return ($select.val() != defaultValue);
		};

		this.validate = function() {
			return {
				valid : true,
				msg : null
			};
		};

		this.init();
	}

	function CheckboxEditor(args) {
		var $select;
		var defaultValue;
		var scope = this;

		this.init = function() {
			$select = $("<INPUT type=checkbox value='true' class='editor-checkbox' hideFocus>");
			$select.appendTo(args.container);
			$select.focus();
		};

		this.destroy = function() {
			$select.remove();
		};

		this.focus = function() {
			$select.focus();
		};

		this.loadValue = function(item) {
			defaultValue = !!item[args.column.field];
			if (defaultValue) {
				$select.prop('checked', true);
			} else {
				$select.prop('checked', false);
			}
		};

		this.serializeValue = function() {
			return $select.prop('checked');
		};

		this.applyValue = function(item, state) {
			item[args.column.field] = state;
		};

		this.isValueChanged = function() {
			return (this.serializeValue() !== defaultValue);
		};

		this.validate = function() {
			return {
				valid : true,
				msg : null
			};
		};

		this.init();
	}

	function PercentCompleteEditor(args) {
		var $input, $picker;
		var defaultValue;
		var scope = this;

		this.init = function() {
			$input = $("<INPUT type=text class='editor-percentcomplete' />");
			$input.width($(args.container).innerWidth() - 25);
			$input.appendTo(args.container);

			$picker = $("<div class='editor-percentcomplete-picker' />")
					.appendTo(args.container);
			$picker
					.append("<div class='editor-percentcomplete-helper'><div class='editor-percentcomplete-wrapper'><div class='editor-percentcomplete-slider' /><div class='editor-percentcomplete-buttons' /></div></div>");

			$picker
					.find(".editor-percentcomplete-buttons")
					.append(
							"<button val=0>Not started</button><br/><button val=50>In Progress</button><br/><button val=100>Complete</button>");

			$input.focus().select();

			$picker.find(".editor-percentcomplete-slider").slider({
				orientation : "vertical",
				range : "min",
				value : defaultValue,
				slide : function(event, ui) {
					$input.val(ui.value)
				}
			});

			$picker.find(".editor-percentcomplete-buttons button").bind(
					"click",
					function(e) {
						$input.val($(this).attr("val"));
						$picker.find(".editor-percentcomplete-slider").slider(
								"value", $(this).attr("val"));
					})
		};

		this.destroy = function() {
			$input.remove();
			$picker.remove();
		};

		this.focus = function() {
			$input.focus();
		};

		this.loadValue = function(item) {
			$input.val(defaultValue = item[args.column.field]);
			$input.select();
		};

		this.serializeValue = function() {
			return parseInt($input.val(), 10) || 0;
		};

		this.applyValue = function(item, state) {
			item[args.column.field] = state;
		};

		this.isValueChanged = function() {
			return (!($input.val() == "" && defaultValue == null))
					&& ((parseInt($input.val(), 10) || 0) != defaultValue);
		};

		this.validate = function() {
			if (isNaN(parseInt($input.val(), 10))) {
				return {
					valid : false,
					msg : "Please enter a valid positive number"
				};
			}

			return {
				valid : true,
				msg : null
			};
		};

		this.init();
	}

	/*
	 * An example of a "detached" editor. The UI is added onto document BODY and
	 * .position(), .show() and .hide() are implemented. KeyDown events are also
	 * handled to provide handling for Tab, Shift-Tab, Esc and Ctrl-Enter.
	 */
	function LongTextEditor(args) {
		var $input, $wrapper;
		var defaultValue;
		var scope = this;

		this.init = function() {
			var $container = $("body");

			$wrapper = $(
					"<DIV style='z-index:10000;position:absolute;background:white;padding:5px;border:3px solid gray; -moz-border-radius:10px; border-radius:10px;'/>")
					.appendTo($container);

			$input = $(
					"<TEXTAREA hidefocus rows=5 style='backround:white;width:250px;height:80px;border:0;outline:0'>")
					.appendTo($wrapper);

			$(
					"<DIV style='text-align:right'><BUTTON>Save</BUTTON><BUTTON>Cancel</BUTTON></DIV>")
					.appendTo($wrapper);

			$wrapper.find("button:first").bind("click", this.save);
			$wrapper.find("button:last").bind("click", this.cancel);
			$input.bind("keydown", this.handleKeyDown);

			scope.position(args.position);
			$input.focus().select();
		};

		this.handleKeyDown = function(e) {
			if (e.which == $.ui.keyCode.ENTER && e.ctrlKey) {
				scope.save();
			} else if (e.which == $.ui.keyCode.ESCAPE) {
				e.preventDefault();
				scope.cancel();
			} else if (e.which == $.ui.keyCode.TAB && e.shiftKey) {
				e.preventDefault();
				args.grid.navigatePrev();
			} else if (e.which == $.ui.keyCode.TAB) {
				e.preventDefault();
				args.grid.navigateNext();
			}
		};

		this.save = function() {
			args.commitChanges();
		};

		this.cancel = function() {
			$input.val(defaultValue);
			args.cancelChanges();
		};

		this.hide = function() {
			$wrapper.hide();
		};

		this.show = function() {
			$wrapper.show();
		};

		this.position = function(position) {
			$wrapper.css("top", position.top - 5)
					.css("left", position.left - 5)
		};

		this.destroy = function() {
			$wrapper.remove();
		};

		this.focus = function() {
			$input.focus();
		};

		this.loadValue = function(item) {
			$input.val(defaultValue = item[args.column.field]);
			$input.select();
		};

		this.serializeValue = function() {
			return $input.val();
		};

		this.applyValue = function(item, state) {
			item[args.column.field] = state;
		};

		this.isValueChanged = function() {
			return (!($input.val() == "" && defaultValue == null))
					&& ($input.val() != defaultValue);
		};

		this.validate = function() {
			return {
				valid : true,
				msg : null
			};
		};

		this.init();
	}
	
	function TopDeepDropDownList(args) {
		var $select = $("");
		var defaultValue = "";
		var scope = this;
		var dataSouce = args.column.datasource;
		if(!dataSouce){
			var row = args.grid.getActiveCell().row;
			var rowMetadata = args.grid.getData().getItemMetadata && args.grid.getData().getItemMetadata(row);
			var columnMetadata = rowMetadata && rowMetadata.columns;
			if (columnMetadata && columnMetadata[args.column.id] && columnMetadata[args.column.id].datasource !== undefined) {
		        dataSouce = columnMetadata[args.column.id].datasource;
		    }
		}
		var changedEvent = args.column.changedEvent;
		this.init = function() {
			if (dataSouce != undefined && dataSouce != null) {
				$select = this.preRender(dataSouce);
				if (changedEvent != null)
					$select.change(function() {
						changedEvent(this, {
							"ID" : $select.val(),
							"txt" : $select.find('option:selected').text()
						});
					});

				$select.appendTo(args.container);
				$select.focus();
			}
		};

		this.preRender = function(dataSource) {
			var option_str = "";
			var preSelect = "<SELECT tabIndex='0' class='editor-select form-control'>";
			var endSelect = "</SELECT>";

			var len = dataSource.length;
			if (len > 0 && dataSource[0].txt != undefined) {
				for (var i = 0; i < len; i++)
					option_str += "<OPTION value='" + dataSource[i].ID + "'>"
							+ dataSource[i].txt + "</OPTION>";
			} else {
				for (var i = 0; i < len; i++)
					option_str += "<OPTION value='" + dataSource[i].ID + "'>"
							+ dataSource[i].Text + "</OPTION>";
			}

			var list = preSelect + option_str + endSelect;
			return $(list);
		}

		this.destroy = function() {
			$(args.container).empty();
		};

		this.focus = function() {
			$select.focus();
		};

		this.serializeValue = function() {
			if ($select.val() != -1) {
				return $select.find('option:selected').val();
			}
		};

		this.applyValue = function(item, state) {
			if (state != undefined) {
				item[args.column.field] = state;
			}
		};

		this.loadValue = function(item) {
			defaultValue = item[args.column.field];
			var dataSource = dataSouce;
			var len = dataSource.length;
			if (len > 0 && dataSource[0].txt != undefined) {
				for (var i = 0; i < len; i++) {
					if (item[args.column.field] == dataSource[i].txt) {
						defaultValue = dataSource[i].ID;
						$select.val(defaultValue);
						break;
					}
				}
			}
			$select.val(defaultValue);
		};

		this.isValueChanged = function() {
			return ($select.val() != defaultValue);
		};

		this.validate = function() {
			return {
				valid : true,
				msg : null
			};
		};

		this.init();

		return $select.val();
	}

	function TopDeepMultiSelects(args) {
		var $input = $(""), $wrapper;
		var $select = $("");
		var defaultValue;
		var scope = this;
		var dataSouce = args.column.datasource;
		this.init = function() {
			var $container = $("body");

			$wrapper = $(
					"<DIV style='z-index:10000;position:absolute;background:white;padding:5px;border:3px solid gray; -moz-border-radius:10px; border-radius:10px;'/>")
					.appendTo($container);

			if (dataSouce != undefined && dataSouce != null) {
				$select = this.preRender(dataSouce);
			}

			$select.appendTo($wrapper);

			$(
					"<DIV style='text-align:right'><BUTTON>Save</BUTTON><BUTTON>Cancel</BUTTON></DIV>")
					.appendTo($wrapper);

			$select.bind("keydown", this.handleKeyDown);

			scope.position(args.position);

		};

		this.handleKeyDown = function(e) {
			if (e.which == $.ui.keyCode.ENTER && e.ctrlKey) {
				scope.save();
			} else if (e.which == $.ui.keyCode.ESCAPE) {
				e.preventDefault();
				scope.cancel();
			} else if (e.which == $.ui.keyCode.TAB && e.shiftKey) {
				e.preventDefault();
				args.grid.navigatePrev();
			} else if (e.which == $.ui.keyCode.TAB) {
				e.preventDefault();
				args.grid.navigateNext();
			}
		};


		this.hide = function() {
			$wrapper.hide();
		};

		this.show = function() {
			$wrapper.show();
		};

		this.position = function(position) {
			$wrapper.css("top", position.top - 5)
					.css("left", position.left - 5)
		};

		this.destroy = function() {
			$wrapper.remove();
		};

		this.focus = function() {
			$select.focus();
		};

		this.loadValue = function(item) {
			defaultValue = item[args.column.field];
			$input = defaultValue;
			var dataSource = args.column.datasource;
			var len = dataSource.length;
			if (len > 0 && dataSource[0].txt != undefined) {
				if (defaultValue) {
					var defaultValueList = defaultValue.split(",")

					for (var j = 0; j < defaultValueList.length; j++) {
						for (var i = 0; i < len; i++) {
							if (defaultValueList[j] == dataSource[i].ID) {
								$("#" + dataSource[i].ID).attr("checked", true);
								break;
							}
						}
					}

				}
			}

		};

		this.preRender = function(dataSource) {
			var option_str = "";
			var preSelect = "<ul>";
			var endSelect = "</ul>";

			var len = dataSource.length;
			if (len > 0 && dataSource[0].txt != undefined) {
				for (var i = 0; i < len; i++)
					option_str += "<li>" + "<input type='checkbox' id = '"
							+ dataSource[i].ID + "' value='" + dataSource[i].ID
							+ "'>" + dataSource[i].txt + "</li>";
			} else {
				for (var i = 0; i < len; i++)
					option_str += "<li>" + "<input type='checkbox' id = '"
							+ dataSource[i].ID + "' value='" + dataSource[i].ID
							+ "'>" + dataSource[i].txt + "</li>";
			}

			var list = preSelect + option_str + endSelect;
			return $(list);
		}

		this.serializeValue = function() {
			return $input;
		};

		this.applyValue = function(item, state) {
			item[args.column.field] = state;
		};

		this.isValueChanged = function() {
			var rel = (!($input == "" && defaultValue == null))
					&& ($input != defaultValue);
			return rel;
		};

		this.validate = function() {
			if (args.column.validator) {
				var validationResults = args.column.validator($input);
				if (!validationResults.valid) {
					return validationResults;
				}
			}
			return {
				valid : true,
				msg : null
			};
		};

		this.init();
	}
})(jQuery);