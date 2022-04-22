package com.mz.soto.junior._038_vetores_de_uma_dimensao;

import java.util.Scanner;

public class VetoresDeUmaDimensao {

	public static void main(String[] args) {
//		
//	String[] nomes = new String[5];
//	nomes[0] = "Arsenio";
//	nomes[1] = "Soto";
//	nomes[2] = "Junior";
//	nomes[3] = "Jose";
//	nomes[4] = "Djapela";
//	//nomes[5] = "Djudjudju";
//	
//	for(int i = 0; i < nomes.length; i++ ) {
//	System.out.println(nomes[i]);
//	
//		}
		
//		String[] nomes = new String[] {"Arsenio", "Soto", "Junior"};
//		nomes[1] = "Jose";
//		
//		for(int i = 0; i < nomes.length; i++) {
//			System.out.println(nomes[i]);
//		}
		
		String[] nomes = new String[] {"Arsenio", "Soto", "Junior"};
		
		System.out.println("Ecolha o seu nome ");
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.println("[" + i + "] " + nomes[i]);
		}
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o numero referente ao nome: ");
		Integer nomeEscolhido = teclado.nextInt();
		
		
		System.out.println("voce escolhe o nome: " + nomes[nomeEscolhido]);
		
		
	}

}
