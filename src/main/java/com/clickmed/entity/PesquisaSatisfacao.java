package com.clickmed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "pesquisas_pacientes")
public class PesquisaSatisfacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String avaliacao;
	private String respostamed;
	private double pergunta1;
	private double pergunta2;
	private double pergunta3;
	private double pergunta4;
	private double pergunta5;
	private String comentario;

	@ManyToOne
	private Medico medico;

	@ManyToOne
	private Paciente paciente;

	@Column(columnDefinition = "TEXT")
	private String descricao;

	public PesquisaSatisfacao(Long id, String avaliacao, String respostamed, double pergunta1, double pergunta2,
			double pergunta3, double pergunta4, double pergunta5, String comentario, Medico medico, Paciente paciente,
			@NotNull String descricao) {
		super();
		this.id = id;
		this.avaliacao = avaliacao;
		this.respostamed = respostamed;
		this.pergunta1 = pergunta1;
		this.pergunta2 = pergunta2;
		this.pergunta3 = pergunta3;
		this.pergunta4 = pergunta4;
		this.pergunta5 = pergunta5;
		this.comentario = comentario;
		this.medico = medico;
		this.paciente = paciente;
		this.descricao = descricao;
	}

	public PesquisaSatisfacao() {
		super();
	}

	public Long getId() {
		return id;
	}

	public String getAvaliacao() {
		return avaliacao;
	}
	
	public String getRespostamed() {
		return respostamed;
	}

	public double getPergunta1() {
		return pergunta1;
	}

	public double getPergunta2() {
		return pergunta2;
	}

	public double getPergunta3() {
		return pergunta3;
	}

	public double getPergunta4() {
		return pergunta4;
	}

	public double getPergunta5() {
		return pergunta5;
	}

	public String getComentario() {
		return comentario;
	}

	public Medico getMedico() {
		return medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}

	public void setPergunta1(double pergunta1) {
		this.pergunta1 = pergunta1;
	}
	

	public void setRespostamed(String respostamed) {
		this.respostamed = respostamed;
	}

	public void setPergunta2(double pergunta2) {
		this.pergunta2 = pergunta2;
	}

	public void setPergunta3(double pergunta3) {
		this.pergunta3 = pergunta3;
	}

	public void setPergunta4(double pergunta4) {
		this.pergunta4 = pergunta4;
	}

	public void setPergunta5(double pergunta5) {
		this.pergunta5 = pergunta5;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "PesquisaSatisfacao [id=" + id + ", avaliacao=" + avaliacao + ", pergunta1=" + pergunta1 + ", pergunta2="
				+ pergunta2 + ", pergunta3=" + pergunta3 + ", pergunta4=" + pergunta4 + ", pergunta5=" + pergunta5
				+ ", comentario=" + comentario + ", medico=" + medico + ", paciente=" + paciente + ", descricao="
				+ descricao + "]";
	}

}
