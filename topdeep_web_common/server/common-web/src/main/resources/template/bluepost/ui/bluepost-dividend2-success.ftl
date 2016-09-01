<#macro htmlbody>
<!-- /.row -->
<div class="row">
    <div class="location">
        您所在的位置：基金交易 > <span>分红设置</span>
    </div>
    <!--step2-->
    <div class="second-step">
            <div class="sub-step">
                <ul>
                    <li>
                        <img src="${base}/static/skin/${res.skin}/images/fund_step2.png" alt="第二步">
                    </li>
                    <li>
                        <span class="step1">修改分红方式</span>
                        <span class="step2">输入交易密码</span>
                        <span class="step3">修改结果</span>
                    </li>
                </ul>
            </div>
        <!--分红方式-->
        <div class="panel panel-default sub-content radiusClear">
            <table class="table table-post3">
                <tbody>
                <tr class="table-post-title">
                    <td>基金代码</td>
                    <td>基金名称</td>
                    <td>交易账号</td>
                    <td>分红方式</td>
                </tr>
                <tr>
                    <td>000545</td>
                    <td>现金驿站</td>
                    <td>
                        <i class="icon-boc"></i><span class="bank">中国银行</span>
                    </td>
                    <td>
                        <form class="form-inline">
                            <div class="form-group">
                                <div class="form-control post-select">
                                    <em class="bank-select">
                                        现金分红
                                    </em>
                                <span>
                                    <i class="caret"></i>
                                </span>
                                    <ul class="bank-list" style="display: none">
                                        <li>
                                            <a href="javascript:;">
                                                现金分红
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </form>
                    </td>
                </tr>
                <tr>
                    <td>2016-04-01</td>
                    <td>现金驿站</td>
                    <td>
                        <i class="icon-njcb"></i><span class="bank">中国南京银行</span>
                    </td>
                    <td>
                        <form class="form-inline">
                            <div class="form-group">
                                <div class="form-control post-select">
                                    <em class="bank-select">
                                        现金分红
                                    </em>
                                <span>
                                    <i class="caret"></i>
                                </span>
                                    <ul class="bank-list" style="display: none">
                                        <li>
                                            <a href="javascript:;">
                                                现金分红
                                            </a>
                                        </li>
                                        <li>
                                            <a href="javascript:;">
                                                红利再投
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </form>
                    </td>
                </tr>
                </tbody>
            </table>
            <div class="panel-body">
                <div class="sub-next-step">
                    <a href="javascript:void (0)" class="ibtn ibtn-blue blue-cover">下一步</a>
                </div>
            </div>
        </div> <!--panel-->
    </div>
</div> <!--row-->
        //confirm
<div class="tipdialog">
<div class="tipdialog-overlay"></div>
<div class="tipdialog-content">
    <div class="dialog_hd">
        <span class="title">输入交易密码</span>
    </div>
    <div class="dialog_bd">
        <input type="password" textmode="password" onpaste="return false" class="form-control" id="tradePwd_input" placeholder="请输入交易密码" maxLength="6"/>
    </div>
    <div class="dialog-btn">
            <div class="pull-left btn-margin-l"><a href="javascript:void(0);" class="ibtn ibtn-yellow yellow-cover" >再考虑下</a></div>
            <div class="pull-right btn-margin-r"><a href="javascript:void(0);" class="ibtn ibtn-blue blue-cover">继续交易</a></div>
    </div>
</div>
</div>
</#macro>
<#include "../common/main.ftl">