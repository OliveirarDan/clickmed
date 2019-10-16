package com.clickmed.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import com.clickmed.entity.Permissao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.clickmed.dao.PacienteDAO;
import com.clickmed.entity.Paciente;
import com.clickmed.entity.Usuario;

@Service
@Transactional
public class PacienteService {

	@Autowired
	UsuarioService usuarioService;

	private PacienteDAO pacienteDAO;

	@Autowired
	public PacienteService(PacienteDAO pacienteDAO) {
		this.pacienteDAO = pacienteDAO;
	}

	@Bean
	public PasswordEncoder pPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	/**
	 * inserePaciente(Paciente) - Insere paciente 1º Faz o cadastrado na tabela de
	 * usuario e retorna o id de usuário para o paciente.
	 * 
	 * @param paciente
	 * @return Retorna o objeto Paciente completo.
	 * @throws IOException
	 */
	public Paciente inserePaciente(Paciente paciente) throws IOException {
		Usuario nUsuario = paciente.getUsuario();
		nUsuario.setSenha(pPasswordEncoder().encode(nUsuario.getSenha()));
		System.out.println(nUsuario.toString());
		paciente.setUsuario(nUsuario);

		paciente.setUsuario(usuarioService.insereUsuario(nUsuario));
		return this.pacienteDAO.save(paciente);
	}

	/**
	 * Verifica o id recebido, caso já exista um paciente com este id, atualiza.
	 * 
	 * @param paciente
	 * @return paciente atualizado ou null caso não exista.
	 * @throws IOException
	 */
	@Transactional
	public Paciente atualizaPaciente(Paciente paciente) throws IOException {
		if (this.pacienteDAO.existsById(paciente.getId()) == true) {
			return this.pacienteDAO.save(paciente);
		}
		return null;
	}

	/**
	 * Remove um paciente de acordo com o id recebido.
	 * 
	 * @param idPaciente id do paciente a ser excluído.
	 * @throws IOException
	 */
	public void removePaciente(Long idPaciente) throws IOException {
		this.pacienteDAO.deleteById(idPaciente);
	}

	/**
	 * Busca um paciente pelo ID
	 * 
	 * @param idPaciente
	 * @return Um objeto Paciente.
	 */
	public Paciente buscaPaciente(Long idPaciente) {
		return this.pacienteDAO.getOne(idPaciente);
	}

	/**
	 * Lista todos os pacientes cadastrados.
	 * 
	 * @return List<Paciente>
	 */
	public List<Paciente> listaPacientes() {
		return this.pacienteDAO.findAll();
	}

	public Paciente buscaPacientePorUsuario(Usuario usuario) {
		return pacienteDAO.findPacienteByUsuario(usuario);
	}
	
}
