 	package com.clickmed.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;

import com.clickmed.entity.Medico;
import com.clickmed.entity.Paciente;
import com.clickmed.entity.Usuario;
import com.clickmed.service.MedicoService;
import com.clickmed.service.PacienteService;
import com.clickmed.service.UsuarioService;

@Controller
@Transactional
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private MedicoService medicoService;

	@Autowired
	private PacienteService pacienteService;

	@PostMapping("/autenticar")
	public String autenticar(@Valid Usuario usuario, BindingResult bindingResult, ModelMap model, HttpSession session, Paciente paciente) {

//		// Se houverem erros nos campos email e senha
//		if (bindingResult.hasFieldErrors("email") || bindingResult.hasFieldErrors("senha")) {
//			System.out.println("Autenticando!");
//			return "redirect:errou";
//		}

		//Criando médico
		Medico medicoAutenticado = null;
		
		//Criando paciente
		Paciente pacienteAutenticado = null;
		
		// Verifica a autenticação
		//usuario.hashearSenha();
		Usuario usuarioAutenticado = usuarioService.autenticar(usuario);
		//usuarioAutenticado.toString();
		if (usuarioAutenticado == null) {
			bindingResult.addError(new FieldError("usuario", "email", "Email ou senha incorretos"));
			model.addAttribute("mensagemDoSistema", "Login falhou, tente de novo");
			return "/error";
		}
		
		
		//Aplica o usuário na sessão
		session.setAttribute("usuarioAutenticado", usuarioAutenticado);
		System.out.println("usuario autenticado" + usuarioAutenticado.toString());

		//Verifica se o usário é medico ou paciente
		if (usuarioAutenticado.getPermissao().equals("medico")) {
			System.out.println("É médico");
			medicoAutenticado = medicoService.buscaMedicoPorUsuario(usuarioAutenticado);
			model.addAttribute("medico", medicoAutenticado);
			session.setAttribute("medico", medicoAutenticado);
			return "redirect:/infosMedico";
		}
		if (usuarioAutenticado.getPermissao().equals("paciente")) {
			System.out.println("É paciente");
			pacienteAutenticado = pacienteService.buscaPacientePorUsuario(usuarioAutenticado);
			model.addAttribute("paciente", pacienteAutenticado);
			session.setAttribute("paciente", pacienteAutenticado);
			return "redirect:/";
		}

		//Redireciona para a página inicial
		return "/error";

	}

	@PostMapping("/sair")
	public String logout(HttpSession session) {
		session.invalidate();

		return "redirect:/";
	}
	
	@PostMapping("/editar")
	public String editar(ModelMap model, HttpSession session, Usuario usuario, Paciente paciente) {
		usuario = (Usuario) session.getAttribute("usuarioAutenticado");
		System.out.println(usuario.toString());
		if (usuario.getPermissao().equals("medico")) {
			return "redirect:/selecionaMedico";
		}
		if (usuario.getPermissao().equals("paciente")) {
			paciente = pacienteService.buscaPacientePorUsuario(usuario);
			System.out.println(pacienteService.buscaPacientePorUsuario(usuario));
			return "redirect:/selecionaPaciente";
		}
		model.addAttribute("mensagemDoSistema", "Algo de errado aconteceu, tente novamente!");
		
		return "error";
	}

}
