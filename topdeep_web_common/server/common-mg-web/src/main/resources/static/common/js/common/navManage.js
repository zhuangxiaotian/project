var NavManage = {};

NavManage.navMenus = null;
NavManage.rightMenus = null;
NavManage.switchMenus = null;
NavManage.navLocate = 0;
NavManage.contextPath = contextPath;

NavManage.initPage = function(navQueryUrl){
	if(sessionStorage.getItem("navLocate") != null){
		NavManage.navLocate = sessionStorage.getItem("navLocate");
	}

	if(sessionStorage.navMenus != null && sessionStorage.navMenus != "null" && sessionStorage.rightMenus != null && sessionStorage.rightMenus != "null" && sessionStorage.switchMenus != null && sessionStorage.switchMenus != "null"){
		NavManage.navMenus = eval(sessionStorage.navMenus);
		if(sessionStorage.rightMenus!="rightMenus")
		{
		NavManage.rightMenus = eval(sessionStorage.rightMenus);
		NavManage.switchMenus = eval(sessionStorage.switchMenus);
//		console.log("read navMenus");
		NavManage.loadTopMenus();		
		}
		NavManage.loadLeftMenus();		
		if(sessionStorage.rightMenus!="rightMenus")
		{
		NavManage.loadMenus();
		NavManage.loadRightMenus();
		NavManage.loadSwitchMenus();
		}
	}else{
		NavManage.ajaxQueryMenus(navQueryUrl);
	}
	
	$(".toggle-nav").click(function(){
		if(NavManage.navLocate == 0){
			NavManage.navLocate = 1;
		}else{
			NavManage.navLocate = 0;
		}
		sessionStorage.setItem("navLocate", NavManage.navLocate);
		NavManage.loadMenus();
	});
	
	$("#GztUSV_QMC3Be4mCFAM-w\\.\\.c").on("click",".wUviiOAT2iccSCF6I3UQg\\.\\.D", function(){
		NavManage.clearMenuCache();
		return true;
	});
	
	$("#n2BOwlyRSqE0Uj7xE9B8g\\.\\.A").on("click", ".switchMenu", function(){
		var target = $(this).attr("target");
		NavManage.ajaxSwitchMenu(target);
		return false;
	});
}

NavManage.ajaxQueryMenus = function(navQueryUrl){
	$.ajax({
		type : "POST",
		url : NavManage.contextPath + navQueryUrl,
		data : {},
		datatype : "json",
		success:function(result){
			if(result.success){
				if(result.menuList != null){
					NavManage.navMenus = result.menuList;
					sessionStorage.navMenus = JSON.stringify(NavManage.navMenus);
				}
				if(result.rightMenuList != null){
					NavManage.rightMenus = result.rightMenuList;
					sessionStorage.rightMenus = JSON.stringify(NavManage.rightMenus);
				}
				if(result.switchMenuList != null && result.switchMenuList.length > 0){
					NavManage.switchMenus = result.switchMenuList;
					sessionStorage.switchMenus = JSON.stringify(NavManage.switchMenus);
				}
				NavManage.loadTopMenus();		
				NavManage.loadLeftMenus();		
				NavManage.loadMenus();
				NavManage.loadRightMenus();
				NavManage.loadSwitchMenus();
				$("#side-menu li").click(function(){
					$this = $(this);
					if(!$this.hasClass("active")){
						$("#side-menu li").each(function(){
							$(this).removeClass("active");
							$ul = $(this).find("ul");
							$ul.attr("aria-expanded","false");
							$ul.removeClass("in");
						})
						$this.addClass("active");
						$ul = $this.find("ul");
						$ul.attr("aria-expanded",true);
						$ul.addClass("in");
					}else{
						$this.removeClass("active");
						$ul = $this.find("ul");
						$ul.attr("aria-expanded",false);
						$ul.removeClass("in");
					}
				})
			}
		},
		error : function() {
			alert("查询菜单失败!");
		}
	});
}

NavManage.ajaxSwitchMenu = function(targetUrl){
	$.ajax({
		type : "POST",
		url : targetUrl,
		data : {},
		datatype : "json",
		success:function(result){
			if(result.success){
				NavManage.clearMenuCache();
				if(result.redirectUrl){
					location.href = result.redirectUrl;
				}else{
					location.reload(true);	
				}
			}else{
				alert(result.tipMessage);
			}
		},
		error : function() {
			alert("切换失败!");
		}
	});
}


NavManage.loadRightMenus = function(){
	if(NavManage.rightMenus == null){
		return;
	}
	var $rightSelectMenu = $("#right_menu");
	var menustr = "";
	$rightSelectMenu.empty();
	for(var i=0;i<NavManage.rightMenus.length;i++){
		var menu = NavManage.rightMenus[i];
		if(i==0){
			menustr += '<li><a href="'+NavManage.contextPath+menu.value+'">'+menu.name+'</a></li>';
		}else{
			menustr += '<li class="divider"></li><li><a href="'+NavManage.contextPath+menu.value+'">'+menu.name+'</a></li>';
		}
	}
	$rightSelectMenu.append($(menustr));
}

