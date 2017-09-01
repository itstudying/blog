<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/plugins/show/service/css/style.css" />

		<!--[if lt IE 9]>
	    <script src="js/html5shiv.js"></script>
	    <script src="js/respond.min.js"></script>
    <![endif]-->
		<link rel="shortcut icon" href="${pageContext.request.contextPath }/plugins/show/images/ico/favicon.ico">
		<link rel="apple-touch-icon-precomposed" sizes="144x144" href="${pageContext.request.contextPath }/plugins/show/images/ico/apple-touch-icon-144-precomposed.png">
		<link rel="apple-touch-icon-precomposed" sizes="114x114" href="${pageContext.request.contextPath }/plugins/show/images/ico/apple-touch-icon-114-precomposed.png">
		<link rel="apple-touch-icon-precomposed" sizes="72x72" href="${pageContext.request.contextPath }/plugins/show/images/ico/apple-touch-icon-72-precomposed.png">
		<link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath }/plugins/show/images/ico/apple-touch-icon-57-precomposed.png">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/csshake/1.5.2/csshake-slow.min.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/plugins/show/particleground/common.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/plugins/show/css/style.css" />
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
			<h1 class="page-header text-center">关于博主</h1>
			<div class="container">
				<div class="ablot-intro">
					<h2>1. 个人简介</h2>
					<div class="col-md-11 col-lg-offset-1">
						<p>
							李俊奇，男，95后，程序员，即将毕业于
							<a href="http://www.ahdy.edu.cn/">安徽电院</a>&nbsp;软件技术专业
						</p>
					</div>
				</div>
				<div class="about-skill">
					<h2>2. 个人技能</h2>
					<div class="col-md-11 col-lg-offset-1">
						<ul>
							<li>
								<h3>2.1 前端</h3>
								<div class="col-md-11 col-lg-offset-1">
									<p>html、css、js、jQuery、bootstrap、easyUI、html5+（了解）、mui（正在学习中）</p>
								</div>

							</li>
							<li>
								<h3>2.2 后端</h3>
								<div class="col-md-11 col-sm-offset-1">
									<p>Java、框架部分（struct（了解）、spring、springmvc、mybatis、hibernate）、分布式缓存（ehcache）以及 log4j 日志管理、maven、RESTful 软件架构风格等其他技术的综合应用</p>
								</div>
							</li>
							<li>
								<h3>2.3 计划</h3>
								<div class="col-md-11 col-sm-offset-1">
									<p>年底前完成svn、redis、及mui的学习，试着根据追踪 JavaEE 各大框架源代码学习其原理，不能只停留在会用阶段</p>
								</div>
							</li>
						</ul>
					</div>
				</div>

				<div class="about-contact">
					<h2>
					3. 联系方式
					</h1>
					<div class="col-md-11 col-lg-offset-1">
						<div class="address">
							<span>1. QQ：1312937593</span><br /> <span>2. phone：13956827827</span><br /> <span>3.
								email：1312937593@qq.com</span><br /> <span>4. Github：<a href="https://github.com/Zunqi">代码搬运工</a></span><br />
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
			<li><a href="${pageContext.request.contextPath }/show/forward/blogs" class=" shake-slow">
					<div class="sidebox">
						<img src="${pageContext.request.contextPath }/plugins/show/service/img/side_blog_list.png"
							class="img-responsive" title="博客列表">
					</div>
			</a></li>
			<li><a href="${pageContext.request.contextPath }/show/forward/openSource-pro"
				class=" shake-slow">
					<div class="sidebox">
						<img src="${pageContext.request.contextPath }/plugins/show/service/img/side_opensource.png"
							class="img-responsive" title="开源项目">
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
	<script type="text/javascript" src="https://cdn.staticfile.org/jquery/1.11.2/jquery.min.js"></script>
	<script type="text/javascript" src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/plugins/show/js/lightbox.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/plugins/show/js/wow.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/plugins/show/js/main.js"></script>
	<!-- 粒子特效背景 -->
	<script type='text/javascript'
		src='${pageContext.request.contextPath }/plugins/show/particleground/jquery.particleground.js'></script>
	<script type="text/javascript">
		$("div.blog-details img").addClass("img-responsive img-thumbnail");
		//粒子特效背景
		$('#particles').particleground({
			lineColor : "#D1EEEE",
			dotColor : "#D1EEEE",
			density : 13000
		});

		//回到顶部
		function goTop() {

			$('html,body').animate({
				'scrollTop' : 0
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