package com.clickmed.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickmed.dao.MedicoDAO;
import com.clickmed.entity.Medico;

@Service
@Transactional
public class BuscaService {

	private MedicoDAO medicoDAO;
	
	@Autowired
	public BuscaService(MedicoDAO medicoDAO) {
		this.medicoDAO = medicoDAO;
	}
	
	/**
	 * Metodo para buscar uma palavra nas tabelas
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> umaPalavra(String buscaPalavra) throws IOException {
		return medicoDAO.umaPalavra(buscaPalavra);
	}

	/**
	 * Metodo para buscar duas palavras nas tabelas
	 * @param parte1
	 * @param parte2
	 * @return
	 */
	public List<Medico> duasPalavras(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1 = partesDoNome[0];
		String parte2 = partesDoNome[1];
		System.out.println(parte1 + parte2);
		return medicoDAO.duasPalavras(parte1, parte2);
	}

	/**
	 * Metodo para buscar tres palavras nas tabelas
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> tresPalavras(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1 = partesDoNome[0];
		String parte2 = partesDoNome[1];
		String parte3 = partesDoNome[2];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3);
		return medicoDAO.tresPalavras(parte1, parte2, parte3);
	}
	
	/**
	 * Metodo para buscar quatro palavras nas tabelas
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> quatroPalavras(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4);
		return medicoDAO.quatroPalavras(parte1, parte2, parte3, parte4);
	}
	
	/**
	 * Metodo para buscar cinco palavras nas tabelas
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> cincoPalavras(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5);
		return medicoDAO.cincoPalavras(parte1, parte2, parte3, parte4, parte5);
	}
	
	/**
	 * Metodo para buscar seis palavras nas tabelas
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> seisPalavras(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6);
		return medicoDAO.seisPalavras(parte1, parte2, parte3, parte4, parte5, parte6);
	}
	
	/**
	 * Metodo para buscar sete palavras nas tabelas
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> setePalavras(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		String parte7  = partesDoNome[6];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6 +"/"+ parte7);
		return medicoDAO.setePalavras(parte1, parte2, parte3, parte4, parte5, parte6, parte7);
	}
	
	/**
	 * Metodo para buscar oito palavras nas tabelas
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> oitoPalavras(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		String parte7  = partesDoNome[6];
		String parte8  = partesDoNome[7];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6 +"/"+ parte7 + "/" + parte8);
		return medicoDAO.oitoPalavras(parte1, parte2, parte3, parte4, parte5, parte6, parte7, parte8);
	}
	
	/**
	 * Metodo para buscar nove palavras nas tabelas
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> novePalavras(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		String parte7  = partesDoNome[6];
		String parte8  = partesDoNome[7];
		String parte9  = partesDoNome[8];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6 +"/"+ parte7 + "/" + parte8 +"/"+ parte9);
		return medicoDAO.novePalavras(parte1, parte2, parte3, parte4, parte5, parte6, parte7, parte8, parte9);
	}
	
	/**
	 * Metodo para buscar dez palavras nas tabelas
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> dezPalavras(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		String parte7  = partesDoNome[6];
		String parte8  = partesDoNome[7];
		String parte9  = partesDoNome[8];
		String parte10 = partesDoNome[9];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6 +"/"+ parte7 + "/" + parte8 +"/"+ parte9);
		return medicoDAO.dezPalavras(parte1, parte2, parte3, parte4, parte5, parte6, parte7, parte8, parte9, parte10);
	}
	
	/**
	 * Método para buscar bairro
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> buscaBairro(String buscaPalavra) {
		return medicoDAO.buscaBairro(buscaPalavra);
	}
	
	/**
	 * Método para busca de nome/sobrenome e especialidade com 2 palavras
	 * @param buscaPalavra
	 * @return
	 */
	
	public List<Medico> duasPalavrasNomeEspecialidade(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1 = partesDoNome[0];
		String parte2 = partesDoNome[1];
		System.out.println(parte1 + parte2);
		return medicoDAO.duasPalavrasNomeEspecialidade(parte1, parte2);
	}
	
	/**
	 * Método para busca de nome/sobrenome e bairro com 2 palavras
	 * @param buscaPalavra
	 * @return
	 */
	
