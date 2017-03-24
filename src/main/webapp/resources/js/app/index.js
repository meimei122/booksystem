/**
 * 默认页面的js
 */
(function(){
	require(['orange','jquery'],function(orange,jquery){
		//菜单导航栏部分js
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
		
		/*//url是controller里面的mapping地址,target是index页面目标的id,selector是被加载的页面需要渲染部分的id
		orange.loadPage({url: 'system/system.service', target: 'index_center', selector: '#system_center_div', replace: true, success: function(response) {
			
		}});*/
		
	});
})();
 
