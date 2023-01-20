package com.ista.web.app.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="docente")
public class Docente {
	
    @Id 
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="id_docente")
   private Integer id_docente;
    
    //@OneToMany(fetch=FetchType.LAZY,mappedBy="docente")



  // private List<Asignatura> asignatura;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="apellido")
    private String apellido;
    
    @Column(name="celular")
    private String celular;
    
    @Column(name="email")
    private String email;

	

	public Integer getId_docente() {
		return id_docente;
	}

	public void setId_docente(Integer id_docente) {
		this.id_docente = id_docente;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
    
    
    
    
    
    
    
    
    
    
    
}
