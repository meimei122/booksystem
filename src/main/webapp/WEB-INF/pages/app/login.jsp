<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/css/plugins/font-awesomer/font-awesome.min.css" />
<link rel="stylesheet" href="resources/css/plugins/bootstrap/bootstrap.css" />
<link rel="stylesheet" href="resources/css/plugins/bootstrap/bootstrapValidator.min.css" />
<link rel="stylesheet" href="resources/css/app/login.css" />
<script type="text/javascript" src="resources/js/component/jquery/jquery-1.9.1.js"></script>
<script type="text/javascript" src="resources/js/component/bootstrap/bootstrap-3.3.5.min.js"></script>
<script type="text/javascript" src="resources/js/component/bootstrap/bootstrapValidator.min.js"></script>
<script type="text/javascript" src="resources/js/app/background.js"></script>
<script type="text/javascript" src="resources/js/app/login.js"></script>
<title>图书管理系统登录页面</title>
</head>
<body>
	<div class="demo">
		<div class="container">
			<div class="row">
				<div class="col-md-offset-3 col-md-6">
					<form id="loginForm" class="form-horizontal" action="studentIndex" method="post">
						<span class="heading">用户登录</span>
						<div class="form-group">
							<input type="text" class="form-control" id="username" name="username" placeholder="用户名">
							<i class="fa fa-user"></i>
						</div>
						<div class="form-group help">
							<input type="password" class="form-control" id="password" name="password" placeholder="密　码">
							<i class="fa fa-lock"></i>
						</div>
						<div class="form-group">
							<div class="main-checkbox">
								<input type="checkbox" value="None" id="checkbox1" name="check">
								<label for="checkbox1"></label>
							</div>
							<span class="text">记住密码</span>
							<button type="submit" class="btn btn-default">登录</button>
						</div>
						<a href="studentRegister" style="color: #00b4ef">没有账号?注册一个吧</a>
					</form>
					
				</div>
			</div>
		</div>
	</div>
	<canvas id="canv"></canvas>
</body>
</html>