package com.clickmed.service;

import java.io.IOException;
import java.util.List;

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

	/**
	 * Insere Usuario, precisa ser feito antes do cadastro do Paciente/Médico
	 * 
	 * @param usuario
	 * @return Usuario cadastrado
	 */
	public Usuario insereUsuario(Usuario usuario) throws IOException {
		return this.usuarioDAO.save(usuario);
	}

	/**
	 * Verifica o id recebido, caso ele exista atualiza, se não retorna null
	 * 
	 * @param usuario
	 * @return usuario atualizado ou null caso não exista.
	 */
	public Usuario atualizaUsuario(Usuario usuario) throws IOException {
		if (this.usuarioDAO.existsById(usuario.getId()) == true) {
			return this.usuarioDAO.save(usuario);
		}
		return null;
	}

	/**
	 * Remove um usuario de acordo com o id recebido.
	 * 
	 * @param idUsuario id do usuario a ser excluído.
	 * @throws IOException
	 */
	public void removeUsuario(Long idUsuario) throws IOException {
		this.usuarioDAO.deleteById(idUsuario);
	}

	/**
	 * Busca um usuario pelo ID
	 * 
	 * @param idUsuario
	 * @return Um objeto Usuario.
	 */
	public Usuario buscaUsuario(Long idUsuario) {
		return this.usuarioDAO.getOne(idUsuario);
	}

	/**
	 * Lista todos os usuários cadastrados.
	 * 
	 * @return List<Usuario>
	 */
	public List<Usuario> listaUsuarios() {
		return usuarioDAO.findAll();
	}
	
	
	public Usuario autenticar(Usuario usuario) {
		Usuario usuarioAutenticado = usuarioDAO.findByEmail(usuario.getEmail());

		if (usuarioAutenticado.getSenha().equals(usuario.getSenha())) {

			return usuarioAutenticado;
		}
		return null;
	}

	public Usuario buscaPorEmail(String email) {
		Usuario usuario = usuarioDAO.findByEmail(email);

		return usuario;
	}
}
