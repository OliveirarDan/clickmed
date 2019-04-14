package com.clickmed.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickmed.dao.PacienteDAO;
import com.clickmed.dao.UsuarioDAO;
import com.clickmed.entity.Paciente;

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

	/**
	 * inserePaciente(Paciente) - Insere paciente
	 * 1º Faz o cadastrado na tabela de usuario e retorna o id de usuário para o paciente.
	 * @param paciente
	 * @return Retorna o objeto Paciente completo. 
	 * @throws IOException
	 */
	public Paciente inserePaciente(Paciente paciente) throws IOException {
		paciente.setUsuario(usuarioService.insereUsuario(paciente.getUsuario()));
		this.pacienteDAO.save(paciente);
		return paciente;
	}

	/**
	 * Compara o id recebido, caso já exista um paciente com este id, atualiza. 
	 * @param paciente 
	 * @return paciente atualizado.
	 * @throws IOException
	 */
	@Transactional
	public Paciente atualizaPaciente(Paciente paciente) throws IOException {
		if (this.pacienteDAO.existsById(paciente.getId()) == true) {
			this.pacienteDAO.save(paciente);
			return paciente;
		}
		return null;
	}

	/**
	 * Remove um paciente de acordo com o id.
	 * @param idPaciente id do paciente a ser excluído.
	 * @throws IOException
	 */
	@Transactional
	public void removePaciente(Long idPaciente) throws IOException {
		this.pacienteDAO.deleteById(idPaciente);
	}

	
	/**
	 * Busca um paciente pelo ID
	 * @param idPaciente
	 * @return Um objeto Paciente.
	 */
	public Paciente buscaPaciente(Long idPaciente) {
		return this.pacienteDAO.getOne(idPaciente);
	}
	
	/**
	 * Lista todos os pacientes cadastrados
	 * @return List<Paciente> 
	 */
	public List<Paciente> listaPacientes() {
		
		return pacienteDAO.findAll();
	}

}