NavManage.loadSwitchMenus = function(){
	if(NavManage.switchMenus == null){
		return;
	}
	if(NavManage.switchMenus.length == 0){
		return;
	}
	var $switchMenu = $("#n2BOwlyRSqE0Uj7xE9B8g\\.\\.A");
	var $switchSelectMenu = $("#GztUSV_QMC3Be4mCFAM-w\\.\\.c");
	var $switchFirstLabel = $("#qvjxt4XRo6_xSExqBkZdw\\.\\.U");
	$switchFirstLabel.html(NavManage.switchMenus[0].name);
	$switchSelectMenu.empty();
	if(NavManage.switchMenus.length > 1){
		for(var i=1;i<NavManage.switchMenus.length;i++){
			var menu = NavManage.switchMenus[i];
			var menuStr = '<li><a class="wUviiOAT2iccSCF6I3UQg..D switchMenu" href="#" target="'+NavManage.contextPath+menu.value+'">'+menu.name+'</a></li>';
			$switchSelectMenu.append($(menuStr));
		}
	}
	$switchMenu.show();
}

NavManage.loadMenus = function(){
	if(NavManage.navMenus == null){
		return;
	}
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

NavManage.loadLeftMenus = function(){
	sessionStorage.activeUrl = window.location.href; 
	if(NavManage.navMenus == null){
		return;
	}
	var $leftNav = $("#side-menu");
	$("#side-menu > li").each(function(index){
		if(!$(this).hasClass("sidebar-search")){
			$(this).remove();
		}
	});
	for(var i=0;i<NavManage.navMenus.length;i++){
		var menu = NavManage.navMenus[i];
		var $li = $("<li></li>");
		$leftNav.append($li);
		if(menu.childList.length > 0){
			$li.addClass("dropdown");
			var $a = $("<a href='javascript:void(0)'>"+menu.name+"<span class='fa arrow'></span></a>");
			$li.append($a);
			var $ul = $("<ul class='nav nav-second-level collapse' aria-expanded='false'></ul>");
			$li.append($ul);
			var findActive = false;
			var activeMenuUrl = location.href; 
			for(var j=0;j<menu.childList.length;j++){
				var childMenu = menu.childList[j];
				if(activeMenuUrl.indexOf(childMenu.url)>=0){
					findActive = true;
				}
			}
			if(!findActive && sessionStorage.activeUrl){
				activeMenuUrl = sessionStorage.activeUrl;
			}
			for(var j=0;j<menu.childList.length;j++){
				var childMenu = menu.childList[j];
				if(activeMenuUrl.indexOf(childMenu.url)>=0){
					$li.addClass("active");
					var $childLi = $("<li><a href='"+NavManage.contextPath+childMenu.url+"' class='active'>"+childMenu.name+"</a></li>");
					$ul.append($childLi);
					$ul.attr("aria-expanded","true");
					$ul.addClass("in");
				}else{
					var $childLi = $("<li><a href='"+NavManage.contextPath+childMenu.url+"'>"+childMenu.name+"</a></li>");
					$ul.append($childLi);
				}
			}
		}else{
			var $a = $("<a href='"+NavManage.contextPath+menu.url+"'>"+menu.name+"</a>");
			$li.append($a);
		}
	}
}

NavManage.loadTopMenus = function(){
	if(NavManage.navMenus == null){
		return;
	}
	var $topNav = $(".top-navbar .sub-nav");
	$topNav.empty();
	for(var i=0;i<NavManage.navMenus.length;i++){
		var menu = NavManage.navMenus[i];
		var $li = $("<li></li>");
		$topNav.append($li);
		if(menu.childList.length > 0){
			$li.addClass("dropdown");
			var $a = $("<a href='javascript:void(0)' class='dropdown-toggle' data-toggle='dropdown' role='button' aria-haspopup='true' aria-expanded='false'>"+menu.name+"<span class='caret'></span></a>");
			$li.append($a);
			var $ul = $("<ul class='dropdown-menu sub-nav-list'></ul>");
			$li.append($ul);
			for(var j=0;j<menu.childList.length;j++){
				var childMenu = menu.childList[j];
				var $childLi = $("<li><a href='"+NavManage.contextPath+childMenu.url+"'>"+childMenu.name+"</a></li>");
				$ul.append($childLi);
			}
		}else{
			var $a = $("<a href='"+NavManage.contextPath+menu.url+"'>"+menu.name+"</a>");
			$li.append($a);
		}
	}
}

NavManage.clearMenuCache = function(){
	sessionStorage.navMenus = null;
	sessionStorage.rightMenus = null;
	sessionStorage.switchMenus = null;
	sessionStorage.activeUrl = null;
}
