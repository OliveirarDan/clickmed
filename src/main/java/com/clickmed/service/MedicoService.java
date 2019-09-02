package com.clickmed.service;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import com.clickmed.entity.Permissao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickmed.dao.MedicoDAO;
import com.clickmed.entity.Medico;
import com.clickmed.entity.Usuario;

@Service
@Transactional
public class MedicoService {

	@Autowired
	UsuarioService usuarioService;

	private MedicoDAO medicoDAO;

	private String variavelAuxNome;

	@Autowired
	public MedicoService(MedicoDAO medicoDAO) {
		this.medicoDAO = medicoDAO;
	}

	/**
	 * @param medico
	 * @return medico
	 * @throws IOException
	 */
	public Medico insereMedico(Medico medico) throws IOException {
		Usuario nUsuario = medico.getUsuario();

		// Instancia a permissao de medico
		System.out.println(nUsuario.toString());
		medico.setUsuario(nUsuario);
		// Cadastra o usuario e retorna o ID
		medico.setUsuario(usuarioService.insereUsuario(medico.getUsuario()));
		return this.medicoDAO.save(medico);
	}

	/**
	 * @param medico
	 * @return medico atualizado ou null caso não exista
	 * @throws IOException
	 */
	public Medico atualizaMedico(Medico medico) throws IOException {
		if (this.medicoDAO.existsById(medico.getId()) == true) {
			// Atualiza os dados de usuário
			System.out.println("Service: " + medico.toString());
			usuarioService.atualizaUsuario(medico.getUsuario());
			return this.medicoDAO.save(medico);
		}
		return null;
	}

	/**
	 * @param idMedico
	 * @throws IOException
	 */
	public void removeMedico(Long idMedico) throws IOException {
		this.medicoDAO.deleteById(idMedico);
	}

	/**
	 * busca um médico pelo id
	 * 
	 * @param idMedico
	 * @return Um objetotipo Medico
	 */
	public Medico buscaMedico(Long idMedico) {
		return this.medicoDAO.getOne(idMedico);
	}

	/**
	 * Lista todos os médicos cadastrados.
	 * 
	 * @return List<Medico>
	 */
	public List<Medico> listaMedicos() {
		return this.medicoDAO.findAll();
	}

	public List<Medico> listarMedicoEspecialidade(String especialidade) {
		return medicoDAO.buscaEspecialidade(especialidade);
	}

	public List<Medico> listarNomeMedico2(String nome) throws IOException {
		String[] partesDoNome = nome.split(" ");
		String parte1 = partesDoNome[0];
		String parte2 = partesDoNome[1];

		System.out.println("AGORA VAI - nome: " + parte1 + " sobrenome: " + parte2);

		if (parte2 == "") {
			// parte1 = variavelAuxNome;
			System.out.println(parte1);
			return listarNomeMedicos();
		} else {
			return medicoDAO.queryMaisNome(parte1, parte2);
		}
	}

	public List<Medico> listarNomeMedicos() throws IOException {
		return medicoDAO.buscaPorNome(variavelAuxNome);
	}

	public List<Medico> listarNomeMedico(String nome) throws IOException {
		return medicoDAO.buscaPorNome(nome);
	}

	public String listarNomeMedicoString(String nomeSemEspaco) throws IOException {
		if (nomeSemEspaco.contains(" ")) {
			listarNomeMedico2(nomeSemEspaco);
		} else {
			listarNomeMedico(nomeSemEspaco);
		}
		return null;
	}

	public Medico buscaMedicoPorUsuario(Usuario usuario) {
		return medicoDAO.findMedicoByUsuario(usuario);
	}
	
	
}
