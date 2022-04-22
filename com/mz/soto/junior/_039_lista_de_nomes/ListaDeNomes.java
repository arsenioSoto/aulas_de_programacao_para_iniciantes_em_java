package com.mz.soto.junior._039_lista_de_nomes;

import java.util.Scanner;

public class ListaDeNomes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String[] nomes = new String[3];
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.print("Nome na posicao " + i + ": ");
			nomes[i] = teclado.nextLine();
		}
		
		System.out.println("Lista de Nomes: ");
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.println(i + ": " + nomes[i]);
		}

	}

}
