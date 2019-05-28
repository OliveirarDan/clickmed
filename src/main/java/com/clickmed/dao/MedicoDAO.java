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
	
	/**
	 * Metodo para buscar uma palavra nas tabelas
	 * @param buscaPalavra
	 * @return
	 */
	@Query("select u from Medico u inner join u.especialidades e inner join u.clinicas c "
			+ "where u.nome like %:buscaPalavra% or "
			+ "u.sobrenome like %:buscaPalavra% or "
			+ "e.outros like %:buscaPalavra% or "
			+ "e.nome like %:buscaPalavra% or "
			+ "c.cidade like %:buscaPalavra% or "
			+ "c.estado like %:buscaPalavra% or "
			+ "c.bairro like %:buscaPalavra% or "
			+ "c.nomeFantasia like %:buscaPalavra% "
			+ "")
	public List<Medico> umaPalavra(String buscaPalavra);
	
	/**
	 * Metodo para buscar duas palavras nas tabelas
	 * @param parte1
	 * @param parte2
	 * @return
	 */
	@Query("select u from Medico u inner join u.especialidades e "
			+ "inner join u.clinicas c "
			+ "where u.nome like %:parte1% or u.nome like %:parte2% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or "
			+ "e.outros like %:parte1% or e.outros like %:parte2% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or "
			+ "c.cidade like %:parte1% or c.cidade like %:parte2% or "
			+ "c.estado like %:parte1% or c.estado like %:parte2% or "
			+ "c.bairro like %:parte1% or c.bairro like %:parte2% or "
			+ "c.nomeFantasia like %:parte1% or c.nomeFantasia like %:parte2% "
			+ "order by e.outros ")
	public List<Medico> duasPalavras(String parte1, String parte2);
	
    /**
     * Metodo para buscar tres palavras nas tabelas
     * @param parte1
     * @param parte2
     * @param parte3
     * @return
     */
	@Query("select u from Medico u inner join u.especialidades e "
			+ "inner join u.clinicas c "
			+ "where u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or "
			+ "e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or "
			+ "c.cidade like %:parte1% or c.cidade like %:parte2% or c.cidade like %:parte3% or "
			+ "c.estado like %:parte1% or c.estado like %:parte2% or c.estado like %:parte3% or "
			+ "c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or "
			+ "c.nomeFantasia like %:parte1% or c.nomeFantasia like %:parte2% or c.nomeFantasia like %:parte3%")
	public List<Medico> tresPalavras(String parte1, String parte2, String parte3);
	
	/**
	 * Metodo para buscar quatro palavras nas tabelas
	 * @param parte1
	 * @param parte2
	 * @param parte3
	 * @param parte4
	 * @return
	 */
	@Query("select u from Medico u inner join u.especialidades e "
			+ "inner join u.clinicas c "
			+ "where u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or "
			+ "e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or "
			+ "c.cidade like %:parte1% or c.cidade like %:parte2% or c.cidade like %:parte3% or c.cidade like %:parte4% or "
			+ "c.estado like %:parte1% or c.estado like %:parte2% or c.estado like %:parte3% or c.estado like %:parte4% or "
			+ "c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or "
			+ "c.nomeFantasia like %:parte1% or c.nomeFantasia like %:parte2% or c.nomeFantasia like %:parte3% or c.nomeFantasia like %:parte4%")
	public List<Medico> quatroPalavras(String parte1, String parte2, String parte3, String parte4);
	
	/**
	 * Metodo para buscar cinco palavras nas tabelas
	 * @param parte1
	 * @param parte2
	 * @param parte3
	 * @param parte4
	 * @param parte5
	 * @return
	 */
	@Query("select u from Medico u inner join u.especialidades e "
			+ "inner join u.clinicas c "
			+ "where u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5% or "
			+ "e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5% or "
			+ "c.cidade like %:parte1% or c.cidade like %:parte2% or c.cidade like %:parte3% or c.cidade like %:parte4% or c.cidade like %:parte5% or "
			+ "c.estado like %:parte1% or c.estado like %:parte2% or c.estado like %:parte3% or c.estado like %:parte4% or c.estado like %:parte5% or "
			+ "c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or "
			+ "c.nomeFantasia like %:parte1% or c.nomeFantasia like %:parte2% or c.nomeFantasia like %:parte3% or c.nomeFantasia like %:parte4% or c.nomeFantasia like %:parte5%")
	public List<Medico> cincoPalavras(String parte1, String parte2, String parte3, String parte4, String parte5);
	
	/**
	 * Metodo para buscar seis palavras nas tabelas
	 * @param parte1
	 * @param parte2
	 * @param parte3
	 * @param parte4
	 * @param parte5
	 * @param parte6
	 * @return
	 */
	@Query("select u from Medico u inner join u.especialidades e "
			+ "inner join u.clinicas c "
			+ "where u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or u.nome like %:parte6% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5% or u.sobrenome like %:parte6% or "
			+ "e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or e.outros like %:parte6% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5% or e.nome like %:parte6% or "
			+ "c.cidade like %:parte1% or c.cidade like %:parte2% or c.cidade like %:parte3% or c.cidade like %:parte4% or c.cidade like %:parte5% or c.cidade like %:parte6% or "
			+ "c.estado like %:parte1% or c.estado like %:parte2% or c.estado like %:parte3% or c.estado like %:parte4% or c.estado like %:parte5% or c.estado like %:parte6% or "
			+ "c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6% or "
			+ "c.nomeFantasia like %:parte1% or c.nomeFantasia like %:parte2% or c.nomeFantasia like %:parte3% or c.nomeFantasia like %:parte4% or c.nomeFantasia like %:parte5% or c.nomeFantasia like %:parte6%")
	public List<Medico> seisPalavras(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6);
	
	/**
	 * Metodo para buscar sete palavras nas tabelas
	 * @param parte1
	 * @param parte2
	 * @param parte3
	 * @param parte4
	 * @param parte5
	 * @param parte6
	 * @param parte7
	 * @return
	 */
	@Query("select u from Medico u inner join u.especialidades e "
			+ "inner join u.clinicas c "
			+ "where u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or u.nome like %:parte6% or u.nome like %:parte7% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5% or u.sobrenome like %:parte6% or u.sobrenome like %:parte7% or "
			+ "e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or e.outros like %:parte6% or e.outros like %:parte7% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5% or e.nome like %:parte6% or e.nome like %:parte7% or "
			+ "c.cidade like %:parte1% or c.cidade like %:parte2% or c.cidade like %:parte3% or c.cidade like %:parte4% or c.cidade like %:parte5% or c.cidade like %:parte6% or c.cidade like %:parte7% or "
			+ "c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6% or c.bairro like %:parte7% or "
			+ "c.estado like %:parte1% or c.estado like %:parte2% or c.estado like %:parte3% or c.estado like %:parte4% or c.estado like %:parte5% or c.estado like %:parte6% or c.estado like %:parte7% or "
			+ "c.nomeFantasia like %:parte1% or c.nomeFantasia like %:parte2% or c.nomeFantasia like %:parte3% or c.nomeFantasia like %:parte4% or c.nomeFantasia like %:parte5% or c.nomeFantasia like %:parte6% or c.nomeFantasia like %:parte7%")
	public List<Medico> setePalavras(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6, String parte7);
	
	/**
	 * Metodo para buscar oito palavras nas tabelas
	 * @param parte1
	 * @param parte2
	 * @param parte3
	 * @param parte4
	 * @param parte5
	 * @param parte6
	 * @param parte7
	 * @param parte8
	 * @return
	 */
	@Query("select u from Medico u inner join u.especialidades e "
			+ "inner join u.clinicas c "
			+ "where u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or u.nome like %:parte6% or u.nome like %:parte7% or u.nome like %:parte8% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5% or u.sobrenome like %:parte6% or u.sobrenome like %:parte7% or u.sobrenome like %:parte8% or "
			+ "e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or e.outros like %:parte6% or e.outros like %:parte7% or e.outros like %:parte8% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5% or e.nome like %:parte6% or e.nome like %:parte7% or e.nome like %:parte8% or "
			+ "c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6% or c.bairro like %:parte7% or c.bairro like %:parte8% or "
			+ "c.cidade like %:parte1% or c.cidade like %:parte2% or c.cidade like %:parte3% or c.cidade like %:parte4% or c.cidade like %:parte5% or c.cidade like %:parte6% or c.cidade like %:parte7% or c.cidade like %:parte8% or "
			+ "c.estado like %:parte1% or c.estado like %:parte2% or c.estado like %:parte3% or c.estado like %:parte4% or c.estado like %:parte5% or c.estado like %:parte6% or c.estado like %:parte7% or c.estado like %:parte8% or "
			+ "c.nomeFantasia like %:parte1% or c.nomeFantasia like %:parte2% or c.nomeFantasia like %:parte3% or c.nomeFantasia like %:parte4% or c.nomeFantasia like %:parte5% or c.nomeFantasia like %:parte6% or c.nomeFantasia like %:parte7% or c.nomeFantasia like %:parte8%")
	public List<Medico> oitoPalavras(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6, String parte7, String parte8);
	
	/**
	 * Metodo para buscar nove palavras nas tabelas
	 * @param parte1
	 * @param parte2
	 * @param parte3
	 * @param parte4
	 * @param parte5
	 * @param parte6
	 * @param parte7
	 * @param parte8
	 * @param parte9
	 * @return
	 */
	@Query("select u from Medico u inner join u.especialidades e "
			+ "inner join u.clinicas c "
			+ "where u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or u.nome like %:parte6% or u.nome like %:parte7% or u.nome like %:parte8% or u.nome like %:parte9% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5% or u.sobrenome like %:parte6% or u.sobrenome like %:parte7% or u.sobrenome like %:parte8% or u.sobrenome like %:parte9% or "
			+ "e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or e.outros like %:parte6% or e.outros like %:parte7% or e.outros like %:parte8% or e.outros like %:parte9% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5% or e.nome like %:parte6% or e.nome like %:parte7% or e.nome like %:parte8% or e.nome like %:parte9% or "
			+ "c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6% or c.bairro like %:parte7% or c.bairro like %:parte8% or c.bairro like %:parte9% or "
			+ "c.cidade like %:parte1% or c.cidade like %:parte2% or c.cidade like %:parte3% or c.cidade like %:parte4% or c.cidade like %:parte5% or c.cidade like %:parte6% or c.cidade like %:parte7% or c.cidade like %:parte8% or c.cidade like %:parte9% or "
			+ "c.estado like %:parte1% or c.estado like %:parte2% or c.estado like %:parte3% or c.estado like %:parte4% or c.estado like %:parte5% or c.estado like %:parte6% or c.estado like %:parte7% or c.estado like %:parte8% or c.estado like %:parte9% or "
			+ "c.nomeFantasia like %:parte1% or c.nomeFantasia like %:parte2% or c.nomeFantasia like %:parte3% or c.nomeFantasia like %:parte4% or c.nomeFantasia like %:parte5% or c.nomeFantasia like %:parte6% or c.nomeFantasia like %:parte7% or c.nomeFantasia like %:parte8% or c.nomeFantasia like %:parte9%")
	public List<Medico> novePalavras(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6, String parte7, String parte8, String parte9);
	
	/**
	 * Metodo para buscar dez palavras nas tabelas
	 * @param parte1
	 * @param parte2
	 * @param parte3
	 * @param parte4
	 * @param parte5
	 * @param parte6
	 * @param parte7
	 * @param parte8
	 * @param parte9
	 * @param parte10
	 * @return
	 */
	@Query("select u from Medico u inner join u.especialidades e "
			+ "inner join u.clinicas c "
			+ "where u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or u.nome like %:parte6% or u.nome like %:parte7% or u.nome like %:parte8% or u.nome like %:parte9% or u.nome like %:parte10% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5% or u.sobrenome like %:parte6% or u.sobrenome like %:parte7% or u.sobrenome like %:parte8% or u.sobrenome like %:parte9% or u.sobrenome like %:parte10% or "
			+ "e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or e.outros like %:parte6% or e.outros like %:parte7% or e.outros like %:parte8% or e.outros like %:parte9% or e.outros like %:parte10% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5% or e.nome like %:parte6% or e.nome like %:parte7% or e.nome like %:parte8% or e.nome like %:parte9% or e.nome like %:parte10% or "
			+ "c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6% or c.bairro like %:parte7% or c.bairro like %:parte8% or c.bairro like %:parte9% or c.bairro like %:parte10% or "
			+ "c.cidade like %:parte1% or c.cidade like %:parte2% or c.cidade like %:parte3% or c.cidade like %:parte4% or c.cidade like %:parte5% or c.cidade like %:parte6% or c.cidade like %:parte7% or c.cidade like %:parte8% or c.cidade like %:parte9% or c.cidade like %:parte10% or "
			+ "c.estado like %:parte1% or c.estado like %:parte2% or c.estado like %:parte3% or c.estado like %:parte4% or c.estado like %:parte5% or c.estado like %:parte6% or c.estado like %:parte7% or c.estado like %:parte8% or c.estado like %:parte9% or c.estado like %:parte10% or "
			+ "c.nomeFantasia like %:parte1% or c.nomeFantasia like %:parte2% or c.nomeFantasia like %:parte3% or c.nomeFantasia like %:parte4% or c.nomeFantasia like %:parte5% or c.nomeFantasia like %:parte6% or c.nomeFantasia like %:parte7% or c.nomeFantasia like %:parte8% or c.nomeFantasia like %:parte9% or c.nomeFantasia like %:parte10%")
	public List<Medico> dezPalavras(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6, String parte7, String parte8, String parte9, String parte10);


}
