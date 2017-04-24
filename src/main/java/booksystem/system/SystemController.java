package booksystem.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("system")
public class SystemController {
	//整体
	@RequestMapping(value = "/getPage.service")
	public String getPage(String path) {
		return path;
	}
}