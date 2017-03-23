/**
 * 登录页面js
 */
$(document).ready(function() {
	$("#loginForm").bootstrapValidator({
        //字段验证
        fields: {
            //用户名
            username:{
                validators: {
                    //非空
                    notEmpty: {
                        message: ' *用户名不能为空'
                    }
                }
            },
            //密码
            password:{
                validators: {
                    notEmpty: {
                        message: '*密码不能为空'
                    }
                }
            }
        }
    })
});