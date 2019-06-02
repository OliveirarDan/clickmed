package com.clickmed.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clickmed.entity.Medico;
import com.clickmed.entity.Paciente;
import com.clickmed.entity.Usuario;

@Controller
public class InicialController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(ModelMap model, Usuario usuario, HttpSession session,Paciente paciente, Medico medico) {
		model.addAttribute("mensagemDoSistema","Login");
		return "index";
	}

	@RequestMapping(value = "/cadastro", method = RequestMethod.GET)
	public String cadastro(ModelMap model) {
		return "pre-cadastro";
	}
}
