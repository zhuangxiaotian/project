<#macro jsimport>
 <script>
 $(document).ready(function(){
     var wHeight=$(window).height(),
             aboutHeight=wHeight-385;
     $(".about-detail").css("min-height",aboutHeight);
 })
    </script>
</#macro>
<#macro htmlbody>
<div id="box">
    <header class="header">
        <div class="hl">
            <a href="javascript:history.go(-1);">
                <i class="icon-left"></i>
            </a>
        </div>
        <div class="title">
            关于诺安基金
        </div>
        <div class="hr">
            &nbsp;
        </div>
    </header>
    <ul class="sub-list1 shadow-bottom">
        <li class="about-content">
                <span class="about">
                    <img src="${base}/static/skin/${res.skin}/images/icon_logo.png" alt="logo"/>
                    <div class="red about-title">
                        <p>诺安基金</p>
                        <p class="font-color edition">V1.0.00</p>
                    </div>
                </span>
            <div class="about-detail">
              	<div class="about-na">诺安基金管理有限公司成立于2003年12月，首批获得了专户理财资格和QDII境外投资资格。截至2016年二季度末，旗下管理着近<strong class="red">50只</strong>开放式基金，公募资管规模超过<strong class="red">1000亿元</strong>，排名市场上全部百余家基金公司<strong class="red">第19位</strong>。</div>
              	<div class="about-na"><strong class="red">“智_汇财富 稳_见未来”</strong>，诺安基金管理有限公司致力于以科学严谨的专业知识，具有强大的投研团队，特色的人才激励机制以及严格的风险控制制度，以稳健的风格，以卓越的远见在瞬息万变的市场中为投资者实现长期持久的投资回报。</div>
            </div>
        </li>
    </ul>
    <ul class="sub-list1 shadow-bottom">
        <a href="javascript:;">
            <li>
                    <span class>
                    <i class="icon-wechat"></i>
                    关注微信
                </span>
                <span class="sub-r">
                    <i class="icon-right-red"></i>
                </span>
            </li>
        </a>
        <a href="javascript:;">
            <li>
                    <span class>
                    <i class="icon-service1"></i>
                    客服热线
                </span>
                <span class="sub-r">
                    400-888-8998
                    <i class="icon-right-red"></i>
                </span>
            </li>
        </a>
        <a href="javascript:;">
            <li>
                    <span class>
                    <i class="icon-lion"></i>
                    诺安官网
                </span>
                <span class="sub-r">
                    www.lionfund.com.cn
                    <i class="icon-right-red"></i>
                </span>
            </li>
        </a>

        <a href="javascript:;">
            <li class="about-border">
                    <span class>
                    <i class="icon-erwei"></i>
                    扫描下载客户端
                </span>
                <span class="sub-r">
                    <i class="icon-right-red"></i>
                </span>
            </li>
        </a>
    </ul>
</div>
<div class="warm-tips">
    <div class="copyright">诺安基金管理有限公司版权所有</div>
</div>
</#macro>
<#include "../common/main.ftl">