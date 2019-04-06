package com.clickmed.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany
	@JoinTable(name = "clinica_has_medicos", joinColumns = { @JoinColumn(name = "clinica_id") }, inverseJoinColumns = {
			@JoinColumn(name = "medico_id") })
	private List<Medico> medicos;


	public Clinica() {
		super();
	}

	public Clinica(Long id, String nomeFantasia, @NotNull String razaoSocial, String cnpj, int telefone1, int telefone2,
			String cidade, String estado, String rua, String numero, String site, String email, String localAtendimento,
			String foto, List<Medico> medicos) {
		super();
		this.id = id;
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.cidade = cidade;
		this.estado = estado;
		this.rua = rua;
		this.numero = numero;
		this.site = site;
		this.email = email;
		this.localAtendimento = localAtendimento;
		this.foto = foto;
		this.medicos = medicos;
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

	public void setTelefone1(int telefone1) {
		this.telefone1 = telefone1;
	}

	public void setTelefone2(int telefone2) {
		this.telefone2 = telefone2;
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

	public void setMedicos(List<Medico> medicos) {
		this.medicos = medicos;
	}

	@Override
	public String toString() {
		return "Clinica [id=" + id + ", nomeFantasia=" + nomeFantasia + ", razaoSocial=" + razaoSocial + ", cnpj="
				+ cnpj + ", telefone1=" + telefone1 + ", telefone2=" + telefone2 + ", cidade=" + cidade + ", estado="
				+ estado + ", rua=" + rua + ", numero=" + numero + ", site=" + site + ", email=" + email
				+ ", localAtendimento=" + localAtendimento + ", foto=" + foto + ", medicos=" + medicos + "]";
	}

	
	
	
	
}
