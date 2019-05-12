package com.clickmed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clickmed.entity.Teste;

@Controller
public class InicialController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(ModelMap model, Teste teste) {
		return "index";
	}
	
	@RequestMapping(value = "/busca", method = RequestMethod.GET)

 	public String busca(ModelMap model, Teste teste) {
		return "resultado-busca";
	}
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.GET)

 	public String cadastro(ModelMap model, Teste teste) {
		return "pre-cadastro";
	}
}
