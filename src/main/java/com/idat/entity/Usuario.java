package com.idat.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;
    
    @Column()
    private String nombre;
    
    @Column()
    private String apellido;
    
    @Column()
    private String contrasena;
    
    @Column()
    private String doc_identidad;
    
    @Column()
    private String email;
    
    @Column()
    private Integer telefono;

    @ManyToOne
    @JoinColumn(name = "id_fabrica")
    private Fabrica fabrica;

	public Usuario() {
		super();
	}

	public Usuario(Integer id_usuario, String nombre, String apellido, String contrasena, String doc_identidad,
			String email, Integer telefono, Fabrica fabrica) {
		super();
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.contrasena = contrasena;
		this.doc_identidad = doc_identidad;
		this.email = email;
		this.telefono = telefono;
		this.fabrica = fabrica;
	}

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
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

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getDoc_identidad() {
		return doc_identidad;
	}

	public void setDoc_identidad(String doc_identidad) {
		this.doc_identidad = doc_identidad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Fabrica getFabrica() {
		return fabrica;
	}

	public void setFabrica(Fabrica fabrica) {
		this.fabrica = fabrica;
	}
}
