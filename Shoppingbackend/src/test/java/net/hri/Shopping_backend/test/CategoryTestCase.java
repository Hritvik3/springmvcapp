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
//		category.setName("IPod");
//		category.setDescription("This is some description for ipods");
// 	category.setImageURL("CAT_4.png");
//
// 	assertEquals("Successfully added the category inside the table!",true,categoryDAO.add(category));
//	
//	}

//	@Test 
//	public void testGetCategory() {
//		
//		category = categoryDAO.get(3);
//		assertEquals("Successfully fetched a single category inside the table!","Television",category.getName());
//	}
//	
//	@Test 
//	public void testUpdateCategory() {
//		
//		category = categoryDAO.get(1);
//		category.setName("TV");
//		assertEquals("Successfully updated a single category inside the table!",true,categoryDAO.update(category));
//	}

//	@Test 
//	public void testUpdateCategory() {
//
//		category = categoryDAO.get(33);
//		
//		assertEquals("Successfully updated a single category inside the table!",true,categoryDAO.delete(category));
//	}

//	@Test 
//	public void testListCategory() {
//			assertEquals("Successfully fetched the list of categories inside the table!",4,categoryDAO.list().size());
//	}

	@Test
	public void testCRUDCategory() {

		// adding the category
		category = new Category();

		category.setName("Television");
		category.setDescription("This is some description for televisions");
		category.setImageURL("CAT_1.png");

		assertEquals("Successfully added the category inside the table!", true, categoryDAO.add(category));

		category = new Category();

		category.setName("Smartphones");
		category.setDescription("This is some description for Smartphones");
		category.setImageURL("CAT_2.png");

		assertEquals("Successfully added the category inside the table!", true, categoryDAO.add(category));

		// fetching and updating the category
		category = categoryDAO.get(1);
		category.setName("TV");
		assertEquals("Successfully updated a single category inside the table!", true, categoryDAO.update(category));

		// delete the category
		assertEquals("Successfully updated a single category inside the table!", true, categoryDAO.delete(category));

		// fetching the list
		assertEquals("Successfully fetched the list of categories inside the table!", 1, categoryDAO.list().size());

	}

}
