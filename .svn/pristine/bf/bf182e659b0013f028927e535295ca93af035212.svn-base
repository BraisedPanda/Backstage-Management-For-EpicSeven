package demo.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import demo.po.Category;
import demo.service.CategoryService;
@Controller
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/findAllCategory")
	public ModelAndView findAllCategory(){
		ModelAndView modelAndView = new ModelAndView();
		List<Category> categoryList = categoryService.findAllCategory();
		modelAndView.addObject("categoryList", categoryList);
		modelAndView.setViewName("category/allcategory");
		return modelAndView;
	}
	@RequestMapping("/editCategory")
	public String editCategory(String cid,Model model){
		Category category = categoryService.findCategoryByCid(cid);
		model.addAttribute("category", category);
		return "category/edit";
	}
		
	@RequestMapping("/modifyCategory")	
	public String modefyCategory(Category category,Model model){
		categoryService.modifyCname(category);
		model.addAttribute("message", "修改信息成功");
		return "message";
	}
	@RequestMapping("/addCategory")
	public String addCategory(String cname,Model model){
		Category category = new Category();
		String uuid = UUID.randomUUID()+"";
		String cid = uuid.replace("-", "");
		category.setCid(cid);
		category.setCname(cname);
		categoryService.addCategory(category);
		model.addAttribute("message", "添加分类成功");
		return "category/message";
	}
	@RequestMapping("/deleteCategory")
	public String deleteCategory(String cid,Model model){
		categoryService.deleteCategoryByCid(cid);
		model.addAttribute("message", "删除分类成功");
		
		return "category/message";
	}
	
}
