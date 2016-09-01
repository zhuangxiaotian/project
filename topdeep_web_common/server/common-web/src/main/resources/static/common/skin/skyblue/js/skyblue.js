$(function(){
	//tab
	$(".weui_navbar_item").click(function(){
		$(this).addClass("active").siblings().removeClass("active");
	})

	//checkbox&&radio
	$(".sub-check").on('click',function(){
		var flag=$(this).attr("flag");
		if(flag==0){
			return;
		} else{
			$(this)[$(this).hasClass('sub-check-s')?'removeClass':'addClass']('sub-check-s');
		}
	});
	$(".radio-list li").click(function(){
		$(this).addClass("active").siblings().removeClass("active");
		var dataNumber=$(this).attr("data-number");
		var dataName=$(this).attr("data-name");
		if(dataNumber=="1"){
			$(".target1").show();
			$(".target2").hide();
		}else if(dataNumber=="2"){
			$(".target1").hide();
			$(".target2").show();
		}
	});
});

//select
function showSelect(nameId,selectId){
	function init(){
		var $nameId=$(nameId);
		$nameId.on("click",function(){
			var $mask = $('#mask');
			var $selectList=$(selectId);
			$selectList.addClass('weui_actionsheet_toggle');
			$selectList.find(".weui_actionsheet_cell").on("click",function(){
				$nameId.html($(this).html());
				hideSelectList($selectList, $mask);
			})
			$mask.show().focus().addClass('weui_fade_toggle').one('click',function(){
				hideSelectList($selectList, $mask);
			});
			$mask.unbind('transitionend').unbind('webkitTransitionEnd');
		});

	};
	function hideSelectList(selectList, mask) {
		selectList.removeClass('weui_actionsheet_toggle');
		mask.removeClass('weui_fade_toggle');
		mask.on('transitionend', function () {
			mask.hide();
		}).on('webkitTransitionEnd', function () {
			mask.hide();
		})
	}
	init();
}



/**confirm**/
//loading
function showLoading(){
	var loadBox = $('<div class="dialog dialog-loading"></div>');
	var loadContent;
	var loadBody = '';
		loadBody+= '<div class="cover"></div>';
		loadBody+= '<div class="loading-content"></div>';
	loadContent=$(loadBody);
	loadBox.append(loadContent);
	$("body").append(loadBox);
}
//移除loading
function hideLoading(){
	if($(".dialog-loading")){
		$(".dialog-loading").remove();
	}
}

//confirm 一个按钮
function showDialog(type,str,btn,callback){
	hideDialog();
	var dialogBox = $('<div class="dialog dialog-one"></div>');
	var dialogContents;
	var dialogContent = '';
	dialogContent += '<div class="cover"></div><div class="dialog-content"><div class="dialog-style">';
	if(type=="doubt"){//疑问
		dialogContent += '<div class="dialog-type dialog-enheng"></div>';
	}else if(type == "success"){//成功
		dialogContent += '<div class="dialog-type dialog-success"></div>';
	}else if(type=="fail"){//失败
		dialogContent += '<div class="dialog-type dialog-fail"></div>';
	}else if(type=="warning"){//警告
		dialogContent += '<div class="dialog-type dialog-warn"></div>';
	}
	dialogContent += '<div class="dialog-title">提示</div></div><div class="dialog-detail">' + str + '</div>';
	dialogContent += '<div class="dialog-btn"><a href="javascript:;" class="dialog-btn-only bg-blue">'+btn+'</a>';
	dialogContent += '</div></div>';
	dialogContents = $(dialogContent);
	dialogBox.append(dialogContents);
	$("body").append(dialogBox);
	$(".dialog-btn-only").click(function () {
		if (callback) {
			callback();
		}
		hideDialog();
	});
};
function hideDialog(){
	if ($(".dialog-one")) {
		$(".dialog-one").remove();
	}
};

//confirm 两个按钮
function showConfirm(str,b1,b2,type,callback1,callback2){
	hideConfirm();
	var confirmBox = $('<div class="dialog dialog-double"></div>');
	var confirmContents;
	var confirmContent = '';
	confirmContent += '<div class="cover"></div><div class="dialog-content"><div class="dialog-style">';
	if(type=="doubt"){//疑问
		confirmContent += '<div class="dialog-type dialog-enheng"></div>';
	}else if(type == "success"){//成功
		confirmContent += '<div class="dialog-type dialog-success"></div>';
	}else if(type=="fail"){//失败
		confirmContent += '<div class="dialog-type dialog-fail"></div>';
	}else if(type=="warning"){//警告
		confirmContent += '<div class="dialog-type dialog-warn"></div>';
	}
	confirmContent += '<div class="dialog-title">提示</div></div><div class="dialog-detail">' + str + '</div>';
	confirmContent += '<div class="dialog-btn"><a href="javascript:;" class="dialog-btn-l">'+b1+'</a><a href="javascript:;" class="dialog-btn-r bg-blue">'+b2+'</a>';
	confirmContent += '</div></div>';
	confirmContents = $(confirmContent);
	confirmBox.append(confirmContents);
	$("body").append(confirmBox);
	$(".dialog-close").click(function () {
		hideDialog();
	});
	$(".dialog-btn-l").click(function () {
		if (callback1) {
			callback1();
		}
		hideConfirm();
	});
	$(".dialog-btn-r").click(function () {
		if (callback2) {
			callback2();
		}
		hideConfirm();
	});
};
function hideConfirm(){
	if ($(".dialog-double")) {
		$(".dialog-double").remove();
	}
};

//confirm 输入框
function pwdConfirm(type,str,b1,b2,callback1,callback2){
	hidePwdConfirm();
	var pwdBox = $('<div class="dialog dialog-pwd"></div>');
	var pwdContents;
	var pwdContent = '';
	pwdContent += '<div class="cover"></div><div class="dialog-content"><div class="dialog-style">';
	pwdContent += '<div class="dialog-type dialog-warn"></div>';
	if(type=="password") {//输入密码
		pwdContent += '<div class="dialog-title">提示</div></div><div class="dialog-input"><input id="confirmContent" type="password" placeholder="'+str+'"\/></div>';
	}else if(type="text"){//输入文本
		pwdContent += '<div class="dialog-title">提示</div></div><div class="dialog-input"><input id="confirmContent" type="text" placeholder="'+str+'"\/></div>';
	}
	pwdContent += '<div class="dialog-btn"><a href="javascript:;" class="dialog-btn-l">'+b1+'</a><a href="javascript:;" class="dialog-btn-r bg-blue">'+b2+'</a>';
	pwdContent += '</div></div>';
	pwdContents = $(pwdContent);
	pwdBox.append(pwdContents);
	$("body").append(pwdBox);
	$(".dialog-btn-l").click(function () {
		if (callback1) {
			callback1();
		}
		hidePwdConfirm();
	});
	$(".dialog-btn-r").click(function () {
		if (callback2) {
			callback2();
		}
		hidePwdConfirm();
	});
};
function hidePwdConfirm(){
	if ($(".dialog-pwd")) {
		$(".dialog-pwd").remove();
	}
};


	
	