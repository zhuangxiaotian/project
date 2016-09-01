//navbar-select
$(document).ready(function(){
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
})




