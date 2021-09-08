package com.thienpcpc00879_MiniProject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thienpcpc00879_MiniProject.DAO.RoleDAO;
import com.thienpcpc00879_MiniProject.Entity.Role;
import com.thienpcpc00879_MiniProject.service.RoleService;



@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	RoleDAO dao;

	@Override
	public List<Role> findAll() {
		return dao.findAll();
	}

}
