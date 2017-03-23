package booksystem.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LoginController {

	/**
	 *	初始状态到登录页面
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String login(Model model) {
		return "app/login";
	}
	
	@RequestMapping(value = "index", method = RequestMethod.POST)
	public String index(Model model) {
		return "app/index";
	}
}
