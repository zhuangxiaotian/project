/**
 * Created by develop on 3/27/16.
 */
$(document).ready(function(){
    /*navSelect*/
    $('.nav-list-l li').each(function(){
        $(this).on('click',function(){
            $txt=$(this).text();
            $('.nav-select-l').html($txt);
        })
    })
    $('.nav-list-r li').each(function(){
        $(this).on('click',function(){
            $txt=$(this).text();
            $('.nav-select-r').html($txt);
        })
    })

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
    $('.tipdialog-close,.tipdialog-sure').on('click',function(){
        $('.tipdialog').fadeOut(500);
    })
    
    /*login*/
    function resizeLoginContent(){
//    	var screenHeight=$(window).height();
//    	var scrollHeight=$(window).scrollHeight();
    	var bodyHeight = $("body").height();
        var divHeight=$(".sub-login-content").height();
        if(bodyHeight>divHeight){
            $(".sub-login").css("height",bodyHeight);
        }else {
            $(".sub-login").css("height",divHeight);
        }
    }
    
    resizeLoginContent();
    
    $(window).resize(function(){
    	 resizeLoginContent();
    })
})