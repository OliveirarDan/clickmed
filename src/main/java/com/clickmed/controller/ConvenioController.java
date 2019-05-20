package com.clickmed.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.clickmed.entity.Clinica;
import com.clickmed.entity.Convenio;
import com.clickmed.service.ConvenioService;

@Controller
public class ConvenioController {

	@Autowired
	ConvenioService convenioService;

	@RequestMapping(value = "/novoConvenio", method = RequestMethod.GET)
	public String novoConvenio(ModelMap model) {
		return "teste/convenio/cadastro-convenio";
	}

	@RequestMapping(value = "/cadastraConvenio", method = { RequestMethod.POST })
	public String cadastraConvenio(Convenio convenio, ModelMap model) {
		try {
			convenioService.insereConvenio(convenio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listaConvenios(model);
	}

	@RequestMapping(value = "/listaConvenios", method = RequestMethod.GET)
	private String listaConvenios(ModelMap model) {
		model.put("convenios", convenioService.listaConvenios());
		return "teste/convenio/convenios";
	}
	
	@RequestMapping(value = "/selecionaConvenio", method = RequestMethod.POST)
	public String selecionaConvenio(Convenio convenio, ModelMap model) {
		convenio = convenioService.buscaConvenio(convenio.getId());
		model.addAttribute(convenio);
		return "teste/convenio/edicao-convenio";
	}
	
	@RequestMapping(value = "/salvaConvenio", method = { RequestMethod.POST })
	public String salvaConvenio(ModelMap model, Convenio convenio) throws IOException {
		convenioService.atualizaConvenio(convenio);
		return listaConvenios(model);
	}

	@RequestMapping(value = "/removeConvenio", method = { RequestMethod.POST })
	public String removeConvenio(ModelMap model, Convenio convenio) throws IOException {
		convenioService.removeConvenio(convenio.getId());
		return listaConvenios(model);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "rest/convenio")
	public @ResponseBody List<Convenio> listarConvenios(ModelMap model) throws IOException
	{
		List<Convenio> convenio = convenioService.listaConvenios();
		model.addAttribute("convenio", convenio);
		return convenio;
	}
}
