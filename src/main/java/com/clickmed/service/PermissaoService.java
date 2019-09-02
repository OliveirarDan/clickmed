package com.clickmed.service;

import com.clickmed.dao.PermissaoDAO;
import com.clickmed.entity.Permissao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;

@Service
@Transactional
public class PermissaoService {

	private PermissaoDAO permissaoDAO;

	@Autowired
	public PermissaoService(PermissaoDAO permissaoDAO) {
		this.permissaoDAO = permissaoDAO;
	}

	/**
	 * Insere Permissao
	 * 
	 * @param permissao
	 * @return o objeto permissao cadastrado
	 * @throws IOException
	 */
	@Transactional
	public Permissao inserePermissao(Permissao permissao) {
		return this.permissaoDAO.save(permissao);
	}

	/**
	 * Verifica o id recebido, casa ja exista uma permissao com este id,
	 * atualiza.
	 * 
	 * @param permissao
	 * @return permissao atualizada ou null caso não exista.
	 * @throws IOException
	 */
	@Transactional
	public Permissao atualizaPermissao(Permissao permissao) throws IOException {
		if (this.permissaoDAO.existsById(permissao.getId())) {
			return this.permissaoDAO.save(permissao);
		}
		return null;
	}

	/**
	 * Remove uma permissao com o id recebido.
	 * 
	 * @param idPermissao
	 * @throws IOException
	 */
	@Transactional
	public void removePermissao(Long idPermissao) throws IOException {
		this.permissaoDAO.deleteById(idPermissao);
	}

	/**
	 * Busca uma permissao pelo id.
	 * 
	 * @param idPermissao
	 * @return permissao
	 */
	public Permissao buscaPermissao(Long idPermissao) throws IOException {
		return this.permissaoDAO.getOne(idPermissao);
	}

	/**
	 * Lista todas as permissao cadastradas.
	 * 
	 * @return Lista de permissaos.
	 */
	public List<Permissao> listaPermissoes() {
		return this.permissaoDAO.findAll();
	}
}
