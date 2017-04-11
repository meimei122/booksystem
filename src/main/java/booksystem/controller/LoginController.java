package booksystem.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import booksystem.entity.Students;
import booksystem.service.StudentService;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@Resource
	private StudentService studentService;
	
	/**
	 * 登录页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "login",method = RequestMethod.GET)
	public String login(Model model) {
		return "app/login";
	}
	
	/**
	 * 判断用户名和密码是否匹配
	 * @param students
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "checkPass",method = RequestMethod.POST)
	public String checkPass(Students students,HttpServletRequest request){
		Students studentResult = studentService.login(students);
		boolean result = true;
		if(studentResult==null){
			result = false;
		}
		else{
			result = true;
			request.getSession().setAttribute("students", studentResult);
		}
        Map<String, Boolean> map = new HashMap<>();  
        map.put("valid", result);  
        ObjectMapper mapper = new ObjectMapper();  
        String resultString = "";  
        try {  
            resultString = mapper.writeValueAsString(map);  
        } catch (JsonProcessingException e) {  
            e.printStackTrace();  
        }  
        return resultString;  
    }  
	
	/**
	 * 判断用户名是否存在
	 * @param students
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "checkName",method = RequestMethod.POST)
	public String checkName(Students students){
		Students studentResult = studentService.userName(students);
		boolean result = true;
		if(studentResult==null){
			result = false;
		}
		else{
			result = true;
		}
        Map<String, Boolean> map = new HashMap<>();  
        map.put("valid", result);  
        ObjectMapper mapper = new ObjectMapper();  
        String resultString = "";  
        try {  
            resultString = mapper.writeValueAsString(map);  
        } catch (JsonProcessingException e) {  
            e.printStackTrace();  
        }  
        return resultString;  
    }  

	/**
	 * 获取当前用户信息
	 * @param students
	 * @return
	 */
	@RequestMapping(value = "userInfo", method = RequestMethod.POST)
	public String userInfo(Students students){
		Students studentResult = studentService.login(students);
		return "";
	}
	
	/**
	 * 注册页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String register(Model model) {
		return "app/register";
	}
	
	/**
	 * 登录通过后进入到默认页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "index", method = RequestMethod.POST)
	public String index(Model model) {
		return "app/index";
	}
}
