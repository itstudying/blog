/**
 * 百度富文本编辑器 通用设置
 */
$(function() {
	var ue = UE.getEditor('edit-container');
	// 对编辑器的操作最好在编辑器ready之后再做
	/*
	 * ue.ready(function() { // 设置编辑器的内容 ue.setContent('hello');
	 * 
	 * });
	 */

	// 改变图片的上传地址后需要加上这一段代码，上传时使用哪个Controller进行上传操作
	UE.Editor.prototype._bkGetActionUrl = UE.Editor.prototype.getActionUrl;
	UE.Editor.prototype.getActionUrl = function(action) {
		if (action == 'uploadimage' || action == 'uploadscrawl'
				|| action == 'uploadimage') {
			return 'http://localhost:8080/blog/blogfile/saveBlogArticleFile';
		} else if (action == 'uploadvideo') {
			return 'http://localhost:8080/blog/blogfile/saveBlogArticleFile';
		} else if (action == 'uploadfile') {
			return 'http://localhost:8080/blog/blogfile/saveBlogArticleFile';
		} else {
			return this._bkGetActionUrl.call(this, action);
		}
	}
})
