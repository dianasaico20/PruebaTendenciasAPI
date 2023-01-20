package com.ista.web.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.web.app.entity.Docente;
import com.ista.web.app.repository.DocenteRepository;

@Service
public class DocenteServicelmpl implements IDocenteService{
	@Autowired
	private DocenteRepository DocenteRepository;
	

	@Override
	@Transactional (readOnly =true)
	public List<Docente> findAll() {
		return (List<Docente>)DocenteRepository.findAll();
	}

	@Override
	public Docente save(Docente docente) {
		return DocenteRepository.save(docente);
	}

	@Override
	public Docente findById(Integer id) {
		return DocenteRepository.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		DocenteRepository.deleteById(id);		
	}
}
