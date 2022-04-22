package com.mz.soto.junior._030_if_encadeado;

import java.util.Scanner;

public class CalculandoMedia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.print("Digite a nota do primero teste: ");
		Double teste1 = teclado.nextDouble();
		
		System.out.print("Digite a nota do segundo teste: ");
		Double teste2 = teclado.nextDouble();
		
		// (n1+n2)/2;
		
		Double media = (teste1+teste2)/2;
		
		System.out.println("Media: " + media);
		
		if(media < 5.4) {
			System.out.println("Excluido!");
		} else if (media > 5.4 && media < 9.4) {
			System.out.println("Reprovado!");
		}else if(media > 9.4 && media < 13.4) {
			System.out.println("Aprovado!");
		}else if(media > 13.4) {
			System.out.println("Dispensado!");
		}

	}

}
