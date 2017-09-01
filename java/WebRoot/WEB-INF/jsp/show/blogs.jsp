<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<title>代码搬运工</title>
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.staticfile.org/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath }/plugins/show/css/animate.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath }/plugins/show/css/lightbox.css" rel="stylesheet">
<link href="${pageContext.request.contextPath }/plugins/show/css/main.css" rel="stylesheet">
<link href="${pageContext.request.contextPath }/plugins/show/css/responsive.css" rel="stylesheet">
<!-- 右侧服务 -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/plugins/show/service/css/style.css" />

<link rel="shortcut icon"
	href="${pageContext.request.contextPath }/plugins/show/images/ico/favicon.ico">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="${pageContext.request.contextPath }/plugins/show/images/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="${pageContext.request.contextPath }/plugins/show/images/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="${pageContext.request.contextPath }/plugins/show/images/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="${pageContext.request.contextPath }/plugins/show/images/ico/apple-touch-icon-57-precomposed.png">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/csshake/1.5.2/csshake-slow.min.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/plugins/show/particleground/common.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/plugins/show/css/style.css" />
			<script>
				//百度统计
		var _hmt = _hmt || [];
		(function() {
		  var hm = document.createElement("script");
		  hm.src = "https://hm.baidu.com/hm.js?bead393ce400220db38cfb715632bc49";
		  var s = document.getElementsByTagName("script")[0]; 
		  s.parentNode.insertBefore(hm, s);
		})();
		</script>
</head>
<!--/head-->

