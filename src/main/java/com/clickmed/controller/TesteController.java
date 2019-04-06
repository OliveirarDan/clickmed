package com.clickmed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clickmed.entity.Teste;
import com.clickmed.service.TesteService;

import ch.qos.logback.core.net.SyslogOutputStream;

@Controller
public class TesteController {
	
	@Autowired
	TesteService testeService;
	
	@RequestMapping(value ="/teste", method = RequestMethod.GET)
	public String abrirTelaDeTeste(ModelMap model, Teste teste) {
		
		teste = testeService.buscaTeste(1);
		System.out.println(teste.toString());
		model.put("tes",teste);

		return "teste";
	}
	
	
	@RequestMapping(value ="/testes", method = RequestMethod.GET)
	public String abrirTelaDeTestes(ModelMap model, Teste teste) {
		
		
		model.put("tes", testeService.listaTestes());

		return "teste";
	}
	
	
	

}
