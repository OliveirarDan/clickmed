package com.clickmed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clickmed.entity.Teste;
import com.clickmed.service.TesteService;

@Controller
public class TesteController {
	
	@Autowired
	TesteService testeService;
	
	@RequestMapping(value ="/", method = RequestMethod.GET)
	public String abrirTelaDeTeste(ModelMap model, Teste teste) {
		return "cadastrateste";
	}
	
	
	@RequestMapping(value ="/testes", method = RequestMethod.GET)
	public String abrirTelaDeTestes(ModelMap model, Teste teste) {
		model.put("tes", testeService.listaTestes());
		return "teste";
	}
	
	@RequestMapping(value="/cadastrateste", method = RequestMethod.POST)
	public String insereTeste(Teste teste, ModelMap model ) {
		testeService.insereTeste(teste);
		return abrirTelaDeTestes(model, teste);	
	}
	
	@RequestMapping(value ="/editar", method = RequestMethod.GET)
	public String editar(ModelMap model, Teste teste) {
		model.put("teste",testeService.buscaTeste(3));
		return "editateste";
	}
	
	

	@RequestMapping(value="/editateste", method = RequestMethod.POST)
	public String editateste(Teste teste, ModelMap model) {
		teste.setIdteste(3);
		model.put("teste",testeService.editateste(teste));
		return abrirTelaDeTestes(model, teste);
	}
	
	
	

}
