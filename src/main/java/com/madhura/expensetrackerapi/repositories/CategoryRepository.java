package com.madhura.expensetrackerapi.repositories;

import com.madhura.expensetrackerapi.domain.Category;
import com.madhura.expensetrackerapi.exceptions.EtBadRequestException;
import com.madhura.expensetrackerapi.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryRepository {

    List<Category> findAll(Integer userId) throws EtResourceNotFoundException;

    Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Integer create(Integer userId, String title, String description) throws EtResourceNotFoundException;

    void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId);
}
