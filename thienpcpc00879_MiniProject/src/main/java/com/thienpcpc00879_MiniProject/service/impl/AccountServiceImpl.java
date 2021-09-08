package com.thienpcpc00879_MiniProject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thienpcpc00879_MiniProject.DAO.AccountDAO;
import com.thienpcpc00879_MiniProject.Entity.Account;
import com.thienpcpc00879_MiniProject.service.AccountService;



@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	AccountDAO dao;

	@Override
	public Account findById(String username) {
		return dao.findById(username).get();
	}

	@Override
	public List<Account> getAdministrators() {
		return dao.getAdministrators();
	}

	@Override
	public List<Account> findAll() {
		return dao.findAll();
	}

	@Override
	public Account create(Account account) {
		return dao.save(account);
	}
	

}
