package com.thienpcpc00879_MiniProject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thienpcpc00879_MiniProject.DAO.AccountDAO;
import com.thienpcpc00879_MiniProject.DAO.AuthorityDAO;
import com.thienpcpc00879_MiniProject.Entity.Account;
import com.thienpcpc00879_MiniProject.Entity.Authority;
import com.thienpcpc00879_MiniProject.service.AuthorityService;



@Service
public class AuthorityServiceImpl implements AuthorityService{
	
	@Autowired
	AuthorityDAO dao;
	
	@Autowired
	AccountDAO acdao;

	@Override
	public List<Authority> findAuthoritiesOfAdministrators() {
		List<Account> accounts = acdao.getAdministrators();
		return dao.authoritiesOf(accounts);
	}

	@Override
	public List<Authority> findAll() {
		return dao.findAll();
	}

	@Override
	public Authority create(Authority auth) {
		return dao.save(auth);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
	}

}
