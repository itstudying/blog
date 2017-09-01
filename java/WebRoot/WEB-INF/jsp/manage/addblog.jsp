<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>

	<head>
		<meta charset="utf-8" />
		<title>代码搬运工</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta content="width=device-width, initial-scale=1.0" name="viewport" />
		<meta http-equiv="Content-type" content="text/html; charset=utf-8">
		<meta content="用于博客的修改和发布" name="description" />
		<meta content="Zunqi" name="author" />
		<!-- BEGIN GLOBAL MANDATORY STYLES -->
		<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css" />
		<link href="https://cdn.staticfile.org/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
		<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath }/plugins/manage/metronic/assets/global/css/components.css" id="style_components" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath }/plugins/manage/metronic/assets/admin/layout/css/layout.css" rel="stylesheet" type="text/css" />
		<link id="style_color" href="${pageContext.request.contextPath }/plugins/manage/metronic/assets/admin/layout/css/themes/darkblue.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath }/plugins/manage/metronic/assets/admin/layout/css/custom.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath }/plugins/manage/fileinput/fileinput.min.css" rel="stylesheet" type="text/css" />
	</head>

	<body class="page-header-fixed page-quick-sidebar-over-content ">
		<!-- BEGIN HEADER -->
		<div class="page-header navbar">
			<!-- BEGIN HEADER INNER -->
			<div class="page-header-inner">
				<!-- BEGIN LOGO -->
				<div class="page-logo">
					<a href="index.html"> <img src="/blog/plugins/manage/metronic/assets/admin/layout/img/logo.png" alt="logo" class="logo-default" />
					</a>
					<div class="menu-toggler sidebar-toggler hide">
						<!-- DOC: Remove the above "hide" to enable the sidebar toggler button on header -->
					</div>
				</div>
				<!-- END LOGO -->
				<!-- BEGIN RESPONSIVE MENU TOGGLER -->
				<a href="javascript:;" class="menu-toggler responsive-toggler" data-toggle="collapse" data-target=".navbar-collapse"> </a>
			</div>
			<!-- END HEADER INNER -->
		</div>
		<!-- END HEADER -->
		<div class="clearfix"></div>
		<!-- BEGIN CONTAINER -->
		<div class="page-container">
			<!-- BEGIN SIDEBAR -->
			<div class="page-sidebar-wrapper">
				<!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
				<!-- DOC: Change data-auto-speed="200" to adjust the sub menu slide up/down speed -->
				<div class="page-sidebar navbar-collapse collapse">
					<ul class="page-sidebar-menu" data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200">
						<!-- DOC: To remove the sidebar toggler from the sidebar you just need to completely remove the below "sidebar-toggler-wrapper" LI element -->
						<li class="sidebar-toggler-wrapper">
							<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
							<div class="sidebar-toggler"></div>
							<!-- END SIDEBAR TOGGLER BUTTON -->
						</li>
						<!-- DOC: To remove the search box from the sidebar you just need to completely remove the below "sidebar-search-wrapper" LI element -->
						<li class="sidebar-search-wrapper">
							<!-- BEGIN RESPONSIVE QUICK SEARCH FORM -->
							<!-- DOC: Apply "sidebar-search-bordered" class the below search form to have bordered search box -->
							<!-- DOC: Apply "sidebar-search-bordered sidebar-search-solid" class the below search form to have bordered & solid search box -->
							<form class="sidebar-search " action="extra_search.html" method="POST">
								<a href="javascript:;" class="remove"> <i class="icon-close"></i>
								</a>
								<div class="input-group">
									<input type="text" class="form-control" placeholder="Search..."> <span class="input-group-btn"> <a href="javascript:;" class="btn submit"><i
										class="icon-magnifier"></i></a>
								</span>
								</div>
							</form>
							<!-- END RESPONSIVE QUICK SEARCH FORM -->
						</li>

						<li class="heading">
							<h3 class="uppercase">后台</h3>
						</li>

						<li class="tooltips" data-container="body" data-placement="right" data-html="true" data-original-title="回到后台主页">
							<a href="${pageContext.request.contextPath }/manage/forward/index"> <i class="icon-home"></i> <span class="title">主页</span>
							</a>
						</li>
						<li class="start">
							<a href="javascript:;"> <i class="icon-user"></i> <span class="title">用户管理</span> <span class="arrow "></span>
							</a>
							<ul class="sub-menu">
								<li class="">
									<a href="javascript:return false;">用户总览</a>
								</li>
								<li>
									<a href="javascript:return false;">管理用户动态</a>
								</li>
							</ul>
						</li>

						<li class="heading">
							<h3 class="uppercase">博客</h3>
						</li>
						<li class="active">
							<a href="javascript:;"> <i class="icon-eye"></i> <span class="title">博客管理</span>
								<span class="arrow "></span>
							</a>
							<ul class="sub-menu">
								<li class="">
									<a href="${pageContext.request.contextPath }/manage/forward/showall">博客总览</a>
								</li>
								<li class="active">
									<a href="${pageContext.request.contextPath }/manage/forward/addblog">发布博客</a>
								</li>
								<li class="">
									<a href="${pageContext.request.contextPath }/manage/forward/blogseo">seo优化</a>
								</li>
							</ul>
						</li>

						<li class="heading">
							<h3 class="uppercase">音乐</h3>
						</li>
						<li>
							<a href="javascript:;"> <i class="icon-eye"></i> <span class="title">音乐管理</span> <span class="arrow "></span>
							</a>
							<ul class="sub-menu">
								<li class="">
									<a href="javascript:return false;">音乐总览</a>
								</li>
								<li>
									<a href="javascript:return false;">添加音乐</a>
								</li>
							</ul>
						</li>

					</ul>
					<!-- END SIDEBAR MENU -->
				</div>
			</div>
			<!-- END SIDEBAR -->
			<!-- BEGIN CONTENT -->
			<div class="page-content-wrapper">
				<div class="page-content">

					<div class="page-bar">
						<ul class="page-breadcrumb">
							<li><i class="fa fa-home"></i>
								<a href="index.html">Home</a> <i class="fa fa-angle-right"></i>
							</li>
							<li>
								<a href="#">博客管理</a> <i class="fa fa-angle-right"></i></li>
							<li>
								<a href="#">新增博客</a>
							</li>
						</ul>
					</div>
					<!-- END PAGE HEADER-->
					<!-- BEGIN PAGE CONTENT-->
					<div class="row">
						<div class="col-md-12">
							<c:choose>
								<c:when test="${requestScope.message eq '添加成功！' }">
									<div class="alert alert-success alert-dismissible fade in" role="alert">
										<button type="button" class="close" data-dismiss="alert" aria-label="Close">
										<span aria-hidden="true">×</span>
									</button>
										<strong>发布成功！</strong>
										<a href="#" class="">点击查看</a>
									</div>
								</c:when>
								<c:when test="${requestScope.message eq '添加失败-未知原因' }">
									<div class="alert alert-danger alert-dismissible fade in" role="alert">
										<button type="button" class="close" data-dismiss="alert" aria-label="Close">
										<span aria-hidden="true">×</span>
									</button>
										<p>${requestScope.message }</p>
									</div>
								</c:when>
							</c:choose>

							<div class="portlet box blue">
								<div class="portlet-title">
									<div class="caption">
										<i class="fa fa-edit"></i>发布博客
									</div>
									<div class="tools">
										<a href="javascript:;" class="collapse"> </a>
										<a href="#portlet-config" data-toggle="modal" class="config"> </a>
										<a href="javascript:;" class="reload"> </a>
										<a href="javascript:;" class="remove"> </a>
									</div>
								</div>
								<div class="portlet-body">
									<!-- 编辑新闻区 -->
									<form action="${pageContext.request.contextPath }/manageblog/pubblog" method="post" id="form-addblog">
										<div class="form-body">
											<h3 class="form-section">博客信息</h3>
											<div class="row">
												<div class="col-md-6">
													<div class="form-group">
														<label class="control-label col-md-3">博客ID：</label>
														<div class="col-md-9">
															<input type="text" class="form-control" name="blogTBlogCustom.id" id="blog-id" value="${blogCustom.id }" readonly="readonly"> <span class="help-block">
															博客文章ID，不可更改</span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">博客标题：</label>
														<div class="col-md-9">
															<input type="text" class="form-control" name="blogTBlogCustom.title" placeholder="文章标题" value="${blogCustom.title }"> <span class="help-block">
															输入博客文章标题 </span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">博客分类：</label>
														<div class="col-md-9">
															<div class="input-group">
																<div class="input-group-btn">
																	<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
																	Action <span class="caret"></span>
																</button>
																	<ul class="dropdown-menu blog-classify" contenteditable="true">
																		<li>
																			<a href="javascript:void(0);">项目</a>
																		</li>
																		<li class="dropdown-submenu">
																			<a href="javascript:void(0);" tabindex="-1">技术</a>
																			<ul class="dropdown-menu">
																				<li>
																					<a href="javascript:void(0);">web前端</a>
																				</li>
																				<li>
																					<a href="javascript:void(0);#">web后端</a>
																				</li>
																				<li>
																					<a href="javascript:void(0);">OS</a>
																				</li>
																				<li>
																					<a href="javascript:void(0);">其他技术</a>
																				</li>
																			</ul>
																		</li>
																		<li>
																			<a href="javascript:void(0);">开源</a>
																		</li>
																		<li>
																			<a href="javascript:void(0);">心得</a>
																		</li>
																		<li>
																			<a href="javascript:void(0);">分享</a>
																		</li>
																		<li>
																			<a href="javascript:void(0);">计划</a>
																		</li>

																	</ul>
																</div>
																<input type="text" value="${blogCustom.classify }" class="form-control" name="blogTBlogCustom.classify" id="blog-classify" placeholder="文章分类" readonly="readonly">

																<!-- /btn-group -->
															</div>
															<!-- /input-group -->
															<span class="help-block"> 选择本篇文章所属分类 </span>
														</div>
														<input name="blogTBlogCustom.pubtime" id="blog-pubtime" value="${blogCustom.pubtime }" type="text" hidden="hidden" /> <input name="blogTBlogCustom.wordscount" id="blog-wordscount" value="${blogCustom.wordscount }" type="text" hidden="hidden" />
														<input name="blogTBlogCustom.intro" value="${blogCustom.intro }" id="blog-intro" type="text" hidden="hidden" />
														<div class="form-group">
															<label class="control-label">项目相关文件</label>
															<table class="table table-responsive table-striped table-bordered">
																<tr>
																	<th>路径</th>
																	<th>分类</th>
																	<th>删除</th>
																</tr>
																<c:forEach items="${blogCustom.blogfileCustoms }" var="file">
																	<tr>
																		<td>${file.filepath }</td>
																		<td>${file.classify }</td>
																		<td class="center-block"><button class="btn btn-danger btn-blogfile-delete" data-id="${file.id }">
																			<i class="glyphicon glyphicon-remove"></i>
																		</button></td>
																	</tr>
																</c:forEach>
															</table>
														</div>
													</div>
												</div>
												<div class="col-md-6">
													<h3 class="form-section">上传文件</h3>

													<!-- <div class="form-group"> -->
													<input type="file" name="blogFile" class="blogFile" id="blogFile" style="height: 100px;" />
													<p class="help-block">用于上传开源的项目或其他，博客文章的文件使用下方编辑器上传，支持所有格式，大小不超过200M</p>
													<!-- </div> -->
												</div>
											</div>

											<h3 class="form-section">文章内容</h3>
											<script id="edit-container" name="blogTBlogCustom.content" type="text/plain">${blogCustom.content }</script>
										</div>

										<hr />
										<button type="button" class="btn blue btn-block m-icon btn-add btn-sub">
										提交 <i class="m-icon-swapright m-icon-white" disabled=""></i>
									</button>

									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- BEGIN QUICK SIDEBAR -->
				<a href="javascript:;" class="page-quick-sidebar-toggler"><i class="icon-close"></i></a>
				<!-- END QUICK SIDEBAR -->
			</div>
			<!-- END CONTAINER -->
			<!-- BEGIN FOOTER -->
			<div class="page-footer">
				<div class="page-footer-inner">
					2017 &copy; 今日新闻 by Zunqi.
					<a href="http://www.itzunqi.com" title="个人主页" target="_blank">Homepage!</a>
				</div>
				<div class="scroll-to-top">
					<i class="icon-arrow-up"></i>
				</div>
			</div>
			<script type="text/javascript" src="https://cdn.staticfile.org/jquery/1.11.2/jquery.min.js"></script>
			<script type="text/javascript" src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
			<!-- END PAGE LEVEL PLUGINS -->
			<!-- BEGIN PAGE LEVEL SCRIPTS -->
			<script src="${pageContext.request.contextPath }/plugins/manage/metronic/assets/global/scripts/metronic.js" type="text/javascript"></script>
			<script src="${pageContext.request.contextPath }/plugins/manage/metronic/assets/admin/layout/scripts/layout.js" type="text/javascript"></script>
			<script src="${pageContext.request.contextPath }/plugins/manage/metronic/assets/admin/layout/scripts/quick-sidebar.js" type="text/javascript"></script>
			<script src="${pageContext.request.contextPath }/plugins/manage/metronic/assets/admin/layout/scripts/demo.js" type="text/javascript"></script>
			<!-- 上传图片 -->
			<script type="text/javascript" src="https://cdn.bootcss.com/bootstrap-fileinput/4.4.2/js/fileinput.min.js"></script>
			<script type="text/javascript" src="https://cdn.bootcss.com/bootstrap-fileinput/4.4.2/js/locales/zh.min.js"></script>
			<!-- 配置文件 -->
			<script type="text/javascript" src="${pageContext.request.contextPath }/plugins/manage/edit/ueditor.config.js"></script>
			<!-- 编辑器源码文件 -->
			<script type="text/javascript" src="https://cdn.staticfile.org/ueditor/1.4.3/ueditor.all.min.js"></script>
			<script type="text/javascript" src="${pageContext.request.contextPath }/plugins/manage/edit/common.js"></script>
			<script>
				//控制博客分类的选项
				$("ul.blog-classify a").not("ul.blog-classify a[tabindex=-1]").on(
					"click",
					function() {
						$("#blog-classify").val($(this).html());
					})

				//点击提交触发事件，
				$(".btn-sub").on(
					"click",
					function() {
						//统计共多少字
						var r = /\d+/;
						var wordscount = r.exec($("#edui1_wordcount").html())
						if(wordscount != null && wordscount.length != 0) {
							$("#blog-wordscount").val(
								r.exec($("#edui1_wordcount").html()))
						}
						//设置博客内容简介，45字
						var content = UE.getEditor('edit-container')
							.getContentTxt();
						if(content != null && content.length != 0) {
							$("#blog-intro").val(content.substr(0, 45));
						}

						$("#form-addblog").submit();
					})
			</script>
			<script>
				//主题
				jQuery(document).ready(function() {
					Metronic.init(); // init metronic core components
					Layout.init(); // init current layout
					QuickSidebar.init(); // init quick sidebar
					Demo.init(); // init demo features
				});

				//初始化fileinput控件（第一次初始化）
				function initFileInput(ctrlName, uploadUrl) {
					var control = $('#' + ctrlName);

					control
						.fileinput({
							language: 'zh', //设置语言
							uploadUrl: uploadUrl, //上传的地址
							allowedFileExtensions: [], //接收的文件后缀
							allowedPreviewTypes: ['image'],
							showUpload: true, //是否显示上传按钮
							showCaption: true, //是否显示标题
							browseClass: "btn btn-primary", //按钮样式             
							previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
							maxFileSize: 204800, //单个文件最大大小200
							maxFileCount: 3, //最多上传几个文件
							uploadExtraData: function(previewId, index) { //上传前执行方法
								var obj = {
									id: $("#blog-id").val(),
									type: "blogFile"
								};
								return obj;
							},
						});
				}
				//上传成功 的回调函数
				$("#blogFile").on("fileuploaded",
					function(event, data, previewId, index) {
						console.log(data);
					})

				//初始化fileinput控件（第一次初始化）/
				initFileInput("blogFile", "/blog/blogfile/saveBlogFile");
			</script>
			<script>
			//动态title
			!function() {
			    var t, e = document.title;
			    document.addEventListener("visibilitychange",
			    function() {
			        document.hidden ? (document.title = "死鬼去哪里了！", clearTimeout(t)) : (document.title = "(つェ⊂)咦!又好了!", t = setTimeout(function() {
			            document.title = e
			        },
			        2e3))
			    })
			} ()
			</script>
	</body>
	<!-- END BODY -->

</html>