package com.clickmed.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickmed.dao.ConvenioDAO;
import com.clickmed.entity.Convenio;

@Service
public class ConvenioService {

	ConvenioDAO convenioDAO = new ConvenioDAO();

	@Autowired
	public ConvenioService(ConvenioDAO convenioDAO) {
		this.convenioDAO = convenioDAO;
	}

	@Transactional
	public Convenio insereConvenio(Convenio convenio) throws IOException {
		int idConvenio = convenioDAO.insereConvenio(convenio);
		convenio.setIdConvenio(idConvenio);
		return convenio;
	}

	@Transactional
	public Convenio atualizaConvenio(Convenio convenio) throws IOException {
		convenioDAO.atualizaConvenio(convenio);
		return convenio;
	}

	@Transactional
	public void removeConvenio(int idConvenio) throws IOException {
		convenioDAO.removeConvenio(idConvenio);
	}

	public Convenio buscaConvenio(int idConvenio) throws IOException {
		return convenioDAO.buscaConvenio(idConvenio);
	}

	/**
	 * listaConvenios() - Lista todos os convenios cadastrados
	 * @return
	 * @throws IOException
	 */
	public List<Convenio> listaConvenios() throws IOException {
		return convenioDAO.listaConvenios();
	}
	
	/**
	 * listaConvenios(String chave)- Retorna os convenios a partir do convenio pesquisado
	 * @param chave
	 * @return
	 * @throws IOException
	 */
	public List<Convenio> listaConvenios(String chave) throws IOException{
		return convenioDAO.listaConvenios(chave);
	}
	
}
