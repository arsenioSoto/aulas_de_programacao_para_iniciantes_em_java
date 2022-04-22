package com.mz.soto.junior._029_concurso;

import java.util.Scanner;

public class Concurso {
	
	static final Double NOTA_MINIMA = 10.0;
	static final Double NOTA_CLASSIFICATORIA_GERAL = 20.0;
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Verificar se tem nota suficiente para passar no concurso");
		
		System.out.print("Digite a Nota de Portugues: ");
		Double notaDePortugues = teclado.nextDouble();
		
		
		System.out.print("Digite a nota de Matematica: ");
		Double notaDeMatematica = teclado.nextDouble();
		
		Boolean estaAcimaDaNotaMinimaPortugues = notaDePortugues >= NOTA_MINIMA;
		
		Boolean estaAcimaDaNotaMinimaMatematica = notaDeMatematica >= NOTA_MINIMA;
		
		
		Double notaTotal = notaDePortugues + notaDeMatematica;
		
		Boolean temNotaParaPassarNoConcurso = notaTotal >= NOTA_CLASSIFICATORIA_GERAL;
		
		Boolean passou = temNotaParaPassarNoConcurso && estaAcimaDaNotaMinimaPortugues && estaAcimaDaNotaMinimaMatematica;
		
		if(passou) {
			System.out.println("Parabens voce passou!");
		}else {
			System.out.println("Infelizmente nao passaste!");
		}

	}

}
