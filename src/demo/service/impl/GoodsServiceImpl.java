package demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import demo.mapper.GoodsMapper;
import demo.po.Goods;
import demo.po.GoodsExample;
import demo.po.User;
import demo.po.GoodsExample.Criteria;
import demo.po.PageBean;
import demo.service.GoodsService;

public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsMapper goodsMapper;
	public Goods findBookByBid(String gid) {
		Goods goods = goodsMapper.selectByPrimaryKey(gid);
		
		return goods;
	}
	//查找所有的商品
	public PageBean findAllGoods(int currentPage) {
		List<Goods> goodsList = goodsMapper.findAllGoods();
		
		PageBean pageBean = new PageBean();
		int totalCount = goodsList.size();
		pageBean.setTotalCount(totalCount);
		pageBean.setCurrentPage(currentPage);
		int totalPage;
		int pageSize = 8;
		if(totalCount % pageSize ==0){
			totalPage = totalCount / pageSize;
		}else{
			totalPage = totalCount / pageSize + 1;
		}
		pageBean.setTotalPage(totalPage);
		int firstIndex = (currentPage-1) * pageSize;
		int lastIndex = currentPage * pageSize;
		if(lastIndex > totalCount){
			lastIndex = totalCount;
		}	
		List<Goods> subList = goodsList.subList(firstIndex, lastIndex);
		pageBean.setTList(subList);
		
		return pageBean;
	}
	//查找所有的英雄
	public PageBean findHeros(Integer currentPage) {
		GoodsExample example = new GoodsExample();
		Criteria criteria = example.createCriteria();
		criteria.andCidEqualTo("1");
		List<Goods> goodsList = goodsMapper.selectByExample(example);
		PageBean pageBean = new PageBean();
		int totalCount = goodsList.size();
		pageBean.setTotalCount(totalCount);
		pageBean.setCurrentPage(currentPage);
		int totalPage;
		int pageSize = 8;
		if(totalCount % pageSize ==0){
			totalPage = totalCount / pageSize;
		}else{
			totalPage = totalCount / pageSize + 1;
		}
		pageBean.setTotalPage(totalPage);
		int firstIndex = (currentPage-1) * pageSize;
		int lastIndex = currentPage * pageSize;
		if(lastIndex > totalCount){
			lastIndex = totalCount;
		}	
		List<Goods> subList = goodsList.subList(firstIndex, lastIndex);
		pageBean.setTList(subList);
		
		return pageBean;
	}
	//查找所有的装备
	public PageBean findEquipments(Integer currentPage) {
		GoodsExample example = new GoodsExample();
		Criteria criteria = example.createCriteria();
		criteria.andCidEqualTo("2");
		List<Goods> goodsList = goodsMapper.selectByExample(example);
		PageBean pageBean = new PageBean();
		int totalCount = goodsList.size();
		pageBean.setTotalCount(totalCount);
		pageBean.setCurrentPage(currentPage);
		int totalPage;
		int pageSize = 8;
		if(totalCount % pageSize ==0){
			totalPage = totalCount / pageSize;
		}else{
			totalPage = totalCount / pageSize + 1;
		}
		pageBean.setTotalPage(totalPage);
		int firstIndex = (currentPage-1) * pageSize;
		int lastIndex = currentPage * pageSize;
		if(lastIndex > totalCount){
			lastIndex = totalCount;
		}	
		List<Goods> subList = goodsList.subList(firstIndex, lastIndex);
		pageBean.setTList(subList);
		
		return pageBean;
	}
	public void update(Goods goods) {
		
		goodsMapper.updateByPrimaryKeySelective(goods);
		
	}
	//删除商品
	public void deleteGoodsByGid(String gid) {
		goodsMapper.deleteByPrimaryKey(gid);
		
	}
	//根据商品名称模糊查找商品
	public PageBean findGoodsByGoodsName(int currentPage, String content) {
		PageBean pageBean = new PageBean();
		//查询全部的数据
		List<Goods> goodsList = goodsMapper.findGoodsByGoodsName(content);
		
		int totalCount = goodsList.size();
		pageBean.setTotalCount(totalCount);
		pageBean.setCurrentPage(currentPage);
		
		int pageSize = 8;
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
		
		List<Goods> subList = goodsList.subList(firstIndex, lastIndex);
		pageBean.setTList(subList);
		return pageBean;
		
	}
	//添加商品
	public void insert(Goods goods) {
		goodsMapper.insert(goods);
		
	}
	//根据cid查找对应商品的数量
	public int findGoodsByCid(String cid) {
		GoodsExample example = new GoodsExample();
		Criteria criteria = example.createCriteria();
		criteria.andCidEqualTo(cid);
		int count = goodsMapper.countByExample(example);
		return count;
	}
	
	
}
