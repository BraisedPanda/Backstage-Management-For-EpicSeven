package demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import demo.mapper.AdminMapper;
import demo.po.Admin;
import demo.service.AdminService;
	

public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminMapper adminMapper;

	public Admin find(Admin admin) {
		Admin admin1 = adminMapper.findAdmin(admin);
		return admin1;
	}
	
}
