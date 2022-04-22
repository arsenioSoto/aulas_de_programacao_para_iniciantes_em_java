package com.mz.soto.junior._009_imc;

import java.util.Scanner;

public class CalculandoIndiceDaMassaCorporal {

	public static void main(String[] args) {
		// imc = peso / (altura*altura)
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Calculando o inice de massa corporal");
		
		System.out.print("Digite o seu peso (em kg): ");
		Double peso = teclado.nextDouble();
		
		System.out.print("Digite a sua altura (em metros): ");
		Double altura = teclado.nextDouble();
		
		Double imc = peso/(altura*altura);
		
		System.out.println("O seu IMC eh de: " + imc);
		

	}

}
