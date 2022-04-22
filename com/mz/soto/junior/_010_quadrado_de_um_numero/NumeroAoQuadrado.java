package com.mz.soto.junior._010_quadrado_de_um_numero;

import java.util.Scanner;

public class NumeroAoQuadrado {

	public static void main(String[] args) {
		// numero * ele mesmo
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		Integer numero = teclado.nextInt();
		
		Integer quadradoDeUmNumero = numero * numero;
		
		System.out.println("O quadrado do numero " + numero+ " eh " + quadradoDeUmNumero);
		
	
	}

}
