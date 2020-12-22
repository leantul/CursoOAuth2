package com.leantul.dao;

import org.springframework.data.repository.CrudRepository;

import com.leantul.entities.User;

public interface IUserDAO extends CrudRepository<User, Long> {

	public User findByUsername(String username);
}
