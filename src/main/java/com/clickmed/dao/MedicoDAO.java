package com.clickmed.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.clickmed.entity.Medico;

@Repository
@Transactional
public interface MedicoDAO extends JpaRepository<Medico, Long>  {
	
	@Query ("SELECT u from Medico u inner join u.especialidades e where e.nome like :especial")
	public List<Medico> filtroEspecialidade(String especial);
	
	@Query("select u from Medico u where u.nome like :nome% or u.sobrenome like :nome%")
	public List<Medico> findByNome(String nome);
	
	@Query("select u from Medico u where u.nome like %:parte1% or u.sobrenome like %:parte2%" 
			+ " or u.nome like %:parte2% or u.sobrenome like %:parte1%")
	public List<Medico> queryMaisNome(String parte1, String parte2);

}
