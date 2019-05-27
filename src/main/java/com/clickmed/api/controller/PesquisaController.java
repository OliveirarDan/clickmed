package com.clickmed.api.controller;

import java.io.IOException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.clickmed.entity.Medico;
import com.clickmed.service.MedicoService;

@Controller
public class PesquisaController {

	@Autowired
	MedicoService medicoService;

	String maisDeUmNomeParaBusca;
	String stringBuscaPorEspecialidade;

	
	@RequestMapping(method = RequestMethod.GET, value = "/api/medico")
	public @ResponseBody List<Medico> listarMedicos(ModelMap model) throws IOException
	{
		List<Medico> medico = medicoService.listaMedicos();
		model.addAttribute("medico", medico);
		return medico;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/medico/{id}")
	public @ResponseBody Medico buscaMedicoPorId(@PathVariable("id") Long id, ModelMap model) throws IOException
	{
		Medico medico = medicoService.buscaMedico(id);
		model.addAttribute("medico", medico);
		return medico;
	}
}
