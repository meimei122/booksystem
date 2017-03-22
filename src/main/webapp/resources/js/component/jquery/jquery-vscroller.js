(function ($) {
    $.fn.extend({
        vscroller: function (options) {
            var settings = $.extend({title:'',xml:'',page:1,num:18 }, options);
            return this.each(function () {
                var wrapper = $(this), xml = settings.xml,
                	num = settings.num,page = settings.page;
                $(this).empty();
                if(xml==''){
                	alert('xml 格式不正确，不能为空');
            		return;
                }
            	var newsHeader = $('<h3/>').addClass('news-header'),
            		contentWrapper = $('<div/>').addClass('topRec-list'),
            		newsTitle = $('<dl/>'),
            		newsDiv = $('<div/>').addClass('maquee'),
            		newsContent = $('<ul/>');
                	contentWrapper.append(newsTitle).append(newsDiv.append(newsContent));	
                	wrapper.append(newsHeader).append(contentWrapper);
                	newsHeader.html(settings.title);
                    $(xml).find('dl').each(function () {
                    	var h1 = $('<dd/>').html($(this).find('h1').text()),
                    		h2 = $('<dd/>').html($(this).find('h2').text()),
                    		h3 = $('<dd/>').html($(this).find('h3').text());
                    	newsTitle.append(h1).append(h2).append(h3);
                    });
                    var len = $(xml).find('news').length,
                    	base = Math.floor(len / num),
                    	pagination = len%num==0 ? base:base+1,
                    	length = num * page>len?len:num * page,
                    	pageDiv = $('<div/>').addClass('page-list');
                    pageDiv.append('<i num="'+num+'" total="'+len+'"></i>');
                    for(var i=0;i<length;i++){
                    	var html = $(xml).find('news')[i],
	                    	li = $('<li/>'),
	                		num = $('<div/>').html($(html).find('num').text()),
	                		header = $('<div/>').html($(html).find('headline').text()),
	                		detail = $('<div/>').html($(html).find('detail').text());
	                	li.append(num).append(header).append(detail);
	                	newsContent.append(li);
                    }
                    if(pagination>1){
                    	for(var p=1;p<=pagination;p++){
                        	var span = $('<span/>').text(p);
                        	pageDiv.append(span);
                        }
                    }
                    wrapper.append(pageDiv);
                    var span = $('.page-list').find('span')[page-1];
                    $(span).addClass('page-selected');
                    
                    $('.page-list span').click(function(){
                    	var wapper = $('.maquee ul'),
                    		len = parseInt($(this).parent().find('i').attr('total')),
                     		num = parseInt($(this).parent().find('i').attr('num')),
                    		nums = parseInt($(this).text()),
                    		start = (nums-1)*num,
                    		end = nums*num;
                    	end = end>len?len:end; 
                    	if($(this).hasClass('page-selected')){
                    		return;
                    	}
                    	wapper.empty();
                    	$('.page-list').find('span').removeClass('page-selected');
                    	$(this).addClass('page-selected');
                    	for(var i=start;i<end;i++){
                        	var html = $(xml).find('news')[i],
    	                    	li = $('<li/>'),
    	                		num = $('<div/>').html($(html).find('num').text()),
    	                		header = $('<div/>').html($(html).find('headline').text()),
    	                		detail = $('<div/>').html($(html).find('detail').text());
    	                	li.append(num).append(header).append(detail);
    	                	wapper.append(li);
                        }
                    });
                    /*$(xml).find('news').each(function () {
                    	var li = $('<li/>'),
                    		num = $('<div/>').html($(this).find('num').text()),
                    		header = $('<div/>').html($(this).find('headline').text()),
                    		detail = $('<div/>').html($(this).find('detail').text());
                    	li.append(num).append(header).append(detail);
                    	newsContent.append(li);
                    });*/
            });
        }
    });
})(jQuery);