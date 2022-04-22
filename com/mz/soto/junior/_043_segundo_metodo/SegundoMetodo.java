package com.mz.soto.junior._043_segundo_metodo;

import java.util.Scanner;

public class SegundoMetodo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		imprimirAsteristicos();
		
		System.out.println("Formacao Intensiva");
		String[] cursos = new String[] {"Java Basico", "Spring", "Java OO Avan�ado"};
		
		System.out.println("Escolha os cursos abaixo: ");
		
		for(int i = 0; i < cursos.length; i++) {
			System.out.println("[" + i + "] " + cursos[i]);
		}

		System.out.print("O curso que voc� deseja � o: ");
		Integer posicaoCursoEscolhido = teclado.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length; 
		
		if (!posicaoValida) {
			posicaoInvalida();
		}
		
		imprimirAsteristicos();
		
		String[] formasPagamento = new String[] {"Cart�o", "Numerario"};
		
		System.out.println("Escolha a forma de pagamento abaixo: ");
		
		for(int i = 0; i < formasPagamento.length; i++) {
			System.out.println("[" + i + "] " + formasPagamento[i]);
		}

		System.out.print("Sua forma de pagamento escolhida �: ");
		Integer posicaoFormaPagamentoEscolhida = teclado.nextInt();
		
		posicaoValida = posicaoFormaPagamentoEscolhida >= 0 
				&& posicaoFormaPagamentoEscolhida < formasPagamento.length; 
		
		if (!posicaoValida) {
			posicaoInvalida();
		}  
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirAsteristicos();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento � " + formaPagamentoEscolhida);
		
	}
	
	static void imprimirAsteristicos() {
		System.out.println("*********************************************************************************");
	}
	
	static void posicaoInvalida() {
		System.err.println("Posi��o inv�lida!");
		System.exit(1);
	}

}
