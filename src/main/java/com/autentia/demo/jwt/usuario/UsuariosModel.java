package com.autentia.demo.jwt.usuario;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class UsuariosModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private long id;

	@Column(nullable = false, length = 100, name = "name")
	private String name;

	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@Column(nullable = false, length = 100)
	private String password;

	@Column(nullable = false, length = 100)
	private String username;

	@Column(nullable = false, length = 20)
	private String rol;

	@Column()
	private String imagen_perfil;

	@Column()
	private String acerca;

	@Column(nullable = false, length = 50)
	private String ciudad;

	@Column(length = 15)
	private String telefono;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getImagen_perfil() {
		return imagen_perfil;
	}

	public void setImagen_perfil(String imagen_perfil) {
		this.imagen_perfil = imagen_perfil;
	}

	public String getAcerca() {
		return acerca;
	}

	public void setAcerca(String acerca) {
		this.acerca = acerca;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
