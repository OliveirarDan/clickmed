package com.clickmed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickmed.dao.AcessoDAO;


@Service
public class AcessoService {

	AcessoDAO acessoDAO = new AcessoDAO();
	
	@Autowired
	public AcessoService(AcessoDAO acessoDAO) {
		this.acessoDAO = acessoDAO;
	}
	
	//PENSAR E CRIAR FORMAS DE VALIDAÇÂO
}
