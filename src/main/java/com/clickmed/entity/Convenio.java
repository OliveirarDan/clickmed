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
@Table(name = "Convenio")
public class Convenio {

	// Atributos
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idConvenio;
	@NotNull
	private String codConvenio;
	@NotNull
	private String convenio;
	@ManyToMany(mappedBy = "convenios")
	private Set<Medico> medicos = new HashSet<>();

	// Construtores

	/**
	 * 
	 */
	public Convenio() {
		super();
	}

	/**
	 * @param idConvenio
	 * @param codConvenio
	 * @param convenio
	 * @param medicos
	 */
	public Convenio(int idConvenio, String codConvenio, String convenio, Set<Medico> medicos) {
		super();
		this.idConvenio = idConvenio;
		this.codConvenio = codConvenio;
		this.convenio = convenio;
		this.medicos = medicos;
	}

	// Getters
	/**
	 * @return the idConvenio
	 */
	public int getIdConvenio() {
		return idConvenio;
	}

	/**
	 * @return the codConvenio
	 */
	public String getCodConvenio() {
		return codConvenio;
	}

	/**
	 * @return the convenio
	 */
	public String getConvenio() {
		return convenio;
	}

	/**
	 * @return the medicos
	 */
	public Set<Medico> getMedicos() {
		return medicos;
	}

	// Setters
	/**
	 * @param idConvenio the idConvenio to set
	 */
	public void setIdConvenio(int idConvenio) {
		this.idConvenio = idConvenio;
	}

	/**
	 * @param codConvenio the codConvenio to set
	 */
	public void setCodConvenio(String codConvenio) {
		this.codConvenio = codConvenio;
	}

	/**
	 * @param convenio the convenio to set
	 */
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	/**
	 * @param medicos the medicos to set
	 */
	public void setMedicos(Set<Medico> medicos) {
		this.medicos = medicos;
	}

	// ToString
	@Override
	public String toString() {
		return "Convenio [idConvenio=" + idConvenio + ", codConvenio=" + codConvenio + ", convenio=" + convenio
				+ ", medicos=" + medicos + "]";
	}

}
