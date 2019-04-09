package com.clickmed.entity;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name = "pacientes")
public class Paciente {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String cpf;
	@NotNull
	private String nome;
	@NotNull
	private String sobrenome;
	private String sexo;
	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataNascimento;
	private String telefone1;
	private String telefone2;
	private String cidade;
	private String estado;
	private String nomeRua;
	private String numero;
	private String cep;
	private Blob foto;

	@OneToOne
	private Usuario usuario;

	// Construtores
	/**
	 * 
	 */
	public Paciente() {
		super();
	}

	
	
	
	public Paciente(Long id, @NotNull String cpf, @NotNull String nome, @NotNull String sobrenome, String sexo,
			Date dataNascimento, String telefone1, String telefone2, String cidade, String estado, String nomeRua,
			String numero, String cep, Blob foto, Usuario usuario) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.cidade = cidade;
		this.estado = estado;
		this.nomeRua = nomeRua;
		this.numero = numero;
		this.cep = cep;
		this.foto = foto;
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getSexo() {
		return sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public String getNumero() {
		return numero;
	}

	public String getCep() {
		return cep;
	}

	public Blob getFoto() {
		return foto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setFoto(Blob foto) {
		this.foto = foto;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", sobrenome=" + sobrenome + ", sexo=" + sexo
				+ ", dataNascimento=" + dataNascimento + ", telefone1=" + telefone1 + ", telefone2=" + telefone2
				+ ", cidade=" + cidade + ", estado=" + estado + ", nomeRua=" + nomeRua + ", numero=" + numero + ", cep="
				+ cep + ", foto=" + foto + ", usuario=" + usuario + "]";
	}
	
	
	

}
