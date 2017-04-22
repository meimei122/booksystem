package booksystem.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import booksystem.entity.Book;
import booksystem.entity.BorrowBook;
import booksystem.entity.Students;
import booksystem.service.BookService;
import booksystem.service.BorrowBookService;
import booksystem.service.StudentService;

@Controller
@RequestMapping("BorrowBookController")
public class BorrowBookController {
	
	@Resource
	private BorrowBookService borrowBookService;
	
	@Resource
	private BookService bookService;
	
	@Resource
	private StudentService studentService;
	
	@ResponseBody
	@RequestMapping(value = "borrowBookInfo", method = RequestMethod.POST)
	public List borrowBookInfo() {
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
	
	@ResponseBody
	@RequestMapping(value = "addBorrow", method = RequestMethod.POST)
	public int addBorrow(HttpServletRequest request,BorrowBook borrowBook) {
		int j = 0;
		Students students = new Students();
		students.setSid(borrowBook.getSid());
		Students stu = studentService.loginInfo(students);
		if(stu.getBorrow_num()==0){
			j = 2;
		}else {
			int i = borrowBookService.addBorrow(borrowBook);
			int bookNum = bookService.borrow(borrowBook.getBook_isbn());
			int stuNum = studentService.studentInfo(borrowBook.getSid());
			if(i>0&&bookNum>0&&stuNum>0){
				j = 1;
			}
		}
		return j;
	}
	
	@ResponseBody
	@RequestMapping(value = "borrowBook", method = RequestMethod.POST)
	public List<BorrowBook> borrowBook(BorrowBook borrowBook){
		List<BorrowBook> borrowBooks = borrowBookService.borrowBook(borrowBook);
		for(int i = 0;i < borrowBooks.size();i++){
			int outData = Integer.parseInt(borrowBooks.get(i).getOutDate());
			double pay = 0;
			if(outData>0){
				pay = outData*0.5;
				borrowBooks.get(i).setOutDate("是");
				borrowBooks.get(i).setOutDateNum(outData+" 天");
				borrowBooks.get(i).setPay(pay+"元");
			}else{
				borrowBooks.get(i).setOutDate("否");
				borrowBooks.get(i).setOutDateNum("0 天");
				borrowBooks.get(i).setPay(pay+"元");
			}
		}
		return borrowBooks;
	}
}
