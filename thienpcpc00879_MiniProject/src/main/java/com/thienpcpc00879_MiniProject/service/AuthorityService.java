package com.thienpcpc00879_MiniProject.service;

import java.util.List;

import com.thienpcpc00879_MiniProject.Entity.Authority;





public interface AuthorityService {

	public List<Authority> findAuthoritiesOfAdministrators();

	public List<Authority> findAll();

	public Authority create(Authority auth);

	public void delete(Integer id);

}
