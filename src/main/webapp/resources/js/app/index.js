/**
 * 默认页面的js
 */
(function() {
	'use strict';
	require(['orange'], function(orange) {
		//url是controller里面的mapping地址,target是index页面目标的id,selector是被加载的页面需要渲染部分的id
		orange.loadPage({url: 'system/system.service', target: 'index_center', selector: '#system_center_div', replace: true, success: function(response) {
			
		}});
		
	});
})();
 
