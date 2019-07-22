package demo.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import demo.po.Category;
import demo.po.Chart;
import demo.po.Goods;
import demo.po.PageBean;
import demo.service.CategoryService;
import demo.service.GoodsService;

@Controller
public class GoodsController {
	
	@Autowired
	private GoodsService goodsService;
	@Autowired
	private CategoryService categoryService;
	
	//查找所有的商品
	@RequestMapping("/findAllGoods")
	
	public ModelAndView findAllGoods(Integer currentPage){
		ModelAndView modelAndView = new ModelAndView();
		PageBean pageBean = goodsService.findAllGoods(currentPage);
		
		List<Goods> goodsList = pageBean.getTList();
		for (Goods goods : goodsList) {
			String cid = goods.getCid();
			Category category = categoryService.findCategoryByCid(cid);
			goods.setCategory(category);
		}
		modelAndView.addObject("goodsList", goodsList);
		modelAndView.addObject("pageBean", pageBean);
		modelAndView.setViewName("goods/allgoods");
		return modelAndView;
	}
	//查找所有英雄
	@RequestMapping("/findHeros")
	public ModelAndView findHeros(Integer currentPage){
		ModelAndView modelAndView = new ModelAndView();
		PageBean pageBean = goodsService.findHeros(currentPage);
		
		List<Goods> goodsList = pageBean.getTList();
		for (Goods goods : goodsList) {
			String cid = goods.getCid();
			Category category = categoryService.findCategoryByCid(cid);
			goods.setCategory(category);
		}
		modelAndView.addObject("goodsList", goodsList);
		modelAndView.addObject("pageBean", pageBean);
		modelAndView.setViewName("goods/allheros");
		return modelAndView;
		
	}
	//查找所有装备
	@RequestMapping("/findEquipments")
	public ModelAndView findEquipments(Integer currentPage){
		ModelAndView modelAndView = new ModelAndView();
		PageBean pageBean = goodsService.findEquipments(currentPage);
		
		List<Goods> goodsList = pageBean.getTList();
		for (Goods goods : goodsList) {
			String cid = goods.getCid();
			Category category = categoryService.findCategoryByCid(cid);
			goods.setCategory(category);
		}
		modelAndView.addObject("goodsList", goodsList);
		modelAndView.addObject("pageBean", pageBean);
		modelAndView.setViewName("goods/allequipments");
		return modelAndView;
		
	}
	//商品的详细信息
	@RequestMapping("/goodsDetail")
	public ModelAndView goodsDetail(String gid){
		ModelAndView modelAndView = new ModelAndView();
		List<Category> categoryList = categoryService.findAllCategory();
		Goods goods = goodsService.findBookByBid(gid);
		modelAndView.addObject("goods", goods);
		modelAndView.addObject("categoryList", categoryList);
		modelAndView.setViewName("goods/detail");
		return modelAndView;
	}
	//获取修改商品信息的表单
	@RequestMapping("/modifyGoodsInfo")
	public ModelAndView modifyGoodsInfo(MultipartFile file,Goods goods) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		String originalFileName = file.getOriginalFilename();
		if(file!=null && originalFileName!=null && originalFileName.length()>0){
			
			String file_path ="D:\\java code\\Demo2\\WebRoot\\images\\heros\\images\\";
			String newFileName = UUID.randomUUID()+originalFileName.substring(originalFileName.lastIndexOf("."));
			newFileName = newFileName.replace("-", "");
			File newFile = new File(file_path+newFileName);
			file.transferTo(newFile);
			
			goods.setImage("heros/"+"images/"+newFileName);
			
		}
		goodsService.update(goods);
		modelAndView.addObject("message", "修改商品信息成功");
		modelAndView.setViewName("message");
		return modelAndView;
	}
	@RequestMapping("/deleteGoodsByGid")
	public String deleteGoodsByGid(String gid,Model model){
		goodsService.deleteGoodsByGid(gid);
		model.addAttribute("message", "删除成功");
		return "message";
	}
	
	//商品搜索
		@RequestMapping("/findGoods")
		public ModelAndView findGoods(int currentPage,String content,HttpServletRequest request) throws Exception{
			ModelAndView modelAndView = new ModelAndView();
			String select = request.getParameter("select");
		
			if(select == "gname" || select.equals("gname")){
				String findName = content;
				
				PageBean pageBean = goodsService.findGoodsByGoodsName(currentPage,content);
				List<Goods> goodsList = pageBean.getTList();
				modelAndView.addObject("goodsList", goodsList);
				modelAndView.addObject("pageBean", pageBean);
				modelAndView.addObject("findName", content);
				modelAndView.setViewName("goods/findlist");
				return modelAndView;
			
			}else if(select =="gid" || select.equals("gid")){
				
				Goods goods = goodsService.findBookByBid(content);
				List<Goods> goodsList = new ArrayList<Goods>();
				goodsList.add(goods);
				PageBean pageBean =  new PageBean();
				pageBean.setCurrentPage(1);
				pageBean.setTotalPage(1);
				modelAndView.addObject("goodsList", goodsList);
				modelAndView.addObject("pageBean", pageBean);
				modelAndView.setViewName("goods/findlist");
				return modelAndView;
			}else {
				return null;
			}
			
			
		}
		//商品搜索(二次请求，处理编码问题)
				@RequestMapping("/findGoods1")
				public ModelAndView findGoods1(int currentPage,String findName) throws Exception{
					ModelAndView modelAndView = new ModelAndView();
					
				
					String content = new String(findName.getBytes("ISO8859-1"),"UTF-8");
							
					
					PageBean pageBean = goodsService.findGoodsByGoodsName(currentPage,content);
					List<Goods> goodsList = pageBean.getTList();
					modelAndView.addObject("goodsList", goodsList);
					modelAndView.addObject("pageBean", pageBean);
					modelAndView.addObject("findName", content);
					modelAndView.setViewName("goods/findlist");
					return modelAndView;
				}
	
	//新增商品
	@RequestMapping("/insertGoods")
	public String insertGoods(Goods goods,MultipartFile file,Model model) throws Exception{
		//处理上传的图片
		String originalFileName = file.getOriginalFilename();
		if(file!=null && originalFileName!=null && originalFileName.length()>0){
			String gid = UUID.randomUUID()+"";
			gid = gid.replace("-", "");
			goods.setGid(gid);
			String cid = goods.getCid();	
			
			String file_path ="D:\\java code\\Demo2\\WebRoot\\images\\"+cid+"\\";
			String newFileName = UUID.randomUUID() + 
					originalFileName.substring(originalFileName.lastIndexOf("."));
			newFileName = newFileName.replace("-","");
			File newFile = new File(file_path+newFileName);
			file.transferTo(newFile);
			goods.setImage(cid+"/"+newFileName);
			goodsService.insert(goods); 
		}
		
		
		model.addAttribute("message", "新增商品成功");
		return "message";
	}
	
	@RequestMapping("/testjson")
	public @ResponseBody List<Chart> testjson(){
		List<Category> categoryList = categoryService.findAllCategory();
		List<Chart> chartList = new ArrayList();
		for (Category category : categoryList) {
			Chart chart = new Chart();
			chart.setChartName(category.getCname());
			int count = goodsService.findGoodsByCid(category.getCid());
			
			chart.setValue((double)count);
			chartList.add(chart);
		}
	
		return chartList;
	}
	
}
