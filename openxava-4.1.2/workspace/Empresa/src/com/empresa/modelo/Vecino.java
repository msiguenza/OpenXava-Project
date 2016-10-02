package com.empresa.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vecino")
public class Vecino {
	
	@Id
	@Column(name = "dnivecino", nullable = false)
	private String dnivecino;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "apellidos", nullable = false)
	private String apellidos;


	@Column(name = "fechanacimiento", nullable = false)
	private String fechanacimiento;
	
	@Column(name = "sexo", nullable = false)
	private String sexo;

	@Column(name = "edad", nullable = false)
	private int edad;
	
	@Column(name = "direccion", nullable = false)
	private String direccion;
	
	@Column(name = "codpostal", nullable = false)
	private int codpostal;
	
	@Column(name = "ciudad", nullable = false)
	private String ciudad;
	
	@Column(name = "telefono", nullable = false)
	private int telefono;

	public String getDnivecino() {
		return dnivecino;
	}

	public void setDnivecino(String dnivecino) {
		this.dnivecino = dnivecino;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodpostal() {
		return codpostal;
	}

	public void setCodpostal(int codpostal) {
		this.codpostal = codpostal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
}