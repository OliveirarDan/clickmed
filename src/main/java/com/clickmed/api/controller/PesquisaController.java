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


	@RequestMapping(method = RequestMethod.GET, value = "/api/busca/{busca}")
	public @ResponseBody List<Medico> busca(@PathVariable("busca") String busca) throws IOException {
		
		List<Medico> medicos;
		
		try {

			System.out.println(busca);
			// Retirando espaço do inicio e do final da palavra
			String buscaPalavra = busca.trim();
			System.out.println(buscaPalavra);

			if (buscaPalavra.equals("")) {
				medicos = medicoService.listaMedicos();
				return medicos;
			} else {
				// contando quantas palavras tem
				int espaco = 0, resto = 0;
				for (int i = 0; i < buscaPalavra.length(); i++) {
					if (buscaPalavra.charAt(i) == ' ')
						espaco++;
					else
						resto++;
				}

				int palavras = espaco + 1;
				switch (palavras) {
				case 1:
					System.out.println("Uma palavra");
					medicos = medicoService.listarNomeMedico(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = medicoService.listarMedicoEspecialidade(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.buscaBairro(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.umaPalavra(buscaPalavra);
					return medicos;
				case 2:
					System.out.println("Duas palavra");
					medicos = buscaService.duasPalavrasNomeEspecialidade(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.duasPalavrasNomeBairro(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.duasPalavrasEspecialidadeBairro(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.duasPalavras(buscaPalavra);
					return medicos;

				case 3:
					System.out.println("Três palavra");
					medicos = buscaService.tresPalavrasNomeEspecialidadeBairro(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.tresPalavrasNomeEspecialidade(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.tresPalavrasNomeBairro(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.tresPalavrasBairroEspecialidade(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.tresPalavras(buscaPalavra);
					return medicos;
				case 4:
					System.out.println("Quatro palavra");
					medicos = buscaService.quatroPalavrasNomeEspecialidadeBairro(buscaPalavra);
					if (medicos.toString().length() != 2) {
						System.out.println("to aqui");
						return medicos;
					}
					medicos = buscaService.quatroPalavrasNomeEspecialidade(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.quatroPalavrasNomeBairro(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.quatroPalavrasBairroEspecialidade(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.quatroPalavras(buscaPalavra);
					return medicos;
				case 5:
					System.out.println("Cinco palavra");
					medicos = buscaService.cincoPalavrasNomeEspecialidadeBairro(buscaPalavra);
					if (medicos.toString().length() != 2) {
						System.out.println("to aqui");
						return medicos;
					}
					medicos = buscaService.cincoPalavrasNomeEspecialidade(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.cincoPalavrasNomeBairro(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.cincoPalavrasBairroEspecialidade(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.cincoPalavras(buscaPalavra);
					return medicos;
				case 6:
					System.out.println("Seis palavra");
					medicos = buscaService.seisPalavrasNomeEspecialidadeBairro(buscaPalavra);
					if (medicos.toString().length() != 2) {
						System.out.println("to aqui");
						return medicos;
					}
					medicos = buscaService.seisPalavrasNomeEspecialidade(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.seisPalavrasNomeBairro(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.seisPalavrasBairroEspecialidade(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.seisPalavras(buscaPalavra);
					return medicos;
				case 7:
					System.out.println("Sete palavra");
					medicos = buscaService.setePalavrasNomeEspecialidadeBairro(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.setePalavrasNomeEspecialidade(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.setePalavrasNomeBairro(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.setePalavrasBairroEspecialidade(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.setePalavras(buscaPalavra);
					return medicos;
				case 8:
					System.out.println("Oito palavra");
					medicos = buscaService.oitoPalavrasNomeEspecialidadeBairro(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.oitoPalavrasNomeEspecialidade(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.oitoPalavrasNomeBairro(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.oitoPalavrasBairroEspecialidade(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.oitoPalavras(buscaPalavra);
					return medicos;
				case 9:
					System.out.println("Nove palavra");
					medicos = buscaService.novePalavrasNomeEspecialidadeBairro(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.novePalavrasNomeEspecialidade(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.novePalavrasNomeBairro(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.novePalavrasBairroEspecialidade(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.novePalavras(buscaPalavra);
					return medicos;
				case 10:
					System.out.println("Dez palavra");
					medicos = buscaService.dezPalavrasNomeEspecialidadeBairro(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.dezPalavrasNomeEspecialidade(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.dezPalavrasNomeBairro(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.dezPalavrasBairroEspecialidade(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.dezPalavras(buscaPalavra);
					return medicos;

				default:
					medicos = buscaService.dezPalavrasNomeEspecialidadeBairro(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.dezPalavrasNomeEspecialidade(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.dezPalavrasNomeBairro(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.dezPalavrasBairroEspecialidade(buscaPalavra);
					if (medicos.toString().length() != 2) {
						return medicos;
					}
					medicos = buscaService.dezPalavras(buscaPalavra);
					return medicos;
				}
			}
		} catch (Exception e) {
			return null;
		}
	}}
