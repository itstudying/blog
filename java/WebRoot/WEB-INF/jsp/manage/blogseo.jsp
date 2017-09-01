<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>

	<head>
		<title>代码搬运工</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta content="width=device-width, initial-scale=1.0" name="viewport" />
		<meta http-equiv="Content-type" content="text/html; charset=utf-8">
		<meta content="" name="description" />
		<meta content="代码搬运工" name="author" />
		<!-- BEGIN GLOBAL MANDATORY STYLES -->
		<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css" />
		<link href="https://cdn.staticfile.org/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath }/plugins/manage/metronic/assets/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath }/plugins/show/css/bootstrap.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath }/plugins/manage/metronic/assets/global/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath }/plugins/manage/metronic/assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css" />
		<!-- END GLOBAL MANDATORY STYLES -->
		<!-- BEGIN PAGE LEVEL STYLES -->
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/plugins/manage/metronic/assets/global/plugins/select2/select2.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/plugins/manage/metronic/assets/global/plugins/datatables/plugins/bootstrap/dataTables.bootstrap.css" />
		<!-- END PAGE LEVEL STYLES -->
		<!-- BEGIN THEME STYLES -->
		<link href="${pageContext.request.contextPath }/plugins/manage/metronic/assets/global/css/components.css" id="style_components" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath }/plugins/manage/metronic/assets/global/css/plugins.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath }/plugins/manage/metronic/assets/admin/layout/css/layout.css" rel="stylesheet" type="text/css" />
		<link id="style_color" href="${pageContext.request.contextPath }/plugins/manage/metronic/assets/admin/layout/css/themes/darkblue.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath }/plugins/manage/metronic/assets/admin/layout/css/custom.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath }/plugins/manage/easyUI/easyui.css" rel="stylesheet" type="text/css" />

	</head>

	<body class="page-header-fixed page-quick-sidebar-over-content ">
		<!-- BEGIN HEADER -->
		<div class="page-header navbar">
			<!-- BEGIN HEADER INNER -->
			<div class="page-header-inner">
				<!-- BEGIN LOGO -->
				<div class="page-logo">
					<a href="index.html"> <img src="${pageContext.request.contextPath }/plugins/manage/metronic/assets/admin/layout/img/logo.png" alt="logo" class="logo-default" />
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
										class="icon-magnifier">a</i></a>
								</span>
								</div>
							</form>
							<!-- END RESPONSIVE QUICK SEARCH FORM -->
						</li>

						<li class="heading">
							<h3 class="uppercase">后台</h3>
						</li>

						<li class="tooltips" data-container="body" data-placement="right" data-html="true" data-original-title="回到后台主页">
							<a href="${pageContext.request.contextPath }/manage/forward/index"> <i class="icon-home"></i>
								<span class="title">主页</span>
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
							<a href="javascript:;"> <i class="icon-eye"></i> <span class="title">博客管理</span> <span class="arrow "></span>
							</a>
							<ul class="sub-menu">
								<li class="">
									<a href="${pageContext.request.contextPath }/manage/forward/showall">博客总览</a>
								</li>
								<li class="">
									<a href="${pageContext.request.contextPath }/manage/forward/addblog">发布博客</a>
								</li>
								<li class="active">
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
								<a href="#">博客seo优化</a>
							</li>
						</ul>
					</div>

					<c:choose>
						<c:when test="${requestScope.message eq '删除成功！' }">
							<div class="alert alert-success alert-dismissible fade in" role="alert">
								<button type="button" class="close" data-dismiss="alert" aria-label="Close">
								<span aria-hidden="true">×</span>
							</button>
								<strong>删除成功！</strong>
							</div>
						</c:when>
						<c:when test="${requestScope.message eq '删除失败-未知原因' }">
							<div class="alert alert-danger alert-dismissible fade in" role="alert">
								<button type="button" class="close" data-dismiss="alert" aria-label="Close">
								<span aria-hidden="true">×</span>
							</button>
								<p>${requestScope.message }</p>
							</div>
						</c:when>
					</c:choose>

					<div class="portlet box blue-hoki">
						<div class="portlet-title">
							<div class="caption">
								<i class="fa fa-globe"></i>博客seo优化
							</div>
							<div class="tools"></div>
						</div>
						<div class="portlet-body form table-responsive">
							<table class="table table-bordered table-striped table-hover text-center">
								<thead>
									<tr>
										<th>博客id</th>
										<th>标题</th>
										<th>描述</th>
										<th>关键字</th>
										<th>点赞人数</th>
										<th>阅读次数</th>
										<th>是否展示</th>
										<th>提交</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${pageInfo.list }" var="blog">
										
										<tr>
											<form method="post" action="${pageContext.request.contextPath }/blogsundry/updateSubmit"></form>
											<td>${blog.blogsundry.blogid }<input type="hidden" class="form-control" value="${blog.blogsundry.id }" name="id" /></td>
											<td>${blog.title }</td>
											<td>
												<input type="text" class="form-control" value="${blog.blogsundry.description }" name="description" />
											</td>
											<td>
												<input type="text" class="form-control" value="${blog.blogsundry.keywords }" name="keywords" />
											</td>
											<td>

												<input type="text" class="form-control" value="${blog.blogsundry.love }" name="love" />
												<!-- <input type="text" class="easyui-numberspinner" value="${blog.blogsundry.love }" data-options="spinAlign:'horizontal',min:0,max:100000,required:true" name="love" />
													 -->
											</td>
											<td><input type="text" class="form-control" value="${blog.blogsundry.articleviews }" name="articleviews" /></td>
											<td><input type="text" class="form-control" value="${blog.blogsundry.isshow }" name="isshow" /></td>
											<td><button class="btn btn-primary btn-submit" value="提交">提交</button></td>
										</tr>

									</c:forEach>

								</tbody>
								<tfoot>

								</tfoot>
							</table>
							<div class="row">
								<div class="col-md-7 col-md-offset-3 col-sm-7 col-sm-offset-3">
									<div class="dataTables_paginate paging_simple_numbers" id="sample_4_paginate">
										<ul class="pagination">
											<!-- 判断是否是第一页，并决定是否禁用上一页 -->
											<c:if test="${pageInfo.pageNum == 1 }">
												<li class="paginate_button previous disabled" aria-controls="sample_4" tabindex="0" id="sample_4_previous">
													<a href="${pageContext.request.contextPath }/manage/pageForward/blogseo/${pageInfo.prePage }"><i class="fa fa-angle-left"></i></a>
												</li>
											</c:if>
											<c:if test="${pageInfo.pageNum != 1 }">
												<li class="paginate_button previous" aria-controls="sample_4" tabindex="0" id="sample_4_previous">
													<a href="${pageContext.request.contextPath }/manage/pageForward/blogseo/${pageInfo.prePage }"><i class="fa fa-angle-left"></i></a>
												</li>
											</c:if>
											<!-- 循环得到标签 -->
											<c:forEach items="${pageInfo.navigatepageNums }" var="num">
												<c:if test="${pageInfo.pageNum == num }">
													<li class="paginate_button active" aria-controls="sample_4" tabindex="0">
														<a href="${pageContext.request.contextPath }/manage/pageForward/blogseo/${num }">${num }</a>
													</li>
												</c:if>
												<c:if test="${pageInfo.pageNum != num }">
													<li class="paginate_button" aria-controls="sample_4" tabindex="0">
														<a href="${pageContext.request.contextPath }/manage/pageForward/blogseo/${num }">${num }</a>
													</li>
												</c:if>
											</c:forEach>
											<!-- 判断是否是最后一页，并决定是否禁用下一页 -->
											<c:if test="${pageInfo.pageNum == pageInfo.lastPage }">
												<li class="paginate_button next disabled" aria-controls="sample_3" tabindex="0" id="sample_3_next">
													<a href="${pageContext.request.contextPath }/manage/pageForward/blogseo/${pageInfo.nextPage }"><i class="fa fa-angle-right"></i></a>
												</li>
											</c:if>
											<c:if test="${pageInfo.pageNum != pageInfo.lastPage }">
												<li class="paginate_button next" aria-controls="sample_3" tabindex="0" id="sample_3_next">
													<a href="${pageContext.request.contextPath }/manage/pageForward/blogseo/${pageInfo.nextPage }"><i class="fa fa-angle-right"></i></a>
												</li>
											</c:if>
										</ul>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12 text-center">
							<div id="callBackPager"></div>
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
					2017 &copy; 代码搬运工 by Zunqi.
					<a href="http://itstudying.com" title="个人主页" target="_blank">Homepage!</a>
				</div>
				<div class="scroll-to-top">
					<i class="icon-arrow-up"></i>
				</div>
			</div>
			<script type="text/javascript" src="https://cdn.staticfile.org/jquery/1.11.2/jquery.min.js"></script>
			<script type="text/javascript" src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
			<script src="${pageContext.request.contextPath }/plugins/manage/metronic/assets/global/plugins/jquery-migrate.min.js" type="text/javascript"></script>
			<!-- IMPORTANT! Load jquery-ui.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
			<script src="${pageContext.request.contextPath }/plugins/manage/metronic/assets/global/plugins/jquery-ui/jquery-ui.min.js" type="text/javascript"></script>
			<script src="${pageContext.request.contextPath }/plugins/show/js/bootstrap.js"></script>
			<script src="${pageContext.request.contextPath }/plugins/manage/metronic/assets/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
			<script src="${pageContext.request.contextPath }/plugins/manage/metronic/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
			<script src="${pageContext.request.contextPath }/plugins/manage/metronic/assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
			<script src="${pageContext.request.contextPath }/plugins/manage/metronic/assets/global/plugins/jquery.cokie.min.js" type="text/javascript"></script>
			<script src="${pageContext.request.contextPath }/plugins/manage/metronic/assets/global/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
			<script src="${pageContext.request.contextPath }/plugins/manage/metronic/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
			<!-- END CORE PLUGINS -->
			<!-- BEGIN PAGE LEVEL PLUGINS -->
			<script type="text/javascript" src="${pageContext.request.contextPath }/plugins/manage/metronic/assets/global/plugins/select2/select2.min.js"></script>
			<script type="text/javascript" src="${pageContext.request.contextPath }/plugins/manage/metronic/assets/global/plugins/datatables/media/js/jquery.dataTables.min.js"></script>
			<script type="text/javascript" src="${pageContext.request.contextPath }/plugins/manage/metronic/assets/global/plugins/datatables/plugins/bootstrap/dataTables.bootstrap.js"></script>
			<!-- END PAGE LEVEL PLUGINS -->
			<!-- BEGIN PAGE LEVEL SCRIPTS -->
			<script src="${pageContext.request.contextPath }/plugins/manage/metronic/assets/global/scripts/metronic.js" type="text/javascript"></script>
			<script src="${pageContext.request.contextPath }/plugins/manage/metronic/assets/admin/layout/scripts/layout.js" type="text/javascript"></script>
			<script src="${pageContext.request.contextPath }/plugins/manage/metronic/assets/admin/layout/scripts/quick-sidebar.js" type="text/javascript"></script>
			<script src="${pageContext.request.contextPath }/plugins/manage/metronic/assets/admin/layout/scripts/demo.js" type="text/javascript"></script>
			<script src="${pageContext.request.contextPath }/plugins/manage/easyUI/jquery.easyui.min.js" type="text/javascript"></script>

			<script>
				jQuery(document).ready(function() {
					Metronic.init(); // init metronic core components
					Layout.init(); // init current layout
					QuickSidebar.init(); // init quick sidebar
					Demo.init(); // init demo features
				});
			</script>
			<script>
				$(".btn-submit").on("click", function() {
					var tr = $(this).parents("tr").eq(0);
					var inputs = $(this).parents("tr").eq(0).find("input");
					var form = $(tr.find("form"));
					form.append($(inputs));
					form.submit();
					
				})
			</script>
			<script>
				//动态title
				! function() {
					var t, e = document.title;
					document.addEventListener("visibilitychange",
						function() {
							document.hidden ? (document.title = "死鬼去哪里了！", clearTimeout(t)) : (document.title = "(つェ⊂)咦!又好了!", t = setTimeout(function() {
									document.title = e
								},
								2e3))
						})
				}()
			</script>
	</body>
	<!-- END BODY -->

</html>