package booksystem.service;

import booksystem.entity.Students;

public interface StudentService {
	
	/**
	 * 判断用户名密码是否匹配
	 * @param students
	 * @return
	 */
	public Students login(Students students);
	
	/**
	 * 判断用户名是否存在
	 * @param students
	 * @return
	 */
	public Students userName(Students students);
	
	/**
	 * 获取当前用户信息
	 * @param students
	 * @return
	 */
	public Students loginInfo(Students students);
	
	/**
	 * 修改用户信息
	 * @param students
	 * @return
	 */
	public int updateUser(Students students);
	
	/**
	 * 修改用户可借图书数量
	 * @param students
	 * @return
	 */
	public int studentInfo(Integer sid);
}