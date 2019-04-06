package com.clickmed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Acesso")
public class Acesso {

	// Atributos
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAcesso;
	@NotNull
	private String email;
	@NotNull
	private String senha;
	@NotNull
	@OneToOne
	@JoinColumn(name = "Paciente_idPaciente")
	private Paciente paciente;
	@NotNull
	@OneToOne
	@JoinColumn(name = "Medico_idMedico")
	private Medico medico;

	// Construtores
	/**
	 * 
	 */
	public Acesso() {
		super();
	}

	/**
	 * @param idAcesso
	 * @param email
	 * @param senha
	 * @param paciente
	 * @param medico
	 */
	public Acesso(int idAcesso, String email, String senha, Paciente paciente, Medico medico) {
		super();
		this.idAcesso = idAcesso;
		this.email = email;
		this.senha = senha;
		this.paciente = paciente;
		this.medico = medico;
	}

	// Getters
	/**
	 * @return the idAcesso
	 */
	public int getIdAcesso() {
		return idAcesso;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @return the paciente
	 */
	public Paciente getPaciente() {
		return paciente;
	}

	/**
	 * @return the medico
	 */
	public Medico getMedico() {
		return medico;
	}

	// Setters
	/**
	 * @param idAcesso the idAcesso to set
	 */
	public void setIdAcesso(int idAcesso) {
		this.idAcesso = idAcesso;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @param paciente the paciente to set
	 */
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	/**
	 * @param medico the medico to set
	 */
	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	// toString
	@Override
	public String toString() {
		return "Acesso [idAcesso=" + idAcesso + ", email=" + email + ", senha=" + senha + ", paciente="
				+ paciente.toString() + ", medico=" + medico.toString() + "]";
	}

}
