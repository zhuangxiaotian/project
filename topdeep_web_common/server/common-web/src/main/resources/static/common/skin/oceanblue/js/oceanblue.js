//弹出框 只有确认按钮
function showAlert(str,callback){
    if(false){
        alert(str);
        if(callback){
            callback();
        }
    }
    hideAlert();
    var alertBoxMask = $('<div class="dialog dialog-alert"></div>');
    var alertBox;
    var alertBox_h = '';
    alertBox_h += '<div class="alert-content">';
    alertBox_h += '<h3>提示</h3>';
    alertBox_h += '<p>'+ str +'</p>';
    alertBox_h += '<div class="alertBtn">确认</div>';
    alertBox_h += '<div class="clearfix"></div>';
    alertBox_h += '</div>';
    alertBox = $(alertBox_h);
    alertBoxMask.append(alertBox);

    $("body").append(alertBoxMask);
    $(".dialog-alert").height(window.screen.height);
    $(".alert-content .alertBtn").click(function(){
        if(callback){
            callback();
        }
        hideAlert();
    });
}
function hideAlert(){
    if($(".dialog-alert")){
        $(".dialog-alert").remove();
    }
}

//初始化上拉刷新组件
function setPullLoad(wraTop,callback,className){
    var o = className?className:"iscroll_wrapper";
    $("body").css("position","inherit")
    $('.'+o).css("top",wraTop);
    var myScroll = new IScroll($('.'+o)[0], {
        scrollX: false,
        scrollY: true,
        mouseWheel: true,
        click: true
    });
    myScroll.on('scrollMove', function() {
        var $wrapper = $(this.wrapper);
        var $pullUp = $wrapper.find('.pullup');
        if (this.maxScrollY - this.y > 40) {
            $pullUp.addClass('flip').find('.label').html('松开加载更多...');
        } else {
            $pullUp.removeClass('flip').find('.label').html('上拉加载更多...');
        }
    });
    myScroll.on('scrollEnd', function() {
        if(!$('.pullup').is(':hidden')){
            var $wrapper = $(this.wrapper);
            var $pullUp = $wrapper.find('.pullup');
            if ($pullUp.hasClass('flip')) {
                $pullUp.removeClass('flip').addClass('loading').find('.label').html('加载中...');
                pullUpAction($wrapper);
            }
        }
    });
    function pullUpAction($wrapper) {
        if(!callback){
            var $pullUp = $wrapper.find('.pullup');
            setTimeout(function() {
                $pullUp.removeClass('flip loading').find('.label').html('上拉加载更多...');
                myScroll.refresh();
            }, 3000);
        }else{
            callback(function(){
                myScroll.refresh();
                $(".pullup").removeClass("loading");
            });
        }
    }
}