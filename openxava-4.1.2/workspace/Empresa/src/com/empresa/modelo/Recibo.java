package com.empresa.modelo;

import java.sql.*;

import javax.persistence.*;
import org.openxava.annotations.*;

/**
 * 
 * @author Miguel Angel Siguenza
 */

@Entity
@Table(name="recibo")
public class Recibo {

	
	@Id @Column(name="idrecibo") @Required   
	private int id;
	
	@Column(name="idpiso")
	private int idpiso;

	@Column(name="dnivecino")
	private String dnivecino;
	
	@Column(name="mes")
	private String mes;
	
	@Column(name="importe")
	private int importe;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdpiso() {
		return idpiso;
	}

	public void setIdpiso(int idpiso) {
		this.idpiso = idpiso;
	}

	public String getDnivecino() {
		return dnivecino;
	}

	public void setDnivecino(String dnivecino) {
		this.dnivecino = dnivecino;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}


	
	
	
}






	

