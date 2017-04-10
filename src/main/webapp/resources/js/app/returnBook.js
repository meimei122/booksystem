/**
 * 还书页面js
 */
(function(){
	require(['jquery','bootstrap','bootTable','bootTableExport','bootTableEdit'],function(jquery){
//		var data = [{"book_isbn":"1231","book_name":"计算机基础","borrow_time":"2017-4-9","return_time":"2017-5-9","whetherOutData":"否","pay":"0"},
//		            {"book_isbn":"1231","book_name":"计算机基础","borrow_time":"2017-4-9","return_time":"2017-5-9","whetherOutData":"否","pay":"0"},
//		            {"book_isbn":"1231","book_name":"计算机基础","borrow_time":"2017-4-9","return_time":"2017-5-9","whetherOutData":"否","pay":"0"},
//		            {"book_isbn":"1231","book_name":"计算机基础","borrow_time":"2017-4-9","return_time":"2017-5-9","whetherOutData":"否","pay":"0"},
//		            {"book_isbn":"1231","book_name":"计算机基础","borrow_time":"2017-4-9","return_time":"2017-5-9","whetherOutData":"否","pay":"0"}
//		            ];
		$.post("BorrowBookController/borrowBook",{sid:201401},function(data){
			debugger;
			var data = data;
			$("#borrowInfo_table").bootstrapTable({
				toolbar:'#borrowInfo_toolbar',
				data:data,
			 	height: 380,
			 	striped:true,
			    search:false,
			    searchOnEnterKey:false,
			    showRefresh:false,
			    showColumns:true,
			    showExport:false,
			    showPaginationSwitch:false,
			    detailView:false,
			    pagination:false,
			    showFooter:false,
			    sidePagination:"server",
				columns:[[{"title": "已借图书信息表","halign": "center","align": "center","colspan": 7}
					],[
			        {title: '序号',valign: "middle",align:"center",
		          		formatter: function (value, row, index) {  
		          			return index+1;  
		          	}},      
			        {field:'book_isbn',title:'书号',valign: "middle",align:"center"},
			        {field:'book_name',title:'书名',valign: "middle",align:"center"},
			        {field:'borrow_time',title:'借书日期',valign: "middle",align:"center"},
			        {field:'return_time',title:'还书日期',valign: "middle",align:"center"},
				    {field:'whetherOutData',title:'是否超期',valign: "middle",align:"center"},
				    {field:'pay',title:'超期应付款',valign: "middle",align:"center"}
			    ]]
			});
		});
	});
})();