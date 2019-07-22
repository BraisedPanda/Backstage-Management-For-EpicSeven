package demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import demo.mapper.OrderMapper;
import demo.po.Order;
import demo.po.OrderExample;
import demo.po.OrderExample.Criteria;
import demo.service.OrderService;

public class OrderSercieImpl implements OrderService {
	@Autowired
	private OrderMapper orderMapper;
	public List<Order> findOrderByUid(String uid) {
		OrderExample orderExample = new OrderExample();
		Criteria criteria = orderExample.createCriteria();
		criteria.andUidEqualTo(uid);
		List<Order> orderList = orderMapper.selectByExample(orderExample);
		return orderList;
	}
	public void deleteByOrder(Order order) {
		String oid = order.getOid();
		orderMapper.deleteByPrimaryKey(oid);
		
	}
	
	
}
