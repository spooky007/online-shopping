package com.blitztech.shoppingbackend.dao;

import java.util.List;

import com.blitztech.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	
	Category get(int id);
}
