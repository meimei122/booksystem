package booksystem.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import booksystem.dao.StudentDao;
import booksystem.entity.Students;
import booksystem.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Resource()
	private StudentDao studentDao;
	
	@Override
	public Students login(Students students) {
		// TODO Auto-generated method stub
		return null;
	}

}
