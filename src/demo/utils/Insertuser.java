package demo.utils;

import java.util.Random;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.po.User;
import demo.service.UserService;
@Controller
public class Insertuser {
	@Autowired
	private UserService userService;
	@RequestMapping("/insertUser.action")
	public void insertUser(){
		
		String[] firstName = {"赵","钱","孙","李","周","吴","郑","王",
				"冯","陈","诸","卫","蒋","沈","韩","杨"};
		
		String[] lastName = {"灵","雨","长安","辉","爽","旭日","青山","影","建设","卫国",
				"振华","莲"};
		
		Random random = new Random();
		for(int i=0;i<300;i++){
			int f = random.nextInt(16);
			int l = random.nextInt(12);
			String username = firstName[f]+lastName[l];
			User user = new User();
			user.setUsername(username);
			user.setPassword("123456");
			user.setEmail(username+"@qq.com");
			user.setPhonenumber("12345678900");
			userService.insertUser(user);
		}
		
	}
}
