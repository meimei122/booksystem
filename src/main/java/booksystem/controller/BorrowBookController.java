package booksystem.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import booksystem.entity.BorrowBook;
import booksystem.entity.Students;
import booksystem.entity.UtilEntity;
import booksystem.service.BorrowBookService;

@Controller
@RequestMapping("BorrowBookController")
public class BorrowBookController {
	
	@Resource
	private BorrowBookService borrowBookService;
	
	@ResponseBody
	@RequestMapping(value = "borrowBookInfo", method = RequestMethod.POST)
	public List borrowBook() {
		List<String> xDataList = new ArrayList<String>();
		List numList = new ArrayList<String>();
		List total = new ArrayList<>();
		List<BorrowBook> borrowBooks = borrowBookService.borrowInfo();
		for(int i = 0;i < borrowBooks.size();i++){
			xDataList.add(borrowBooks.get(i).getBook_type());
			numList.add(borrowBooks.get(i).getBorrow_num());
		}
		total.add(xDataList);
		total.add(numList);
		
		return total;
	}
	
	
	@RequestMapping(value = "addBorrow", method = RequestMethod.POST)
	public String addBorrow(HttpServletRequest request) {
		Students students = (Students) request.getSession().getAttribute("students");
		if(students.equals(null)){
			return "app/login";
		}else {
			
		}
		return "";
	}
}
