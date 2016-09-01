<#macro htmlbody>
<!-- /.row -->
<div class="row">
    <div class="location">
        您所在的位置：安全设置 ><span>修改交易密码</span>
    </div>
<!--修改密码-->
<div class="panel panel-default sub-content radiusClear">
    <div class="panel-body">
        <div class="sub-title">
            <span>修改交易密码</span>
        </div>
    </div>
    <div class="panel-body">
        <div class="col-xs-4"></div>
        <div class="col-xs-4">
            <form class="form-horizontal post-code-create">
                <div class="form-group">
                    <label  class="col-xs-4 control-label">原密码：</label>
                    <div class="col-xs-8">
                        <input type="password" class="form-control post-code-input"  placeholder="请输入原密码">
                        <a href="javascript:;">
                                <img src="${base}/static/skin/${res.skin}/images/keyboard.gif" alt="键盘"/>
                        </a>
                    </div>
                </div>
                <div class="form-group">
                    <label  class="col-xs-4 control-label">新密码：</label>
                    <div class="col-xs-8">
                        <input type="password" class="form-control post-code-input"  placeholder="请输入新密码">
                        <a href="javascript:;">
                                <img src="${base}/static/skin/${res.skin}/images/keyboard.gif" alt="键盘"/>
                        </a>
                    </div>
                </div>
                <div class="form-group">
                    <label  class="col-xs-4 control-label">确认新密码：</label>
                    <div class="col-xs-8">
                        <input type="password" class="form-control post-code-input"  placeholder="请输入新密码">
                        <a href="javascript:;">
                                <img src="${base}/static/skin/${res.skin}/images/keyboard.gif" alt="键盘"/>
                        </a>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-xs-8 col-xs-offset-4" >
                        <a href="${base}/ui/bluepost.action?type=password2" class="btn ibtn-blue btn-block blue-cover">确定修改</a>
                    </div>
                </div>
            </form>
        </div>
        <div class="col-xs-4"></div>

    </div>
</div> <!--panel-->
</div> <!--row-->
</#macro>
<#include "../common/main.ftl">