package net.hri.Shopping_backend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.hri.Shopping_backend.dao.CategoryDAO;
import net.hri.Shopping_backend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.hri.Shopping_backend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}
	
	
//	@Test
//	public void testAddCategory() {
//		category = new Category();
//		category.setName("Television");
//		category.setDescription("This is some description for television");
//		category.setImageURL("CAT_1.png");
//		assertEquals("Successfully added the category inside the table!",true,categoryDAO.add(category));
//		
//	}
	
	
	@Test 
	public void testgetCategory() {
		category = categoryDAO.get(3);
		assertEquals("Successfully fetched a single category inside the table!","Television",category.getName());
	}

}
