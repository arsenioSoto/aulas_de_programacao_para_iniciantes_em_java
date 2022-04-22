package com.mz.soto.junior._023_calculando_despesa_mensal;

import java.util.Scanner;

public class CalculandoDespesaMensal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite os valores de gasto mensal");
		
		Double totalMensal = 0.0;
		
		System.out.print("Energia: ");
		totalMensal += teclado.nextDouble(); //totalMensal = 0+500; = 500
		
		
		System.out.print("Agua: ");
		totalMensal += teclado.nextDouble(); // 500+500 = 1000
		
		
		System.out.print("Supermercado: ");
		totalMensal += teclado.nextDouble();
		
		
		System.out.print("Escola: ");
		totalMensal += teclado.nextDouble();
		
		
		System.out.println("Gasto total do mes: " + totalMensal);

	}

}
