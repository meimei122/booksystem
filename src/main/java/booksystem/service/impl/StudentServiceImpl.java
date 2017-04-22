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
		
		return studentDao.login(students);
	}

	@Override
	public Students userName(Students students) {
		// TODO Auto-generated method stub
		return studentDao.userName(students);
	}

	@Override
	public Students loginInfo(Students students) {
		// TODO Auto-generated method stub
		return studentDao.loginInfo(students);
	}

	@Override
	public int updateUser(Students students) {
		// TODO Auto-generated method stub
		return studentDao.updateUser(students);
	}

	@Override
	public int studentInfo(Integer sid) {
		// TODO Auto-generated method stub
		return studentDao.studentInfo(sid);
	}
}
