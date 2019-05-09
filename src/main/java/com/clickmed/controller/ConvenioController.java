package com.clickmed.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clickmed.entity.Convenio;
import com.clickmed.service.ConvenioService;

@Controller
public class ConvenioController {

	@Autowired
	ConvenioService convenioService;

	/**
	 * ok
	 */
	@RequestMapping(value = "/novoConvenio", method = RequestMethod.GET)
	public String novoConvenio(ModelMap model) {
		return "teste/convenio/cadastro-convenio";
	}

	/**
	 * ok
	 */
	@RequestMapping(value = "/cadastraConvenio", method = { RequestMethod.POST })
	public String cadastraConvenio(Convenio convenio, ModelMap model) {
		try {
			convenioService.insereConvenio(convenio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listaConvenios(model);
	}

	
	/**
	 * ok
	 */
	@RequestMapping(value = "/listaConvenios", method = RequestMethod.GET)
	private String listaConvenios(ModelMap model) {
		model.put("convenios", convenioService.listaConvenios());
		return "teste/convenio/convenios";
	}
	
	/**
	 * ok
	 */
	@RequestMapping(value = "/selecionaConvenio", method = RequestMethod.POST)
	public String selecionaConvenio(Convenio convenio, ModelMap model) {
		convenio = convenioService.buscaConvenio(convenio.getId());
		model.addAttribute(convenio);
		return "teste/convenio/edicao-convenio";
	}
	
	
	
	/**
	 * ok
	 */
	@RequestMapping(value = "/salvaConvenio", method = { RequestMethod.POST })
	public String salvaConvenio(ModelMap model, Convenio convenio) throws IOException {
		convenioService.atualizaConvenio(convenio);
		return listaConvenios(model);
	}
	
	
	/**
	 * ok
	 */	
	@RequestMapping(value = "/removeConvenio", method = { RequestMethod.POST })
	public String removeConvenio(ModelMap model, Convenio convenio) throws IOException {
		convenioService.removeConvenio(convenio.getId());
		return listaConvenios(model);
	}
	
	

}
