/**
 * 借书页面js
 */
(function(){
	require(['jquery','bootstrap','bootTable'],function(jquery){
		$.post("BookController/book",function(data){
			var data = data;
			$("#borrow_table").bootstrapTable({
				toolbar:'#borrow_toolbar',
				data:data,
			 	height: 380,
			 	striped:true,
			    search:true,
			    showColumns:true,//显示字段
			    pagination:true,//底部数据信息
			    sidePagination:"server",
			    pageSize:5,
			    pageList:[5,10,15,20],
				columns:[[{"title": "图书信息表","halign": "center","align": "center","colspan": 8}
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
			        {field:'book_avanum',title:'可借数量',valign: "middle",align:"center"},
			        {title:'借阅',valign: "middle",align:"center",events: operateEvents,
			            formatter: function (value, row, index) {
			                return [
			                        '<a class="like" title="Borrow">',
			                        '<i class="glyphicon glyphicon-heart"></i>',
			                        '</a>  '
			                    ].join('');
			                }
			            }
			    ]]
			});
		});
		
		window.operateEvents = {
		        'click .like': function (e, value, row, index) {
		            alert('You click like action, row: ' + row.book_isbn);
		        }
		    };
		
			$(window).resize(function () {
	        	$("#borrow_table").bootstrapTable('resetView', {
	                //height: cUtil.getHeight($('.index-center-panel'),88)
	            });
	        });
	});
})();