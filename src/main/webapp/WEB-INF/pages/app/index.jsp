<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript">
  var id = '<%=request.getSession().getAttribute("sid") %>';
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/css/plugins/bootstrap/bootstrap.css" />
<link rel="stylesheet" href="resources/css/plugins/jquery/jquery-ui.min.css" />
<link rel="stylesheet" href="resources/css/plugins/font-awesomer/font-awesome.min.css" />
<link type="text/css" href="resources/css/plugins/bootstrap/bootstrap-table.css" rel="stylesheet">
<link type="text/css" href="resources/css/plugins/bootstrap/bootstrap-theme.css" rel="stylesheet">
<link type="text/css" href="resources/css/plugins/bootstrap/bootstrapValidator.min.css" rel="stylesheet">
<link type="text/css" href="resources/css/plugins/bootstrap/select2.css" rel="stylesheet"/>
<link type="text/css" href="resources/css/plugins/bootstrap/bootstrap-editable.css" rel="stylesheet"/>
<link rel="stylesheet" href="resources/css/app/menu.css" />
<link rel="stylesheet" href="resources/css/app/index.css" />
<link rel="stylesheet" href="resources/css/plugins/calender/calendar.css">
<script type="text/javascript" src="resources/js/component/jquery/jquery-1.9.1.js"></script>
<script type="text/javascript" src="resources/js/component/calender/calendar.js"></script>
<script type="text/javascript" src="resources/js/component/jquery/prefixfree.min.js"></script>
<title>图书管理系统</title>
</head>
<body>
	<div id="index_center">
		<div class="page">
			<section class="demo">
				<div id="nav">
					<ul class="nav-menu clearfix unstyled">
					</ul>
				</div>
				<div>
					<a href="studentLogin" class="quit"><span class="glyphicon glyphicon-off" aria-hidden="true"></span>退出</a>
				</div>
			</section>
		</div>
		<div id="index_content">
			<div class="col-lg-1"></div>
			<div class="col-lg-3 bookClass">
				<h3>图书类型统计占比图</h3>
				<div id="bookType"></div>
			</div>
			<div class="col-lg-1"></div>
			<div class="col-lg-3 borrowClass">
				<h3>借书类型统计占比图</h3>
				<div id="borrowType"></div>
			</div>
			<div class="col-lg-1"></div>
			<div class="col-lg-3">
				<div id="Demo">
					<div id="CalendarMain">
  						<div id="title"> 
						  <a class="selectBtn month" href="javascript:" onClick="CalendarHandler.CalculateLastMonthDays();"><span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span></a>
						  <a class="selectBtn selectYear" href="javascript:" onClick="CalendarHandler.CreateSelectYear(CalendarHandler.showYearStart);">2017年</a>
						  <a class="selectBtn selectMonth" onClick="CalendarHandler.CreateSelectMonth()">4月</a> 
						  <a class="selectBtn nextMonth" href="javascript:" onClick="CalendarHandler.CalculateNextMonthDays();"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span></a>
						  <a class="selectBtn currentDay" href="javascript:" onClick="CalendarHandler.CreateCurrentCalendar(0,0,0);">今天</a>
						</div>
  						<div id="context">
						    <div class="week">
						      <h3> 一 </h3>
						      <h3> 二 </h3>
						      <h3> 三 </h3>
						      <h3> 四 </h3>
						      <h3> 五 </h3>
						      <h3> 六 </h3>
						      <h3> 日 </h3>
						    </div>
						    <div id="center">
						      <div id="centerMain">
						        <div id="selectYearDiv"></div>
						        <div id="centerCalendarMain">
						          <div id="Container"></div>
						        </div>
						        <div id="selectMonthDiv"></div>
						      </div>
						    </div>
							<div id="foots"><a id="footNow">19:14:34</a></div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
<script type="text/javascript" data-main="resources/js/app/main.js" src="resources/js/component/require/require-2.1.11.js"></script>
</body>
</html>