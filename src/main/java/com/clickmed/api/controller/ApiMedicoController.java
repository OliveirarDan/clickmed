package com.clickmed.api.controller;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.clickmed.entity.Medico;
import com.clickmed.service.BuscaService;
import com.clickmed.service.MedicoService;

@Controller
public class ApiMedicoController {

	@Autowired
	MedicoService medicoService;
	BuscaService buscaService;

	@RequestMapping(method = RequestMethod.GET, value = "/api/medico")
	public @ResponseBody List<Medico> listarMedicos() throws IOException {
		List<Medico> medico = medicoService.listaMedicos();
		return medico;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/api/medico/{id}")
	public @ResponseBody Medico buscaMedicoPorId(@PathVariable("id") Long id) throws IOException {
		Medico medico = medicoService.buscaMedico(id);
		return medico;
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/medico", headers = "Accept=application/json")
	public @ResponseBody Medico inserirMedico(@RequestBody Medico medico) {
		try {
			System.out.println("Medico recebido " + medico.toString());
			medicoService.insereMedico(medico);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return medico;
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/api/medico", headers = "Accept=application/json")
	public @ResponseBody Medico atualizaMedico(@RequestBody Medico medico) {
		try {
			System.out.println("Medico recebido " + medico.toString());
			medicoService.atualizaMedico(medico);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return medico;
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/api/medico/{id}")
	public @ResponseBody String removeMedico(@PathVariable("id") Long id) {
		try {
			medicoService.removeMedico(id);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "Médico removido com sucesso";
	}


}
