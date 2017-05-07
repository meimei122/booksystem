package booksystem.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.web.session.HttpServletSession;
import org.aspectj.weaver.ast.Var;
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
	@RequestMapping(value = "studentLogin",method = RequestMethod.GET)
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
	public String checkName(Students students,HttpServletRequest request){
		Students studentResult = studentService.userName(students);
		boolean result = true;
		if(studentResult==null){
			result = false;
		}
		else{
			result = true;
			request.getSession().setAttribute("students", studentResult);
			request.getSession().setAttribute("sid", studentResult.getSid());
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
	 * 注册页面判断用户名是否存在
	 * @param students
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "checkNameRegist",method = RequestMethod.POST)
	public String checkNameRegist(Students students){
		Students studentResult = studentService.userName(students);
		boolean result = true;
		if(studentResult==null){
			result = true;
		}
		else{
			result = false;
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
	 * 判断学号是否已注册
	 * @param students
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "checkSid",method = RequestMethod.POST)
	public String checkSid(Students students){
		Students studentResult = studentService.loginInfo(students);
		boolean result = true;
		if(studentResult==null){
			result = true;
		}
		else{
			result = false;
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
	@ResponseBody
	@RequestMapping(value = "userInfo", method = RequestMethod.POST)
	public Students userInfo(Students students){
		Students studentResult = studentService.loginInfo(students);
		return studentResult;
	}
	
	/**
	 * 修改用户信息
	 * @param students
	 * @return
	 */
	
	@RequestMapping(value = "updateUser", method = RequestMethod.POST)
	public String updateUser(String phone,String nowPassword,HttpServletRequest request) {
		Students students = new Students();
		Integer sid = (Integer) request.getSession().getAttribute("sid");
		students.setSid(sid);
		students.setTel(phone);
		students.setPass(nowPassword);
		int i = studentService.updateUser(students);
		if(i>0){
			return "app/login"; 
		}else{
			return "app/index";
		}
		
	}
	
	/**
	 * 注册页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "studentRegister", method = RequestMethod.GET)
	public String register(Model model) {
		return "app/register";
	}
	
	/**
	 * 学生信息注册
	 * @param students
	 * @return
	 */
	
	@RequestMapping(value = "studentAdd", method = RequestMethod.GET)
	public String studentAdd(Students students) {
		int i = studentService.stuAdd(students);
		if(i>0){
			return "app/login"; 
		}else{
			return "app/register";
		}
	}
	
	/**
	 * 登录通过后进入到默认页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "studentIndex", method = RequestMethod.POST)
	public String index(Model model) {
		return "app/index";
	}
}
