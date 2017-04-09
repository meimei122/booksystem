/**
 * 借书页面js
 */
(function(){
	require(['jquery','bootstrap','bootTable','paginator'],function(jquery){
		var data = [{"book_isbn":"1231","book_name":"计算机基础","book_author":"李白","book_type":"计算机","book_price":"80","book_avanum":"9"},
		            {"book_isbn":"1231","book_name":"计算机基础","book_author":"李白","book_type":"计算机","book_price":"80","book_avanum":"9"},
		            {"book_isbn":"1231","book_name":"计算机基础","book_author":"李白","book_type":"计算机","book_price":"80","book_avanum":"9"},
		            {"book_isbn":"1231","book_name":"计算机基础","book_author":"李白","book_type":"计算机","book_price":"80","book_avanum":"9"},
		            {"book_isbn":"1231","book_name":"计算机基础","book_author":"李白","book_type":"计算机","book_price":"80","book_avanum":"9"},
		            {"book_isbn":"1231","book_name":"计算机基础","book_author":"李白","book_type":"计算机","book_price":"80","book_avanum":"9"}];
			
		window.operateEvents = {
		        'click .like': function (e, value, row, index) {
		            alert('You click like action, row: ' + JSON.stringify(row));
		        }
		    };
		
			$("#borrow_table").bootstrapTable({
				//url: '/VenderManager/TradeList',     //请求后台的URL（*）  
		        //method: 'post', 
				toolbar:'#borrow_toolbar',
				data:data,
			 	height: 380,
			 	striped:true,
			    search:true,
			    searchOnEnterKey:true,
			    showRefresh:false,//刷新
			    showColumns:true,//显示字段
			    showExport:false,//是否显示导出
			    showPaginationSwitch:false,
			    detailView:false,
			    pagination:true,//底部数据信息
			    showFooter:false,
			    sidePagination:"server",
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
			
			$(window).resize(function () {
	        	$("#borrow_table").bootstrapTable('resetView', {
	                //height: cUtil.getHeight($('.index-center-panel'),88)
	            });
	        });
	});
})();