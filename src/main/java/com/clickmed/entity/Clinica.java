package com.clickmed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "clinicas")
public class Clinica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeFantasia;
	@Column(unique = true)
	@NotNull
	private String razaoSocial;
	@Column(unique = true, length = 14)
	private String cnpj;
	private String telefone1;
	private String telefone2;
	private String cep;
	private String cidade;
	private String estado;
	private String rua;
	private String numero;
	private String site;
	private String email;
	private String localAtendimento;
	private String bairro;
	private String foto;

	public Clinica() {
		super();
	}

	public Clinica(Long id, String nomeFantasia, @NotNull String razaoSocial, String cnpj, String telefone1,
			String telefone2, String cep, String cidade, String estado, String rua, String numero, String site,
			String email, String localAtendimento, String bairro, String foto) {
		super();
		this.id = id;
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.rua = rua;
		this.numero = numero;
		this.site = site;
		this.email = email;
		this.localAtendimento = localAtendimento;
		this.bairro = bairro;
		this.foto = foto;
	}

	public Long getId() {
		return id;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public String getCep() {
		return cep;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public String getRua() {
		return rua;
	}

	public String getNumero() {
		return numero;
	}

	public String getSite() {
		return site;
	}

	public String getEmail() {
		return email;
	}

	public String getLocalAtendimento() {
		return localAtendimento;
	}

	public String getFoto() {
		return foto;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLocalAtendimento(String localAtendimento) {
		this.localAtendimento = localAtendimento;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Override
	public String toString() {
		return "Clinica [id=" + id + ", nomeFantasia=" + nomeFantasia + ", razaoSocial=" + razaoSocial + ", cnpj="
				+ cnpj + ", telefone1=" + telefone1 + ", telefone2=" + telefone2 + ", cep=" + cep + ", cidade=" + cidade
				+ ", estado=" + estado + ", rua=" + rua + ", numero=" + numero + ", site=" + site + ", email=" + email
				+ ", localAtendimento=" + localAtendimento + ", bairro=" + bairro + ", foto=" + foto + "]";
	}

}
