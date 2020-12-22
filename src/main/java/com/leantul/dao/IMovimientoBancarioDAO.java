package com.leantul.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.leantul.entities.MovimientoBancario;

public interface IMovimientoBancarioDAO extends CrudRepository<MovimientoBancario, Long> {

	public List<MovimientoBancario> findByUserId(Long id);
}
