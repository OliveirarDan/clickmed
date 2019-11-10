package com.clickmed.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;

import com.clickmed.entity.Medico;
import com.clickmed.entity.Paciente;
import com.clickmed.entity.Permissao;
import com.clickmed.entity.Usuario;
import com.clickmed.service.MedicoService;
import com.clickmed.service.PacienteService;
import com.clickmed.service.PermissaoService;
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
	
	@Autowired
	private PermissaoService permissaoService;
	
	
	

	@PostMapping("/autenticar")
	public String autenticar(@Valid Usuario usuario, BindingResult bindingResult, ModelMap model, HttpSession session,
			Paciente paciente) throws Exception {
	
		
		Medico medicoAutenticado = null;
		Paciente pacienteAutenticado = null;

		System.out.println(usuario);

		Usuario usuarioAutenticado = usuarioService.autenticar(usuario);
		if (usuarioAutenticado == null) {
			bindingResult.addError(new FieldError("usuario", "email", "Email ou senha incorretos"));
			model.addAttribute("mensagemDoSistema", "Login falhou, tente de novo");
			return "/error";
		}

		// Aplica o usuário na sessão
		session.setAttribute("usuarioAutenticado", usuarioAutenticado);
		System.out.println("usuario autenticado" + usuarioAutenticado.toString());
		
		//Criando permissões para comparação do tipo de usuario
		Permissao pMedico = permissaoService.buscaPermissao((long)1);
		Permissao pPaciente = permissaoService.buscaPermissao((long)2);
		//Permissao pAdm = permissaoService.buscaPermissao((long)3);
		
		
		
		// Verifica se o usuário é medico
		if (usuarioAutenticado.getPermissao().get(0) == pMedico) {
			System.out.println("É médico");
			medicoAutenticado = medicoService.buscaMedicoPorUsuario(usuarioAutenticado);
			model.addAttribute("medico", medicoAutenticado);
			session.setAttribute("medico", medicoAutenticado);
			System.out.println("Logou como médico!");
			return "/listaAvaliacoesDoMedico";
		}
		
		// Verifica se o usuário é paciente
		if (usuarioAutenticado.getPermissao().get(0) == pPaciente) {
			System.out.println("É paciente");
			pacienteAutenticado = pacienteService.buscaPacientePorUsuario(usuarioAutenticado);
			model.addAttribute("paciente", pacienteAutenticado);
			session.setAttribute("paciente", pacienteAutenticado);
			System.out.println("Logou como paciente!");
			
			return "redirect:/";
		}
		
		return "/";

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
			return "redirect:/selecionaEditaMedico";
		}
		if (usuario.getPermissao().equals("paciente")) {
			paciente = pacienteService.buscaPacientePorUsuario(usuario);
			System.out.println(pacienteService.buscaPacientePorUsuario(usuario));
			return "redirect:/selecionaPaciente";
		}
		model.addAttribute("mensagemDoSistema", "Algo de errado aconteceu, tente novamente!");

		return "/error";
	}

}
