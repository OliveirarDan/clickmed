package com.clickmed.dao;

import com.clickmed.entity.Especialidade;
import com.clickmed.entity.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface PermissaoDAO extends JpaRepository<Permissao, Long> {

}
