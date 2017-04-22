<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/css/app/borrow.css">
<link rel="stylesheet" href="resources/css/plugins/other/mdialog.css" />
<script type="text/javascript" src="resources/js/component/other/zepto.min.js"></script>
<script type="text/javascript" src="resources/js/component/other/mdialog.js"></script>
<script type="text/javascript" src="resources/js/app/borrow.js"></script>
<title>借书管理</title>
</head>
<body>
	<div id="borrow_center">
		<div id="borrow_toolbar">
			<div id="query" class="query_div">
				<input id="book_isbn"  class="booknum" placeholder=" 书 号"/>
				<input id="book_name"  class="bookname" placeholder=" 书 名"/>
				<input id="book_type" class="booktype" placeholder=" 类 型"/>
				<button type="button" class="btn btn-info" id="querybtn">查 询</button>
			</div>
	    </div>
		<table id="borrow_table">
	    </table>
	</div>
</body>
</html>