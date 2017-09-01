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
		<!-- 右侧服务 -->
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/plugins/show/service/css/style.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/plugins/show/css/main.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/plugins/show/particleground/common.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/plugins/show/css/style.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/plugins/show/css/mousehover.css" />
		
		
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

		<div class="container about">
			<h1 class="page-header text-center">开源项目</h1>
			<div class="container">
				<div class="row">
					<c:forEach items="${pageInfo.list }" var="blog">
						<c:if test="${blog.blogsundry.isshow == 1 }">
							<div class="col-md-4">
								<div class="thumbnail img-rounded">
									<!-- 循环找出该博客的文章文件，并找到第一个放在简介图片中 -->
									<img src="${blog.introimg }" class="img-responsive img-rounded" alt="${blog.title }">
									<div class="caption text-center">
										<h3>${blog.title }</h3>
										<p>${blog.intro }[...]</p>
									</div>
									<div class="hover" hidden="hidden">
										<a href="javascript:downloadBlogFile()"> <img src="${pageContext.request.contextPath}/plugins/show/images/download.png" class="img-responsive center-block img-circle" />
										</a>
									</div>
								</div>
	
							</div>
						</c:if>
					</c:forEach>
					<div class="col-md-4">
						<div class="">
						<p>未完待续...</p>
						</div>
					</div>
				</div>
			</div>
		</div>

		<footer class="footer">
			<div class="container">
				<div class="col-sm-12">
					<div class="text-center">
						<p>
							2015 - 2017
							<a target="_blank" href="http://itstudying.com">&copy; 代码搬运工.</a>
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
				<li class=" shake-slow">
					<a href="http://itstudying.com">
						<div class="sidebox">
							<img src="${pageContext.request.contextPath}/plugins/show/service/img/side_home.png" class="img-responsive" title="主页">
						</div>
					</a>
				</li>
				<li>
					<a href="${pageContext.request.contextPath}/show/forward/blogs" class=" shake-slow">
						<div class="sidebox">
							<img src="${pageContext.request.contextPath}/plugins/show/service/img/side_blog_list.png" class="img-responsive" title="博客列表">
						</div>
					</a>
				</li>
				<li>
					<a href="${pageContext.request.contextPath }/show/forward/about" class=" shake-slow">
						<div class="sidebox">
							<img src="${pageContext.request.contextPath }/plugins/show/service/img/side_about.png" class="img-responsive" title="关于我">
						</div>
					</a>
				</li>
				<li>
					<a target="_blank" href="http://wpa.qq.com/msgrd?v=3&uin=1312937593&site=qq&menu=yes">
						<div class="sidebox shake-slow">
							<img src="${pageContext.request.contextPath}/plugins/show/service/img/side_qq.png" title="联系我" class="img-responsive shake-slow shake-constant shake-constant--hover">
						</div>
					</a>
				</li>
				<li style="border: none;">
					<a href="javascript:goTop();">
						<div class="sidebox shake-slow">
							<img src="${pageContext.request.contextPath}/plugins/show/service/img/side_icon05.png" class="img-responsive" />
						</div>
					</a>
				</li>
			</ul>
		</div>
		<script type="text/javascript" src="https://cdn.staticfile.org/jquery/1.11.2/jquery.min.js"></script>
		<script type="text/javascript" src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<!-- 粒子特效背景 -->
		<script type='text/javascript' src='${pageContext.request.contextPath}/plugins/show/particleground/jquery.particleground.js'></script>
		<script type="text/javascript">
			$("div.blog-details img").addClass("img-responsive img-thumbnail");
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

			$(".thumbnail").hover(function() {
				var hover = $(this).find(".hover");
				var img = $(this).find("img");
				hover.css("position", "absolute")
				hover.show();
				hover.stop().animate({
					"top": (img.height() / 2) - (hover.height() / 4),
					"left": (img.width() / 2) - (hover.width() / 2),
					"opacity": "1"
				})
				img.animate({
					"opacity": "0.5"
				})
			}, function() {
				var hover = $(this).find(".hover");
				var img = $(this).find("img");
				hover.stop().animate({
					"top": 0,
					"left": 0,
					"position": "",
					"opacity": "0"
				})
				img.animate({
					"opacity": "1"
				})
			})

			function downloadBlogFile() {
				alert("暂时不支持下载，请联系管理员")
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