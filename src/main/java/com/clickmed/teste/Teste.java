package com.clickmed.teste;
public class Teste {
	

	public static void main(String[] args) {
		String text = "     I love to make test     ";
		System.out.println(text + "\n---------");
		String sem = text.trim();
		System.out.println(sem);
		int espaco = 0, resto = 0;
		for (int i = 0; i < sem.length(); i++) {
			if (sem.charAt(i) == ' ') 
				espaco++;
			else
				resto++;
		}
		
		int palavras = espaco+1;
		switch (palavras) {
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
	
}