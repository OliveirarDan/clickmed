package com.clickmed.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickmed.dao.TesteDAO;
import com.clickmed.entity.Teste;

import ch.qos.logback.core.net.SyslogOutputStream;

@Service
@Transactional
public class TesteService {

	private TesteDAO testeDAO;
	
	
	@Autowired
	public void setTesteDAO(TesteDAO testeDAO) {
		this.testeDAO = testeDAO;
	}
	
	
	public Teste buscaTeste(int idTeste) {
		return testeDAO.getOne(idTeste);
		
		//testeDAO.findById(idTeste).get();
		}
	
	public void insereTeste(Teste teste) {
		testeDAO.save(teste);
		System.out.println(teste.toString());
	}
	
	public List<Teste> listaTestes(){
		return testeDAO.findAll();
	}
	
}
