package com.mz.soto.junior._047_tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Deseja ver a tabuada de qual numero?: ");
		Integer numero = teclado.nextInt();
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		tabuada(numero, 0);
	}
	
	static void tabuada(Integer multiplicando, Integer multiplicador) {
		System.out.println(multiplicando + " X " + multiplicador + " = " + (multiplicando * multiplicador));
		
		if(++multiplicador <= 12) {
			tabuada(multiplicando, multiplicador);
		}
	}

}
