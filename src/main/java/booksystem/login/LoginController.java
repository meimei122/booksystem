package booksystem.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LoginController {

	/**
	 * 初始状态下进入到登录页面
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String login(Model model) {
		return "app/login";
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
	
	/**
	 * 注册页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register(Model model) {
		return "app/register";
	}
	
	/**
	 * 还书页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "borrow", method = RequestMethod.POST)
	public String borrow(Model model){
		return "app/borrow";
	}
	
	/**
	 * 还书页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "returnBook", method = RequestMethod.POST)
	public String returnBook(Model model) {
		return "app/returnBook";
	}
	
	/**
	 * 个人信息页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "person", method = RequestMethod.POST)
	public String person(Model model){
		return "app/person";
	}
}
