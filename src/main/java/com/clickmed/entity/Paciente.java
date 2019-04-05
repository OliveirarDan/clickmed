package com.clickmed.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "paciente")
public class Paciente {

	// Atributos
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPaciente;
	@NotNull
	private String cpf;
	@NotNull
	private String nome;
	@NotNull
	private String sobrenome;
	private String sexo;
	private String dataNascimento;
	private int telefone1;
	private int telefone2;
	private String cidade;
	private String estado;
	private String nomeRua;
	private String numero;
	private int cep;
	private String foto;

	// Construtores
	/**
	 * 
	 */
	public Paciente() {
		super();
	}


	/**
	 * @param idPaciente
	 * @param cpf
	 * @param nome
	 * @param sobrenome
	 * @param sexo
	 * @param dataNascimento
	 * @param telefone1
	 * @param telefone2
	 * @param cidade
	 * @param estado
	 * @param nomeRua
	 * @param numero
	 * @param cep
	 * @param foto
	 */
	public Paciente(int idPaciente, String cpf, String nome, String sobrenome, String sexo, String dataNascimento,
			int telefone1, int telefone2, String cidade, String estado, String nomeRua, String numero, int cep,
			String foto) {
		super();
		this.idPaciente = idPaciente;
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
	}

	// Getters
	/**
	 * @return the idPaciente
	 */
	public int getIdPaciente() {
		return idPaciente;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @return the dataNascimento
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @return the telefone1
	 */
	public int getTelefone1() {
		return telefone1;
	}

	/**
	 * @return the telefone2
	 */
	public int getTelefone2() {
		return telefone2;
	}

	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @return the nomeRua
	 */
	public String getNomeRua() {
		return nomeRua;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @return the cep
	 */
	public int getCep() {
		return cep;
	}

	/**
	 * @return the foto
	 */
	public String getFoto() {
		return foto;
	}

	// Setters

	/**
	 * @param idPaciente the idPaciente to set
	 */
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @param sobrenome the sobrenome to set
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @param telefone1 the telefone1 to set
	 */
	public void setTelefone1(int telefone1) {
		this.telefone1 = telefone1;
	}

	/**
	 * @param telefone2 the telefone2 to set
	 */
	public void setTelefone2(int telefone2) {
		this.telefone2 = telefone2;
	}

	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @param nomeRua the nomeRua to set
	 */
	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @param cep the cep to set
	 */
	public void setCep(int cep) {
		this.cep = cep;
	}

	/**
	 * @param foto the foto to set
	 */
	public void setFoto(String foto) {
		this.foto = foto;
	}

	// ToString
	@Override
	public String toString() {
		return "Paciente [idPaciente=" + idPaciente + ", cpf=" + cpf + ", nome=" + nome + ", sobrenome=" + sobrenome
				+ ", sexo=" + sexo + ", dataNascimento=" + dataNascimento + ", telefone1=" + telefone1 + ", telefone2="
				+ telefone2 + ", cidade=" + cidade + ", estado=" + estado + ", nomeRua=" + nomeRua + ", numero="
				+ numero + ", cep=" + cep + ", foto=" + foto + "]";
	}

}
