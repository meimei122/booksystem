/**
 * 注册页面js
 */
$(document).ready(function() {
	$("#registerForm").bootstrapValidator({
        //字段验证
        fields: {
            //用户名
            username:{
                validators: {
                    //非空
                    notEmpty: {
                        message: '*用户名不能为空'
                    },
                    stringLength: {
                        min: 3,
                        max: 10,
                        message: '*用户名长度必须在3到10位之间'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: '*用户名只能包含大写、小写、数字和下划线'
                    },
                    threshold :  3 ,
                    remote: {//ajax验证。server result:{"valid",true or false} 向服务发送当前input name值，获得一个json数据。例表示正确：{"valid",true}    
                        url: 'checkNameRegist',//验证地址  
                        message: '*用户名已存在',//提示消息  
                        delay  :  6000,//每输入一个字符，就发ajax请求，服务器压力还是太大，设置2秒发送一次ajax（默认输入一个字符，提交一次，服务器压力太大）  
                        type: 'POST',//请求方式  
                        //自定义提交数据，默认值提交当前input value  
                        data: function(validator) {  
                        	return {  
                        		username: $('[name="username"]').val()
                        	};  
                        }  
                    }
                }
            },
            tel:{
                validators: {
                    //非空
                    notEmpty: {
                        message: '*电话号码不能为空'
                    },
                    stringLength: {  
                        min: 11,  
                        max: 11,  
                        message: '*请输入11位手机号码'  
                    },  
                    regexp: {  
                        regexp: /^1[3|5|8]{1}[0-9]{9}$/,  
                        message: '*请输入正确的手机号码'  
                    }
                }
            },
            sid:{
                validators: {
                    //非空
                    notEmpty: {
                        message: '*学号不能为空'
                    },
                    numeric: {
                    	message: '*学号只能输入数字'
                    },
                    threshold :  6 ,
                    remote: {//ajax验证。server result:{"valid",true or false} 向服务发送当前input name值，获得一个json数据。例表示正确：{"valid",true}    
                        url: 'checkSid',//验证地址  
                        message: '*学号已注册',//提示消息  
                        delay  :  6000,//每输入一个字符，就发ajax请求，服务器压力还是太大，设置2秒发送一次ajax（默认输入一个字符，提交一次，服务器压力太大）  
                        type: 'POST',//请求方式  
                        //自定义提交数据，默认值提交当前input value  
                        data: function(validator) {  
                        	return {  
                        		sid: $('[name="sid"]').val()
                        	};  
                        }  
                    }
                }
            },
            pass:{
                validators: {
                    //非空
                    notEmpty: {
                        message: '*密码不能为空'
                    }
                }
            },
            //密码
            password2:{
                validators: {
                    notEmpty: {
                        message: '*密码不能为空'
                    },
                    identical: {
	                    field: 'pass',
	                    message: '*两次密码不相同'
	                }
                }
            }
        }
    })
});