<#macro htmlbody>
<div class="section">
     <header class="header">
        <div class="avatar">
            <i class="icon-photo"></i>
        </div>
        <div class="hr">
            <div class="sub-btn my-btn">
                <a href="${base}/ui/richred.action?type=myAlready" class="sub-btn-l">登录</a>
                <a href="javascript:;" class="sub-btn-r bg-orange">注册</a>
            </div>
        </div>
    </header>
    <ul class="sub-list sub-margin-d">
        <!--<a href="javascript:;">-->
            <!--<li>-->
                <!--<span class>-->
                    <!--<i class="icon-redpackets"></i>-->
                    <!--我的红包/代金券-->
                <!--</span>-->
                <!--<span class="sub-r">-->
                    <!--<i class="icon-right-red"></i>-->
                <!--</span>-->
            <!--</li>-->
        <!--</a>-->
        <a href="javascript:;">
            <li>
                <span class="fontsize-15">
                    <i class="icon-bankcard"></i>
                    我的银行卡
                </span>
                <span class="sub-r">
                    <i class="icon-right-red"></i>
                </span>
            </li>
        </a>
        <a href="javascript:;">
            <li>
                <span class="fontsize-15">
                    <i class="icon-investment"></i>
                    我的定投
                </span>
                <span class="sub-r">
                    <i class="icon-right-red"></i>
                </span>
            </li>
        </a>
    </ul>
    <ul class="sub-list sub-margin-d">
        <a href="javascript:;">
            <li>
                <span class="fontsize-15">
                    <i class="icon-msg"></i>
                    消息中心
                </span>
                <span class="sub-r">
                    <i class="icon-right-red"></i>
                </span>
            </li>
        </a>
        <a href="javascript:;">
            <li>
                <span class="fontsize-15">
                    <i class="icon-service"></i>
                    客服与帮助
                </span>
                <span class="sub-r">
                    <i class="icon-right-red"></i>
                </span>
            </li>
        </a>
        <a href="javascript:;">
            <li>
                <span class="fontsize-15">
                    <i class="icon-friend"></i>
                    邀请好友
                </span>
                <span class="sub-r">
                    <i class="icon-right-red"></i>
                </span>
            </li>
        </a>
    </ul>
    <ul class="sub-list">
        <a href="javascript:;">
            <li>
                <span class="fontsize-15">
                    <i class="icon-about"></i>
                    关于诺安基金
                </span>
                <span class="sub-r">
                    400-888-8998
                    <i class="icon-right-red"></i>
                </span>
            </li>
        </a>
        <a href="javascript:;" id="editionUpdate">
            <li>
                <span class="fontsize-15">
                    <i class="icon-edition"></i>
                    版本更新
                </span>
                <span  class="sub-r">
                    当前版本V1.1
                    <em class="sub-yes">有更新</em>
                    <i class="icon-right-red"></i>
                </span>
            </li>
        </a>
    </ul>
</div>
<div class="tab-placeholder"></div>
<footer class="footer">
    <ul class="index-tab">
        <li>
            <a href="${base}/ui/richred.action?type=index">
                <i class="icon-home"></i>
                <p>首页精选</p>
            </a>
        </li>
        <li>
            <a href="${base}/ui/richred.action?type=fundManage">
                <i class="icon-finance"></i>
                <p>基金理财</p>
            </a>
        </li>
        <li>
            <a href="${base}/ui/richred.action?type=myAssets">
                <i class="icon-assets"></i>
                <p>我的资产</p>
            </a>
        </li>
        <li class="active">
            <a href="javascript:void(0)">
                <i class="icon-account"></i>
                <p>我的</p>
            </a>
        </li>
    </ul>
</footer>
</#macro>
<#include "../common/main.ftl">