package com.clickmed.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.clickmed.entity.Medico;
import com.clickmed.entity.Usuario;

@Repository
@Transactional
public interface MedicoDAO extends JpaRepository<Medico, Long>  {
	

	public Medico findMedicoByUsuario(Usuario usuario);
	

	@Query ("SELECT u from Medico u inner join u.especialidades e "
			+ "where e.nome like %:especialidade% or "
			+ "e.outros like %:especialidade%")
	public List<Medico> buscaEspecialidade(String especialidade);

	
	@Query("select u from Medico u where u.nome like :nome% or u.sobrenome like :nome%")
	public List<Medico> buscaPorNome(String nome);
	
	@Query("select u from Medico u where u.nome like %:parte1% or u.sobrenome like %:parte2%" 
			+ " or u.nome like %:parte2% or u.sobrenome like %:parte1%")
	public List<Medico> queryMaisNome(String parte1, String parte2);
	
	@Query("select m from Medico m inner join m.clinicas c "
			+ "where c.bairro like %:buscaPalavra%")
	public List<Medico> buscaBairro(String buscaPalavra);
	
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
			+ "c.bairro like %:buscaPalavra% or "
			+ "c.nomeFantasia like %:buscaPalavra%")
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
			+ "c.bairro like %:parte1% or c.bairro like %:parte2%")
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
			+ "c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3%")
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
			+ "c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4%")
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
			+ "c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5%")
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
			+ "c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6%")
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
			+ "c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6% or c.bairro like %:parte7%")
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
			+ "c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6% or c.bairro like %:parte7% or c.bairro like %:parte8%")
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
			+ "c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6% or c.bairro like %:parte7% or c.bairro like %:parte8% or c.bairro like %:parte9%")
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
			+ "c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6% or c.bairro like %:parte7% or c.bairro like %:parte8% or c.bairro like %:parte9% or c.bairro like %:parte10%")
	public List<Medico> dezPalavras(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6, String parte7, String parte8, String parte9, String parte10);

	/**
	 * Método para busca de nome/sobrenome e especialidade com 2 palavras
	 * @param parte1
	 * @param parte2
	 * @return
	 */
	@Query("select u from Medico u inner join u.especialidades e "
			+ "where ( u.nome like %:parte1% or u.nome like %:parte2% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% ) and "
			+ "( e.outros like %:parte1% or e.outros like %:parte2% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% )")
	public List<Medico> duasPalavrasNomeEspecialidade(String parte1, String parte2);
	
	/**
	 * Método para busca de nome/sobrenome e bairro com 2 palavras
	 * @param parte1
	 * @param parte2
	 * @return
	 */
	@Query("select u from Medico u inner join u.clinicas c "
			+ "where (u.nome like %:parte1% or u.nome like %:parte2% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2%)")
	public List<Medico> duasPalavrasNomeBairro(String parte1, String parte2);
	
	/**
	 * Método para busca de bairro e especialidade com 2 palavras
	 * @param parte1
	 * @param parte2
	 * @return
	 */
	@Query("select u from Medico u inner join u.especialidades e "
			+ "inner join u.clinicas c "
			+ "where (e.outros like %:parte1% or e.outros like %:parte2% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2%)")
	public List<Medico> duasPalavrasEspecialidadeBairro(String parte1, String parte2);

	/**
	 * Método para buscar nome/sobrenome E especialidade E bairro com 3 palavras
	 * @param parte1
	 * @param parte2
	 * @param parte3
	 * @return
	 */
	@Query("select u from Medico u inner join u.especialidades e "
			+ "inner join u.clinicas c "
			+ "where (u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3%) and "
			+ "(e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3%)")
	public List<Medico> tresPalavrasNomeEspecialidadeBairro(String parte1, String parte2, String parte3);

	/**
	 * Método para busca de nome/sobrenome e especialidade com 3 palavras
	 * @param parte1
	 * @param parte2
	 * @param parte3
	 * @return
	 */
	@Query("select u from Medico u inner join u.especialidades e "
			+ "where ( u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% ) and "
			+ "( e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% )")
	public List<Medico> tresPalavrasNomeEspecialidade(String parte1, String parte2, String parte3);

	/**
	 * Método para busca de nome/sobrenome e bairro com 3 palavras
	 * @param parte1
	 * @param parte2
	 * @param parte3
	 * @return
	 */
	@Query("select u from Medico u inner join u.clinicas c "
			+ "where (u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3%)")
	public List<Medico> tresPalavrasNomeBairro(String parte1, String parte2, String parte3);

	/**
	 * Método para busca de bairro e especialidade com 3 palavras
	 * @param parte1
	 * @param parte2
	 * @param parte3
	 * @return
	 */
	@Query("select u from Medico u inner join u.especialidades e "
			+ "inner join u.clinicas c "
			+ "where (e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3%)")
	public List<Medico> tresPalavrasBairroEspecialidade(String parte1, String parte2, String parte3);

	/**
	 * Método para buscar nome/sobrenome E especialidade E bairro com 4 palavras
	 * @param parte1
	 * @param parte2
	 * @param parte3
	 * @param parte4
	 * @return
	 */
	@Query("select u from Medico u inner join u.especialidades e "
			+ "inner join u.clinicas c "
			+ "where (u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or  u.nome like %:parte4% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4%) and "
			+ "(e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4%)")
	public List<Medico> quatroPalavrasNomeEspecialidadeBairro(String parte1, String parte2, String parte3, String parte4);
	
	/////////////////////////////////////
	/**
	 * Método para busca de nome/sobrenome e especialidade com 4 palavras
	 * @param parte1
	 * @param parte2
	 * @param parte3
	 * @param parte4
	 * @return
	 */
	@Query("select u from Medico u inner join u.especialidades e "
			+ "where ( u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% ) and "
			+ "( e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% )")
	public List<Medico> quatroPalavrasNomeEspecialidade(String parte1, String parte2, String parte3, String parte4);
	
	/**
	 * Método para busca de nome/sobrenome e bairro com 4 palavras
	 * @param parte1
	 * @param parte2
	 * @param parte3
	 * @param parte4
	 * @return
	 */
	@Query("select u from Medico u inner join u.clinicas c "
			+ "where (u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4%)")
	public List<Medico> quatroPalavrasNomeBairro(String parte1, String parte2, String parte3, String parte4);
	
	/**
	 * Método para busca de bairro e especialidade com 4 palavras
	 * @param parte1
	 * @param parte2
	 * @param parte3
	 * @param parte4
	 * @return
	 */
	@Query("select u from Medico u inner join u.especialidades e "
			+ "inner join u.clinicas c "
			+ "where (e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4%)")
	public List<Medico> quatroPalavrasBairroEspecialidade(String parte1, String parte2, String parte3, String parte4);
	
	/**
	 * Método para buscar nome/sobrenome E especialidade E bairro com 5 palavras
	 * @param parte1
	 * @param parte2
	 * @param parte3
	 * @param parte4
	 * @param parte5
	 * @return
	 */
	@Query("select u from Medico u inner join u.especialidades e "
			+ "inner join u.clinicas c "
			+ "where (u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5%) and "
			+ "(e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5%)")
	public List<Medico> cincoPalavrasNomeEspecialidadeBairro(String parte1, String parte2, String parte3, String parte4, String parte5);
	
	/**
	 * Método para busca de nome/sobrenome e especialidade com 5 palavras
	 * @param parte1
	 * @param parte2
	 * @param parte3
	 * @param parte4
	 * @return
	 */
	@Query("select u from Medico u inner join u.especialidades e "
			+ "where ( u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5% ) and "
			+ "( e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5% )")
	public List<Medico> cincoPalavrasNomeEspecialidade(String parte1, String parte2, String parte3, String parte4, String  parte5);
	
	/**
	 * Método para busca de nome/sobrenome e bairro com 5 palavras
	 * @param parte1
	 * @param parte2
	 * @param parte3
	 * @param parte4
	 * @param parte5
	 * @return
	 */
	@Query("select u from Medico u inner join u.clinicas c "
			+ "where (u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5%)")
	public List<Medico> cincoPalavrasNomeBairro(String parte1, String parte2, String parte3, String parte4, String parte5);
	
	/**
	 * Método para busca de bairro e especialidade com 5 palavras
	 * @param parte1
	 * @param parte2
	 * @param parte3
	 * @param parte4
	 * @param parte5
	 * @return
	 */
	@Query("select u from Medico u inner join u.especialidades e "
			+ "inner join u.clinicas c "
			+ "where (e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5%)")
	public List<Medico> cincoPalavrasBairroEspecialidade(String parte1, String parte2, String parte3, String parte4, String parte5);
	
	/**
	 * Método para buscar nome/sobrenome E especialidade E bairro com 6 palavras
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
			+ "where (u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or u.nome like %:parte6% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5% or u.sobrenome like %:parte6%) and "
			+ "(e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or e.outros like %:parte6% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5% or e.nome like %:parte6%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6%)")
	public List<Medico> seisPalavrasNomeEspecialidadeBairro(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6);
	
	/**
	 * Método para busca de nome/sobrenome e especialidade com 6 palavras
	 * @param parte1
	 * @param parte2
	 * @param parte3
	 * @param parte4
	 * @param parte5
	 * @param parte6
	 * @return
	 */
	@Query("select u from Medico u inner join u.especialidades e "
			+ "where ( u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or u.nome like %:parte6% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5% or u.sobrenome like %:parte6%) and "
			+ "( e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or e.outros like %:parte6% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5% or e.nome like %:parte6%)")
	public List<Medico> seisPalavrasNomeEspecialidade(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6);
	
	/**
	 * Método para busca de nome/sobrenome e bairro com 6 palavras
	 * @param parte1
	 * @param parte2
	 * @param parte3
	 * @param parte4
	 * @param parte5
	 * @param parte6
	 * @return
	 */
	@Query("select u from Medico u inner join u.clinicas c "
			+ "where (u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or u.nome like %:parte6% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5% or u.sobrenome like %:parte6%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6%)")
	public List<Medico> seisPalavrasNomeBairro(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6);
	
	/**
	 * Método para busca de bairro e especialidade com 6 palavras
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
			+ "where (e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or e.outros like %:parte6% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5% or e.nome like %:parte6%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6%)")
	public List<Medico> seisPalavrasBairroEspecialidade(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6);
	
	/**
	 * Método para buscar nome/sobrenome E especialidade E bairro com 7 palavras
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
			+ "where (u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or u.nome like %:parte6% or u.nome like %:parte7% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5% or u.sobrenome like %:parte6% or u.sobrenome like %:parte7%) and "
			+ "(e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or e.outros like %:parte6% or e.outros like %:parte7% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5% or e.nome like %:parte6% or e.nome like %:parte7%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6% or c.bairro like %:parte7%)")
	public List<Medico> setePalavrasNomeEspecialidadeBairro(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6, String parte7);
	
	/**
	 * Método para busca de nome/sobrenome e especialidade com 7 palavras
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
			+ "where ( u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or u.nome like %:parte6% or u.nome like %:parte7% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5% or u.sobrenome like %:parte6% or u.sobrenome like %:parte7%) and "
			+ "( e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or e.outros like %:parte6% or e.outros like %:parte7% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5% or e.nome like %:parte6% or e.nome like %:parte7%)")
	public List<Medico> setePalavrasNomeEspecialidade(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6, String parte7);
	
	/**
	 * Método para busca de nome/sobrenome e bairro com 7 palavras
	 * @param parte1
	 * @param parte2
	 * @param parte3
	 * @param parte4
	 * @param parte5
	 * @param parte6
	 * @param parte7
	 * @return
	 */
	@Query("select u from Medico u inner join u.clinicas c "
			+ "where (u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or u.nome like %:parte6% or u.nome like %:parte7% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5% or u.sobrenome like %:parte6% or u.sobrenome like %:parte7%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6% or c.bairro like %:parte7%)")
	public List<Medico> setePalavrasNomeBairro(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6, String parte7);
	
	/**
	 * Método para busca de bairro e especialidade com 7 palavras
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
			+ "where (e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or e.outros like %:parte6% or e.outros like %:parte7% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5% or e.nome like %:parte6% or e.nome like %:parte7%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6% or c.bairro like %:parte7%)")
	public List<Medico> setePalavrasBairroEspecialidade(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6, String parte7);
	
	/**
	 * Método para buscar nome/sobrenome E especialidade E bairro com 8 palavras
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
			+ "where (u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or u.nome like %:parte6% or u.nome like %:parte7% or u.nome like %:parte8% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5% or u.sobrenome like %:parte6% or u.sobrenome like %:parte7% or u.sobrenome like %:parte8%) and "
			+ "(e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or e.outros like %:parte6% or e.outros like %:parte7% or e.outros like %:parte8% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5% or e.nome like %:parte6% or e.nome like %:parte7% or e.nome like %:parte8%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6% or c.bairro like %:parte7% or c.bairro like %:parte8%)")
	public List<Medico> oitoPalavrasNomeEspecialidadeBairro(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6, String parte7,String parte8);
	
	/**
	 * Método para busca de nome/sobrenome e especialidade com 8 palavras
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
			+ "where ( u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or u.nome like %:parte6% or u.nome like %:parte7% or u.nome like %:parte8% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5% or u.sobrenome like %:parte6% or u.sobrenome like %:parte7% or u.sobrenome like %:parte8%) and "
			+ "( e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or e.outros like %:parte6% or e.outros like %:parte7% or e.outros like %:parte8% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5% or e.nome like %:parte6% or e.nome like %:parte7% or e.nome like %:parte8%)")
	public List<Medico> oitoPalavrasNomeEspecialidade(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6, String parte7, String parte8);
	
	/**
	 * Método para busca de nome/sobrenome e bairro com 8 palavras
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
	@Query("select u from Medico u inner join u.clinicas c "
			+ "where (u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or u.nome like %:parte6% or u.nome like %:parte7% or u.nome like %:parte8% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5% or u.sobrenome like %:parte6% or u.sobrenome like %:parte7% or u.sobrenome like %:parte8%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6% or c.bairro like %:parte7% or c.bairro like %:parte8%)")
	public List<Medico> oitoPalavrasNomeBairro(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6, String parte7, String parte8);
	
	/**
	 * Método para busca de bairro e especialidade com 8 palavras
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
			+ "where (e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or e.outros like %:parte6% or e.outros like %:parte7% or e.outros like %:parte8% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5% or e.nome like %:parte6% or e.nome like %:parte7% or e.nome like %:parte8%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6% or c.bairro like %:parte7% or c.bairro like %:parte8%)")
	public List<Medico> oitoPalavrasBairroEspecialidade(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6, String parte7, String parte8);
	
	/**
	 * Método para buscar nome/sobrenome E especialidade E bairro com 9 palavras
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
			+ "where (u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or u.nome like %:parte6% or u.nome like %:parte7% or u.nome like %:parte8% or u.nome like %:parte9% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5% or u.sobrenome like %:parte6% or u.sobrenome like %:parte7% or u.sobrenome like %:parte8% or u.sobrenome like %:parte9%) and "
			+ "(e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or e.outros like %:parte6% or e.outros like %:parte7% or e.outros like %:parte8% or e.outros like %:parte9% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5% or e.nome like %:parte6% or e.nome like %:parte7% or e.nome like %:parte8% or e.nome like %:parte9%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6% or c.bairro like %:parte7% or c.bairro like %:parte8% or c.bairro like %:parte9%)")
	public List<Medico> novePalavrasNomeEspecialidadeBairro(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6, String parte7,String parte8, String parte9);
	
	/**
	 * Método para busca de nome/sobrenome e especialidade com 9 palavras
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
			+ "where ( u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or u.nome like %:parte6% or u.nome like %:parte7% or u.nome like %:parte8% or u.nome like %:parte9% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5% or u.sobrenome like %:parte6% or u.sobrenome like %:parte7% or u.sobrenome like %:parte8% or u.sobrenome like %:parte9%) and "
			+ "( e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or e.outros like %:parte6% or e.outros like %:parte7% or e.outros like %:parte8% or e.outros like %:parte9% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5% or e.nome like %:parte6% or e.nome like %:parte7% or e.nome like %:parte8% or e.nome like %:parte9%)")
	public List<Medico> novePalavrasNomeEspecialidade(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6, String parte7, String parte8, String parte9);
	
	/**
	 * Método para busca de nome/sobrenome e bairro com 9 palavras
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
	@Query("select u from Medico u inner join u.clinicas c "
			+ "where (u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or u.nome like %:parte6% or u.nome like %:parte7% or u.nome like %:parte8% or u.nome like %:parte9% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5% or u.sobrenome like %:parte6% or u.sobrenome like %:parte7% or u.sobrenome like %:parte8% or u.sobrenome like %:parte9%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6% or c.bairro like %:parte7% or c.bairro like %:parte8% or c.bairro like %:parte9%)")
	public List<Medico> novePalavrasNomeBairro(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6, String parte7, String parte8, String parte9);
	
	/**
	 * Método para busca de bairro e especialidade com 9 palavras
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
			+ "where (e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or e.outros like %:parte6% or e.outros like %:parte7% or e.outros like %:parte8% or e.outros like %:parte9% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5% or e.nome like %:parte6% or e.nome like %:parte7% or e.nome like %:parte8% or e.nome like %:parte9%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6% or c.bairro like %:parte7% or c.bairro like %:parte8% or c.bairro like %:parte9%)")
	public List<Medico> novePalavrasBairroEspecialidade(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6, String parte7, String parte8, String parte9);
	
	/**
	 * Método para buscar nome/sobrenome E especialidade E bairro com 10 palavras
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
			+ "where (u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or u.nome like %:parte6% or u.nome like %:parte7% or u.nome like %:parte8% or u.nome like %:parte9% or u.nome like %:parte10% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5% or u.sobrenome like %:parte6% or u.sobrenome like %:parte7% or u.sobrenome like %:parte8% or u.sobrenome like %:parte9% or u.sobrenome like %:parte10%) and "
			+ "(e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or e.outros like %:parte6% or e.outros like %:parte7% or e.outros like %:parte8% or e.outros like %:parte9% or e.outros like %:parte10% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5% or e.nome like %:parte6% or e.nome like %:parte7% or e.nome like %:parte8% or e.nome like %:parte9% or e.nome like %:parte10%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6% or c.bairro like %:parte7% or c.bairro like %:parte8% or c.bairro like %:parte9% or c.bairro like %:parte10%)")
	public List<Medico> dezPalavrasNomeEspecialidadeBairro(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6, String parte7,String parte8, String parte9, String parte10);
	
	/**
	 * Método para busca de nome/sobrenome e especialidade com 10 palavras
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
			+ "where ( u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or u.nome like %:parte6% or u.nome like %:parte7% or u.nome like %:parte8% or u.nome like %:parte9% or u.nome like %:parte10% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5% or u.sobrenome like %:parte6% or u.sobrenome like %:parte7% or u.sobrenome like %:parte8% or u.sobrenome like %:parte9% or u.sobrenome like %:parte10%) and "
			+ "( e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or e.outros like %:parte6% or e.outros like %:parte7% or e.outros like %:parte8% or e.outros like %:parte9% or e.outros like %:parte10% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5% or e.nome like %:parte6% or e.nome like %:parte7% or e.nome like %:parte8% or e.nome like %:parte9% or e.nome like %:parte10%)")
	public List<Medico> dezPalavrasNomeEspecialidade(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6, String parte7, String parte8, String parte9, String parte10);
	
	/**
	 * Método para busca de nome/sobrenome e bairro com 10 palavras
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
	@Query("select u from Medico u inner join u.clinicas c "
			+ "where (u.nome like %:parte1% or u.nome like %:parte2% or u.nome like %:parte3% or u.nome like %:parte4% or u.nome like %:parte5% or u.nome like %:parte6% or u.nome like %:parte7% or u.nome like %:parte8% or u.nome like %:parte9% or u.nome like %:parte10% or "
			+ "u.sobrenome like %:parte1% or u.sobrenome like %:parte2% or u.sobrenome like %:parte3% or u.sobrenome like %:parte4% or u.sobrenome like %:parte5% or u.sobrenome like %:parte6% or u.sobrenome like %:parte7% or u.sobrenome like %:parte8% or u.sobrenome like %:parte9% or u.sobrenome like %:parte10%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6% or c.bairro like %:parte7% or c.bairro like %:parte8% or c.bairro like %:parte9% or c.bairro like %:parte10%)")
	public List<Medico> dezPalavrasNomeBairro(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6, String parte7, String parte8, String parte9, String parte10);
	
	/**
	 * Método para busca de bairro e especialidade com 10 palavras
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
			+ "where (e.outros like %:parte1% or e.outros like %:parte2% or e.outros like %:parte3% or e.outros like %:parte4% or e.outros like %:parte5% or e.outros like %:parte6% or e.outros like %:parte7% or e.outros like %:parte8% or e.outros like %:parte9% or e.outros like %:parte10% or "
			+ "e.nome like %:parte1% or e.nome like %:parte2% or e.nome like %:parte3% or e.nome like %:parte4% or e.nome like %:parte5% or e.nome like %:parte6% or e.nome like %:parte7% or e.nome like %:parte8% or e.nome like %:parte9% or e.nome like %:parte10%) and "
			+ "(c.bairro like %:parte1% or c.bairro like %:parte2% or c.bairro like %:parte3% or c.bairro like %:parte4% or c.bairro like %:parte5% or c.bairro like %:parte6% or c.bairro like %:parte7% or c.bairro like %:parte8% or c.bairro like %:parte9% or c.bairro like %:parte10%)")
	public List<Medico> dezPalavrasBairroEspecialidade(String parte1, String parte2, String parte3, String parte4, String parte5, String parte6, String parte7, String parte8, String parte9, String parte10);
}
