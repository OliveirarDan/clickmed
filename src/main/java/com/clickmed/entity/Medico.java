/**
 * 
 */
package com.clickmed.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Medico")
public class Medico {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
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
	
	/**
	 * Para futura vinculação de especialidades --@ManyToOne private Especialidade
	 * especialidade
	 */

	private String foto;

	@OneToOne
	private Usuario usuario;

	@ManyToMany
	@JoinTable(name = "medicos_has_convenios", joinColumns = { @JoinColumn(name = "medico_id") }, inverseJoinColumns = {
			@JoinColumn(name = "convenio_id") })
	private List<Convenio> convenios;

	public Medico() {
		super();
	}

	public Medico(Long id, @NotNull String crm, String nome, String sobrenome, String experienciaProfissional,
			int telefone1, int telefone2, String cidade, String estado, String rua, String numero,
			String horarioAtendimento, String especialidade, String foto, Usuario usuario, List<Convenio> convenios) {
		super();
		this.id = id;
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
		this.usuario = usuario;
		this.convenios = convenios;
	}

	public Long getId() {
		return id;
	}

	public String getCrm() {
		return crm;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getExperienciaProfissional() {
		return experienciaProfissional;
	}

	public int getTelefone1() {
		return telefone1;
	}

	public int getTelefone2() {
		return telefone2;
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

	public String getHorarioAtendimento() {
		return horarioAtendimento;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public String getFoto() {
		return foto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public List<Convenio> getConvenios() {
		return convenios;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setExperienciaProfissional(String experienciaProfissional) {
		this.experienciaProfissional = experienciaProfissional;
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

	public void setHorarioAtendimento(String horarioAtendimento) {
		this.horarioAtendimento = horarioAtendimento;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setConvenios(List<Convenio> convenios) {
		this.convenios = convenios;
	}

	@Override
	public String toString() {
		return "Medico [id=" + id + ", crm=" + crm + ", nome=" + nome + ", sobrenome=" + sobrenome
				+ ", experienciaProfissional=" + experienciaProfissional + ", telefone1=" + telefone1 + ", telefone2="
				+ telefone2 + ", cidade=" + cidade + ", estado=" + estado + ", rua=" + rua + ", numero=" + numero
				+ ", horarioAtendimento=" + horarioAtendimento + ", especialidade=" + especialidade + ", foto=" + foto
				+ ", usuario=" + usuario + ", convenios=" + convenios + "]";
	}

}
