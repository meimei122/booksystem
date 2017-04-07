package booksystem.login;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

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
	
	@ResponseBody
	@RequestMapping(value = "loginCheck",method = RequestMethod.POST)
	public String loginCheck(String username,String password){
		Students students = null;
		students.setUsername(username);
		students.setPass(password);
		Students studentResult = studentService.login(students);
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
