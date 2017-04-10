package booksystem.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import booksystem.entity.BorrowBook;
import booksystem.entity.UtilEntity;
import booksystem.service.BorrowBookService;

@Controller
@RequestMapping("BorrowBookController")
public class BorrowBookController {
	
	@Resource
	private BorrowBookService borrowBookService;
	
	@ResponseBody
	@RequestMapping(value = "borrowBookInfo", method = RequestMethod.POST)
	public String borrowBook() {
		List<String> xDataList = new ArrayList<String>();
		List<String> numList = new ArrayList<String>();
		List<BorrowBook> borrowBooks = borrowBookService.borrowInfo();
		
		return "";
	}
}
