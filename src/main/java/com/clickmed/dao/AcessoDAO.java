package com.clickmed.dao;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.clickmed.entity.Acesso;



@Repository
public class AcessoDAO {


	//tentando commit java
	@PersistenceContext
	EntityManager manager;
	
	public int insereAcesso (Acesso acesso) throws IOException{
		manager.persist(acesso);
		return acesso.getIdAcesso();
	}
	
	public Acesso buscaAcesso(int idAcesso) throws IOException{
		return manager.find(Acesso.class, idAcesso);
	}
	
	public Acesso atualizaAcesso(Acesso acesso) throws IOException {
		manager.merge(acesso);
		return acesso;
	}
	
	public void removeAcesso(int idAcesso) throws IOException{
		manager.remove(manager.find(Acesso.class, idAcesso));
	}
	
	
	//PENSAR E CRIAR FORMAS DE VALIDAÇÂO
	
}
