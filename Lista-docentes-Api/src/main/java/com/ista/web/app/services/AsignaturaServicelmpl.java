package com.ista.web.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.web.app.entity.Asignatura;
import com.ista.web.app.repository.AsignaturaRepository;

@Service
public class AsignaturaServicelmpl implements IAsignaturaService {
	@Autowired
	private AsignaturaRepository AsignaturaRepository;
	

	@Override
	@Transactional (readOnly =true)
	public List<Asignatura> findAll() {
		return (List<Asignatura>)AsignaturaRepository.findAll();
	}

	@Override
	public Asignatura save(Asignatura asignatura) {
		return AsignaturaRepository.save(asignatura);
	}

	@Override
	public Asignatura findById(Integer id) {
		return AsignaturaRepository.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		AsignaturaRepository.deleteById(id);		
	}
}
