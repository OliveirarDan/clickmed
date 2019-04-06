package com.clickmed.dao;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.clickmed.entity.Avaliacao;

@Repository
public class AvaliacaoDAO {

	@PersistenceContext
	EntityManager manager;
	
	public int insereAvaliacao(Avaliacao avaliacao)throws IOException{
		manager.persist(avaliacao);
		return avaliacao.getIdAvaliacao();
	}
	
	public Avaliacao buscaAvaliacao (int idAvaliacao) throws IOException{
		return manager.find(Avaliacao.class, idAvaliacao);
	}
	
	public Avaliacao atualizaAvaliacao (Avaliacao avaliacao) throws IOException{
		manager.merge(avaliacao);
		return avaliacao;
	}
	
	public void removeAvaliacao(int idAvaliacao) throws IOException{
		manager.remove(manager.find(Avaliacao.class, idAvaliacao));
	}
	
	@SuppressWarnings("unchecked")
	public List<Avaliacao> listaAvaliacoes() throws IOException{
		return manager.createQuery("Select f from Avaliacao f").getResultList();
	} 
	
	//Falta Criar Método que busca avaliações pelo ID do Médico.
	
}

