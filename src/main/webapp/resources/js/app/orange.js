define('orange', ['jquery'], function($) {
	var _appConfig = {	//	应用默认配置
			indexUrl: 'app/index'
		};
	
	/**
	 * 渲染应用首页
	 */
	function _renderIndex() {
		setTimeout(function() {
			require([_appConfig.indexUrl]);
		}, '500');
	}
	
	/**
	 * 启动应用
	 */
	function start() {
		_renderIndex();
	}
	
	/**
	 * 加载样式文件
	 */
	function _loadCss(href) {
		if(isInclude(href)){
			return;
		}
		$('<link>').attr({ rel: 'stylesheet', type: 'text/css', href: href }).appendTo('HEAD');
	}
	
	/**
	 * 加载脚本文件
	 */
	function _loadScript(url) {
		$.getScript(url);
	}
	
	/**
	 * 判断是否存在文件
	 */
	function isInclude(name){
	    var es=document.getElementsByTagName('link');
	    for(var i=0;i<es.length;i++) 
	    if(es[i]['href']==name)return true;
	    return false;
	}
	
	/**
	 * 加载远程内容到指定页面
	 * url: 远程加载地址
	 * target: 被加载元素的id
	 * selector: 选择加载的元素选择器
	 * replace: 是否替换原有内容
	 * success: 加载成功回调函数
	 */
	function loadPage(params) {
		if(params && typeof params === 'object') {
			var url = params['url'], target = params['target']?$('#'+ params['target']) : $('BODY'), selector = params['selector'], 
					data = params['data'], type = data?'POST' : 'GET', replace = params['replace'] || false, callback = undefined;
			callback = (params['success'] && typeof params['success'] === 'function')?callback = params['success'] : callback;
			if(typeof url !== 'string' || !url) {
				throw new Error('加载远程内容到指定页面失败，地址参数非法');
			} else {
				if(replace) {
					target.empty();
				}
				$.ajax({
					url: url,
					type: type,
					data: data,
					dataType: 'html',
				}).done(function(responseText) {
					var response = $.parseHTML(responseText,true), scripts = [];
					target.append(selector?$('<div>').append(response).find(selector):responseText);
					for(var i=0; i<response.length; i++) {
						if(response[i].nodeName == "LINK") {
							_loadCss(response[i].href);
						}else if(response[i].nodeName == "SCRIPT") {
							scripts.push(response[i].src);
						}
					}
					for(var i=0; i<scripts.length; i++) {
						_loadScript(scripts[i]);
					}
				}).always(callback && function(jqXHR) {
					callback.call(callback, jqXHR.responseText);
				});
			}
		} else {
			throw new Error('加载远程内容到指定页面失败，参数非法');
		}
	}
	
	/**
	 * 加载远程内容到指定页面
	 * url: 远程加载地址
	 * target: 被加载元素的id
	 * selector: 选择加载的元素选择器
	 * replace: 是否替换原有内容
	 * success: 加载成功回调函数
	 */
	function appendPage(params) {
		if(params && typeof params === 'object') {
			var url = params['url'], target = params['target']?$('#'+ params['target']) : $('BODY'), selector = params['selector'], 
					data = params['data'], type = data?'POST' : 'GET', replace = params['replace'] || false, callback = undefined;
			callback = (params['success'] && typeof params['success'] === 'function')?callback = params['success'] : callback;
			if(typeof url !== 'string' || !url) {
				throw new Error('加载远程内容到指定页面失败，地址参数非法');
			} else {
				$.ajax({
					url: url,
					type: type,
					data: data,
					dataType: 'html',
				}).done(function(responseText) {
					var response = $.parseHTML(responseText,true), scripts = [];
					target.append(selector?$('<div>').append(response).find(selector):responseText);
					for(var i=0; i<response.length; i++) {
						if(response[i].nodeName == "LINK") {
							_loadCss(response[i].href);
						}else if(response[i].nodeName == "SCRIPT") {
							scripts.push(response[i].src);
						}
					}
					for(var i=0; i<scripts.length; i++) {
						_loadScript(scripts[i]);
					}
				}).always(callback && function(jqXHR) {
					callback.call(callback, jqXHR.responseText);
				});
			}
		} else {
			throw new Error('加载远程内容到指定页面失败，参数非法');
		}
	}
	
	/**
	 * 全局异步请求发送处理
	 */
	$(document).ajaxSend(function(event, xhr, settings) {
		if(settings.url && settings.url.indexOf('?') != -1) {
			settings.url = settings.url.replace('?', '?' + Math.random() + '&');
		} else {
			settings.url += '?' + Math.random(); 
		}
	});
	
	return window.orange = {
		start: start,
		loadPage: loadPage,
		appendPage: appendPage
	};
});