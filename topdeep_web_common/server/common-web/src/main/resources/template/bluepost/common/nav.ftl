<div class="navbar navbar-static-top sub-navbar" role="navigation" >
    <div class="nav-top">
        <div class="container post-container">
            <div class="nav-top-title">
                <a class="pull-left" href="#">
                    <i class="icon-phone"></i>
                    400-880-1618
                </a>
            </div>
            <div class="open-account pull-right">
                <a href="#">[免费开户]</a>
            </div>
        </div>
    </div>
    <div class="nav-middle">
        <div class="container post-container">
            <!--<div class="navbar-header nav-top-title">-->
                <!--<a class="navbar-brand post-logo1 pull-left" href="#">-->
                    <!--<img src="${base}/static/skin/${res.skin}/images/logo1.png" alt="phone">-->
                <!--</a>-->
                <!--<button type="button" class="navbar-toggle collapsed sub-bar" data-toggle="collapse" aria-expanded="false" data-target=".navbar-collapse">-->
                    <!--<span class="icon-bar"></span>-->
                    <!--<span class="icon-bar"></span>-->
                    <!--<span class="icon-bar"></span>-->
                <!--</button>-->
            <!--</div>-->
            <div class="qrcode">
            	<div><img src="${base}/static/skin/${res.skin}/images/qrcode_watch.png" alt="中邮订阅号"/></div>
            	<div class="qrcode-style">中邮订阅号</div>
            </div>
            <div class="qrcode">
            	<div><img src="${base}/static/skin/${res.skin}/images/qrcode_service.png" alt="中邮服务号"/></div>
            	<div class="qrcode-style">中邮服务号</div>
            </div>
            <div class="qrcode">
            	<div><img src="${base}/static/skin/${res.skin}/images/qrcode_licai.png" alt="中邮微理财"/></div>
            	<div class="qrcode-style">中邮微理财</div>
            </div>
            <div class="open-account pull-right">
                <span style="display: none"> 您好，<a href="#" class="login-please">请登录</a></span>
                <span style="display: block"> 您好，<a href="#" class="login-please">Yuzhu</a><a href="#" class="login-out">[安全退出]</a><a href="#" class="login-out">[返回首页]</a></span>
            </div>
        </div>
    </div>
    <div class="nav-bottom">
        <div class="container post-container">
            <div class="post-logo2">
                <a href="#">
                    <img src="${base}/static/skin/${res.skin}/images/logo2.png" alt="phone"/>
                </a>
            </div>
            <div class="post-navbar">
                <ul class="nav navbar-nav post-nav">
                    <li>
                        <a href="${base}/ui/bluepost.action?type=assets2">我的资产</a>
                    </li>
                    <li class="dropdown">
                        <a href="javascript:void(0)"  data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            我的账户
                            <i class="caret"></i>
                        </a>
                        <ul class="dropdown-menu post-nav-list clearfix">
                            <li>
                        		<a href="${base}/ui/bluepost.action?type=bankcard">我的银行卡</a>
		                    </li>
		                    <li>
		                        <a href="${base}/ui/bluepost.action?type=msg">我的资料</a>
		                    </li>
		                    <li>
		                        <a href="${base}/ui/bluepost.action?type=evaluating">风险评测</a>
		                    </li>
		                    <li>
		                        <a href="${base}/ui/bluepost.action?type=password1" >修改交易密码</a>
		                    </li>
		                    <li>
		                        <a href="#">修改登录密码</a>
		                    </li>
		                    <li>
		                        <a href="#">我的积分</a>
		                    </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="javascript:void(0)" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            基金超市
                            <i class="caret"></i>
                        </a>
                        <ul class="dropdown-menu post-nav-list clearfix">
                            <li>
                                <a href="${base}/ui/bluepost.action?type=market">基金购买</a>
                            </li>
                            <li>
                                <a href="${base}/ui/bluepost.action?type=redeem1">基金赎回</a>
                            </li>
                            <li>
                                <a href="${base}/ui/bluepost.action?type=investment1">基金定投</a>
                            </li>
                            <li>
                                <a href="${base}/ui/bluepost.action?type=revoke1">交易撤单</a>
                            </li>
                            <li>
                                <a href="${base}/ui/bluepost.action?type=dividend1">分红设置</a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="javascript:void(0)" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            业务查询
                            <i class="caret"></i>
                        </a>
                        <ul class="dropdown-menu post-nav-list clearfix">
		                    <li>
		                        <a href="${base}/ui/bluepost.action?type=history1">历史成交</a>
		                    </li>
		                    <li>
		                        <a href="${base}/ui/bluepost.action?type=commission1">当日委托</a>
		                    </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="javascript:void(0)"  data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            客户服务
                            <i class="caret"></i>
                        </a>
                        <ul class="dropdown-menu post-nav-list clearfix">
                            <li>
                        		<a href="${base}/ui/bluepost.action?type=mybill" >我的对账单</a>
		                    </li>
		                    <li>
		                        <a href="${base}/ui/bluepost.action?type=custommade" >定制订阅</a>
		                    </li>
                            <li>
                                <a href="${base}/ui/bluepost.action?type=tradeNotes" >网上交易须知</a>
                            </li>
                            <li>
                                <a href="${base}/ui/bluepost.action?type=onlineMessage" >我要留言</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
<!--弹出二维码
<div class="show-qrcode" id="qrcode" style="display:none;">
    <div>便捷交易请订阅服务号：</div>
    <div class="qrcode_left">
        <img src="././upload/2015/12/hwdUL3ESTZ2zfXHawOsgtw...jpg"/>
        <h1>中邮订阅号</h1>
    </div>
    <div class="qrcode_right">
        <img src="././upload/2015/12/nXeIKOrPRQ6oYL6VeF9gWg...jpg"/>
        <h1>中邮服务号</h1>
    </div>
</div>
-->
