package net.hri.Shopping_backend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.hri.Shopping_backend.dao.ProductDAO;
import net.hri.Shopping_backend.dto.Product;


public class ProductTestCase {
	private static AnnotationConfigApplicationContext context;

	private static ProductDAO productDAO;

	private Product product;
	

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.hri.Shopping_backend");
		context.refresh();
		productDAO = (ProductDAO) context.getBean("productDAO");
	}

//	@Test
//	public void testCRUDProduct() {
//		product = new Product();
//		
//		product.setName("One Plus 7t");
//		product.setBrand("One Plus");
//		product.setDescription("some description for one plus mobiles");
//		product.setUnitPrice(47000);
//		product.setActive(true);
//		product.setCategoryId(3);
//		product.setSupplierId(3);
//		
//		assertEquals("Something went wrong while inserting a product", true, productDAO.add(product));
//		
//		//reading and updating the category
//		product = productDAO.get(2);
//		product.setName("Samsung Galaxy S10");
//		assertEquals("Something went wrong while updating a product", true, productDAO.update(product));
//		
//		
//		assertEquals("Something went wrong while deleting a product", true, productDAO.delete(product));
//		
//		
//		//list
//		assertEquals("Something went wrong while fetching the list of products", 6, productDAO.listActiveProducts().size());
//		
//	}
//	
	
	@Test
	public void testListActiveProducts() {
		assertEquals("Something went wrong while fetching the list of products", 5, productDAO.listActiveProducts().size());
		
	}
	
	@Test
	public void testListActiveProductsByCategory() {
		assertEquals("Something went wrong while fetching the list of products", 3, productDAO.listActiveProductsByCategory(3).size());
		assertEquals("Something went wrong while fetching the list of products", 2, productDAO.listActiveProductsByCategory(1).size());
		
	}
	
	@Test
	public void testGetLatestActiveProduct() {
		assertEquals("Something went wrong while fetching the list of products", 3, productDAO.getLatestActiveProducts(3).size());
		
	}
	
	

}
