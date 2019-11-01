package net.hri.Shopping_backend.dao;

import java.util.List;

import net.hri.Shopping_backend.dto.Category;

public interface CategoryDAO {
 
	boolean add(Category category);
	List<Category> list();
	Category get(int id);
	boolean delete(Category category);
	boolean update(Category category);
	
	
	
	
}
