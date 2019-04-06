/**
 * 
 */
package com.clickmed.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
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
@Table(name = "Medico")
public class Medico {

	// Atributos
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMedico;
	@NotNull
	private String crm;
	private String nome;
	private String sobrenome;
	private String experienciaProfissional;
	private int telefone1;
	private int telefone2;
	private String cidade;
	private String estado;
	private String rua;
	private String numero;
	private String horarioAtendimento;
	private String especialidade;
	private String foto;
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "Estabelecimento_has_Medico", joinColumns = {
			@JoinColumn(name = "Medico_idMedico") }, inverseJoinColumns = {
					@JoinColumn(name = "Estabelecimento_idEstabelecimento") })
	Set<Estabelecimento> estabelecimentos = new HashSet<>();

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "Medico_has_Convenio", joinColumns = {
			@JoinColumn(name = "Medico_idMedico") }, inverseJoinColumns = { @JoinColumn(name = "Convenio_idConvenio") })
	Set<Convenio> convenios = new HashSet<>();

	/**
	 * 
	 */
	public Medico() {
		super();
	}

	/**
	 * @param idMedico
	 * @param crm
	 * @param nome
	 * @param sobrenome
	 * @param experienciaProfissional
	 * @param telefone1
	 * @param telefone2
	 * @param cidade
	 * @param estado
	 * @param rua
	 * @param numero
	 * @param horarioAtendimento
	 * @param especialidade
	 * @param foto
	 * @param estabelecimentos
	 * @param convenios
	 */
	public Medico(int idMedico, String crm, String nome, String sobrenome, String experienciaProfissional,
			int telefone1, int telefone2, String cidade, String estado, String rua, String numero,
			String horarioAtendimento, String especialidade, String foto, Set<Estabelecimento> estabelecimentos,
			Set<Convenio> convenios) {
		super();
		this.idMedico = idMedico;
		this.crm = crm;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.experienciaProfissional = experienciaProfissional;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.cidade = cidade;
		this.estado = estado;
		this.rua = rua;
		this.numero = numero;
		this.horarioAtendimento = horarioAtendimento;
		this.especialidade = especialidade;
		this.foto = foto;
		this.estabelecimentos = estabelecimentos;
		this.convenios = convenios;
	}

	// Getters
	/**
	 * @return the idMedico
	 */
	public int getIdMedico() {
		return idMedico;
	}

	/**
	 * @return the crm
	 */
	public String getCrm() {
		return crm;
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
	 * @return the experienciaProfissional
	 */
	public String getExperienciaProfissional() {
		return experienciaProfissional;
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
	 * @return the horarioAtendimento
	 */
	public String getHorarioAtendimento() {
		return horarioAtendimento;
	}

	/**
	 * @return the especialidade
	 */
	public String getEspecialidade() {
		return especialidade;
	}

	/**
	 * @return the foto
	 */
	public String getFoto() {
		return foto;
	}

	/**
	 * @return the estabelecimentos
	 */
	public Set<Estabelecimento> getEstabelecimento() {
		return estabelecimentos;
	}

	/**
	 * @return the estabelecimentos
	 */
	public Set<Estabelecimento> getEstabelecimentos() {
		return estabelecimentos;
	}

	/**
	 * @return the convenios
	 */
	public Set<Convenio> getConvenios() {
		return convenios;
	}

	// Setters
	/**
	 * @param idMedico the idMedico to set
	 */
	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}

	/**
	 * @param crm the crm to set
	 */
	public void setCrm(String crm) {
		this.crm = crm;
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
	 * @param experienciaProfissional the experienciaProfissional to set
	 */
	public void setExperienciaProfissional(String experienciaProfissional) {
		this.experienciaProfissional = experienciaProfissional;
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
	 * @param horarioAtendimento the horarioAtendimento to set
	 */
	public void setHorarioAtendimento(String horarioAtendimento) {
		this.horarioAtendimento = horarioAtendimento;
	}

	/**
	 * @param especialidade the especialidade to set
	 */
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	/**
	 * @param foto the foto to set
	 */
	public void setFoto(String foto) {
		this.foto = foto;
	}

	/**
	 * @param estabelecimento the estabelecimento to set
	 */
	public void setEstabelecimento(Set<Estabelecimento> estabelecimentos) {
		this.estabelecimentos = estabelecimentos;
	}

	/**
	 * @param estabelecimentos the estabelecimentos to set
	 */
	public void setEstabelecimentos(Set<Estabelecimento> estabelecimentos) {
		this.estabelecimentos = estabelecimentos;
	}

	/**
	 * @param convenios the convenios to set
	 */
	public void setConvenios(Set<Convenio> convenios) {
		this.convenios = convenios;
	}

	// ToString

	@Override
	public String toString() {
		return "Medico [idMedico=" + idMedico + ", crm=" + crm + ", nome=" + nome + ", sobrenome=" + sobrenome
				+ ", experienciaProfissional=" + experienciaProfissional + ", telefone1=" + telefone1 + ", telefone2="
				+ telefone2 + ", cidade=" + cidade + ", estado=" + estado + ", rua=" + rua + ", numero=" + numero
				+ ", horarioAtendimento=" + horarioAtendimento + ", especialidade=" + especialidade + ", foto=" + foto
				+ ", estabelecimentos=" + estabelecimentos + ", convenios=" + convenios + "]";
	}

}
