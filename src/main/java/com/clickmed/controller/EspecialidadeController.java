package com.clickmed.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clickmed.entity.Especialidade;
import com.clickmed.service.EspecialidadeService;

@Controller
public class EspecialidadeController {

	@Autowired
	EspecialidadeService especialidadeService;
	
	@RequestMapping(value = "/novaEspecialidade", method = RequestMethod.GET)
	public String novaEspecialidade(ModelMap model) {
		return "teste/especialidade/cadastro-especialidade";
	}
	
	@RequestMapping(value = "/cadastraEspecialidade", method = RequestMethod.POST)
	public String cadastraEspecialidade(Especialidade especialidade, ModelMap model) {
		try {
			especialidadeService.insereEspecialidade(especialidade);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaEspecialidades(model);
	}
	
	@RequestMapping(value = "/listaEspecialidades", method = RequestMethod.GET)
	private String listaEspecialidades(ModelMap model) {
		model.put("especialidades", especialidadeService.listaEspecialidades());
		return "teste/especialidade/especialidades";
	}
	
	@RequestMapping(value = "/salvaEspecialidade", method = RequestMethod.POST)
	public String salvaEspecialidade(Especialidade especialidade, ModelMap model)throws IOException{
		especialidadeService.atualizaEspecialidade(especialidade);
		return listaEspecialidades(model);
	}
	
	
	@RequestMapping(value = "/selecionaEspecialidade", method = RequestMethod.POST)
	public String selecionaEspecialidade(Especialidade especialidade, ModelMap model) throws IOException {
		especialidade = especialidadeService.buscaEspecialidade(especialidade.getId());
		model.addAttribute(especialidade);
		return "teste/especialidade/edicao-especialidade";
	}
	
	
	@RequestMapping(value = "/removeEspecialidade", method = RequestMethod.POST)
	public String removeEspecilidade(Especialidade especialidade, ModelMap model) throws IOException{
		especialidadeService.removeEspecialidade(especialidade.getId());
		return listaEspecialidades(model);
	}
	
	
	
}
