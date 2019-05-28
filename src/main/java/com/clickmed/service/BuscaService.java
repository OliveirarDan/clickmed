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
	 * 
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> umaPalavra(String buscaPalavra) throws IOException {
		return medicoDAO.umaPalavra(buscaPalavra);
	}

	/**
	 * Metodo para buscar duas palavras nas tabelas
	 * 
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
	 * 
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> tresPalavras(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1 = partesDoNome[0];
		String parte2 = partesDoNome[1];
		String parte3 = partesDoNome[2];
		System.out.println(parte1 + "/" + parte2 + "/" + parte3);
		return medicoDAO.tresPalavras(parte1, parte2, parte3);
	}

	/**
	 * Metodo para buscar quatro palavras nas tabelas
	 * 
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> quatroPalavras(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1 = partesDoNome[0];
		String parte2 = partesDoNome[1];
		String parte3 = partesDoNome[2];
		String parte4 = partesDoNome[3];
		System.out.println(parte1 + "/" + parte2 + "/" + parte3 + "/" + parte4);
		return medicoDAO.quatroPalavras(parte1, parte2, parte3, parte4);
	}

	/**
	 * Metodo para buscar cinco palavras nas tabelas
	 * 
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> cincoPalavras(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1 = partesDoNome[0];
		String parte2 = partesDoNome[1];
		String parte3 = partesDoNome[2];
		String parte4 = partesDoNome[3];
		String parte5 = partesDoNome[4];
		System.out.println(parte1 + "/" + parte2 + "/" + parte3 + "/" + parte4 + "/" + parte5);
		return medicoDAO.cincoPalavras(parte1, parte2, parte3, parte4, parte5);
	}

	/**
	 * Metodo para buscar seis palavras nas tabelas
	 * 
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> seisPalavras(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1 = partesDoNome[0];
		String parte2 = partesDoNome[1];
		String parte3 = partesDoNome[2];
		String parte4 = partesDoNome[3];
		String parte5 = partesDoNome[4];
		String parte6 = partesDoNome[5];
		System.out.println(parte1 + "/" + parte2 + "/" + parte3 + "/" + parte4 + "/" + parte5 + "/" + parte6);
		return medicoDAO.seisPalavras(parte1, parte2, parte3, parte4, parte5, parte6);
	}

	/**
	 * Metodo para buscar sete palavras nas tabelas
	 * 
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> setePalavras(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1 = partesDoNome[0];
		String parte2 = partesDoNome[1];
		String parte3 = partesDoNome[2];
		String parte4 = partesDoNome[3];
		String parte5 = partesDoNome[4];
		String parte6 = partesDoNome[5];
		String parte7 = partesDoNome[6];
		System.out.println(
				parte1 + "/" + parte2 + "/" + parte3 + "/" + parte4 + "/" + parte5 + "/" + parte6 + "/" + parte7);
		return medicoDAO.setePalavras(parte1, parte2, parte3, parte4, parte5, parte6, parte7);
	}

	/**
	 * Metodo para buscar oito palavras nas tabelas
	 * 
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> oitoPalavras(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1 = partesDoNome[0];
		String parte2 = partesDoNome[1];
		String parte3 = partesDoNome[2];
		String parte4 = partesDoNome[3];
		String parte5 = partesDoNome[4];
		String parte6 = partesDoNome[5];
		String parte7 = partesDoNome[6];
		String parte8 = partesDoNome[7];
		System.out.println(parte1 + "/" + parte2 + "/" + parte3 + "/" + parte4 + "/" + parte5 + "/" + parte6 + "/"
				+ parte7 + "/" + parte8);
		return medicoDAO.oitoPalavras(parte1, parte2, parte3, parte4, parte5, parte6, parte7, parte8);
	}

	/**
	 * Metodo para buscar nove palavras nas tabelas
	 * 
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> novePalavras(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1 = partesDoNome[0];
		String parte2 = partesDoNome[1];
		String parte3 = partesDoNome[2];
		String parte4 = partesDoNome[3];
		String parte5 = partesDoNome[4];
		String parte6 = partesDoNome[5];
		String parte7 = partesDoNome[6];
		String parte8 = partesDoNome[7];
		String parte9 = partesDoNome[8];
		System.out.println(parte1 + "/" + parte2 + "/" + parte3 + "/" + parte4 + "/" + parte5 + "/" + parte6 + "/"
				+ parte7 + "/" + parte8 + "/" + parte9);
		return medicoDAO.novePalavras(parte1, parte2, parte3, parte4, parte5, parte6, parte7, parte8, parte9);
	}

	/**
	 * Metodo para buscar dez palavras nas tabelas
	 * 
	 * @param buscaPalavra
	 * @return
	 */
	public List<Medico> dezPalavras(String buscaPalavra) {
		String[] partesDoNome = buscaPalavra.split(" ");
		String parte1 = partesDoNome[0];
		String parte2 = partesDoNome[1];
		String parte3 = partesDoNome[2];
		String parte4 = partesDoNome[3];
		String parte5 = partesDoNome[4];
		String parte6 = partesDoNome[5];
		String parte7 = partesDoNome[6];
		String parte8 = partesDoNome[7];
		String parte9 = partesDoNome[8];
		String parte10 = partesDoNome[9];
		System.out.println(parte1 + "/" + parte2 + "/" + parte3 + "/" + parte4 + "/" + parte5 + "/" + parte6 + "/"
				+ parte7 + "/" + parte8 + "/" + parte9);
		return medicoDAO.dezPalavras(parte1, parte2, parte3, parte4, parte5, parte6, parte7, parte8, parte9, parte10);
	}
}
