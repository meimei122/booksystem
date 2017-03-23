/**
 * 应用组件相关配置
 */	
require.config({
	baseUrl: 'resources/js',
	paths: {
		jquery: 'component/jquery/jquery-1.9.1',
		jqueryUI: 'component/jquery/jquery-ui.min',
		orange: 'app/orange',
		bootstrap: 'component/bootstrap/bootstrap-3.3.5.min',
		html5shiv: 'component/bootstrap/html5shiv.min',
		respond: 'component/bootstrap/respond',
		editable: 'component/bootstrap/bootstrap-editable.js',
		table: 'component/bootstrap/bootstrap-table.js',
		tableEdit: 'component/bootstrap/bootstrap-table-editable.js',
		bootTableExport: 'component/bootstrap/bootstrap-table-export.js',
		tableCN: 'component/bootstrap/bootstrap-table-zh-CN.js',
		select2: 'component/bootstrap/select2.js',
		tableExport: 'component/bootstrap/tableExport.js'
	},
	shim: {
		'bootstrap': {
			deps: ['jquery','html5shiv','respond']
		}
	}
});

/**
 * 加载组件orange、bootstrap，并启动应用
 */	
require(['orange','bootstrap'], function(orange) {
	 orange.start();
});

