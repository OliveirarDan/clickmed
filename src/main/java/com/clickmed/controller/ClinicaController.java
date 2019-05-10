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
import com.clickmed.service.ClinicaService;

@Controller
public class ClinicaController {

	@Autowired
	ClinicaService clinicaService;
	
	/**
	 * ok
	 */
	@RequestMapping(value = "/novaClinica", method = RequestMethod.GET)
	public String novaClinica(ModelMap model) {
		return "cadastro-clinica";
	}

	/**
	 * ok
	 */
	@RequestMapping(value = "/cadastraClinica", method = { RequestMethod.POST })
	public String cadastraClinica(Clinica clinica, ModelMap model) {
		System.out.println(clinica.toString());
		try {
			
			clinicaService.insereClinica(clinica);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listaClinicas(model);
	}

	
	/**
	 * ok
	 */
	@RequestMapping(value = "/listaClinicas", method = RequestMethod.GET)
	private String listaClinicas(ModelMap model) {
		model.put("clinicas", this.clinicaService.listaClinicas());
		return "teste/clinica/clinicas";
	}
	
	/**
	 * ok
	 */
	@RequestMapping(value = "/selecionaClinica", method = RequestMethod.POST)
	public String selecionaClinica(Clinica clinica, ModelMap model) {
		clinica = clinicaService.buscaClinica(clinica.getId());
		System.out.println(clinica.toString());
		model.addAttribute(clinica);
		return "/teste/clinica/edicao-clinica";
	}
	
	
	
	/**
	 *ok
	 */
	@RequestMapping(value = "/salvaClinica", method = { RequestMethod.POST })
	public String salvaClinica(ModelMap model, Clinica clinica) throws IOException {
		clinicaService.atualizaClinica(clinica);
		return listaClinicas(model);
	}
	
	
	/**
	 * ----TESTANDO----	Falta criar tela edicao-clinica
	 * @param model
	 * @return
	 */	
	@RequestMapping(value = "/removeClinica", method = { RequestMethod.POST })
	public String removeClinica(ModelMap model, Clinica clinica) throws IOException {
		clinicaService.removeClinica(clinica.getId());
		return listaClinicas(model);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "rest/clinica")
	public @ResponseBody List<Clinica> listarPessoas(ModelMap model) throws IOException
	{
		List<Clinica> clinica = clinicaService.listaClinicas();
		model.addAttribute("clinica", clinica);
		return clinica;
	}
	
}
