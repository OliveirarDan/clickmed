package com.clickmed.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clickmed.entity.Medico;

@Repository
@Transactional
public interface MedicoDAO extends JpaRepository<Medico, Long>  {

}
