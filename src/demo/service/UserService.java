package demo.service;

import java.util.List;

import demo.po.PageBean;
import demo.po.User;

public interface UserService {
	
	public PageBean findAllUser(int currentPage) throws Exception;
	
	public PageBean findUserByUserName(int currentPage,String username) throws Exception;

	public User findUserByUid(String uid);

	public void modifyUserInfo(User user);

	public void deleteUserByUid(String uid);

	public void insertUser(User user);

	public List<User> findUserByEmail(String username);

	public List<User> findUserByPhonenumber(String username);

	
}	
