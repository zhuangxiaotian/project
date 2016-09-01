/**
 * Created by develop on 3/27/16.
 */
//navbar
function showNav(obj){
    var $obj = $(obj);
    var navid = '#' +'nav'+ obj.id;
    $(navid).show().siblings().hide();
}
//右侧浮动框
function rightFloat(){
    var r1=$(window).width(),
        r2=$(".post-container").width(),
        r3=(r1-r2)/ 2,
        r4=r2+r3+12;
    if(r1>1270){
        $(".post-code").css("left",r4);
    } else{
        $(".post-code").css("right",-10);
    }
}
$(document).ready(function(){
    rightFloat();
    $(window).resize(function(){
        rightFloat();
    });
});


$(document).ready(function(){
    $('#test1').on('click',function(){
        $(this).parent().find(".tipdialog").fadeIn(200);
    })
    $('#test11').on('click',function(){
        $(this).parent().find(".tipdialog").fadeIn(200);
    })
    $('#test111').on('click',function(){
        $(this).parent().find(".tipdialog").fadeIn(200);
    })
    $('#test333').on('click',function(){
        $('#test222').fadeOut(500);
    })
    $('.tipdialog-close,.tipdialog-sure,#tipdialog_btn').on('click',function(){
        $('.tipdialog').fadeOut(500);
    })


    /*中邮顶部导航样式切换*/
	 $(".post-nav>li").mousemove(function(){
		 	$(this).parent().find("li").removeClass("active");
	        $(this).addClass("active");
	        //$(".post-nav>li").find(".caret").removeClass("caret-up");
	        //$(this).find(".caret").addClass("caret-up");
	    })
	    
    $(".post-nav>li").click(function(){
    	$(this).parent().find("li").removeClass("active");
        $(this).addClass("active");
        $(".post-nav>li").find(".caret").removeClass("caret-up");
        $(this).find(".caret").addClass("caret-up");
    })

   
    //二级导航栏
    $(".post-nav-list li").click(function(){
        $(this).addClass("active").siblings().removeClass("active");
    })
    //tab
    $(".fund-select li").click(function(){
        $(this).addClass("current").siblings().removeClass("current");
    })
    //bank
    $(".bankCard>img").mouseenter(function(){
        $(".bank-card").removeClass("bank-card1");
        $(this).parent().parent().addClass("bank-card1");
    })
    $(".bankAdd").mouseenter(function(){
        $(".bank-card").removeClass("bank-card1");
        $(this).parent().parent().addClass("bank-card1");
    })
    $(".bankCard>img").mouseleave(function(){
        $(".bank-card").removeClass("bank-card1");
    })
    $(".bankAdd").mouseleave(function(){
        $(".bank-card").removeClass("bank-card1");
    })
    //radio
    $(".radio>label").click(function(){
        if(!$(this).find("i").hasClass("sub-radio-no")){
            $(".sub-radio").removeClass("sub-radio-s");
            $(this).find(".sub-radio").addClass("sub-radio-s");
        }
    })

    //confirm
    $("#confirm1").click(function(){
        $("#confirm11").fadeIn(200);
    })
    $("#confirm2").click(function(){
        $("#confirm22").fadeIn(200);
    })
    $("#confirm3").click(function(){
        $("#confirm33").fadeIn(200);
    })
    $("#confirm4").click(function(){
        $("#confirm44").fadeIn(200);
    })
    $("#confirm5").click(function(){
        $("#confirm55").fadeIn(200);
    })
    $("#confirm6").click(function(){
        $("#confirm66").fadeIn(200);
    })

    //select
    $(".post-select").click(function() {
        $(this).find(".bank-list").slideToggle(100);
    })
    $('.bank-list li').bind('click', function(){
        selectValue=$(this).find("a").html();
        $(this).parent().parent().find('.bank-select').html(selectValue);
    });

})



