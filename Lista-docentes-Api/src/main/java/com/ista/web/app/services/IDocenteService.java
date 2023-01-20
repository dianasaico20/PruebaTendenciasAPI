package com.ista.web.app.services;

import java.util.List;

import com.ista.web.app.entity.Docente;



public interface IDocenteService {
	public List<Docente> findAll();
	
	public Docente save(Docente docente);
	
	public Docente findById(Integer id);
	
	public void delete(Integer id);
}
