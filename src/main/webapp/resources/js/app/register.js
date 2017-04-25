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