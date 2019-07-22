package demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import demo.po.Goods;
import demo.po.Order;
import demo.po.Orderitem;
import demo.service.GoodsService;
import demo.service.OrderItemService;
import demo.service.OrderService;

@Controller
public class OrderController {
	
 
	@Autowired
	private OrderService orderService;
	@Autowired
	private OrderItemService orderItemService;
	@Autowired
	private GoodsService goodsService;
	//根据用户名查找所有的order
	@RequestMapping("/findOrderByUid")
	public ModelAndView findOrderByUid(String uid) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		List<Order> orderList = orderService.findOrderByUid(uid);
		
		for (Order order : orderList) {
			List<Orderitem> orderItemList 
				= orderItemService.findOrderByOid(order.getOid());
			for (Orderitem orderitem : orderItemList) {
				Goods goods = goodsService.findBookByBid(orderitem.getGid());
				System.out.println("======================================="+goods);
				orderitem.setGoods(goods);
				System.out.println("======================================="+orderitem);
			}
			order.setOrderItemList(orderItemList);
			System.out.println("======================================="+order);
			
			
		}
		
		modelAndView.addObject("orderList", orderList);
		modelAndView.setViewName("order/list");
		return modelAndView;
	}
}
