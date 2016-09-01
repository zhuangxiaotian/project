<#macro htmlbody>
<div class="section">
    <header class="header">
        <div class="avatar">
            <img src="${base}/static/skin/${res.skin}/images/icon_photo.png" alt="头像">
        </div>
        <div class="hl">
            <div class="personal-msg">
                <p class="">您好，周吴郑王</p>
                <p><i class="icon-user"></i>已实名认证</p>
                <span><i class="icon-phone1"></i>已绑定<em class="red">13866668888</em></span>
            </div>
        </div>
        <div class="my-set">
            <a href="${base}/ui/richred.action?type=mySet">
                <i class="icon-setting"></i>
            </a>
        </div>
    </header>
    <ul class="sub-list1 sub-margin-d">
        <!--<a href="javascript:;">-->
        <!--<li>-->
        <!--<span>-->
        <!--<i class="icon-redpackets"></i>-->
        <!--我的红包/代金券-->
        <!--</span>-->
        <!--<span class="sub-r">-->
        <!--<span>5个可用</span>-->
        <!--<i class="icon-right"></i>-->
        <!--</span>-->
        <!--</li>-->
        <!--</a>-->
        <a href="${base}/ui/richred.action?type=myBankcard1">
            <li>
                    <span class="fontsize-15">
                    <i class="icon-bankcard"></i>
                    我的银行卡
                </span>
                <span class="sub-r">
                    <span>3张</span>
                    <i class="icon-right"></i>
                </span>
            </li>
        </a>
        <a href="${base}/ui/richred.action?type=myInvestment1">
            <li>
                    <span class="fontsize-15">
                    <i class="icon-investment"></i>
                    我的定投
                </span>
                <span class="sub-r">
                    <span>2个</span>
                    <i class="icon-right"></i>
                </span>
            </li>
        </a>
    </ul>
    <ul class="sub-list1 sub-margin-d">
        <a href="${base}/ui/richred.action?type=myMsg1">
            <li>
                    <span class="fontsize-15">
                    <i class="icon-msg"></i>
                    消息中心
                </span>
                <span class="sub-r">
                    <em class="sub-count">55</em>
                    <i class="icon-right"></i>
                </span>
            </li>
        </a>
        <a href="${base}/ui/richred.action?type=myService1">
            <li>
                    <span class="fontsize-15">
                    <i class="icon-service"></i>
                    客服与帮助
                </span>
                <span class="sub-r">
                    <i class="icon-right"></i>
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
                    <i class="icon-right"></i>
                </span>
            </li>
        </a>
    </ul>
    <ul class="sub-list1">
        <a href="${base}/ui/richred.action?type=myAbout">
            <li>
                    <span class="fontsize-15">
                        <i class="icon-about"></i>
                        关于诺安基金
                    </span>
                    <span class="sub-r">
                         400-888-8998
                        <i class="icon-right"></i>
                    </span>
            </li>
        </a>
        <a href="javascript:;">
            <li>
                    <span class="fontsize-15">
                        <i class="icon-edition"></i>
                        版本更新
                    </span>
                    <span  class="sub-r">
                         当前版本V1.1
                        <em class="sub-yes">有更新</em>
                        <i class="icon-right"></i>
                    </span>
            </li>
        </a>
    </ul>
    <div class="sub-btn sub-placeholder">
        <a href="${base}/ui/richred.action?type=my" class="sub-btn1">退出登录</a>
    </div>
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