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

	//Para criar query, quando preciso
	@Query("select u from Medico u where u.nome like %:nome%")
	public List<Medico> findByNome(String nome);
}
