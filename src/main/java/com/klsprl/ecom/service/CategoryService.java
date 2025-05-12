package com.klsprl.ecom.service;

import com.klsprl.ecom.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);
}
