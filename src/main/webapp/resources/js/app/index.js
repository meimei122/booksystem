/**
 * 默认页面的js
 */
(function(){
	require(['orange','jquery'],function(orange,jquery){
		//菜单导航栏部分
		var lis,data = [{title:'主页',selector:'#index_content',path:'app/index'},{title:'借书管理',selector:'#borrow_center',path:'app/borrow'},{title:'还书管理',selector:'#returnBook_center',path:'app/returnBook'},{title:'个人信息',selector:'#person_center',path:'app/person'}];
		for(var i = 0;i < data.length; i++){
			lis = $('<li><a class="three-d" selector="'+data[i].selector+'" path="'+data[i].path+'">'+data[i].title+'<span class="three-d-box"><span class="front">'+data[i].title+'</span>'+
			'<span class="back">'+data[i].title+'</span></span></a></li>');
			$('ul').append(lis);
			$('ul li:first a').addClass('active');
		}
		$('li a').on('click',function(){
			$('li').find('a').removeClass('active');
			$(this).addClass('active');
			if($(this).attr('path')!=undefined){
				var path = $(this).attr('path'),
				selector = $(this).attr('selector');
				orange.loadPage({
					url: 'system/getPage.service?path='+path, 
					target: 'index_content', 
					selector: selector, 
					replace: true, 
					success: function(response) {
					
				}});
			}
		});
		
		
	});
})();
 
