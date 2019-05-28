package com.clickmed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clickmed.entity.Medico;
import com.clickmed.service.BuscaService;
import com.clickmed.service.MedicoService;

@Controller
public class BuscaController {

	@Autowired
	BuscaService buscaService;
	@Autowired
	MedicoService medicoService;

	@RequestMapping(value = "/buscaPrincipal", method = { RequestMethod.POST })
	public String buscaPrincipal(ModelMap model, Medico medico, String busca) {

		busca = medico.getNome();
		try {
			model.clear();

			System.out.println(busca);
			// Retirando espaço do inicio e do final da palavra
			String buscaPalavra = busca.trim();
			System.out.println(buscaPalavra);

			if (buscaPalavra.equals("")) {
				model.put("medicos", medicoService.listaMedicos());
				return resultadoBusca(model);
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
					model.put("medicos", buscaService.umaPalavra(buscaPalavra));
					if (model.get("medicos").toString().length() == 2) {
						System.out.println("Não tem dados");
					} else {
						System.out.println("Tem dados");
					}
					return resultadoBusca(model);
				case 2:
					System.out.println("Duas palavra");
					model.put("medicos", buscaService.duasPalavras(buscaPalavra));
					if (model.get("medicos").toString().length() != 2) {
						System.out.println("Não tem dados");
					} else {
						System.out.println("Tem dados");
					}
					return resultadoBusca(model);
				case 3:
					System.out.println("Três palavra");
					model.put("medicos", (buscaService.tresPalavras(buscaPalavra)));
					return resultadoBusca(model);
				case 4:
					System.out.println("Quatro palavra");
					model.put("medicos", (buscaService.quatroPalavras(buscaPalavra)));
					return resultadoBusca(model);
				case 5:
					System.out.println("Cinco palavra");
					model.put("medicos", (buscaService.cincoPalavras(buscaPalavra)));
					return resultadoBusca(model);
				case 6:
					System.out.println("Seis palavra");
					model.put("medicos", (buscaService.seisPalavras(buscaPalavra)));
					return resultadoBusca(model);
				case 7:
					System.out.println("Sete palavra");
					model.put("medicos", (buscaService.setePalavras(buscaPalavra)));
					return resultadoBusca(model);
				case 8:
					System.out.println("Oito palavra");
					model.put("medicos", (buscaService.oitoPalavras(buscaPalavra)));
					return resultadoBusca(model);
				case 9:
					System.out.println("Nove palavra");
					model.put("medicos", (buscaService.novePalavras(buscaPalavra)));
					return resultadoBusca(model);
				case 10:
					System.out.println("Dez palavra");
					model.put("medicos", (buscaService.dezPalavras(buscaPalavra)));
					return resultadoBusca(model);

				default:
					model.put("medicos", (buscaService.dezPalavras(buscaPalavra)));
					return resultadoBusca(model);
				}
			}
		} catch (Exception e) {
			return "Erro";
		}

	}

	private String resultadoBusca(ModelMap model) {
		return "resultado-busca";
	}

}
