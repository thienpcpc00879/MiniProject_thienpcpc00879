package com.thienpcpc00879_MiniProject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.thienpcpc00879_MiniProject.DAO.CategoryDAO;
import com.thienpcpc00879_MiniProject.Entity.Category;
import com.thienpcpc00879_MiniProject.service.CategoryService;






@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryDAO cdao;

	@Override
	public List<Category> findAll() {
		return cdao.findAll();
	}

}
