package com.clickmed.dao;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.clickmed.entity.Convenio;

@Repository
public class ConvenioDAO {
	
	@PersistenceContext
	EntityManager manager;
	
	public int insereConvenio(Convenio convenio) throws IOException{
		manager.persist(convenio);
		return convenio.getIdConvenio();
	}
	
	public Convenio	buscaConvenio(int idConvenio) throws IOException{
		return manager.find(Convenio.class, idConvenio);
	}
	
	public Convenio atualizaConvenio(Convenio convenio) throws IOException {
		manager.merge(convenio);
		return convenio;
	}
	
	public void removeConvenio(int idConvenio) throws IOException{
		manager.remove(manager.find(Convenio.class, idConvenio));
	}
	
	@SuppressWarnings("unchecked")
	public List<Convenio> listaConvenios() throws IOException{
		return manager.createQuery("Select f from Convenio f").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Convenio> listaConvenios(String chave)throws IOException{
		String jpql = "select f from Convenio f where f.convenio like :chave ";
		Query query = manager.createQuery(jpql);
		query.setParameter("chave", "%" + chave + "%");
		List<Convenio> result = query.getResultList();
		return result;
	}

}

