$(document).ready(function(){
	var lis,data = [{title:'主页',id:'home'},{title:'借书管理'},{title:'还书管理'},{title:'个人信息'}];
	for(var i = 0;i < data.length; i++){
		lis = $('<li><a class="three-d" id="'+data[i].id+'">'+data[i].title+'<span class="three-d-box"><span class="front">'+data[i].title+'</span>'+
		'<span class="back">'+data[i].title+'</span></span></a></li>');
		$('ul').append(lis);
		$('ul li:first a').addClass('active');
	}
	$('a').on('click',function(){
		$('li').find('a').removeClass('active');
		$(this).addClass('active');
	});
});
