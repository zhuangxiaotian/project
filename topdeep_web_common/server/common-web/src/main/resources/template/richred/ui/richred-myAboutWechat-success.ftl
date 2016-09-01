<#macro jsimport>
</#macro>
<#macro htmlbody>
    <header class="header">
        <div class="hl">
            <a href="javascript:history.go(-1);">
                <i class="icon-left"></i>
            </a>
        </div>
        <div class="title">
            关注微信
        </div>
        <div class="hr">
            &nbsp;
        </div>
    </header>
    <div class="sub-tip sub-padding">
        诺安微信服务号为您提供便捷、一站式理财服务，指尖尽享便捷交易！还可参与微信多重优惠活动，立即关注我们吧！关注方法如下：
    </div>
    <div class="sub-tip sub-placeholder">
        <div class="flex fontsize-14">
            <div>1.</div>
            <div>
                在微信中搜索诺安基金官方微信服务号：
                <div><strong class="red" id="qrcode">Lionfund</strong> 或者 <strong class="red">诺安基金管理有限公司</strong></div>
            </div>
        </div>

    </div>
    <div class="sub-tip">
        <div class="flex fontsize-14">
            <div>2.</div>
            <div>
                保存下图到手机相册后，用微信二维码扫描此截屏即可立即关注
            </div>
        </div>
    </div>
    <div class="sub-tip center sub-padding">
        <img  class="erweima" src="${base}/static/skin/${res.skin}/images/lionerweima.png" alt="二维码"/>
    </div>
    <!-- 
	    <div class="sub-btn sub-placeholder sub-padding">
	        <a href="javascript:;" class="sub-btn1" id="getQrcode">复制微信号</a>
	    </div>
    -->
</#macro>
<#include "../common/main.ftl">