$(function(){
	//fundlist
	//$(".arrow-toggle").click(function(){
	//	$(this).find(".icon-top").toggleClass("icon-bottom");
	//})

	//选择框
	//function selectBox(){
	//	$(".sub-select").click(function() {
	//		$(this).find(".select-list").slideToggle(100);
	//		$(this).find(".icon-down").toggleClass("icon-up");
	//	})
	//	$(".sub-select2").click(function() {
	//		$(this).find(".select-list").slideToggle(100);
	//		$(this).find(".icon-down").toggleClass("icon-up");
	//	})
	//}
	//selectBox();
	//$('.select-list li').bind('click', function(){
	//	selectValue=$(this).find("a").html();
	//	$(this).parent().parent().find('.select-detail').html(selectValue);
	//});

	//sub-check
	$(".sub-check").on('click',function(){
		var flag=$(this).attr("flag");
		if(flag==0){
			return;
		} else{
			$(this)[$(this).hasClass('sub-check1')?'removeClass':'addClass']('sub-check1');
		}
	});
	$(".check-spc>span").on('click',function(){
		var flag=$(this).attr("flag");
		if(flag==0){
			return;
		} else{
			$(this).parent()[$(this).parent().hasClass('check-spc1')?'removeClass':'addClass']('check-spc1');
		}
	});

	//dialog
	$(".dialog-close").on("click",function(){
		$(".dialog").hide(200);
	})

	//tab
	//$('.title-tab li').on('click', function(event) {
	//	$('.title-tab li').removeClass('cur');
	//	$(this).addClass('cur');
	//	$('.title-tab-cont').hide();
	//	$('.title-tab-cont').eq($(this).index()).show();
	//});
	//$('.tab li').on('click', function(event) {
	//	$('.tab li').removeClass('cur');
	//	$(this).addClass('cur');
	//	$('.tab-cont').hide();
	//	$('.tab-cont').eq($(this).index()).show();
	//});
	//$('.tab1 li').on('click', function(event) {
	//	$('.tab1 li').removeClass('cur');
	//	$(this).addClass('cur');
	//	$('.tab1-cont').hide();
	//	$('.tab1-cont').eq($(this).index()).show();
	//});
	//$('.tab2 li').on('click', function(event) {
	//	$('.tab2 li').removeClass('cur');
	//	$(this).addClass('cur');
	//	$('.tab2-cont').hide();
	//	$('.tab2-cont').eq($(this).index()).show();
	//});
	//$('.tab3 li').on('click', function(event) {
	//	$('.tab3 li').removeClass('cur');
	//	$(this).addClass('cur');
	//	$('.tab3-cont').hide();
	//	$('.tab3-cont').eq($(this).index()).show();
	//});

	//type-box
	//$('.tab-fundtype ul li').on('click', function(event) {
	//	$('.tab-fundtype ul li').removeClass('cur');
	//	$(this).addClass('cur');
	//	$('.tab-fundtype-cont').hide();
	//	$('.tab-fundtype-cont').eq($(this).index()).show();
	//});

	//index
	$('.index-tab li').on('click', function(event) {
		$('.index-tab li').removeClass('active');
		$(this).addClass('active');
	});


	//fixed bottom
	function divFixed(){
		var sHeight=$(window).height(),
			tipHeight=$(".warm-tips").height()+30,
			boxHeight=$("#box").height(),
			offsetHeight=sHeight-tipHeight;
		if(boxHeight>offsetHeight){
			$(".warm-tips").css("position","relative");
		}else {
			$(".warm-tips").css("position","absolute");
		}
	}
	divFixed();
	$(window).resize(function() {
		divFixed();
	});

	//定投修改
	$("#editInvestment").click(function(){
		$(this).hide();
		$("#inputInvestment").show();
	})

	//公告
	$(".notice-list").each(function(){
		var maxNumber=40;
		if($(this).text().length>maxNumber){
			$(this).text($(this).text().substring(0,maxNumber));
			$(this).html($(this).html()+'...');
		}
	})







//设置基金种类导航
	var ww = window.innerWidth;
	var size = $(".tab-fundtype>ul>li").length;
	var navW = 75;
	if(ww > 320 && ww <= 360){
		navW = 85;
	}else if(ww > 360){
		navW = 85;
	}
	$(".tab-fundtype").css("width",navW*size);
	$(".tab-fundtype ul li").css("width",navW);

	$(document).on("click",".tab-fundtype ul li",function(){
		var pw = $(".tab-fundtype ul li.cur").next().css("width");
		$(".tab-fundtype ul li.cur").next().css("width",pw);
		$(".tab-fundtype ul li").removeClass("cur");
		$(this).addClass("cur");
	})
//scroll
//	function xScroll(){
//		var myScroll;
//		myScroll = new IScroll('#wrapper', { eventPassthrough: true, scrollX: true, scrollY: false, preventDefault: false });
//	}
});



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
		dialogContent += '<i class="dialog-enheng"></i>';
	}else if(type == "success"){//成功
		dialogContent += '<i class="dialog-success"></i>';
	}else if(type=="fail"){//失败
		dialogContent += '<i class="dialog-fail"></i>';
	}else if(type=="warning") {//警告
		dialogContent += '<i class="dialog-warn"></i>';
	}else if(type=="service"){//客服
		dialogContent += '<i class="dialog-service"></i>';
	} else if(type=="user"){//账户
		dialogContent += '<i class="dialog-user"></i>';
	}
	dialogContent += '<a href="javascript:;" class="dialog-close" ><i></i></a></div><p class="dialog-detail-m">' + str + '</p>';
	dialogContent += '<div class="sub-btn dialog-btn sub-placeholder1"><a href="javascript:;" class="sub-btn1 btn-only">'+btn+'</a>';
	dialogContent += '</div></div>';
	dialogContents = $(dialogContent);
	dialogBox.append(dialogContents);
	$("body").append(dialogBox);
	$(".dialog-close").click(function () {
		hideDialog();
	});
	$(".btn-only").click(function () {
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
		confirmContent += '<i class="dialog-enheng"></i>';
	}else if(type == "success"){//成功
		confirmContent += '<i class="dialog-success"></i>';
	}else if(type=="fail"){//失败
		confirmContent += '<i class="dialog-fail"></i>';
	}else if(type=="warning"){//警告
		confirmContent += '<i class="dialog-warn"></i>';
	}else if(type=="service"){//客服
		confirmContent += '<i class="dialog-service"></i>';
	}else if(type=="user"){//账户
		confirmContent += '<i class="dialog-user"></i>';
	}
	confirmContent += '<a href="javascript:;" class="dialog-close" ><i></i></a></div><p class="dialog-detail-m">' + str + '</p>';
	confirmContent += '<div class="sub-btn dialog-btn sub-placeholder1"><a href="javascript:;" class="sub-btn-l dialog-btn-l bg-orange">'+b1+'</a><a href="javascript:;" class="sub-btn-r dialog-btn-r">'+b2+'</a>';
	confirmContent += '</div></div>';
	confirmContents = $(confirmContent);
	confirmBox.append(confirmContents);
	$("body").append(confirmBox);
	$(".dialog-close").click(function () {
		hideConfirm();
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

//confirm 密码框
function pwdConfirm(b1,b2,callback1,callback2){
	hidePwdConfirm();
	var pwdBox = $('<div class="dialog dialog-pwd"></div>');
	var pwdContents;
	var pwdContent = '';
	pwdContent += '<div class="cover"></div><div class="dialog-content"><div class="dialog-style">';
	pwdContent += '<a href="javascript:;" class="dialog-close" ><i></i></a></div>';
	pwdContent += '<div class="dialog-input"><input type="password" placeholder="请输入密码"/></div>';
	pwdContent += '<div class="sub-btn dialog-btn sub-placeholder1"><a href="javascript:;" class="sub-btn-l dialog-btn-l bg-orange">'+b1+'</a><a href="javascript:;" class="sub-btn-r dialog-btn-r">'+b2+'</a>';
	pwdContent += '</div></div>';
	pwdContents = $(pwdContent);
	pwdBox.append(pwdContents);
	$("body").append(pwdBox);
	$(".dialog-close").click(function () {
		hidePwdConfirm();
	});
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









	
	