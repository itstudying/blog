<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>代码搬运工</title>
		<script type="application/x-javascript">
			addEventListener("load", function() {
				setTimeout(hideURLbar, 0);
			}, false);

			function hideURLbar() {
				window.scrollTo(0, 1);
			}
		</script>
		<link href="${pageContext.request.contextPath }/plugins/login/css/style.css" rel='stylesheet' type='text/css' />
		<!--//webfonts-->
		<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
	</head>

	<body>
		<script>
			$(document).ready(function(c) {
				$('.close').on('click', function(c) {
					$('.login-form').fadeOut('slow', function(c) {
						$('.login-form').remove();
					});
				});
			});
		</script>
		<!--SIGN UP-->
		<h1></h1>
		<div class="login-form">
			<div class="close"></div>
			<div class="head-info">
				<label class="lbl-1"></label> <label class="lbl-2"> </label> <label class="lbl-3"> </label>
			</div>
			<div class="avtar">
				<img src="${pageContext.request.contextPath }/plugins/login/images/avtar.png" />
			</div>
			<form action="${pageContext.request.contextPath }/manage/login" method="post">
				<input type="text" class="text" placeholder="输入邮箱" name="blogTManagerCustom.email" value="${blogTManagerCustom.email }">
				<div class="key">
					<input type="password" placeholder="输入密码" name="blogTManagerCustom.password" value="${blogTManagerCustom.password }">
				</div>
				<div class="signin">
					<input type="submit" value="Login">
				</div>
			</form>
		</div>
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