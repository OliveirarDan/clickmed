package com.clickmed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "teste")
public class Teste {
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idteste;
	@NotNull
	private String texto;
	
	
	public Teste(@NotNull int idTeste, @NotNull String texto) {
		super();
		this.idteste = idTeste;
		this.texto = texto;
	}


	@Override
	public String toString() {
		return "Teste [idteste=" + idteste + ", texto=" + texto + "]";
	}


	public Teste() {
		super();
	}


	public int getIdteste() {
		return idteste;
	}


	public void setIdteste(int idteste) {
		this.idteste = idteste;
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
	
	
	

}
