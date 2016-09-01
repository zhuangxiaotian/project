<#macro htmlbody>
<!-- /.row -->
<div class="row">
    <div class="location">
        您所在的位置：客户服务><span>定制订阅</span>
    </div>
    <div class="panel panel-default sub-content clearfix">
        <div class="panel-body">
            <div class="col-xs-12">
                <div class="sub-title">
                    <span>邮件定制</span>
                </div>
            </div>
        </div>
        <table class="table table-post2 post-position customer-made">
            <tbody>
            <tr class="table-post-title">
                <td>定制内容</td>
                <td>是否定制</td>
            </tr>
            <tr>
                <td>持有基金净值日报</td>
                <td>
                    <input type="checkbox"/>
                </td>
            </tr>
            <tr>
                <td>基金交易确认</td>
                <td>
                    <input type="checkbox"/>
                </td>
            </tr>
            <tr>
                <td>账户修改确认</td>
                <td>
                    <input type="checkbox"/>
                </td>
            </tr>
            <tr>
                <td>持有基金净值周报</td>
                <td>
                    <input type="checkbox"/>
                </td>
            </tr>
            <tr>
                <td>月度对账单</td>
                <td>
                    <input type="checkbox"/>
                </td>
            </tr>
            </tbody>
        </table>
    </div>   <!--panel-->
    <div class="panel panel-default sub-content clearfix">
        <div class="panel-body">
            <div class="col-xs-12">
                <div class="sub-title">
                    <span>短信定制</span>
                </div>
            </div>
        </div>
        <table class="table table-post2 post-position customer-made">
            <tbody>
            <tr class="table-post-title">
                <td>定制内容</td>
                <td>是否定制</td>
            </tr>
            <tr>
                <td>账户交易确认</td>
                <td>
                    <input type="checkbox"/>
                </td>
            </tr>
            <tr>
                <td>基金交易确认</td>
                <td>
                    <input type="checkbox"/>
                </td>
            </tr>
            <tr>
                <td>基金交易确认-现金驿站</td>
                <td>
                    <input type="checkbox"/>
                </td>
            </tr>
            <tr>
                <td>持有基金日净值-周末</td>
                <td>
                    <input type="checkbox"/>
                </td>
            </tr>
            <tr>
                <td>短信账单</td>
                <td>
                    <input type="checkbox"/>
                </td>
            </tr>
            </tbody>
        </table>
    </div>   <!--panel-->
    <div class="panel panel-default sub-content clearfix">
        <div class="panel-body">
            <div class="col-xs-12">
                <div class="sub-title">
                    <span>纸质定制</span>
                </div>
            </div>
            <div class="col-xs-12">
                <dl class="risk-title">
                    <dd>是否进行纸质账单定制？</dd>
                </dl>
            </div>
            <div class="col-xs-12">
                <div class="row">
                    <div class="col-xs-6">
                        <div class="radio">
                            <label>
                                <i class="sub-radio sub-radio-s"></i>是
                            </label>
                        </div>
                    </div>
                    <div class="col-xs-6">
                        <div class="radio">
                            <label>
                                <i class="sub-radio sub-radio-no"></i>否
                            </label>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="bill-tip">
        <div class="bill-tip-title">温馨提示：短信及电子对账单每月月初发送；纸质季度对账单仅针对当季有交易客户发送。</div>
    </div>
    <div class="col-xs-12">
        <div class="fund-buy">
            <a href="#" id="confirm1" class="ibtn ibtn-blue ibtn-lg">定制</a>
        </div>
    </div>
</div>    <!--row-->

<div class="tipdialog" id="confirm11" style="display: none">
    <div class="tipdialog-overlay"></div>
    <div class="tipdialog-content">
        <div class="dialog_hd">
            <span class="title">请确认信息</span>
        </div>
        <div class="dialog_bd">
            <div class="dialog-input clearfix">
                <label class="input-title">电子邮箱：</label>
                <input type="text" class="form-control input-content" placeholder=" "/>
            </div>
            <div class="dialog-input clearfix">
                <label class="input-title">手机号码：</label>
                <input type="password" class="form-control input-content" placeholder=" "/>
            </div>
            <div class="dialog-input clearfix">
                <label class="input-title">邮<i class="text-placeholder">邮编</i>编：</label>
                <input type="email" class="form-control input-content" placeholder=" "/>
            </div>
            <div class="dialog-input clearfix">
                <label class="input-title">联系地址：</label>
                <input type="password" class="form-control input-content" placeholder=" "/>
            </div>
        </div>
        <div class="dialog-btn-m">
            <a href="javascript:void(0);" class="ibtn ibtn-blue blue-cover">确定</a>
        </div>
        <div class="tipdialog-close">
            <i class="close-s"></i>
        </div>
    </div>
</div>
</#macro>
<#include "../common/main.ftl">