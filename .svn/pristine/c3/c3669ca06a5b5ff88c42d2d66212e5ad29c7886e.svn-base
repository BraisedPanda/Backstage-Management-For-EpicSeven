package demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import demo.mapper.UserMapper;
import demo.po.PageBean;
import demo.po.User;
import demo.po.UserExample;
import demo.po.UserExample.Criteria;
import demo.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	public PageBean findAllUser(int currentPage) throws Exception {
		PageBean pageBean = new PageBean();
		//查询全部的数据
		List<User> userList = userMapper.findAllUser();
		
		int totalCount = userList.size();
		pageBean.setTotalCount(totalCount);
		pageBean.setCurrentPage(currentPage);
		
		int pageSize = 10;
		pageBean.setPageSize(pageSize);
		
		int totalPage;
		if(totalCount % pageSize ==0){
			totalPage = totalCount / pageSize;
		}else{
			totalPage = totalCount / pageSize + 1;
		}
		pageBean.setTotalPage(totalPage);
		
		//从list中截取
		//从第几条数据开始
		int firstIndex = (currentPage - 1)* pageSize;
		//到第几条数据结束
		int lastIndex = (currentPage * pageSize);
		if(lastIndex>totalCount){
			lastIndex = totalCount;
		}
		List<User> subList = userList.subList(firstIndex, lastIndex);
		pageBean.setTList(subList);
		return pageBean;
	}
	//根据用户名（模糊）查找用户

	public PageBean findUserByUserName(int currentPage, String username)
			throws Exception {
		PageBean pageBean = new PageBean();
		//查询全部的数据
		List<User> userList = userMapper.findUserByUserName(username);
		
		int totalCount = userList.size();
		pageBean.setTotalCount(totalCount);
		pageBean.setCurrentPage(currentPage);
		
		int pageSize = 10;
		pageBean.setPageSize(pageSize);
		
		int totalPage;
		if(totalCount % pageSize ==0){
			totalPage = totalCount / pageSize;
		}else{
			totalPage = totalCount / pageSize + 1;
		}
		pageBean.setTotalPage(totalPage);
		
		//从list中截取
		//从第几条数据开始
		int firstIndex = (currentPage - 1)* pageSize;
		//到第几条数据结束
		int lastIndex = (currentPage * pageSize);
		if(lastIndex>totalCount){
			lastIndex = totalCount;
		}
		
		List<User> subList = userList.subList(firstIndex, lastIndex);
		pageBean.setTList(subList);
		return pageBean;
	}
	//根据uid查找用户

	public User findUserByUid(String uid) {
		User user = userMapper.selectByPrimaryKey(uid);
		return user;
	}
	//修改用户信息

	public void modifyUserInfo(User user) {
		
		userMapper.updateByPrimaryKey(user);
		
	}
	//删除用户

	public void deleteUserByUid(String uid) {
		userMapper.deleteByPrimaryKey(uid);
		
	}
	//添加用户
	public void insertUser(User user) {
		
		userMapper.insert(user);
		
	}

	public List<User> findUserByEmail(String username) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmailEqualTo(username);
		List<User> userList = userMapper.selectByExample(example);
		return userList;
	}

	public List<User> findUserByPhonenumber(String username) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andPhonenumberEqualTo(username);
		List<User> userList = userMapper.selectByExample(example);
		return userList;
	}
	 
}
