<#macro htmlbody>
<!-- /.row -->
<div class="row">
<div class="col-xs-12">
    <div class="location">
        您所在的位置：<span>我的资产</span>
    </div>
</div>
<div class="col-xs-12">
    <div class="welcome">
        尊敬的Yzhu 先生，上午/下午/晚上好，欢迎回到中邮！
    </div>
</div>
<!--我的资产-->
<div class="panel panel-default sub-content clearfix">
    <div class="panel-body">
        <div class="col-xs-12">
            <div class="sub-title">
                <span>我的confirm</span>
                <i class="post-date">(2016-11-11)</i>
            </div>
        </div>
        <div class="col-xs-12">
            <div class="fund-buy">
                <a href="javascript:void(0)" class="button button-3d button-orange button-rounded" id="confirm1">confirm1</a>
                <a href="javascript:void(0)" class="button button-3d button-orange button-rounded" id="confirm2">confirm2</a>
                <a href="javascript:void(0)" class="button button-3d button-orange button-rounded" id="confirm3">confirm3</a>
            </div>
        </div>
        <div class="col-xs-12">
            <div class="fund-buy">
                <a href="javascript:void(0)" class="button button-3d button-orange button-rounded" id="confirm4">confirm4</a>
                <a href="javascript:void(0)" class="button button-3d button-orange button-rounded" id="confirm6">confirm5</a>
                <a href="javascript:void(0)" class="button button-3d button-orange button-rounded" id="confirm5">loading</a>
            </div>
        </div>
    </div>
</div>
</div> <!--row-->


<!--confirm1-->
<div class="tipdialog" id="confirm11" style="display: none">
    <div class="tipdialog-overlay"></div>
    <div class="tipdialog-content">
        <div class="dialog_hd">
            <span class="title">输入交易密码</span>
        </div>
        <div class="dialog_bd">
            <input type="text" class="form-control" placeholder="请输入交易密码"/>
            <a href="javascript:;">
                <img src="${base}/static/skin/${res.skin}/images/keyboard.gif" alt="键盘"/>
            </a>
        </div>
        <div class="dialog-btn">
            <div class="pull-left btn-margin-l"><a href="javascript:void(0);" class="ibtn ibtn-yellow yellow-cover" >再考虑下</a></div>
            <div class="pull-right btn-margin-r"><a href="javascript:void(0);" class="ibtn ibtn-blue blue-cover">继续交易</a></div>
        </div>
        <div class="tipdialog-close">
            <i></i>
        </div>
    </div>
</div>
<!--confirm2-->
<div class="tipdialog" id="confirm22" style="display: none">
    <div class="tipdialog-overlay"></div>
    <div class="tipdialog-content">
        <div class="dialog_bd">
            <span>两次密码输入不一致，请重新输入</span>
        </div>
        <div class="tipdialog-close">
            <i></i>
        </div>
    </div>
</div>
<!--confirm3-->
<div class="tipdialog" id="confirm33" style="display: none">
    <div class="tipdialog-overlay"></div>
    <div class="tipdialog-content">
        <div class="dialog_hd">
            <span class="title">消息提示</span>
        </div>
        <div class="dialog_bd">
            <span>没有修改分红方式操作</span>
        </div>
        <div class="dialog-btn1">
            <a href="javascript:void(0);" >我知道了</a>
        </div>
        <div class="tipdialog-close">
            <i></i>
        </div>
    </div>
</div>
<!--confirm4-->
<div class="tipdialog" id="confirm44" style="display: none">
<div class="tipdialog-overlay"></div>
<div class="tipdialog-content">
    <div class="dialog_hd">
        <span class="title">信息提示</span>
    </div>
    <div class="dialog_bd">
        <ul>
            <li>
                <img src="${base}/static/skin/${res.skin}/images/icon_warning.png" alt="warning"/>
            </li>
            <li class="dialog_detail">
                <span class="warning">你还没有做过风险测评</span>
            </li>
        </ul>
    </div>
    <div class="dialog-btn">
        <div class="pull-left btn-margin-l"><a href="javascript:void(0);" class="ibtn ibtn-yellow yellow-cover" >返回</a></div>
        <div class="pull-right btn-margin-r"><a href="javascript:void(0);" class="ibtn ibtn-blue blue-cover">去做测评</a></div>
    </div>
    <div class="tipdialog-close">
        <i></i>
    </div>
</div>
</div>
<!--confirm5-->
<div class="tipdialog" id="confirm66" style="display: none">
    <div class="tipdialog-overlay"></div>
    <div class="tipdialog-content">
        <div class="dialog_hd">
            <span class="title">消息提示</span>
        </div>
        <div class="dialog_bd">
            <span>此处省略．．．．．．．．．．</span>
        </div>
        <div class="dialog-btn-m">
            <a href="javascript:void(0);" class="ibtn ibtn-blue blue-cover tipdialog-sure">确定</a>
        </div>
        <!--<div class="tipdialog-close">-->
            <!--<i></i>-->
        <!--</div>-->
    </div>
</div>

<!--loading-->
<div class="tipdialog" id="confirm55" style="display: none">
<div class="tipdialog-overlay"></div>
<div class="tipdialog-loading">
    <img src="${base}/static/skin/${res.skin}/images/loading.gif" alt="loading"/>
</div>
</div>

</#macro>
<#include "../common/main.ftl">