<body>

	<!-- 在刚刚加载时根据博客分类的名称找到分类的id，并添加到一个页面域的变量中 -->
		<c:forEach items="${blogClassifyCountList }" var="map">
			<!-- 判断如果是那种分类的博客，如果用户选择的是分类博客文章，则将哪个分类博客的li设置为active -->
			<c:if test="${map['classify'] eq classify }">
			<c:set scope="page" var="blogClassifyId" value="${map['id'] }"></c:set>
			</c:if>
		</c:forEach>
		<!-- 设置变量结束 -->

	<div id="particles"></div>
	<header id="header">
		<div class="container">
			<div class="page-header-fixed">
				<h1>
					<a href="http://itstudying.com">代码搬运工</a>
				</h1>
				<h3>学历代表过去，能力代表现在，学习能力代表未来！</h3>
			</div>
		</div>
	</header>

	<!--/#page-breadcrumb-->

	<section id="blog" class="padding-top">
		<div class="container">
			<ol class="breadcrumb">
				<li><a href="http://itstudying.com">首页</a></li>
				<c:if test="${blogClassifyId!=null and blogClassifyId!='' }">
					<li><a href="${pageContext.request.contextPath }/show/forward/blogs" title="${classify }页">博客随心记</a></li>
					<li class="active">${classify }</li>
				</c:if>
				<c:if test="${blogClassifyId==null or blogClassifyId=='' }">
					<li class="active">博客随心记</li>
				</c:if>
			</ol>

			<div class="row">

				<div class="col-md-8 col-sm-6">
					<div class="row">
						<c:forEach items="${pageInfo.list}" var="blog">
							<c:if test="${blog.blogsundry.isshow == 1 }">
								<div class="col-md-12 col-sm-12">
									<div class="single-blog two-column">
										<div class="post-thumb">
											<a href="${pageContext.request.contextPath }/show/forward/${blog.id }"> <!-- 循环找出该博客的文章文件，并找到第一个放在简介图片中 -->
												<img src="${blog.introimg }" class="img-responsive img-thumbnail" alt="">
											</a>
											<div class="post-overlay">
												<fmt:parseDate value="${blog.pubtime }" var="blogPubtime" pattern="yyyy-MM-dd HH:mm:ss"></fmt:parseDate>
	
												<span class="uppercase"><a href="javascript:return false"><fmt:formatDate value="${blogPubtime }"
															pattern="dd" /> <br> <small><fmt:formatDate value="${blogPubtime }"
																pattern="MM" /></small></a></span>
											</div>
										</div>
										<div class="post-content overflow">
											<h2 class="post-title bold">
												<a href="${pageContext.request.contextPath }/show/forward/${blog.id }">${blog.title }</a>
											</h2>
											<p>${blog.intro }[...]</p>
											<a href="${pageContext.request.contextPath }/show/forward/${blog.id }" class="read-more">查看详情</a>
											<div class="post-bottom overflow">
												<ul class="nav navbar-nav post-nav">
													<li><a href="javascript:return false" title="${blog.classify }页"><i class="fa fa-tag"></i>${blog.classify }</a></li>
													<li><a href="${pageContext.request.contextPath }/show/forward/${blog.id }" title="评论"><i
															class="fa fa-comments"></i>评论</a></li>
												</ul>
											</div>
										</div>
									</div>
								</div>
							</c:if>
						</c:forEach>
						<div class="blog-pagination">
							<ul class="pagination">
								<li><a
									href="${pageContext.request.contextPath }/show/pageForward/blogs/${pageInfo.prePage }">pre</a>
								</li>
								<c:choose>
									<c:when test="${classifyId==null || classifyId==''}">
										<c:forEach items="${pageInfo.navigatepageNums }" var="num">
											<c:if test="${num == pageInfo.pageNum }">
												<li class="active"><a
													href="${pageContext.request.contextPath }/show/pageForward/blogs/${num }">${num }</a></li>
											</c:if>
											<c:if test="${num != pageInfo.pageNum }">
												<li><a href="${pageContext.request.contextPath }/show/pageForward/blogs/${num }">${num }</a>
												</li>
											</c:if>

										</c:forEach>
									</c:when>
									<c:otherwise>
										<c:forEach items="${pageInfo.navigatepageNums }" var="num">
											<c:if test="${num == pageInfo.pageNum }">
												<li class="active"><a
													href="${pageContext.request.contextPath }/show/classifyForward/${classifyId }/${num }">${num }</a>
												</li>
											</c:if>
											<c:if test="${num != pageInfo.pageNum }">
												<li><a
													href="${pageContext.request.contextPath }/show/classifyForward/${classifyId }/${num }">${num }</a>
												</li>
											</c:if>

										</c:forEach>
									</c:otherwise>
								</c:choose>

								<li><a
									href="${pageContext.request.contextPath }/show/pageForward/blogs/${pageInfo.nextPage }">next</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-md-3 col-sm-5">
					<div class="sidebar blog-sidebar">
						<div class="sidebar-item  recent">
							<h3>
								本博客看门神兽<span class="glyphicon glyphicon-arrow-down"></span>
							</h3>
							<object type="application/x-shockwave-flash" style="outline: none;"
								data="http://cdn.abowman.com/widgets/dog/dog.swf?3?" class="img-responsive">
								<param name="movie" value="http://cdn.abowman.com/widgets/dog/dog.swf?3?"></param>
								<param name="AllowScriptAccess" value="always"></param>
								<param name="wmode" value="opaque"></param>
								<param name="bgcolor" value="FFFFFF" />
							</object>
						</div>
						<div class="sidebar-item categories">
							<h3>分类导航</h3>
							<ul class="nav navbar-stacked">
								<!-- 显示全部链接时，方便用户查看所有博客文章 -->
								<c:choose>
									<c:when test="${classify==null || classify==''}">
										<li class="active"><a href="${pageContext.request.contextPath }/show/forward/blogs">全部<span
												class="pull-right"></span></a></li>
									</c:when>
									<c:otherwise>
										<li><a href="${pageContext.request.contextPath }/show/forward/blogs">全部<span
												class="pull-right"></span></a></li>
									</c:otherwise>
								</c:choose>
								<!-- /显示全部链接结束 -->
								<!-- 循环将从后台查询出的所有博客分类及各个分类博客文章的数量显示 -->
								<c:forEach items="${blogClassifyCountList }" var="map">
									<!-- 判断如果是那种分类的博客，如果用户选择的是分类博客文章，则将哪个分类博客的li设置为active -->
									<c:if test="${map['classify'] != classify }">
										<li><a
											href="${pageContext.request.contextPath }/show/classifyForward/${map['id'] }/1">${map['classify'] }<span
												class="pull-right">(${map['count'] })</span></a></li>
									</c:if>
									<c:if test="${map['classify'] eq classify }">
										<li class="active"><a
											href="${pageContext.request.contextPath }/show/classifyForward/${map['id'] }/1">${map['classify'] }<span
												class="pull-right">(${map['count'] })</span></a></li>
									</c:if>

								</c:forEach>

							</ul>
						</div>
					</div>
				</div>
			</div>
	</section>
	<!--/#blog-->

	<!--/#blog-->

	<footer class="footer">
		<div class="container">
			<div class="col-sm-12">
				<div class="text-center">
					<p>
						2015 - 2017 <a target="_blank" href="http://itstudying.com">&copy; 代码搬运工.</a>
					</p>
				</div>
			</div>
		</div>
	</footer>
	<!--/#footer-->
	<!--
        	作者：1312937593@qq.com
        	时间：2017-08-07
        	描述：客服及导航
        -->
	<div class="side">
		<ul>
			<li class=" shake-slow"><a href="http://itstudying.com">
					<div class="sidebox">
						<img src="${pageContext.request.contextPath }/plugins/show/service/img/side_home.png"
							class="img-responsive" title="主页">
					</div>
			</a></li>
			<li><a href="${pageContext.request.contextPath }/show/forward/openSource-pro"
				class=" shake-slow">
					<div class="sidebox">
						<img src="${pageContext.request.contextPath }/plugins/show/service/img/side_opensource.png"
							class="img-responsive" title="开源项目">
					</div>
			</a></li>
			<li><a href="${pageContext.request.contextPath }/show/forward/about" class=" shake-slow">
					<div class="sidebox">
						<img src="${pageContext.request.contextPath }/plugins/show/service/img/side_about.png"
							class="img-responsive" title="关于我">
					</div>
			</a></li>
			<li><a target="_blank" href="http://wpa.qq.com/msgrd?v=3&uin=1312937593&site=qq&menu=yes">
					<div class="sidebox shake-slow">
						<img src="${pageContext.request.contextPath }/plugins/show/service/img/side_qq.png"
							title="联系我" class="img-responsive shake-slow shake-constant shake-constant--hover">
					</div>
			</a></li>
			<li style="border: none;"><a href="javascript:goTop();">
					<div class="sidebox shake-slow">
						<img src="${pageContext.request.contextPath }/plugins/show/service/img/side_icon05.png"
							class="img-responsive" />
					</div>
			</a></li>
		</ul>
	</div>
	<script type="text/javascript" src="${pageContext.request.contextPath }/plugins/show/js/jquery.min.js"></script>
	<script type="text/javascript" src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/plugins/show/js/lightbox.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/plugins/show/js/wow.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/plugins/show/js/main.js"></script>
	<!-- 粒子特效背景 -->
	<script type='text/javascript'
		src='${pageContext.request.contextPath }/plugins/show/particleground/jquery.particleground.js'></script>
	<script type="text/javascript">
			//粒子特效背景
			$('#particles').particleground({
				lineColor: "#D1EEEE",
				dotColor: "#D1EEEE",
				density: 13000
			});

			//回到顶部
			function goTop() {

				$('html,body').animate({
					'scrollTop': 0
				}, 600);

			}
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

</html>