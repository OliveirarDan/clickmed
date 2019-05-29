package com.clickmed.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;

import com.clickmed.entity.Usuario;
import com.clickmed.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping("/autenticar")
	public String autenticar(@Valid Usuario usuario, BindingResult bindingResult, Model model, HttpSession session) {

		// Se houverem erros nos campos email e senha
		if (bindingResult.hasFieldErrors("email") || bindingResult.hasFieldErrors("senha")) {
			System.out.println("Autenticando!");
			return "redirect:/";
		}

		// Verifica a autenticação
		//usuario.hashearSenha();
		Usuario usuarioAutenticado = usuarioService.autenticar(usuario);
		//usuarioAutenticado.toString();
		if (usuarioAutenticado == null) {
			bindingResult.addError(new FieldError("usuario", "email", "Email ou senha incorretos"));

			return "redirect:app/pacientes/novoPaciente";
		}
		

		//Aplica o usuário na sessão
		session.setAttribute("usuarioAutenticado", usuarioAutenticado);
		
		//Redireciona para a página inicial
		return "redirect:app";

	}
	
	@PostMapping("/sair")
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:/";
	}

}
