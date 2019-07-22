package demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import demo.mapper.OrderitemMapper;
import demo.po.Orderitem;
import demo.po.OrderitemExample;
import demo.po.OrderitemExample.Criteria;
import demo.service.OrderItemService;

public class OrderItemServiceImpl implements OrderItemService {
	@Autowired
	private OrderitemMapper orderItemMapper;
	//根据OID查找所有的orderitem
	public List<Orderitem> findOrderByOid(String oid) {
		OrderitemExample example = new OrderitemExample();
		Criteria criteria = example.createCriteria();
		criteria.andOidEqualTo(oid);
		List<Orderitem> orderItemList = orderItemMapper.selectByExample(example);
		return orderItemList;
	}
	//删除orderitem
	public void deleteByOrder(Orderitem orderitem) {
		String ooid = orderitem.getOiid();
		orderItemMapper.deleteByPrimaryKey(ooid);
		
	}
	
}
