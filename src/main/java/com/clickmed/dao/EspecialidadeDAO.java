package com.clickmed.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clickmed.entity.Especialidade;

@Repository
@Transactional
public interface EspecialidadeDAO extends JpaRepository<Especialidade, Long> {

}
