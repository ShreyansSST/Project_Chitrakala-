package com.system.chitrakala.services;

import com.system.chitrakala.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> fetchAll();
    Optional<Category> findById(Integer id);
}
