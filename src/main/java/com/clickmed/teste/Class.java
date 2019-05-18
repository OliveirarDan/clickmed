package com.clickmed.teste;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
		
		String texto = "I love to make test";
		List<String> listaSeparada = separar(texto);
		for (String item : listaSeparada) {
			System.out.println(listaSeparada);
			System.out.println(listaSeparada.size());
		}
		
		switch (listaSeparada.size()) {
		case 1:
			System.out.println("Uma palavra");
			break;
		case 2:
			System.out.println("Duas palavra");
			break;
		case 3:
			System.out.println("Tr�s palavra");
			break;
		case 4:
			System.out.println("Quatro palavra");
			break;
		case 5:
			System.out.println("Cinco palavra");
			break;
		case 6:
			System.out.println("Seis palavra");
			break;
		case 7:
			System.out.println("Sete palavra");
			break;

		default:
			System.out.println("Ou ser� que n�o");
			break;
		}
	}

	private static List<String> separar(String texto) {
		List<String> lista = new ArrayList<String>();
		Scanner scanner = new Scanner(texto);
		while (scanner.hasNext()) {
			lista.add(scanner.next());
		}
		return lista;
	}
}
