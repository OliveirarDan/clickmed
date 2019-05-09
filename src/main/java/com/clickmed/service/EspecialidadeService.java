package com.clickmed.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickmed.dao.EspecialidadeDAO;
import com.clickmed.entity.Especialidade;

@Service
@Transactional
public class EspecialidadeService {

	private EspecialidadeDAO especialidadeDAO;

	@Autowired
	public EspecialidadeService(EspecialidadeDAO especialidadeDAO) {
		this.especialidadeDAO = especialidadeDAO;
	}
	
	
	/**
	 * Insere Especialidade
	 * @param especialidade
	 * @return o objeto especialidade cadastrado
	 * @throws IOException
	 */
	@Transactional
	public Especialidade insereEspecialidade(Especialidade especialidade) {
		return this.especialidadeDAO.save(especialidade);
	}
	
	
	/**
	 * Verifica o id recebido, casa ja exista uma especialidade com este id, atualiza.
	 * 
	 * @param especialidade
	 * @return especialidade atualizada ou null caso não exista.
	 * @throws IOException
	 */
	@Transactional
	public Especialidade atualizaEspecialidade(Especialidade especialidade) throws IOException{
		if(this.especialidadeDAO.existsById(especialidade.getId()) == true) {
			return this.especialidadeDAO.save(especialidade);
		}
		return null;
	}
	
	
	/**
	 * Remove uma especialidade com o id recebido.
	 * @param idEspecialidade
	 * @throws IOException
	 */
	@Transactional
	public void removeEspecialidade(Long idEspecialidade) throws IOException{
		this.especialidadeDAO.deleteById(idEspecialidade);
	}
	
	
	/**
	 * Busca uma especialidade pelo id.
	 * @param idEspecialidade
	 * @return especialidade
	 */
	public Especialidade buscaEspecialidade(Long idEspecialidade) throws IOException {
		return this.especialidadeDAO.getOne(idEspecialidade);
	}
	
	/**
	 * Lista todas as especialidade cadastradas.
	 * 
	 * @return Lista de especialidades.
	 */
	public List<Especialidade> listaEspecialidades(){
		return this.especialidadeDAO.findAll();
	}
	
	
	
	
	
	
	
}
