package com.clickmed.dao;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.clickmed.entity.Estabelecimento;

@Repository
public class EstabelecimentoDAO {

	@PersistenceContext
	EntityManager manager;
	
	public int insereEstabelecimento (Estabelecimento estabelecimento) throws IOException{
		manager.persist(estabelecimento);
		return estabelecimento.getIdEstabelecimento();
	}
	
	public Estabelecimento buscaEstabelecimento(int idEstabelecimento) throws IOException{
		return manager.find(Estabelecimento.class, idEstabelecimento);
	}
	
	public Estabelecimento atualizaEstabelecimento(Estabelecimento estabelecimento) throws IOException{
		manager.merge(estabelecimento);
		return estabelecimento;
	}
	
	public void removeEstabelecimento(int idEstabelecimento) throws IOException{
		manager.remove(manager.find(Estabelecimento.class, idEstabelecimento));
	}
	
	@SuppressWarnings("unchecked")
	public List<Estabelecimento> listaEstabelecimentos() throws IOException{
		return manager.createQuery("select f from Estabelecimento f").getResultList();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Estabelecimento> listaEstabelecimentos(String chave) throws IOException {
		String jpql = "select f from Estabelecimento f where f.nomeFantasia like :chave ";
		Query query = manager.createQuery(jpql);
		query.setParameter("chave", "%" + chave + "%");
		List<Estabelecimento> result = query.getResultList();
		return result;
	}
	
}
