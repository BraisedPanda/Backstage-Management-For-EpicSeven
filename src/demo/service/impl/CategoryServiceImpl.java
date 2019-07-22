package demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import demo.mapper.CategoryMapper;
import demo.po.Category;
import demo.service.CategoryService;

public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryMapper categoryMapper;
	public Category findCategoryByCid(String cid) {
		
		Category category = categoryMapper.selectByPrimaryKey(cid);
		
		return category;
	}
	public List<Category> findAllCategory() {
		List<Category> categoryList= categoryMapper.findAll();
		return categoryList;
	}
	public void modifyCname(Category category) {
		categoryMapper.updateByPrimaryKey(category);
	}
	public void addCategory(Category category) {
		categoryMapper.insert(category);
		
	}
	public void deleteCategoryByCid(String cid) {
		categoryMapper.deleteByPrimaryKey(cid);
		
	}
	
	
}
