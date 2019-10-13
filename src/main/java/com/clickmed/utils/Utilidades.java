/**
 * 
 */
package com.clickmed.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author danilo
 * Classe criada para reutilização de métodos aleatórios e úteis.
 */
public class Utilidades {
	
	public String dataAtual() {
		//Formato padrão e inicial
		//DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss -- dd/MM/yyyy");
		DateFormat dateFormat = new SimpleDateFormat("EEEEE, dd 'de' MMMMM 'de' yyyy 'às' HH:mm:ss", new Locale("pt", "BR"));
		
		Date date = new Date();
		return dateFormat.format(date);
	}
	
}
