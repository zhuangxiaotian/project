<#macro htmlbody>
<header class="header">
    <div class="hl">
        <a href="javascript:history.go(-1);">
            <i class="icon-left"></i>
        </a>
    </div>
    <div class="title">
        添加定投
    </div>
    <div class="hr">
        &nbsp;
    </div>
</header>
<ul class="sub-form">
    <li class="login-list">
        <label>基金名称</label>
        <div class="sub-input">
            <a href="javascript:history.go(-1);">
                <span>诺安成长混合(000818)</span>
                <i class="icon-right-red sub-float"></i>
            </a>
        </div>
    </li>
    <li class="login-list">
        <label>资金来源</label>
        <div class="sub-box">
            <div class="sub-input">
                <a href="javascript:;">
                    <i class="bank-b002"></i>
                    <span>工商银行</span><em class="fontsize-14">[7007]</em>
                    <i class="icon-right-red sub-float"></i>
                </a>
            </div>
        </div>
    </li>

    <li class="login-list">
        <label>定投周期</label>
        <div class="sub-input">
            <a href="${base}/ui/richred.action?type=setTime">
                <span>每月15日</span>
                <i class="icon-right-red sub-float"></i>
            </a>
        </div>
    </li>
    <li class="login-list">
        <label>定投金额</label>
        <div class="sub-input">
            <input type="text" placeholder="请输入定投金额">
        </div>
    </li>
</ul>
<div class="sub-check sub-check1">
    <i class="icon-checkbox"></i>
    <span>我已经阅读并同意<a href="javascript:;" class="orange">《诺安基金定投协议》</a></span>
</div>
<div class="sub-btn sub-placeholder1">
    <a href="javascript:;" class="sub-btn-l bg-orange">取消</a>
    <a href="javascript:;" class="sub-btn-r">保存</a>
</div>
</#macro>
<#include "../common/main.ftl">