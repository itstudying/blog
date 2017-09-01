<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>

	<head>
		<meta charset="utf-8" />
		<title>代码搬运工</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<meta name="author" content="">
		<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
		<link href="https://cdn.staticfile.org/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath }/plugins/show/css/animate.min.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath }/plugins/show/css/lightbox.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath }/plugins/show/css/main.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath }/plugins/show/css/responsive.css" rel="stylesheet">

		<!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
<![endif]-->
		<link rel="shortcut icon" href="${pageContext.request.contextPath }/plugins/show/images/ico/favicon.ico">
		<link rel="apple-touch-icon-precomposed" sizes="144x144" href="${pageContext.request.contextPath }/plugins/show/images/ico/apple-touch-icon-144-precomposed.png">
		<link rel="apple-touch-icon-precomposed" sizes="114x114" href="${pageContext.request.contextPath }/plugins/show/images/ico/apple-touch-icon-114-precomposed.png">
		<link rel="apple-touch-icon-precomposed" sizes="72x72" href="${pageContext.request.contextPath }/plugins/show/images/ico/apple-touch-icon-72-precomposed.png">
		<link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath }/plugins/show/images/ico/apple-touch-icon-57-precomposed.png">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/plugins/show/particleground/common.css" />

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
		<section id="home-slider">
			<div class="container">
				<div class="row">
					<div class="main-slider">
						<div class="slide-text">
							<h1>代码搬运工</h1>
							<p>学历代表过去，能力代表现在，学习能力代表未来！</p>
						</div>
						<img src="${pageContext.request.contextPath }/plugins/show/images/home/slider/hill.png" class="slider-hill" alt="slider image"> <img src="${pageContext.request.contextPath }/plugins/show/images/home/slider/house.png" class="slider-house" alt="slider image"> <img src="${pageContext.request.contextPath }/plugins/show/images/home/slider/sun.png" class="slider-sun" alt="slider image"> <img src="${pageContext.request.contextPath }/plugins/show/images/home/slider/birds1.png" class="slider-birds1" alt="slider image"> <img src="${pageContext.request.contextPath }/plugins/show/images/home/slider/birds2.png" class="slider-birds2" alt="slider image">
					</div>
				</div>
			</div>
			<div class="preloader">
				<i class="fa fa-sun-o fa-spin"></i>
			</div>
		</section>
		<!--/#home-slider-->

		<!--/#action-->
		<section id="services">
			<div class="container">
				<div class="row">
					<div class="col-sm-4 text-center padding wow fadeIn" data-wow-duration="1000ms" data-wow-delay="300ms">
						<div class="single-service">
							<a href="${pageContext.request.contextPath }/show/forward/blogs">
								<div class="wow scaleIn" data-wow-duration="500ms" data-wow-delay="300ms">
									<img src="${pageContext.request.contextPath }/plugins/show/images/home/icon-blog.png" alt="" class="img-responsive center-block">
								</div>
								<h2>博客随心记</h2>
								<p>记录下自己学习的点滴，及转载其他大神优秀博客</p>
							</a>
						</div>
					</div>
					<div class="col-sm-4 text-center padding wow fadeIn" data-wow-duration="1000ms" data-wow-delay="600ms">
						<div class="single-service">
							<a href="${pageContext.request.contextPath }/show/forward/openSource-pro">
								<div class="wow scaleIn" data-wow-duration="500ms" data-wow-delay="600ms">
									<img src="${pageContext.request.contextPath }/plugins/show/images/home/icon-project.png" alt="" class="img-responsive center-block">
								</div>
								<h2>开源项目</h2>
								<p>项目驱动式学习，有需求才会促使我学习更多技能</p>
							</a>
						</div>
					</div>
					<div class="col-sm-4 text-center padding wow fadeIn" data-wow-duration="1000ms" data-wow-delay="900ms">
						<div class="single-service">
							<a href="${pageContext.request.contextPath }/show/forward/about">
								<div class="wow scaleIn" data-wow-duration="500ms" data-wow-delay="900ms">
									<img src="${pageContext.request.contextPath }/plugins/show/images/home/icon-about_us.png" alt="" class="img-responsive center-block">
								</div>
								<h2>关于我</h2>
								<p>我的专业技能及个人信息，If you would like to invite me to dinner, please contact me</p>
							</a>
						</div>
					</div>
				</div>
			</div>
		</section>

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

		<!--/#services-->
		<script type="text/javascript" src="https://cdn.staticfile.org/jquery/1.11.2/jquery.min.js"></script>
		<script type="text/javascript" src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/plugins/show/js/lightbox.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/plugins/show/js/wow.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/plugins/show/js/main.js"></script>
		<script type='text/javascript' src='${pageContext.request.contextPath }/plugins/show/particleground/jquery.particleground.js'></script>
		<script>
			//粒子特效背景
			$('#particles').particleground({
				lineColor: "#D1EEEE",
				dotColor: "#D1EEEE",
				density: 13000
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

</html>