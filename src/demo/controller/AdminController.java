package demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.po.Admin;
import demo.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/login")
	public String login(Admin admin,HttpServletRequest request,HttpSession session){
		
		Admin admin1 = adminService.find(admin);
		System.out.println(admin1);
		if(admin1 ==null){
			request.setAttribute("error", "用户名或密码错误");
			return "login";
			
		}else{
		session.setAttribute("user", admin1);
		return "menu/main";
		}
	}
	@RequestMapping("/quit")
	public String quit(HttpSession session){
		session.removeAttribute("user");
		return "login";
	}
}
