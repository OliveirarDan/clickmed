package com.clickmed.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clickmed.entity.Convenio;

@Repository
@Transactional
public interface ConvenioDAO extends JpaRepository<Convenio, Long> {

}
