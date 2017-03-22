package booksystem.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LoginController {

	/**
	 * 默认页面
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		return "app/login";
	}
}
