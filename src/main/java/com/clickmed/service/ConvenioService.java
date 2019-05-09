package com.clickmed.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickmed.dao.ConvenioDAO;
import com.clickmed.entity.Convenio;

@Service
@Transactional
public class ConvenioService {

	private ConvenioDAO convenioDAO;

	@Autowired
	public ConvenioService(ConvenioDAO convenioDAO) {
		this.convenioDAO = convenioDAO;
	}

	/**
	 * Insere Convenio
	 * 
	 * @param convenio
	 * @return Retorna o objeto Convenio cadastrado
	 * @throws IOException
	 */
	@Transactional
	public Convenio insereConvenio(Convenio convenio) throws IOException {
		return this.convenioDAO.save(convenio);
	}

	/**
	 * Verifica o id recebido, casa ja exista um convenio com este id, atualiza.
	 * 
	 * @param convenio
	 * @return convenio atualizado ou null caso não exista.
	 * @throws IOException
	 */
	@Transactional
	public Convenio atualizaConvenio(Convenio convenio) throws IOException {
		if (this.convenioDAO.existsById(convenio.getId()) == true) {
			return this.convenioDAO.save(convenio);
		}
		return null;
	}

	
	/**
	 * Remove um Convenio de acordo com o id recebido.
	 * 
	 * @param idConvenio id do convenio a ser excluída.
	 * @throws IOException
	 */
	@Transactional
	public void removeConvenio(Long idConvenio) throws IOException {
		this.convenioDAO.deleteById(idConvenio);
	}

	/**
	 * busca um convenio pelo id.
	 * 
	 * @param idConvenio
	 * @return um objeto do Convenio.
	 */
	public Convenio buscaConvenio(Long idConvenio) {
		return this.convenioDAO.getOne(idConvenio);
	}

	/**
	 * Lista todos os convenios cadastrados.
	 * 
	 * @return lista de convênios.
	 */
	public List<Convenio> listaConvenios() {
		return this.convenioDAO.findAll();
	}

}
