package com.clickmed.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Estabelecimento")
public class Estabelecimento {

	// Atributos
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEstabelecimento;
	@NotNull
	private String nomeFantasia;
	private int telefone1;
	private int telefone2;
	private String cidade;
	private String estado;
	private String rua;
	private String numero;
	private String site;
	private String email;
	private String localAtendimento;
	private String foto;
	@ManyToMany(mappedBy = "estabelecimentos")
	private Set<Medico> medicos = new HashSet<>();

	// Getters
	/**
	 * @return the idEstabelecimento
	 */
	public int getIdEstabelecimento() {
		return idEstabelecimento;
	}

	/**
	 * @return the nomeFantasia
	 */
	public String getNomeFantasia() {
		return nomeFantasia;
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
	 * @return the rua
	 */
	public String getRua() {
		return rua;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @return the site
	 */
	public String getSite() {
		return site;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the localAtendimento
	 */
	public String getLocalAtendimento() {
		return localAtendimento;
	}

	/**
	 * @return the foto
	 */
	public String getFoto() {
		return foto;
	}

	/**
	 * @return the medicos
	 */
	public Set<Medico> getMedicos() {
		return medicos;
	}

	// Setters
	/**
	 * @param idEstabelecimento the idEstabelecimento to set
	 */
	public void setIdEstabelecimento(int idEstabelecimento) {
		this.idEstabelecimento = idEstabelecimento;
	}

	/**
	 * @param nomeFantasia the nomeFantasia to set
	 */
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
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
	 * @param rua the rua to set
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @param site the site to set
	 */
	public void setSite(String site) {
		this.site = site;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param localAtendimento the localAtendimento to set
	 */
	public void setLocalAtendimento(String localAtendimento) {
		this.localAtendimento = localAtendimento;
	}

	/**
	 * @param foto the foto to set
	 */
	public void setFoto(String foto) {
		this.foto = foto;
	}

	/**
	 * @param medicos the medicos to set
	 */
	public void setMedicos(Set<Medico> medicos) {
		this.medicos = medicos;
	}

	// toString
	@Override
	public String toString() {
		return "Estabelecimento [idEstabelecimento=" + idEstabelecimento + ", nomeFantasia=" + nomeFantasia
				+ ", telefone1=" + telefone1 + ", telefone2=" + telefone2 + ", cidade=" + cidade + ", estado=" + estado
				+ ", rua=" + rua + ", numero=" + numero + ", site=" + site + ", email=" + email + ", localAtendimento="
				+ localAtendimento + ", foto=" + foto + ", medicos=" + medicos + "]";
	}

}
