package com.mz.soto.junior._044_metodo_com_parametro;

import java.util.Scanner;

public class MetodoComParametro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		imprimirAsteristicos();
		
		System.out.println("Formacao Intensiva");
		String[] cursos = new String[] {"Java Basico", "Spring", "Java OO Avançado"};
		
		System.out.println("Escolha os cursos abaixo: ");
		
		iteracao(cursos);

		System.out.print("O curso que você deseja é o: ");
		Integer posicaoCursoEscolhido = teclado.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length; 
		
		if (!posicaoValida) {
			posicaoInvalida();
		}
		
		imprimirAsteristicos();
		
		String[] formasPagamento = new String[] {"Cartão", "Numerario"};
		
		System.out.println("Escolha a forma de pagamento abaixo: ");
		
		iteracao(formasPagamento);
		
		System.out.print("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = teclado.nextInt();
		
		posicaoValida = posicaoFormaPagamentoEscolhida >= 0 
				&& posicaoFormaPagamentoEscolhida < formasPagamento.length; 
		
		if (!posicaoValida) {
			posicaoInvalida();
		}  
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirAsteristicos();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
		
	}
	
	static void iteracao(String[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			System.out.println( i + ". " + vetor[i]);
		}

	}
	
	static void imprimirAsteristicos() {
		System.out.println("*********************************************************************************");
	}
	
	static void posicaoInvalida() {
		System.err.println("Posição inválida!");
		System.exit(1);
	
	}

}
