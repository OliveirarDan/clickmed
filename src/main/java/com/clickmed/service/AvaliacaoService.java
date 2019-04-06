package com.clickmed.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickmed.dao.AvaliacaoDAO;
import com.clickmed.entity.Avaliacao;

@Service
public class AvaliacaoService {

	AvaliacaoDAO avaliacaoDAO = new AvaliacaoDAO();
	
	
	@Autowired
	public AvaliacaoService(AvaliacaoDAO avaliacaoDAO) {
		this.avaliacaoDAO = avaliacaoDAO;
	}
	
	@Transactional
	public Avaliacao insereAvaliacao(Avaliacao avaliacao) throws IOException {
		int idAvaliacao = avaliacaoDAO.insereAvaliacao(avaliacao);
		avaliacao.setIdAvaliacao(idAvaliacao);
		return avaliacao;
	}
	
	@Transactional
	public Avaliacao atualizaAvaliacao(Avaliacao avaliacao) throws IOException{
		avaliacaoDAO.atualizaAvaliacao(avaliacao);
		return avaliacao;
	}
	
	@Transactional
	public void removeAvaliacao(int idAvaliacao) throws IOException{
		avaliacaoDAO.removeAvaliacao(idAvaliacao);
	}
	
	public Avaliacao buscaAvaliacao (int idAvaliacao) throws IOException{
		return avaliacaoDAO.buscaAvaliacao(idAvaliacao);
	}
	
	public List<Avaliacao> listaAvaliacoes() throws IOException{
		return avaliacaoDAO.listaAvaliacoes();
	}
	
	
	//Falta Criar Método que busca avaliações pelo ID do Médico.
}
