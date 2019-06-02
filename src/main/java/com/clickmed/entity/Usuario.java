package com.clickmed.entity;

import java.io.UnsupportedEncodingException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.util.DigestUtils;

@Entity
@Table(name = "usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Column(unique = true)
	private String email;

	@NotNull
	private String senha;

	/**
	 * Permissões 
	 * medico -  para usuarios medicos
	 * paciente - para usuarios pacientes
	 */
	private String permissao;
	
	public Usuario(Long id, @NotNull String email, @NotNull String senha, String permissao) {
		super();
		this.id = id;
		this.email = email;
		this.senha = senha;
		this.permissao = permissao;
	}

	public void hashearSenha() {
		try {
			this.senha = DigestUtils.md5DigestAsHex(this.senha.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
	
	public Usuario() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

		
	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", email=" + email + ", senha=" + senha + ", permissao=" + permissao + "]";
	}

}
