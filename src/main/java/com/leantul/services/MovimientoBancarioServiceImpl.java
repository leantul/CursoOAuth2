package com.leantul.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.leantul.dao.IMovimientoBancarioDAO;
import com.leantul.entities.MovimientoBancario;

@Service
public class MovimientoBancarioServiceImpl implements IMovimientoBancarioService {

	@Autowired
	private IMovimientoBancarioDAO dao;
	
	@Override
	@Transactional(readOnly = true)
	public List<MovimientoBancario> findAll() {
		return (List<MovimientoBancario>) dao.findAll();
	}

	@Override
	@Transactional
	public void save(MovimientoBancario movimientoBancario) {
		dao.save(movimientoBancario);	
	}

	@Override
	@Transactional(readOnly = true)
	public List<MovimientoBancario> getMovimientoUser(Long id) {
		return (List<MovimientoBancario>) dao.findByUserId(id);
	}
}