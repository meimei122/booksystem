<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/css/plugins/bootstrap/bootstrap.css" />
<link rel="stylesheet" href="resources/css/app/register.css" />
<title>图书管理系统注册页面</title>
</head>
<body>
	<div>
		<div class="col-lg-3"></div>
		<div class="col-lg-6 register">
			<h2 class="title">注 册</h2>
			<form id="registerForm" class="registerFormStyle">
				<div>
					<input type="text" class="comInput" id="username" name="username" placeholder="用户名"/>
				</div>
				<div>
					<input type="tel" class="comInput" id="phone" name="phone" placeholder="手机号"/>
				</div>
				<div>
					<input type="text" class="comInput" id="studentId" name="studentId" placeholder="学   号"/>
				</div>
				<div>
					<input type="password" class="comInput" id="password1" name="password1" placeholder="初始密码"/>
				</div>
				<div>
					<input type="password" class="comInput" id="password2" name="password2" placeholder="确认密码"/>
				</div>
				
				<button class="btn btn-primary submit" value="register" type="submit">注  册</button>
				<button class="btn btn-info cancel" value="cancel" type="reset">重  置</button>
			</form>
		</div>
		<div class="col-lg-3"></div>
	</div>
</body>
</html>