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
		bootTable: 'component/bootstrap/bootstrap-table.min',
		bootTableCn: 'component/bootstrap/bootstrap-table-zh-CN.min',
		tableExport:'component/bootstrap/tableExport',
		bootTableExport:'component/bootstrap/bootstrap-table-export',
		bootTableEdit:'component/bootstrap/bootstrap-table-editable',
		bootEdit:'component/bootstrap/bootstrap-editable',
		select2:'component/bootstrap/select2',
		echarts: 'component/echarts/echarts',
		chart: 'component/echarts/chart'
	},
	shim: {
		'bootstrap': {
			deps: ['jquery','html5shiv','respond']
		},
		'bootstrapValidator': {
			deps: ['jquery','bootstrap']
		},
		'bootTableCn':{
			deps: ['jquery','bootstrap']
		},
		'bootTableExport':{
			deps: ['jquery','bootTable','tableExport','bootTableCn']
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

