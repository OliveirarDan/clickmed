package com.clickmed.api.controller;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.clickmed.entity.Clinica;
import com.clickmed.service.ClinicaService;

@Controller
public class ApiClinicaController {

	@Autowired
	ClinicaService clinicaService;

	@RequestMapping(method = RequestMethod.GET, value = "/api/clinica")
	public @ResponseBody List<Clinica> listarClinicas() throws IOException {
		List<Clinica> clinica = clinicaService.listaClinicas();
		return clinica;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/api/clinica/{id}")
	public @ResponseBody Clinica buscaClinicaPorId(@PathVariable("id") Long id) throws IOException {
		Clinica clinica = clinicaService.buscaClinica(id);
		return clinica;
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/clinica", headers = "Accept=application/json")
	public @ResponseBody Clinica inserirClinica(@RequestBody Clinica clinica) {
		try {
			System.out.println("Clinica recebido " + clinica.toString());
			clinicaService.insereClinica(clinica);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return clinica;
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/api/clinica", headers = "Accept=application/json")
	public @ResponseBody Clinica atualizaClinica(@RequestBody Clinica clinica) {
		try {
			System.out.println("Clinica recebido " + clinica.toString());
			clinicaService.atualizaClinica(clinica);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return clinica;
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/api/clinica/{id}")
	public @ResponseBody String removeClinica(@PathVariable("id") Long id) {
		try {
			clinicaService.removeClinica(id);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "Médico removido com sucesso";
	}


}
