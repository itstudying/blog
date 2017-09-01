<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>代码搬运工</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta content="width=device-width, initial-scale=1.0" name="viewport" />
		<meta http-equiv="Content-type" content="text/html; charset=utf-8">
		<meta content="后台管理首页" name="description" />
		<meta content="Zunqi" name="author" />
		<!-- BEGIN GLOBAL MANDATORY STYLES -->

		<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css" />
		<link href="https://cdn.staticfile.org/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath }/plugins/show/css/bootstrap.css" rel="stylesheet">
		<!-- END GLOBAL MANDATORY STYLES -->
		<!-- BEGIN PAGE LEVEL STYLES -->
		<!-- END PAGE LEVEL STYLES -->
		<!-- BEGIN THEME STYLES -->
		<link href="${pageContext.request.contextPath }/plugins/manage/metronic/assets/global/css/components.css" id="style_components" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath }/plugins/manage/metronic/assets/admin/layout/css/layout.css" rel="stylesheet" type="text/css" />
		<link id="style_color" href="${pageContext.request.contextPath }/plugins/manage/metronic/assets/admin/layout/css/themes/darkblue.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath }/plugins/manage/metronic/assets/admin/layout/css/custom.css" rel="stylesheet" type="text/css" />
	</head>

	<body class="page-header-fixed page-quick-sidebar-over-content ">
		<!-- BEGIN HEADER -->
		<div class="page-header navbar navbar-fixed-top">
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

						<li class="tooltips active" data-container="body" data-placement="right" data-html="true" data-original-title="回到后台主页">
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
						<li class="">
							<a href="javascript:;"> <i class="icon-eye"></i> <span class="title">博客管理</span>
								<span class="arrow "></span>
							</a>
							<ul class="sub-menu">
								<li class="">
									<a href="${pageContext.request.contextPath }/manage/forward/showall">博客总览</a>
								</li>
								<li class="">
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
						</ul>
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
					2017 &copy; 代码搬运工 by Zunqi.
					<a href="http://itstudying.com" title="个人主页" target="_blank">Homepage!</a>
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
			<!-- 配置文件 -->
			<script type="text/javascript" src="${pageContext.request.contextPath }/plugins/manage/edit/ueditor.config.js"></script>
			<script>
				jQuery(document).ready(function() {
					Metronic.init(); // init metronic core components
					Layout.init(); // init current layout
					QuickSidebar.init(); // init quick sidebar
					Demo.init(); // init demo features
				});
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