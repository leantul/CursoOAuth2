package com.leantul.services;

import java.util.List;

import com.leantul.entities.MovimientoBancario;

public interface IMovimientoBancarioService {
	
	public List<MovimientoBancario> findAll();
	
	public void save (MovimientoBancario movimientoBancario);
	
	public List<MovimientoBancario> getMovimientoUser(Long id);

}