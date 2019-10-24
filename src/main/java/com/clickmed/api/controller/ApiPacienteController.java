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
import com.clickmed.entity.Paciente;
import com.clickmed.service.PacienteService;

@Controller
public class ApiPacienteController {

	@Autowired
	PacienteService pacienteService;

	@RequestMapping(method = RequestMethod.GET, value = "/api/paciente")
	public @ResponseBody List<Paciente> listarPacientes() throws IOException {
		List<Paciente> paciente = pacienteService.listaPacientes();
		return paciente;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/api/paciente/{id}")
	public @ResponseBody Paciente buscaPacientePorId(@PathVariable("id") Long id) throws IOException {
		Paciente paciente = pacienteService.buscaPaciente(id);
		return paciente;
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/paciente", headers = "Accept=application/json")
	public @ResponseBody Paciente inserirPaciente(@RequestBody Paciente paciente) {
		try {
			pacienteService.inserePaciente(paciente);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return paciente;
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/api/paciente", headers = "Accept=application/json")
	public @ResponseBody Paciente atualizaPaciente(@RequestBody Paciente paciente) {
		try {
			pacienteService.atualizaPaciente(paciente);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return paciente;
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/api/paciente/{id}")
	public @ResponseBody String removePaciente(@PathVariable("id") Long id) {
		try {
			pacienteService.removePaciente(id);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "Médico removido com sucesso";
	}
}
