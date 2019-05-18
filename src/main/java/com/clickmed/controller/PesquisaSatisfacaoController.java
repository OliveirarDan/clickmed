package com.clickmed.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clickmed.entity.Medico;
import com.clickmed.entity.Paciente;
import com.clickmed.entity.PesquisaSatisfacao;
import com.clickmed.service.MedicoService;
import com.clickmed.service.PacienteService;
import com.clickmed.service.PesquisaSatisfacaoService;

@Controller
public class PesquisaSatisfacaoController {

	@Autowired
	PesquisaSatisfacaoService pesquisaSatisfacaoService;

	@Autowired
	MedicoService medicoService;
	
	@Autowired
	PacienteService pacienteService;
	
	/**
	 * ok
	 */
	@RequestMapping(value = "/pesquisaSatisfacao", method = RequestMethod.GET)
	public String pesquisaSatisfacao(ModelMap model) {
		model.put("medicos", medicoService.listaMedicos());
		return "/teste/avaliacao/seleciona-medicos";
	}

	/**
	 * ok
	 */
	@RequestMapping(value = "/iniciaPesquisaSatisfacao", method = { RequestMethod.POST })
	public String iniciaPesquisaSatisfacao(ModelMap model, Medico medico) {
		return "/teste/avaliacao/cadastro-pesquisaSatisfacao";
	}

	
	
	@RequestMapping(value = "/inicia", method = { RequestMethod.POST })
	public String inicia(ModelMap model, Medico medico) {
		return "/teste/avaliacao/cadastro-pesquisaSatisfacao";
	}
	/**
	 * -ok
	 * 
	 * @param pesquisaSatisfacao
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/cadastraPesquisaSatisfacao", method = { RequestMethod.POST })
	public String cadastraPesquisaSatisfacao(PesquisaSatisfacao pesquisaSatisfacao, Paciente paciente,
			ModelMap model) {
		
		//Setando Id do paciente que está avaliando
		pesquisaSatisfacao.setIdPaciente(Long.parseLong("17"));
		try {
			pesquisaSatisfacaoService.inserePSComMedia(pesquisaSatisfacao);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pesquisaSatisfacao(model);
	}



	
	/**
	 * ok
	 * @param model
	 * @param medico
	 * @return
	 */
	@RequestMapping(value = "/listaPesquisaSatisfacaoPorMedico", method = RequestMethod.POST)
	private String listaPesquisaSatisfacaoPorMedico(ModelMap model, Medico medico) {
		medico = medicoService.buscaMedico(medico.getId());
		model.put("PSs", this.pesquisaSatisfacaoService.listaPSPorMedicos(medico));
		model.addAttribute(medico);
		return "/teste/avaliacao/pesquisas";
	}
	





}
