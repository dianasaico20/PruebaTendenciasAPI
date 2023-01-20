package com.ista.web.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="asignatura")
public class Asignatura {
	 @Id 
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @Column(name="id_asigna")
	   private Integer id_asigna;
	    
	   @ManyToOne
	   @JoinColumn(name="id_docente", referencedColumnName = "id_docente")
	    private Docente docentes;
	    
	    @Column(name="nombre")
	    private String nombre;
	    
	    @Column(name="carrera")
	    private String carrera;
	    
	    @Column(name="hora_inicio")
	    private String hora_inicio;
	    
	    @Column(name="hora_fin")
	    private String hora_fin;

	

		public Integer getId_asigna() {
			return id_asigna;
		}

		public void setId_asigna(Integer id_asigna) {
			this.id_asigna = id_asigna;
		}

		public Docente getDocentes() {
			return docentes;
		}

		public void setDocentes(Docente docentes) {
			this.docentes = docentes;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getCarrera() {
			return carrera;
		}

		public void setCarrera(String carrera) {
			this.carrera = carrera;
		}

		public String getHora_inicio() {
			return hora_inicio;
		}

		public void setHora_inicio(String hora_inicio) {
			this.hora_inicio = hora_inicio;
		}

		public String getHora_fin() {
			return hora_fin;
		}

		public void setHora_fin(String hora_fin) {
			this.hora_fin = hora_fin;
		}
	    
	    
	    
	    
	    
	    
}
