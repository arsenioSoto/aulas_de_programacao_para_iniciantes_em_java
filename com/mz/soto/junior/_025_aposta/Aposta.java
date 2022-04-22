package com.mz.soto.junior._025_aposta;

import java.util.Scanner;

public class Aposta {
	
	static final Integer IDADE_MINIMA_PARA_APOSTAR = 20;
	
	static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 20;
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Idade: ");
		Integer idade = teclado.nextInt();
		
		
		System.out.print("Tempo de contribuicao: ");
		Integer contribuicao = teclado.nextInt();
		
		Boolean temIdadeMinimaParaApostar = idade >= IDADE_MINIMA_PARA_APOSTAR;
		
		Boolean temTempoMinimoParaContribuicao = contribuicao >= TEMPO_MINIMO_DE_CONTRIBUICAO;
		
		
		Boolean podeApostar = temIdadeMinimaParaApostar || temTempoMinimoParaContribuicao;
		
		
		if(!podeApostar) {
			System.out.println("Sim, pode apostar!");
		}else {
			System.out.println("Nao, nao pode apostar");
		}
		
	}

}
