
package net.hri.Shopping_backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.hri.Shopping_backend.dao.CategoryDAO;
import net.hri.Shopping_backend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();

		// adding first Category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for television");
		category.setImageURL("CAT_1.png");

		categories.add(category);

		// adding second Category
		category = new Category();
		category.setId(2);
		category.setName("Smartphones");
		category.setDescription("This is some description for Smartphones");
		category.setImageURL("CAT_2.png");

		categories.add(category);

		// adding third Category
		category = new Category();
		category.setId(3);
		category.setName("Laptops");
		category.setDescription("This is some description for laptops");
		category.setImageURL("CAT_3.png");

		categories.add(category);

	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// enhanced for loop or for each loop
		for (Category category : categories) {
			if (category.getId() == id) {
				return category;
			}

		}
		return null;

	}

}
