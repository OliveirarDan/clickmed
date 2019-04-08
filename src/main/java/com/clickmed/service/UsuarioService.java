package com.clickmed.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickmed.dao.UsuarioDAO;
import com.clickmed.entity.Usuario;

@Service
@Transactional
public class UsuarioService {

	private UsuarioDAO usuarioDAO;

	@Autowired
	public UsuarioService(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

	public Usuario insereUsuario(Usuario usuario) {
		this.usuarioDAO.save(usuario);
		return usuario;
	}
}
