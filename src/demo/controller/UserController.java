package demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import demo.po.Chart;
import demo.po.Order;
import demo.po.Orderitem;
import demo.po.PageBean;
import demo.po.User;
import demo.service.OrderItemService;
import demo.service.OrderService;
import demo.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private OrderItemService orderItemService;
	//查找所有用户
	@RequestMapping("/findAllUser")
	public ModelAndView findAllUser(int currentPage) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		PageBean pageBean = userService.findAllUser(currentPage);
		List<User> userList = pageBean.getTList();
		modelAndView.addObject("userList", userList);
		modelAndView.addObject("pageBean", pageBean);
		modelAndView.setViewName("user/list");
		return modelAndView;
	}
	//根据用户名模糊查找用户
	@RequestMapping("/findUser")
	public ModelAndView findUser(int currentPage,String username,HttpServletRequest request) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		String select = request.getParameter("select");
		
		System.out.println(select);
		if(select == "username" || select.equals("username")){
			String findName = username;
			
			PageBean pageBean = userService.findUserByUserName(currentPage,username);
			List<User> userList = pageBean.getTList();
			modelAndView.addObject("userList", userList);
			modelAndView.addObject("pageBean", pageBean);
			modelAndView.addObject("findName", username);
			modelAndView.setViewName("user/findlist");
			return modelAndView;
		}else if(select =="uid" || select.equals("uid"))
		{
			
			User user = userService.findUserByUid(username);
			List<User> userList = new ArrayList();
			userList.add(user);
			PageBean pageBean = new PageBean();
			pageBean.setTotalCount(1);
			pageBean.setTotalPage(1);
			pageBean.setCurrentPage(1);
			modelAndView.addObject("pageBean", pageBean);
			modelAndView.addObject("userList", userList);
			modelAndView.setViewName("user/list2");
			return modelAndView;
		} else if(select == "email" || select.equals("email")){
			List<User> userList = userService.findUserByEmail(username);
			for (User user : userList) {
				System.out.println(user);
			}
			PageBean pageBean = new PageBean();
			pageBean.setTotalCount(1);
			pageBean.setTotalPage(1);
			pageBean.setCurrentPage(1);
			modelAndView.addObject("pageBean", pageBean);
			modelAndView.addObject("userList", userList);
			modelAndView.setViewName("user/list2");
			return modelAndView;
			
		}else if(select == "phonenumber" || select.equals("phonenumber")){
			List<User> userList = userService.findUserByPhonenumber(username);
			
			PageBean pageBean = new PageBean();
			pageBean.setTotalCount(1);
			pageBean.setTotalPage(1);
			pageBean.setCurrentPage(1);
			modelAndView.addObject("pageBean", pageBean);
			modelAndView.addObject("userList", userList);
			modelAndView.setViewName("user/list2");
			return modelAndView;
		}else{
			return null;
		}
		
		
	}
	//根据用户名模糊查找用户(二次请求，处理编码问题)
		@RequestMapping("/findUser1")
		public ModelAndView findUser1(int currentPage,String findName) throws Exception{
			ModelAndView modelAndView = new ModelAndView();
			
		
			String username = new String(findName.getBytes("ISO8859-1"),"UTF-8");
					
			
			PageBean pageBean = userService.findUserByUserName(currentPage,username);
			List<User> userList = pageBean.getTList();
			modelAndView.addObject("userList", userList);
			modelAndView.addObject("pageBean", pageBean);
			modelAndView.addObject("findName", username);
			modelAndView.setViewName("user/findlist");
			return modelAndView;
		}
	//查找用户(跳向修改界面)
	@RequestMapping("/findUserByUid")
	public ModelAndView findUserByUid(String uid) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		User user = userService.findUserByUid(uid);
		modelAndView.addObject("user", user);
		modelAndView.setViewName("user/detail");
		return modelAndView;
	}
	//查找用户
		@RequestMapping("/findUserByUid2")
		public ModelAndView findUserByUid2(String uid) throws Exception{
			ModelAndView modelAndView = new ModelAndView();
			User user = userService.findUserByUid(uid);
			List<User> userList = new ArrayList();
			userList.add(user);
			PageBean pageBean = new PageBean();
			pageBean.setTotalCount(1);
			pageBean.setTotalPage(1);
			pageBean.setCurrentPage(1);
			modelAndView.addObject("pageBean", pageBean);
			modelAndView.addObject("userList", userList);
			modelAndView.setViewName("user/list2");
			return modelAndView;
		}
	//修改用户信息
	@RequestMapping("/modifyUserInfo")
	public String modifyUserInfo(User user){
		
		userService.modifyUserInfo(user);
		return "user/success";
	}
	/*
	 * 删除用户，涉及到了级联删除
	 * 需要删除用户下的所有order，orderItem
	 */
	
	@RequestMapping("/deleteUserByUid")
	public ModelAndView deleteUserByUid(String uid) throws Exception{
		List<Order> orderList = orderService.findOrderByUid(uid);
		for (Order order : orderList) {
			List<Orderitem> orderItemList = orderItemService.findOrderByOid(order.getOid());
			for (Orderitem orderitem : orderItemList) {
				orderItemService.deleteByOrder(orderitem);
			}
			orderService.deleteByOrder(order);
		}
		userService.deleteUserByUid(uid);
		//执行查找操作
		ModelAndView modelAndView = new ModelAndView();
		PageBean pageBean = userService.findAllUser(1);
		List<User> userList = pageBean.getTList();
		modelAndView.addObject("userList", userList);
		modelAndView.addObject("pageBean", pageBean);
		modelAndView.setViewName("user/list");
		return modelAndView;
		
	}
	@RequestMapping("/addUser")
	public String addUser(User user){
		
		userService.insertUser(user);
		return "user/success";
	}
	
	
	
	
	
	
}
