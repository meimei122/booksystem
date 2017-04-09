package booksystem.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import booksystem.service.BorrowBookService;

@Controller
@RequestMapping("BorrowBookController")
public class BorrowBookController {
	
	@Resource
	private BorrowBookService borrowBookService;
	
	@RequestMapping(value = "borrowBookInfo", method = RequestMethod.POST)
	public String borrowBook() {
		return "";
	}
}
