package com.blitztech.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.blitztech.shoppingbackend.dao.CategoryDAO;
import com.blitztech.shoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static {
		
		Category category = new Category();
		
		category.setId(1);
		category.setName("Television");
		category.setDescription("Flat screen LCD");
		category.setImageUrl("CAT_1.png");
		
		categories.add(category);
		
		category = new Category();
		
		category.setId(2);
		category.setName("Radio");
		category.setDescription("solar panel radio");
		category.setImageUrl("CAT_2.png");
		
		categories.add(category);
		
		category = new Category();
		
		category.setId(3);
		category.setName("Furniture");
		category.setDescription("Household equipment");
		category.setImageUrl("CAT_3.png");
		
		categories.add(category);
		
		category = new Category();
		
		category.setId(4);
		category.setName("Cars");
		category.setDescription("SUV");
		category.setImageUrl("CAT_4.png");
		
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}
	
	public Category get(int id) {
		//enhanced for loop
		for(Category category : categories) {
			if(category.getId() == id) {
				return category;
			}
		}
		
		return null;
	}

}
