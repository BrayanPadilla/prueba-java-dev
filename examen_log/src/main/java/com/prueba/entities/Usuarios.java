package com.prueba.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuarios {
	@Id
    @Column(name = "login")
	String login; 
	@Column(name = "pass")
	String pass; 
	@Column(name = "nombre")
	String nombre;
	@Column(name = "cliente")
	Double cliente;
	@Column(name = "email")
	String email;
	@Column(name = "fecha_alta")
	Date fecha_alta;
	@Column(name = "fecha_baja")
	Date fecha_baja;
	@Column(name = "status")
	String status;
	@Column(name = "intentos")
	Double intentos;
	@Column(name = "fecha_revocado")
	Date fecha_revocado;
	@Column(name = "fecha_vigencia")
	Date fecha_vigencia;
	@Column(name = "no_acceso")
	Integer no_acceso;
	@Column(name = "apellido_paterno")
	String apellido_paterno;
	@Column(name = "apellido_materno")
	String apellido_materno;
	@Column(name = "area")
	int area;
	@Column(name = "fecha_modificacion")
	Date fecha_modificacion;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getCliente() {
		return cliente;
	}
	public void setCliente(Double cliente) {
		this.cliente = cliente;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getFecha_alta() {
		return fecha_alta;
	}
	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}
	public Date getFecha_baja() {
		return fecha_baja;
	}
	public void setFecha_baja(Date fecha_baja) {
		this.fecha_baja = fecha_baja;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getIntentos() {
		return intentos;
	}
	public void setIntentos(Double intentos) {
		this.intentos = intentos;
	}
	public Date getFecha_revocado() {
		return fecha_revocado;
	}
	public void setFecha_revocado(Date fecha_revocado) {
		this.fecha_revocado = fecha_revocado;
	}
	public Date getFecha_vigencia() {
		return fecha_vigencia;
	}
	public void setFecha_vigencia(Date fecha_vigencia) {
		this.fecha_vigencia = fecha_vigencia;
	}
	public Integer getNo_acceso() {
		return no_acceso;
	}
	public void setNo_acceso(Integer no_acceso) {
		this.no_acceso = no_acceso;
	}
	public String getApellido_paterno() {
		return apellido_paterno;
	}
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}
	public String getApellido_materno() {
		return apellido_materno;
	}
	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public Date getFecha_modificacion() {
		return fecha_modificacion;
	}
	public void setFecha_modificacion(Date fecha_modificacion) {
		this.fecha_modificacion = fecha_modificacion;
	}

}
