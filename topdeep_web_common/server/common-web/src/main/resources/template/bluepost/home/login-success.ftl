<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Bootstrap Core CSS -->
    <link href="${base}/static/skin/${res.skin}/css/vendors/bootstrap.min.css" rel="stylesheet">
    <!-- login -->
    <link href="${base}/static/skin/${res.skin}/css/pages/post-login.css" rel="stylesheet">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="container post-container">
    <div class="row">
        <div class="col-xs-12 col-md-12 login-content">
            <div class="row">
                <div class="col-xs-12 col-md-4"></div>
                <div class="col-xs-12 col-md-4">
                    <form class="form-horizontal">
                        <div class="form-group">
                            <div class="col-xs-12 clearfix">
                                <img class="post-logo pull-left" src="../skin/images/logo.png" alt="中邮基金">
                                    <span class="post-logo-title pull-left">
                                        网上交易系统
                                    </span>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-xs-12">
                                <select class="form-control">
                                    <option value="0">身份证</option>
                                    <option value="1">护照</option>
                                    <option value="2">军官证</option>
                                    <option value="3">士兵证</option>
                                    <option value="z">基金账号</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-xs-12">
                                <input type="text" class="form-control"  id="loginName" placeholder="请输入证件号码/基金账号" autofocus="">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-xs-10">
                                <input type="password" class="form-control"  placeholder="请输入密码"autofocus="">
                            </div>
                            <div class="col-xs-2">
                                <div class="keyborder">
                                    <a href="javascript:;">
                                        <img src="${base}/static/skin/${res.skin}/skin/images/keyboard.gif" alt="键盘"/>
                                    </a>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-xs-9">
                                <input type="password" class="form-control"  placeholder="请输入右侧显示验证码"autofocus="">
                            </div>
                            <div class="col-xs-3">
                                <div  class="lose-pwd" style="">
                                    <a href="javascript:void(0)">
                                        <img src="${base}/static/skin/${res.skin}/images/VerifyCodeServlet.jpg" alt="验证码">
                                    </a>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-xs-12">
                                <div class="needknow clearfix">
                                    <a href="javascript:;" class="pull-right">网上交易须知</a>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-xs-6">
                                <button type="submit" class="btn btn-block input-btn">登录</button>
                            </div>
                            <div class="col-xs-6">
                                <button type="submit" class="btn btn-block input-btn">注册</button>
                            </div>
                        </div>

                    </form>
                </div>
                <div class="col-xs-12 col-md-4"></div>
            </div>
        </div>
    </div>
</div>
<div class="footer-post">
<div class="container">
    <div class="footer-content">
        <p class="post-copy"><span>京ICP备06036163号&nbsp;&nbsp;|&nbsp;&nbsp;©2006 中邮创业基金管理股份有限公司 版权所有&nbsp;|&nbsp;免责申明</span></p>
        <ul>
            <li>
                <p class="post-copy"><span>CHINA POST & CAPITAL FUND MANAGEMENT Co.,Ltd</span></p>
                <p class="post-copy"><span>地址：北京市海淀区西直门北大街60号 首钢国际大厦10层 邮编：&nbsp;&nbsp;&nbsp;100082</span></p>
            </li>
            <li class="post-hotline">
                <ul>
                    <li class="post-hotline-img">
                        <img src="${base}/static/skin/${res.skin}/images/post_hotline.png" alt="热线电话">
                    </li>
                    <li>
                        <p>客服热线：</p>
                        <p>400-880-1618</p>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
</div>
</div>
<div class="post-code hidden-xs hidden-sm">
<img src="${base}/static/skin/${res.skin}/images/fund_code.png" alt="中邮基金">
</div>
        <!-- jQuery -->
<script src="${base}/static/js/vendors/jquery/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
<script src="${base}/static/js/vendors/bootstrap/bootstrap.min.js"></script>

<script src="${base}/static/js/common/effect.js"></script>

<script type="text/javascript">
//		NavManage.initPage();
</script>
<#if jsimport??>
<@jsimport></@jsimport>
        </#if>

</body>

</html>