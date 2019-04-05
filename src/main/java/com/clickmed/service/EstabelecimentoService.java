package com.clickmed.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickmed.dao.EstabelecimentoDAO;
import com.clickmed.entity.Estabelecimento;

@Service
public class EstabelecimentoService {

	
	EstabelecimentoDAO estabelecimentoDAO = new EstabelecimentoDAO();
	
	@Autowired
	public EstabelecimentoService(EstabelecimentoDAO estabelecimentoDAO) {
		this.estabelecimentoDAO = estabelecimentoDAO;
	}
	
	@Transactional
	public Estabelecimento insereEstabelecimento(Estabelecimento estabelecimento) throws IOException{
		int idEstabelecimento =  estabelecimentoDAO.insereEstabelecimento(estabelecimento);
		estabelecimento.setIdEstabelecimento(idEstabelecimento);
		return estabelecimento;
	}
	
	@Transactional
	public Estabelecimento atualizaEstabelecimento(Estabelecimento estabelecimento) throws IOException{
		estabelecimentoDAO.atualizaEstabelecimento(estabelecimento);
		return estabelecimento;
	}
	
	@Transactional
	public void removeEstabelecimento(int idEstabelecimento) throws IOException{
		estabelecimentoDAO.removeEstabelecimento(idEstabelecimento);
	}
	
	public Estabelecimento buscaEstabelecimento(int idEstabelecimento) throws IOException{
		return estabelecimentoDAO.buscaEstabelecimento(idEstabelecimento);
	}
	
	/**
	 * listaEstabelecimentos() - Lista todos os estabelecimentos cadastrados
	 * @return
	 * @throws IOException
	 */
	public List<Estabelecimento> listaEstabelecimentos() throws IOException{
		return estabelecimentoDAO.listaEstabelecimentos();
	} 
	
	/**
	 * istaEstabelecimentos(String chave) - Retorna os estabelecimentos a partir do nomeFantasia pesquisado
	 * @param chave
	 * @return
	 * @throws IOException
	 */
	public List<Estabelecimento> listaEstabelecimentos(String chave) throws IOException{
		return estabelecimentoDAO.listaEstabelecimentos(chave);
	}

}
