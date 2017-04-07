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
                    },
                    stringLength: {  
                        min: 6,  
                        max: 30,  
                        message: '用户名长度必须在6到30之间'  
                    },  
                    /*threshold :  6 ,
                    remote: {//ajax验证。server result:{"valid",true or false} 向服务发送当前input name值，获得一个json数据。例表示正确：{"valid",true}    
                        url: 'loginCheck',//验证地址  
                        message: '用户已存在',//提示消息  
                        delay :  2000,//每输入一个字符，就发ajax请求，服务器压力还是太大，设置2秒发送一次ajax（默认输入一个字符，提交一次，服务器压力太大）  
                        type: 'POST',//请求方式  
                        //自定义提交数据，默认值提交当前input value  
                        data: function(validator) {  
                              return {  
                                  password: $('[name="passwordNameAttributeInYourForm"]').val(),  
                                  whatever: $('[name="whateverNameAttributeInYourForm"]').val()  
                              };  
                           }  
                    }*/
                }
            },
            //密码
            password:{
                validators: {
                    notEmpty: {
                        message: '*密码不能为空'
                    },
                    stringLength: {  
                        min: 6,  
                        max: 30,  
                        message: '密码长度必须在6到30之间'  
                    },  
                    threshold :  6 ,
                    remote: {//ajax验证。server result:{"valid",true or false} 向服务发送当前input name值，获得一个json数据。例表示正确：{"valid",true}    
                        url: 'loginCheck',//验证地址  
                        message: '密码错误',//提示消息  
                        delay :  2000,//每输入一个字符，就发ajax请求，服务器压力还是太大，设置2秒发送一次ajax（默认输入一个字符，提交一次，服务器压力太大）  
                        type: 'POST',//请求方式  
                        //自定义提交数据，默认值提交当前input value  
                        data: function(validator) {  
                              return {  
                            	  username: $('[name="username"]').val(),  
                            	  pass: $('[name="password"]').val()  
                              };  
                           }  
                    }
                }
            }
        }
    })
});