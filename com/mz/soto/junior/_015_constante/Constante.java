package com.mz.soto.junior._015_constante;

import java.util.Scanner;

public class Constante {
	
	static final Integer IDADE_MINIMA_PARA_TIRAR_A_CARTA_DE_CONDUCAO = 18;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nomeDoCondutor = teclado.nextLine();
		
		
		System.out.println("Digite o ano atual: ");
		Integer anoAtual = teclado.nextInt();
		
		System.out.println("Digite o ano de nascimento: ");
		Integer anoNascimento = teclado.nextInt();
		
		Integer idade = anoAtual - anoNascimento;
		
		Boolean estaAptoOuInapto = idade >= IDADE_MINIMA_PARA_TIRAR_A_CARTA_DE_CONDUCAO;
		
		if(estaAptoOuInapto) {
			System.out.println("Ola " + nomeDoCondutor + " voce esta Apto para tirar a "
					+ "carta de conducao porque a sua idade e maior ou igual a "+ IDADE_MINIMA_PARA_TIRAR_A_CARTA_DE_CONDUCAO);
		}else {
			System.out.println("Ola " + nomeDoCondutor + " voce esta Inapto para tirar a "
					+ "carta de conducao porque a sua idade e menor que "+ IDADE_MINIMA_PARA_TIRAR_A_CARTA_DE_CONDUCAO);
		}
	}

}
