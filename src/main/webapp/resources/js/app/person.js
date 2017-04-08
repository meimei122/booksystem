/**
 * 个人信息js
 */
(function(){
	require(['jquery','bootstrap','bootstrapValidator'],function($,bootstrap,bootstrapValidator){
		$("#personForm").bootstrapValidator({
	        //字段验证
	        fields: {
	            phone:{
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
	            beforPassword:{
	                validators: {
	                    //非空
	                    notEmpty: {
	                        message: '*密码不能为空'
	                    }
	                }
	            },
	            //密码
	            nowPassword:{
	                validators: {
	                    notEmpty: {
	                        message: '*密码不能为空'
	                    }
	                }
	            }
	        }
	    });
	});
})();