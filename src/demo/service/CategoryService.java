package demo.service;

import java.util.List;

import demo.po.Category;

public interface CategoryService {
	
	Category findCategoryByCid(String cid);

	List<Category> findAllCategory();

	void modifyCname(Category category);

	void addCategory(Category category);

	void deleteCategoryByCid(String cid);
}
