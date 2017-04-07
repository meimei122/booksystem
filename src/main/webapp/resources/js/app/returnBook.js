/**
 * 还书页面js
 */
(function(){
	require(['jquery','bootstrap','bootTable','bootTableExport','bootTableEdit'],function(jquery){
		var data;
			$("#borrowInfo_table").bootstrapTable({
				//url: '/VenderManager/TradeList',     //请求后台的URL（*）  
		        //method: 'post', 
				toolbar:'#borrowInfo_toolbar',
				data:data,
			 	height: 400,
			 	striped:true,
			    search:true,
			    searchOnEnterKey:true,
			    showRefresh:true,
			    showColumns:true,
			    showExport:true,
			    showPaginationSwitch:true,
			    detailView:false,
			    pagination:true,
			    showFooter:false,
			    sidePagination:"server",
				columns:[[{"title": "已借图书信息表","halign": "center","align": "center","colspan": 7}
					],[
			        {title: '序号',valign: "middle",align:"center",
		          		formatter: function (value, row, index) {  
		          			return index+1;  
		          	}},      
			        {field:'book_isbn',title:'书号',valign: "middle",align:"center"},
			        {field:'username',title:'书名',valign: "middle",align:"center"},
			        {field:'borrow_time',title:'借书日期',valign: "middle",align:"center"},
			        {field:'return_time',title:'还书日期',valign: "middle",align:"center"},
				    {field:'whetherOutData',title:'是否超期',valign: "middle",align:"center"},
				    {field:'pay',title:'超期应付款',valign: "middle",align:"center"}
			    ]]
			});
	});
})();