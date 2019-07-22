package demo.service;

import java.util.List;

import demo.po.Goods;
import demo.po.PageBean;



public interface GoodsService {
	
	 Goods findBookByBid(String gid);

   	PageBean findAllGoods(int currentPage);

	PageBean findHeros(Integer currentPage);

	PageBean findEquipments(Integer currentPage);

	void update(Goods goods);

	void deleteGoodsByGid(String gid);

	PageBean findGoodsByGoodsName(int currentPage, String content);

	void insert(Goods goods);

	int findGoodsByCid(String cid);

	
}
