package com.clickmed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Avaliacao")
public class Avaliacao {

	// Atributos
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAvaliacao;
	private String avaliacao;
	private double pergunta1;
	private double pergunta2;
	private double pergunta3;
	private double pergunta4;
	private double pergunta5;
	private String comentario;
	
	@JoinColumn(name = "Paciente_idPaciente")
	private int Paciente_idPaciente;
	
	@JoinColumn(name = "Medico_idMedico")
	private int Medico_idMedico;

	// Contrutores
	/**
	 * 
	 */
	public Avaliacao() {
		super();
	}

	/**
	 * @param idAvaliacao
	 * @param avaliacao
	 * @param pergunta1
	 * @param pergunta2
	 * @param pergunta3
	 * @param pergunta4
	 * @param pergunta5
	 * @param comentario
	 * @param paciente_idPaciente
	 * @param medico_idMedico
	 */
	public Avaliacao(int idAvaliacao, String avaliacao, double pergunta1, double pergunta2, double pergunta3,
			double pergunta4, double pergunta5, String comentario, int paciente_idPaciente, int medico_idMedico) {
		super();
		this.idAvaliacao = idAvaliacao;
		this.avaliacao = avaliacao;
		this.pergunta1 = pergunta1;
		this.pergunta2 = pergunta2;
		this.pergunta3 = pergunta3;
		this.pergunta4 = pergunta4;
		this.pergunta5 = pergunta5;
		this.comentario = comentario;
		Paciente_idPaciente = paciente_idPaciente;
		Medico_idMedico = medico_idMedico;
	}

	// Getters
	/**
	 * @return the idAvaliacao
	 */
	public int getIdAvaliacao() {
		return idAvaliacao;
	}

	/**
	 * @return the avaliacao
	 */
	public String getAvaliacao() {
		return avaliacao;
	}

	/**
	 * @return the pergunta1
	 */
	public double getPergunta1() {
		return pergunta1;
	}

	/**
	 * @return the pergunta2
	 */
	public double getPergunta2() {
		return pergunta2;
	}

	/**
	 * @return the pergunta3
	 */
	public double getPergunta3() {
		return pergunta3;
	}

	/**
	 * @return the pergunta4
	 */
	public double getPergunta4() {
		return pergunta4;
	}

	/**
	 * @return the pergunta5
	 */
	public double getPergunta5() {
		return pergunta5;
	}

	/**
	 * @return the comentario
	 */
	public String getComentario() {
		return comentario;
	}

	// Setters
	/**
	 * @return the paciente_idPaciente
	 */
	public int getPaciente_idPaciente() {
		return Paciente_idPaciente;
	}

	/**
	 * @return the medico_idMedico
	 */
	public int getMedico_idMedico() {
		return Medico_idMedico;
	}

	/**
	 * @param idAvaliacao the idAvaliacao to set
	 */
	public void setIdAvaliacao(int idAvaliacao) {
		this.idAvaliacao = idAvaliacao;
	}

	/**
	 * @param avaliacao the avaliacao to set
	 */
	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}

	/**
	 * @param pergunta1 the pergunta1 to set
	 */
	public void setPergunta1(double pergunta1) {
		this.pergunta1 = pergunta1;
	}

	/**
	 * @param pergunta2 the pergunta2 to set
	 */
	public void setPergunta2(double pergunta2) {
		this.pergunta2 = pergunta2;
	}

	/**
	 * @param pergunta3 the pergunta3 to set
	 */
	public void setPergunta3(double pergunta3) {
		this.pergunta3 = pergunta3;
	}

	/**
	 * @param pergunta4 the pergunta4 to set
	 */
	public void setPergunta4(double pergunta4) {
		this.pergunta4 = pergunta4;
	}

	/**
	 * @param pergunta5 the pergunta5 to set
	 */
	public void setPergunta5(double pergunta5) {
		this.pergunta5 = pergunta5;
	}

	/**
	 * @param comentario the comentario to set
	 */
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	/**
	 * @param paciente_idPaciente the paciente_idPaciente to set
	 */
	public void setPaciente_idPaciente(int paciente_idPaciente) {
		Paciente_idPaciente = paciente_idPaciente;
	}

	/**
	 * @param medico_idMedico the medico_idMedico to set
	 */
	public void setMedico_idMedico(int medico_idMedico) {
		Medico_idMedico = medico_idMedico;
	}

	// ToString
	@Override
	public String toString() {
		return "Avaliacao [idAvaliacao=" + idAvaliacao + ", avaliacao=" + avaliacao + ", pergunta1=" + pergunta1
				+ ", pergunta2=" + pergunta2 + ", pergunta3=" + pergunta3 + ", pergunta4=" + pergunta4 + ", pergunta5="
				+ pergunta5 + ", comentario=" + comentario + ", Paciente_idPaciente=" + Paciente_idPaciente
				+ ", Medico_idMedico=" + Medico_idMedico + "]";
	}

}
