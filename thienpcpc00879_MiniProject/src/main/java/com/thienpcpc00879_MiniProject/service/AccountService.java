package com.thienpcpc00879_MiniProject.service;

import java.util.List;

import com.thienpcpc00879_MiniProject.Entity.Account;



public interface AccountService {
	
	public Account findById(String username);

	public List<Account> getAdministrators();

	public List<Account> findAll();

	public Account create(Account account);
}
