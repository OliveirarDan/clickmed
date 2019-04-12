package com.clickmed.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clickmed.entity.Teste;

public class InicialController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(ModelMap model, Teste teste) {
		return "index";
	}

	@RequestMapping(value = "/medico", method = RequestMethod.GET)
	public String cadastroMedico(ModelMap model) {
		return "cadastro-medico";
	}
	
}
