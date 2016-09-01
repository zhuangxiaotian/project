<#macro htmlbody>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Tab1
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div>
                                <ul class="nav nav-tabs sub-tabs">
                                    <li class="active">
                                        <a href="#tab1" data-toggle="tab" role="tab">test1</a>
                                    </li>
                                    <li>
                                        <a href="#tab2" data-toggle="tab" role="tab" >test2</a>
                                    </li>
                                    <li>
                                        <a href="#tab3" data-toggle="tab" role="tab" >test3</a>
                                    </li>
                                </ul>
                                <div class="tab-content">
                                    <div role="tabpanel" class="tab-pane active" id="tab1">this is tab1</div>
                                    <div role="tabpanel" class="tab-pane" id="tab2">this is tab2</div>
                                    <div role="tabpanel" class="tab-pane" id="tab3">this is tab3</div>
                                </div>
                            </div>
                        </div>
                        <!-- /.panel-body -->
                        <div class="highlight">
                            <div class="example">
                            <pre>
&lt;ul class=&quot;nav nav-tabs sub-tabs&quot;&gt;
    &lt;li class=&quot;active&quot;&gt;
        &lt;a href=&quot;#tab1&quot; data-toggle=&quot;tab&quot; role=&quot;tab&quot;&gt;test1&lt;/a&gt;
    &lt;/li&gt;
    &lt;li&gt;
        &lt;a href=&quot;#tab2&quot; data-toggle=&quot;tab&quot; role=&quot;tab&quot; &gt;test2&lt;/a&gt;
    &lt;/li&gt;
    &lt;li&gt;
        &lt;a href=&quot;#tab3&quot; data-toggle=&quot;tab&quot; role=&quot;tab&quot; &gt;test3&lt;/a&gt;
    &lt;/li&gt;
&lt;/ul&gt;
&lt;div class=&quot;tab-content&quot;&gt;
    &lt;div role=&quot;tabpanel&quot; class=&quot;tab-pane active&quot; id=&quot;tab1&quot;&gt;this is tab1&lt;/div&gt;
    &lt;div role=&quot;tabpanel&quot; class=&quot;tab-pane&quot; id=&quot;tab2&quot;&gt;this is tab2&lt;/div&gt;
    &lt;div role=&quot;tabpanel&quot; class=&quot;tab-pane&quot; id=&quot;tab3&quot;&gt;this is tab3&lt;/div&gt;
&lt;/div&gt;
                            </pre>
                            </div>
                        </div>
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Tab2
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <ul class="nav nav-tabs sub-tab">
                                <li class="active"><a href="#tab11" data-toggle="tab">title1</a></li>
                                <li><a href="#tab22" data-toggle="tab">title2</a></li>
                                <li><a href="#tab33" data-toggle="tab">title3</a></li>
                            </ul>
                            <div class="tab-content">
                                <div  role="tabpanel" class="tab-pane active"  id="tab11">this is tab1</div>
                                <div  role="tabpanel" class="tab-pane"  id="tab22">this is tab2</div>
                                <div  role="tabpanel" class="tab-pane"  id="tab33">this is tab3</div>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                        <div class="highlight">
                            <div class="example">
                                <pre>
&lt;ul class=&quot;nav nav-tabs sub-tab&quot;&gt;
    &lt;li class=&quot;active&quot;&gt;
        &lt;a href=&quot;#tab11&quot; data-toggle=&quot;tab&quot; role=&quot;tab&quot;&gt;test1&lt;/a&gt;
    &lt;/li&gt;
    &lt;li&gt;
        &lt;a href=&quot;#tab22&quot; data-toggle=&quot;tab&quot; role=&quot;tab&quot; &gt;test2&lt;/a&gt;
    &lt;/li&gt;
    &lt;li&gt;
        &lt;a href=&quot;#tab33&quot; data-toggle=&quot;tab&quot; role=&quot;tab&quot; &gt;test3&lt;/a&gt;
    &lt;/li&gt;
&lt;/ul&gt;
&lt;div class=&quot;tab-content&quot;&gt;
    &lt;div role=&quot;tabpanel&quot; class=&quot;tab-pane active&quot; id=&quot;tab11&quot;&gt;this is tab1&lt;/div&gt;
    &lt;div role=&quot;tabpanel&quot; class=&quot;tab-pane&quot; id=&quot;tab22&quot;&gt;this is tab2&lt;/div&gt;
    &lt;div role=&quot;tabpanel&quot; class=&quot;tab-pane&quot; id=&quot;tab33&quot;&gt;this is tab3&lt;/div&gt;
&lt;/div&gt;
                                </pre>
                            </div>
                        </div>
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->

</#macro>
<#include "../common/main.ftl">