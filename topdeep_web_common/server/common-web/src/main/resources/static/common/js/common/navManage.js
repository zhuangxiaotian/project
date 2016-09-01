var NavManage = {};

var navMenus = null;
NavManage.navLocate = 0;

NavManage.initPage = function(){
	if(sessionStorage.navLocate != null){
		NavManage.navLocate = sessionStorage.navLocate;
	}

	if(sessionStorage.navMenus != null){
		navMenus = sessionStorage.navMenus;
		console.log("read navMenus");
		NavManage.loadMenus();
	}else{
		NavManage.ajaxQueryMenus();
	}
	
	$(".toggle-nav").click(function(){
		if(NavManage.navLocate == 0){
			NavManage.navLocate = 1;
		}else{
			NavManage.navLocate = 0;
		}
		sessionStorage.navLocate = NavManage.navLocate;
		NavManage.loadMenus();
	});
}

NavManage.ajaxQueryMenus = function(){
	NavManage.loadMenus();
}

NavManage.loadMenus = function(){
	if(NavManage.navLocate == 0){
		$(".top-navbar").hide();
		$(".left-navbar").show();
		$("#wrapper #page-wrapper").removeClass("page-wrapper");
	}else{
		$(".left-navbar").hide();
		$(".top-navbar").show();
		$("#wrapper #page-wrapper").addClass("page-wrapper");
	}
}


