package com.clickmed.dao;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.clickmed.entity.Medico;

@Repository
public class MedicoDAO {
	@PersistenceContext
	EntityManager manager;

	public int insereMedico(Medico medico) throws IOException {
		manager.persist(medico);
		return medico.getIdMedico();
	}

	public Medico buscaMedico(int idMedico) throws IOException {
		return manager.find(Medico.class, idMedico);
	}

	public Medico atualizaMedico(Medico medico) throws IOException {
		manager.merge(medico);
		return medico;
	}

	public void removeMedico(int idMedico) throws IOException {
		manager.remove(manager.find(Medico.class, idMedico));
	}
	
	@SuppressWarnings("unchecked")
	public List<Medico> listaMedicos()throws IOException{
		return manager.createQuery("select f from Medico f").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Medico> listaMedicos(String chave) throws IOException {

		String jpql = "select f from Medico f where f.nome like :chave";
		Query query = manager.createQuery(jpql);
		query.setParameter("chave", "%" + chave + "%");
		List<Medico> result = query.getResultList();
		return result;
	}
	

}
