package com.leantul.services;

import java.util.List;

import com.leantul.entities.User;

public interface IUserService {

	public List<User> findAll();
	public void save(User user);
	public User findById(Long id);
}
