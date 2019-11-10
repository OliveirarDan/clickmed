package com.clickmed.controller;

import java.io.IOException;

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

	/**
	 * Método principal de busca, no mesmo é verificado filtro
	 */
	@RequestMapping(value = "/buscaPrincipal", method = { RequestMethod.POST })
	public String buscaPrincipal(ModelMap model, Medico medico, String busca, String especialidade, String bairros) {
		busca = medico.getNome();
		try {
			model.clear();
			String buscaPalavra;
			// Retirando espaço do inicio e do final da palavra
			buscaPalavra = busca.trim();

			if (especialidade != "" && especialidade != null) {
				if (bairros != "" && bairros != null) {
					filtroEspecialidadeEBairro(model, buscaPalavra, especialidade, bairros);
				} else {
					filtroEspecialidade(model, buscaPalavra, especialidade);
				}
			} else if (bairros != "" && bairros != null) {
				filtroBairro(model, buscaPalavra, bairros);
			} else {
				if (buscaPalavra.equals("")) {
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
						model.put("medicos", medicoService.listarNomeMedico(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", medicoService.listarMedicoEspecialidade(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.buscaBairro(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.umaPalavra(buscaPalavra));
						return resultadoBusca(model);
					case 2:
						System.out.println("Duas palavra");
						model.put("medicos", buscaService.duasPalavrasNomeEspecialidade(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.duasPalavrasNomeBairro(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.duasPalavrasEspecialidadeBairro(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.duasPalavras(buscaPalavra));
						return resultadoBusca(model);

					case 3:
						System.out.println("Três palavra");
						model.put("medicos", buscaService.tresPalavrasNomeEspecialidadeBairro(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.tresPalavrasNomeEspecialidade(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.tresPalavrasNomeBairro(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.tresPalavrasBairroEspecialidade(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.tresPalavras(buscaPalavra));
						return resultadoBusca(model);
					case 4:
						System.out.println("Quatro palavra");
						model.put("medicos", buscaService.quatroPalavrasNomeEspecialidadeBairro(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.quatroPalavrasNomeEspecialidade(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.quatroPalavrasNomeBairro(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.quatroPalavrasBairroEspecialidade(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.quatroPalavras(buscaPalavra));
						return resultadoBusca(model);
					case 5:
						System.out.println("Cinco palavra");
						model.put("medicos", buscaService.cincoPalavrasNomeEspecialidadeBairro(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.cincoPalavrasNomeEspecialidade(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.cincoPalavrasNomeBairro(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.cincoPalavrasBairroEspecialidade(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.cincoPalavras(buscaPalavra));
						return resultadoBusca(model);
					case 6:
						System.out.println("Seis palavra");
						model.put("medicos", buscaService.seisPalavrasNomeEspecialidadeBairro(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.seisPalavrasNomeEspecialidade(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.seisPalavrasNomeBairro(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.seisPalavrasBairroEspecialidade(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.seisPalavras(buscaPalavra));
						return resultadoBusca(model);
					case 7:
						System.out.println("Sete palavra");
						model.put("medicos", buscaService.setePalavrasNomeEspecialidadeBairro(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.setePalavrasNomeEspecialidade(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.setePalavrasNomeBairro(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.setePalavrasBairroEspecialidade(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.setePalavras(buscaPalavra));
						return resultadoBusca(model);
					case 8:
						System.out.println("Oito palavra");
						model.put("medicos", buscaService.oitoPalavrasNomeEspecialidadeBairro(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.oitoPalavrasNomeEspecialidade(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.oitoPalavrasNomeBairro(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.oitoPalavrasBairroEspecialidade(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.oitoPalavras(buscaPalavra));
						return resultadoBusca(model);
					case 9:
						System.out.println("Nove palavra");
						model.put("medicos", buscaService.novePalavrasNomeEspecialidadeBairro(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.novePalavrasNomeEspecialidade(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.novePalavrasNomeBairro(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.novePalavrasBairroEspecialidade(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.novePalavras(buscaPalavra));
						return resultadoBusca(model);
					case 10:
						System.out.println("Dez palavra");
						model.put("medicos", buscaService.dezPalavrasNomeEspecialidadeBairro(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.dezPalavrasNomeEspecialidade(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.dezPalavrasNomeBairro(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.dezPalavrasBairroEspecialidade(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.dezPalavras(buscaPalavra));
						return resultadoBusca(model);

					default:
						model.put("medicos", buscaService.dezPalavrasNomeEspecialidadeBairro(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.dezPalavrasNomeEspecialidade(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.dezPalavrasNomeBairro(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.dezPalavrasBairroEspecialidade(buscaPalavra));
						if (model.get("medicos").toString().length() != 2) {
							return resultadoBusca(model);
						}
						model.put("medicos", buscaService.dezPalavras(buscaPalavra));
						return resultadoBusca(model);
					}
				}
			}
		} catch (Exception e) {
			return "Erro";
		}
		return resultadoBusca(model);

	}

	private String filtroBairro(ModelMap model, String busca, String bairros) throws IOException {

		String buscaPalavra = busca + " " + bairros;
		buscaPalavra = buscaPalavra.trim();
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
				model.put("medicos", buscaService.buscaBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.umaPalavra(buscaPalavra));
				return resultadoBusca(model);
			case 2:
				System.out.println("Duas palavra");
				model.put("medicos", buscaService.duasPalavrasNomeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.duasPalavrasEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.duasPalavras(buscaPalavra));
				return resultadoBusca(model);
			case 3:
				System.out.println("Três palavra");
				model.put("medicos", buscaService.tresPalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.tresPalavrasNomeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.tresPalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.tresPalavras(buscaPalavra));
				return resultadoBusca(model);
			case 4:
				System.out.println("Quatro palavra");
				model.put("medicos", buscaService.quatroPalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.quatroPalavrasNomeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.quatroPalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.quatroPalavras(buscaPalavra));
				return resultadoBusca(model);
			case 5:
				System.out.println("Cinco palavra");
				model.put("medicos", buscaService.cincoPalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.cincoPalavrasNomeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.cincoPalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.cincoPalavras(buscaPalavra));
				return resultadoBusca(model);
			case 6:
				System.out.println("Seis palavra");
				model.put("medicos", buscaService.seisPalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.seisPalavrasNomeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.seisPalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.seisPalavras(buscaPalavra));
				return resultadoBusca(model);
			case 7:
				System.out.println("Sete palavra");
				model.put("medicos", buscaService.setePalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.setePalavrasNomeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.setePalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.setePalavras(buscaPalavra));
				return resultadoBusca(model);
			case 8:
				System.out.println("Oito palavra");
				model.put("medicos", buscaService.oitoPalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.oitoPalavrasNomeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.oitoPalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.oitoPalavras(buscaPalavra));
				return resultadoBusca(model);
			case 9:
				System.out.println("Nove palavra");
				model.put("medicos", buscaService.novePalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.novePalavrasNomeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.novePalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.novePalavras(buscaPalavra));
				return resultadoBusca(model);
			default:
				model.put("medicos", buscaService.dezPalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.dezPalavrasNomeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.dezPalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.dezPalavras(buscaPalavra));
				return resultadoBusca(model);
			}
		}
	}

	private String filtroEspecialidade(ModelMap model, String busca, String especialidade) throws IOException {
		String buscaPalavra = busca + " " + especialidade;
		buscaPalavra = buscaPalavra.trim();
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
				model.put("medicos", medicoService.listarMedicoEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.umaPalavra(buscaPalavra));
				return resultadoBusca(model);
			case 2:
				System.out.println("Duas palavra");
				model.put("medicos", buscaService.duasPalavrasNomeEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.duasPalavrasEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.duasPalavras(buscaPalavra));
				return resultadoBusca(model);

			case 3:
				System.out.println("Três palavra");
				model.put("medicos", buscaService.tresPalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.tresPalavrasNomeEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.tresPalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.tresPalavras(buscaPalavra));
				return resultadoBusca(model);
			case 4:
				System.out.println("Quatro palavra");
				model.put("medicos", buscaService.quatroPalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.quatroPalavrasNomeEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.quatroPalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.quatroPalavras(buscaPalavra));
				return resultadoBusca(model);
			case 5:
				System.out.println("Cinco palavra");
				model.put("medicos", buscaService.cincoPalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.cincoPalavrasNomeEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.cincoPalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.cincoPalavras(buscaPalavra));
				return resultadoBusca(model);
			case 6:
				System.out.println("Seis palavra");
				model.put("medicos", buscaService.seisPalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.seisPalavrasNomeEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.seisPalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.seisPalavras(buscaPalavra));
				return resultadoBusca(model);
			case 7:
				System.out.println("Sete palavra");
				model.put("medicos", buscaService.setePalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.setePalavrasNomeEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.setePalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.setePalavras(buscaPalavra));
				return resultadoBusca(model);
			case 8:
				System.out.println("Oito palavra");
				model.put("medicos", buscaService.oitoPalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.oitoPalavrasNomeEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.oitoPalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.oitoPalavras(buscaPalavra));
				return resultadoBusca(model);
			case 9:
				System.out.println("Nove palavra");
				model.put("medicos", buscaService.novePalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.novePalavrasNomeEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.novePalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.novePalavras(buscaPalavra));
				return resultadoBusca(model);
			default:
				model.put("medicos", buscaService.dezPalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.dezPalavrasNomeEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.dezPalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.dezPalavras(buscaPalavra));
				return resultadoBusca(model);
			}
		}

	}

	private String filtroEspecialidadeEBairro(ModelMap model, String busca, String especialidade, String bairros) throws IOException {
		String buscaPalavra = busca + " " + especialidade + " " + bairros;
		buscaPalavra = buscaPalavra.trim();
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
				return resultadoBusca(model);
			case 2:
				System.out.println("Duas palavra");
				model.put("medicos", buscaService.duasPalavrasEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.duasPalavras(buscaPalavra));
				return resultadoBusca(model);

			case 3:
				System.out.println("Três palavra");
				model.put("medicos", buscaService.tresPalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.tresPalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.tresPalavras(buscaPalavra));
				return resultadoBusca(model);
			case 4:
				System.out.println("Quatro palavra");
				model.put("medicos", buscaService.quatroPalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.quatroPalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.quatroPalavras(buscaPalavra));
				return resultadoBusca(model);
			case 5:
				System.out.println("Cinco palavra");
				model.put("medicos", buscaService.cincoPalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.cincoPalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.cincoPalavras(buscaPalavra));
				return resultadoBusca(model);
			case 6:
				System.out.println("Seis palavra");
				model.put("medicos", buscaService.seisPalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.seisPalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.seisPalavras(buscaPalavra));
				return resultadoBusca(model);
			case 7:
				System.out.println("Sete palavra");
				model.put("medicos", buscaService.setePalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.setePalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.setePalavras(buscaPalavra));
				return resultadoBusca(model);
			case 8:
				System.out.println("Oito palavra");
				model.put("medicos", buscaService.oitoPalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.oitoPalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.oitoPalavras(buscaPalavra));
				return resultadoBusca(model);
			case 9:
				System.out.println("Nove palavra");
				model.put("medicos", buscaService.novePalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.novePalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.novePalavras(buscaPalavra));
				return resultadoBusca(model);
			default:
				model.put("medicos", buscaService.dezPalavrasNomeEspecialidadeBairro(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.dezPalavrasBairroEspecialidade(buscaPalavra));
				if (model.get("medicos").toString().length() != 2) {
					return resultadoBusca(model);
				}
				model.put("medicos", buscaService.dezPalavras(buscaPalavra));
				return resultadoBusca(model);
			}
		}
	}

	private String resultadoBusca(ModelMap model) {
		if (model.get("medicos").toString().length() == 2) {
			return "resultado-busca-vazia";
		} else {
			return "resultado-busca";
		}
	}

}
