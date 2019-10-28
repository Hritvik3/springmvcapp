package net.hri.Shopping_backend.dao;

import java.util.List;

import net.hri.Shopping_backend.dto.Category;

public interface CategoryDAO {
 
	
	List<Category> list();
	Category get(int id);
	
	
	
	
	
}
