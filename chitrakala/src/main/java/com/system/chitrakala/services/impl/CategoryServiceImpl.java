package com.system.chitrakala.services.impl;

import com.system.chitrakala.entity.Category;

import com.system.chitrakala.repo.CategoryRepo;
import com.system.chitrakala.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepo categoryRepo;

    @Override
    public List<Category> fetchAll() {
        return categoryRepo.findAll();
    }

    @Override
    public Optional<Category> findById(Integer id) {
        return categoryRepo.findById(id);
    }
}
