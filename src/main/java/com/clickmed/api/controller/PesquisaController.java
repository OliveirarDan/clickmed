package com.clickmed.api.controller;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.clickmed.entity.Medico;
import com.clickmed.service.BuscaService;
import com.clickmed.service.MedicoService;

@Controller
public class PesquisaController {

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
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/busca")
	public @ResponseBody List<Medico> busca() throws IOException {
		List<Medico> medico = medicoService.listaMedicos();
		return medico;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/api/busca/{busca}")
	public @ResponseBody List<Medico> busca(@PathVariable("busca") String busca) throws IOException {
		
	
		List<Medico> medicos = null;
		try {
			System.out.println(busca);
			// Retirando espaço do inicio e do final da palavra
			busca = busca.trim();
			System.out.println(busca);

			// contando quantas palavras tem
			int espaco = 0, resto = 0;
			for (int i = 0; i < busca.length(); i++) {
				if (busca.charAt(i) == ' ')
					espaco++;
				else
					resto++;
			}

			int palavras = espaco + 1;
			switch (palavras) {
			case 1:
				System.out.println("Uma palavra");
				medicos = buscaService.umaPalavra(busca);
				System.out.println(medicos.toString());
				return medicos;
			case 2:
				System.out.println("Duas palavra");
				medicos = buscaService.duasPalavras(busca);
				return medicos;
			case 3:
				System.out.println("Três palavra");
				medicos = buscaService.tresPalavras(busca);
				return medicos;
			case 4:
				System.out.println("Quatro palavra");
				medicos = buscaService.quatroPalavras(busca);
				return medicos;
			case 5:
				System.out.println("Cinco palavra");
				medicos = buscaService.cincoPalavras(busca);
				return medicos;
			case 6:
				System.out.println("Seis palavra");
				medicos = buscaService.seisPalavras(busca);
				return medicos;
			case 7:
				System.out.println("Sete palavra");
				medicos = buscaService.setePalavras(busca);
				return medicos;
			case 8:
				System.out.println("Oito palavra");
				medicos = buscaService.oitoPalavras(busca);
				return medicos;
			case 9:
				System.out.println("Nove palavra");
				medicos = buscaService.novePalavras(busca);
				return medicos;
			case 10:
				System.out.println("Dez palavra");
				medicos = buscaService.dezPalavras(busca);
				return medicos;

			default:
				medicos = buscaService.dezPalavras(busca);
				return medicos;
			}
		} catch (Exception e) {
			return medicos;
		}
	}
}
