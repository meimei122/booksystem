<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="resources/js/app/person.js"></script>
<link rel="stylesheet" href="resources/css/app/person.css">
<title>个人信息</title>
</head>
<body>
	<div id="person_center">
		<div class="col-lg-3"></div>
		<div class="col-lg-6 person">
			<h2 class="title">个 人 信 息</h2>
			<form id="personForm" class="personFormStyle" action="">
				<div class="form-group">
					<input type="text" class="comInput" id="username" name="username" placeholder="用户名" disabled/>
				</div>
				<div class="form-group">
					<input type="text" class="comInput" id="studentId" name="studentId" placeholder="学   号" disabled/>
				</div>
				<div class="form-group">
					<input type="tel" class="comInput" id="phone" name="phone" placeholder="手机号"/>
				</div>
				<div class="form-group">
					<input type="password" class="comInput" id="beforPassword" name="beforPassword" placeholder="原始密码"/>
				</div>
				<div class="form-group">
					<input type="password" class="comInput" id="nowPassword" name="nowPassword" placeholder="新密码"/>
				</div>
				
				<div class="buttons">
					<button class="btn btn-primary submit" value="register" type="submit">确       定</button>
					<button class="btn btn-info" value="cancel" type="button">取       消</button>
				</div>
			</form>
		</div>
		<div class="col-lg-3"></div>
	</div>
</body>
</html>