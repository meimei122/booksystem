/**
 * 借书页面js
 */
(function(){
	require(['jquery','bootstrap','bootTable','bootTableExport','bootTableEdit'],function(jquery){
		var data;
			$("#borrow_table").bootstrapTable({
				//url: '/VenderManager/TradeList',     //请求后台的URL（*）  
		        //method: 'post', 
				toolbar:'#borrow_toolbar',
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
				columns:[[{"title": "图书信息表","halign": "center","align": "center","colspan": 7}
					],[
			        {title: '序号',valign: "middle",align:"center",
		          		formatter: function (value, row, index) {  
		          			return index+1;  
		          	}},      
			        {field:'book_isbn',title:'书号',valign: "middle",align:"center"},
			        {field:'book_name',title:'书名',valign: "middle",align:"center"},
			        {field:'book_author',title:'作者',valign: "middle",align:"center"},
			        {field:'book_type',title:'图书类型',valign: "middle",align:"center"},
			        {field:'book_price',title:'图书价格',valign: "middle",align:"center"},
				    {field:'operate',title:'操作',valign: "middle",align:"center"}
			    ]]
			});
	});
})();