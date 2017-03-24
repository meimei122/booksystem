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
		bootstrapValidator: 'component/bootstrap/bootstrapValidator.min',
		editable: 'component/bootstrap/bootstrap-editable',
		bootTable: 'component/bootstrap/bootstrap-table',
		bootTableEdit: 'component/bootstrap/bootstrap-table-editable',
		bootTableExport: 'component/bootstrap/bootstrap-table-export',
		tableCN: 'component/bootstrap/bootstrap-table-zh-CN',
		select2: 'component/bootstrap/select2',
		tableExport: 'component/bootstrap/tableExport'
	},
	shim: {
		'bootstrap': {
			deps: ['jquery','html5shiv','respond']
		},
		'bootstrapValidator': {
			deps: ['jquery','bootstrap']
		},
		'bootTableExport':{
			deps: ['jquery','bootTableCn','bootTable','tableExport']
		},
		'bootTableEdit':{
			deps: ['jquery','bootTable','bootEdit']
		}
	}
});

/**
 * 加载组件orange、bootstrap，并启动应用
 */	
require(['orange','bootstrap'], function(orange) {
	 orange.start();
});