	public List<Medico> duasPalavrasNomeBairro(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1 = partesDoNome[0];
		String parte2 = partesDoNome[1];
		System.out.println(parte1 + parte2);
		return medicoDAO.duasPalavrasNomeBairro(parte1, parte2);
	}
	
	/**
	 * Método para busca de nome/sobrenome e bairro com 2 palavras
	 * @param buscaPalavra
	 * @return
	 */
	
	public List<Medico> duasPalavrasEspecialidadeBairro(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1 = partesDoNome[0];
		String parte2 = partesDoNome[1];
		System.out.println(parte1 + parte2);
		return medicoDAO.duasPalavrasEspecialidadeBairro(parte1, parte2);
	}

	/**
	 * Método para buscar nome/sobrenome E especialidade E bairro com 3 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> tresPalavrasNomeEspecialidadeBairro(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1 = partesDoNome[0];
		String parte2 = partesDoNome[1];
		String parte3 = partesDoNome[2];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3);
		return medicoDAO.tresPalavrasNomeEspecialidadeBairro(parte1, parte2, parte3);
	}

	/**
	 * Método para busca de nome/sobrenome e especialidade com 3 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> tresPalavrasNomeEspecialidade(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1 = partesDoNome[0];
		String parte2 = partesDoNome[1];
		String parte3 = partesDoNome[2];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3);
		return medicoDAO.tresPalavrasNomeEspecialidade(parte1, parte2, parte3);
	}
	
	/**
	 * Método para busca de nome/sobrenome e especialidade com 3 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> tresPalavrasNomeBairro(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1 = partesDoNome[0];
		String parte2 = partesDoNome[1];
		String parte3 = partesDoNome[2];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3);
		return medicoDAO.tresPalavrasNomeBairro(parte1, parte2, parte3);
	}

	/**
	 * Método para busca de nome/sobrenome e bairro com 3 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> tresPalavrasBairroEspecialidade(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1 = partesDoNome[0];
		String parte2 = partesDoNome[1];
		String parte3 = partesDoNome[2];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3);
		return medicoDAO.tresPalavrasBairroEspecialidade(parte1, parte2, parte3);
	}

	/**
	 * Método para buscar nome/sobrenome E especialidade E bairro com 4 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> quatroPalavrasNomeEspecialidadeBairro(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4);
		return medicoDAO.quatroPalavrasNomeEspecialidadeBairro(parte1, parte2, parte3, parte4);
	}
	
	/**
	 * Método para busca de nome/sobrenome e especialidade com 4 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> quatroPalavrasNomeEspecialidade(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4);
		return medicoDAO.quatroPalavrasNomeEspecialidade(parte1, parte2, parte3, parte4);
	}

	/**
	 * Método para busca de nome/sobrenome e bairro com 4 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> quatroPalavrasNomeBairro(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4);
		return medicoDAO.quatroPalavrasNomeBairro(parte1, parte2, parte3, parte4);
	}
	
	/**
	 * Método para busca de bairro e especialidade com 4 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> quatroPalavrasBairroEspecialidade(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4);
		return medicoDAO.quatroPalavrasBairroEspecialidade(parte1, parte2, parte3, parte4);
	}
	
	/**
	 * Método para buscar nome/sobrenome E especialidade E bairro com 5 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> cincoPalavrasNomeEspecialidadeBairro(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5);
		return medicoDAO.cincoPalavrasNomeEspecialidadeBairro(parte1, parte2, parte3, parte4, parte5);
	}
	
	/**
	 * Método para busca de nome/sobrenome e especialidade com 5 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> cincoPalavrasNomeEspecialidade(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5);
		return medicoDAO.cincoPalavrasNomeEspecialidade(parte1, parte2, parte3, parte4, parte5);
	}
	
	/**
	 * Método para busca de nome/sobrenome e bairro com 5 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> cincoPalavrasNomeBairro(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5);
		return medicoDAO.cincoPalavrasNomeBairro(parte1, parte2, parte3, parte4, parte5);
	}
	
	/**
	 * Método para busca de bairro e especialidade com 5 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> cincoPalavrasBairroEspecialidade(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5);
		return medicoDAO.cincoPalavrasBairroEspecialidade(parte1, parte2, parte3, parte4, parte5);
	}
	
	/**
	 * Método para buscar nome/sobrenome E especialidade E bairro com 6 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> seisPalavrasNomeEspecialidadeBairro(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6);
		return medicoDAO.seisPalavrasNomeEspecialidadeBairro(parte1, parte2, parte3, parte4, parte5, parte6);
	}
	
	/**
	 * Método para busca de nome/sobrenome e especialidade com 6 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> seisPalavrasNomeEspecialidade(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6);
		return medicoDAO.seisPalavrasNomeEspecialidade(parte1, parte2, parte3, parte4, parte5, parte6);
	}
	
	/**
	 * Método para busca de nome/sobrenome e bairro com 6 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> seisPalavrasNomeBairro(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6);
		return medicoDAO.seisPalavrasNomeBairro(parte1, parte2, parte3, parte4, parte5, parte6);
	}
	
	/**
	 * Método para busca de bairro e especialidade com 6 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> seisPalavrasBairroEspecialidade(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6);
		return medicoDAO.seisPalavrasBairroEspecialidade(parte1, parte2, parte3, parte4, parte5, parte6);
	}
	
	/**
	 * Método para buscar nome/sobrenome E especialidade E bairro com 7 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> setePalavrasNomeEspecialidadeBairro(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		String parte7  = partesDoNome[6];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6 +"/"+ parte7);
		return medicoDAO.setePalavrasNomeEspecialidadeBairro(parte1, parte2, parte3, parte4, parte5, parte6, parte7);
	}
	
	/**
	 * Método para busca de nome/sobrenome e especialidade com 7 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> setePalavrasNomeEspecialidade(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		String parte7  = partesDoNome[6];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6 +"/"+ parte7);
		return medicoDAO.setePalavrasNomeEspecialidade(parte1, parte2, parte3, parte4, parte5, parte6, parte7);
	}
	
	/**
	 * Método para busca de nome/sobrenome e bairro com 7 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> setePalavrasNomeBairro(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		String parte7  = partesDoNome[6];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6 +"/"+ parte7);
		return medicoDAO.setePalavrasNomeBairro(parte1, parte2, parte3, parte4, parte5, parte6, parte7);
	}
	
	/**
	 * Método para busca de bairro e especialidade com 7 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> setePalavrasBairroEspecialidade(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		String parte7  = partesDoNome[6];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6 +"/"+ parte7);
		return medicoDAO.setePalavrasBairroEspecialidade(parte1, parte2, parte3, parte4, parte5, parte6, parte7);
	}
	
	/**
	 * Método para buscar nome/sobrenome E especialidade E bairro com 8 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> oitoPalavrasNomeEspecialidadeBairro(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		String parte7  = partesDoNome[6];
		String parte8  = partesDoNome[7];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6 +"/"+ parte7 + "/" + parte8);
		return medicoDAO.oitoPalavrasNomeEspecialidadeBairro(parte1, parte2, parte3, parte4, parte5, parte6, parte7, parte8);
	}
	
	/**
	 * Método para busca de nome/sobrenome e especialidade com 8 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> oitoPalavrasNomeEspecialidade(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		String parte7  = partesDoNome[6];
		String parte8  = partesDoNome[7];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6 +"/"+ parte7 + "/" + parte8);
		return medicoDAO.oitoPalavrasNomeEspecialidade(parte1, parte2, parte3, parte4, parte5, parte6, parte7, parte8);
	}
	
	/**
	 * Método para busca de nome/sobrenome e bairro com 8 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> oitoPalavrasNomeBairro(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		String parte7  = partesDoNome[6];
		String parte8  = partesDoNome[7];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6 +"/"+ parte7 + "/" + parte8);
		return medicoDAO.oitoPalavrasNomeBairro(parte1, parte2, parte3, parte4, parte5, parte6, parte7, parte8);
	}
	
	/**
	 * Método para busca de bairro e especialidade com 8 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> oitoPalavrasBairroEspecialidade(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		String parte7  = partesDoNome[6];
		String parte8  = partesDoNome[7];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6 +"/"+ parte7 + "/" + parte8);
		return medicoDAO.oitoPalavrasBairroEspecialidade(parte1, parte2, parte3, parte4, parte5, parte6, parte7, parte8);
	}
	
	/**
	 * Método para buscar nome/sobrenome E especialidade E bairro com 9 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> novePalavrasNomeEspecialidadeBairro(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		String parte7  = partesDoNome[6];
		String parte8  = partesDoNome[7];
		String parte9  = partesDoNome[8];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6 +"/"+ parte7 + "/" + parte8 +"/"+ parte9);
		return medicoDAO.novePalavrasNomeEspecialidadeBairro(parte1, parte2, parte3, parte4, parte5, parte6, parte7, parte8, parte9);
	}
	
	/**
	 * Método para busca de nome/sobrenome e especialidade com 9 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> novePalavrasNomeEspecialidade(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		String parte7  = partesDoNome[6];
		String parte8  = partesDoNome[7];
		String parte9  = partesDoNome[8];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6 +"/"+ parte7 + "/" + parte8 +"/"+ parte9);
		return medicoDAO.novePalavrasNomeEspecialidade(parte1, parte2, parte3, parte4, parte5, parte6, parte7, parte8, parte9);
	}
	
	/**
	 * Método para busca de nome/sobrenome e bairro com 9 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> novePalavrasNomeBairro(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		String parte7  = partesDoNome[6];
		String parte8  = partesDoNome[7];
		String parte9  = partesDoNome[8];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6 +"/"+ parte7 + "/" + parte8 +"/"+ parte9);
		return medicoDAO.novePalavrasNomeBairro(parte1, parte2, parte3, parte4, parte5, parte6, parte7, parte8, parte9);
	}
	
	/**
	 * Método para busca de bairro e especialidade com 9 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> novePalavrasBairroEspecialidade(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		String parte7  = partesDoNome[6];
		String parte8  = partesDoNome[7];
		String parte9  = partesDoNome[8];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6 +"/"+ parte7 + "/" + parte8 +"/"+ parte9);
		return medicoDAO.novePalavrasBairroEspecialidade(parte1, parte2, parte3, parte4, parte5, parte6, parte7, parte8, parte9);
	}
	
	/**
	 * Método para buscar nome/sobrenome E especialidade E bairro com 10 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> dezPalavrasNomeEspecialidadeBairro(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		String parte7  = partesDoNome[6];
		String parte8  = partesDoNome[7];
		String parte9  = partesDoNome[8];
		String parte10 = partesDoNome[9];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6 +"/"+ parte7 + "/" + parte8 +"/"+ parte9);
		return medicoDAO.dezPalavrasNomeEspecialidadeBairro(parte1, parte2, parte3, parte4, parte5, parte6, parte7, parte8, parte9, parte10);
	}
	
	/**
	 * Método para busca de nome/sobrenome e especialidade com 10 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> dezPalavrasNomeEspecialidade(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		String parte7  = partesDoNome[6];
		String parte8  = partesDoNome[7];
		String parte9  = partesDoNome[8];
		String parte10 = partesDoNome[9];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6 +"/"+ parte7 + "/" + parte8 +"/"+ parte9);
		return medicoDAO.dezPalavrasNomeEspecialidade(parte1, parte2, parte3, parte4, parte5, parte6, parte7, parte8, parte9, parte10);
	}
	
	/**
	 * Método para busca de nome/sobrenome e bairro com 10 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> dezPalavrasNomeBairro(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		String parte7  = partesDoNome[6];
		String parte8  = partesDoNome[7];
		String parte9  = partesDoNome[8];
		String parte10 = partesDoNome[9];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6 +"/"+ parte7 + "/" + parte8 +"/"+ parte9);
		return medicoDAO.dezPalavrasNomeBairro(parte1, parte2, parte3, parte4, parte5, parte6, parte7, parte8, parte9, parte10);
	}
	
	/**
	 * Método para busca de bairro e especialidade com 10 palavras
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> dezPalavrasBairroEspecialidade(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1  = partesDoNome[0];
		String parte2  = partesDoNome[1];
		String parte3  = partesDoNome[2];
		String parte4  = partesDoNome[3];
		String parte5  = partesDoNome[4];
		String parte6  = partesDoNome[5];
		String parte7  = partesDoNome[6];
		String parte8  = partesDoNome[7];
		String parte9  = partesDoNome[8];
		String parte10 = partesDoNome[9];
		System.out.println(parte1 + "/" + parte2 +"/"+ parte3 + "/" + parte4 +"/"+ parte5 + "/" + parte6 +"/"+ parte7 + "/" + parte8 +"/"+ parte9);
		return medicoDAO.dezPalavrasBairroEspecialidade(parte1, parte2, parte3, parte4, parte5, parte6, parte7, parte8, parte9, parte10);
	}
	
}
