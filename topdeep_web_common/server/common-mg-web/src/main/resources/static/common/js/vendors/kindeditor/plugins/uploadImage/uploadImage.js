KindEditor.plugin('uploadImage', function(K) {
        var editor = this, name = 'uploadImage';
        // 点击图标时执行
        editor.clickToolbar(name, function() {
        	var html =   '<div><div id="selectArea">'
    				+'<div class="modal-body" style="overflow-y:auto;height:500px; ">'
    					+'<div class="col-lg-9">'
    						+'<div class="form-group has-warning">'
    							+'<input type="text" class="form-control" id="portraitUrl" placeholder="请输入图片URL或选择图片">'
    						+'</div>'
    					+'</div>'
    					+'<div class="col-lg-3 pull-right">'
    						+'<input class="btn btn-default form-control" onclick="NewsManage.insertImg()" type="button" value="确认"/>'
    					+'</div>'
    			  +'<div style="width:100%; overflow:hidden">'
	          		+'<div id="imageShow">'
    	          +'</div>'
    	          +'</div>'
		          +'</div>'
		          +'<div style="color:#333; font-size:12px;margin-top:14px;text-align:center"  >'
		          +'共<span id = "totalCount100"></span>条 第(<span id = "pageIndex_value100"></span>)页'
		              +'<input id="btn_browsePrev100" class="btn btn-default" type="button" value="上一页" ></input>'
		              +'<input id="btn_browseNext100" class="btn btn-default" type="button" value="下一页" src="images/next_active.gif" alt="下一页"></input>'
		              		+'到第'
		              +'<input id="jumpPageIndex100" type="text" style="width:20px" value="" ></input>'
		              		+'页'
		              +'<input id="jumpButton100" class="btn btn-default" type="button" value="跳转"></input>'
		              +'<input id="pageIndex100" type="hidden" value=""></input>'
		              +'<input id="totalPage100" type="hidden" value=""></input>'
		          +'</div>'
		          +'<div class="modal-footer">'
		          		+'<div class="col-lg-12 pull-right">'
		          		+'<input id="toUpload" class="btn btn-default form-control" type="button" onclick="NewsManage.showUpload()" value="上传本地图片"/>'
		          		+'</div>'
		          +'</div>'
		          +'</div>'
		          +'<div id="uploadArea" style="display:none">'
		          +'<form id="uploadForm" action="/news/resourceManage!ajaxUploadResource.action" method="post" enctype="multipart/form-data">'
		          	+'<div class="modal-body" id="FileContent"  style="overflow-y:auto;height:500px; ">'
		          		+'<div class="container2" id = "first_page">'
		          			+'<div class="header1">'
		          				+'<div class="upload_choose">'
		          					+'<input id="fileImage" type="file" size="30" name="fileselect[]" multiple>'
		          					+'<span id="fileDragArea" class="upload_drag_area">请将图片拖到此处</span>'
		          				+'</div>'
		          			+'</div>'
		          			+'<div  class="input-group">'
		          			+'<div id="preview" class="upload_preview"></div>'
		          			+'</div>'
		          		+'</div>'
		          	+'</div>'
                 		  +'<div class="modal-footer">'
                   			+'<div class="col-lg-6 pull-left">'
	          				+'<button id="fileSubmit" class="btn btn-default form-control" type="button">上传'
	          				+'</button>'
	          				+'</div>'
	          				+'<div class="col-lg-6 pull-right">'
	          				+'<button id="returnSelect"  onclick="NewsManage.returnSelect()" class="btn btn-default form-control" type="button">返回'
	          				+'</button>'
	          				+'</div>'
                  		 +'</div>'
                  	 +'</form>'
                   	+'</div></div>'
    		editor.createDialog({
    			name : 'uploadImage',
    			width : 350,
    			title : editor.lang('uploadImage'),
    			body : html
    		});
        	$(".ke-dialog-default").addClass("content");
        	PageUtil100 = new TopdeepUtil.pageUtil(null,NewsManage.ajaxQueryDbImage,"100");
        	PageUtil100.initPage();
        	NewsManage.ajaxQueryDbImage(0);
        	NewsManage.clearUpload();
    	});
        
        
});