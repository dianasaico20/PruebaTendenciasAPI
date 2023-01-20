package com.ista.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.ista.web.app.entity.Docente;
import com.ista.web.app.services.IDocenteService;

@CrossOrigin(origins={"http://localhost:4200"})
@RestController
@RequestMapping("/api")

public class DocenteController {

	@Autowired
	private IDocenteService docenteService;
	
	@GetMapping("/listarDocentes")
	public List<Docente> index(){
		return docenteService.findAll();
	}
	
	@PostMapping("/guardarDocente")
	@ResponseStatus (HttpStatus.CREATED)
	public Docente create(@RequestBody Docente docente){
		return docenteService.save(docente);
	}
	
	@GetMapping("/buscarDocente/{id}")	
	public Docente show(@PathVariable Integer id) {
		return docenteService.findById(id);
	}
	
	@DeleteMapping("/eliminarDocente/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		docenteService.delete(id);
	}
	
	@PutMapping("/editarDocente/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Docente update(@RequestBody Docente docente, @PathVariable Integer id) {
		Docente docenteActual=docenteService.findById(id);
		docenteActual.setApellido(docente.getApellido());
		docenteActual.setNombre(docente.getNombre());
		//docenteActual.setAsignaturas(docente.getAsignaturas());
		docenteActual.setEmail(docente.getEmail());
		docenteActual.setCelular(docente.getCelular());
		return docenteService.save(docenteActual);
	}
  
}
