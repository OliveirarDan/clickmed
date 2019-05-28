package com.clickmed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InicialController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(ModelMap model) {
		return "index";
	}

	@RequestMapping(value = "/cadastro", method = RequestMethod.GET)

	public String cadastro(ModelMap model) {
		return "pre-cadastro";
	}
}
