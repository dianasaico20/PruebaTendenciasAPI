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

import com.ista.web.app.entity.Asignatura;
import com.ista.web.app.services.IAsignaturaService;



@CrossOrigin(origins={"http://localhost:4200"})
@RestController
@RequestMapping("/api")

public class AsignaturaController {

 	@Autowired
	private IAsignaturaService asignaturaService;
	
	@GetMapping("/listarAsignatura")
	public List<Asignatura> index(){
		return asignaturaService.findAll();
	}
	
	@PostMapping("/guardarAsignatura")
	@ResponseStatus (HttpStatus.CREATED)
	public Asignatura create(@RequestBody Asignatura asignatura){
		return asignaturaService.save(asignatura);
	}
	
	@GetMapping("/buscarAsignatura/{id}")	
	public Asignatura show(@PathVariable Integer id) {
		return asignaturaService.findById(id);
	}
	
	@DeleteMapping("/eliminarAsignatura/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		asignaturaService.delete(id);
	}
	
	@PutMapping("/editarAsignatura/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Asignatura update(@RequestBody Asignatura asignatura, @PathVariable Integer id) {
		Asignatura asignaturaActual=asignaturaService.findById(id);
		asignaturaActual.setCarrera(asignatura.getCarrera());
		asignaturaActual.setNombre(asignatura.getNombre());
		asignaturaActual.setHora_fin(asignatura.getHora_fin());
		asignaturaActual.setHora_inicio(asignatura.getHora_inicio());
		return asignaturaService.save(asignaturaActual);
	}
}
