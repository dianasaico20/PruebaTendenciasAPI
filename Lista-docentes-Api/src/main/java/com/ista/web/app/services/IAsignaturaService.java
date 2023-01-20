package com.ista.web.app.services;

import java.util.List;

import com.ista.web.app.entity.Asignatura;



public interface IAsignaturaService {
	
	
		public List<Asignatura> findAll();
		
		public Asignatura save(Asignatura asignatura);
		
		public Asignatura findById(Integer id);
		
		public void delete(Integer id);
}
