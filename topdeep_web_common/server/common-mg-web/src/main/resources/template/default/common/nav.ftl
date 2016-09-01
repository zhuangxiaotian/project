<!-- Navigation -->
<nav class="navbar navbar-static-top sub-navbar" role="navigation" id="system_nav">
    <div class="container-fluid">
        <div class="nav-common clearfix">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle sub-bar" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand">
                    <img src="${base}/static/common/skin/${res.mainSkin}/images/logo.png" alt="玄谷">
                    ${res.appName!'玄谷通用统一后台'}
                </a>
            </div>
            <!-- /.navbar-header -->
            <ul id="n2BOwlyRSqE0Uj7xE9B8g..A" class="nav navbar-top-links navbar-left nav-service sub-link" style="display:none;">
                <li>
                    <ul>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: #fff;">
                                <span class="nav-select-l" id="qvjxt4XRo6_xSExqBkZdw..U">服务号</span>
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu  sub-nav-list nav-list-l" id="GztUSV_QMC3Be4mCFAM-w..c">
                                <li>
                                    <a href="javascript:void(0)">公众号一</a>
                                </li>
                                <!--<li class="divider"></li>-->
                                <li><a href="javascript:void(0)">公众号二</a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
            </ul>

            <ul class="nav navbar-top-links navbar-right sub-link">
                <li>
                    <a href="javascript:void(0)" class="btn btn-default toggle-nav hidden-xs">切换导航栏菜单</a>
                </li>
                <li>
                    <ul>
                        <li class="dropdown">
                            <span class="welcome">欢迎您!</span>
                            <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: #fff;">
                                <span>${res.loginName!''}</span>
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu sub-nav-list nav-list-r" id="right_menu">
                               <#-- <li><a href="javascript:void(0)">公众号一</a></li>
                                <li class="divider"></li>
                                <li><a href="javascript:void(0)">公众号一</a></li>-->
                            </ul>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>

        <!-------------------------------top-navbar-------------------------------------->
        <div class="navbar-black top-navbar" role="navigation" style="display: none;">
            <div class="collapse navbar-collapse">
                <ul class="nav navbar-nav sub-nav">
                    <#--<li>
                        <a href="#">主页</a>
                    </li>
                    <li class="dropdown">
                        <a href="javascript:void(0)" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                            web控件
                            <span class="caret"></span>
                        </a>
                        <ul class="dropdown-menu sub-nav-list">
                            <li>
                                <a href="${base}/ui/sample.action?type=icons">icons</a>
                            </li>
                            <li>
                                <a href="${base}/ui/sample.action?type=forms">forms</a>
                            </li>
                            <li>
                                <a href="${base}/ui/sample.action?type=buttons">buttons</a>
                            </li>
                            <li>
                                <a href="${base}/ui/sample.action?type=tabs">tabs</a>
                            </li>
                            <li>
                                <a href="${base}/ui/sample.action?type=confirms">confirms</a>
                            </li>
                        </ul>
                    </li>
	                <li>
	                    <a href="javascript:void(0)">手机控件</a>
	                </li>-->
            	</ul>
	            <form class="navbar-form navbar-right hidden-xs" role="search">
	                <div class="form-group has-feedback ">
	                    <input class="form-control sub-search-top" id="search-top" type="search" placeholder="search……"/>
	                    <span class="glyphicon glyphicon-search form-control-feedback" style="top: 0px;color:#c32828"></span>
	                </div>
	            </form>
            </div>
        </div>
        <!-------------------------------top-navbar-------------------------------------->


        <!-------------------------------left-navbar-------------------------------------->
        <div class="navbar-default sidebar left-navbar" role="navigation" style="display: block;">
            <div class="sidebar-nav navbar-collapse">
                <ul class="nav" id="side-menu">
                    <li class="sidebar-search">
                        <div class="form-group has-feedback ">
                            <input class="form-control sub-search-left" id="search-left" type="search" placeholder="search……"/>
                            <span class="glyphicon glyphicon-search form-control-feedback" style="top: 0px;color:#c32828"></span>
                        </div>
                        <!-- /input-group -->
                    </li>
                   <#-- <li>
                        <a href="${base}/home/index.action" class="active">
                            主页
                        </a>
                    </li>
                    <li>
                        <a href="javascript:void(0)">web控件<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="${base}/ui/sample.action?type=icons">icons</a>
                            </li>
                            <li>
                                <a href="${base}/ui/sample.action?type=forms">forms</a>
                            </li>
                            <li>
                                <a href="${base}/ui/sample.action?type=buttons">buttons</a>
                            </li>
                            <li>
                                <a href="${base}/ui/sample.action?type=tabs">tabs</a>
                            </li>
                            <li>
                                <a href="${base}/ui/sample.action?type=confirms">confirms</a>
                            </li>
                        </ul>
                    </li>-->
                </ul>
            </div>
        </div>
        <!-------------------------------left-navbar-------------------------------------->
    </div>
</nav>
